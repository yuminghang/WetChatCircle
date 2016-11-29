package org.xidian.qiubai;

import android.content.Context;
import android.widget.ImageView;

import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.decode.BaseImageDecoder;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by ymh on 2016/11/29.
 */
public class LoadImageUtil {
    static LinkedList<String> list = new LinkedList<>();
    static Map<String, ImageView> view_map = new HashMap<>();
    static boolean isRun = false;
    static Context context;
    private static ImageLoader imageLoader = ImageLoader.getInstance();
    private ImageLoaderConfiguration config;

    public static void add(Context ctx, String url, ImageView imageView) {
        if (context == null) {
            context = ctx;
        }
        if (!list.contains(url)) {
            list.addLast(url);
            view_map.put(url, imageView);
        }
    }

    public static void load() {
        if (!isRun) {
            isRun = true;
            while (list.size() > 0 && isRun) {
                String url = list.removeFirst();
                System.out.println("loadimage.." + url);
//                view_map.get(url);
//                Glide.with(context).load(url).into(view_map.get(url));
                loadImage(url, view_map.get(url));
                view_map.remove(view_map.get(url));
            }
            isRun = false;
        }
    }

    public static void stop() {
        isRun = false;
    }

    public static void loadImage(String url, final ImageView imageView) {
        //图片保存系统路径
        File cacheDir = StorageUtils.getOwnCacheDirectory(context, "data");
        DisplayImageOptions imageOptions = new DisplayImageOptions.Builder().cacheInMemory().cacheOnDisc()
                .build();
        //一些相关的设置
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context).threadPoolSize(5)
                .threadPriority(Thread.NORM_PRIORITY - 1).tasksProcessingOrder(QueueProcessingType.LIFO).denyCacheImageMultipleSizesInMemory()
//                .memoryCache(new LruMemoryCache(1024 * 1024)).memoryCacheSize(1 * 1024 * 1024).discCache(new UnlimitedDiscCache(cacheDir)) // default
                .discCacheSize(20 * 1024 * 1024).discCacheFileCount(400).discCacheFileNameGenerator(new HashCodeFileNameGenerator()) // default
                .imageDownloader(new BaseImageDownloader(context)) // default
                .imageDecoder(new BaseImageDecoder(true)) // default
                .defaultDisplayImageOptions(imageOptions) // default
//                .enableLogging()
                .build();
        //初始化配置
        imageLoader.init(config);
        //显示图片
        imageLoader.displayImage(url, imageView);
    }

}
