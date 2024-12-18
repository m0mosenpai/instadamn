package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.OrganicLeadGenCtaLabel;

/* renamed from: X.Me7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50876Me7 extends AbstractC52922bZ {
    public final C2GT A00;

    public /* synthetic */ C50876Me7(UserSession userSession, EnumC53251Ngp enumC53251Ngp, String str, String str2, String str3) {
        OrganicLeadGenCtaLabel organicLeadGenCtaLabel;
        AbstractC167007dF.A1D(userSession, 1, str);
        C14360o3.A0B(enumC53251Ngp, 5);
        if (str3 != null) {
            organicLeadGenCtaLabel = (OrganicLeadGenCtaLabel) OrganicLeadGenCtaLabel.A01.get(AbstractC31178DnM.A0f(str3));
            if (organicLeadGenCtaLabel == null) {
                organicLeadGenCtaLabel = OrganicLeadGenCtaLabel.A09;
            }
        } else {
            organicLeadGenCtaLabel = OrganicLeadGenCtaLabel.A07;
        }
        LeadGenEntryPoint leadGenEntryPoint = enumC53251Ngp.A01;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A03();
        A0c.A0B("api/v1/lead_gen/create_or_edit_ig_lead_gen_config_v2/");
        A0c.A0R(N2P.class, ONR.class);
        A0c.A9s("fb_auth_token", str);
        if (str2 != null) {
            A0c.A9s("form_id", str2);
        }
        if (leadGenEntryPoint != null) {
            A0c.A9s("entrypoint", leadGenEntryPoint.A00);
        }
        C1ON A0T = AbstractC31172DnG.A0T(A0c, "organic_cta_label", organicLeadGenCtaLabel.A00);
        C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CreateOrEditLeadGenConfigResponseV2>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.CreateOrEditLeadGenConfigResponseV2>>");
        this.A00 = AbstractC31172DnG.A0E(new J6L(PZS.A01(PZS.A00(A0T.A03(328738175), 30), 31), 1));
    }
}
