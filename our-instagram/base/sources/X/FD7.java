package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes6.dex */
public abstract class FD7 {
    public static final C25531Mh A00(AbstractC12990ll abstractC12990ll, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "register_account_created"), 374);
        A0A.A0R("waterfall_id", C1Q9.A01());
        A0A.A0R("containermodule", "waterfall_log_in");
        A0A.A0P("elapsed_time", Double.valueOf(A01 - A00));
        A0A.A0P(TraceFieldType.StartTime, Double.valueOf(A00));
        A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "done");
        A0A.A0R("guid", AbstractC35274Fh9.A00());
        A0A.A0R("instagram_id", str3);
        A0A.A0R("flow", str);
        A0A.A0R("reg_type", str2);
        A0A.A0R("actor_id", str4);
        if (num != null) {
            str5 = AbstractC31178DnM.A0f(AbstractC34293FAn.A00(num));
        } else {
            str5 = null;
        }
        A0A.A0R("chosen_signup_type", str5);
        C14360o3.A0B(abstractC12990ll, 0);
        A0A.A0o(AbstractC31179DnN.A0c(abstractC12990ll));
        return A0A;
    }
}
