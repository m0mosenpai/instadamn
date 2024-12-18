package X;

import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDG {
    public static Map A00(InterfaceC88193wT interfaceC88193wT) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC88193wT.BFL() != null) {
            A1I.put("ig_ads_feed_video_watch_and_browse_viewer_min_screen_threshold", AnonymousClass010.A0m(String.valueOf(interfaceC88193wT.BFL())));
        }
        if (interfaceC88193wT.BFM() != null) {
            IGAdsFeedVideoWBViewerTypeEnum BFM = interfaceC88193wT.BFM();
            if (BFM != null) {
                str = BFM.A00;
            } else {
                str = null;
            }
            A1I.put("ig_ads_feed_video_watch_and_browse_viewer_type", str);
        }
        if (interfaceC88193wT.CeE() != null) {
            A1I.put("is_tall_video", interfaceC88193wT.CeE());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
