package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository;

/* renamed from: X.Bc1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25846Bc1 extends AbstractC52922bZ {
    public final CreatorInspirationHubAccountsRepository A00;
    public final C05A A01;
    public final C0UO A02;

    public C25846Bc1(UserSession userSession, CreatorInspirationHubAccountsRepository creatorInspirationHubAccountsRepository) {
        C14360o3.A0B(userSession, 1);
        this.A00 = creatorInspirationHubAccountsRepository;
        C008002u A00 = C10E.A00(C29258Cv1.A00);
        this.A01 = A00;
        this.A02 = AbstractC208910l.A02(A00);
        D53.A03(CIN.A00(userSession), this, AbstractC141776au.A00(this), 29);
    }

    public final void A00(String str) {
        AbstractC166987dD.A1Z(new PYc(this, str, null, 17), AbstractC141776au.A00(this));
    }
}
