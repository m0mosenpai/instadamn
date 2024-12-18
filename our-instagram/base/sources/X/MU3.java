package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public abstract class MU3 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ARCHIVE_REEL";
            case 2:
                return "BRANDED_CONTENT";
            case 3:
                return "BUSINESS_OR_LINKED_BUSINESS_ACCOUNT";
            case 4:
                return "CLIPS_RESHARE_OF_CROSSPOST_INELIGIBLE_MEDIA";
            case 5:
                return "CLIPS_STORY";
            case 6:
                return "COMMENT_SHARE_STICKER";
            case 7:
                return "DESTINATION_NOT_ELIGIBLE";
            case 8:
                return "FAN_CLUB";
            case 9:
                return "FB_ENTITY_STICKER";
            case 10:
                return "FEED_STICKER";
            case 11:
                return "HIGHLIGHTS";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "IGTV_STICKER";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "IMAGINE";
            case 14:
                return "IMMERSIVE_MENTION_RESHARE";
            case Process.SIGTERM /* 15 */:
                return "INTERNAL_ONLY";
            case 16:
                return "MAGIC_MOD";
            case 17:
                return AbstractC111324zv.A00(157);
            case 18:
                return "MEDIA_IS_NULL";
            case Process.SIGSTOP /* 19 */:
                return "MENTION_RESHARE";
            case 20:
                return "MENTION_RESHARE_OF_CROSSPOST_INELIGIBLE_MEDIA";
            case 21:
                return "MOMENT";
            case 22:
                return "MUSIC_PICK_STICKER";
            case 23:
                return "MY_WEEK_HIGHLIGHT";
            case 24:
                return "NOT_MEDIA";
            case 25:
                return "PHOTO_CRED_STICKER";
            case 26:
                return "PRODUCT_SHARE_STICKER";
            case 27:
                return "RECENTLY_DELETED_MODE_ENABLED";
            case 28:
                return "REEL_MEMORY_SHARE";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "REELS_RESHARE";
            case 30:
                return "SECRET_STICKER";
            case 31:
                return "SHOPPING_STICKER";
            case 32:
                return "STORY_TEMPLATE";
            case 33:
                return "STORY_TEMPLATE_RESHARE_XPOSTING_INELIGIBLE_PINNED_ITEMS";
            case 34:
                return "THREADS_RESHARE";
            case 35:
                return "UNLINKED_MULTI_PARENT_IG_ACCOUNT_IN_CAL";
            case 36:
                return "UNLINKED_WITH_BUSINESS_ACCOUNT_OR_FB_APP_NOT_INSTALLED";
            default:
                return "ARCHIVE_FEED_STICKER";
        }
    }
}
