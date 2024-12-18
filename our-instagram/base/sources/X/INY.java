package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class INY {
    public static String A00(InterfaceC02590Ai interfaceC02590Ai, C38621GyO c38621GyO, C42710Iv5 c42710Iv5, String str, Map map) {
        List list;
        InterfaceC106374qr interfaceC106374qr;
        String BjV;
        interfaceC02590Ai.AAP("afi_type", str);
        interfaceC02590Ai.AAP("ad_tracking_token", c42710Iv5.A05);
        interfaceC02590Ai.A9M("extra_data", map);
        interfaceC02590Ai.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, A01(c42710Iv5.A04));
        return (c38621GyO == null || (list = c38621GyO.A04) == null || (interfaceC106374qr = (InterfaceC106374qr) AbstractC001800i.A0J(list)) == null || (BjV = interfaceC106374qr.BjV()) == null) ? "" : BjV;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ad_share";
            case 2:
                return "ad_dwell";
            case 3:
                return "invalid";
            case 4:
                return "story_ad_cta";
            case 5:
                return "story_ad_share";
            case 6:
                return "dwell_reels_see_more_less";
            case 7:
                return "ads_overflow_menu";
            case 8:
                return "ad_ufi";
            default:
                return "ad_cta";
        }
    }
}
