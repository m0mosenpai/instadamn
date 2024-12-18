package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1ZU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1ZU {
    public static final void A00(UserSession userSession, Integer num, String str) {
        String str2;
        C14360o3.A0B(str, 2);
        if (userSession != null) {
            C1ZX A00 = C1ZV.A00(userSession).A00(C05F.A0X, 817893793, 0, false);
            switch (num.intValue()) {
                case 0:
                    str2 = "LOCATE_VIEW_APP_PACKAGES";
                    break;
                case 1:
                    str2 = "BIND_SERVICE";
                    break;
                case 2:
                    str2 = "UNBIND_SERVICE";
                    break;
                case 3:
                    str2 = "ON_SERVICE_CONNECTED_SUCCESS";
                    break;
                case 4:
                    str2 = "ON_SERVICE_CONNECTED_FAIL";
                    break;
                case 5:
                    str2 = "PARSE_RESPONSE";
                    break;
                default:
                    str2 = "CREATE_REQUEST";
                    break;
            }
            A00.A03("ipc_step", str2);
            A00.A03("reason", str);
            A00.A00();
        }
    }
}
