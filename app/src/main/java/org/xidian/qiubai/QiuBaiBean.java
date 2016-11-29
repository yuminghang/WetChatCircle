package org.xidian.qiubai;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class QiuBaiBean implements Serializable {

    /**
     * err : 0
     * has_more : true
     * top : null
     * total : 1500
     * data : [{"status":1,"created_at":1480409390,"distance":"4km","is_me":false,"at_users":null,"content":"看我.看我.在看我，在看我把你吃掉","comment_count":8,"like_count":9,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fg1bKY4NtBCbDlwbckBJ0v28LHdU?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073720,"user":{"gender":"F","created_at":1458887465,"nick_status":1,"age":24,"login":"＄不三不四的二","astrology":"双子座","id":31477618,"icon":"2016112613415173.JPEG"}},{"status":1,"created_at":1480409737,"distance":"809m","is_me":false,"at_users":null,"content":"要不要告诉她，裤子上什么东西啊？😓😓😓😓","comment_count":23,"like_count":4,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fhf1kcreLFiEM3sg1qIa87tMQtgg?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073820,"user":{"gender":"M","created_at":1345863016,"nick_status":1,"age":43,"login":"詹姆撕烧饼","astrology":"摩羯座","id":3253880,"icon":"2016102310351997.JPEG"}},{"status":1,"created_at":1480409441,"distance":"保定 · 涿州","is_me":false,"at_users":null,"comment_count":9,"content":"#你拍出来最好看的照片#要我说都好看，嗯哼。","topic":{"status":2,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1472991703,"abstract":"支持原创图片，原创爱好者的乐园！","content":"#你拍出来最好看的照片#","is_article_allowed":true,"creator_id":0,"avatar_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Fj9G562DrcbrX9cSV4mz3fJWiJus?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":3928708,"id":11802},"like_count":2,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FkHAlicuYWfItodAYQwUZX9UgRW7?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fl1FKUouOUUaLB7GWBtoY6jJPT9Q?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fl0ChTxer9Cn_M9iwM2Y0Nfz8ycs?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FpfbmmILeMj18Lid0ZXVTMZUwtF8?imageView2/2/w/500/q/80","format":"image"}],"topic_id":11802,"vote":{"option_b":"丑丑丑","oa_count":6,"option_a":"美美美","id":85075,"ob_count":10},"type":3,"id":9073733,"user":{"gender":"F","created_at":1402850703,"nick_status":0,"age":23,"login":"翻滚吧ぃ牛宝宝","astrology":"巨蟹座","id":16983523,"icon":"20151011211214.jpg"}},{"status":1,"created_at":1480409878,"distance":"天津 · 西青","is_me":false,"at_users":null,"comment_count":0,"content":"#QQ账号最后一位能凑成十的，就做一周情侣吧。# \n3","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1480236765,"abstract":"是0的妹纸，汉纸们找同样是0的。 这个只供娱乐的哦，出现问题后果自负。","content":"#QQ账号最后一位能凑成十的，就做一周情侣吧。#","is_article_allowed":true,"creator_id":26462042,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FpjNECeW9T8GSynQVq6JsWhaOvuv?imageView2/2/w/500/q/80"}],"pic_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Frg6C7Vm13xCLA3DeYFByG46IQdE?imageView2/2/w/500/q/80"}],"master_id":26462042,"id":15010},"like_count":1,"pic_urls":[],"topic_id":15010,"vote":null,"type":0,"id":9073858,"user":{"gender":"M","created_at":1420301096,"nick_status":1,"age":29,"login":"细板牙逗妞士","astrology":"天蝎座","id":24465095,"icon":"20160129090409.jpg"}},{"status":1,"created_at":1480410284,"distance":"保定 · 涿州","is_me":false,"at_users":null,"content":"涿州方圆10公里的人在哪？？？？","comment_count":0,"like_count":0,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FtR76fZwsASxHJeeO0Q4DV8ze0kB?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073962,"user":{"gender":"M","created_at":1480240067,"nick_status":0,"age":27,"login":"炮总来了","astrology":"巨蟹座","id":33031789,"icon":"201611271747487.JPEG"}},{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1480236765,"article_count":2615,"content":"#QQ账号最后一位能凑成十的，就做一周情侣吧。#","is_article_allowed":true,"creator_id":26462042,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FpjNECeW9T8GSynQVq6JsWhaOvuv?imageView2/2/w/500/q/80"}],"pic_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Frg6C7Vm13xCLA3DeYFByG46IQdE?imageView2/2/w/500/q/80"}],"id":15010,"master_id":26462042,"type":5,"abstract":"是0的妹纸，汉纸们找同样是0的。 这个只供娱乐的哦，出现问题后果自负。"},{"status":1,"created_at":1480410216,"distance":"廊坊 · 香河","is_me":false,"at_users":null,"comment_count":0,"content":"#七天情侣# 七天情侣过年的时候约可以一起出去旅游有联系一下","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1462723477,"abstract":"大家可以试试七天情侣，有缘千里来相会，说不定可以遇到心中的那个人。","content":"#七天情侣#","is_article_allowed":true,"creator_id":30160012,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FlfF8Aix30NaE4fxZYh39y1-TQ3G?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":30903943,"id":6250},"like_count":0,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FsFr7iYGad_yXFYiZhOG01oNdmTj?imageView2/2/w/500/q/80","format":"image"}],"topic_id":6250,"vote":null,"type":1,"id":9073950,"user":{"gender":"M","created_at":1465376966,"nick_status":0,"age":27,"login":"十动然拒？","astrology":"双子座","id":31925287,"icon":"20160608170927.jpg"}},{"status":1,"created_at":1480410026,"distance":"沧州 · 河间","is_me":false,"at_users":null,"comment_count":0,"content":"#QQ账号最后一位能凑成十的，就做一周情侣吧。# 7和8，有人不","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1480236765,"abstract":"是0的妹纸，汉纸们找同样是0的。 这个只供娱乐的哦，出现问题后果自负。","content":"#QQ账号最后一位能凑成十的，就做一周情侣吧。#","is_article_allowed":true,"creator_id":26462042,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FpjNECeW9T8GSynQVq6JsWhaOvuv?imageView2/2/w/500/q/80"}],"pic_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Frg6C7Vm13xCLA3DeYFByG46IQdE?imageView2/2/w/500/q/80"}],"master_id":26462042,"id":15010},"like_count":0,"pic_urls":[],"topic_id":15010,"vote":null,"type":0,"id":9073889,"user":{"gender":"M","created_at":1403026210,"nick_status":0,"age":33,"login":"江湖@小鱼","astrology":"双子座","id":17026007,"icon":"20160714170522.jpg"}},{"status":1,"created_at":1480409603,"distance":"21km","is_me":false,"at_users":null,"comment_count":0,"content":"#美臀集中营#来一张！","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1473074033,"abstract":"大家多发图！","content":"#美臀集中营#","is_article_allowed":true,"creator_id":28858644,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fp_FF1TPx-8fTGd67fh6tyIfLhnr?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":31994626,"id":11842},"like_count":0,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fs_thTwi7onPopfux716QbsZmRXH?imageView2/2/w/500/q/80","format":"image"}],"topic_id":11842,"vote":null,"type":1,"id":9073784,"user":{"gender":"M","created_at":1466287635,"nick_status":0,"age":24,"login":"大家好\u2026\u2026！","astrology":"摩羯座","id":31994626,"icon":"2016072705424756.JPEG"}},{"status":1,"created_at":1480409532,"distance":"8km","is_me":false,"at_users":null,"content":"身高不够脸来凑","comment_count":0,"like_count":0,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FoEPQxEmasA8J6tQ1AdPqM0MdYaH?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FsFD9lowmx9y5eDAq6GJPxl-drBQ?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073763,"user":{"gender":"M","created_at":1468224399,"nick_status":0,"age":20,"login":"贪吃的粽子","astrology":"巨蟹座","id":32159156,"icon":"2016111710384847.JPEG"}},{"status":1,"created_at":1480409510,"distance":"北京 · 房山","is_me":false,"at_users":null,"content":"{\"live_origin\": 2, \"circle_content\": \"\\u5206\\u4eab\\u4e86\\u76f4\\u64ad\", \"qiushi_link\": \"68604982835824504\", \"qiushi_content\": \"\\u6cbb\\u6108\\u7684\\u75af\\u5b50\\u6b63\\u5728\\u76f4\\u64ad\\uff0c\\u989c\\u503c\\u7206\\u8868~\\u5feb\\u6765\\u4e00\\u8d77\\u770b\\uff01\\u5173\\u95e8\\uff0c\\u653e\\u72fc\\uff01\"}","comment_count":0,"like_count":0,"pic_urls":[{"status":2,"pic_url":"http://avatar.app-remix.com/8OZBJQ7XPB3HZ5G0.jpg?imageMogr2/thumbnail/480x480/auto-orient?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":11,"id":9073756,"user":{"gender":"M","created_at":1477235080,"nick_status":0,"age":32,"login":"＊石头儿子＊","astrology":"双子座","id":32861032,"icon":"2016112609195777.JPEG"}},{"status":1,"created_at":1480409500,"distance":"15km","is_me":false,"at_users":null,"comment_count":0,"content":"#活到现在，所有的外号（绰号）#老面具  老面gay  虎皮  虎皮尖椒  老面包  骨气","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1480409385,"abstract":"","content":"#活到现在，所有的外号（绰号）#","is_article_allowed":true,"creator_id":8495697,"avatar_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Fj9TRRuPEGJxrRHZVS-VB3y7dYwe?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":8495697,"id":15100},"like_count":0,"pic_urls":[],"topic_id":15100,"vote":null,"type":0,"id":9073750,"user":{"gender":"M","created_at":1394000326,"nick_status":0,"age":20,"login":"众人皆知的秘密丶","astrology":"巨蟹座","id":14549221,"icon":"2016111816282718.JPEG"}},{"status":1,"created_at":1480409385,"distance":"天津 · 武清","is_me":false,"at_users":null,"comment_count":0,"content":"#活到现在，所有的外号（绰号）# 大公鸡 ，活宝 ，才子 ，老骚\u2026就这四个了","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1480409385,"abstract":"","content":"#活到现在，所有的外号（绰号）#","is_article_allowed":true,"creator_id":8495697,"avatar_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Fj9TRRuPEGJxrRHZVS-VB3y7dYwe?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":8495697,"id":15100},"like_count":0,"pic_urls":[],"topic_id":15100,"vote":null,"type":0,"id":9073718,"user":{"gender":"M","created_at":1366440727,"nick_status":1,"age":27,"login":"没有故事没约过","astrology":"处女座","id":8495697,"icon":"2016103016064197.JPEG"}},{"status":1,"created_at":1480409047,"distance":"苏州 · 昆山","is_me":false,"at_users":null,"content":"等车冷死宝宝了！","comment_count":0,"like_count":5,"pic_urls":[],"topic_id":0,"vote":null,"type":0,"id":9073640,"user":{"gender":"F","created_at":1430430231,"nick_status":1,"age":26,"login":"孤单的小丑鱼","astrology":"水瓶座","id":28067354,"icon":"2016111211043854.JPEG"}},{"status":1,"created_at":1480409041,"distance":"苏州 · 昆山","is_me":false,"at_users":null,"content":"冬天来啦！召唤师峡谷也下雪啦","comment_count":0,"like_count":2,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FnGMLFS_B_CrMvFmbTI2UuCV9Bif?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FlJmqmyKc18AmABVc2QvH8wBhkDH?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FhYDjh8wfOWs1DLnmt_AHgX5wykr?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FoRCYP9b7jviljt1xfM8nT-QfrGH?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073638,"user":{"gender":"M","created_at":1477114459,"nick_status":0,"age":25,"login":"压美碟","astrology":"天蝎座","id":32852141,"icon":"2016102213341995.JPEG"}},{"status":1,"created_at":1480408817,"distance":"合肥 · 合肥","is_me":false,"at_users":null,"comment_count":40,"content":"#胸器集中营# 如果我是你女朋友，我和你妈同时掉水里了你会先救谁。","topic":{"status":2,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1450421536,"abstract":"苦海翻起爱恨，在世间难逃避命运。","content":"#胸器集中营#","is_article_allowed":true,"creator_id":0,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FnxrYhEYjbWo0Bt8KKaulAEBjAgs?imageView2/2/w/500/q/80"}],"pic_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/FqsZQIN2Dy7aXnIvQG7Pptyj4kKp?imageView2/2/w/500/q/80"},{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/FhzrzD7_ZlcqH0WOk_Z9Yax5QI1b?imageView2/2/w/500/q/80"},{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/FmcVCNPh8cna6Qq_5G_VKK_CY86P?imageView2/2/w/500/q/80"},{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Fkd07YLkuRA0Q_UuxGaG0OMkZLHr?imageView2/2/w/500/q/80"},{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Fllghm9tuvmwiSZDLizwdJKoYO6a?imageView2/2/w/500/q/80"}],"master_id":30323383,"id":114},"like_count":13,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FgKrfOOLVuKdC2zfC508B8b9h_mn?imageView2/2/w/500/q/80","format":"image"}],"topic_id":114,"vote":null,"type":1,"id":9073587,"user":{"gender":"F","created_at":1478164343,"nick_status":0,"age":23,"login":"佳小妮","astrology":"摩羯座","id":32915484,"icon":"2016111018380218.JPEG"}},{"status":1,"created_at":1480408941,"distance":"苏州 · 吴中","is_me":false,"at_users":null,"content":"头发长了一丢丢\n😄😄😄快快长\n快快长！","comment_count":12,"like_count":5,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FkS-_17nYmfFXWcjEdpHsWJo_V7E?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073612,"user":{"gender":"F","created_at":1454305341,"nick_status":0,"age":23,"login":".良人.","astrology":"白羊座","id":31081796,"icon":"2016112909113854.JPEG"}},{"status":1,"created_at":1480408912,"distance":"无锡 · 梁溪","is_me":false,"at_users":null,"comment_count":5,"content":"#齐逼短裙# 吃饭喽\u2026\u2026","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1473057645,"abstract":"欢迎光临","content":"#齐逼短裙#","is_article_allowed":true,"creator_id":28398938,"avatar_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/FhEyYMo3_ld3F0t4fRWkk5rI-kEf?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":28398938,"id":11838},"like_count":10,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FuCUSVmV-zKKuyJ3ifj1BfK1HVD1?imageView2/2/w/500/q/80","format":"image"}],"topic_id":11838,"vote":null,"type":1,"id":9073608,"user":{"gender":"F","created_at":1475629741,"nick_status":1,"age":19,"login":"仙气迷人￥","astrology":"水瓶座","id":32752781,"icon":"2016102622362499.JPEG"}},{"status":1,"created_at":1480408835,"distance":"苏州 · 常熟","is_me":false,"at_users":null,"comment_count":37,"content":"#QQ账号最后一位能凑成十的，就做一周情侣吧。#四个QQ号尾数分别为，9 6 8 7","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1480236765,"abstract":"是0的妹纸，汉纸们找同样是0的。 这个只供娱乐的哦，出现问题后果自负。","content":"#QQ账号最后一位能凑成十的，就做一周情侣吧。#","is_article_allowed":true,"creator_id":26462042,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FpjNECeW9T8GSynQVq6JsWhaOvuv?imageView2/2/w/500/q/80"}],"pic_urls":[{"status":1,"pic_url":"http://circle-pic.qiushibaike.com/Frg6C7Vm13xCLA3DeYFByG46IQdE?imageView2/2/w/500/q/80"}],"master_id":26462042,"id":15010},"like_count":3,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fn8oc4eTBBNrnz_jsjVjex2lOU-Q?imageView2/2/w/500/q/80","format":"image"}],"topic_id":15010,"vote":null,"type":1,"id":9073594,"user":{"gender":"F","created_at":1465132513,"nick_status":0,"age":99,"login":"阿&悄","astrology":"摩羯座","id":31907179,"icon":"2016110321292074.JPEG"}},{"status":1,"created_at":1480409015,"distance":"滁州 · 天长","is_me":false,"at_users":null,"content":"你要旅行，我还能不能去\u2026","comment_count":1,"like_count":3,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fp72a7j3pMgtJvum7xXvJYuY1Qx5?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073632,"user":{"gender":"F","created_at":1432241703,"nick_status":0,"age":26,"login":"心是一座坟\u2026\u2026\u2026","astrology":"天蝎座","id":28565394,"icon":"2016100600284835.JPEG"}},{"status":1,"created_at":1480408894,"distance":"南京 · 玄武","is_me":false,"at_users":null,"content":"{\"circle_content\": \"\\u5206\\u4eab\\u4e86\\u7cd7\\u4e8b\", \"qiushi_link\": \"118076605\", \"qiushi_content\": \"\\u4eca\\u5929\\u4e2d\\u5348\\u548c\\u5973\\u540c\\u4e8b\\u5403KFC\\uff0c\\u85af\\u6761\\u6389\\u4e86\\u534a\\u5305\\u5230\\u5730\\u4e0a\\uff0c\\u6211\\u4ece\\u5730\\u4e0a\\u6361\\u8d77\\u6765\\u4e22\\uff0c\\u89c9\\u5f97\\u633a...\"}","comment_count":0,"like_count":2,"pic_urls":[],"topic_id":0,"vote":null,"type":6,"id":9073601,"user":{"gender":"F","created_at":1479379441,"nick_status":0,"age":27,"login":"晴天夏","astrology":"天秤座","id":32982516,"icon":"2016111718440160.JPEG"}},{"status":1,"created_at":1480409000,"distance":"南京 · 栖霞","is_me":false,"at_users":null,"content":"来啊，互相伤害。。。。","comment_count":6,"like_count":3,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FpE_n_VE28o43-rzD86fRI8YLLUO?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073627,"user":{"gender":"F","created_at":1394082689,"nick_status":1,"age":22,"login":"请叫我阿奴","astrology":"金牛座","id":14569663,"icon":"2016102209070955.JPEG"}},{"status":1,"created_at":1480408822,"distance":"上海 · 金山","is_me":false,"at_users":null,"content":"昨晚的穿搭很失败～\n\n百联一楼那些打1.5折的，还是买不起😤😩😩😩😭😭😭😭看来只适合蘑菇街上逛","comment_count":9,"like_count":2,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FuDKYwthU69klqVUty2XNTb6VADz?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073588,"user":{"gender":"F","created_at":1381653233,"nick_status":0,"age":25,"login":"女人值得傲慢","astrology":"天秤座","id":11801812,"icon":"2016112407582072.JPEG"}},{"status":1,"created_at":1480408644,"distance":"糗星球","is_me":false,"at_users":null,"comment_count":2,"content":"#\u201c树洞\u201d# 日落西山你不陪，东山再起你是谁？\r\n\r\n同甘共苦你不在，荣华富贵你不配！\r\n\r\n\r\n真正的强者是，夜深人静了就把心掏出来自己缝缝补补，完事了再塞回去，睡一觉醒来又是信心百倍。\r\n\r\n\r\n相信自己，越活越坚强， 我没有靠山，自己就是山！ 我没有天下，自己打天下！ 我没有资本，自己赚资本！\r\n\r\n\r\n我弱了，所有困难就强了。 我强了，所有阻碍就弱了！ 活着就该逢山开路，遇水架桥。\r\n\r\n\r\n生活，你给我压力，我还你奇迹！","topic":{"status":4,"is_anonymous":true,"color":1,"is_punch":false,"created_at":1458041396,"abstract":"做个安静的树洞，保存你无处安放的情绪","content":"#\u201c树洞\u201d#","is_article_allowed":true,"creator_id":30680413,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fv6eD_yZWPbNhVtgq8LXV6G0uNwq?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":26709754,"id":3205},"like_count":4,"pic_urls":[],"topic_id":3205,"vote":null,"type":0,"id":9073544,"user":{"gender":"M","created_at":1257353546,"nick_status":0,"age":20,"login":"匿名用户","astrology":"","id":63443,"icon":"20160223104221.jpg"}},{"status":1,"created_at":1480408746,"distance":"上海 · 虹口","is_me":false,"at_users":null,"content":"刚刚闲的蛋疼，自己手贱剪了剪刘海，现在在淘宝上看帽子😂😂😂，又要为马云做贡献了","comment_count":6,"like_count":4,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FuCckpK9Q4xTV4ylrjMFptwK4kz-?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073566,"user":{"gender":"F","created_at":1431188466,"nick_status":0,"age":30,"login":"丫头～肖","astrology":"狮子座","id":28298698,"icon":"2016112508270938.JPEG"}},{"status":1,"created_at":1480408632,"distance":"湖州 · 吴兴","is_me":false,"at_users":null,"comment_count":0,"content":"#你手机号码的后四位是多少？#6716","topic":{"status":3,"is_anonymous":false,"color":1,"is_punch":false,"created_at":1465630321,"abstract":"每个号码都有特殊的意义","content":"#你手机号码的后四位是多少？#","is_article_allowed":true,"creator_id":31529443,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fs-ifi16L23QhiQM-04WDSK0t9OC?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":23509613,"id":8108},"like_count":1,"pic_urls":[],"topic_id":8108,"vote":null,"type":0,"id":9073542,"user":{"gender":"M","created_at":1447825086,"nick_status":1,"age":31,"login":"小男人有要的吗","astrology":"巨蟹座","id":30639430,"icon":"2016111209492325.JPEG"}},{"status":1,"created_at":1480408491,"distance":"糗星球","is_me":false,"at_users":null,"comment_count":33,"content":"#\u201c树洞\u201d# 我家没车没房  还嫁得出去吗","topic":{"status":4,"is_anonymous":true,"color":1,"is_punch":false,"created_at":1458041396,"abstract":"做个安静的树洞，保存你无处安放的情绪","content":"#\u201c树洞\u201d#","is_article_allowed":true,"creator_id":30680413,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fv6eD_yZWPbNhVtgq8LXV6G0uNwq?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":26709754,"id":3205},"like_count":21,"pic_urls":[],"topic_id":3205,"vote":null,"type":0,"id":9073510,"user":{"gender":"F","created_at":1257353546,"nick_status":0,"age":20,"login":"匿名用户","astrology":"","id":63443,"icon":"20160223104221.jpg"}},{"status":1,"created_at":1480408422,"distance":"糗星球","is_me":false,"at_users":null,"comment_count":10,"content":"#\u201c树洞\u201d#你俩直接约多省事","topic":{"status":4,"is_anonymous":true,"color":1,"is_punch":false,"created_at":1458041396,"abstract":"做个安静的树洞，保存你无处安放的情绪","content":"#\u201c树洞\u201d#","is_article_allowed":true,"creator_id":30680413,"avatar_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fv6eD_yZWPbNhVtgq8LXV6G0uNwq?imageView2/2/w/500/q/80"}],"pic_urls":[],"master_id":26709754,"id":3205},"like_count":8,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FtVFQoi9md2GKXdTIEKfWUiDwzT8?imageView2/2/w/500/q/80","format":"image"},{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fv_GmAvz4rFlidS-i9JQStOWHLq9?imageView2/2/w/500/q/80","format":"image"}],"topic_id":3205,"vote":null,"type":1,"id":9073489,"user":{"gender":"M","created_at":1257353546,"nick_status":0,"age":20,"login":"匿名用户","astrology":"","id":63443,"icon":"20160223104221.jpg"}},{"status":1,"created_at":1480408459,"distance":"合肥 · 蜀山","is_me":false,"at_users":null,"content":"互相伤害有没有","comment_count":0,"like_count":3,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/FuvvHSnAwCXb7NfKJkCnCo9cVRfy?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073501,"user":{"gender":"M","created_at":1470843042,"nick_status":0,"age":25,"login":"~大湿兄~","astrology":"狮子座","id":32405073,"icon":"2016112916243228.JPEG"}},{"status":1,"created_at":1480408419,"distance":"苏州 · 昆山","is_me":false,"at_users":null,"content":"吃饭啦！这是我从现在到明天七点半之前所有的食物，嘻嘻。。。","comment_count":0,"like_count":2,"pic_urls":[{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fto2_T7ELMrfs_P18yErFIrQjla5?imageView2/2/w/500/q/80","format":"image"}],"topic_id":0,"vote":null,"type":1,"id":9073488,"user":{"gender":"F","created_at":1419464431,"nick_status":0,"age":26,"login":"谁给个好听的名字","astrology":"双子座","id":24023353,"icon":"2016102821453283.JPEG"}}]
     * refresh : 13
     */

    private int err;
    private boolean has_more;
    private Object top;
    private int total;
    private int refresh;
    /**
     * status : 1
     * created_at : 1480409390
     * distance : 4km
     * is_me : false
     * at_users : null
     * content : 看我.看我.在看我，在看我把你吃掉
     * comment_count : 8
     * like_count : 9
     * pic_urls : [{"status":2,"pic_url":"http://circle-pic.qiushibaike.com/Fg1bKY4NtBCbDlwbckBJ0v28LHdU?imageView2/2/w/500/q/80","format":"image"}]
     * topic_id : 0
     * vote : null
     * type : 1
     * id : 9073720
     * user : {"gender":"F","created_at":1458887465,"nick_status":1,"age":24,"login":"＄不三不四的二","astrology":"双子座","id":31477618,"icon":"2016112613415173.JPEG"}
     */

    private List<DataEntity> data;

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public Object getTop() {
        return top;
    }

    public void setTop(Object top) {
        this.top = top;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class DataEntity implements Parcelable {
        public static final Creator<DataEntity> CREATOR = new Creator<DataEntity>() {
            @Override
            public DataEntity createFromParcel(Parcel in) {
                return new DataEntity(in);
            }

            @Override
            public DataEntity[] newArray(int size) {
                return new DataEntity[size];
            }
        };
        private int status;
        private int created_at;
        private String distance;
        private boolean is_me;
        private Object at_users;
        private String content;
        private int comment_count;
        private int like_count;
        private int topic_id;
        private Object vote;
        private int type;
        private int id;
        /**
         * gender : F
         * created_at : 1458887465
         * nick_status : 1
         * age : 24
         * login : ＄不三不四的二
         * astrology : 双子座
         * id : 31477618
         * icon : 2016112613415173.JPEG
         */

        private UserEntity user;
        /**
         * status : 2
         * pic_url : http://circle-pic.qiushibaike.com/Fg1bKY4NtBCbDlwbckBJ0v28LHdU?imageView2/2/w/500/q/80
         * format : image
         */

        private List<PicUrlsEntity> pic_urls;

        protected DataEntity(Parcel in) {
            status = in.readInt();
            created_at = in.readInt();
            distance = in.readString();
            is_me = in.readByte() != 0;
            content = in.readString();
            comment_count = in.readInt();
            like_count = in.readInt();
            topic_id = in.readInt();
            type = in.readInt();
            id = in.readInt();
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public boolean isIs_me() {
            return is_me;
        }

        public void setIs_me(boolean is_me) {
            this.is_me = is_me;
        }

        public Object getAt_users() {
            return at_users;
        }

        public void setAt_users(Object at_users) {
            this.at_users = at_users;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public int getLike_count() {
            return like_count;
        }

        public void setLike_count(int like_count) {
            this.like_count = like_count;
        }

        public int getTopic_id() {
            return topic_id;
        }

        public void setTopic_id(int topic_id) {
            this.topic_id = topic_id;
        }

        public Object getVote() {
            return vote;
        }

        public void setVote(Object vote) {
            this.vote = vote;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public UserEntity getUser() {
            return user;
        }

        public void setUser(UserEntity user) {
            this.user = user;
        }

        public List<PicUrlsEntity> getPic_urls() {
            return pic_urls;
        }

        public void setPic_urls(List<PicUrlsEntity> pic_urls) {
            this.pic_urls = pic_urls;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(status);
            parcel.writeInt(created_at);
            parcel.writeString(distance);
            parcel.writeByte((byte) (is_me ? 1 : 0));
            parcel.writeString(content);
            parcel.writeInt(comment_count);
            parcel.writeInt(like_count);
            parcel.writeInt(topic_id);
            parcel.writeInt(type);
            parcel.writeInt(id);
        }

        public static class UserEntity implements Parcelable {
            public static final Creator<UserEntity> CREATOR = new Creator<UserEntity>() {
                @Override
                public UserEntity createFromParcel(Parcel in) {
                    return new UserEntity(in);
                }

                @Override
                public UserEntity[] newArray(int size) {
                    return new UserEntity[size];
                }
            };
            private String gender;
            private int created_at;
            private int nick_status;
            private int age;
            private String login;
            private String astrology;
            private int id;
            private String icon;

            protected UserEntity(Parcel in) {
                gender = in.readString();
                created_at = in.readInt();
                nick_status = in.readInt();
                age = in.readInt();
                login = in.readString();
                astrology = in.readString();
                id = in.readInt();
                icon = in.readString();
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public int getNick_status() {
                return nick_status;
            }

            public void setNick_status(int nick_status) {
                this.nick_status = nick_status;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public String getAstrology() {
                return astrology;
            }

            public void setAstrology(String astrology) {
                this.astrology = astrology;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(gender);
                parcel.writeInt(created_at);
                parcel.writeInt(nick_status);
                parcel.writeInt(age);
                parcel.writeString(login);
                parcel.writeString(astrology);
                parcel.writeInt(id);
                parcel.writeString(icon);
            }
        }

        public static class PicUrlsEntity implements Parcelable {
            public static final Creator<PicUrlsEntity> CREATOR = new Creator<PicUrlsEntity>() {
                @Override
                public PicUrlsEntity createFromParcel(Parcel in) {
                    return new PicUrlsEntity(in);
                }

                @Override
                public PicUrlsEntity[] newArray(int size) {
                    return new PicUrlsEntity[size];
                }
            };
            private int status;
            private String pic_url;
            private String format;

            protected PicUrlsEntity(Parcel in) {
                status = in.readInt();
                pic_url = in.readString();
                format = in.readString();
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(status);
                parcel.writeString(pic_url);
                parcel.writeString(format);
            }
        }
    }
}