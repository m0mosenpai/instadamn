package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;

/* renamed from: X.Bvx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27018Bvx extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25835Bbq(userSession, new BioSummaryRepository(userSession, this.A01));
    }

    public C27018Bvx(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
