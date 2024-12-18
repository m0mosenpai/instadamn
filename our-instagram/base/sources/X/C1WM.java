package X;

import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;

/* renamed from: X.1WM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WM implements C1WN {
    public C5G1 A00;
    public final C1WA A01;
    public final C27651Vs A02;
    public final C27641Vr A03;
    public final Executor A04;
    public final Executor A05;
    public final InterfaceC16610sE A06 = new C9E6(this, 0);
    public final C1W8 A07;

    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    @Override // X.C1WN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AUt(android.graphics.Rect r25, com.facebook.common.callercontext.ContextChain r26, X.C6Bb r27, X.InterfaceC30787DgO r28, final X.InterfaceC59242nQ r29, final X.C2nP r30, X.InterfaceC59212nM r31, X.C5GG r32, final java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WM.AUt(android.graphics.Rect, com.facebook.common.callercontext.ContextChain, X.6Bb, X.DgO, X.2nQ, X.2nP, X.2nM, X.5GG, java.lang.Object):boolean");
    }

    @Override // X.C1WN
    public final void EE1(InterfaceC59242nQ interfaceC59242nQ) {
        C14360o3.A0B(interfaceC59242nQ, 0);
        C1VI.A00();
        if (!(interfaceC59242nQ instanceof C59252nR)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Drawable not supported ");
            sb.append(interfaceC59242nQ);
            C0I2.A03("KFrescoController", sb.toString());
            return;
        }
        C27511Ve.A07.A01((C59252nR) interfaceC59242nQ);
    }

    @Override // X.C1WN
    public final void EEG(InterfaceC59242nQ interfaceC59242nQ) {
        C14360o3.A0B(interfaceC59242nQ, 0);
        C1VI.A00();
        if (!(interfaceC59242nQ instanceof C59252nR)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Drawable not supported ");
            sb.append(interfaceC59242nQ);
            C0I2.A03("KFrescoController", sb.toString());
            return;
        }
        C59252nR c59252nR = (C59252nR) interfaceC59242nQ;
        boolean z = C27511Ve.A01;
        C14360o3.A0B(c59252nR, 0);
        if (!C27511Ve.A01) {
            return;
        }
        RunnableC59302nZ runnableC59302nZ = c59252nR.A0J;
        if (runnableC59302nZ.A00) {
            return;
        }
        C27511Ve.A05.postDelayed(runnableC59302nZ, C27511Ve.A00);
        if (!C27511Ve.A04) {
            return;
        }
        runnableC59302nZ.A00 = true;
    }

    @Override // X.C1WN
    public final void EEL(InterfaceC59242nQ interfaceC59242nQ) {
        C14360o3.A0B(interfaceC59242nQ, 0);
        C1VI.A00();
        if (!(interfaceC59242nQ instanceof C59252nR)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Drawable not supported ");
            sb.append(interfaceC59242nQ);
            C0I2.A03("KFrescoController", sb.toString());
            return;
        }
        C59252nR c59252nR = (C59252nR) interfaceC59242nQ;
        boolean z = C27511Ve.A01;
        C14360o3.A0B(c59252nR, 0);
        if (!C27511Ve.A02) {
            return;
        }
        c59252nR.A01();
    }

    public C1WM(C1W8 c1w8, C1WA c1wa, C27651Vs c27651Vs, C27641Vr c27641Vr, Executor executor, Executor executor2) {
        this.A03 = c27641Vr;
        this.A02 = c27651Vs;
        this.A05 = executor;
        this.A04 = executor2;
        this.A07 = c1w8;
        this.A01 = c1wa;
    }

    private final boolean A00(C1VO c1vo, C2nP c2nP, C59252nR c59252nR, boolean z) {
        C3QA c3qa;
        C1VI.A00();
        if (c1vo != null) {
            try {
                if (c1vo.A05() && (c3qa = (C3QA) c1vo.A04()) != null) {
                    c59252nR.A06 = true;
                    c59252nR.A0D.Egi(c59252nR, c1vo.A02(), C59252nR.A0O[1]);
                    C3QI.A00(c2nP.A00, c59252nR.A0G, c2nP.A01, c3qa, this.A06);
                    c59252nR.invalidateSelf();
                    C3QB BGj = c3qa.BGj();
                    if (z) {
                        c59252nR.A0E.DMv(c2nP, BGj, c59252nR.A00);
                    } else {
                        c59252nR.A0E.DH2(c59252nR.AZ0(), AbstractC59372ng.A00(c1vo, null, c59252nR), c2nP, BGj, 6, c59252nR.A00);
                    }
                    C5G1 c5g1 = this.A00;
                    if (c5g1 != null) {
                        c5g1.A00(c59252nR);
                    }
                    return true;
                }
            } finally {
                c1vo.close();
            }
        }
        C1VO.A01(c1vo);
        return false;
    }

    @Override // X.C1WN
    public final Drawable AM5() {
        C1VI.A00();
        return new C59252nR(this.A07);
    }
}
