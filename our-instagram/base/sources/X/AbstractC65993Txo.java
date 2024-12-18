package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.Txo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65993Txo {
    public static final String A00(MusicProduct musicProduct) {
        switch (AbstractC25227BEk.A05(musicProduct, 0)) {
            case 1:
                return "audio_filters";
            case 2:
                return "audio_global_search";
            case 3:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
                return musicProduct.toString();
            case 4:
                return "story_camera_clips";
            case 5:
                return "story_camera_clips_v2";
            case 6:
                return "clips_edit_metadata";
            case 7:
                return "music_memory_reshare";
            case 8:
                return "music_mention_share";
            case 9:
                return "story_camera_music_effect";
            case 10:
                return "story_camera_music_effects_demo";
            case 11:
                return "story_camera_music_overlay_pre_capture";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "music_in_feed";
            case 14:
                return "music_notes";
            case Process.SIGTERM /* 15 */:
                return "music_on_profile";
            case 17:
            case 18:
            default:
                return "story_camera_music_overlay_post_capture";
            case Process.SIGSTOP /* 19 */:
                return "question_sticker_reply_with_music";
            case 20:
                return "question_sticker_music_response_share";
            case 21:
                return IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS;
        }
    }

    public static final boolean A02(MusicProduct musicProduct) {
        C14360o3.A0B(musicProduct, 0);
        if (musicProduct != MusicProduct.A0L && musicProduct != MusicProduct.A0C && musicProduct != MusicProduct.A0J && musicProduct != MusicProduct.A0F) {
            return false;
        }
        return true;
    }

    public static final boolean A01(MusicProduct musicProduct) {
        switch (musicProduct.ordinal()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 16:
            case 20:
                return true;
            case 3:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            default:
                return false;
        }
    }
}
