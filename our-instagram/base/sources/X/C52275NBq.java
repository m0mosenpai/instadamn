package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52275NBq extends AbstractC61132qb {
    public final UserSession A00;
    public final C52458NJc A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C51045Mgx(userSession, new OJY(userSession), this.A01, C196068lw.A00(userSession), AbstractC173457nx.A00(userSession), AbstractC23021Ah.A00(userSession));
    }

    public C52275NBq(UserSession userSession, C52458NJc c52458NJc) {
        AbstractC167017dG.A1P(userSession, c52458NJc);
        this.A00 = userSession;
        this.A01 = c52458NJc;
    }
}
