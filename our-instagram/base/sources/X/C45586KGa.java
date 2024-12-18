package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.repository.DirectEmojiReactionsListRepository;

/* renamed from: X.KGa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45586KGa extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C45586KGa(UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new AbstractC44512JmI(new DirectEmojiReactionsListRepository(this.A00, this.A03, this.A02, this.A01));
    }
}
