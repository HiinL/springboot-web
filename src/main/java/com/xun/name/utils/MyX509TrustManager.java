package com.xun.name.utils;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @ClassName
 * @author: Uny
 * @Date: 2019/6/5 14:42
 * @Description:
 * @Version 1.8
 */
public class MyX509TrustManager implements X509TrustManager {
    // 检查客户端证书
    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    // 检查服务器端证书
    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    // 返回受信任的X509证书数组
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
