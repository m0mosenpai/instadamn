package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.WUa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70398WUa implements CallerContextable {
    public static final String __redex_internal_original_name = "PromoteReactBridgingUtil";

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        Bundle A0E = AbstractC31174DnI.A0E(userSession, 1);
        A0E.putString("entryPoint", "instagram");
        A0E.putString("paymentAccountID", str);
        A0E.putString("externalFlowID", str2);
        AbstractC27401Ut.getInstance();
        C64501TGn c64501TGn = new C64501TGn(userSession);
        c64501TGn.A07 = fragmentActivity.getString(2131970724);
        c64501TGn.A00(A0E);
        c64501TGn.A01("AdsPaymentsPayNowRoute");
        c64501TGn.EqV(fragmentActivity).A04();
    }

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("entryPoint", "instagram");
        bundle.putString("paymentAccountID", str);
        bundle.putString("externalFlowID", str2);
        AbstractC27401Ut.getInstance();
        C64501TGn c64501TGn = new C64501TGn(userSession);
        c64501TGn.A07 = fragmentActivity.getString(2131970441);
        c64501TGn.A00(bundle);
        c64501TGn.A01("BillingASLDisplayIGRoute");
        c64501TGn.EqV(fragmentActivity).A04();
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        Bundle bundle = new Bundle();
        bundle.putString("paymentAccountID", str);
        bundle.putString("placement", str5);
        bundle.putString("wizardName", str2);
        bundle.putString("paymentMethodID", "");
        bundle.putString("externalFlowID", str4);
        bundle.putString("accessToken", str6);
        if (str3 != null && str2.equals("ADD_FUNDS")) {
            bundle.putString("jsonProps", str3);
        }
        AbstractC27401Ut.getInstance();
        C64501TGn A00 = new C64501TGn(userSession).A00(bundle);
        A00.A01("BillingWizardIGRoute");
        C140966Yy EqV = A00.EqV(fragmentActivity);
        if (z) {
            EqV.A0D = false;
        }
        EqV.A04();
    }
}
