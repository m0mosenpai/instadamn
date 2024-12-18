package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KZH extends C4A7 {
    public AnonymousClass195 A00;
    public final InterfaceC19390xP A01;
    public final C05A A02;

    public final void A00(UserSession userSession, String str, boolean z) {
        boolean A1a = AbstractC167017dG.A1a(userSession, str);
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null && anonymousClass195.isActive() == A1a) {
            return;
        }
        this.A00 = AbstractC25226BEj.A1L(new MBa(this, userSession, str, null, 4, z), super.A01);
    }

    public KZH() {
        super("Direct", C4A8.A00(150486801));
        C008002u A00 = C10E.A00(C45981KWv.A00);
        this.A02 = A00;
        this.A01 = AbstractC208910l.A02(A00);
    }
}
