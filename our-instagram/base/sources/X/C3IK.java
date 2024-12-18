package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.common.io.Closeables;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.3IK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IK {
    public int A00;
    public C1QY A01;
    public AbstractC71443Ii A02;
    public AbstractC71443Ii A03;
    public AbstractC60252p8 A04;
    public String A05;
    public GZIPInputStream A06;
    public GZIPOutputStream A07;
    public GZIPOutputStream A08;
    public boolean A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final C3IZ A01(C1Ef c1Ef, InterfaceC24271Gw interfaceC24271Gw, C24211Gq c24211Gq, boolean z) {
        int i;
        GZIPInputStream gZIPInputStream = null;
        try {
            String str = this.A0C;
            C59732oG AXI = interfaceC24271Gw.AXI(str);
            if (AXI.A00 != null) {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream((AbstractC60252p8) AXI.A00());
                if (c24211Gq != null && z) {
                    try {
                        String str2 = this.A0B;
                        if (c1Ef == C1Ef.OffScreen) {
                            i = 0;
                        } else {
                            i = -1;
                            if (c1Ef == C1Ef.OnScreen) {
                                i = 1;
                            }
                        }
                        c24211Gq.A02(str2, null, 0, i, interfaceC24271Gw.B2T(str) + interfaceC24271Gw.B2T(this.A0A));
                    } catch (Throwable th) {
                        th = th;
                        gZIPInputStream = gZIPInputStream2;
                        Closeables.A01(gZIPInputStream);
                        throw th;
                    }
                }
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, Charset.forName(ReactWebViewManager.HTML_ENCODING)));
                }
                C3IZ parseFromJson = C3IY.parseFromJson(C16V.A00(sb.toString()));
                if (parseFromJson != null) {
                    Closeables.A01(gZIPInputStream2);
                    return parseFromJson;
                }
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Attempt to parse String to AsyncHttpResponseInfo: %s. Length: %s. mResponseInfoIgDiskCacheKey: %s. IgDiskCache size in bytes %d", sb.toString(), Integer.valueOf(sb.length()), str, Long.valueOf(interfaceC24271Gw.size()));
                A03(interfaceC24271Gw);
                C0w9.A03("HttpStoreEntry_nullAsyncHttpResponseInfo", formatStrLocaleSafe);
                throw new IOException(formatStrLocaleSafe);
            }
            throw new IOException("Http ResponseInfo file stream not available");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2oG] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.2p8, java.io.InputStream] */
    public static boolean A00(InterfaceC24271Gw interfaceC24271Gw, String str, String str2) {
        AbstractC71443Ii abstractC71443Ii;
        ?? AXI = interfaceC24271Gw.AXI(str);
        AbstractC71443Ii abstractC71443Ii2 = null;
        try {
            try {
                if (AXI.A00 != null) {
                    C59732oG ARB = interfaceC24271Gw.ARB(str2);
                    if (ARB.A00 != null) {
                        AXI = (AbstractC60252p8) AXI.A00();
                        try {
                            abstractC71443Ii = (AbstractC71443Ii) ARB.A00();
                        } catch (IOException unused) {
                        }
                        try {
                            FileChannel A01 = AXI.A01();
                            A01.transferTo(0L, A01.size(), abstractC71443Ii.A01());
                            abstractC71443Ii.A03();
                            abstractC71443Ii.A02();
                            Closeables.A01(AXI);
                            return true;
                        } catch (IOException unused2) {
                            abstractC71443Ii2 = abstractC71443Ii;
                            C0w9.A01.EmN("HttpStoreEntry", StringFormatUtil.formatStrLocaleSafe("IOException when copying file %s", str));
                            if (abstractC71443Ii2 != null) {
                                abstractC71443Ii2.A02();
                            }
                            Closeables.A01(AXI);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            abstractC71443Ii2 = abstractC71443Ii;
                            if (abstractC71443Ii2 != null) {
                                abstractC71443Ii2.A02();
                            }
                            Closeables.A01(AXI);
                            throw th;
                        }
                    }
                } else {
                    C0w9.A01.EmN("HttpStoreEntry", StringFormatUtil.formatStrLocaleSafe("Source file %s not found when copying", str));
                }
                Closeables.A01(null);
                return false;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused3) {
            AXI = 0;
        } catch (Throwable th3) {
            th = th3;
            AXI = 0;
            Closeables.A01(AXI);
            throw th;
        }
    }

    public final void A02() {
        AbstractC71443Ii abstractC71443Ii = this.A03;
        if (abstractC71443Ii != null) {
            abstractC71443Ii.A02();
        }
        AbstractC71443Ii abstractC71443Ii2 = this.A02;
        if (abstractC71443Ii2 != null) {
            abstractC71443Ii2.A02();
        }
        GZIPOutputStream gZIPOutputStream = this.A08;
        if (gZIPOutputStream != null) {
            try {
                gZIPOutputStream.close();
            } catch (IOException e) {
                C0K8.A0H("HttpStoreEntry", "IOException when closing header output stream", e);
            }
        }
        GZIPOutputStream gZIPOutputStream2 = this.A07;
        if (gZIPOutputStream2 != null) {
            try {
                gZIPOutputStream2.close();
            } catch (IOException e2) {
                C0K8.A0H("HttpStoreEntry", "IOException when closing body output stream", e2);
            }
        }
    }

    public final String toString() {
        return StringFormatUtil.formatStrLocaleSafe("{requestPath: %s, cacheKey: %s, requestId: %d}", this.A05, this.A0A, Integer.valueOf(this.A00));
    }

    public C3IK(String str) {
        this.A0B = str;
        this.A0C = AnonymousClass001.A0R(str, "-resp_info_gzip");
        this.A0A = AnonymousClass001.A0R(str, "-body_gzip");
    }

    public final void A03(InterfaceC24271Gw interfaceC24271Gw) {
        A02();
        String str = this.A0C;
        if (interfaceC24271Gw.CKd(str)) {
            interfaceC24271Gw.EEk(str);
        }
        String str2 = this.A0A;
        if (interfaceC24271Gw.CKd(str2)) {
            interfaceC24271Gw.EEk(str2);
        }
    }
}
