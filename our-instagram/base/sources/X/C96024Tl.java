package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.DummySurface;
import java.util.List;

/* renamed from: X.4Tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C96024Tl extends AbstractC96034Tm {
    public static boolean A0m;
    public static boolean A0n;
    public static final int[] A0o = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public MediaFormat A0M;
    public Surface A0N;
    public Surface A0O;
    public C98574bb A0P;
    public C130185uO A0Q;
    public C4Ws A0R;
    public Object A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int A0b;
    public long A0c;
    public final long A0d;
    public final Context A0e;
    public final C4U8 A0f;
    public final C4U1 A0g;
    public final C96154Ty A0h;
    public final C4U7 A0i;
    public final boolean A0j;
    public final long[] A0k;
    public final long[] A0l;

    public C96024Tl(Context context, Handler handler, C96014Tk c96014Tk, C2VQ c2vq, C4XR c4xr, C4BL c4bl, C4TY c4ty, long j) {
        super(c96014Tk, c2vq, c4xr, c4bl, 2, true);
        this.A0X = true;
        this.A0T = true;
        boolean z = false;
        this.A0Y = false;
        this.A0W = false;
        this.A0j = C2C5.A02(C2C1.A1P);
        this.A0d = j;
        Context applicationContext = context.getApplicationContext();
        this.A0e = applicationContext;
        this.A0h = new C96154Ty(context);
        C4U1 c4u1 = new C4U1(applicationContext);
        this.A0g = c4u1;
        this.A0i = new C4U7(handler, c4ty);
        this.A0f = new C4U8(this, c4u1);
        if (Util.A00 == 29 && Util.A04.startsWith("Pixel ")) {
            z = true;
        }
        this.A0U = z;
        this.A0k = new long[10];
        this.A0l = new long[10];
        this.A0L = -9223372036854775807L;
        this.A0c = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A06 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0E = 1;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(java.lang.String r4, int r5, int r6) {
        /*
            r3 = -1
            if (r5 == r3) goto Ld
            if (r6 == r3) goto Ld
            int r0 = r4.hashCode()
            r2 = 4
            switch(r0) {
                case -1664118616: goto L4d;
                case -1662541442: goto L43;
                case 1187890754: goto L3c;
                case 1331836730: goto L18;
                case 1599127256: goto L11;
                case 1599127257: goto Le;
                default: goto Ld;
            }
        Ld:
            return r3
        Le:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L45
        L11:
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            goto L4f
        L18:
            java.lang.String r0 = "video/avc"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld
            r2 = 16
            int r0 = r5 + 16
            int r1 = r0 + (-1)
            int r1 = r1 / r2
            int r0 = r6 + 16
            int r0 = r0 + (-1)
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r0 = r1 * 16
            int r5 = r0 * 16
            goto L56
        L3c:
            r0 = 5555(0x15b3, float:7.784E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L4f
        L43:
            java.lang.String r0 = "video/hevc"
        L45:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Ld
            int r5 = r5 * r6
            goto L57
        L4d:
            java.lang.String r0 = "video/3gpp"
        L4f:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Ld
            int r5 = r5 * r6
        L56:
            r2 = 2
        L57:
            int r1 = r5 * 3
            int r0 = r2 * 2
            int r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96024Tl.A02(java.lang.String, int, int):int");
    }

    private void A03() {
        InterfaceC53292cD interfaceC53292cD;
        this.A0Z = false;
        if (this.A0a && (interfaceC53292cD = ((AbstractC96034Tm) this).A0B) != null) {
            this.A0Q = new C130185uO(interfaceC53292cD, this);
        }
    }

    @Override // X.AbstractC96034Tm, X.AbstractC96044Tn
    public final void A0K() {
        this.A06 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0L = -9223372036854775807L;
        this.A0c = -9223372036854775807L;
        this.A0b = 0;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
        A03();
        C96154Ty c96154Ty = this.A0h;
        if (c96154Ty.A09 != null) {
            C96164Tz c96164Tz = c96154Ty.A0A;
            if (c96164Tz != null) {
                c96164Tz.A00.unregisterDisplayListener(c96164Tz);
            }
            c96154Ty.A0B.A02.sendEmptyMessage(2);
        }
        this.A0Q = null;
        this.A0a = false;
        this.A08 = 0;
        this.A09 = 0;
        try {
            super.A0K();
            synchronized (((AbstractC96034Tm) this).A09) {
            }
            C4U7 c4u7 = this.A0i;
            C98154au c98154au = ((AbstractC96034Tm) this).A09;
            synchronized (c98154au) {
            }
            c4u7.A00.post(new RunnableC122335gT(c98154au, c4u7));
        } catch (Throwable th) {
            synchronized (((AbstractC96034Tm) this).A09) {
                C4U7 c4u72 = this.A0i;
                C98154au c98154au2 = ((AbstractC96034Tm) this).A09;
                synchronized (c98154au2) {
                    c4u72.A00.post(new RunnableC122335gT(c98154au2, c4u72));
                    throw th;
                }
            }
        }
    }

    @Override // X.AbstractC96034Tm
    public final void A0R() {
        try {
            super.A0R();
        } finally {
            this.A03 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                if (this.A0O == surface) {
                    this.A0O = null;
                }
                surface.release();
                this.A0N = null;
            }
        }
    }

    public final void A0X() {
        if (!this.A0Z) {
            this.A0Z = true;
            this.A0i.A01(this.A0O);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (CbZ() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r9 != null) goto L85;
     */
    @Override // X.AbstractC96044Tn, X.InterfaceC96064Tp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CK0(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96024Tl.CK0(int, java.lang.Object):void");
    }

    @Override // X.InterfaceC96054To, X.InterfaceC96074Tq
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    public static int A00(C4B6 c4b6) {
        int i = c4b6.A0B;
        if (i != -1) {
            List list = c4b6.A0X;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return i + i2;
        }
        return A02(c4b6.A0W, c4b6.A0L, c4b6.A0A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        if (r0 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(X.C4B6 r7, X.C4BL r8, boolean r9) {
        /*
            java.lang.String r5 = r7.A0W
            boolean r0 = X.C2IH.A06(r5)
            r3 = 0
            if (r0 != 0) goto La
            return r3
        La:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r7.A0O
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L11
            r4 = 1
        L11:
            java.util.List r2 = r8.Aw3(r5, r4, r3)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L3b
            if (r9 == 0) goto L3b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = X.C46762Co.A03(r7)
            if (r0 == 0) goto L3b
            java.util.List r1 = r8.Aw3(r0, r3, r3)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L3b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L3b
            r2 = r1
        L3b:
            if (r4 == 0) goto L4f
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L4f
            java.util.List r0 = r8.Aw3(r5, r3, r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4e
            r6 = 2
        L4e:
            return r6
        L4f:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L58
            r1 = 129(0x81, float:1.81E-43)
            return r1
        L58:
            int r1 = r7.A07
            if (r1 == 0) goto L62
            r0 = 2
            if (r1 == r0) goto L62
            r1 = 130(0x82, float:1.82E-43)
            return r1
        L62:
            java.lang.Object r5 = r2.get(r3)
            X.2IG r5 = (X.C2IG) r5
            java.lang.String r4 = r7.A0R
            if (r4 == 0) goto Lb3
            java.lang.String r0 = r5.A02
            if (r0 == 0) goto Lb3
            java.lang.String r2 = X.C2IH.A02(r4)
            if (r2 == 0) goto Lb3
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lae
            java.lang.String r1 = "codec.mime "
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AnonymousClass001.A0u(r1, r4, r0, r2)
            X.C2IG.A01(r5, r0)
            r0 = 0
        L88:
            if (r0 == 0) goto L99
        L8a:
            int r4 = r7.A0L
            if (r4 <= 0) goto L99
            int r2 = r7.A0A
            if (r2 <= 0) goto L99
            float r0 = r7.A01
            double r0 = (double) r0
            boolean r0 = r5.A08(r4, r2, r0)
        L99:
            boolean r1 = r5.A04
            r2 = 8
            if (r1 == 0) goto La1
            r2 = 16
        La1:
            boolean r1 = r5.A08
            if (r1 == 0) goto La7
            r3 = 32
        La7:
            r1 = 3
            if (r0 == 0) goto Lab
            r1 = 4
        Lab:
            r2 = r2 | r3
            r1 = r1 | r2
            return r1
        Lae:
            boolean r0 = X.C2IG.A03(r7, r5, r6)
            goto L88
        Lb3:
            r0 = 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96024Tl.A01(X.4B6, X.4BL, boolean):int");
    }

    private void A04() {
        int i = this.A0D;
        if (i != -1 || this.A0B != -1) {
            this.A0i.A00(new C4U9(this.A02, i, this.A0B, this.A0C));
        }
    }

    public static void A05(C96024Tl c96024Tl) {
        int i = c96024Tl.A06;
        if (i != -1 || c96024Tl.A05 != -1) {
            if (c96024Tl.A0D != i || c96024Tl.A0B != c96024Tl.A05 || c96024Tl.A0C != 0 || c96024Tl.A02 != c96024Tl.A00) {
                c96024Tl.A0i.A00(new C4U9(c96024Tl.A00, i, c96024Tl.A05, 0));
                c96024Tl.A0D = c96024Tl.A06;
                c96024Tl.A0B = c96024Tl.A05;
                c96024Tl.A0C = 0;
                c96024Tl.A02 = c96024Tl.A00;
            }
        }
    }

    public static boolean A06(C4B6 c4b6, C4B6 c4b62, boolean z) {
        if (c4b6.A0W.equals(c4b62.A0W) && c4b6.A0F == c4b62.A0F && ((z || (c4b6.A0L == c4b62.A0L && c4b6.A0A == c4b62.A0A)) && Util.A0I(c4b6.A0Q, c4b62.A0Q))) {
            return true;
        }
        return false;
    }

    public static boolean A07(C2IG c2ig, C96024Tl c96024Tl) {
        if (c96024Tl.A0X && !c96024Tl.A0a && !A08(c2ig.A03)) {
            if (!c2ig.A06 || DummySurface.A01()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A08(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C96024Tl.class) {
            if (!A0n) {
                if ("dangal".equals(Util.A01)) {
                    A0m = true;
                }
                A0n = true;
            }
        }
        return A0m;
    }

    @Override // X.AbstractC96034Tm, X.AbstractC96044Tn
    public final void A0J() {
        if (this.A0j) {
            try {
                super.A0J();
                Surface surface = this.A0N;
                if (surface != null) {
                    if (this.A0O == surface) {
                        this.A0O = null;
                    }
                    surface.release();
                    this.A0N = null;
                }
            } catch (Throwable th) {
                Surface surface2 = this.A0N;
                if (surface2 != null) {
                    if (this.A0O == surface2) {
                        this.A0O = null;
                    }
                    surface2.release();
                    this.A0N = null;
                }
                throw th;
            }
        }
    }

    @Override // X.AbstractC96034Tm, X.AbstractC96044Tn
    public void A0N(C4B6[] c4b6Arr, long j, long j2) {
        if (this.A0L == -9223372036854775807L) {
            this.A0L = j2;
            return;
        }
        int i = this.A0b;
        long[] jArr = this.A0k;
        if (i == jArr.length) {
            AbstractC46512Bo.A04("MediaCodecVideoRenderer", AnonymousClass001.A0Q("Too many stream changes, so dropping offset: ", jArr[i - 1]));
        } else {
            this.A0b = i + 1;
        }
        int i2 = this.A0b - 1;
        jArr[i2] = j2;
        this.A0l[i2] = this.A0c;
    }

    @Override // X.AbstractC96034Tm
    public void A0T(long j) {
        this.A03--;
        while (true) {
            int i = this.A0b;
            if (i != 0) {
                long[] jArr = this.A0l;
                if (j >= jArr[0]) {
                    long[] jArr2 = this.A0k;
                    this.A0L = jArr2[0];
                    int i2 = i - 1;
                    this.A0b = i2;
                    System.arraycopy(jArr2, 1, jArr2, 0, i2);
                    System.arraycopy(jArr, 1, jArr, 0, this.A0b);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC96034Tm
    public void A0V(C96094Ts c96094Ts) {
        this.A03++;
        this.A0c = Math.max(c96094Ts.A01, this.A0c);
    }

    public final void A0Y(int i) {
        C98154au c98154au = ((AbstractC96034Tm) this).A09;
        c98154au.A04 += i;
        int i2 = this.A07 + i;
        this.A07 = i2;
        int i3 = this.A04 + i;
        this.A04 = i3;
        c98154au.A07 = Math.max(i3, c98154au.A07);
        if (i2 >= 0 && i2 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4U7 c4u7 = this.A0i;
            c4u7.A00.post(new RunnableC121445em(c4u7));
            this.A07 = 0;
            this.A0F = elapsedRealtime;
        }
    }

    public final void A0Z(InterfaceC53292cD interfaceC53292cD, int i, long j, long j2) {
        int i2;
        C4B6 c4b6 = ((AbstractC96034Tm) this).A08;
        MediaFormat mediaFormat = this.A0M;
        C4Ws c4Ws = this.A0R;
        if (c4Ws != null) {
            c4Ws.Dz6(mediaFormat, c4b6, j, j2);
        }
        AbstractC460729r.A01("releaseOutputBuffer");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC53292cD.releaseOutputBuffer(i, j2);
        ((AbstractC96034Tm) this).A06 += SystemClock.elapsedRealtime() - elapsedRealtime;
        AbstractC460729r.A00();
        ((AbstractC96034Tm) this).A09.A09++;
        this.A04 = 0;
        this.A0J = SystemClock.elapsedRealtime() * 1000;
        A05(this);
        A0X();
        C98154au c98154au = ((AbstractC96034Tm) this).A09;
        long j3 = ((AbstractC96034Tm) this).A06;
        int i3 = c98154au.A09;
        if (i3 == 0) {
            i2 = -1;
        } else {
            i2 = (int) (j3 / i3);
        }
        c98154au.A01 = i2;
    }

    @Override // X.InterfaceC96054To
    public final boolean CTt() {
        return super.A0L;
    }

    @Override // X.AbstractC96034Tm, X.AbstractC96044Tn
    public final void A0L(long j, boolean z) {
        long j2;
        super.A0L(j, z);
        A03();
        if (this.A0j) {
            C4U1 c4u1 = this.A0g;
            c4u1.A02 = 0L;
            c4u1.A03 = -1L;
            c4u1.A05 = -1L;
        }
        this.A0I = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A04 = 0;
        this.A0c = -9223372036854775807L;
        this.A08 = 0;
        this.A09 = 0;
        int i = this.A0b;
        if (i != 0) {
            this.A0L = this.A0k[i - 1];
            this.A0b = 0;
        }
        if (z) {
            long j3 = this.A0d;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A0H = j2;
            return;
        }
        this.A0H = -9223372036854775807L;
    }

    @Override // X.AbstractC96034Tm, X.AbstractC96044Tn
    public final void A0M(boolean z, boolean z2) {
        super.A0M(z, z2);
        C4WD c4wd = ((AbstractC96044Tn) this).A03;
        c4wd.getClass();
        this.A0a = c4wd.A00;
        C4U7 c4u7 = this.A0i;
        c4u7.A00.post(new RunnableC98164av(((AbstractC96034Tm) this).A09, c4u7));
        this.A0h.A02();
    }

    @Override // X.AbstractC96034Tm
    public final void A0Q() {
        super.A0Q();
        this.A03 = 0;
    }

    @Override // X.AbstractC96034Tm
    public final void A0U(C4B6 c4b6) {
        super.A0U(c4b6);
        C4U7 c4u7 = this.A0i;
        c4u7.A00.post(new RunnableC98674bn(c4b6, null, c4u7));
        this.A01 = c4b6.A02;
        this.A0A = c4b6.A0F;
    }

    @Override // X.AbstractC96034Tm, X.InterfaceC96054To
    public final boolean CbZ() {
        Surface surface;
        Surface surface2;
        if (super.CbZ() && !this.A0Z && (((surface2 = this.A0N) == null || this.A0O != surface2) && ((AbstractC96034Tm) this).A0B != null && !this.A0a)) {
            ((AbstractC96044Tn) this).A06 = C05F.A0Y;
        }
        if (super.CbZ() && (this.A0Z || (((surface = this.A0N) != null && this.A0O == surface) || ((AbstractC96034Tm) this).A0B == null || this.A0a))) {
            this.A0H = -9223372036854775807L;
        } else {
            long j = this.A0H;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    this.A0H = -9223372036854775807L;
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC96034Tm, X.AbstractC96044Tn
    public final void A0I() {
        this.A0H = -9223372036854775807L;
        if (this.A07 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4U7 c4u7 = this.A0i;
            c4u7.A00.post(new RunnableC121445em(c4u7));
            this.A07 = 0;
            this.A0F = elapsedRealtime;
        }
        if (this.A0j) {
            this.A0g.A04();
        }
    }

    @Override // X.AbstractC96034Tm, X.InterfaceC96054To
    public final void EGW(long j, long j2) {
        super.EGW(j, j2);
    }
}
