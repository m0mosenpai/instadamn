package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OMD {
    public final UserSession A00;

    public OMD(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final MWG A00(LeadGenEntryPoint leadGenEntryPoint, String str, String str2) {
        AbstractC167007dF.A1K(str, leadGenEntryPoint);
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("lead_gen/available_lead_forms_for_business/");
        A0c.A9s("fb_auth_token", str);
        A0c.A9s("entrypoint", leadGenEntryPoint.A00);
        A0c.A9s("cursor", str2);
        C1ON A0R = AbstractC31172DnG.A0R(null, A0c, H9R.class, C41316IQm.class, false);
        int i = 581160428;
        if (leadGenEntryPoint == LeadGenEntryPoint.A06) {
            i = 1277614955;
        }
        return PZS.A01(PZS.A00(A0R.A03(i), 20), 21);
    }

    public final MWG A01(LeadGenEntryPoint leadGenEntryPoint, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        AbstractC167007dF.A1K(str, str2);
        C14360o3.A0B(str3, 2);
        AbstractC25229BEm.A1I(str4, 3, leadGenEntryPoint);
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("lead_gen/create_lead_form_v2/");
        A0c.A9s("fb_auth_token", str);
        A0c.A9s("client_mutation_id", "");
        A0c.A9s("actor_id", str4);
        A0c.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        A0c.A9s("questions", str3);
        A0c.A9s("entrypoint", leadGenEntryPoint.A00);
        A0c.A0H("welcome_message", str5);
        A0c.A0H("media_id", str6);
        A0c.A0I("is_generic_form", z);
        A0c.A0I("organic_create_config", z2);
        A0c.A0H("organic_cta_label", str7);
        A0c.A0H("flow_id", str8);
        C1ON A0R = AbstractC31172DnG.A0R(null, A0c, H9A.class, C41317IQn.class, false);
        int i = 232777748;
        if (leadGenEntryPoint == LeadGenEntryPoint.A06) {
            i = 1740337749;
        }
        return PZS.A01(PZS.A00(A0R.A05(i, 3), 26), 27);
    }

    public final MWG A02(String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("lead_gen/get_lead_form_terms_of_service/");
        A0c.A9s("page_name", str);
        A0c.A9s("entrypoint", str2);
        return PZS.A01(PZS.A00(AbstractC31172DnG.A0R(null, A0c, H9S.class, C41319IQp.class, false).A03(1224978229), 28), 29);
    }

    public final MWG A03(String str, String str2, String str3, String str4) {
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("lead_gen/submit_lead_form/");
        A0c.A9s("lead_form_id", str);
        A0c.A9s("business_igid", str2);
        A0c.A9s("fields_data", str3);
        A0c.A9s("client_mutation_id", "");
        A0c.A9s("entrypoint", str4);
        return PZS.A01(PZS.A00(AbstractC25227BEk.A0e(A0c, N2Q.class, C54851ONc.class).A03(1574121722), 24), 25);
    }
}
