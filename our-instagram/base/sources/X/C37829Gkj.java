package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gkj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37829Gkj extends AbstractC116895Qv {
    public boolean A00;
    public final C153696ve A01;
    public final UserSession A02;

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C14360o3.A0B(c37752GjR, 0);
        Integer num = c37752GjR.A00;
        Integer num2 = C05F.A01;
        this.A00 = AbstractC167007dF.A1X(num, num2);
        C153696ve c153696ve = this.A01;
        C153696ve.A01(c153696ve, C05F.A00);
        if (this.A00) {
            C153696ve.A02(c153696ve, num2);
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        Integer num;
        C14360o3.A0B(c37818GkY, 0);
        if (!C1LE.A03(this.A02) || c37818GkY.A0C) {
            boolean z = this.A00;
            C153696ve c153696ve = this.A01;
            if (z) {
                C153696ve.A01(c153696ve, C05F.A01);
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
            C153696ve.A00(c153696ve, num);
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C153696ve c153696ve = this.A01;
        if (c153696ve.A00) {
            c153696ve.A01.markerEnd(749812461, (short) 3);
            c153696ve.A00 = false;
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5F() {
        if (!this.A00) {
            C153696ve.A00(this.A01, C05F.A0C);
        }
    }

    public C37829Gkj(C153696ve c153696ve, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = c153696ve;
    }
}
