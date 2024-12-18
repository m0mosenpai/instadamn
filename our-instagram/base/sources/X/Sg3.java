package X;

import android.content.Context;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class Sg3 {
    public static final void A01(Context context, AutofillData autofillData, SCG scg, UserSession userSession, boolean z) {
        try {
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            Map map = autofillData.A00;
            Map A12 = AbstractC58318PtA.A12(map);
            C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, A12.get("given-name"), "given_name");
            C0CA.A00(A0T, A12.get("family-name"), "family_name");
            C0CA.A00(A0T, A12.get("address-line1"), "address_line1");
            C0CA.A00(A0T, A12.get("address-line2"), "address_line2");
            C0CA.A00(A0T, A12.get("address-level1"), "address_level1");
            C0CA.A00(A0T, A12.get("address-level2"), "address_level2");
            C0CA.A00(A0T, A12.get("postal-code"), "postal_code");
            C0CA.A00(A0T, A12.get("country"), "country_name");
            C0CA.A00(A0T, A12.get("email"), "email");
            C0CA.A00(A0T, A12.get("tel"), "tel");
            C0CA A02 = c04060Jx.A02();
            A02.A0E(A0T, "data");
            C0CA.A00(A02, map.get("ent_id"), "ent_id");
            C2JM A0b = AbstractC25225BEi.A0b();
            AbstractC31173DnH.A1M(A02, A0b.A00, "request");
            C1ON A00 = A00(new C907442n(A0b, QHS.class, "IABAutofillSaveDataEntries", true), userSession);
            A00.A00 = new EU0(0, context, autofillData, scg, userSession, z);
            A02(A00);
        } catch (IOException e) {
            C0w9.A06("AutofillGraphQLRequest", "Error creating save autofill request", e);
            if (scg != null) {
                STG.A00(new RunnableC64666TOx(scg.A00, "Error creating save autofill request"));
            }
        }
    }

    public static final C1ON A00(C1Dk c1Dk, UserSession userSession) {
        C907542o c907542o = new C907542o(userSession);
        c907542o.A08(c1Dk);
        c907542o.A08 = AbstractC111324zv.A00(58);
        return c907542o.A05();
    }

    public static final void A03(Map map, String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            map.put(str, str2);
        }
    }

    public static final void A02(C1ON c1on) {
        C14120nc.A00().ATO(new C60945Rbz(c1on));
    }
}
