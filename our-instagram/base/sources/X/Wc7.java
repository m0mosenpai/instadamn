package X;

import com.facebook.tigon.tigonhuc.HucClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;

/* loaded from: classes11.dex */
public final class Wc7 implements InterfaceC92354Bq, InterfaceC92374Bs {
    public static final VKD A0B;
    public C2BB A00;
    public UMT A01;
    public final int A02;
    public final C46322Au A03;
    public final C2Ai A04;
    public final C92304Bk A05;
    public final InterfaceC92334Bn A06;
    public final String A07;
    public final boolean A08;
    public volatile int A09 = -1;
    public volatile InterfaceC92354Bq A0A = null;

    @Override // X.InterfaceC92374Bs
    public final void changeHttpPriority(byte b, boolean z) {
    }

    @Override // X.InterfaceC92354Bq
    public final synchronized void close() {
        byte[] bArr;
        if (this.A0A != null) {
            this.A0A.close();
            if (this.A0A instanceof Wc6) {
                Wc6 wc6 = (Wc6) this.A0A;
                if (this.A01 != null && wc6.A03() && (bArr = wc6.A03) != null) {
                    int length = bArr.length;
                    int i = wc6.A01;
                    if (length >= i) {
                        if (i <= 0) {
                            i = wc6.A00;
                        }
                        VKD vkd = A0B;
                        synchronized (vkd) {
                            vkd.A02(this.A01, new Wc5(this.A00, wc6.A03, i, true));
                        }
                        C46322Au c46322Au = this.A03;
                        UMT umt = this.A01;
                        c46322Au.A00(umt.A01, umt.A00, wc6.A03, i);
                    }
                }
            }
        }
        this.A0A = null;
    }

    @Override // X.InterfaceC92354Bq
    public final synchronized long open(C4C7 c4c7) {
        C92304Bk c92304Bk;
        boolean z;
        int i;
        c92304Bk = this.A05;
        String str = c92304Bk.A07;
        android.net.Uri uri = c4c7.A06;
        C4C6 c4c6 = c4c7.A07;
        this.A01 = new UMT(str, uri);
        VKD vkd = A0B;
        synchronized (vkd) {
            InterfaceC92354Bq A00 = vkd.A00(this.A01);
            z = true;
            if (A00 == null) {
                byte[] A01 = this.A03.A01(uri, str);
                if (A01 == null) {
                    C2Ai c2Ai = this.A04;
                    String str2 = this.A07;
                    int i2 = 8500;
                    if (!c4c6.A0U) {
                        i2 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                        i = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                    } else {
                        i = this.A02;
                    }
                    this.A0A = new UMU(c2Ai, this.A00, c92304Bk, this.A06, str2, i2, i, this.A08);
                } else {
                    this.A0A = new Wc5(this.A00, A01, A01.length, false);
                    vkd.A02(this.A01, this.A0A);
                }
                z = false;
            } else if (A00 instanceof Wc5) {
                Wc5 wc5 = (Wc5) A00;
                z = wc5.A04;
                this.A0A = new Wc5(this.A00, wc5.A05, wc5.A03, z);
            } else {
                UMV umv = (UMV) A00;
                if (umv.A03()) {
                    this.A0A = new Wc5(this.A00, ((Wc6) umv).A03, ((Wc6) umv).A01, true);
                    vkd.A02(this.A01, this.A0A);
                } else {
                    vkd.A01(this.A01);
                    umv.A02 = this.A00;
                    this.A0A = umv;
                }
            }
        }
        return this.A0A.open(A00(this, c4c7, c92304Bk.A03, c92304Bk.A04, z));
    }

    @Override // X.InterfaceC92364Br
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.A0A != null) {
            i3 = this.A0A.read(bArr, i, i2);
        } else {
            i3 = -1;
        }
        return i3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.VKD, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A01 = HucClient.BODY_UPLOAD_TIMEOUT_SECONDS;
        obj.A00 = 12;
        obj.A02 = new C66338U9x(obj, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
        obj.A03 = new HashMap();
        A0B = obj;
    }

    public static C4C7 A00(Wc7 wc7, C4C7 c4c7, String str, String str2, boolean z) {
        int i;
        C4C2 c4c2 = new C4C2(str, z, str2);
        String str3 = null;
        Map emptyMap = Collections.emptyMap();
        android.net.Uri uri = c4c7.A06;
        if (uri == null) {
            uri = android.net.Uri.EMPTY;
        }
        byte[] bArr = c4c7.A0A;
        long j = c4c7.A02;
        long j2 = c4c7.A04;
        long j3 = j - j2;
        long j4 = c4c7.A03;
        if (j4 <= 0) {
            j4 = -1;
        }
        int i2 = c4c7.A00;
        C4C6 c4c6 = c4c7.A07;
        if (wc7.A09 >= 0) {
            i = wc7.A09;
        } else {
            i = c4c6.A05;
        }
        C4C6 c4c62 = new C4C6(C4C4.A02, c4c2, c4c6, c4c6.A0O, i, c4c6.A03, c4c6.A0R);
        String str4 = c4c7.A08;
        if (str4 != null) {
            str3 = str4;
        }
        C4B8.A02(uri);
        return new C4C7(uri, c4c62, str3, emptyMap, bArr, 1, i2, j3, j2, j4);
    }

    @Override // X.InterfaceC92354Bq
    public final void cancel() {
        if (this.A0A != null) {
            this.A0A.cancel();
        }
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        if (this.A0A != null) {
            return this.A0A.getUri();
        }
        return null;
    }

    public Wc7(C46322Au c46322Au, C2Ai c2Ai, C2BB c2bb, C92304Bk c92304Bk, InterfaceC92334Bn interfaceC92334Bn, String str, int i, boolean z) {
        this.A05 = c92304Bk;
        this.A07 = str;
        this.A03 = c46322Au;
        this.A00 = c2bb;
        this.A06 = interfaceC92334Bn;
        this.A04 = c2Ai;
        this.A02 = i;
        this.A08 = z;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        C2BB wva;
        c2bc.getClass();
        if (c2bc instanceof C2BB) {
            wva = (C2BB) c2bc;
        } else {
            wva = new WVA(c2bc);
        }
        this.A00 = wva;
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
