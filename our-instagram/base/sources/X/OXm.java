package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public abstract class OXm {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 2;
            case 2:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return 10;
            case 3:
                return 6;
            case 4:
            case 14:
                return 12;
            case 5:
            case 11:
                return 9;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 5;
            case 9:
                return 7;
            case 10:
                return 8;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return 11;
            case Process.SIGTERM /* 15 */:
                return 13;
            case 16:
            case 17:
                return 14;
            case 18:
                return 15;
            case Process.SIGSTOP /* 19 */:
                return 16;
            case 20:
                return 17;
            case 21:
            case 25:
                return 21;
            case 22:
                return 18;
            case 23:
                return 19;
            case 24:
                return 20;
            default:
                return 1;
        }
    }

    public static int A01(Integer num) {
        switch (num.intValue()) {
            case 6:
            case 7:
            case 8:
                return 2;
            case 9:
            case 10:
                return 3;
            default:
                return 1;
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PROCESSING";
            case 2:
                return "UNSAVED_ALBUM_CHANGES";
            case 3:
                return "UNSAVED_PHOTO_CHANGES";
            case 4:
                return "UNSAVED_PHOTO_CHANGES_FROM_ALBUM";
            case 5:
                return "UNSAVED_VIDEO_CHANGES";
            case 6:
                return "PHOTO_POSTING";
            case 7:
                return "VIDEO_POSTING";
            case 8:
                return "PHOTO_MAP";
            case 9:
                return "RENDER_ERROR";
            case 10:
                return "SHADER_ERROR";
            case 11:
                return "SAVE_PHOTO_DRAFT";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "SAVE_VIDEO_DRAFT";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "SAVE_CAROUSEL_DRAFT";
            case 14:
                return "EDIT_CAROUSEL_WITH_MUSIC";
            case Process.SIGTERM /* 15 */:
                return "SAVE_PHOTO_DRAFT_V2";
            case 16:
                return "SAVE_CAROUSEL_DRAFT_V2";
            case 17:
                return "SAVE_PHOTO_DRAFT_BOTTOM_SHEET";
            case 18:
                return "SAVE_CAROUSEL_DRAFT_BOTTOM_SHEET";
            case Process.SIGSTOP /* 19 */:
                return "SAVE_CAROUSEL_DRAFT_BOTTOM_SHEET_NO_EDITS";
            case 20:
                return "SAVING_DRAFT";
            case 21:
                return "SAVING_ALBUM";
            case 22:
                return "SAVE_ERROR_DRAFT";
            case 23:
                return "DELETE_CAROUSEL_PHOTO";
            case 24:
                return "DELETE_CAROUSEL_VIDEO";
            case 25:
                return "FINAL_RENDER";
            default:
                return "LOADING";
        }
    }
}
