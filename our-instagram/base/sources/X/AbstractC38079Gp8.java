package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Gp8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38079Gp8 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ad4ad_in_story";
            case 2:
                return "suggested_users_in_story";
            case 3:
                return "story_survey";
            case 4:
                return "story_creation_upsell";
            case 5:
                return "suggested_clips_story_netego";
            case 6:
                return "reconsideration_products_for_you_in_story";
            case 7:
                return "continue_shopping_in_story";
            case 8:
                return "visit_these_shops_again_in_story";
            case 9:
                return "ig_ads_consent_growth_story_netego";
            case 10:
                return "bloks_netego_in_story";
            case 11:
                return AbstractC111324zv.A00(3258);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "ig_insights_story_netego";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC111324zv.A00(5313);
            case 14:
                return AbstractC111324zv.A00(4923);
            case Process.SIGTERM /* 15 */:
                return "threads_in_stories_unit_acquisition";
            default:
                return "ads_bakeoff_survey_in_story";
        }
    }
}
