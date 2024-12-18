package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes7.dex */
public abstract class I56 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return AbstractC111324zv.A00(246);
            case 1:
                return "nas_story_gap_rules_are_zero";
            case 2:
                return "next_sponsored_item_is_non_ad_item";
            case 3:
                return "next_sponsored_item_is_ad_pod";
            case 4:
                return AbstractC111324zv.A00(3871);
            case 5:
                return AbstractC111324zv.A00(439);
            case 6:
                return "next_ad_is_iaa";
            case 7:
                return "gap_zero_story_seed_ad_is_ad_pod";
            case 8:
                return "gap_zero_story_seed_ad_is_iaa";
            case 9:
                return "gap_zero_story_next_item_impressed";
            case 10:
                return "gap_zero_story_non_gap_zero_rules";
            case 11:
                return "next_ad_slot_story_gap_zero_rules";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "received_multiple_reel_view_models";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "multiple_items_in_intent_aware_ad_reels";
            default:
                return "seed_ad_is_multi_ad_carousel";
        }
    }
}
