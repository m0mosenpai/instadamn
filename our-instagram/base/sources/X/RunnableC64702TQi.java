package X;

import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.tigonhuc.HucBodyStream;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.tigon.tigonhuc.TigonHucBodyProvider;
import com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.TQi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64702TQi implements Runnable {
    public final /* synthetic */ TigonRequest A00;
    public final /* synthetic */ HucClient A01;
    public final /* synthetic */ TigonHucBodyProvider A02;
    public final /* synthetic */ TigonHucCallbackForwarder A03;

    public RunnableC64702TQi(TigonRequest tigonRequest, HucClient hucClient, TigonHucBodyProvider tigonHucBodyProvider, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        this.A00 = tigonRequest;
        this.A01 = hucClient;
        this.A02 = tigonHucBodyProvider;
        this.A03 = tigonHucCallbackForwarder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01c4: IGET (r3 I:com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder) = (r2 I:X.TQi) (LINE:452) X.TQi.A03 com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder, block:B:130:0x01c4 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01d4: IGET (r3 I:com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder) = (r2 I:X.TQi) (LINE:468) X.TQi.A03 com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder, block:B:125:0x01d4 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01e4: IGET (r3 I:com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder) = (r2 I:X.TQi) (LINE:484) X.TQi.A03 com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder, block:B:110:0x01e4 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x01f8: IGET (r2 I:com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder) = (r2 I:X.TQi) (LINE:504) X.TQi.A03 com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder, block:B:119:0x01f7 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x020c: IGET (r3 I:com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder) = (r2 I:X.TQi) (LINE:524) X.TQi.A03 com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder, block:B:116:0x0209 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.TQi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.TQi] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.TQi] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.TQi] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.TQi] */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.0fR] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.net.HttpURLConnection] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ?? r2;
        TigonHucCallbackForwarder tigonHucCallbackForwarder;
        int i;
        int i2;
        ?? r22;
        ?? r23;
        ?? r24;
        ?? r25;
        InputStream inputStream;
        HttpsURLConnection httpsURLConnection;
        TigonHucBodyProvider tigonHucBodyProvider;
        str = "";
        try {
            try {
                TigonRequest tigonRequest = this.A00;
                java.net.URL url = new java.net.URL(tigonRequest.url());
                URLConnection openConnection = url.openConnection();
                C14360o3.A0C(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                ?? r3 = (HttpURLConnection) openConnection;
                r3.setConnectTimeout(10000);
                r3.setReadTimeout(30000);
                r3.setUseCaches(false);
                r3.setDoInput(true);
                HucClient hucClient = this.A01;
                r3.addRequestProperty("User-Agent", hucClient.userAgent);
                r3.addRequestProperty("X-FB-HTTP-Engine", "Tigon-Native-HUC");
                if ("https".equals(url.getProtocol())) {
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) r3;
                    SSLSocketFactory sSLSocketFactory = hucClient.sslSocketFactory;
                    if (sSLSocketFactory != null) {
                        httpsURLConnection2.setSSLSocketFactory(sSLSocketFactory);
                    }
                    httpsURLConnection2.setHostnameVerifier(hucClient.hostnameVerifier);
                }
                Iterator A15 = AbstractC166997dE.A15(tigonRequest.headers());
                long j = -1;
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    if (j == -1 && AbstractC167007dF.A0h(AbstractC31172DnG.A17(A1K)).equals(IgNetworkingModule.CONTENT_LENGTH_HEADER_NAME)) {
                        j = Long.parseLong(AbstractC58318PtA.A0p(A1K));
                    }
                    r3.addRequestProperty(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
                }
                r3.setRequestMethod(tigonRequest.method());
                if (C14360o3.A0K(r3.getRequestMethod(), "POST") && (tigonHucBodyProvider = this.A02) != null) {
                    r3.setDoOutput(true);
                    if (j == -1) {
                        r3.setChunkedStreamingMode(0);
                    } else {
                        r3.setFixedLengthStreamingMode(j);
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AbstractC09810fe.A01(r3, -222769129));
                    TigonHucCallbackForwarder tigonHucCallbackForwarder2 = this.A03;
                    try {
                        tigonHucBodyProvider.beginStream(new HucBodyStream(bufferedOutputStream, countDownLatch, j, tigonHucCallbackForwarder2));
                        if (!countDownLatch.await(120L, TimeUnit.SECONDS)) {
                            tigonHucCallbackForwarder2.onError(TigonErrorCode.TRANSIENT_ERROR.value, "HucClient", 3, "Timed out uploading request body");
                            bufferedOutputStream.close();
                            return;
                        }
                        bufferedOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(bufferedOutputStream, th);
                            throw th2;
                        }
                    }
                }
                AbstractC09810fe.A02(r3, 405908572);
                C1FU c1fu = hucClient.certificatePinner;
                if (c1fu != null && (r3 instanceof HttpsURLConnection) && (httpsURLConnection = (HttpsURLConnection) r3) != null) {
                    String host = url.getHost();
                    if (host != null) {
                        Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
                        C14360o3.A07(serverCertificates);
                        ((C1FT) c1fu).A00.AHD(host, serverCertificates);
                    } else {
                        throw AbstractC166987dD.A12("Host cannot be null");
                    }
                }
                int responseCode = r3.getResponseCode();
                if (responseCode == -1) {
                    this.A03.onError(TigonErrorCode.TRANSIENT_ERROR.value, "HucClient", 1, "Could not retrieve response code from HttpUrlConnection");
                    return;
                }
                Map<String, List<String>> headerFields = r3.getHeaderFields();
                C14360o3.A0A(headerFields);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator A152 = AbstractC166997dE.A15(headerFields);
                while (A152.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                    String A17 = AbstractC31172DnG.A17(A1K2);
                    List list = (List) A1K2.getValue();
                    if (A17 != null) {
                        C14360o3.A0A(list);
                        String str2 = (String) AbstractC001800i.A0J(list);
                        if (str2 != null) {
                            AbstractC166997dE.A1R(A17, str2, A1E);
                        }
                    }
                }
                Map A08 = AbstractC06930Yk.A08(A1E);
                TigonHucCallbackForwarder tigonHucCallbackForwarder3 = this.A03;
                tigonHucCallbackForwarder3.onResponse(responseCode, A08);
                String requestMethod = r3.getRequestMethod();
                C14360o3.A07(requestMethod);
                if (!requestMethod.equals("HEAD") && (100 > responseCode || (responseCode >= 200 && responseCode != 204 && responseCode != 304))) {
                    try {
                        r3 = AbstractC09810fe.A00(r3, 665044123);
                        inputStream = r3;
                    } catch (IOException unused) {
                        inputStream = r3.getErrorStream();
                    }
                    byte[] bArr = new byte[4096];
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                tigonHucCallbackForwarder3.onBody(bArr, read);
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                C20I.A00(inputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    inputStream.close();
                }
                tigonHucCallbackForwarder3.onEOM();
            } catch (IOException e) {
                tigonHucCallbackForwarder = r25.A03;
                i = TigonErrorCode.TRANSIENT_ERROR.value;
                String message = e.getMessage();
                str = message != null ? message : "";
                i2 = 1;
                tigonHucCallbackForwarder.onError(i, "HucClient", i2, str);
            }
        } catch (InterruptedException unused2) {
            AbstractC58318PtA.A18();
            r24.A03.onError(TigonErrorCode.CANCEL.value, "HucClient", 4, "Request cancelled");
        } catch (MalformedURLException e2) {
            TigonHucCallbackForwarder tigonHucCallbackForwarder4 = r23.A03;
            int i3 = TigonErrorCode.FATAL_ERROR.value;
            String message2 = e2.getMessage();
            tigonHucCallbackForwarder4.onError(i3, "HucClient", 2, message2 != null ? message2 : "");
        } catch (ProtocolException e3) {
            tigonHucCallbackForwarder = r22.A03;
            i = TigonErrorCode.FATAL_ERROR.value;
            String message3 = e3.getMessage();
            str = message3 != null ? message3 : "";
            i2 = 2;
            tigonHucCallbackForwarder.onError(i, "HucClient", i2, str);
        } catch (Exception e4) {
            tigonHucCallbackForwarder = r2.A03;
            i = TigonErrorCode.TRANSIENT_ERROR.value;
            i2 = 5;
            String message4 = e4.getMessage();
            if (message4 != null) {
                str = message4;
            }
            tigonHucCallbackForwarder.onError(i, "HucClient", i2, str);
        }
    }
}
