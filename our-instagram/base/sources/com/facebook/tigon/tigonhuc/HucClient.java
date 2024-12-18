package com.facebook.tigon.tigonhuc;

import X.C14360o3;
import X.C1FU;
import X.C1FW;
import X.C1T4;
import X.RunnableC64702TQi;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class HucClient {
    public static final int BODY_UPLOAD_TIMEOUT_SECONDS = 120;
    public static final C1FW Companion = new Object();
    public final C1FU certificatePinner;
    public final ExecutorService executor;
    public final HostnameVerifier hostnameVerifier;
    public final SSLSocketFactory sslSocketFactory;
    public final String userAgent;

    public HucClient(ExecutorService executorService, String str, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory, C1FU c1fu) {
        C14360o3.A0B(executorService, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(hostnameVerifier, 3);
        this.executor = executorService;
        this.userAgent = str;
        this.hostnameVerifier = hostnameVerifier;
        this.sslSocketFactory = sSLSocketFactory;
        this.certificatePinner = c1fu;
    }

    public final HucRequestToken startRequest(byte[] bArr, int i, TigonHucBodyProvider tigonHucBodyProvider, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        C14360o3.A0B(bArr, 0);
        C14360o3.A0B(tigonHucCallbackForwarder, 3);
        Future<?> submit = this.executor.submit(new RunnableC64702TQi(C1T4.A03(bArr, i), this, tigonHucBodyProvider, tigonHucCallbackForwarder));
        C14360o3.A07(submit);
        return new HucRequestToken(submit);
    }
}
