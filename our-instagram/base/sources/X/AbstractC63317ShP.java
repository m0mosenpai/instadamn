package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.ShP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63317ShP {
    public static void A04(UserSession userSession, InterfaceC65530Tm0 interfaceC65530Tm0, String str, boolean z, boolean z2) {
        String str2;
        if (z2) {
            if (z) {
                str2 = "RESET_AND_GRANT_CONSENT";
            } else {
                str2 = "RESET";
            }
        } else {
            str2 = "DISABLE";
        }
        A01(new U75(userSession, interfaceC65530Tm0, str, 0, z, z2), userSession, null, str, str2);
    }

    public static void A01(C1P1 c1p1, UserSession userSession, Integer num, String str, String str2) {
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "autofill_type");
        C0CA.A00(A0T, str2, "update_settings_operator");
        if (num != null) {
            C0CA.A00(A0T, num, "consecutive_neg_interaction");
        }
        C2JM A0b = AbstractC25225BEi.A0b();
        AbstractC31173DnH.A1M(A0T, A0b.A00, "request");
        C907442n c907442n = new C907442n(A0b, C58890QHa.class, "IGIABAutofillUpdateSettingsMutation", true);
        C14360o3.A0B(userSession, 0);
        C907542o c907542o = new C907542o(userSession);
        c907542o.A08(c907442n);
        C1ON A05 = c907542o.A05();
        A05.A00 = c1p1;
        C1GJ.A06(A05, 517, 2, false, false);
    }

    public static void A00(C1P1 c1p1, UserSession userSession) {
        C2JM A0b = AbstractC25225BEi.A0b();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) Arrays.asList(String.valueOf(8)));
        A0b.A05("qrt_experiment_ids", copyOf);
        C18C.A0E(AbstractC167007dF.A1W(copyOf));
        C907442n c907442n = new C907442n(A0b, C58904QHo.class, "IGIABAutofillSettings", false);
        C14360o3.A0B(userSession, 0);
        C907542o c907542o = new C907542o(userSession);
        c907542o.A08(c907442n);
        C1ON A05 = c907542o.A05();
        A05.A00 = c1p1;
        C1GJ.A06(A05, 517, 2, false, false);
    }

    public static void A02(UserSession userSession, long j) {
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        InterfaceC19610xo ARD = A0x.ARD();
        ARD.E7G("contact_autofill_automatic_autofill_expiry_timestamp", j);
        ARD.apply();
        InterfaceC19610xo ARD2 = A0x.ARD();
        ARD2.E77("contact_autofill_eligible_for_automatic_autofill", true);
        ARD2.apply();
        A01(new C67936V3b(8), userSession, null, "CONTACT_AUTOFILL", "AUTO_AUTOFILL_OPT_IN");
    }

    public static void A03(UserSession userSession, InterfaceC65530Tm0 interfaceC65530Tm0) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (AbstractC167017dG.A1b(A00, A00.A0N, C23031Ai.A8c, 164)) {
            A00(new C58530Pwy(6, interfaceC65530Tm0, A00), userSession);
        } else {
            A01(new C58530Pwy(7, interfaceC65530Tm0, A00), userSession, Integer.valueOf(A00.A01.getInt("browser_consecutive_decline_autofill", 0)), "CONTACT_AUTOFILL", "SYNC");
        }
    }
}
