package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* renamed from: X.9J8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9J8 {
    public static final void A00(UserSession userSession, Boolean bool, Integer num, String str, String str2, Map map) {
        String str3;
        String name = AbstractC08690cX.A01(userSession).name();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_xposting_destination_setting");
        switch (num.intValue()) {
            case Process.SIGTERM /* 15 */:
                str3 = "destination_picker_flag_reset";
                break;
            case 16:
                str3 = "destination_picker_flag_set";
                break;
            case 17:
                str3 = "destination_unknown_fallback_to_picker";
                break;
            case 18:
                str3 = "empty_destination_id";
                break;
            case Process.SIGSTOP /* 19 */:
                str3 = "client_destination_id_null";
                break;
            case 20:
                str3 = "client_destination_get_name_null";
                break;
            case 21:
                str3 = "server_fetch_one_link_attempt";
                break;
            case 22:
                str3 = "server_fetch_success_one_link";
                break;
            case 23:
                str3 = "server_fetch_failure_one_link";
                break;
            case 24:
                str3 = "fetch_xpost_linkage_type_ttl_expired";
                break;
            case 25:
                str3 = "fetch_xpost_linkage_type_null";
                break;
            case 26:
                str3 = "fetch_xpost_linkage_type_fetch_attempt";
                break;
            case 27:
                str3 = "fetch_xpost_linkage_type_success";
                break;
            case 28:
                str3 = "fetch_xpost_linkage_type_failure";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                str3 = "clear_stale_destination_picker_model";
                break;
            default:
                str3 = "clear_stale_destination_info";
                break;
        }
        A0f.AAP("event_name", str3);
        A0f.AAP("ig_account_type", name);
        A0f.A7v("user_interaction", Boolean.valueOf(bool.booleanValue()));
        if (str == null) {
            str = "";
        }
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0f.A9K("time_since_last_fetch_in_seconds", null);
        A0f.AAP(DialogModule.KEY_MESSAGE, null);
        A0f.A9M("debug_test_data", map);
        A0f.AAP("target_destination_type", null);
        A0f.AAP("linkage_destination_type", str2);
        A0f.Cht();
    }
}
