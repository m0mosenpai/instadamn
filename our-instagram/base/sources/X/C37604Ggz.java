package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ggz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37604Ggz extends AbstractC116895Qv implements InterfaceC43589JPu {
    public String A00;
    public String A01;
    public final UserSession A02;

    public C37604Ggz(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC167017dG.A0j();
        this.A00 = AbstractC167017dG.A0j();
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        boolean A03 = C1LE.A03(this.A02);
        if (c37818GkY.A0G) {
            if (!A03 || c37818GkY.A0C) {
                String A0n = AbstractC166997dE.A0n();
                C14360o3.A0B(A0n, 0);
                this.A00 = A0n;
            }
        }
    }

    @Override // X.InterfaceC43589JPu
    public final String Amq() {
        return this.A00;
    }

    @Override // X.InterfaceC43589JPu
    public final String CGJ() {
        return this.A01;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A00;
    }
}
