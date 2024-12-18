package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;

/* renamed from: X.Bvu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27015Bvu extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public C27015Bvu(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        String str = this.A01;
        AbstractC167017dG.A1N(userSession, str);
        return new C26908BuB(new IGCreatorAIContentCategoriesRepository(AbstractC40691uc.A01(userSession), str));
    }
}
