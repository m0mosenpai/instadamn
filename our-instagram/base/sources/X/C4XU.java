package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.4XU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4XU extends C4XV {
    public static final C4XU $redex_init_class = null;
    public int A00;
    public int A01;
    public long A02;
    public long A03;

    @Deprecated
    public long A04;
    public long A05;
    public long A06;
    public android.net.Uri A07;
    public Handler A08;
    public C2A4 A09;
    public C4W5 A0A;
    public C4XX A0B;
    public C92124As A0C;
    public InterfaceC92354Bq A0D;
    public C98004af A0E;
    public IOException A0F;
    public boolean A0G;
    public boolean A0H;
    public long A0I = 0;
    public long A0J = 0;
    public android.net.Uri A0K;
    public C2BC A0L;
    public final C4X9 A0M;
    public final C4V3 A0N;
    public final C4W2 A0O;
    public final C4XX A0P;
    public final RunnableC71553Ww2 A0Q;
    public final C4XO A0R;
    public final Object A0S;
    public final Runnable A0T;
    public final Runnable A0U;
    public final boolean A0V;
    public final SparseArray A0W;
    public final InterfaceC92404Bv A0X;
    public final C4XB A0Y;
    public final C4XR A0Z;
    public final C4XQ A0a;
    public final C4XZ A0b;
    public final C4XD A0c;
    public final C68704Vag A0d;
    public final InterfaceC96914Xb A0e;
    public final InterfaceC96424Va A0f;
    public final InterfaceC96934Xd A0g;
    public final InterfaceC92094Ap A0h;
    public final boolean A0i;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        if (A08(r23) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0150, code lost:
    
        if (r0 != (-9223372036854775807L)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0183, code lost:
    
        if (r0 != (-9223372036854775807L)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a2, code lost:
    
        if (r6 != (-9223372036854775807L)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C4XU r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4XU.A06(X.4XU, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A07(X.C4BI r5) {
        /*
            r4 = 0
            r3 = 0
        L2:
            java.util.List r1 = r5.A03
            int r0 = r1.size()
            if (r3 >= r0) goto L1c
            java.lang.Object r0 = r1.get(r3)
            X.4BF r0 = (X.C4BF) r0
            int r2 = r0.A01
            r1 = 1
            if (r2 == r1) goto L1b
            r0 = 2
            if (r2 == r0) goto L1b
            int r3 = r3 + 1
            goto L2
        L1b:
            return r1
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4XU.A07(X.4BI):boolean");
    }

    public static boolean A08(C4BI c4bi) {
        int i = 0;
        while (true) {
            List list = c4bi.A03;
            if (i >= list.size()) {
                return false;
            }
            InterfaceC97364Yw A00 = ((C4BB) ((C4BF) list.get(i)).A07.get(0)).A00();
            if (A00 == null || A00.isExplicit()) {
                break;
            }
            i++;
        }
        return true;
    }

    @Override // X.C4XV
    public final void A0B() {
        C92124As c92124As;
        this.A0H = false;
        this.A0D = null;
        C98004af c98004af = this.A0E;
        if (c98004af != null) {
            c98004af.A03(null);
            this.A0E = null;
        }
        this.A06 = 0L;
        this.A05 = 0L;
        if (this.A0i) {
            c92124As = this.A0C;
        } else {
            c92124As = null;
        }
        this.A0C = c92124As;
        this.A07 = this.A0K;
        this.A0F = null;
        Handler handler = this.A08;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A08 = null;
        }
        this.A02 = -9223372036854775807L;
        this.A01 = 0;
        this.A03 = -9223372036854775807L;
        this.A00 = 0;
        this.A0W.clear();
        C4XZ c4xz = this.A0b;
        c4xz.A01.clear();
        c4xz.A00.clear();
        c4xz.A02.clear();
        this.A0Z.release();
    }

    static {
        C460829s.A00("goog.exo.dash");
    }

    public static void A00(C4XU c4xu) {
        long j = c4xu.A0C.A0A;
        if (j == 0) {
            j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        }
        long max = Math.max(0L, (c4xu.A06 + j) - SystemClock.elapsedRealtime());
        RunnableC71553Ww2 runnableC71553Ww2 = c4xu.A0Q;
        runnableC71553Ww2.A00 = AbstractC111324zv.A00(1246);
        c4xu.A08.postDelayed(runnableC71553Ww2, max);
    }

    public static void A01(C4XU c4xu, long j) {
        c4xu.A02 = j;
        if (c4xu.A0N.A0U) {
            A06(c4xu, true);
        } else {
            A05(c4xu, true);
        }
    }

    public static void A02(C4XU c4xu, C4YW c4yw, WcC wcC, int i) {
        C98004af c98004af = c4xu.A0E;
        if (c98004af.A00 == null) {
            c98004af.A00 = c4xu.A09;
        }
        c98004af.A02(c4yw, wcC, i);
        boolean z = c4xu.A0V;
        C4XX c4xx = c4xu.A0P;
        C98264b5 c98264b5 = new C98264b5(wcC.A02);
        int i2 = wcC.A00;
        if (z) {
            c4xx.A02(null, c98264b5, null, i2, -1, 0, 0, -9223372036854775807L, -9223372036854775807L);
        } else {
            c4xx.A04(null, c98264b5, null, i2, -1, 0, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public static void A03(C4XU c4xu, IOException iOException) {
        android.util.Log.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        if (c4xu.A0N.A0U) {
            A06(c4xu, true);
        } else {
            A05(c4xu, true);
        }
    }

    public static void A04(C4XU c4xu, String str) {
        long j;
        android.net.Uri uri;
        c4xu.A08.removeCallbacks(c4xu.A0Q);
        boolean z = false;
        if (c4xu.A0E.A01 != null) {
            z = true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("already_loading", Boolean.valueOf(z));
        hashMap.put("reason", str);
        boolean z2 = false;
        if (str.compareTo(AbstractC111324zv.A00(1246)) == 0) {
            z2 = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = c4xu.A0I;
        long j3 = 0;
        if (j2 == 0) {
            j = 0;
        } else {
            j = elapsedRealtime - j2;
        }
        long j4 = c4xu.A0J;
        if (j4 != 0) {
            j3 = elapsedRealtime - j4;
        }
        if (z2) {
            c4xu.A0I = elapsedRealtime;
        } else {
            c4xu.A0J = elapsedRealtime;
        }
        hashMap.put("since_last_scheduled_ms", Long.valueOf(j));
        hashMap.put("since_last_unscheduled_ms", Long.valueOf(j3));
        C98004af c98004af = c4xu.A0E;
        if (c98004af.A02 == null) {
            if (c98004af.A01 != null) {
                c4xu.A0H = true;
                return;
            }
            synchronized (c4xu.A0S) {
                uri = c4xu.A07;
            }
            c4xu.A0H = false;
            Map emptyMap = Collections.emptyMap();
            C4C6 c4c6 = new C4C6(C4C4.A02, new C4C2(), "", null, null, null, "", c4xu.A0Y.A00, null, null, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, false, false, false, false);
            C4B8.A02(uri);
            WcC wcC = new WcC(c4xu.A0D, new C4C7(uri, c4c6, null, emptyMap, null, 1, 1, 0L, 0L, -1L), c4xu.A0h, 4);
            WcB wcB = new WcB(c4xu.A0d.A00);
            int i = ((C4XN) c4xu.A0R).A00;
            if (i == -1) {
                i = 3;
            }
            A02(c4xu, wcB, wcC, i);
        }
    }

    @Deprecated
    public static void A05(C4XU c4xu, boolean z) {
        boolean z2;
        C4W5 c4w5;
        long currentTimeMillis;
        int i = 0;
        while (true) {
            SparseArray sparseArray = c4xu.A0W;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            int i2 = c4xu.A00;
            if (keyAt >= i2) {
                ((C4YP) sparseArray.valueAt(i)).A01(c4xu.A0C, keyAt - i2);
            }
            i++;
        }
        int size = c4xu.A0C.A0Q.size() - 1;
        C4BI A02 = c4xu.A0C.A02(size);
        long A00 = c4xu.A0C.A00(size);
        long A06 = Util.A06(c4xu.A02);
        UUID uuid = C4YL.A04;
        long A07 = Util.A07(A06);
        C4BI A022 = c4xu.A0C.A02(0);
        long A002 = c4xu.A0C.A00(0);
        boolean A072 = A07(A022);
        long j = 0;
        int i3 = 0;
        while (true) {
            List list = A022.A03;
            if (i3 >= list.size()) {
                break;
            }
            C4BF c4bf = (C4BF) list.get(i3);
            List list2 = c4bf.A07;
            if ((!A072 || c4bf.A01 != 3) && !list2.isEmpty()) {
                InterfaceC97364Yw A003 = ((C4BB) list2.get(0)).A00();
                if (A003 == null || A003.AeO(A002, A07) == 0) {
                    break;
                } else {
                    j = Math.max(j, A003.C8V(A003.B6Y(A002, A07)));
                }
            }
            i3++;
        }
        j = 0;
        boolean A073 = A07(A02);
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (true) {
            List list3 = A02.A03;
            if (i4 < list3.size()) {
                C4BF c4bf2 = (C4BF) list3.get(i4);
                List list4 = c4bf2.A07;
                if ((!A073 || c4bf2.A01 != 3) && !list4.isEmpty()) {
                    InterfaceC97364Yw A004 = ((C4BB) list4.get(0)).A00();
                    if (A004 == null) {
                        break;
                    }
                    long AeO = A004.AeO(A00, A07);
                    if (AeO == 0) {
                        A00 = 0;
                        break;
                    } else {
                        long B6Y = (A004.B6Y(A00, A07) + AeO) - 1;
                        j2 = Math.min(j2, A004.C8V(B6Y) + A004.Azu(B6Y, A00));
                    }
                }
                i4++;
            } else {
                A00 = j2;
                break;
            }
        }
        long j3 = 0;
        if (c4xu.A0C.A0R && !A08(A02)) {
            long j4 = c4xu.A02;
            if (j4 != 0) {
                currentTimeMillis = SystemClock.elapsedRealtime() + j4;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long A074 = Util.A07(currentTimeMillis);
            C92124As c92124As = c4xu.A0C;
            A00 = Math.min((A074 - Util.A07(c92124As.A04)) - Util.A07(c92124As.A02(size).A00), A00);
            long j5 = c4xu.A0C.A0E;
            if (j5 != -9223372036854775807L) {
                long A075 = A00 - Util.A07(j5);
                while (A075 < 0 && size > 0) {
                    size--;
                    A075 += c4xu.A0C.A00(size);
                }
                if (size == 0) {
                    j = Math.max(j, A075);
                } else {
                    j = c4xu.A0C.A00(0);
                }
            }
            z2 = true;
        } else {
            z2 = false;
        }
        long j6 = A00 - j;
        for (int i5 = 0; i5 < c4xu.A0C.A0Q.size() - 1; i5++) {
            j6 += c4xu.A0C.A00(i5);
        }
        C92124As c92124As2 = c4xu.A0C;
        if (c92124As2.A0R) {
            long j7 = c4xu.A04;
            if (j7 == -1) {
                j7 = c92124As2.A0D;
                if (j7 == -9223372036854775807L) {
                    j7 = 30000;
                }
            }
            j3 = j6 - Util.A07(j7);
            if (j3 < 5000000) {
                j3 = Math.min(5000000L, j6 / 2);
            }
        }
        long A08 = c92124As2.A04 + c92124As2.A02(0).A00 + Util.A08(j);
        C92124As c92124As3 = c4xu.A0C;
        long j8 = c92124As3.A04;
        long j9 = c4xu.A02;
        int i6 = c4xu.A00;
        C4W2 c4w2 = c4xu.A0O;
        if (c92124As3.A0R) {
            c4w5 = c4xu.A0A;
        } else {
            c4w5 = null;
        }
        c4xu.A0A(new C96804Wp(c4w5, c4w2, c92124As3, i6, j8, A08, j9, j, j6, j3));
        if (!c4xu.A0i) {
            Handler handler = c4xu.A08;
            Runnable runnable = c4xu.A0U;
            handler.removeCallbacks(runnable);
            if (z2) {
                c4xu.A08.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
            if (c4xu.A0H) {
                A04(c4xu, "process_manifest");
                return;
            }
            if (!z) {
                return;
            }
            C92124As c92124As4 = c4xu.A0C;
            if (!c92124As4.A0R || c92124As4.A0A == -9223372036854775807L) {
                return;
            }
            A00(c4xu);
        }
    }

    @Override // X.C4XV
    public final void A0C(C2BC c2bc) {
        C4V3 c4v3;
        this.A0L = c2bc;
        C4XR c4xr = this.A0Z;
        c4xr.E5P();
        Looper myLooper = Looper.myLooper();
        C4WZ c4wz = super.A00;
        C4B8.A01(c4wz);
        c4xr.Eb4(myLooper, c4wz);
        if (this.A0i) {
            c4v3 = this.A0N;
        } else {
            this.A0D = this.A0f.ALy();
            c4v3 = this.A0N;
            this.A0E = new C98004af("Loader:DashMediaSource");
            Looper myLooper2 = Looper.myLooper();
            C4B8.A01(myLooper2);
            this.A08 = new Handler(myLooper2, null);
            if (!c4v3.A0O) {
                A04(this, "prepare_source_internal");
            }
            if (this.A0C == null) {
                return;
            }
        }
        if (c4v3.A0U) {
            A06(this, false);
        } else {
            A05(this, false);
        }
    }

    public final void A0D(WcC wcC) {
        C4C7 c4c7 = wcC.A02;
        C98254b4 c98254b4 = wcC.A03;
        this.A0P.A03(null, new C98264b5(c98254b4.A01, c4c7, c98254b4.A02), null, wcC.A00, -1, 0, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // X.C4XW
    public final C4Z0 AMl(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j) {
        int intValue = ((Number) c4wx.A04).intValue() - this.A00;
        C4XX c4xx = new C4XX(c4wx, super.A04.A02, 0, this.A0C.A02(intValue).A00);
        C4XY c4xy = new C4XY(c4wx, super.A03.A02, 0);
        int i = intValue + this.A00;
        C92124As c92124As = this.A0C;
        C4XZ c4xz = this.A0b;
        C4XD c4xd = this.A0c;
        C2BC c2bc = this.A0L;
        C4XR c4xr = this.A0Z;
        C4XO c4xo = this.A0R;
        long j2 = this.A02;
        InterfaceC96934Xd interfaceC96934Xd = this.A0g;
        C4XQ c4xq = this.A0a;
        InterfaceC96914Xb interfaceC96914Xb = this.A0e;
        C4WZ c4wz = super.A00;
        C4B8.A01(c4wz);
        C4YP c4yp = new C4YP(this.A0N, c4wz, c4xy, c4xr, c4xq, c4xx, c4xz, c4xd, interfaceC96914Xb, c92124As, interfaceC96344Us, c4xo, interfaceC96934Xd, c2bc, i, intValue, j2);
        this.A0W.put(c4yp.A07, c4yp);
        return c4yp;
    }

    @Override // X.C4XW
    public final C4W2 BRA() {
        return this.A0O;
    }

    @Override // X.C4XW
    public final void Cp0() {
        this.A0g.Coy();
    }

    @Override // X.C4XW
    public final void EEP(C4Z0 c4z0) {
        C4YP c4yp = (C4YP) c4z0;
        C4YR c4yr = c4yp.A0H;
        c4yr.A03 = true;
        c4yr.A04.removeCallbacksAndMessages(null);
        for (C4YV c4yv : c4yp.A04) {
            c4yv.A07 = c4yp;
            c4yv.A0I.A08();
            for (C98044aj c98044aj : c4yv.A0U) {
                c98044aj.A08();
            }
            c4yv.A0M.A03(c4yv);
        }
        c4yp.A01 = null;
        this.A0W.remove(c4yp.A07);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.4Xd, java.lang.Object] */
    public C4XU(C4X9 c4x9, C2A4 c2a4, InterfaceC92404Bv interfaceC92404Bv, C4V3 c4v3, C4XB c4xb, C4W2 c4w2, C4XR c4xr, C4XQ c4xq, C4XD c4xd, C92124As c92124As, InterfaceC96424Va interfaceC96424Va, C4XO c4xo, InterfaceC92094Ap interfaceC92094Ap, long j) {
        boolean z = false;
        this.A0O = c4w2;
        this.A0A = c4w2.A02;
        C4W1 c4w1 = c4w2.A03;
        c4w1.getClass();
        android.net.Uri uri = c4w1.A00;
        this.A07 = uri;
        this.A0K = uri;
        this.A0C = c92124As;
        this.A0f = interfaceC96424Va;
        this.A0h = interfaceC92094Ap;
        this.A0c = c4xd;
        this.A0Z = c4xr;
        this.A0R = c4xo;
        this.A04 = j;
        this.A0a = c4xq;
        this.A0N = c4v3;
        this.A0M = c4x9;
        this.A0X = interfaceC92404Bv;
        this.A0Y = c4xb;
        this.A0b = new C4XZ();
        if (c92124As != null && !c92124As.A0R) {
            z = true;
        }
        this.A0i = z;
        this.A0P = A09(null);
        this.A0S = new Object();
        this.A0W = new SparseArray();
        this.A09 = c2a4;
        this.A0e = new C96904Xa(this);
        this.A03 = -9223372036854775807L;
        this.A02 = -9223372036854775807L;
        C2C5.A02(C2C1.A10);
        this.A0V = C2C5.A02(C2C1.A0l);
        if (z) {
            C4B8.A04(!c92124As.A0R);
            this.A0g = new Object();
            return;
        }
        this.A0d = new C68704Vag(this);
        this.A0g = new WcD(this);
        this.A0Q = new RunnableC71553Ww2(this);
        this.A0U = new RunnableC71463WuP(c4v3, this);
        this.A0T = new RunnableC71293WrN(this);
    }
}
