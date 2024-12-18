package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.4Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96864Ww implements C2BC {
    public static C95844St A0a;
    public double A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public C4RV A0C;
    public C4RU A0D;
    public C4X1 A0E;
    public C2B5 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final float A0L;
    public final C4TL A0M;
    public final C4TM A0N;
    public final C96874Wx A0O;
    public final C123235hy A0P;
    public final C4TP A0Q;
    public final C4TS A0R;
    public final HeroPlayerSetting A0S;
    public final Deque A0T;
    public final TreeMap A0U;
    public final InterfaceC92404Bv A0V;
    public final C4TG A0W;
    public final C4SS A0X;
    public final C46282Ap A0Y;
    public final boolean A0Z;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.4X3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C96864Ww(X.InterfaceC92404Bv r10, X.C4TL r11, X.C4TM r12, X.C4TG r13, X.C4SS r14, X.C46282Ap r15, X.C95844St r16, X.C4TP r17, X.C4TS r18, com.facebook.video.heroplayer.setting.HeroPlayerSetting r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96864Ww.<init>(X.4Bv, X.4TL, X.4TM, X.4TG, X.4SS, X.2Ap, X.4St, X.4TP, X.4TS, com.facebook.video.heroplayer.setting.HeroPlayerSetting):void");
    }

    @Override // X.C2BC
    public final void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
    }

    @Override // X.C2BC
    public final void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
    }

    private final void A00() {
        if (Math.abs(this.A01 - 1.0f) >= 1.0E-4f) {
            this.A01 = 1.0f;
            C4TS c4ts = this.A0R;
            C4TU c4tu = new C4TU(1.0f, c4ts.A0B.A00);
            c4ts.A0A.Eaz(c4tu);
            c4ts.A0B = c4tu;
        }
    }

    public static final void A01(C96864Ww c96864Ww) {
        C123235hy c123235hy = c96864Ww.A0P;
        if (c123235hy != null) {
            c123235hy.A04.clear();
            c123235hy.A03 = 0L;
            c123235hy.A02 = Integer.MAX_VALUE;
            c123235hy.A01 = Integer.MIN_VALUE;
            AbstractC459729h.A01("BufferMeter", "Clearing buffer sample queue", new Object[0]);
        }
        c96864Ww.A08 = -9223372036854775807L;
        c96864Ww.A06 = -9223372036854775807L;
    }

    public static final boolean A03(C96864Ww c96864Ww) {
        if (c96864Ww.A0Z && c96864Ww.A0Q.A05 != EnumC440821q.A04) {
            C4TG c4tg = c96864Ww.A0W;
            boolean z = c4tg.A00;
            if (c96864Ww.A0K && z) {
                A02(c96864Ww);
                AbstractC459729h.A01("LiveLatencyManager", "Transition from %s to %s", "rewind state", "live");
            }
            c96864Ww.A0K = !z;
            if (c96864Ww.A0I && c4tg.A00) {
                return true;
            }
        }
        c96864Ww.A00();
        return false;
    }

    public static final boolean A04(C96864Ww c96864Ww, float f) {
        C4B6 Bsc;
        C0s6 A00 = AbstractC13190m5.A00(c96864Ww.A0R.A0A.Av1().A00());
        while (A00.hasNext()) {
            C4WE c4we = (C4WE) A00.next();
            C2B5 c2b5 = c96864Ww.A0F;
            if (c2b5 != null && c2b5.AgD() != -1 && c4we != null && (Bsc = c4we.Bsc()) != null && Bsc.A05 != -1) {
                float AgD = ((float) c2b5.AgD()) * f;
                ArrayList arrayList = new ArrayList();
                C4WV CAE = c4we.CAE();
                int i = CAE.A01;
                for (int i2 = 0; i2 < i; i2++) {
                    C4B6 c4b6 = CAE.A04[i2];
                    C14360o3.A07(c4b6);
                    arrayList.add(c4b6);
                }
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (AgD < ((C4B6) it.next()).A05) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // X.C2BC
    public final void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
        this.A05 = this.A0R.A0A.Aih();
    }

    public static final void A02(C96864Ww c96864Ww) {
        Object c4x0;
        A01(c96864Ww);
        C4TP c4tp = c96864Ww.A0Q;
        if (C4TP.A00(c4tp.A05, c4tp).A0i) {
            c4x0 = new Object();
        } else {
            c4x0 = new C4X0(c96864Ww.A0S);
        }
        c96864Ww.A0E = (C4X1) c4x0;
        c96864Ww.A0M.A00.clear();
        c96864Ww.A04 = 0;
        c96864Ww.A03 = 0;
        c96864Ww.A07 = -9223372036854775807L;
        c96864Ww.A0J = false;
        c96864Ww.A0U.clear();
        c96864Ww.A0T.clear();
        c96864Ww.A0B = SystemClock.elapsedRealtime();
        c96864Ww.A0H = false;
        c96864Ww.A00();
        c96864Ww.A0G = false;
        C96874Wx c96874Wx = c96864Ww.A0O;
        SystemClock.elapsedRealtime();
        C96874Wx.A00(c96874Wx);
    }
}
