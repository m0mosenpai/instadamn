package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes6.dex */
public abstract class FD8 {
    public static final void A00(AbstractC12990ll abstractC12990ll, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Long l;
        Long l2;
        AbstractC167017dG.A1O(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "register_account_failed");
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31179DnN.A1A(A0f, "containermodule", "waterfall_log_in", A00);
        AbstractC31171DnF.A19(A0f, str);
        AbstractC31171DnF.A1A(A0f, "done");
        AbstractC35274Fh9.A07(A0f, A01);
        A0f.AAP("retry_strategy", str5);
        Long l3 = null;
        if (num != null) {
            l = AbstractC25229BEm.A0n(num);
        } else {
            l = null;
        }
        A0f.A9K("attempt_count", l);
        A0f.AAP("types", str2);
        A0f.AAP(DialogModule.KEY_MESSAGE, str3);
        if (str8 != null) {
            l2 = AbstractC166997dE.A0j(str8);
        } else {
            l2 = null;
        }
        A0f.A9K("actor_id", l2);
        A0f.A7v("has_server_response", bool);
        A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str4);
        A0f.A7v("checkpointed", bool2);
        A0f.A7v("is_consent_required", bool3);
        A0f.A7v("is_feedback_required", bool4);
        A0f.A7v("is_login_required", bool5);
        A0f.A7v("is_no_content", bool6);
        A0f.A7v("is_violating_branded_content_policy", bool7);
        if (num2 != null) {
            l3 = AbstractC25229BEm.A0n(num2);
        }
        A0f.A9K(AbstractC58317Pt9.A00(13), l3);
        A0f.AAP("error_type", str6);
        A0f.AAP("error_message", str7);
        A0f.A7v("is_existing_user", bool8);
        A0f.Cht();
    }
}
