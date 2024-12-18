package X;

import android.content.Context;
import com.instagram.registration.model.RegFlowExtras;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FAl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34291FAl {
    public static C1ON A00(Context context, C07270a1 c07270a1, RegFlowExtras regFlowExtras, Integer num, String str, String str2) {
        String str3;
        if (num == C05F.A00) {
            str3 = "accounts/create/";
        } else if (num == C05F.A01) {
            str3 = "accounts/create_validated/";
        } else {
            str3 = "";
        }
        boolean z = true;
        boolean A1O = AbstractC167007dF.A1O(AbstractC31174DnI.A06(c07270a1));
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        ((AbstractC23721Ec) A0M).A03 = null;
        A0M.A0L = true;
        ((AbstractC23721Ec) A0M).A02 = null;
        A0M.A0M = true;
        A0M.A0E = str3;
        AbstractC31176DnK.A1Q(A0M);
        String string = AbstractC31174DnI.A0f().getString("google_ad_id", null);
        Pattern pattern = AbstractC13670mt.A01;
        if (string == null) {
            string = "";
        }
        A0M.A9s("adid", string);
        C11820jg c11820jg = C11830jh.A04;
        C11830jh A01 = c11820jg.A01(c07270a1);
        C19T c19t = C19T.A1Z;
        AbstractC31175DnJ.A1F(c19t, A0M, A01);
        A0M.A9s("_uuid", AbstractC31172DnG.A10(context));
        A0M.A0I(AbstractC58317Pt9.A00(301), A1O);
        if (EnumC33445EqI.A07 == regFlowExtras.A01()) {
            z = false;
        }
        A0M.A0I("do_not_auto_login_if_credentials_match", z);
        A0M.A0H("logged_in_user_id", str);
        A0M.A0H("logged_in_user_authorization_token", str2);
        A0M.A0H("supervised_user_consent_token", regFlowExtras.A0d);
        FDT.A00(c19t, A0M, c11820jg, c07270a1);
        A0M.A0P(C07340a8.A00, EDQ.class, C34837FWu.class, false);
        RegFlowExtras.A00(context, A0M, c07270a1, regFlowExtras, true);
        AbstractC31181DnP.A0o(A0M, regFlowExtras);
        if (regFlowExtras.A0T != null && regFlowExtras.A0U != null) {
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                A0q.put("intent", regFlowExtras.A0T);
                A0q.put("surface", regFlowExtras.A0U);
                A0M.A9s("secondary_account_intent", A0q.toString());
            } catch (JSONException e) {
                C0w9.A03("CreateAccountApi", AbstractC166997dE.A0y("Error adding secondary account creation intent JSON object: ", e));
            }
        }
        return A0M.A0N();
    }
}
