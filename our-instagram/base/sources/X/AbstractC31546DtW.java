package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.DtW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31546DtW {
    public static final void A00(UserSession userSession, Integer num, String str, Throwable th) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        Map A0n = AbstractC167007dF.A0n(DialogModule.KEY_MESSAGE, str);
        switch (num.intValue()) {
            case 1:
                str2 = "promotion_id_null";
                break;
            case 2:
                str2 = "promotion_id_error";
                break;
            case 3:
                str2 = "parse_error";
                break;
            case 4:
                str2 = "action_handler_error";
                break;
            case 5:
                str2 = "unexpected_value";
                break;
            case 6:
                str2 = "unexpected_request";
                break;
            case 7:
                str2 = "fragment_pr_activity_null";
                break;
            case 8:
                str2 = "error";
                break;
            case 9:
                str2 = "qp_gql_fetcher";
                break;
            default:
                str2 = "qp_fetcher";
                break;
        }
        AbstractC12120kG.A0J(str2, th, A0n, 817901676);
    }
}
