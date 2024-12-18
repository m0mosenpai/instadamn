package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.VzA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69990VzA {
    public static C25621Ms A00(UserSession userSession, EnumC39619HeT enumC39619HeT, EnumC65855TvH enumC65855TvH, String str, Map map) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("reports/get_frx_prompt/");
        A0M.A0S(C67831Uz4.class, C69991VzB.class);
        A0M.A9s("frx_prompt_request_type", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0M.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC39619HeT.toString());
        A0M.A9s("location", enumC65855TvH.toString());
        A0M.A9s("container_module", str);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            AbstractC37303Gc4.A16(A0M, A15);
        }
        return A0M;
    }

    public static C1ON A01(UserSession userSession, EnumC68199VFr enumC68199VFr, Integer num, String str, String str2, String str3, String str4, Map map, boolean z) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("reports/get_frx_prompt/");
        A0M.A0S(C67844UzI.class, C69992VzC.class);
        String str5 = "2";
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                case 1:
                    break;
                case 2:
                    str5 = "4";
                    break;
                case 3:
                    str5 = "3";
                    break;
                case 4:
                    str5 = "12";
                    break;
                case 5:
                    str5 = "13";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid payload type");
            }
        }
        A0M.A9s("frx_prompt_request_type", str5);
        A0M.A9s("context", str);
        A0M.A0I("is_dark_mode", z);
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str2);
            String obj = jSONArray.toString();
            if (obj != null) {
                A0M.A9s(AbstractC43591JPw.A00(1313), obj);
            }
        }
        if (str3 != null) {
            A0M.A9s("victim_user_id", str3);
        }
        if (str4 != null) {
            A0M.A9s("tip_number", str4);
        }
        if (enumC68199VFr != null) {
            A0M.A9s("action_type", enumC68199VFr.toString());
        }
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            AbstractC37303Gc4.A16(A0M, A15);
        }
        return A0M.A0N();
    }
}
