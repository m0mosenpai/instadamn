package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.4Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96654Wa implements Handler.Callback, InterfaceC96664Wb, InterfaceC96684Wd, InterfaceC96694We, InterfaceC96704Wf, InterfaceC96714Wg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A06;
    public C123395iE A07;
    public C4ZA A08;
    public C4WW A0A;
    public InterfaceC96054To A0B;
    public C4TT A0C;
    public C4XW A0D;
    public boolean A0F;
    public boolean A0H;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public InterfaceC96054To[] A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final long A0V;
    public final Handler A0W;
    public final HandlerThread A0X;
    public final C96744Wj A0Y;
    public final C96734Wi A0Z;
    public final InterfaceC96374Uv A0a;
    public final C4WJ A0c;
    public final C96604Vv A0d;
    public final C4VC A0e;
    public final C4WI A0f;
    public final InterfaceC96774Wm A0g;
    public final C96754Wk A0h;
    public final ArrayList A0i;
    public final boolean A0j;
    public final InterfaceC96054To[] A0k;
    public final InterfaceC96074Tq[] A0l;
    public final C2B5 A0m;
    public final C2A7 A0n;
    public long A05 = -9223372036854775807L;
    public Integer A0E = C05F.A00;
    public boolean A0G = false;
    public C5PO A09 = null;
    public boolean A0I = false;
    public boolean A0Q = false;
    public final C96724Wh A0b = new C96724Wh();

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.4Wi] */
    public C96654Wa(Handler handler, InterfaceC96374Uv interfaceC96374Uv, C4WZ c4wz, C4VC c4vc, C4WI c4wi, C2B5 c2b5, C2A7 c2a7, InterfaceC96054To[] interfaceC96054ToArr, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A0k = interfaceC96054ToArr;
        this.A0e = c4vc;
        this.A0f = c4wi;
        this.A0a = interfaceC96374Uv;
        this.A0m = c2b5;
        this.A0M = z;
        this.A03 = i;
        this.A0W = handler;
        this.A0n = c2a7;
        this.A0S = z2;
        this.A0J = z3;
        this.A0F = z4;
        this.A0V = j;
        this.A00 = i2;
        this.A0L = z5;
        this.A0N = z6;
        this.A0H = z7;
        int A00 = C2C5.A00(C2C6.A02);
        this.A0T = A00 <= 0 ? 10 : A00;
        this.A0K = j > 0;
        this.A0U = interfaceC96374Uv.Aeq();
        this.A0j = interfaceC96374Uv.EKr();
        this.A0C = C4TT.A03;
        this.A0A = new C4WW(Timeline.A00, C4WU.A03, c4wi, -9223372036854775807L);
        this.A0Z = new Object();
        int length = interfaceC96054ToArr.length;
        InterfaceC96074Tq[] interfaceC96074TqArr = new InterfaceC96074Tq[length];
        this.A0l = interfaceC96074TqArr;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC96044Tn abstractC96044Tn = (AbstractC96044Tn) interfaceC96054ToArr[i3];
            abstractC96044Tn.A00 = i3;
            abstractC96044Tn.A04 = c4wz;
            interfaceC96074TqArr[i3] = abstractC96044Tn;
        }
        this.A0Y = new C96744Wj(this, c2a7);
        this.A0h = new C96754Wk(c2a7);
        this.A0i = new ArrayList();
        this.A0R = new InterfaceC96054To[0];
        this.A0d = new C96604Vv();
        this.A0c = new C4WJ();
        c4vc.A00 = this;
        c4vc.A01 = c2b5;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        AbstractC09770fa.A00(handlerThread);
        this.A0X = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        List list = C96764Wl.A01;
        this.A0g = new C96764Wl(new Handler(looper, this));
    }

    private Object A04(Timeline timeline, Timeline timeline2, Object obj) {
        int A06 = timeline.A06(obj);
        int A01 = timeline.A01();
        int i = -1;
        for (int i2 = 0; i2 < A01 && i == -1; i2++) {
            A06 = timeline.A05(this.A0c, this.A0d, A06, this.A03, this.A0Q);
            if (A06 != -1) {
                i = timeline2.A06(timeline.A0C(A06));
            } else {
                return null;
            }
        }
        if (i != -1) {
            return timeline2.A0C(i);
        }
        return null;
    }

    private void A08() {
        this.A0O = false;
        C96744Wj c96744Wj = this.A0Y;
        c96744Wj.A03 = true;
        c96744Wj.A06.A00();
        this.A0h.A00();
        for (InterfaceC96054To interfaceC96054To : this.A0R) {
            interfaceC96054To.start();
        }
    }

    private void A0B(byte b) {
        C4YN c4yn = this.A0b.A04;
        if (c4yn != null && this.A0S) {
            c4yn.A08.FBK(b, false);
        }
    }

    public static void A0H(C96814Wq c96814Wq) {
        synchronized (c96814Wq) {
        }
        try {
            c96814Wq.A08.CK0(c96814Wq.A01, c96814Wq.A04);
        } finally {
            c96814Wq.A03(true);
        }
    }

    private void A0K(boolean z) {
        C4WX c4wx = this.A0b.A05.A02.A04;
        long A01 = A01(c4wx, this.A0A.A0C, false, true);
        if (A01 != this.A0A.A0C) {
            C4WW c4ww = this.A0A;
            this.A0A = c4ww.A01(c4wx, A01, c4ww.A01, A00());
            if (z) {
                this.A0Z.A00(4);
            }
        }
    }

    private void A0M(boolean z, boolean z2) {
        A0N(true, z, z);
        this.A0Z.A01 += this.A02 + (z2 ? 1 : 0);
        this.A02 = 0;
        this.A0a.onStopped();
        A0C(1);
    }

    @Override // X.InterfaceC96714Wg
    public final synchronized void ENl(C96814Wq c96814Wq) {
        if (this.A0P) {
            android.util.Log.w("ExoPlayerImplInternal", AbstractC111324zv.A00(1662));
            c96814Wq.A03(false);
        } else {
            this.A0g.Ctn(c96814Wq, 14).A01();
        }
    }

    private long A00() {
        long j = this.A0A.A0B;
        C4YN c4yn = this.A0b.A04;
        if (c4yn == null) {
            return 0L;
        }
        return j - (this.A06 - c4yn.A00);
    }

    private Pair A02(C4ZA c4za, boolean z) {
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c4za.A02;
        boolean z2 = false;
        if (timeline.A02() == 0) {
            z2 = true;
        }
        if (!z2) {
            boolean z3 = false;
            if (timeline2.A02() == 0) {
                z3 = true;
            }
            if (z3) {
                timeline2 = timeline;
            }
            try {
                C96604Vv c96604Vv = this.A0d;
                C4WJ c4wj = this.A0c;
                Pair A09 = timeline2.A09(c4wj, c96604Vv, c4za.A00, c4za.A01);
                if (timeline != timeline2 && timeline.A06(A09.first) == -1) {
                    if (z && A04(timeline2, timeline, A09.first) != null) {
                        return timeline.A09(c4wj, c96604Vv, timeline.A0D(c4wj, -1, false).A00, -9223372036854775807L);
                    }
                } else {
                    return A09;
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new VII(timeline);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.4WX, X.4WY] */
    private C4WX A03() {
        Timeline timeline = this.A0A.A03;
        if (timeline.A02() == 0) {
            return C4WW.A0E;
        }
        return new C4WY(timeline.A0C(timeline.A0E(this.A0d, timeline.A07(this.A0Q), 0L).A00), -1, -1, -1, -1L);
    }

    private void A05() {
        C96724Wh c96724Wh = this.A0b;
        C4YN c4yn = c96724Wh.A04;
        if (c4yn.A07 && c4yn.A08.BWx() == Long.MIN_VALUE) {
            A0L(false);
            return;
        }
        long j = this.A06 - c4yn.A00;
        long Aii = c4yn.A08.Aii(j);
        if (this.A0L) {
            for (C4YN c4yn2 = c96724Wh.A05; c4yn2 != null && c4yn2 != c4yn; c4yn2 = c4yn2.A01) {
                Aii += c4yn2.A08.Aii(this.A06 - c4yn2.A00);
            }
        }
        InterfaceC96374Uv interfaceC96374Uv = this.A0a;
        float f = this.A0Y.Bdw().A01;
        boolean z = true;
        if (!this.A0M) {
            z = false;
        }
        boolean EiM = interfaceC96374Uv.EiM(f, j, Aii, z);
        A0L(EiM);
        if (!EiM) {
            return;
        }
        c4yn.A06(this.A06);
    }

    private void A06() {
        int i;
        C96734Wi c96734Wi = this.A0Z;
        C4WW c4ww = this.A0A;
        if (c4ww != c96734Wi.A02 || c96734Wi.A01 > 0 || c96734Wi.A03) {
            Handler handler = this.A0W;
            int i2 = c96734Wi.A01;
            if (c96734Wi.A03) {
                i = c96734Wi.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, c4ww).sendToTarget();
            c96734Wi.A02 = this.A0A;
            c96734Wi.A01 = 0;
            c96734Wi.A03 = false;
        }
    }

    private void A07() {
        C96724Wh c96724Wh = this.A0b;
        C4YN c4yn = c96724Wh.A04;
        C4YN c4yn2 = c96724Wh.A06;
        if (c4yn != null && !c4yn.A07) {
            if (c4yn2 == null || c4yn2.A01 == c4yn) {
                for (InterfaceC96054To interfaceC96054To : this.A0R) {
                    if (!interfaceC96054To.CLd()) {
                        return;
                    }
                }
                c4yn.A08.Coz();
            }
        }
    }

    private void A09() {
        C96744Wj c96744Wj = this.A0Y;
        c96744Wj.A03 = false;
        c96744Wj.A06.A01();
        this.A0h.A01();
        for (InterfaceC96054To interfaceC96054To : this.A0R) {
            AbstractC96044Tn abstractC96044Tn = (AbstractC96044Tn) interfaceC96054To;
            if (abstractC96044Tn.A01 == 2) {
                abstractC96044Tn.A01 = 1;
                abstractC96044Tn.A0I();
            }
        }
    }

    private void A0A() {
        C4Z9 c4z9;
        int i;
        C96724Wh c96724Wh = this.A0b;
        C4YN c4yn = c96724Wh.A05;
        if (c4yn != null) {
            long E7z = c4yn.A08.E7z();
            if (E7z != -9223372036854775807L) {
                A0D(E7z);
                if (E7z != this.A0A.A0C) {
                    C4WW c4ww = this.A0A;
                    this.A0A = c4ww.A01(c4ww.A05, E7z, c4ww.A01, A00());
                    this.A0Z.A00(4);
                }
            } else {
                C96744Wj c96744Wj = this.A0Y;
                boolean z = false;
                if (c4yn != c96724Wh.A06) {
                    z = true;
                }
                long A00 = c96744Wj.A00(z);
                this.A06 = A00;
                long j = A00 - c4yn.A00;
                long j2 = this.A0A.A0C;
                ArrayList arrayList = this.A0i;
                if (!arrayList.isEmpty()) {
                    C4WW c4ww2 = this.A0A;
                    C4WX c4wx = c4ww2.A05;
                    if (c4wx.A00 == -1) {
                        if (c4ww2.A02 == j2) {
                            j2--;
                        }
                        int A06 = c4ww2.A03.A06(c4wx.A04);
                        int i2 = this.A01;
                        while (i2 > 0) {
                            C4Z9 c4z92 = (C4Z9) arrayList.get(i2 - 1);
                            if (c4z92 == null || (c4z92.A00 <= A06 && (c4z92.A00 != A06 || c4z92.A01 <= j2))) {
                                break;
                            }
                            i2--;
                            this.A01 = i2;
                        }
                        while (i2 < arrayList.size() && (c4z9 = (C4Z9) arrayList.get(i2)) != null) {
                            if (c4z9.A02 != null && ((i = c4z9.A00) < A06 || (i == A06 && c4z9.A01 <= j2))) {
                                i2++;
                                this.A01 = i2;
                            } else {
                                while (c4z9.A02 != null && c4z9.A00 == A06) {
                                    long j3 = c4z9.A01;
                                    if (j3 <= j2 || j3 > j) {
                                        break;
                                    }
                                    A0G(c4z9.A03);
                                    int i3 = this.A01;
                                    arrayList.remove(i3);
                                    if (i3 >= arrayList.size() || (c4z9 = (C4Z9) arrayList.get(i3)) == null) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                this.A0A.A0C = j;
            }
            this.A0A.A0B = c96724Wh.A04.A00();
            this.A0A.A0D = A00();
            C4WW c4ww3 = this.A0A;
            c4ww3.A0D = c4yn.A08.Aii(c4ww3.A0C);
        }
    }

    private void A0C(int i) {
        long j;
        C4WW c4ww = this.A0A;
        if (c4ww.A00 != i) {
            Timeline timeline = c4ww.A03;
            C4WX c4wx = c4ww.A05;
            long j2 = c4ww.A02;
            long j3 = c4ww.A01;
            boolean z = c4ww.A0A;
            C4WU c4wu = c4ww.A06;
            C4WI c4wi = c4ww.A07;
            C4WW c4ww2 = new C4WW(timeline, c4wx, c4ww.A04, c4wu, c4wi, c4ww.A08, i, j2, j3, c4ww.A0B, c4ww.A0D, c4ww.A0C, z, c4ww.A09);
            C4WW.A00(c4ww, c4ww2);
            this.A0A = c4ww2;
            if (i == 2) {
                j = System.currentTimeMillis();
            } else {
                j = -1;
            }
            this.A04 = j;
        }
    }

    private void A0D(long j) {
        C4YN c4yn = this.A0b.A05;
        boolean z = false;
        if (c4yn != null) {
            z = true;
        }
        if (z) {
            j += c4yn.A00;
        }
        this.A06 = j;
        this.A0Y.A06.A02(j);
        for (InterfaceC96054To interfaceC96054To : this.A0R) {
            interfaceC96054To.EJq(this.A06);
        }
    }

    private void A0E(C123395iE c123395iE, boolean z) {
        C4WW A01;
        C4WW A012;
        C96734Wi c96734Wi = this.A0Z;
        boolean z2 = true;
        c96734Wi.A01++;
        C4WX c4wx = c123395iE.A01;
        long j = c123395iE.A00;
        boolean z3 = false;
        if (j == -9223372036854775807L) {
            z3 = true;
        }
        try {
            if (this.A0D != null && this.A02 <= 0) {
                long j2 = j;
                C96724Wh c96724Wh = this.A0b;
                C4YN c4yn = c96724Wh.A05;
                if (!z && c4yn != null && j != 0) {
                    j2 = c4yn.A08.AZz(this.A0C, j);
                }
                UUID uuid = C4YL.A04;
                if (Util.A08(j2) != Util.A08(this.A0A.A0C)) {
                    boolean z4 = false;
                    if (c96724Wh.A05 != c96724Wh.A06) {
                        z4 = true;
                    }
                    j = A01(c4wx, j2, z, z4);
                    if (j == j) {
                        z2 = false;
                    }
                    z3 |= z2;
                }
            } else {
                this.A07 = c123395iE;
                this.A08 = null;
            }
            if (!C4WW.A0E.A04.equals(c4wx.A04)) {
                A012 = this.A0A.A01(c4wx, j, j, A00());
            } else {
                C4WW c4ww = this.A0A;
                A012 = c4ww.A01(c4ww.A05, j, j, A00());
            }
            this.A0A = A012;
            if (z3) {
                c96734Wi.A00(2);
            }
        } catch (Throwable th) {
            if (!C4WW.A0E.A04.equals(c4wx.A04)) {
                A01 = this.A0A.A01(c4wx, j, j, A00());
            } else {
                C4WW c4ww2 = this.A0A;
                A01 = c4ww2.A01(c4ww2.A05, j, j, A00());
            }
            this.A0A = A01;
            if (z3) {
                c96734Wi.A00(2);
            }
            throw th;
        }
    }

    private void A0F(C4YN c4yn) {
        C4YN c4yn2 = this.A0b.A05;
        if (c4yn2 != null && c4yn != c4yn2) {
            InterfaceC96054To[] interfaceC96054ToArr = this.A0k;
            int length = interfaceC96054ToArr.length;
            boolean[] zArr = new boolean[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                InterfaceC96054To interfaceC96054To = interfaceC96054ToArr[i2];
                boolean z = false;
                if (((AbstractC96044Tn) interfaceC96054To).A01 != 0) {
                    z = true;
                }
                zArr[i2] = z;
                if (c4yn2.A04.A03[i2] != null) {
                    i++;
                }
                if (zArr[i2] && (c4yn2.A04.A03[i2] == null || (((AbstractC96044Tn) interfaceC96054To).A07 && ((AbstractC96044Tn) interfaceC96054To).A05 == c4yn.A0B[i2]))) {
                    A0I(interfaceC96054To);
                }
            }
            this.A0A = this.A0A.A02(c4yn2.A03, c4yn2.A04);
            A0O(zArr, i);
        }
    }

    private void A0G(C96814Wq c96814Wq) {
        Looper looper = c96814Wq.A03;
        InterfaceC96774Wm interfaceC96774Wm = this.A0g;
        Handler handler = ((C96764Wl) interfaceC96774Wm).A00;
        if (looper == handler.getLooper()) {
            A0H(c96814Wq);
            int i = this.A0A.A00;
            if (i == 3 || i == 2) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        interfaceC96774Wm.Ctn(c96814Wq, 15).A01();
    }

    private void A0I(InterfaceC96054To interfaceC96054To) {
        C96744Wj c96744Wj = this.A0Y;
        if (interfaceC96054To == c96744Wj.A00) {
            c96744Wj.A01 = null;
            c96744Wj.A00 = null;
            c96744Wj.A02 = true;
        }
        AbstractC96044Tn abstractC96044Tn = (AbstractC96044Tn) interfaceC96054To;
        if (abstractC96044Tn.A01 == 2) {
            abstractC96044Tn.A01 = 1;
            abstractC96044Tn.A0I();
        }
        interfaceC96054To.APM();
    }

    private void A0J(boolean z) {
        C4WX c4wx;
        C4YN c4yn = this.A0b.A04;
        if (c4yn == null) {
            c4wx = this.A0A.A05;
        } else {
            c4wx = c4yn.A02.A04;
        }
        if (!this.A0A.A04.equals(c4wx)) {
            C4WW c4ww = this.A0A;
            Timeline timeline = c4ww.A03;
            C4WX c4wx2 = c4ww.A05;
            long j = c4ww.A02;
            long j2 = c4ww.A01;
            C4WX c4wx3 = c4wx;
            this.A0A = new C4WW(timeline, c4wx2, c4wx3, c4ww.A06, c4ww.A07, c4ww.A08, c4ww.A00, j, j2, c4ww.A0B, c4ww.A0D, c4ww.A0C, c4ww.A0A, c4ww.A09);
        } else if (!z) {
            return;
        }
        if (c4yn != null && c4yn.A07) {
            this.A0a.Duu(c4yn.A03, this.A0k, c4yn.A04.A04);
        }
    }

    private void A0L(boolean z) {
        C4WW c4ww = this.A0A;
        if (c4ww.A0A != z) {
            Timeline timeline = c4ww.A03;
            C4WX c4wx = c4ww.A05;
            long j = c4ww.A02;
            long j2 = c4ww.A01;
            int i = c4ww.A00;
            C4WU c4wu = c4ww.A06;
            C4WI c4wi = c4ww.A07;
            C4WW c4ww2 = new C4WW(timeline, c4wx, c4ww.A04, c4wu, c4wi, c4ww.A08, i, j, j2, c4ww.A0B, c4ww.A0D, c4ww.A0C, z, c4ww.A09);
            C4WW.A00(c4ww, c4ww2);
            this.A0A = c4ww2;
        }
    }

    private void A0N(boolean z, boolean z2, boolean z3) {
        C4WX c4wx;
        long j;
        long j2;
        Timeline timeline;
        C4WU c4wu;
        C4WI c4wi;
        C4XW c4xw;
        ((C96764Wl) this.A0g).A00.removeMessages(2);
        this.A0O = false;
        C96744Wj c96744Wj = this.A0Y;
        c96744Wj.A03 = false;
        c96744Wj.A06.A01();
        this.A0h.A01();
        this.A06 = 0L;
        for (InterfaceC96054To interfaceC96054To : this.A0R) {
            try {
                A0I(interfaceC96054To);
            } catch (C4Y3 | RuntimeException e) {
                android.util.Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0R = new InterfaceC96054To[0];
        this.A0b.A08(!z2);
        A0L(false);
        if (z2) {
            this.A08 = null;
        }
        if (z3) {
            ArrayList arrayList = this.A0i;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C4Z9) it.next()).A03.A03(false);
            }
            arrayList.clear();
            this.A01 = 0;
        }
        if (z2) {
            c4wx = A03();
            j2 = -9223372036854775807L;
            j = -9223372036854775807L;
        } else {
            C4WW c4ww = this.A0A;
            c4wx = c4ww.A05;
            j = c4ww.A0C;
            j2 = this.A0A.A01;
        }
        if (z3) {
            timeline = Timeline.A00;
        } else {
            timeline = this.A0A.A03;
        }
        C4WW c4ww2 = this.A0A;
        int i = c4ww2.A00;
        if (z3) {
            c4wu = C4WU.A03;
            c4wi = this.A0f;
        } else {
            c4wu = c4ww2.A06;
            c4wi = c4ww2.A07;
        }
        this.A0A = new C4WW(timeline, c4wx, c4wx, c4wu, c4wi, C05F.A00, i, j, j2, j, 0L, j, false, false);
        if (z && (c4xw = this.A0D) != null) {
            c4xw.EER(this);
            this.A0D = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r28.A0A.A00 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r16 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0O(boolean[] r29, int r30) {
        /*
            r28 = this;
            r0 = r30
            X.4To[] r0 = new X.InterfaceC96054To[r0]
            r12 = r28
            r12.A0R = r0
            X.4Wh r11 = r12.A0b
            X.4YN r0 = r11.A05
            r27 = r0
            r10 = 0
            r2 = 0
        L10:
            X.4To[] r1 = r12.A0k
            int r0 = r1.length
            if (r10 >= r0) goto Lb0
            r0 = r27
            X.4WI r0 = r0.A04
            X.4WD[] r0 = r0.A03
            r0 = r0[r10]
            if (r0 == 0) goto La4
            boolean r5 = r29[r10]
            int r17 = r2 + 1
            X.4YN r13 = r11.A05
            r9 = r1[r10]
            X.4To[] r0 = r12.A0R
            r0[r2] = r9
            r8 = r9
            X.4Tn r8 = (X.AbstractC96044Tn) r8
            int r0 = r8.A01
            if (r0 != 0) goto La2
            X.4YN r0 = r11.A06
            r7 = 0
            if (r0 != r13) goto L38
            r7 = 1
        L38:
            X.4WI r2 = r13.A04
            X.4WD[] r1 = r2.A03
            r15 = r1[r10]
            X.4WE[] r1 = r2.A04
            r4 = r1[r10]
            r3 = 0
            if (r4 == 0) goto L56
            int r2 = r4.length()
        L49:
            X.4B6[] r14 = new X.C4B6[r2]
        L4b:
            if (r3 >= r2) goto L58
            X.4B6 r1 = r4.B7x(r3)
            r14[r3] = r1
            int r3 = r3 + 1
            goto L4b
        L56:
            r2 = 0
            goto L49
        L58:
            boolean r1 = r12.A0M
            if (r1 == 0) goto L65
            X.4WW r1 = r12.A0A
            int r2 = r1.A00
            r1 = 3
            r16 = 1
            if (r2 == r1) goto L67
        L65:
            r16 = 0
        L67:
            if (r5 != 0) goto L6c
            r6 = 1
            if (r16 != 0) goto L6d
        L6c:
            r6 = 0
        L6d:
            X.4Yz[] r1 = r13.A0B
            r19 = r1[r10]
            long r4 = r12.A06
            boolean r1 = r12.A0H
            if (r1 != 0) goto La8
            long r2 = r0.A00
        L79:
            long r0 = r13.A00
            r25 = r0
            r0 = 1
            r8.A03 = r15
            r8.A01 = r0
            r8.A0M(r6, r7)
            r20 = r14
            r21 = r2
            r23 = r25
            r18 = r8
            r18.EH4(r19, r20, r21, r23)
            r0 = 0
            r8.A07 = r0
            r8.A02 = r4
            r8.A0L(r4, r6)
            X.4Wj r0 = r12.A0Y
            r0.A01(r9)
            if (r16 == 0) goto La2
            r9.start()
        La2:
            r2 = r17
        La4:
            int r10 = r10 + 1
            goto L10
        La8:
            X.4YM r1 = r0.A02
            long r2 = r1.A03
            long r0 = r0.A00
            long r2 = r2 + r0
            goto L79
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96654Wa.A0O(boolean[], int):void");
    }

    private boolean A0P() {
        C4YN c4yn = this.A0b.A05;
        C4YN c4yn2 = c4yn.A01;
        long j = c4yn.A02.A00;
        if (j != -9223372036854775807L && this.A0A.A0C >= j) {
            if (c4yn2 != null) {
                if (c4yn2.A07 || c4yn2.A02.A04.A00 != -1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    private boolean A0Q(C4Z9 c4z9) {
        Object obj = c4z9.A02;
        if (obj == null) {
            C96814Wq c96814Wq = c4z9.A03;
            Timeline timeline = c96814Wq.A09;
            int i = c96814Wq.A00;
            long j = c96814Wq.A02;
            UUID uuid = C4YL.A04;
            Pair A02 = A02(new C4ZA(timeline, i, Util.A07(j)), false);
            if (A02 == null) {
                return false;
            }
            int A06 = this.A0A.A03.A06(A02.first);
            long longValue = ((Number) A02.second).longValue();
            Object obj2 = A02.first;
            c4z9.A00 = A06;
            c4z9.A01 = longValue;
            c4z9.A02 = obj2;
        } else {
            int A062 = this.A0A.A03.A06(obj);
            if (A062 == -1) {
                return false;
            }
            c4z9.A00 = A062;
        }
        return true;
    }

    public final long A0R() {
        long j;
        C4YN c4yn = this.A0b.A04;
        if (c4yn == null) {
            return 0L;
        }
        long j2 = Long.MAX_VALUE;
        for (InterfaceC97394Yz interfaceC97394Yz : c4yn.A0B) {
            if (interfaceC97394Yz instanceof C4Z8) {
                C65772Ttn c65772Ttn = (C65772Ttn) ((C4Z8) interfaceC97394Yz);
                C65771Ttm c65771Ttm = c65772Ttn.A01;
                Map map = C65771Ttm.A0e;
                C98044aj c98044aj = c65771Ttm.A0H[c65772Ttn.A00];
                synchronized (c98044aj) {
                    if (c98044aj.A02 != 0) {
                        j = c98044aj.A0N[c98044aj.A04];
                    } else {
                        j = Long.MIN_VALUE;
                    }
                }
                j2 = Math.min(j2, j);
            }
        }
        if (j2 == Long.MAX_VALUE || j2 == -9223372036854775807L) {
            return 0L;
        }
        return c4yn.A08.Aii(j2);
    }

    @Override // X.InterfaceC96674Wc
    public final /* bridge */ /* synthetic */ void D7l(C4Z1 c4z1) {
        this.A0g.Ctn(c4z1, 10).A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002c -> B:4:0x0014). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC96684Wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DZ4(X.C4TU r7) {
        /*
            r6 = this;
            android.os.Handler r1 = r6.A0W
            r0 = 1
            android.os.Message r0 = r1.obtainMessage(r0, r7)
            r0.sendToTarget()
            float r5 = r7.A01
            X.4Wh r0 = r6.A0b
            X.4YN r4 = r0.A05
            if (r4 != 0) goto L16
            X.4YN r4 = r0.A04
        L14:
            if (r4 == 0) goto L2f
        L16:
            boolean r0 = r4.A07
            if (r0 == 0) goto L2f
            X.4WI r0 = r4.A04
            X.4WE[] r3 = r0.A04
            int r2 = r3.length
            r1 = 0
        L20:
            if (r1 >= r2) goto L2c
            r0 = r3[r1]
            if (r0 == 0) goto L29
            r0.DZ8(r5)
        L29:
            int r1 = r1 + 1
            goto L20
        L2c:
            X.4YN r4 = r4.A01
            goto L14
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96654Wa.DZ4(X.4TU):void");
    }

    @Override // X.InterfaceC96664Wb
    public final void DaW(C4Z0 c4z0) {
        this.A0g.Ctn(c4z0, 9).A01();
    }

    @Override // X.InterfaceC96694We
    public final void DnO(Timeline timeline, C4XW c4xw) {
        this.A0g.Ctn(new C4Z6(timeline, c4xw), 8).A01();
    }

    @Override // X.InterfaceC96704Wf
    public final void Dum() {
        ((C96764Wl) this.A0g).A00.sendEmptyMessage(11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b5, code lost:
    
        if (r5.A01 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03a2, code lost:
    
        if (com.google.android.exoplayer2.util.Util.A08(r7) > 1000) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03b5, code lost:
    
        if (r9.CTt() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03c1, code lost:
    
        if (r9.CTt() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0483, code lost:
    
        if (A0P() != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x04d0, code lost:
    
        if (((X.AbstractC96044Tn) r1).A0B == 1) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0541, code lost:
    
        if (r7.A02.A05 == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0565, code lost:
    
        if ((r9 - r1) >= r8) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x05b7, code lost:
    
        if (((X.AbstractC96044Tn) r1).A0B != 1) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05a7, code lost:
    
        if (r25 == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0818, code lost:
    
        if (X.C96724Wh.A03(r2, r1) == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0873, code lost:
    
        if (r44.A0M != false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0b6b, code lost:
    
        if (r9.A01 == (-9223372036854775807L)) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0155, code lost:
    
        if (r9.A00 < 100) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0ce5: INVOKE (r0 I:X.4Wa), (r4 I:boolean), (r4 I:boolean) DIRECT call: X.4Wa.A0M(boolean, boolean):void A[MD:(boolean, boolean):void (m)] (LINE:3301), block:B:703:0x0cde */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0cf9: INVOKE (r0 I:X.4Wa), (r4 I:boolean), (r4 I:boolean) DIRECT call: X.4Wa.A0M(boolean, boolean):void A[MD:(boolean, boolean):void (m)] (LINE:3321), block:B:697:0x0cf2 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0d07: INVOKE (r0 I:X.4Wa), (r4 I:boolean), (r4 I:boolean) DIRECT call: X.4Wa.A0M(boolean, boolean):void A[MD:(boolean, boolean):void (m)] (LINE:3335), block:B:701:0x0d00 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0d1b: INVOKE (r0 I:X.4Wa) DIRECT call: X.4Wa.A06():void A[MD:():void (m)] (LINE:3355), block:B:698:0x0d12 */
    /* JADX WARN: Removed duplicated region for block: B:254:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0629 A[Catch: RuntimeException -> 0x0cdd, 4Y3 -> 0x0cf1, IOException -> 0x0cff, TryCatch #7 {4Y3 -> 0x0cf1, IOException -> 0x0cff, RuntimeException -> 0x0cdd, blocks: (B:3:0x0006, B:4:0x000c, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:13:0x0026, B:15:0x0047, B:17:0x004d, B:18:0x006d, B:20:0x0073, B:23:0x007e, B:25:0x0086, B:26:0x0088, B:28:0x008c, B:30:0x0093, B:33:0x0097, B:35:0x009b, B:32:0x00a0, B:40:0x00a3, B:42:0x00bb, B:43:0x0cd9, B:45:0x00ce, B:46:0x00de, B:54:0x00e8, B:55:0x00e9, B:57:0x00f1, B:59:0x00f5, B:60:0x0127, B:62:0x012f, B:63:0x0132, B:65:0x0136, B:67:0x013c, B:69:0x0142, B:71:0x0151, B:73:0x0208, B:75:0x020d, B:77:0x0213, B:79:0x0219, B:80:0x021c, B:82:0x0220, B:83:0x0223, B:86:0x0229, B:88:0x0231, B:92:0x0241, B:93:0x0244, B:97:0x024c, B:179:0x0234, B:100:0x027e, B:102:0x0284, B:104:0x0288, B:107:0x028d, B:109:0x0292, B:112:0x02a1, B:117:0x02a9, B:121:0x02ac, B:123:0x02b2, B:125:0x02b8, B:130:0x02d5, B:133:0x02df, B:135:0x02e6, B:138:0x02f2, B:140:0x02f8, B:145:0x0304, B:146:0x0308, B:148:0x030c, B:150:0x0315, B:152:0x0324, B:153:0x0327, B:156:0x0333, B:159:0x033b, B:155:0x033f, B:164:0x0342, B:166:0x0347, B:168:0x034f, B:170:0x0356, B:172:0x035c, B:174:0x0360, B:182:0x027a, B:183:0x0157, B:185:0x015d, B:187:0x0171, B:189:0x017f, B:191:0x01a7, B:193:0x01b9, B:194:0x01bb, B:196:0x01d2, B:200:0x01e1, B:202:0x01e8, B:203:0x01ea, B:204:0x01d8, B:205:0x0203, B:206:0x0194, B:207:0x019f, B:208:0x00f8, B:210:0x00fe, B:217:0x0370, B:219:0x037d, B:221:0x0381, B:223:0x0387, B:225:0x0391, B:227:0x03a4, B:228:0x03a9, B:231:0x03af, B:235:0x03bb, B:237:0x03c5, B:239:0x03cb, B:241:0x03d1, B:243:0x03d7, B:245:0x03db, B:250:0x03e3, B:251:0x0418, B:257:0x0434, B:262:0x03e8, B:264:0x03f4, B:266:0x03f8, B:268:0x0403, B:269:0x041b, B:273:0x0677, B:282:0x043a, B:283:0x043d, B:287:0x0445, B:289:0x044b, B:291:0x0451, B:293:0x045d, B:296:0x0460, B:301:0x060c, B:303:0x0614, B:305:0x061a, B:306:0x061e, B:307:0x0621, B:309:0x0629, B:311:0x062f, B:313:0x0631, B:316:0x0672, B:318:0x0636, B:320:0x0642, B:322:0x0646, B:324:0x0651, B:326:0x0667, B:336:0x0678, B:338:0x067c, B:340:0x06a1, B:341:0x06a4, B:343:0x06b8, B:344:0x06bf, B:345:0x0682, B:347:0x068a, B:352:0x0695, B:353:0x0472, B:355:0x047a, B:357:0x047f, B:359:0x0485, B:361:0x0489, B:363:0x048d, B:365:0x049d, B:367:0x04a5, B:369:0x04b2, B:371:0x04b6, B:373:0x04c3, B:374:0x06c9, B:375:0x04b9, B:376:0x04c6, B:378:0x04ca, B:380:0x04d2, B:382:0x04dc, B:383:0x051e, B:385:0x0522, B:386:0x0525, B:390:0x058b, B:392:0x058f, B:393:0x0593, B:394:0x0530, B:396:0x0534, B:398:0x053c, B:400:0x0544, B:402:0x0557, B:404:0x055f, B:407:0x056b, B:409:0x0588, B:412:0x0595, B:414:0x059b, B:416:0x05a0, B:419:0x05a9, B:421:0x05b1, B:423:0x05bb, B:425:0x05c3, B:428:0x06c4, B:429:0x06dd, B:431:0x06e4, B:432:0x06f6, B:433:0x06e8, B:436:0x06ef, B:437:0x06fa, B:439:0x0706, B:441:0x071b, B:442:0x071f, B:445:0x0731, B:447:0x0751, B:448:0x0755, B:449:0x0726, B:450:0x0761, B:451:0x076a, B:452:0x077d, B:454:0x078d, B:455:0x079d, B:456:0x07af, B:458:0x07be, B:459:0x07c3, B:461:0x07c7, B:463:0x07cb, B:465:0x07d6, B:466:0x07e0, B:467:0x07e5, B:468:0x07f1, B:471:0x07f7, B:474:0x081a, B:475:0x0b08, B:476:0x0808, B:478:0x081f, B:480:0x0829, B:482:0x082d, B:483:0x0884, B:484:0x0833, B:486:0x083d, B:488:0x0841, B:490:0x085d, B:491:0x086c, B:493:0x0870, B:495:0x0876, B:497:0x087f, B:499:0x0889, B:501:0x0893, B:502:0x08eb, B:504:0x08ef, B:507:0x08fb, B:512:0x090a, B:514:0x0916, B:516:0x0924, B:519:0x0a3e, B:520:0x0988, B:521:0x0961, B:525:0x0a78, B:526:0x0a7e, B:528:0x092e, B:530:0x0932, B:532:0x0944, B:534:0x094a, B:535:0x0969, B:537:0x0971, B:539:0x0977, B:540:0x09a0, B:542:0x09ae, B:544:0x09b4, B:545:0x09c7, B:547:0x09cd, B:549:0x09d1, B:550:0x09d3, B:552:0x09da, B:554:0x09e0, B:556:0x0a08, B:558:0x0a0c, B:561:0x0a18, B:566:0x0a21, B:569:0x0a29, B:570:0x0a47, B:572:0x0a4f, B:574:0x0a5d, B:577:0x0a65, B:578:0x0a82, B:580:0x0a8e, B:585:0x0ad0, B:586:0x0ad8, B:588:0x0ade, B:590:0x0af6, B:593:0x0a9a, B:595:0x0aa6, B:597:0x0aad, B:599:0x0abd, B:601:0x0ac5, B:605:0x0afd, B:607:0x0b05, B:614:0x0b0d, B:617:0x0b13, B:618:0x0b18, B:619:0x0b20, B:621:0x0b3b, B:631:0x0be0, B:633:0x0bf4, B:656:0x0bfc, B:658:0x0c10, B:659:0x0c15, B:660:0x0b4a, B:662:0x0c16, B:676:0x0c73, B:684:0x0c82, B:685:0x0c8f, B:686:0x0c90, B:689:0x0c9a, B:692:0x0ca0, B:693:0x0cc9, B:695:0x0cd6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x067c A[Catch: RuntimeException -> 0x0cdd, 4Y3 -> 0x0cf1, IOException -> 0x0cff, TryCatch #7 {4Y3 -> 0x0cf1, IOException -> 0x0cff, RuntimeException -> 0x0cdd, blocks: (B:3:0x0006, B:4:0x000c, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:13:0x0026, B:15:0x0047, B:17:0x004d, B:18:0x006d, B:20:0x0073, B:23:0x007e, B:25:0x0086, B:26:0x0088, B:28:0x008c, B:30:0x0093, B:33:0x0097, B:35:0x009b, B:32:0x00a0, B:40:0x00a3, B:42:0x00bb, B:43:0x0cd9, B:45:0x00ce, B:46:0x00de, B:54:0x00e8, B:55:0x00e9, B:57:0x00f1, B:59:0x00f5, B:60:0x0127, B:62:0x012f, B:63:0x0132, B:65:0x0136, B:67:0x013c, B:69:0x0142, B:71:0x0151, B:73:0x0208, B:75:0x020d, B:77:0x0213, B:79:0x0219, B:80:0x021c, B:82:0x0220, B:83:0x0223, B:86:0x0229, B:88:0x0231, B:92:0x0241, B:93:0x0244, B:97:0x024c, B:179:0x0234, B:100:0x027e, B:102:0x0284, B:104:0x0288, B:107:0x028d, B:109:0x0292, B:112:0x02a1, B:117:0x02a9, B:121:0x02ac, B:123:0x02b2, B:125:0x02b8, B:130:0x02d5, B:133:0x02df, B:135:0x02e6, B:138:0x02f2, B:140:0x02f8, B:145:0x0304, B:146:0x0308, B:148:0x030c, B:150:0x0315, B:152:0x0324, B:153:0x0327, B:156:0x0333, B:159:0x033b, B:155:0x033f, B:164:0x0342, B:166:0x0347, B:168:0x034f, B:170:0x0356, B:172:0x035c, B:174:0x0360, B:182:0x027a, B:183:0x0157, B:185:0x015d, B:187:0x0171, B:189:0x017f, B:191:0x01a7, B:193:0x01b9, B:194:0x01bb, B:196:0x01d2, B:200:0x01e1, B:202:0x01e8, B:203:0x01ea, B:204:0x01d8, B:205:0x0203, B:206:0x0194, B:207:0x019f, B:208:0x00f8, B:210:0x00fe, B:217:0x0370, B:219:0x037d, B:221:0x0381, B:223:0x0387, B:225:0x0391, B:227:0x03a4, B:228:0x03a9, B:231:0x03af, B:235:0x03bb, B:237:0x03c5, B:239:0x03cb, B:241:0x03d1, B:243:0x03d7, B:245:0x03db, B:250:0x03e3, B:251:0x0418, B:257:0x0434, B:262:0x03e8, B:264:0x03f4, B:266:0x03f8, B:268:0x0403, B:269:0x041b, B:273:0x0677, B:282:0x043a, B:283:0x043d, B:287:0x0445, B:289:0x044b, B:291:0x0451, B:293:0x045d, B:296:0x0460, B:301:0x060c, B:303:0x0614, B:305:0x061a, B:306:0x061e, B:307:0x0621, B:309:0x0629, B:311:0x062f, B:313:0x0631, B:316:0x0672, B:318:0x0636, B:320:0x0642, B:322:0x0646, B:324:0x0651, B:326:0x0667, B:336:0x0678, B:338:0x067c, B:340:0x06a1, B:341:0x06a4, B:343:0x06b8, B:344:0x06bf, B:345:0x0682, B:347:0x068a, B:352:0x0695, B:353:0x0472, B:355:0x047a, B:357:0x047f, B:359:0x0485, B:361:0x0489, B:363:0x048d, B:365:0x049d, B:367:0x04a5, B:369:0x04b2, B:371:0x04b6, B:373:0x04c3, B:374:0x06c9, B:375:0x04b9, B:376:0x04c6, B:378:0x04ca, B:380:0x04d2, B:382:0x04dc, B:383:0x051e, B:385:0x0522, B:386:0x0525, B:390:0x058b, B:392:0x058f, B:393:0x0593, B:394:0x0530, B:396:0x0534, B:398:0x053c, B:400:0x0544, B:402:0x0557, B:404:0x055f, B:407:0x056b, B:409:0x0588, B:412:0x0595, B:414:0x059b, B:416:0x05a0, B:419:0x05a9, B:421:0x05b1, B:423:0x05bb, B:425:0x05c3, B:428:0x06c4, B:429:0x06dd, B:431:0x06e4, B:432:0x06f6, B:433:0x06e8, B:436:0x06ef, B:437:0x06fa, B:439:0x0706, B:441:0x071b, B:442:0x071f, B:445:0x0731, B:447:0x0751, B:448:0x0755, B:449:0x0726, B:450:0x0761, B:451:0x076a, B:452:0x077d, B:454:0x078d, B:455:0x079d, B:456:0x07af, B:458:0x07be, B:459:0x07c3, B:461:0x07c7, B:463:0x07cb, B:465:0x07d6, B:466:0x07e0, B:467:0x07e5, B:468:0x07f1, B:471:0x07f7, B:474:0x081a, B:475:0x0b08, B:476:0x0808, B:478:0x081f, B:480:0x0829, B:482:0x082d, B:483:0x0884, B:484:0x0833, B:486:0x083d, B:488:0x0841, B:490:0x085d, B:491:0x086c, B:493:0x0870, B:495:0x0876, B:497:0x087f, B:499:0x0889, B:501:0x0893, B:502:0x08eb, B:504:0x08ef, B:507:0x08fb, B:512:0x090a, B:514:0x0916, B:516:0x0924, B:519:0x0a3e, B:520:0x0988, B:521:0x0961, B:525:0x0a78, B:526:0x0a7e, B:528:0x092e, B:530:0x0932, B:532:0x0944, B:534:0x094a, B:535:0x0969, B:537:0x0971, B:539:0x0977, B:540:0x09a0, B:542:0x09ae, B:544:0x09b4, B:545:0x09c7, B:547:0x09cd, B:549:0x09d1, B:550:0x09d3, B:552:0x09da, B:554:0x09e0, B:556:0x0a08, B:558:0x0a0c, B:561:0x0a18, B:566:0x0a21, B:569:0x0a29, B:570:0x0a47, B:572:0x0a4f, B:574:0x0a5d, B:577:0x0a65, B:578:0x0a82, B:580:0x0a8e, B:585:0x0ad0, B:586:0x0ad8, B:588:0x0ade, B:590:0x0af6, B:593:0x0a9a, B:595:0x0aa6, B:597:0x0aad, B:599:0x0abd, B:601:0x0ac5, B:605:0x0afd, B:607:0x0b05, B:614:0x0b0d, B:617:0x0b13, B:618:0x0b18, B:619:0x0b20, B:621:0x0b3b, B:631:0x0be0, B:633:0x0bf4, B:656:0x0bfc, B:658:0x0c10, B:659:0x0c15, B:660:0x0b4a, B:662:0x0c16, B:676:0x0c73, B:684:0x0c82, B:685:0x0c8f, B:686:0x0c90, B:689:0x0c9a, B:692:0x0ca0, B:693:0x0cc9, B:695:0x0cd6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06b8 A[Catch: RuntimeException -> 0x0cdd, 4Y3 -> 0x0cf1, IOException -> 0x0cff, TryCatch #7 {4Y3 -> 0x0cf1, IOException -> 0x0cff, RuntimeException -> 0x0cdd, blocks: (B:3:0x0006, B:4:0x000c, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:13:0x0026, B:15:0x0047, B:17:0x004d, B:18:0x006d, B:20:0x0073, B:23:0x007e, B:25:0x0086, B:26:0x0088, B:28:0x008c, B:30:0x0093, B:33:0x0097, B:35:0x009b, B:32:0x00a0, B:40:0x00a3, B:42:0x00bb, B:43:0x0cd9, B:45:0x00ce, B:46:0x00de, B:54:0x00e8, B:55:0x00e9, B:57:0x00f1, B:59:0x00f5, B:60:0x0127, B:62:0x012f, B:63:0x0132, B:65:0x0136, B:67:0x013c, B:69:0x0142, B:71:0x0151, B:73:0x0208, B:75:0x020d, B:77:0x0213, B:79:0x0219, B:80:0x021c, B:82:0x0220, B:83:0x0223, B:86:0x0229, B:88:0x0231, B:92:0x0241, B:93:0x0244, B:97:0x024c, B:179:0x0234, B:100:0x027e, B:102:0x0284, B:104:0x0288, B:107:0x028d, B:109:0x0292, B:112:0x02a1, B:117:0x02a9, B:121:0x02ac, B:123:0x02b2, B:125:0x02b8, B:130:0x02d5, B:133:0x02df, B:135:0x02e6, B:138:0x02f2, B:140:0x02f8, B:145:0x0304, B:146:0x0308, B:148:0x030c, B:150:0x0315, B:152:0x0324, B:153:0x0327, B:156:0x0333, B:159:0x033b, B:155:0x033f, B:164:0x0342, B:166:0x0347, B:168:0x034f, B:170:0x0356, B:172:0x035c, B:174:0x0360, B:182:0x027a, B:183:0x0157, B:185:0x015d, B:187:0x0171, B:189:0x017f, B:191:0x01a7, B:193:0x01b9, B:194:0x01bb, B:196:0x01d2, B:200:0x01e1, B:202:0x01e8, B:203:0x01ea, B:204:0x01d8, B:205:0x0203, B:206:0x0194, B:207:0x019f, B:208:0x00f8, B:210:0x00fe, B:217:0x0370, B:219:0x037d, B:221:0x0381, B:223:0x0387, B:225:0x0391, B:227:0x03a4, B:228:0x03a9, B:231:0x03af, B:235:0x03bb, B:237:0x03c5, B:239:0x03cb, B:241:0x03d1, B:243:0x03d7, B:245:0x03db, B:250:0x03e3, B:251:0x0418, B:257:0x0434, B:262:0x03e8, B:264:0x03f4, B:266:0x03f8, B:268:0x0403, B:269:0x041b, B:273:0x0677, B:282:0x043a, B:283:0x043d, B:287:0x0445, B:289:0x044b, B:291:0x0451, B:293:0x045d, B:296:0x0460, B:301:0x060c, B:303:0x0614, B:305:0x061a, B:306:0x061e, B:307:0x0621, B:309:0x0629, B:311:0x062f, B:313:0x0631, B:316:0x0672, B:318:0x0636, B:320:0x0642, B:322:0x0646, B:324:0x0651, B:326:0x0667, B:336:0x0678, B:338:0x067c, B:340:0x06a1, B:341:0x06a4, B:343:0x06b8, B:344:0x06bf, B:345:0x0682, B:347:0x068a, B:352:0x0695, B:353:0x0472, B:355:0x047a, B:357:0x047f, B:359:0x0485, B:361:0x0489, B:363:0x048d, B:365:0x049d, B:367:0x04a5, B:369:0x04b2, B:371:0x04b6, B:373:0x04c3, B:374:0x06c9, B:375:0x04b9, B:376:0x04c6, B:378:0x04ca, B:380:0x04d2, B:382:0x04dc, B:383:0x051e, B:385:0x0522, B:386:0x0525, B:390:0x058b, B:392:0x058f, B:393:0x0593, B:394:0x0530, B:396:0x0534, B:398:0x053c, B:400:0x0544, B:402:0x0557, B:404:0x055f, B:407:0x056b, B:409:0x0588, B:412:0x0595, B:414:0x059b, B:416:0x05a0, B:419:0x05a9, B:421:0x05b1, B:423:0x05bb, B:425:0x05c3, B:428:0x06c4, B:429:0x06dd, B:431:0x06e4, B:432:0x06f6, B:433:0x06e8, B:436:0x06ef, B:437:0x06fa, B:439:0x0706, B:441:0x071b, B:442:0x071f, B:445:0x0731, B:447:0x0751, B:448:0x0755, B:449:0x0726, B:450:0x0761, B:451:0x076a, B:452:0x077d, B:454:0x078d, B:455:0x079d, B:456:0x07af, B:458:0x07be, B:459:0x07c3, B:461:0x07c7, B:463:0x07cb, B:465:0x07d6, B:466:0x07e0, B:467:0x07e5, B:468:0x07f1, B:471:0x07f7, B:474:0x081a, B:475:0x0b08, B:476:0x0808, B:478:0x081f, B:480:0x0829, B:482:0x082d, B:483:0x0884, B:484:0x0833, B:486:0x083d, B:488:0x0841, B:490:0x085d, B:491:0x086c, B:493:0x0870, B:495:0x0876, B:497:0x087f, B:499:0x0889, B:501:0x0893, B:502:0x08eb, B:504:0x08ef, B:507:0x08fb, B:512:0x090a, B:514:0x0916, B:516:0x0924, B:519:0x0a3e, B:520:0x0988, B:521:0x0961, B:525:0x0a78, B:526:0x0a7e, B:528:0x092e, B:530:0x0932, B:532:0x0944, B:534:0x094a, B:535:0x0969, B:537:0x0971, B:539:0x0977, B:540:0x09a0, B:542:0x09ae, B:544:0x09b4, B:545:0x09c7, B:547:0x09cd, B:549:0x09d1, B:550:0x09d3, B:552:0x09da, B:554:0x09e0, B:556:0x0a08, B:558:0x0a0c, B:561:0x0a18, B:566:0x0a21, B:569:0x0a29, B:570:0x0a47, B:572:0x0a4f, B:574:0x0a5d, B:577:0x0a65, B:578:0x0a82, B:580:0x0a8e, B:585:0x0ad0, B:586:0x0ad8, B:588:0x0ade, B:590:0x0af6, B:593:0x0a9a, B:595:0x0aa6, B:597:0x0aad, B:599:0x0abd, B:601:0x0ac5, B:605:0x0afd, B:607:0x0b05, B:614:0x0b0d, B:617:0x0b13, B:618:0x0b18, B:619:0x0b20, B:621:0x0b3b, B:631:0x0be0, B:633:0x0bf4, B:656:0x0bfc, B:658:0x0c10, B:659:0x0c15, B:660:0x0b4a, B:662:0x0c16, B:676:0x0c73, B:684:0x0c82, B:685:0x0c8f, B:686:0x0c90, B:689:0x0c9a, B:692:0x0ca0, B:693:0x0cc9, B:695:0x0cd6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020d A[Catch: RuntimeException -> 0x0cdd, 4Y3 -> 0x0cf1, IOException -> 0x0cff, TryCatch #7 {4Y3 -> 0x0cf1, IOException -> 0x0cff, RuntimeException -> 0x0cdd, blocks: (B:3:0x0006, B:4:0x000c, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:13:0x0026, B:15:0x0047, B:17:0x004d, B:18:0x006d, B:20:0x0073, B:23:0x007e, B:25:0x0086, B:26:0x0088, B:28:0x008c, B:30:0x0093, B:33:0x0097, B:35:0x009b, B:32:0x00a0, B:40:0x00a3, B:42:0x00bb, B:43:0x0cd9, B:45:0x00ce, B:46:0x00de, B:54:0x00e8, B:55:0x00e9, B:57:0x00f1, B:59:0x00f5, B:60:0x0127, B:62:0x012f, B:63:0x0132, B:65:0x0136, B:67:0x013c, B:69:0x0142, B:71:0x0151, B:73:0x0208, B:75:0x020d, B:77:0x0213, B:79:0x0219, B:80:0x021c, B:82:0x0220, B:83:0x0223, B:86:0x0229, B:88:0x0231, B:92:0x0241, B:93:0x0244, B:97:0x024c, B:179:0x0234, B:100:0x027e, B:102:0x0284, B:104:0x0288, B:107:0x028d, B:109:0x0292, B:112:0x02a1, B:117:0x02a9, B:121:0x02ac, B:123:0x02b2, B:125:0x02b8, B:130:0x02d5, B:133:0x02df, B:135:0x02e6, B:138:0x02f2, B:140:0x02f8, B:145:0x0304, B:146:0x0308, B:148:0x030c, B:150:0x0315, B:152:0x0324, B:153:0x0327, B:156:0x0333, B:159:0x033b, B:155:0x033f, B:164:0x0342, B:166:0x0347, B:168:0x034f, B:170:0x0356, B:172:0x035c, B:174:0x0360, B:182:0x027a, B:183:0x0157, B:185:0x015d, B:187:0x0171, B:189:0x017f, B:191:0x01a7, B:193:0x01b9, B:194:0x01bb, B:196:0x01d2, B:200:0x01e1, B:202:0x01e8, B:203:0x01ea, B:204:0x01d8, B:205:0x0203, B:206:0x0194, B:207:0x019f, B:208:0x00f8, B:210:0x00fe, B:217:0x0370, B:219:0x037d, B:221:0x0381, B:223:0x0387, B:225:0x0391, B:227:0x03a4, B:228:0x03a9, B:231:0x03af, B:235:0x03bb, B:237:0x03c5, B:239:0x03cb, B:241:0x03d1, B:243:0x03d7, B:245:0x03db, B:250:0x03e3, B:251:0x0418, B:257:0x0434, B:262:0x03e8, B:264:0x03f4, B:266:0x03f8, B:268:0x0403, B:269:0x041b, B:273:0x0677, B:282:0x043a, B:283:0x043d, B:287:0x0445, B:289:0x044b, B:291:0x0451, B:293:0x045d, B:296:0x0460, B:301:0x060c, B:303:0x0614, B:305:0x061a, B:306:0x061e, B:307:0x0621, B:309:0x0629, B:311:0x062f, B:313:0x0631, B:316:0x0672, B:318:0x0636, B:320:0x0642, B:322:0x0646, B:324:0x0651, B:326:0x0667, B:336:0x0678, B:338:0x067c, B:340:0x06a1, B:341:0x06a4, B:343:0x06b8, B:344:0x06bf, B:345:0x0682, B:347:0x068a, B:352:0x0695, B:353:0x0472, B:355:0x047a, B:357:0x047f, B:359:0x0485, B:361:0x0489, B:363:0x048d, B:365:0x049d, B:367:0x04a5, B:369:0x04b2, B:371:0x04b6, B:373:0x04c3, B:374:0x06c9, B:375:0x04b9, B:376:0x04c6, B:378:0x04ca, B:380:0x04d2, B:382:0x04dc, B:383:0x051e, B:385:0x0522, B:386:0x0525, B:390:0x058b, B:392:0x058f, B:393:0x0593, B:394:0x0530, B:396:0x0534, B:398:0x053c, B:400:0x0544, B:402:0x0557, B:404:0x055f, B:407:0x056b, B:409:0x0588, B:412:0x0595, B:414:0x059b, B:416:0x05a0, B:419:0x05a9, B:421:0x05b1, B:423:0x05bb, B:425:0x05c3, B:428:0x06c4, B:429:0x06dd, B:431:0x06e4, B:432:0x06f6, B:433:0x06e8, B:436:0x06ef, B:437:0x06fa, B:439:0x0706, B:441:0x071b, B:442:0x071f, B:445:0x0731, B:447:0x0751, B:448:0x0755, B:449:0x0726, B:450:0x0761, B:451:0x076a, B:452:0x077d, B:454:0x078d, B:455:0x079d, B:456:0x07af, B:458:0x07be, B:459:0x07c3, B:461:0x07c7, B:463:0x07cb, B:465:0x07d6, B:466:0x07e0, B:467:0x07e5, B:468:0x07f1, B:471:0x07f7, B:474:0x081a, B:475:0x0b08, B:476:0x0808, B:478:0x081f, B:480:0x0829, B:482:0x082d, B:483:0x0884, B:484:0x0833, B:486:0x083d, B:488:0x0841, B:490:0x085d, B:491:0x086c, B:493:0x0870, B:495:0x0876, B:497:0x087f, B:499:0x0889, B:501:0x0893, B:502:0x08eb, B:504:0x08ef, B:507:0x08fb, B:512:0x090a, B:514:0x0916, B:516:0x0924, B:519:0x0a3e, B:520:0x0988, B:521:0x0961, B:525:0x0a78, B:526:0x0a7e, B:528:0x092e, B:530:0x0932, B:532:0x0944, B:534:0x094a, B:535:0x0969, B:537:0x0971, B:539:0x0977, B:540:0x09a0, B:542:0x09ae, B:544:0x09b4, B:545:0x09c7, B:547:0x09cd, B:549:0x09d1, B:550:0x09d3, B:552:0x09da, B:554:0x09e0, B:556:0x0a08, B:558:0x0a0c, B:561:0x0a18, B:566:0x0a21, B:569:0x0a29, B:570:0x0a47, B:572:0x0a4f, B:574:0x0a5d, B:577:0x0a65, B:578:0x0a82, B:580:0x0a8e, B:585:0x0ad0, B:586:0x0ad8, B:588:0x0ade, B:590:0x0af6, B:593:0x0a9a, B:595:0x0aa6, B:597:0x0aad, B:599:0x0abd, B:601:0x0ac5, B:605:0x0afd, B:607:0x0b05, B:614:0x0b0d, B:617:0x0b13, B:618:0x0b18, B:619:0x0b20, B:621:0x0b3b, B:631:0x0be0, B:633:0x0bf4, B:656:0x0bfc, B:658:0x0c10, B:659:0x0c15, B:660:0x0b4a, B:662:0x0c16, B:676:0x0c73, B:684:0x0c82, B:685:0x0c8f, B:686:0x0c90, B:689:0x0c9a, B:692:0x0ca0, B:693:0x0cc9, B:695:0x0cd6), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220 A[Catch: RuntimeException -> 0x0cdd, 4Y3 -> 0x0cf1, IOException -> 0x0cff, TryCatch #7 {4Y3 -> 0x0cf1, IOException -> 0x0cff, RuntimeException -> 0x0cdd, blocks: (B:3:0x0006, B:4:0x000c, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:13:0x0026, B:15:0x0047, B:17:0x004d, B:18:0x006d, B:20:0x0073, B:23:0x007e, B:25:0x0086, B:26:0x0088, B:28:0x008c, B:30:0x0093, B:33:0x0097, B:35:0x009b, B:32:0x00a0, B:40:0x00a3, B:42:0x00bb, B:43:0x0cd9, B:45:0x00ce, B:46:0x00de, B:54:0x00e8, B:55:0x00e9, B:57:0x00f1, B:59:0x00f5, B:60:0x0127, B:62:0x012f, B:63:0x0132, B:65:0x0136, B:67:0x013c, B:69:0x0142, B:71:0x0151, B:73:0x0208, B:75:0x020d, B:77:0x0213, B:79:0x0219, B:80:0x021c, B:82:0x0220, B:83:0x0223, B:86:0x0229, B:88:0x0231, B:92:0x0241, B:93:0x0244, B:97:0x024c, B:179:0x0234, B:100:0x027e, B:102:0x0284, B:104:0x0288, B:107:0x028d, B:109:0x0292, B:112:0x02a1, B:117:0x02a9, B:121:0x02ac, B:123:0x02b2, B:125:0x02b8, B:130:0x02d5, B:133:0x02df, B:135:0x02e6, B:138:0x02f2, B:140:0x02f8, B:145:0x0304, B:146:0x0308, B:148:0x030c, B:150:0x0315, B:152:0x0324, B:153:0x0327, B:156:0x0333, B:159:0x033b, B:155:0x033f, B:164:0x0342, B:166:0x0347, B:168:0x034f, B:170:0x0356, B:172:0x035c, B:174:0x0360, B:182:0x027a, B:183:0x0157, B:185:0x015d, B:187:0x0171, B:189:0x017f, B:191:0x01a7, B:193:0x01b9, B:194:0x01bb, B:196:0x01d2, B:200:0x01e1, B:202:0x01e8, B:203:0x01ea, B:204:0x01d8, B:205:0x0203, B:206:0x0194, B:207:0x019f, B:208:0x00f8, B:210:0x00fe, B:217:0x0370, B:219:0x037d, B:221:0x0381, B:223:0x0387, B:225:0x0391, B:227:0x03a4, B:228:0x03a9, B:231:0x03af, B:235:0x03bb, B:237:0x03c5, B:239:0x03cb, B:241:0x03d1, B:243:0x03d7, B:245:0x03db, B:250:0x03e3, B:251:0x0418, B:257:0x0434, B:262:0x03e8, B:264:0x03f4, B:266:0x03f8, B:268:0x0403, B:269:0x041b, B:273:0x0677, B:282:0x043a, B:283:0x043d, B:287:0x0445, B:289:0x044b, B:291:0x0451, B:293:0x045d, B:296:0x0460, B:301:0x060c, B:303:0x0614, B:305:0x061a, B:306:0x061e, B:307:0x0621, B:309:0x0629, B:311:0x062f, B:313:0x0631, B:316:0x0672, B:318:0x0636, B:320:0x0642, B:322:0x0646, B:324:0x0651, B:326:0x0667, B:336:0x0678, B:338:0x067c, B:340:0x06a1, B:341:0x06a4, B:343:0x06b8, B:344:0x06bf, B:345:0x0682, B:347:0x068a, B:352:0x0695, B:353:0x0472, B:355:0x047a, B:357:0x047f, B:359:0x0485, B:361:0x0489, B:363:0x048d, B:365:0x049d, B:367:0x04a5, B:369:0x04b2, B:371:0x04b6, B:373:0x04c3, B:374:0x06c9, B:375:0x04b9, B:376:0x04c6, B:378:0x04ca, B:380:0x04d2, B:382:0x04dc, B:383:0x051e, B:385:0x0522, B:386:0x0525, B:390:0x058b, B:392:0x058f, B:393:0x0593, B:394:0x0530, B:396:0x0534, B:398:0x053c, B:400:0x0544, B:402:0x0557, B:404:0x055f, B:407:0x056b, B:409:0x0588, B:412:0x0595, B:414:0x059b, B:416:0x05a0, B:419:0x05a9, B:421:0x05b1, B:423:0x05bb, B:425:0x05c3, B:428:0x06c4, B:429:0x06dd, B:431:0x06e4, B:432:0x06f6, B:433:0x06e8, B:436:0x06ef, B:437:0x06fa, B:439:0x0706, B:441:0x071b, B:442:0x071f, B:445:0x0731, B:447:0x0751, B:448:0x0755, B:449:0x0726, B:450:0x0761, B:451:0x076a, B:452:0x077d, B:454:0x078d, B:455:0x079d, B:456:0x07af, B:458:0x07be, B:459:0x07c3, B:461:0x07c7, B:463:0x07cb, B:465:0x07d6, B:466:0x07e0, B:467:0x07e5, B:468:0x07f1, B:471:0x07f7, B:474:0x081a, B:475:0x0b08, B:476:0x0808, B:478:0x081f, B:480:0x0829, B:482:0x082d, B:483:0x0884, B:484:0x0833, B:486:0x083d, B:488:0x0841, B:490:0x085d, B:491:0x086c, B:493:0x0870, B:495:0x0876, B:497:0x087f, B:499:0x0889, B:501:0x0893, B:502:0x08eb, B:504:0x08ef, B:507:0x08fb, B:512:0x090a, B:514:0x0916, B:516:0x0924, B:519:0x0a3e, B:520:0x0988, B:521:0x0961, B:525:0x0a78, B:526:0x0a7e, B:528:0x092e, B:530:0x0932, B:532:0x0944, B:534:0x094a, B:535:0x0969, B:537:0x0971, B:539:0x0977, B:540:0x09a0, B:542:0x09ae, B:544:0x09b4, B:545:0x09c7, B:547:0x09cd, B:549:0x09d1, B:550:0x09d3, B:552:0x09da, B:554:0x09e0, B:556:0x0a08, B:558:0x0a0c, B:561:0x0a18, B:566:0x0a21, B:569:0x0a29, B:570:0x0a47, B:572:0x0a4f, B:574:0x0a5d, B:577:0x0a65, B:578:0x0a82, B:580:0x0a8e, B:585:0x0ad0, B:586:0x0ad8, B:588:0x0ade, B:590:0x0af6, B:593:0x0a9a, B:595:0x0aa6, B:597:0x0aad, B:599:0x0abd, B:601:0x0ac5, B:605:0x0afd, B:607:0x0b05, B:614:0x0b0d, B:617:0x0b13, B:618:0x0b18, B:619:0x0b20, B:621:0x0b3b, B:631:0x0be0, B:633:0x0bf4, B:656:0x0bfc, B:658:0x0c10, B:659:0x0c15, B:660:0x0b4a, B:662:0x0c16, B:676:0x0c73, B:684:0x0c82, B:685:0x0c8f, B:686:0x0c90, B:689:0x0c9a, B:692:0x0ca0, B:693:0x0cc9, B:695:0x0cd6), top: B:2:0x0006 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r45) {
        /*
            Method dump skipped, instructions count: 3404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96654Wa.handleMessage(android.os.Message):boolean");
    }

    private long A01(C4WX c4wx, long j, boolean z, boolean z2) {
        A09();
        this.A0O = false;
        A0C(2);
        C96724Wh c96724Wh = this.A0b;
        C4YN c4yn = c96724Wh.A05;
        C4YN c4yn2 = c4yn;
        while (true) {
            if (c4yn2 == null) {
                break;
            }
            if (c4wx.equals(c4yn2.A02.A04) && c4yn2.A07) {
                C4WW c4ww = this.A0A;
                c4ww.A03.A0B(this.A0c, c4ww.A05.A04);
                c96724Wh.A09(c4yn2);
                break;
            }
            c4yn2 = c96724Wh.A05();
        }
        if (c4yn != c4yn2 || z2) {
            for (InterfaceC96054To interfaceC96054To : this.A0R) {
                A0I(interfaceC96054To);
            }
            this.A0R = new InterfaceC96054To[0];
            c4yn = null;
        }
        if (c4yn2 != null) {
            A0F(c4yn);
            if (c4yn2.A06) {
                C4Z0 c4z0 = c4yn2.A08;
                j = c4z0.EMn(j, z);
                c4z0.APa(j - this.A0U, this.A0j);
            }
            A0D(j);
            A05();
        } else {
            c96724Wh.A08(true);
            A0D(j);
        }
        A0J(false);
        ((C96764Wl) this.A0g).A00.sendEmptyMessage(2);
        return j;
    }
}
