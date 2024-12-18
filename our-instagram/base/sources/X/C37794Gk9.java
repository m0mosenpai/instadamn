package X;

import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.Gk9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37794Gk9 extends AbstractC116895Qv {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C37794Gk9(C37726Gj1 c37726Gj1) {
        this.A01 = 2;
        this.A02 = c37726Gj1;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        if (1 - this.A01 != 0) {
            super.D5E(c38971HDz);
            return;
        }
        EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A00;
        C154846xZ c154846xZ = effectsPageFragment.A05;
        AbstractC115105If abstractC115105If = c38971HDz.A01;
        c154846xZ.A0S(abstractC115105If);
        if (abstractC115105If == null || !(abstractC115105If instanceof C115095Ie)) {
            return;
        }
        EffectsPageFragment.A05(effectsPageFragment, 2131961689);
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        switch (this.A01) {
            case 1:
                ((MTJ) ((EffectsPageFragment) this.A00).A05).A00.A04();
                return;
            case 2:
                C14360o3.A0B(c37752GjR, 0);
                if (this.A00 == null) {
                    this.A00 = c37752GjR;
                }
                C226418s A01 = C226218q.A01(AbstractC12960li.A00);
                A01.A0P(A01.A02, "REELS_TAB_NETWORK_REQUEST_STARTED");
                C37726Gj1 c37726Gj1 = (C37726Gj1) this.A02;
                C37752GjR c37752GjR2 = (C37752GjR) this.A00;
                if (c37752GjR2 != null) {
                    c37752GjR = c37752GjR2;
                }
                C37726Gj1.A01(c37752GjR, c37726Gj1);
                return;
            default:
                super.D5G(c37752GjR);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0066, code lost:
    
        if (X.C23061Al.A00(r5).A00(X.EnumC23071Am.A0a) != false) goto L11;
     */
    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5H(X.C37818GkY r12) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37794Gk9.D5H(X.GkY):void");
    }

    public C37794Gk9(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }
}
