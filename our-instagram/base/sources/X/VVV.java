package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public abstract class VVV {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FEED_NETEGO";
                break;
            case 2:
                str = "FEED_ENGAGEMENT_UNIT";
                break;
            case 3:
                str = "FEED_ENGAGEMENT_UNIT_ITEM";
                break;
            case 4:
                str = "FEED_VIDEO";
                break;
            case 5:
                str = "FEED_COMMENT";
                break;
            case 6:
                str = "FEED_HSCROLL_AD";
                break;
            case 7:
                str = "FEED_MULTI_ADS";
                break;
            case 8:
                str = "SEARCH_FEED";
                break;
            case 9:
                str = "AD_STORY";
                break;
            case 10:
                str = "STORY";
                break;
            case 11:
                str = "STORY_ADS";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "STORY_COMMENT";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "STORY_NETEGO";
                break;
            case 14:
                str = "EXPLORE";
                break;
            case Process.SIGTERM /* 15 */:
                str = AbstractC111324zv.A00(3583);
                break;
            case 16:
                str = "SEARCH_GRID";
                break;
            case 17:
                str = "REELS_ADS";
                break;
            case 18:
                str = "REELS_NETEGO";
                break;
            case Process.SIGSTOP /* 19 */:
                str = "REELS_MULTI_ADS";
                break;
            case 20:
                str = "REELS_ORGANIC";
                break;
            case 21:
                str = "UPDATES_HUB";
                break;
            case 22:
                str = "BCN_TEXT_FEED";
                break;
            default:
                str = "FEED";
                break;
        }
        return str.hashCode() + intValue;
    }
}
