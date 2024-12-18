package X;

import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.IGLocalEventDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HoZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39992HoZ {
    public static Map A00(IGLocalEventDict iGLocalEventDict) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGLocalEventDict.BFa() != null) {
            A1I.put("ig_event_time_string", iGLocalEventDict.BFa());
        }
        if (iGLocalEventDict.BFb() != null) {
            EventVisibilityType BFb = iGLocalEventDict.BFb();
            if (BFb != null) {
                str = BFb.A00;
            } else {
                str = null;
            }
            A1I.put("ig_event_visibility", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
