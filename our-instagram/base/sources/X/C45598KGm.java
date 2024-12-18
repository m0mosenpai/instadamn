package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.repository.CollectionItemEmojiReactionsListRepository;

/* renamed from: X.KGm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45598KGm extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C45598KGm(UserSession userSession, String str, String str2, String str3, String str4) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new AbstractC44512JmI(new CollectionItemEmojiReactionsListRepository(this.A00, this.A01, this.A02, this.A04, this.A03));
    }
}
