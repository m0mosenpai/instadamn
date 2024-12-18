package X;

import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGB extends AbstractC61132qb {
    public final C26069Bfx A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public KGB(C26069Bfx c26069Bfx, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = c26069Bfx;
        this.A01 = interfaceC11380iw;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.Kjn, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        C26069Bfx c26069Bfx = this.A00;
        AppreciationGiftFeedRepository appreciationGiftFeedRepository = new AppreciationGiftFeedRepository(userSession, c26069Bfx.A03);
        ?? obj = new Object();
        return new C44553Jmz(c26069Bfx, new C47983LJh(c26069Bfx, this.A01, userSession), new C47241KuE(userSession), C27S.A00().A00(userSession), obj, appreciationGiftFeedRepository);
    }
}
