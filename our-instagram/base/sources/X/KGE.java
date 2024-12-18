package X;

import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGE extends AbstractC61132qb {
    public final BrandedContentDisclosureArgs A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        return new C51047Mgz(this.A00, AbstractC46656KkZ.A00(userSession), new BrandedContentApi(userSession), interfaceC11380iw, userSession);
    }

    public KGE(BrandedContentDisclosureArgs brandedContentDisclosureArgs, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1Q(userSession, brandedContentDisclosureArgs);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = brandedContentDisclosureArgs;
    }
}
