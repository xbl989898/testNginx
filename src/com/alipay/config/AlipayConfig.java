package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id ="2016102400752252";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCOhvHmvFEQAA3cjmlSWu4zJCrVEq6UDkbcTVtByBdnN+RpcAvKz0iQ2NvEak4Jr/UgmrGmMkOEGqGuVAqyESBgWKJI5d1JJEB3/G6mNRS8NEyD6779Xfi1wBkG2MB0bE4YmUJXozKvQrZI3x0af66n4wv2gzdgPeDGZm2DfyH0qY21TlPyILhFG582CLsava8c8KR24bsWpEjDl8otK+6l7f8YG8kIXXZv6IoSHvP/PjEftxXF11uwbRereov6eSdz8YeEpgCDP1eWd4RCYekBKp1Ma9nkILNYY1nIXIOMZZr2dJxqU/mkVtsLxAPoRYaMROk8yKzL0LeTfBH6xosZAgMBAAECggEAaMKhjXJ/tt4DUklO+tyhVu/Pl9vqfCLeTNGDMR/Mq+62MhXMZR7k/KqZJo7om1A9QeDSkRFC9RfKHWPilK3n+UlMx35Fn5xI0qi1/+7mNcvPLewa7wqiY502CAVLuIdfA8+qptXqzE2hxIBSWQbersJBKcma61+wFsR03IGWyMi5R2kZwpjJkUxippqOh8t5koZ7/1wBIi1Zu2iZrHJTZMF0FCvedGlLHhOrEnSIobCV01Dc/risbnL86N9Kvx3EpS4AoeNOd98pZ7C0t6eueOSCJ4WB/NEv+7STmIMloJD1rf5zXTmFWv1P2TRWPWUDf7KWB768cDS7EqHPT+YasQKBgQDVE5neQH/ljYc4h3wcIPVjKhiWksWNJ6LZyFgc6FIUQDhRBb+fe8Ic86UoeRZWkr9gHMoeoHT+Vg8gsJv+SMQVxvl/sbbz48S316jttgHjktywuGlAgR0m35r3gMUedKWSylb61hwamvs1n8RhSAUq3aypKCW8sOnZQkQWB8iMZQKBgQCrPRiSTuZRk6N+iG2ReE7BHtoqp0avy5vvK9+tU8CojDwOM1oiWiBuEkjZVf1AldnUAQOdHfIiY5nrgGiWIZrGT/q3IBgJklEzvHqLQjXjUeuXbkDNMJhfz2YxhQGHLk0jelvl6cvxfEXmh/pYVl/jmBJkg66fkM5k5bAO2//2pQKBgQDE7/nuRtUvORE6+VaHtRq4zeat/PgkT/cfrSFrjnqWhwjGMjb7U+qE0djbwJcZ60aAsftKNWoMzUPsJe/4Jg8+RYrDMGF1qBZhCS30j53NVicuGzQEz5E/JbrYeac3T/7c3rFn489T89yton5in6tPBFYafqXqceWhzbKaXhVJVQKBgH+yB+jTPZ4H4xww0MRyWwhY4Yh9RZFC3P32Uc8HbdxC92X/lW+YliZ/LCQmo7zOAqq+NturwS0z6UxdbaDHXowUiHqXTFWW70cNfrTqoxTpui4q4dgiLP8Fwsea0BDmzk9up6lEN/nVGqtXK7FEeC1Y8h5StJ35dnB3eFscZDyhAoGBAMoY6gg9uxhkbKqbNzfZ8fc+PJ3hhQAZkxppqNcOcgH5Vlev7iOz9IbrLWvOH3gDBuKyjbhBIKstBXuNRCUzx9xevflffmbh0sTY1wLJS8gZFeHED9499UYQ+U/vaOiPXqCcEuHE5BVonL0ok2O+nIs86XbTEGBcTTX7GzGWAc0L";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhxsjgP0kKyx8UTR2pNEvkr/wPxj6vRU/PpbfRY4yeL5Lt1XV954QtHZ8zUvLnPqMa+AOdeBzeQSBJnluXrwF2a1MJclNudbHXFSqOFM217G/U13w/udfRRkeDDXQSNP3csMupmmB0+7HS6eE64Vivl3FvE/L5ObP89JkaRXDea7amLD9FEltkchiZfIXQSgGz3v0y42W6ZDwt++AhreqX1R48J5+JmoaK9x5GAUt0aFLcVoH5BoGf9wnYAN+hjLCLkejAwfwB39RaYmYldeM6CaARbc9A2553pswi5uOE4NkAbYK8S71Qsj+CilGdQuX7tQOKh5EhxJnkSDz36t15wIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://9b2fnv.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://9b2fnv.natappfree.cc/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 日志路径
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

