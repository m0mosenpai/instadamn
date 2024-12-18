package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class MVQ {
    public static final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() > 0) {
            List A0R = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0R, 10));
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(Long.parseLong((String) it.next())));
            }
            return AbstractC001800i.A0U(arrayList2);
        }
        return arrayList;
    }

    public static final void A01(List list, boolean z) {
        C14360o3.A0B(list, 0);
        if (z) {
            list.add(AbstractC31173DnH.A0g());
            if (list.size() > 100) {
                list.remove(0);
            }
        }
    }
}
