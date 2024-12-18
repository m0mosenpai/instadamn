package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.emojipong.data.EmojiPongRepository;

/* renamed from: X.KFe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45565KFe extends AbstractC61132qb {
    public final UserSession A00;

    public C45565KFe(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C44476Jli(userSession, new EmojiPongRepository(new C47309KvK(userSession), new C47310KvL(userSession)));
    }
}
