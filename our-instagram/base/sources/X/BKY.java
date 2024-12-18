package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BKY extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public BKY(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C25363BKg(userSession, (C25482BOw) userSession.A01(C25482BOw.class, new C29889DGd(userSession, 19)), C68P.A00(userSession), C14360o3.A0K(this.A01, "clips_media_notes_stack"));
    }
}
