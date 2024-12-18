package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PFv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56727PFv implements GZR {
    public final /* synthetic */ C82G A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C146836jL A02;

    public C56727PFv(C82G c82g, C41181vS c41181vS, C146836jL c146836jL) {
        this.A02 = c146836jL;
        this.A01 = c41181vS;
        this.A00 = c82g;
    }

    @Override // X.GZR
    public final void onAuthorizeFail() {
        C146836jL c146836jL = this.A02;
        if (c146836jL.A02) {
            c146836jL.A02 = false;
            c146836jL.A0A.EJJ();
        }
    }

    @Override // X.GZR
    public final void onAuthorizeSuccess(String str) {
        C146836jL c146836jL = this.A02;
        if (c146836jL.A02) {
            c146836jL.A02 = false;
            c146836jL.A0A.EJJ();
        }
        C41181vS c41181vS = this.A01;
        C82G c82g = this.A00;
        UserSession userSession = c146836jL.A07;
        if (!C18U.A06(C06090Tz.A05, userSession, 36326541332068300L)) {
            c146836jL.A01 = true;
            C196068lw.A00(userSession).A01(c146836jL.A06, new P1Q(2, c82g, c41181vS, c146836jL), "story_viewer");
        }
    }
}
