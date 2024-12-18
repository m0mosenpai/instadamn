package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: X.2ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59552ny implements InterfaceC58722mV {
    public C5G1 A00;
    public final C59252nR A01;
    public final Executor A02;
    public final long A03;
    public final InterfaceC16610sE A04;

    public C59552ny(C5G1 c5g1, C59252nR c59252nR, Executor executor, InterfaceC16610sE interfaceC16610sE, long j) {
        C14360o3.A0B(interfaceC16610sE, 3);
        this.A03 = j;
        this.A01 = c59252nR;
        this.A04 = interfaceC16610sE;
        this.A00 = c5g1;
        this.A02 = executor;
    }

    @Override // X.InterfaceC58722mV
    public final void DFy(C1W1 c1w1) {
        C2nP c2nP;
        C3QJ c3qj;
        C59432nm c59432nm;
        C59322nb c59322nb;
        long j = this.A03;
        C59252nR c59252nR = this.A01;
        if (j == c59252nR.A00 && (c2nP = c59252nR.A02) != null) {
            C59322nb c59322nb2 = c59252nR.A0G;
            Resources resources = c2nP.A00;
            C27771Wf c27771Wf = c2nP.A01;
            C14360o3.A0B(c59322nb2, 0);
            AbstractC59442nn A00 = AbstractC59402nj.A00(resources, c27771Wf.A0A, c27771Wf.A0Q, c27771Wf.A00);
            if (A00 == null) {
                c59322nb2.A02(true);
            } else {
                InterfaceC27851Wn interfaceC27851Wn = c27771Wf.A0F;
                if (interfaceC27851Wn != null) {
                    c3qj = new C3QJ(c27771Wf.A08, interfaceC27851Wn);
                } else {
                    c3qj = null;
                }
                c59322nb2.A01(c59322nb2.A01, c59322nb2.A02, c3qj, c59322nb2.A03, A00);
            }
            if (c1w1.A08() && (c59322nb = c59252nR.A04) != null) {
                c59322nb.A02(true);
            }
            if (!c1w1.A08()) {
                c59252nR.A0E.DMt(c2nP, c1w1.A03(), j);
            } else {
                Closeable closeable = (Closeable) c1w1.A02();
                try {
                    C1VO c1vo = (C1VO) closeable;
                    C2nS c2nS = c59252nR.A0E;
                    AbstractC59442nn abstractC59442nn = c59322nb2.A04;
                    Drawable drawable = null;
                    if ((abstractC59442nn instanceof C59432nm) && (c59432nm = (C59432nm) abstractC59442nn) != null) {
                        drawable = c59432nm.A02;
                    }
                    c2nS.DGC(drawable, AbstractC59372ng.A00(c1vo, c1w1, c59252nR), c2nP, c1w1.A03(), j);
                    if (closeable != null) {
                        closeable.close();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C20I.A00(closeable, th);
                        throw th2;
                    }
                }
            }
            this.A02.execute(new C3QS(c59252nR));
            C5G1 c5g1 = this.A00;
            if (c5g1 != null) {
                c5g1.A00(c59252nR);
            }
        }
    }

    @Override // X.InterfaceC58722mV
    public final void DVf(C1W1 c1w1) {
        final C2nP c2nP;
        C59322nb c59322nb;
        long j = this.A03;
        C59252nR c59252nR = this.A01;
        if (j == c59252nR.A00 && (c2nP = c59252nR.A02) != null) {
            C1VO c1vo = (C1VO) c1w1.A02();
            if (c1vo != null && c1vo.A05()) {
                c59252nR.A0D.Egi(c59252nR, c1vo, C59252nR.A0O[1]);
                C3QA c3qa = (C3QA) c1vo.A04();
                C3QI.A00(c2nP.A00, c59252nR.A0G, c2nP.A01, c3qa, this.A04);
                Executor executor = this.A02;
                executor.execute(new Runnable() { // from class: X.3QP
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59252nR c59252nR2 = this.A01;
                        C59322nb c59322nb2 = c59252nR2.A0G;
                        int i = c2nP.A01.A01;
                        ValueAnimator valueAnimator = c59322nb2.A00;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                        }
                        if (i == 0) {
                            c59322nb2.A09.setAlpha(255);
                        } else {
                            ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                            ofInt.setDuration(i);
                            ofInt.addUpdateListener(c59322nb2.A08);
                            ofInt.start();
                            c59322nb2.A00 = ofInt;
                        }
                        C59322nb c59322nb3 = c59252nR2.A0I;
                        ValueAnimator valueAnimator2 = c59322nb3.A00;
                        if (valueAnimator2 != null) {
                            valueAnimator2.end();
                        }
                        if (i == 0) {
                            c59322nb3.A09.setAlpha(0);
                            return;
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
                        ofInt2.setDuration(i);
                        ofInt2.addUpdateListener(c59322nb3.A08);
                        ofInt2.addListener(new U7q(c59322nb3));
                        ofInt2.start();
                        c59322nb3.A00 = ofInt2;
                    }
                });
                if (c1w1.A08() && (c59322nb = c59252nR.A04) != null) {
                    c59322nb.A02(true);
                }
                C3QB BGj = c3qa.BGj();
                if (!c1w1.A08()) {
                    c59252nR.A0E.DMv(c2nP, BGj, j);
                } else {
                    c59252nR.A0E.DH2(c59252nR.AZ0(), AbstractC59372ng.A00(c1vo, c1w1, c59252nR), c2nP, BGj, 1, j);
                }
                executor.execute(new C3QS(c59252nR));
                C5G1 c5g1 = this.A00;
                if (c5g1 != null) {
                    c5g1.A00(c59252nR);
                    return;
                }
                return;
            }
            DFy(c1w1);
            if (c1vo == null) {
                return;
            }
            c1vo.close();
        }
    }

    @Override // X.InterfaceC58722mV
    public final void Dbx(C1W1 c1w1) {
        AbstractC59442nn abstractC59442nn;
        C59432nm c59432nm;
        Drawable drawable;
        float f;
        C59252nR c59252nR = this.A01;
        C59322nb c59322nb = c59252nR.A04;
        if (c59322nb != null) {
            abstractC59442nn = c59322nb.A04;
        } else {
            abstractC59442nn = null;
        }
        if ((abstractC59442nn instanceof C59432nm) && (c59432nm = (C59432nm) abstractC59442nn) != null && (drawable = c59432nm.A02) != null && !c1w1.A08()) {
            synchronized (c1w1) {
                f = c1w1.A00;
            }
            VMO.A00(drawable, f);
        }
        C5G1 c5g1 = this.A00;
        if (c5g1 != null) {
            c5g1.A00(c59252nR);
        }
    }
}
