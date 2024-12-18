package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.tabbedreaction.repository.DirectTabbedEmojiReactionRepository;

/* loaded from: classes8.dex */
public final class KGP extends AbstractC61132qb {
    public final int A00;
    public final UserSession A01;
    public final String A02;

    public KGP(UserSession userSession, String str, int i) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44517JmN(new DirectTabbedEmojiReactionRepository(this.A01, this.A02), this.A00);
    }
}
