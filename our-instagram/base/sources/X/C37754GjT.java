package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GjT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37754GjT extends AbstractC116895Qv {
    public final UserSession A00;
    public final C62112sC A01;

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C62112sC c62112sC;
        C14360o3.A0B(c38971HDz, 0);
        if (!c38971HDz.A02 && (c62112sC = this.A01) != null) {
            c62112sC.A00();
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C62112sC c62112sC;
        C14360o3.A0B(c37752GjR, 0);
        if (!c37752GjR.A02 && (c62112sC = this.A01) != null) {
            c62112sC.A01();
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C62112sC c62112sC;
        C14360o3.A0B(c37818GkY, 0);
        boolean A03 = C1LE.A03(this.A00);
        if (!c37818GkY.A0D) {
            if ((!A03 || c37818GkY.A0C) && (c62112sC = this.A01) != null) {
                c62112sC.A02();
            }
        }
    }

    public C37754GjT(UserSession userSession, C62112sC c62112sC) {
        this.A00 = userSession;
        this.A01 = c62112sC;
    }
}
