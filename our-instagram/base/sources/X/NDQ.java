package X;

import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDQ extends AbstractC61132qb {
    public final ClipsTemplateBrowserV2Type A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final String A03;

    public NDQ(ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type, AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A00 = clipsTemplateBrowserV2Type;
        this.A03 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        AbstractC59962oe abstractC59962oe = this.A01;
        return new C50999Mg6(userSession, new OEC(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), this.A00, userSession, this.A03), new O6P());
    }
}
