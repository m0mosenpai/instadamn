package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Cc4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28207Cc4 {
    public final C41061vE A00;
    public final AbstractC40951v2 A01;
    public final UserSession A02;

    public C28207Cc4(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC40751ui.A00(userSession);
        this.A00 = AbstractC41041vC.A00(userSession);
    }

    public final void A00(Context context, FragmentActivity fragmentActivity, CallerContext callerContext, String str, String str2, String str3, String str4, String str5, String str6) {
        C41061vE c41061vE;
        HashMap A02;
        String str7;
        String A00 = AbstractC111324zv.A00(115);
        AbstractC25234BEr.A1R(str, str2, str3, str4, str5);
        C14360o3.A0B(fragmentActivity, 9);
        String A01 = this.A01.A01(callerContext, A00, str2);
        if (A01 == null) {
            c41061vE = this.A00;
            String str8 = callerContext.A02;
            C14360o3.A07(str8);
            A02 = AbstractC06930Yk.A02(AbstractC166987dD.A1L("caller_class", str8), AbstractC166987dD.A1L("bloks_app_id", str), AbstractC166987dD.A1L("initiator_name", str3), AbstractC166987dD.A1L("entrypoint", str4), AbstractC166987dD.A1L("x_app_session_id", str5));
            str7 = "deeplink_invalid_fbid";
        } else {
            try {
                C35243Fgc.A01(context, fragmentActivity, this.A02, A01, str3, str4, str5, str6);
                C41061vE c41061vE2 = this.A00;
                String str9 = callerContext.A02;
                C14360o3.A07(str9);
                c41061vE2.A05("deeplink_attempt", A00, null, AbstractC06930Yk.A02(AbstractC166987dD.A1L("caller_class", str9), AbstractC166987dD.A1L("bloks_app_id", str), AbstractC166987dD.A1L("initiator_name", str3), AbstractC166987dD.A1L("entrypoint", str4), AbstractC166987dD.A1L("x_app_session_id", str5)));
                return;
            } catch (Exception e) {
                c41061vE = this.A00;
                String str10 = callerContext.A02;
                C14360o3.A07(str10);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                A02 = AbstractC06930Yk.A02(AbstractC166987dD.A1L("caller_class", str10), AbstractC166987dD.A1L("bloks_app_id", str), AbstractC166987dD.A1L("initiator_name", str3), AbstractC166987dD.A1L("entrypoint", str4), AbstractC166987dD.A1L("x_app_session_id", str5), AbstractC166987dD.A1L("error_message", message));
                str7 = "deeplink_exception";
            }
        }
        c41061vE.A05(str7, A00, null, A02);
    }

    public C28207Cc4() {
    }
}
