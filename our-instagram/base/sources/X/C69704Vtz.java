package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vtz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69704Vtz {
    public C70397WTz A00;
    public final WEP A01 = new WEP();
    public final List A02 = new LinkedList();
    public final double[] A03 = new double[2];
    public final int A04;

    public final void A00(WFW wfw, C2TB c2tb, Collection collection, Map map) {
        float f = this.A04;
        C66356UBx c66356UBx = wfw.A00.A0I;
        double d = f / (((float) c66356UBx.A0K) * c66356UBx.A0C);
        C70397WTz c70397WTz = this.A00;
        if (c70397WTz != null) {
            c70397WTz.A09.A00(19150949);
        }
        List list = this.A02;
        list.clear();
        WEP wep = this.A01;
        WEP.A00(wep.A00, wep, c2tb, list);
        double d2 = d * d;
        while (!list.isEmpty()) {
            Iterator it = list.iterator();
            C71193Wpi c71193Wpi = (C71193Wpi) it.next();
            it.remove();
            double[] dArr = this.A03;
            c71193Wpi.Amj(dArr);
            double d3 = dArr[0];
            double d4 = dArr[1];
            String str = (String) map.get(c71193Wpi.A04);
            C71196Wpl c71196Wpl = new C71196Wpl();
            c71196Wpl.A05(c71193Wpi);
            while (it.hasNext()) {
                C71193Wpi c71193Wpi2 = (C71193Wpi) it.next();
                Object obj = map.get(c71193Wpi2.A04);
                c71193Wpi2.Amj(dArr);
                double d5 = d3 - dArr[0];
                double d6 = d4 - dArr[1];
                if ((d5 * d5) + (d6 * d6) < d2) {
                    if (str == null) {
                        if (obj == null) {
                            c71196Wpl.A05(c71193Wpi2);
                            it.remove();
                        }
                    } else if (str.equals(obj)) {
                        c71196Wpl.A05(c71193Wpi2);
                        it.remove();
                    }
                }
            }
            collection.add(c71196Wpl);
        }
        if (c70397WTz != null) {
            int size = list.size();
            int size2 = collection.size();
            C69598Vs1 c69598Vs1 = c70397WTz.A09;
            QuickPerformanceLogger quickPerformanceLogger = c69598Vs1.A03;
            quickPerformanceLogger.markerAnnotate(19150949, "beforeCount", size);
            quickPerformanceLogger.markerAnnotate(19150949, "afterCount", size2);
            quickPerformanceLogger.markerEnd(19150949, c69598Vs1.A02, (short) 2);
        }
    }

    public final void A01(Collection collection) {
        WEP wep = this.A01;
        C69401Vml c69401Vml = wep.A00;
        c69401Vml.A07.clear();
        c69401Vml.A04 = true;
        c69401Vml.A01 = null;
        c69401Vml.A00 = null;
        c69401Vml.A03 = null;
        c69401Vml.A02 = null;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            WEP.A01(new C71193Wpi((InterfaceC71945XBu) it.next()), c69401Vml, wep);
        }
    }

    public C69704Vtz(C70397WTz c70397WTz, Collection collection, int i) {
        this.A04 = i;
        this.A00 = c70397WTz;
        A01(collection);
    }
}
