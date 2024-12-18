package X;

import java.util.concurrent.ConcurrentMap;

/* loaded from: classes11.dex */
public abstract class W8e {
    public static final ConcurrentMap A00;
    public static final ConcurrentMap A01;

    static {
        C18B c18b = new C18B();
        c18b.A03(8);
        A00 = c18b.A00();
        C18B c18b2 = new C18B();
        c18b2.A03(8);
        A01 = c18b2.A00();
    }

    public static final void A00(C70088W2k c70088W2k) {
        String str;
        ConcurrentMap concurrentMap = A00;
        String str2 = c70088W2k.A03;
        if (concurrentMap.containsKey(str2)) {
            C70088W2k c70088W2k2 = (C70088W2k) concurrentMap.get(str2);
            if (c70088W2k2 != null) {
                c70088W2k2.A04.addAll(c70088W2k.A04);
                return;
            }
            return;
        }
        Integer num = c70088W2k.A01;
        C907642p c907642p = new C907642p(C69948VyO.class, "IgInsightsPostGridSurfaceQuery", c70088W2k.A02, true);
        if (3 - num.intValue() != 0) {
            str = "STORY_GRID";
        } else {
            str = "POST_GRID";
        }
        String A0X = AbstractC37303Gc4.A0X(str);
        C66081TzI c66081TzI = new C66081TzI(c70088W2k, 3);
        C907542o c907542o = new C907542o(c70088W2k.A00);
        c907542o.A09(c907642p);
        c907542o.A08 = "insights_policy";
        c907542o.A07 = A0X;
        InterfaceC907842r interfaceC907842r = c907542o.A02;
        if (interfaceC907842r != null) {
            interfaceC907842r.EVy(true);
        }
        C1ON A07 = c907542o.A07(C05F.A00);
        A07.A00 = new Tx4(0, concurrentMap, c70088W2k, c66081TzI);
        C1GJ.A03(A07);
    }

    public static final void A01(C70088W2k c70088W2k) {
        String str;
        ConcurrentMap concurrentMap = A01;
        String str2 = c70088W2k.A03;
        if (concurrentMap.containsKey(str2)) {
            C70088W2k c70088W2k2 = (C70088W2k) concurrentMap.get(str2);
            if (c70088W2k2 != null) {
                c70088W2k2.A04.addAll(c70088W2k.A04);
                return;
            }
            return;
        }
        Integer num = c70088W2k.A01;
        C907642p c907642p = new C907642p(C69949VyP.class, "IgInsightsStoryGridSurfaceQuery", c70088W2k.A02, true);
        if (3 - num.intValue() != 0) {
            str = "STORY_GRID";
        } else {
            str = "POST_GRID";
        }
        String A0X = AbstractC37303Gc4.A0X(str);
        C66081TzI c66081TzI = new C66081TzI(c70088W2k, 4);
        C907542o c907542o = new C907542o(c70088W2k.A00);
        c907542o.A09(c907642p);
        c907542o.A08 = "insights_policy";
        c907542o.A07 = A0X;
        InterfaceC907842r interfaceC907842r = c907542o.A02;
        if (interfaceC907842r != null) {
            interfaceC907842r.EVy(true);
        }
        C1ON A07 = c907542o.A07(C05F.A00);
        A07.A00 = new Tx4(0, concurrentMap, c70088W2k, c66081TzI);
        C1GJ.A03(A07);
    }
}
