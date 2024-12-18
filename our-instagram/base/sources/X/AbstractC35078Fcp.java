package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Fcp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35078Fcp {
    public static final C56136Ovw A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C56136Ovw) userSession.A01(C56136Ovw.class, new C57526Pg0(userSession, 13));
    }

    public static final String A01(UserMonetizationProductType userMonetizationProductType) {
        switch (AbstractC25227BEk.A05(userMonetizationProductType, 0)) {
            case 1:
                return "affiliate";
            case 2:
            case Process.SIGTERM /* 15 */:
                return "live";
            case 3:
                return "branded_content";
            case 4:
                return "branded_content_deal_brand";
            case 5:
                return "branded_content_deal_creator";
            case 6:
            case 8:
            case 14:
            default:
                return "unknown";
            case 7:
                return AbstractC58317Pt9.A00(258);
            case 9:
                return "subscriptions";
            case 10:
                return "igtv";
            case 11:
                return "incentive_platform";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "incentive_platform_speaker_engagement";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "reels_overlay_revshare";
        }
    }

    public static final String A02(UserMonetizationProductType userMonetizationProductType) {
        switch (AbstractC25227BEk.A05(userMonetizationProductType, 0)) {
            case 1:
                return "affiliate";
            case 2:
                return "badges_incentives";
            case 3:
            case 4:
            case 5:
                return "branded_content";
            case 6:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            default:
                return "unknown";
            case 7:
                return AbstractC58317Pt9.A00(258);
            case 9:
                return "subscriptions";
            case 10:
                return "revshare";
            case 11:
                return "incentive_platform";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "reels_overlay_ads";
            case Process.SIGTERM /* 15 */:
                return "badges";
        }
    }
}
