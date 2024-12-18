package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes6.dex */
public abstract class FD6 {
    public static final C25531Mh A00(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, String str) {
        String str2;
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "reg_username_suggested"), 373);
        A0A.A0P("elapsed_time", Double.valueOf(A01 - A00));
        if (enumC33445EqI == null || (str2 = enumC33445EqI.A00) == null) {
            str2 = "null";
        }
        A0A.A0R("flow", str2);
        A0A.A0R("containermodule", "waterfall_log_in");
        A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0A.A0R("waterfall_id", C1Q9.A01());
        A0A.A0P(TraceFieldType.StartTime, Double.valueOf(A00));
        C14360o3.A0B(abstractC12990ll, 0);
        A0A.A0o(AbstractC31179DnN.A0c(abstractC12990ll));
        return A0A;
    }
}
