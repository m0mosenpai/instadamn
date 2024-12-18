package X;

import com.instagram.common.session.UserSession;
import com.instagram.trials.repository.ActiveTrialsRepository;

/* renamed from: X.NCh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52292NCh extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new N87(userSession, AbstractC153926w1.A01(AbstractC31171DnF.A0D(this.A01), userSession, this.A02), new ActiveTrialsRepository(userSession));
    }

    public C52292NCh(UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1Q(userSession, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }
}
