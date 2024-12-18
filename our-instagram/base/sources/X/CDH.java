package X;

import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDH {
    public static Map A00(InterfaceC38171q4 interfaceC38171q4) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38171q4.AwY() != null) {
            A1I.put("delay_time_in_ms", interfaceC38171q4.AwY());
        }
        String str = null;
        if (interfaceC38171q4.B9g() != null) {
            List<IGAdsStoryInteractiveMediaGestureType> B9g = interfaceC38171q4.B9g();
            if (B9g != null) {
                arrayList = AbstractC167017dG.A0q(B9g);
                for (IGAdsStoryInteractiveMediaGestureType iGAdsStoryInteractiveMediaGestureType : B9g) {
                    C14360o3.A0B(iGAdsStoryInteractiveMediaGestureType, 0);
                    arrayList.add(iGAdsStoryInteractiveMediaGestureType.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("gesture_types", arrayList);
        }
        if (interfaceC38171q4.BIw() != null) {
            IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum BIw = interfaceC38171q4.BIw();
            if (BIw != null) {
                str = BIw.A00;
            }
            A1I.put("interactive_media_design_option", str);
        }
        if (interfaceC38171q4.CWo() != null) {
            A1I.put("is_interactive_media_available", interfaceC38171q4.CWo());
        }
        if (interfaceC38171q4.Bq2() != null) {
            A1I.put("safezone_left_and_right", AnonymousClass010.A0m(String.valueOf(interfaceC38171q4.Bq2())));
        }
        if (interfaceC38171q4.Bq3() != null) {
            A1I.put("safezone_top_and_bottom", AnonymousClass010.A0m(String.valueOf(interfaceC38171q4.Bq3())));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
