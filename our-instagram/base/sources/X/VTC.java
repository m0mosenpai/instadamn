package X;

import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VTC {
    public static ArrayList A00(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnalyticsEventDebugInfo analyticsEventDebugInfo = (AnalyticsEventDebugInfo) it.next();
            List list2 = analyticsEventDebugInfo.A01;
            if (list2.size() > 0) {
                AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) list2.get(0);
                if ("extra".equals(analyticsEventEntry.A02)) {
                    AnalyticsEventDebugInfo analyticsEventDebugInfo2 = analyticsEventEntry.A00;
                    if (analyticsEventDebugInfo2.A01.size() > 0) {
                        AnalyticsEventEntry analyticsEventEntry2 = (AnalyticsEventEntry) analyticsEventDebugInfo2.A01.get(0);
                        if ("m_pk".equals(analyticsEventEntry2.A02) && str.equals(analyticsEventEntry2.A01)) {
                            arrayList.add(analyticsEventDebugInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
