package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import go.Seq;

/* renamed from: X.Rv5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61873Rv5 {
    public static String A00(int i) {
        if (i == 25) {
            return "COMPOSER_COMPOSER_NEW_MODEL_BUILDER";
        }
        if (i == 26) {
            return "COMPOSER_COMPOSER_INLINE_MEDIA_PICKER_VISIBLE";
        }
        if (i == 29) {
            return "COMPOSER_INLINE_COMPOSER_LAUNCH_TRIGGER";
        }
        if (i == 30) {
            return "COMPOSER_CS_ALBUM_LIST_TTI";
        }
        switch (i) {
            case 2:
                return "COMPOSER_PHOTO_LOAD";
            case 39:
                return "COMPOSER_COMPOSER_CONTENT_READY_FROM_NEWSFEED";
            case Seq.NULL_REFNUM /* 41 */:
                return "COMPOSER_COMPOSER_CUSTOM_FONT_FETCH";
            case 43:
                return "COMPOSER_COMPOSER_CONTENT_READY_FROM_UI";
            case 1094:
                return "COMPOSER_GEMINI_FORMATTING_ACTIONS";
            case 1589:
                return "COMPOSER_CAMERA_ROLL_INTERACTIONS";
            case 2732:
                return "COMPOSER_COMPOSER_MEDIA_CREATE_CURSOR";
            case 3553:
                return "COMPOSER_INTERACTION";
            case 7698:
                return "COMPOSER_COMPOSER_POST_FCR";
            case 11038:
                return "COMPOSER_COMPOSER_MUTATION";
            case 12414:
                return "COMPOSER_CREATOR_COMPOSER_TTRC";
            default:
                switch (i) {
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return "COMPOSER_LIFE_EVENT_FETCH_BIRTHDAY";
                    case 14:
                        return "COMPOSER_TEENS_SHARESHEET_FETCH_GROUPS";
                    case Process.SIGTERM /* 15 */:
                        return "COMPOSER_COMPOSER_REFERRER_HANDOFF";
                    case 16:
                        return "COMPOSER_COMPOSER_FRAGMENT_ONCREATE";
                    case 17:
                        return "COMPOSER_COMPOSER_LAUNCH_PHASE";
                    case 18:
                        return "COMPOSER_COMPOSER_DEPENDENCY_INJECTION";
                    case Process.SIGSTOP /* 19 */:
                        return "COMPOSER_COMPOSER_RENDER_MARKER";
                    case 20:
                        return "COMPOSER_COMPOSER_DRAW_MARKER";
                    case 21:
                        return "COMPOSER_COMPOSER_FRAGMENT_SETUP";
                    case 22:
                        return "COMPOSER_COMPOSER_FRAGMENT_CREATE_VIEW";
                    default:
                        switch (i) {
                            case 47:
                                return "COMPOSER_COMPOSER_LAUNCH_TTI";
                            case 48:
                                return "COMPOSER_STORIES_COMPOSER_LAUNCH";
                            case 49:
                                return "COMPOSER_STORIES_COMPOSER_LAUNCH_TTI";
                            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                                return "COMPOSER_STORIES_COMPOSER_CONTENT_READY";
                            case 51:
                                return "COMPOSER_FEED_COMPOSER_CONTENT_READY";
                            default:
                                return "UNDEFINED_QPL_EVENT";
                        }
                }
        }
    }
}
