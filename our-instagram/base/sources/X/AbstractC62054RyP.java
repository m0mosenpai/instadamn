package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import go.Seq;

/* renamed from: X.RyP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62054RyP {
    public static String A00(int i) {
        if (i == 55) {
            return "PR_CAMERA_CAMERA_ROLL_OPEN_TTI";
        }
        if (i == 56) {
            return "PR_CAMERA_CAMERA_ROLL_CLOSE_TTI";
        }
        if (i == 70) {
            return "PR_CAMERA_TEXT_STYLE_TRAY_OPEN_TTI";
        }
        if (i == 71) {
            return "PR_CAMERA_TEXT_STYLE_TRAY_CLOSE_TTI";
        }
        switch (i) {
            case 6:
                return "PR_CAMERA_APPLY_EFFECT_TTI";
            case 10:
                return "PR_CAMERA_PAGE_TRANSITION_TIME";
            case 16:
                return "PR_CAMERA_INSPIRATION_UPDATE";
            case 17:
                return "PR_CAMERA_CAMERA_FIRST_FRAME_TTI";
            case 18:
                return "PR_CAMERA_PR_CAMERA_EFFECT_TRAY_TTI";
            case Process.SIGSTOP /* 19 */:
                return "PR_CAMERA_PHOTO_CAPTURE";
            case 20:
                return "PR_CAMERA_TIME_TO_START_CAPTURE_VIDEO";
            case 21:
                return "PR_CAMERA_TIME_TO_END_CAPTURE_VIDEO";
            case 22:
                return "PR_CAMERA_CAMERA_INITIAL_PHOTO_TTI";
            case 23:
                return "PR_CAMERA_CAMERA_INITIAL_VIDEO_TTI";
            case 24:
                return "PR_CAMERA_SIMPLE_METRIC";
            case 25:
                return "PR_CAMERA_CAMERA_INITIAL_MEDIAS_TTI";
            case 26:
                return "PR_CAMERA_CAMERA_ROLL_PHOTO_PICKING_TTI";
            case 27:
                return "PR_CAMERA_CAMERA_ROLL_VIDEO_PICKING_TTI";
            case 81:
                return "PR_CAMERA_FORM_CHANGE_TTI";
            case 90:
                return "PR_CAMERA_SAVE_MEDIA_TO_DISK";
            case 99:
                return "PR_CAMERA_TONE_FILTER_TTI";
            case 108:
                return "PR_CAMERA_STORIES_SCRUBBER_LOADING_TTI";
            case 109:
                return "PR_CAMERA_THUMBNAIL_LOAD_TTRC";
            case 1224:
                return "PR_CAMERA_PTV_PROCESSING_TTRC";
            case 2351:
                return "PR_CAMERA_TIME_TO_SHARE_POST";
            case 2660:
                return "PR_CAMERA_ENGINE_FILTER_RENDER_TTI";
            case 2727:
                return "PR_CAMERA_TIMER_BOTTOM_SHEET_OPEN_TTI";
            case 2832:
                return "PR_CAMERA_PRIVACY_SETTINGS_TTI";
            case 3378:
                return "PR_CAMERA_TIME_TO_PLAY_MUSIC_IN_CAMERA";
            case 3392:
                return "PR_CAMERA_GREEN_SCREEN_SCENE_TTI";
            case 3966:
                return "PR_CAMERA_SHARING_TO_IG_LAUNCH_TTI";
            case 4104:
                return "PR_CAMERA_EFFECT_MINI_GALLERY_TTI";
            case 4167:
                return "PR_CAMERA_SMART_EDIT";
            case 4744:
                return "PR_CAMERA_TIME_TO_DELETE_VIDEO_CLIP";
            case 4925:
                return "PR_CAMERA_EDITOR_NEXT_BUTTON_TTI";
            case 5219:
                return "PR_CAMERA_REELS_PRE_CAPTURE_MUSIC_SELECT_TTI";
            case 5490:
                return "PR_CAMERA_UEG_TTRC";
            case 6313:
                return "PR_CAMERA_TRY_ON_LAUNCH_TTI";
            case 6810:
                return "PR_CAMERA_SHARE_SHEET_TTRC";
            case 7286:
                return "PR_CAMERA_BUX_ERROR";
            case 7378:
                return "PR_CAMERA_PHOTO_TO_VIDEO_CONVERSION_TTI";
            case 7834:
                return "PR_CAMERA_MAGIC_MOD_FETCH_GENERATED_IMAGES";
            case 8206:
                return "PR_CAMERA_CAMERA_TTI";
            case 10146:
                return "PR_CAMERA_MAGIC_MOD_UPLOAD_PHOTO";
            case 10497:
                return "PR_CAMERA_MUSIC_PICKER_SAVED_AUDIO_OPEN_TTI";
            case 11314:
                return "PR_CAMERA_THREE_SECONDS_VIDEO_CAPTURE";
            case 11830:
                return "PR_CAMERA_SOUND_SYNC_MEDIA_DOWNLOADING";
            case 11856:
                return "PR_CAMERA_CAMERA_ROLL_MEDIA_PICKING_TTI";
            case 12668:
                return "PR_CAMERA_SHARE_REEL_BUTTON_RENDER_TTI";
            case 12786:
                return "PR_CAMERA_FB_CREATION_AUDIO_PLAYBACK_TTI";
            case 13025:
                return "PR_CAMERA_SEARCH_EFFECT_TTI";
            case 14478:
                return "PR_CAMERA_AUTO_ENHANCE_TTI";
            case 14509:
                return "PR_CAMERA_EFFECT_GALLERY_TTI";
            default:
                switch (i) {
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        return "PR_CAMERA_CAMERA_FIRST_FRAME_TTRC";
                    case 30:
                        return "PR_CAMERA_CAMERA_INITIAL_PHOTO_TTRC";
                    case 31:
                        return "PR_CAMERA_CAMERA_INITIAL_VIDEO_TTRC";
                    case 32:
                        return "PR_CAMERA_CAMERA_INITIAL_MEDIAS_TTRC";
                    case 33:
                        return "PR_CAMERA_MUSIC_PICKER_LAUNCH_TTI";
                    case 34:
                        return "PR_CAMERA_MUSIC_PICKER_PREVIEW_TTI";
                    case 35:
                        return "PR_CAMERA_MUSIC_PICKER_SELECT_SONG_TTI";
                    case 36:
                        return "PR_CAMERA_DOODLE_TOOL_LAUNCH_TTI";
                    default:
                        switch (i) {
                            case 40:
                                return "PR_CAMERA_TEXT_TOOL_OPEN_TTI";
                            case Seq.NULL_REFNUM /* 41 */:
                                return "PR_CAMERA_TEXT_TOOL_CLOSE_TTI";
                            case Seq.RefTracker.REF_OFFSET /* 42 */:
                                return "PR_CAMERA_TEXT_TOOL_ADJUSTING_TTI";
                            case 43:
                                return "PR_CAMERA_STICKER_CHANGE_STYLE_TTI";
                            case 44:
                                return "PR_CAMERA_STICKER_CLICKED_IN_TRAY_TTI";
                            case 45:
                                return "PR_CAMERA_STICKER_ADJUSTING_TTI";
                            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                                return "PR_CAMERA_STICKER_REACTION_ANIMATION_TTI";
                            case 47:
                                return "PR_CAMERA_STICKER_TRAY_SCROLL_TTI";
                            case 48:
                                return "PR_CAMERA_STICKER_TRAY_OPEN_TTI";
                            case 49:
                                return "PR_CAMERA_STICKER_TRAY_CLOSE_TTI";
                            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                                return "PR_CAMERA_LOAD_PHOTO_FROM_GALLERY_TIME";
                            case 51:
                                return "PR_CAMERA_START_IN_TEXT_MODE";
                            default:
                                switch (i) {
                                    case 61:
                                        return "PR_CAMERA_EDIT_GALLERY_OPEN_TTI";
                                    case 62:
                                        return "PR_CAMERA_EDIT_GALLERY_CLOSE_TTI";
                                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                                        return "PR_CAMERA_EFFECTS_TRAY_OPEN_TTI";
                                    case 64:
                                        return "PR_CAMERA_EFFECTS_TRAY_CLOSE_TTI";
                                    default:
                                        switch (i) {
                                            case 74:
                                                return "PR_CAMERA_VIDEO_TRIMMING_TRAY_OPEN_TTI";
                                            case 75:
                                                return "PR_CAMERA_VIDEO_TRIMMING_TRAY_CLOSE_TTI";
                                            case 76:
                                                return "PR_CAMERA_MUSIC_PICKER_EDITING_TRAY_OPEN_TTI";
                                            case 77:
                                                return "PR_CAMERA_MUSIC_PICKER_EDITING_TRAY_CLOSE_TTI";
                                            case 78:
                                                return "PR_CAMERA_MUSIC_PICKER_TRAY_OPEN_TTI";
                                            case 79:
                                                return "PR_CAMERA_MUSIC_PICKER_TRAY_CLOSE_TTI";
                                            default:
                                                switch (i) {
                                                    case 83:
                                                        return "PR_CAMERA_TIME_TO_OPEN_SHARE_SHEET";
                                                    case 84:
                                                        return "PR_CAMERA_DOODLE_TOOL_DRAWING_TTI";
                                                    case 85:
                                                        return "PR_CAMERA_START_IN_SINGLE_MEDIA_PREVIEW_FROM_LANDING";
                                                    case 86:
                                                        return "PR_CAMERA_TEXT_MODE_CONTENT_READY";
                                                    case 87:
                                                        return "PR_CAMERA_START_IN_MULTI_MEDIA_PREVIEW_FROM_LANDING";
                                                    default:
                                                        switch (i) {
                                                            case 92:
                                                                return "PR_CAMERA_BOOMERANG_TRAY_OPEN_TTI";
                                                            case 93:
                                                                return "PR_CAMERA_BOOMERANG_TRAY_CLOSE_TTI";
                                                            case 94:
                                                                return "PR_CAMERA_POST_CAPTURE_BOOMERANG_GENERATION_TIME";
                                                            default:
                                                                switch (i) {
                                                                    case 102:
                                                                        return "PR_CAMERA_PHOTO_PROCESSING_TTRC";
                                                                    case 103:
                                                                        return "PR_CAMERA_VIDEO_PROCESSING_TTRC";
                                                                    case 104:
                                                                        return "PR_CAMERA_STICKER_FETCH_TTRC";
                                                                    case 105:
                                                                        return "PR_CAMERA_TEXT_MODE_PROCESSING_TTRC";
                                                                    default:
                                                                        return "UNDEFINED_QPL_EVENT";
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
