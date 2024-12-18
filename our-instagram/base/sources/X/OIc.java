package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OIc {
    public final C25671My A00;
    public final C27966CUm A01;
    public final HYG A02;

    public OIc(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A02 = new HYG(userSession);
        this.A01 = new C27966CUm(interfaceC11380iw, userSession, str);
        this.A00 = AbstractC25651Mw.A00(userSession);
    }

    public final void A00(C38321qM c38321qM, O4N o4n) {
        String str;
        if (c38321qM.A5T()) {
            C27966CUm c27966CUm = this.A01;
            if (c38321qM.A64()) {
                str = "reminder_unset";
            } else {
                str = "reminder_set";
            }
            c27966CUm.A00(c38321qM, str, null);
            HYG hyg = this.A02;
            C54608OAj c54608OAj = new C54608OAj(c38321qM, this, o4n);
            AbstractC166987dD.A1Z(new PYn(c38321qM, hyg, c54608OAj, null), ((C4A7) hyg).A01);
        }
    }
}
