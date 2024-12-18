package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.DwN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31718DwN {
    public static final void A01(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 0);
        AbstractC31173DnH.A1S(A00(num), userSession);
    }

    public static final C19280xC A00(Integer num) {
        String str;
        C1QE A01 = C1QE.A01("capture_flow");
        switch (num.intValue()) {
            case 3:
                str = "share_media";
                break;
            case 4:
                str = "media_upload";
                break;
            case 5:
                str = "filter_finished";
                break;
            case 6:
                str = "share_successful";
                break;
            case 7:
                str = "capture_flow_canceled";
                break;
            case 8:
                str = "drafts_dialog";
                break;
            case 9:
                str = "drafts_shown_in_gallery";
                break;
            case 10:
                str = "inline_gallery_launch";
                break;
            case 11:
                str = "inline_gallery_media_selected";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "inline_gallery_launch_full_creation_flow";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "inline_gallery_dismiss";
                break;
            case 14:
                str = "click_folder_in_picker";
                break;
            case Process.SIGTERM /* 15 */:
                str = "click_preview_media_in_picker";
                break;
            case 16:
                str = "crop_adjustment_gesture";
                break;
            case 17:
                str = "crop_media_toggle_tap";
                break;
            case 18:
                str = "select_media_in_picker";
                break;
            case Process.SIGSTOP /* 19 */:
                str = "picker_tab_opened";
                break;
            case 20:
                str = "photo_camera_tab_opened";
                break;
            case 21:
                str = "video_camera_tab_opened";
                break;
            case 22:
                str = "shutter_click_in_camera";
                break;
            case 23:
                str = "shutter_long_press_in_camera";
                break;
            case 24:
                str = "shutter_press_in_video";
                break;
            case 25:
                str = "open_photo_gallery";
                break;
            case 26:
                str = "picker_opened_from_photo";
                break;
            case 27:
                str = "built_in_camera";
                break;
            case 28:
                str = "share_intent_photo_import";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                str = "crop_photo";
                break;
            case 30:
                str = "crop_finished";
                break;
            case 31:
                str = "photo_filter_tried";
                break;
            case 32:
                str = "filter_photo";
                break;
            case 33:
                str = "filter_photo_error";
                break;
            case 34:
                str = "high_quality_resize";
                break;
            case 35:
                str = "basic_resize_fallback";
                break;
            case 36:
                str = "basic_resize_preference";
                break;
            case 37:
                str = "built_in_video";
                break;
            case 38:
                str = "open_video_gallery";
                break;
            case 39:
                str = "picker_opened_from_video";
                break;
            case 40:
                str = "share_intent_video_import";
                break;
            case Seq.NULL_REFNUM /* 41 */:
                str = "video_filter_tried";
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                str = "filter_video";
                break;
            case 43:
                str = "trim_video";
                break;
            case 44:
                str = "choose_video_cover";
                break;
            case 45:
                str = "share_button_click";
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                str = "filter_drag_start";
                break;
            case 47:
                str = "filter_drag_place";
                break;
            case 48:
                str = "filter_drag_hide";
                break;
            case 49:
                str = "filter_visibility";
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                str = "filter_tray_order";
                break;
            case 51:
                str = "boomerang_modal_nux_displayed";
                break;
            case 52:
                str = "boomerang_modal_nux_launch_play_store";
                break;
            case 53:
                str = "boomerang_installed_from_playstore";
                break;
            case 54:
                str = "boomerang_modal_nux_app_switch";
                break;
            case 55:
                str = "boomerang_attribution_app_switch";
                break;
            case 56:
                str = "profile_picture_launch";
                break;
            case 57:
                str = "profile_pic";
                break;
            case 58:
                str = "edit_profile";
                break;
            case 59:
                str = "profile_highlights_choose_camera_roll_cover_photo";
                break;
            case 60:
                str = "edit_group_avatar";
                break;
            default:
                str = "bloks_profile_pic";
                break;
        }
        return A01.A04(str);
    }
}
