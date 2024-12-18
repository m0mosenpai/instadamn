package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.97Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97Y {
    public static final C97Y A00 = new Object();

    public final boolean A00(UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342160097322537766L)) {
            return true;
        }
        String A04 = C18U.A04(c06090Tz, userSession, 36880038062194981L);
        if (A04.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(A04);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (C14360o3.A0K(jSONArray.get(i), str)) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
                C18920wW c18920wW = (C18920wW) ((AKJ) userSession.A01(AKJ.class, new X2y(userSession, 48))).A00.getValue();
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "one_link_debug_event");
                A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "");
                A002.AAP("flow", "");
                A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "");
                A002.AAP("caller_context", "");
                A002.AAP("caller_name", str);
                A002.AAP("event", "pdp_caller_name_parse_error");
                A002.AAP("auth_policy", "");
                A002.Cht();
                return true;
            }
        }
        return false;
    }
}
