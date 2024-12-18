package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;

/* renamed from: X.BwB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27031BwB extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C26909BuC(new KeywordRepository(AbstractC40691uc.A01(userSession), this.A02, this.A01));
    }

    public C27031BwB(UserSession userSession, String str, String str2) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }
}
