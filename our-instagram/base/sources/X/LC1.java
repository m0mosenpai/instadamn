package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public abstract class LC1 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "reply";
            case 2:
                return MSV.A00(1074);
            case 3:
                return "report";
            case 4:
                return "unsend";
            case 5:
                return "remove";
            case 6:
                return "good_result";
            case 7:
                return "bad_result";
            case 8:
                return "forward";
            case 9:
                return "share";
            case 10:
                return "save_media";
            case 11:
                return "save_quick_reply";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "copy";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "unlike";
            case 14:
                return "like";
            case Process.SIGTERM /* 15 */:
                return "details";
            case 16:
                return "camera_reply_for_expiring_media";
            case 17:
                return "report_bug_for_vm";
            case 18:
                return "see_all_by_creator";
            case Process.SIGSTOP /* 19 */:
                return "share_to_story";
            case 20:
                return "pin";
            case 21:
                return "unpin";
            case 22:
                return "delete_shared_stack";
            case 23:
                return "edit";
            case 24:
                return "message_armadillo_express";
            case 25:
                return "good_response";
            case 26:
                return "bad_response";
            case 27:
                return "ai_subscription_manage_update";
            case 28:
                return "reimagine";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "delete_message";
            case 30:
                return "delete_single_message";
            case 31:
                return "translate_message";
            case 32:
                return "restore_message";
            case 33:
                return "hide_translation";
            case 34:
                return "show_translation";
            case 35:
                return "save_sticker";
            case 36:
                return "unsave_sticker";
            case 37:
                return "more";
            case 38:
                return "debug";
            case 39:
                return "paid_partnership";
            case 40:
                return "creator_ai_inspect_message";
            case Seq.NULL_REFNUM /* 41 */:
                return "hide_broadcast_channel_reply";
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return "uncover_broadcast_channel_reply";
            case 43:
                return "unhide_broadcast_channel_reply";
            case 44:
                return "resend";
            case 45:
                return "save_cutout_sticker";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return "add_sticker_reaction";
            case 47:
                return "xma_action";
            case 48:
                return "provide_agent_refinement_feedback";
            case 49:
                return "regenerate_ai_response";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return AbstractC111324zv.A00(2302);
            case 51:
                return "imagine_me";
            case 52:
                return "unsend_prompt";
            case 53:
                return "share_prompt";
            case 54:
                return "report_prompt";
            case 55:
                return "view_sticker_pack";
            case 56:
                return "create_sticker_from_media";
            case 57:
                return "create_cutout";
            case 58:
                return "create_your_own";
            case 59:
                return "see_info";
            case 60:
                return NetInfoModule.CONNECTION_TYPE_NONE;
            default:
                return "message_status";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "REPLY";
            case 2:
                return "COMMENT_REPLY";
            case 3:
                return "REPORT";
            case 4:
                return "UNSEND";
            case 5:
                return "REMOVE";
            case 6:
                return "GOOD_RESULT";
            case 7:
                return "BAD_RESULT";
            case 8:
                return "FORWARD";
            case 9:
                return "SHARE";
            case 10:
                return "SAVE_MEDIA";
            case 11:
                return "SAVE_QUICK_REPLY";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "COPY_TEXT";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "UNLIKE";
            case 14:
                return "LIKE";
            case Process.SIGTERM /* 15 */:
                return "DETAILS_FOR_EXPIRING_MEDIA";
            case 16:
                return "CAMERA_REPLY_FOR_EXPIRING_MEDIA";
            case 17:
                return "REPORT_BUG_FOR_VISUAL_MEDIA";
            case 18:
                return "SEE_ALL_BY_CREATOR";
            case Process.SIGSTOP /* 19 */:
                return "SHARE_TO_STORY";
            case 20:
                return "PIN";
            case 21:
                return "UNPIN";
            case 22:
                return "DELETE_SHARED_STACK";
            case 23:
                return "EDIT";
            case 24:
                return "MESSAGE_ARMADILLO_EXPRESS";
            case 25:
                return "GOOD_RESPONSE";
            case 26:
                return "BAD_RESPONSE";
            case 27:
                return "AI_SUBSCRIPTION_MANAGE_UPDATE";
            case 28:
                return "REIMAGINE";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "DELETE_MESSAGE";
            case 30:
                return "DELETE_SINGLE_MESSAGE";
            case 31:
                return "TRANSLATE_MESSAGE";
            case 32:
                return "RESTORE_MESSAGE";
            case 33:
                return "HIDE_TRANSLATION";
            case 34:
                return "SHOW_TRANSLATION";
            case 35:
                return "SAVE_STICKER";
            case 36:
                return "UNSAVE_STICKER";
            case 37:
                return "MORE";
            case 38:
                return "Debug";
            case 39:
                return "PAID_PARTNERSHIP";
            case 40:
                return "CREATOR_AI_INSPECT_MESSAGE";
            case Seq.NULL_REFNUM /* 41 */:
                return "HIDE_BC_REPLY";
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return "UNCOVER_BC_REPLY";
            case 43:
                return "UNHIDE_BC_REPLY";
            case 44:
                return "RESEND";
            case 45:
                return "SAVE_CUTOUT_STICKER";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return "ADD_STICKER_REACTION";
            case 47:
                return "XMA_ACTION";
            case 48:
                return "HANDLE_EDIT_AI_FOR_MESSAGE";
            case 49:
                return "REGENERATE_AI_RESPONSE";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return "EDIT_WITH_AI_FOR_IMAGE";
            case 51:
                return "IMAGINE_ME";
            case 52:
                return "UNSEND_PROMPT";
            case 53:
                return "SHARE_PROMPT";
            case 54:
                return "REPORT_PROMPT";
            case 55:
                return "VIEW_STICKER_PACK";
            case 56:
                return "CREATE_CUTOUT_STICKER_FROM_MEDIA";
            case 57:
                return "CREATE_CUTOUT";
            case 58:
                return "CREATE_YOUR_OWN";
            case 59:
                return "SEE_INFO";
            case 60:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            default:
                return "MESSAGE_STATUS_TEXT";
        }
    }
}
