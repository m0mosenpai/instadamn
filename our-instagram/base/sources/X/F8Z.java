package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class F8Z {
    public static final void A00(Context context, Fragment fragment, FragmentActivity fragmentActivity, C62862tP c62862tP, C07270a1 c07270a1, EDH edh, boolean z) {
        C193328hC A0a;
        int i;
        int i2;
        C08790ch A00;
        AbstractC192798gL A02;
        int i3;
        Handler A0J;
        Runnable gqo;
        AbstractC167027dH.A0a(0, edh, fragmentActivity, fragment, c07270a1);
        C14360o3.A0B(c62862tP, 5);
        String str = edh.A00;
        if ("show_login_support_form".equals(str)) {
            A0J = AbstractC167007dF.A0J();
            gqo = new GQN(fragmentActivity, c07270a1, edh, z);
        } else {
            if ("show_help_center_link".equals(str)) {
                String A01 = AbstractC63260SgI.A01(context, edh.A08);
                C14360o3.A07(A01);
                SimpleWebViewActivity.A02.A02(context, c07270a1, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, z, true, false, false, false, context.getString(2131963475), A01));
                C35203Ffv.A01(c07270a1, "account_assistance_impression");
                return;
            }
            if ("show_recovery_challenge".equals(str)) {
                HashMap A12 = AbstractC31174DnI.A12("get_challenge", "true");
                A12.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, edh.A07);
                A12.put("nonce_code", edh.A06);
                A12.put("cni", edh.A03);
                String str2 = edh.A02;
                if (str2 != null) {
                    A12.put("challenge_context", str2);
                }
                A00 = AbstractC018607g.A00(fragment);
                String str3 = edh.A01;
                C14360o3.A07(str3);
                A02 = C192108fB.A05(c07270a1, str3, A12);
                i3 = 8;
            } else if ("show_recovery_accounts_list".equals(str)) {
                A0J = AbstractC167007dF.A0J();
                gqo = new GQO(fragmentActivity, c07270a1, edh, z);
            } else {
                if ("show_vettedness_dialog".equals(str)) {
                    String str4 = edh.A05;
                    String str5 = edh.A04;
                    if (str4 == null || str5 == null) {
                        return;
                    }
                    A0a = AbstractC31176DnK.A0a(context, str5, str4);
                    A0a.A07();
                    i = 2131963266;
                    i2 = 18;
                } else if ("show_two_factor_support_challenge".equals(str)) {
                    HashMap A122 = AbstractC31174DnI.A12("get_challenge", "true");
                    A122.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, edh.A07);
                    A122.put("nonce_code", edh.A06);
                    A122.put("cni", edh.A03);
                    String str6 = edh.A02;
                    if (str6 != null) {
                        A122.put("challenge_context", str6);
                    }
                    A00 = AbstractC018607g.A00(fragment);
                    String str7 = edh.A01;
                    C14360o3.A07(str7);
                    A02 = C192108fB.A02(null, c07270a1, str7, A122);
                    i3 = 9;
                } else {
                    if ("show_error_dialog".equals(str)) {
                        String str8 = edh.A05;
                        String str9 = edh.A04;
                        String str10 = edh.A08;
                        C14360o3.A07(str10);
                        if (str8 == null || str9 == null) {
                            return;
                        }
                        A0a = AbstractC31176DnK.A0a(context, str9, str8);
                        A0a.A07();
                        if (str10.length() > 0) {
                            i = 2131963266;
                            i2 = 19;
                        }
                        AbstractC166987dD.A1W(A0a);
                        return;
                    }
                    AbstractC35254Fgn.A01(context);
                    return;
                }
                A0a.A0H(new DialogInterfaceOnClickListenerC35450Fk7(i2, context, edh, c07270a1), i);
                AbstractC166987dD.A1W(A0a);
                return;
            }
            C32393EOu.A00(A02, context, c62862tP, c07270a1, i3);
            C1GJ.A00(context, A00, A02);
            return;
        }
        A0J.post(gqo);
    }
}
