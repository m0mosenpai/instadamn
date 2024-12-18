package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveViewerListApi;

/* loaded from: classes9.dex */
public final class NCC extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC142806cg A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A00;
        return new C52881Nac(userSession, new IgLiveViewerListApi(userSession), c147836l8.A00(userSession, this.A01).A01());
    }

    public NCC(UserSession userSession, EnumC142806cg enumC142806cg) {
        AbstractC167017dG.A1P(userSession, enumC142806cg);
        this.A00 = userSession;
        this.A01 = enumC142806cg;
    }
}
