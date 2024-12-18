package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GG3 implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        FMK fmk = (FMK) obj;
        AbstractC167027dH.A12(userSession, fmk, interfaceC03960Jm);
        String str = C1F8.A00(userSession).A04;
        C03990Jp c03990Jp = new C03990Jp(fmk.A01, interfaceC03960Jm);
        AbstractC59962oe abstractC59962oe = fmk.A00;
        C07270a1 c07270a1 = fmk.A02;
        Context context = abstractC59962oe.getContext();
        RegFlowExtras regFlowExtras = fmk.A03;
        boolean z = false;
        C25621Ms A0c = AbstractC167017dG.A0c(c07270a1);
        A0c.A0B("multiple_accounts/create_secondary_account/");
        AbstractC31175DnJ.A1F(C19T.A2I, A0c, AbstractC31172DnG.A0P(c07270a1));
        A0c.A9s("main_user_id", regFlowExtras.A0J);
        A0c.A9s("main_user_authorization_token", str);
        A0c.A9s("should_copy_consent_and_birthday_from_main", "true");
        A0c.A0I("should_link_to_main", regFlowExtras.A0z);
        AbstractC31176DnK.A1Q(A0c);
        String string = AbstractC31174DnI.A0f().getString("google_ad_id", null);
        Pattern pattern = AbstractC13670mt.A01;
        if (string == null) {
            string = "";
        }
        A0c.A9s("adid", string);
        if (regFlowExtras.A0t && regFlowExtras.A0y) {
            z = true;
        }
        A0c.A0I("should_cal_link_to_main", z);
        A0c.A0P(C07340a8.A00, EDQ.class, C34837FWu.class, false);
        RegFlowExtras.A00(context, A0c, c07270a1, regFlowExtras, false);
        UserBirthDate userBirthDate = regFlowExtras.A03;
        if (userBirthDate != null) {
            A0c.A9s("year", String.valueOf(userBirthDate.A02));
            A0c.A9s("month", String.valueOf(userBirthDate.A01));
            A0c.A9s("day", String.valueOf(userBirthDate.A00));
        }
        if (regFlowExtras.A0T != null && regFlowExtras.A0U != null) {
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                A0q.put("intent", regFlowExtras.A0T);
                A0q.put("surface", regFlowExtras.A0U);
                A0c.A9s("secondary_account_intent", A0q.toString());
            } catch (JSONException e) {
                C0w9.A03("SecondaryAccountApi", AbstractC166997dE.A0y("Error adding secondary account creation intent JSON object: ", e));
            }
        }
        C1ON A0N = A0c.A0N();
        A0N.A00 = c03990Jp;
        abstractC59962oe.schedule(A0N);
    }
}
