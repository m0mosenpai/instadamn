package X;

import com.instagram.common.session.UserSession;
import org.json.JSONObject;

/* renamed from: X.Fd8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35097Fd8 {
    public static final C1ON A01(UserSession userSession, String str, String str2, String str3, JSONObject jSONObject, boolean z) {
        String str4;
        String str5 = null;
        if (jSONObject != null) {
            str4 = jSONObject.toString();
        } else {
            str4 = null;
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("friendships/block/%s/", str2);
        AbstractC31171DnF.A1J(A0c, str2);
        A0c.A9s("surface", str);
        A0c.A9s("container_module", str);
        A0c.A0I("is_auto_block_enabled", z);
        A0c.A0H("client_request_id", str3);
        C38321qM A02 = C1DX.A03.A02(userSession, "BlockUserApi", null);
        if (A02 != null) {
            str5 = AbstractC25226BEj.A1G(A02);
        }
        A0c.A0H("ranking_info_token", str5);
        if (str4 != null) {
            A0c.AA6("entrypoint", str4);
        }
        A0c.A0P(null, C151516rx.class, C151526ry.class, false);
        return AbstractC31172DnG.A0U(A0c, true);
    }

    public static final C1ON A02(UserSession userSession, String str, JSONObject jSONObject) {
        String str2;
        C14360o3.A0B(userSession, 0);
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        } else {
            str2 = null;
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("friendships/block_all_suggested_blocks/");
        A0c.A0H("client_request_id", str);
        A0c.A0P(null, C151516rx.class, C151526ry.class, false);
        if (str2 != null) {
            A0c.AA6("entrypoint", str2);
        }
        return AbstractC31176DnK.A0P(A0c);
    }

    public static final C1ON A00(UserSession userSession, String str, String str2, String str3) {
        boolean A1b = AbstractC25233BEq.A1b(userSession, str, str2);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("friendships/unblock/%s/", str2);
        AbstractC31171DnF.A1J(A0c, str2);
        A0c.A9s("container_module", str);
        A0c.A0H("client_request_id", str3);
        return AbstractC31175DnJ.A0D(A0c, C151516rx.class, C151526ry.class, A1b);
    }
}
