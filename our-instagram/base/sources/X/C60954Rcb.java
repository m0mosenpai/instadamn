package X;

import android.os.SystemClock;
import com.facebook.mobilenetwork.DomainInfoUtils;
import com.google.common.io.Closeables;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.Rcb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60954Rcb extends AbstractRunnableC18200v5 {
    public long A00;
    public final /* synthetic */ C58356Ptw A01;
    public final /* synthetic */ C26461Qb A02;
    public final /* synthetic */ C26511Qg A03;
    public final /* synthetic */ C1QW A04;
    public final /* synthetic */ C1QY A05;
    public final /* synthetic */ AtomicBoolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60954Rcb(C58356Ptw c58356Ptw, C26461Qb c26461Qb, C26511Qg c26511Qg, C1QW c1qw, C1QY c1qy, AtomicBoolean atomicBoolean) {
        super(11, 3, true, true);
        this.A01 = c58356Ptw;
        this.A04 = c1qw;
        this.A03 = c26511Qg;
        this.A02 = c26461Qb;
        this.A06 = atomicBoolean;
        this.A05 = c1qy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.3JQ, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        URLConnection openConnection;
        String str;
        InputStream errorStream;
        InterfaceC26421Px interfaceC26421Px;
        SSLSocketFactory sSLSocketFactory;
        BufferedInputStream bufferedInputStream = null;
        C1QW c1qw = this.A04;
        java.net.URI uri = c1qw.A09;
        uri.getPath();
        this.A00 = SystemClock.elapsedRealtime();
        try {
            C58356Ptw c58356Ptw = this.A01;
            C26511Qg c26511Qg = this.A03;
            c26511Qg.A02(c1qw);
            C58355Ptv c58355Ptv = c58356Ptw.A00;
            C26461Qb c26461Qb = this.A02;
            C1QW c1qw2 = c26461Qb.A02;
            try {
                java.net.URI uri2 = c1qw2.A09;
                java.net.URL url = uri2.toURL();
                Proxy proxy = c58355Ptv.A02;
                if (proxy == null) {
                    openConnection = url.openConnection();
                } else {
                    openConnection = url.openConnection(proxy);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                String str2 = c58355Ptv.A01;
                httpURLConnection.setRequestProperty("User-Agent", str2);
                if ("https".equals(url.getProtocol())) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                    if (url.getHost() != null && DomainInfoUtils.isFbInfraDomainNative(url.getHost())) {
                        sSLSocketFactory = c58355Ptv.A04;
                    } else {
                        sSLSocketFactory = c58355Ptv.A05;
                    }
                    httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                    httpsURLConnection.setHostnameVerifier(c58355Ptv.A03);
                }
                c26461Qb.A01(new TFE(c58355Ptv, httpURLConnection));
                if (!c1qw2.A02("Accept-Language")) {
                    c1qw2.A01("Accept-Language", AbstractC15660qM.A00());
                }
                C1JP c1jp = c1qw2.A05;
                if (c1jp != null) {
                    c1jp.ACw(uri2, c1qw2.A01);
                }
                for (C23781El c23781El : c1qw2.A01) {
                    httpURLConnection.addRequestProperty(c23781El.A00, c23781El.A01);
                }
                Integer num = c1qw2.A07;
                int intValue = num.intValue();
                if (intValue != 3) {
                    if (intValue != 1) {
                        if (intValue == 4) {
                            str = "HEAD";
                        } else {
                            throw AbstractC166987dD.A14("Unknown method type.");
                        }
                    } else {
                        str = "POST";
                    }
                } else {
                    str = "GET";
                }
                httpURLConnection.setRequestMethod(str);
                if (num == C05F.A01 && (interfaceC26421Px = c1qw2.A06) != null) {
                    httpURLConnection.setDoOutput(true);
                    if (interfaceC26421Px.Ar8() != null) {
                        httpURLConnection.setRequestProperty(interfaceC26421Px.Ar8().A00, interfaceC26421Px.Ar8().A01);
                    }
                    if (interfaceC26421Px.Aqy() != null) {
                        httpURLConnection.addRequestProperty(interfaceC26421Px.Aqy().A00, interfaceC26421Px.Aqy().A01);
                    }
                    if (interfaceC26421Px.getContentLength() == -1) {
                        httpURLConnection.setChunkedStreamingMode(0);
                    } else {
                        httpURLConnection.setFixedLengthStreamingMode((int) interfaceC26421Px.getContentLength());
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AbstractC09810fe.A01(httpURLConnection, 886702320));
                    try {
                        InputStream E2i = interfaceC26421Px.E2i();
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = E2i.read(bArr);
                                if (read == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                            }
                            E2i.close();
                            bufferedOutputStream.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                }
                try {
                    AbstractC09810fe.A02(httpURLConnection, -1089170098);
                    C1FN c1fn = c58355Ptv.A00;
                    if (c1fn != null && (httpURLConnection instanceof HttpsURLConnection)) {
                        String host = uri2.getHost();
                        host.getClass();
                        c1fn.AHD(host, ((HttpsURLConnection) httpURLConnection).getServerCertificates());
                    }
                    if (httpURLConnection.getResponseCode() != -1) {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        if (c1jp != null) {
                            c1jp.FA4(uri2, headerFields);
                        }
                        ArrayList A1E = AbstractC166987dD.A1E();
                        Iterator A15 = AbstractC166997dE.A15(headerFields);
                        while (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            if (A1K.getKey() != null) {
                                AbstractC58319PtB.A1I(AbstractC31172DnG.A17(A1K), AbstractC25226BEj.A1I((List) A1K.getValue(), 0), A1E);
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        String responseMessage = httpURLConnection.getResponseMessage();
                        boolean z = false;
                        if (num != C05F.A00 && (100 > responseCode || (responseCode >= 200 && responseCode != 204 && responseCode != 304))) {
                            try {
                                errorStream = AbstractC09810fe.A00(httpURLConnection, 366154974);
                            } catch (IOException unused) {
                                errorStream = httpURLConnection.getErrorStream();
                            }
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(errorStream);
                            httpURLConnection.getContentLength();
                            bufferedInputStream = bufferedInputStream2;
                            z = true;
                        }
                        if (C0K8.A01.isLoggable(3)) {
                            ArrayList A1F = AbstractC166987dD.A1F(c1qw2.A01);
                            if (c1jp != null) {
                                c1jp.ACw(uri2, A1F);
                            }
                            AbstractC58319PtB.A1I("Host", uri2.getHost(), A1F);
                            AbstractC58319PtB.A1I("Connection", "Keep-Alive", A1F);
                            AbstractC58319PtB.A1I("User-Agent", str2, A1F);
                            AbstractC58319PtB.A1I("Accept-Encoding", "gzip", A1F);
                            AbstractC62258S4d.A00(c1qw2.A06, AbstractC26611Qq.A00(num), uri2, (C23781El[]) A1F.toArray(new C23781El[A1F.size()]));
                        }
                        int i = c1qw.A04;
                        ArrayList A1F2 = AbstractC166987dD.A1F(A1E);
                        ?? obj = new Object();
                        obj.A01 = responseCode;
                        obj.A02 = responseMessage;
                        obj.A00 = i;
                        obj.A03 = A1F2;
                        c26511Qg.A00(obj, c1qw);
                        if (z) {
                            ByteBuffer allocate = ByteBuffer.allocate(4096);
                            while (true) {
                                int read2 = bufferedInputStream.read(allocate.array());
                                if (read2 <= 0) {
                                    break;
                                }
                                allocate.limit(read2);
                                allocate.rewind();
                                c26511Qg.A05(c1qw, allocate);
                                allocate.clear();
                            }
                            Closeables.A01(bufferedInputStream);
                        }
                        c26511Qg.A03(c1qw);
                    }
                } catch (IllegalArgumentException e) {
                }
            } catch (SecurityException e2) {
                C0w9.A06("url_connection_http_stack_security_exception", "url_connection_http_stack_security_exception", e2);
                throw new IOException("Send request failed caused by SecurityException", e2);
            }
        } catch (IOException e3) {
            e = e3;
            if (this.A06.get()) {
                e = new IOException(e.getMessage());
            }
            uri.getPath();
            if (0 != 0) {
                Closeables.A01(null);
            }
            this.A03.A04(c1qw, e);
        }
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("HttpEngineBasedServiceLayer ");
        C1QY c1qy = this.A05;
        A0s.append(c1qy.A09);
        A0s.append(" ");
        A0s.append(c1qy.A00());
        A0s.append("@");
        A0s.append("age ");
        A0s.append(SystemClock.elapsedRealtime() - this.A00);
        A0s.append(" ");
        A0s.append(c1qy.A0E);
        A0s.append(" ");
        return AbstractC166997dE.A0v(this.A04.A09, A0s);
    }
}
