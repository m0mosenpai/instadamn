package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KG8 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public KG8(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = "trending_prompts_page";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50901MeW(this.A00, this.A01);
    }
}
