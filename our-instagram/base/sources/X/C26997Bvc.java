package X;

import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;

/* renamed from: X.Bvc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26997Bvc extends AbstractC61132qb {
    public final UserSession A00;

    public C26997Bvc(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C25845Bc0(userSession, (CreatorToolsMonetizationApi) userSession.A01(CreatorToolsMonetizationApi.class, new D87(userSession, 33)));
    }
}
