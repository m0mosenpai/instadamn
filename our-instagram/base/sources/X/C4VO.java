package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4VO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VO extends C4VP implements C4VR {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C4Y3 A07;
    public C4W6 A08;
    public C4W6 A09;
    public C4W6 A0A;
    public C4WW A0B;
    public C4TU A0C;
    public C4WN A0D;
    public C4TT A0E;
    public C4UX A0F;
    public C4WP A0G;
    public C96784Wn A0H;
    public C4U9 A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public C4XW A0N;
    public final Handler A0O;
    public final Handler A0P;
    public final Looper A0Q;
    public final C96654Wa A0R;
    public final C4WN A0S;
    public final C4VQ A0T;
    public final C4WJ A0U;
    public final C4W8 A0V;
    public final C4VC A0W;
    public final C4WI A0X;
    public final C2A7 A0Y;
    public final C4UP A0Z;
    public final CopyOnWriteArraySet A0a;
    public final CopyOnWriteArraySet A0b;
    public final InterfaceC96054To[] A0c;

    @Override // X.C4VR
    public final void A9N(C4XW c4xw) {
    }

    @Override // X.C4VR
    public final void E5T(C4XW c4xw, boolean z, boolean z2) {
        this.A07 = null;
        this.A0N = c4xw;
        C4WW A00 = A00(2, false, z2);
        this.A0J = true;
        this.A02++;
        C96764Wl c96764Wl = (C96764Wl) this.A0R.A0g;
        C96834Wt A002 = C96764Wl.A00();
        A002.A00 = c96764Wl.A00.obtainMessage(0, 0, z2 ? 1 : 0, c4xw);
        A002.A01 = c96764Wl;
        A002.A01();
        A02(this, A00, 4, 1, false, false);
    }

    @Override // X.C4VQ
    public final void EMj(long j) {
        this.A0K = true;
        this.A02++;
        this.A05 = j;
        C96654Wa c96654Wa = this.A0R;
        C4WX c4wx = this.A0B.A05;
        UUID uuid = C4YL.A04;
        c96654Wa.A0g.Ctn(new C123395iE(c4wx, Util.A07(j)), 17).A01();
        Iterator it = this.A0b.iterator();
        while (it.hasNext()) {
            ((C4W9) it.next()).DZn(1);
        }
    }

    @Override // X.C4VR
    public final void EVC(boolean z) {
    }

    @Override // X.C4VR
    public final void EZc(String str) {
        this.A0R.A0g.Ctn(null, 19).A01();
    }

    @Override // X.C4VQ
    public final void Eax(boolean z) {
        if (this.A0L != z) {
            this.A0L = z;
            this.A03++;
            this.A0R.A0g.Ctm(1, z ? 1 : 0, 0).A01();
            C4WW c4ww = this.A0B;
            if (!z) {
                this.A0M = z;
                Iterator it = this.A0b.iterator();
                while (it.hasNext()) {
                    C4W9 c4w9 = (C4W9) it.next();
                    if (c4w9 instanceof C96854Wv) {
                        C96854Wv c96854Wv = (C96854Wv) c4w9;
                        int i = c4ww.A00;
                        if (i == 3) {
                            C4TS c4ts = c96854Wv.A06;
                            if (c4ts.A02 != null) {
                                C4TS.A03(c4ts);
                            }
                        }
                        Iterator it2 = c96854Wv.A06.A0R.iterator();
                        while (it2.hasNext()) {
                            ((C96844Wu) it2.next()).A00(i, false);
                        }
                    } else {
                        c4w9.DZJ(z, c4ww.A00);
                    }
                }
            }
        }
    }

    @Override // X.C4VQ
    public final void stop(boolean z) {
        this.A07 = null;
        this.A0N = null;
        C4WW A00 = A00(1, true, true);
        this.A02++;
        this.A0R.A0g.Ctm(6, 1, 0).A01();
        A02(this, A00, 4, 1, false, false);
        this.A0G = new C4WP(C16930sl.A00);
    }

    private C4WW A00(int i, boolean z, boolean z2) {
        int A06;
        long Au9;
        Timeline timeline;
        C4WU c4wu;
        C4WI c4wi;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            Au9 = 0;
            this.A06 = 0L;
        } else {
            this.A01 = Av8();
            if (A03()) {
                A06 = this.A00;
            } else {
                C4WW c4ww = this.A0B;
                A06 = c4ww.A03.A06(c4ww.A05.A04);
            }
            this.A00 = A06;
            this.A06 = Auh();
            Au9 = Au9();
        }
        this.A05 = Au9;
        if (z2) {
            timeline = Timeline.A00;
        } else {
            timeline = this.A0B.A03;
        }
        C4WW c4ww2 = this.A0B;
        C4WX c4wx = c4ww2.A05;
        long j = c4ww2.A02;
        long j2 = c4ww2.A01;
        if (z2) {
            c4wu = C4WU.A03;
            c4wi = this.A0X;
        } else {
            c4wu = c4ww2.A06;
            c4wi = c4ww2.A07;
        }
        return new C4WW(timeline, c4wx, c4wx, c4wu, c4wi, C05F.A00, i, j, j2, j, 0L, j, false, false);
    }

    public static void A02(C4VO c4vo, C4WW c4ww, int i, int i2, boolean z, boolean z2) {
        C4WW c4ww2 = c4vo.A0B;
        boolean z3 = true;
        boolean z4 = false;
        if (c4ww2.A03 != c4ww.A03) {
            z4 = true;
        }
        boolean z5 = false;
        if (c4ww2.A00 != c4ww.A00) {
            z5 = true;
        }
        boolean z6 = false;
        if (c4ww2.A0A != c4ww.A0A) {
            z6 = true;
        }
        if (c4ww2.A07 == c4ww.A07) {
            z3 = false;
        }
        c4vo.A0B = c4ww;
        if (z4 || i2 == 0) {
            Iterator it = c4vo.A0b.iterator();
            while (it.hasNext()) {
                C4YJ.A00((C4W9) it.next(), c4vo.A0B.A03, i2);
            }
        }
        if (z) {
            Iterator it2 = c4vo.A0b.iterator();
            while (it2.hasNext()) {
                ((C4W9) it2.next()).DZn(i);
            }
        }
        if (z3) {
            C4VC c4vc = c4vo.A0W;
            ((C4VB) c4vc).A00 = (C97214Yg) c4vo.A0B.A07.A02;
            Iterator it3 = c4vo.A0b.iterator();
            while (it3.hasNext()) {
                ((C4W9) it3.next()).Dus(c4vo.A0B.A07.A01);
            }
        }
        if (z6) {
            Iterator it4 = c4vo.A0b.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        if (z5) {
            Iterator it5 = c4vo.A0b.iterator();
            while (it5.hasNext()) {
                ((C4W9) it5.next()).DZJ(c4vo.A0M, c4vo.A0B.A00);
            }
        }
        if (z2) {
            Iterator it6 = c4vo.A0b.iterator();
            while (it6.hasNext()) {
                it6.next();
            }
        }
    }

    private boolean A03() {
        if (this.A0B.A03.A02() != 0 && this.A02 <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C4VQ
    public final void A94(C4W9 c4w9) {
        this.A0b.add(c4w9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C4VQ
    public final SparseArray Ab1() {
        int A00;
        C98044aj c98044aj;
        C4YN c4yn = this.A0R.A0b.A05;
        SparseArray sparseArray = new SparseArray();
        if (c4yn != null) {
            for (InterfaceC97394Yz interfaceC97394Yz : c4yn.A0B) {
                if (interfaceC97394Yz instanceof C4YV) {
                    C4YV c4yv = (C4YV) interfaceC97394Yz;
                    A00 = c4yv.A0F;
                    c98044aj = c4yv.A0I;
                } else if (interfaceC97394Yz instanceof C4Z8) {
                    C65772Ttn c65772Ttn = (C65772Ttn) ((C4Z8) interfaceC97394Yz);
                    C65771Ttm c65771Ttm = c65772Ttn.A01;
                    Map map = C65771Ttm.A0e;
                    C4WU c4wu = c65771Ttm.A07.A00;
                    int i = c65772Ttn.A00;
                    A00 = C2IH.A00(((C4WV) c4wu.A02.get(i)).A04[0].A0W);
                    c98044aj = c65771Ttm.A0H[i];
                }
                sparseArray.put(A00, Long.valueOf(c98044aj.A05()));
            }
        }
        return sparseArray;
    }

    @Override // X.C4VQ
    public final long Aig() {
        long j = this.A0B.A0B;
        UUID uuid = C4YL.A04;
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final long Aih() {
        long j = this.A0B.A0D;
        UUID uuid = C4YL.A04;
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final Timeline Aux() {
        return this.A0B.A03;
    }

    @Override // X.C4VR
    public final C4WU Av0() {
        return this.A0B.A06;
    }

    @Override // X.C4VR
    public final C97324Yr Av1() {
        return new C97324Yr(this.A0B.A07.A04);
    }

    @Override // X.C4VQ
    public final long Azf() {
        long j;
        C4WW c4ww = this.A0B;
        Timeline timeline = c4ww.A03;
        if (timeline.A02() == 0) {
            return -9223372036854775807L;
        }
        if (CaX()) {
            C4WX c4wx = c4ww.A05;
            Object obj = c4wx.A04;
            C4WJ c4wj = this.A0U;
            timeline.A0B(c4wj, obj);
            j = c4wj.A01(c4wx.A00, c4wx.A01);
            UUID uuid = C4YL.A04;
        } else {
            j = timeline.A0E(super.A00, Av8(), 0L).A03;
        }
        return Util.A08(j);
    }

    @Override // X.C4VR
    public final HandlerThread BJ6() {
        return this.A0R.A0X;
    }

    @Override // X.C4VQ
    public final boolean BJb() {
        return this.A0B.A09;
    }

    @Override // X.C4VQ
    public final boolean Bdn() {
        return this.A0L;
    }

    @Override // X.C4VQ
    public final int Bdy() {
        return this.A0B.A00;
    }

    @Override // X.C4VQ
    public final long BmC() {
        return this.A0R.A0h.Beg() / 1000;
    }

    @Override // X.C4VQ
    public final int Bmw() {
        return this.A04;
    }

    @Override // X.C4VQ
    public final boolean BxA() {
        return false;
    }

    @Override // X.C4VQ
    public final Integer Bzh() {
        return this.A0B.A08;
    }

    @Override // X.C4VQ
    public final void E52(long j) {
        long j2 = -1;
        C96654Wa c96654Wa = this.A0R;
        if (j != -1) {
            UUID uuid = C4YL.A04;
            j2 = Util.A07(j);
        }
        c96654Wa.A0g.Ctn(Long.valueOf(j2), 16).A01();
    }

    @Override // X.C4VQ
    public final void E5P() {
        throw new RuntimeException();
    }

    @Override // X.C4VQ
    public final void EEv() {
        this.A0b.clear();
    }

    @Override // X.C4VR
    public final void EKu() {
        C4XW c4xw = this.A0N;
        if (c4xw != null && this.A0B.A00 == 1) {
            E5T(c4xw, false, false);
        }
    }

    @Override // X.C4VQ
    public final void Eaz(C4TU c4tu) {
        this.A0R.A0g.Ctn(c4tu, 4).A01();
    }

    @Override // X.C4VQ
    public final void EcR(long j) {
        this.A0R.A0h.A02(j * 1000);
    }

    @Override // X.C4VQ
    public final void Ece(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            this.A0R.A0g.Ctm(12, i, 0).A01();
            Iterator it = this.A0b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // X.C4VR
    public final void EdL(C4TT c4tt) {
        if (c4tt == null) {
            c4tt = C4TT.A03;
        }
        this.A0R.A0g.Ctn(c4tt, 5).A01();
        this.A0E = c4tt;
    }

    @Override // X.C4VR
    public final void Egp(List list) {
        for (InterfaceC96054To interfaceC96054To : this.A0c) {
            if (((AbstractC96044Tn) interfaceC96054To).A0B == 2) {
                C96814Wq A01 = A01(interfaceC96054To);
                A01.A01(13);
                A01.A02(list);
                A01.A00();
            }
        }
    }

    @Override // X.C4VQ
    public final void release() {
        synchronized (C460829s.class) {
        }
        this.A0N = null;
        C96654Wa c96654Wa = this.A0R;
        synchronized (c96654Wa) {
            if (!c96654Wa.A0P) {
                ((C96764Wl) c96654Wa.A0g).A00.sendEmptyMessage(7);
                boolean z = false;
                while (!c96654Wa.A0P) {
                    try {
                        c96654Wa.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.A0O.removeCallbacksAndMessages(null);
        this.A0B = A00(1, false, false);
        this.A0G = C4WP.A01;
    }

    public C4VO(C4VN c4vn, C2A7 c2a7, InterfaceC216113n interfaceC216113n, InterfaceC216113n interfaceC216113n2, InterfaceC216113n interfaceC216113n3, InterfaceC216113n interfaceC216113n4) {
        final Looper mainLooper;
        InterfaceC96054To[] AN1 = ((C4VJ) interfaceC216113n3.get()).AN1(null, null, null, null, null, null);
        C4VC c4vc = (C4VC) interfaceC216113n4.get();
        InterfaceC96374Uv interfaceC96374Uv = (InterfaceC96374Uv) interfaceC216113n2.get();
        C2B5 c2b5 = (C2B5) interfaceC216113n.get();
        boolean z = c4vn.A07;
        boolean z2 = c4vn.A04;
        boolean z3 = c4vn.A02;
        long j = c4vn.A01;
        int i = c4vn.A00;
        boolean z4 = c4vn.A05;
        boolean z5 = c4vn.A06;
        boolean z6 = c4vn.A03;
        C4UP c4up = new C4UP();
        this.A0Z = c4up;
        try {
            int length = AN1.length;
            C4B8.A04(length > 0);
            this.A0c = AN1;
            c4vc.getClass();
            this.A0W = c4vc;
            this.A0L = false;
            this.A04 = 0;
            C4W6 c4w6 = C4W6.A0V;
            this.A08 = c4w6;
            this.A09 = c4w6;
            this.A0A = c4w6;
            this.A0F = C4UX.A02;
            this.A0b = new CopyOnWriteArraySet();
            this.A0V = C4W8.A00;
            this.A0E = C4TT.A03;
            C4WI c4wi = new C4WI(C4WG.A01, null, new C4WD[length], new C4WE[length]);
            this.A0X = c4wi;
            this.A0U = new C4WJ();
            C4WM c4wm = new C4WM();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            int i2 = 0;
            do {
                c4wm.A01(iArr[i2]);
                i2++;
            } while (i2 < 21);
            c4wm.A01(29);
            C4WN c4wn = C4WN.A01;
            C4WN c4wn2 = new C4WN(c4wm.A00());
            this.A0S = c4wn2;
            C4WM c4wm2 = new C4WM();
            c4wm2.A02(c4wn2.A00);
            c4wm2.A01(4);
            c4wm2.A01(10);
            this.A0D = new C4WN(c4wm2.A00());
            this.A0G = C4WP.A01;
            this.A0C = C4TU.A03;
            this.A0Q = Looper.myLooper();
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            Handler handler = new Handler(mainLooper) { // from class: X.4WR
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C4VO c4vo = this;
                    int i3 = message.what;
                    boolean z7 = true;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 == 5) {
                                            Iterator it = c4vo.A0b.iterator();
                                            while (it.hasNext()) {
                                                ((C4W9) it.next()).DwG((String) message.obj);
                                            }
                                            return;
                                        }
                                        throw new IllegalStateException();
                                    }
                                    Iterator it2 = c4vo.A0b.iterator();
                                    while (it2.hasNext()) {
                                        it2.next();
                                    }
                                    return;
                                }
                                int i4 = c4vo.A03 - 1;
                                c4vo.A03 = i4;
                                if (i4 == 0) {
                                    c4vo.A0M = ((Boolean) message.obj).booleanValue();
                                    Iterator it3 = c4vo.A0b.iterator();
                                    while (it3.hasNext()) {
                                        C4W9 c4w9 = (C4W9) it3.next();
                                        boolean z8 = c4vo.A0M;
                                        if (z8) {
                                            c4w9.DZJ(z8, c4vo.A0B.A00);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            C4Y3 c4y3 = (C4Y3) message.obj;
                            c4vo.A07 = c4y3;
                            Iterator it4 = c4vo.A0b.iterator();
                            while (it4.hasNext()) {
                                ((C4W9) it4.next()).DZG(c4y3);
                            }
                            return;
                        }
                        C4TU c4tu = (C4TU) message.obj;
                        if (!c4vo.A0C.equals(c4tu)) {
                            c4vo.A0C = c4tu;
                            Iterator it5 = c4vo.A0b.iterator();
                            while (it5.hasNext()) {
                                ((C4W9) it5.next()).DZ4(c4tu);
                            }
                            return;
                        }
                        return;
                    }
                    C4WW c4ww = (C4WW) message.obj;
                    int i5 = message.arg1;
                    int i6 = message.arg2;
                    if (i6 == -1) {
                        z7 = false;
                    }
                    int i7 = c4vo.A02 - i5;
                    c4vo.A02 = i7;
                    if (i7 == 0) {
                        if (c4ww.A02 == -9223372036854775807L) {
                            c4ww = c4ww.A01(c4ww.A05, 0L, c4ww.A01, c4ww.A0D);
                        }
                        boolean z9 = false;
                        if (c4vo.A0B.A03.A02() == 0) {
                            z9 = true;
                        }
                        if ((!z9 || c4vo.A0J) && c4ww.A03.A02() == 0) {
                            c4vo.A00 = 0;
                            c4vo.A01 = 0;
                            c4vo.A06 = 0L;
                            c4vo.A05 = 0L;
                        }
                        int i8 = 2;
                        if (c4vo.A0J) {
                            i8 = 0;
                        }
                        boolean z10 = c4vo.A0K;
                        c4vo.A0J = false;
                        c4vo.A0K = false;
                        C4VO.A02(c4vo, c4ww, i6, i8, z7, z10);
                    }
                }
            };
            this.A0O = handler;
            this.A0Y = c2a7;
            this.A0T = this;
            this.A0B = new C4WW(Timeline.A00, C4WU.A03, c4wi, 0L);
            C96654Wa c96654Wa = new C96654Wa(handler, interfaceC96374Uv, C4WZ.A03, c4vc, c4wi, c2b5, c2a7, AN1, this.A04, i, j, this.A0L, z, z2, z3, z4, z5, z6);
            this.A0R = c96654Wa;
            this.A0I = C4U9.A04;
            this.A0H = C96784Wn.A02;
            this.A0P = new Handler(c96654Wa.A0X.getLooper());
            this.A0a = new CopyOnWriteArraySet();
            c4up.A02();
        } catch (Throwable th) {
            this.A0Z.A02();
            throw th;
        }
    }

    private C96814Wq A01(InterfaceC96064Tp interfaceC96064Tp) {
        int Av8 = Av8();
        C96654Wa c96654Wa = this.A0R;
        Timeline timeline = this.A0B.A03;
        if (Av8 == -1) {
            Av8 = 0;
        }
        return new C96814Wq(c96654Wa.A0X.getLooper(), c96654Wa, interfaceC96064Tp, timeline, this.A0Y, Av8);
    }

    @Override // X.C4VQ
    public final void AE7(long j) {
        A0J(Av8(), j);
    }

    @Override // X.C4VR
    public final C96814Wq AMX(InterfaceC96064Tp interfaceC96064Tp) {
        return A01(interfaceC96064Tp);
    }

    @Override // X.C4VQ
    public final long Aij() {
        long j;
        if (CaX()) {
            C4WW c4ww = this.A0B;
            if (c4ww.A04.equals(c4ww.A05)) {
                j = this.A0B.A0B;
                UUID uuid = C4YL.A04;
            } else {
                return Azf();
            }
        } else {
            if (A03()) {
                return this.A06;
            }
            C4WW c4ww2 = this.A0B;
            if (c4ww2.A04.A03 != c4ww2.A05.A03) {
                return Util.A08(c4ww2.A03.A0E(super.A00, Av8(), 0L).A03);
            }
            long j2 = c4ww2.A0B;
            C4WW c4ww3 = this.A0B;
            C4WX c4wx = c4ww3.A04;
            if (c4wx.A00 != -1) {
                c4ww3.A03.A0B(this.A0U, c4wx.A04);
                c4ww3 = this.A0B;
                c4wx = c4ww3.A04;
                j2 = 0;
            }
            Timeline timeline = c4ww3.A03;
            Object obj = c4wx.A04;
            C4WJ c4wj = this.A0U;
            timeline.A0B(c4wj, obj);
            j = j2 + c4wj.A02;
        }
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final long Au9() {
        if (A03()) {
            return this.A05;
        }
        long j = this.A0B.A0C;
        UUID uuid = C4YL.A04;
        return Util.A08(j);
    }

    @Override // X.C4VQ
    public final int Aub() {
        int Av8 = Av8();
        if (Av8 == -1) {
            return 0;
        }
        return Av8;
    }

    @Override // X.C4VQ
    public final long Auh() {
        if (A03()) {
            return this.A06;
        }
        C4WW c4ww = this.A0B;
        boolean z = false;
        if (c4ww.A05.A00 != -1) {
            z = true;
        }
        long j = c4ww.A0C;
        UUID uuid = C4YL.A04;
        if (z) {
            return Util.A08(j);
        }
        long A08 = Util.A08(j);
        C4WW c4ww2 = this.A0B;
        C4WX c4wx = c4ww2.A05;
        if (c4wx.A00 != -1) {
            return A08;
        }
        Timeline timeline = c4ww2.A03;
        Object obj = c4wx.A04;
        C4WJ c4wj = this.A0U;
        timeline.A0B(c4wj, obj);
        return A08 + Util.A08(c4wj.A02);
    }

    @Override // X.C4VQ
    public final int Av8() {
        if (A03()) {
            return this.A01;
        }
        C4WW c4ww = this.A0B;
        return c4ww.A03.A0B(this.A0U, c4ww.A05.A04).A00;
    }

    @Override // X.C4VQ
    public final boolean CaX() {
        if (!A03() && this.A0B.A05.A00 != -1) {
            return true;
        }
        return false;
    }
}
