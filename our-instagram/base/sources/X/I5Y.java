package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I5Y {
    public static final C1ON A00(UserSession userSession, C41160IJz c41160IJz) {
        boolean A1a = AbstractC167017dG.A1a(c41160IJz, userSession);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("media/");
        A1C.append(c41160IJz.A03);
        A1C.append('/');
        A1C.append(c41160IJz.A05);
        A0c.A0B(AbstractC166997dE.A0x("/story_slider_vote/", A1C));
        C38826H7x c38826H7x = c41160IJz.A01;
        if (c38826H7x != null) {
            A0c.A9s("vote", String.valueOf(c38826H7x.A01));
            AbstractC37300Gc1.A0y(A0c, c41160IJz.A04);
            A0c.A9s("delivery_class", c41160IJz.A02);
            A0c.A9s("tray_session_id", c41160IJz.A06);
            A0c.A0D("tray_position", c41160IJz.A00);
            A0c.A9s("nav_chain", AbstractC25225BEi.A14());
            A0c.A0R(C38841H8p.class, IPA.class);
            return AbstractC31172DnG.A0U(A0c, A1a);
        }
        throw AbstractC166997dE.A0g();
    }
}
