package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HDx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38969HDx extends AbstractC116895Qv {
    public final /* synthetic */ C154836xY A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C153656va A02;

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C14360o3.A0B(c38971HDz, 0);
        C153646vZ c153646vZ = this.A02.A01;
        if (c153646vZ != null) {
            c153646vZ.A00 = C05F.A01;
        }
        this.A00.A0S(c38971HDz.A01);
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        C153646vZ c153646vZ = this.A02.A01;
        if (c153646vZ != null) {
            c153646vZ.A00 = C05F.A0C;
        }
        AbstractC25651Mw.A00(this.A01).E4s(new C154106wK(c37818GkY.A01.BbA(), c37818GkY.A09));
    }

    public C38969HDx(C154836xY c154836xY, UserSession userSession, C153656va c153656va) {
        this.A02 = c153656va;
        this.A00 = c154836xY;
        this.A01 = userSession;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        C153646vZ c153646vZ = this.A02.A01;
        if (c153646vZ != null) {
            c153646vZ.A00 = C05F.A00;
        }
        ((MTJ) this.A00).A00.A04();
    }
}
