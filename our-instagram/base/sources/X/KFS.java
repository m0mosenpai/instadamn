package X;

import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KFS extends AbstractC61132qb {
    public final UserSession A00;

    public KFS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new BrandedContentDisclosureMenuViewModel(new BrandedContentAdsApi(userSession), userSession);
    }
}
