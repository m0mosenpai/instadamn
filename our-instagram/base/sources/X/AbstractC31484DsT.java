package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.DsT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31484DsT {
    public static final C1ON A00(UserSession userSession, Integer num, String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(userSession, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("discover/chaining/");
        A0M.A9s("target_id", str);
        A0M.A0I("profile_chaining_check", z);
        A0M.A0R(C168027ex.class, C168037ey.class);
        if (num != C05F.A0C) {
            switch (num.intValue()) {
                case 0:
                    str3 = "profile";
                    break;
                case 1:
                    str3 = "feed_su";
                    break;
                default:
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
            }
            A0M.A9s("module", str3);
        }
        if (str2 != null) {
            A0M.A9s("from_module", str2);
        }
        return A0M.A0N();
    }
}
