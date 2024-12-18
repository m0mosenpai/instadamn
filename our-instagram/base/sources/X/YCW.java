package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class YCW implements YNt {
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.XpS] */
    @Override // X.YNt
    public final /* bridge */ /* synthetic */ Object ECl(Object obj, Object obj2) {
        Y05 y05;
        Y06 y06 = (Y06) obj;
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj2;
        if (abstractC72503XfI instanceof C72207XYb) {
            C72207XYb c72207XYb = (C72207XYb) abstractC72503XfI;
            if (c72207XYb.A01) {
                y05 = new Y05(y06);
                y05.A00 = c72207XYb.A00;
            } else {
                return y06;
            }
        } else if (abstractC72503XfI instanceof XYV) {
            XYV xyv = (XYV) abstractC72503XfI;
            C72863XpS c72863XpS = y06.A01;
            ?? obj3 = new Object();
            HashMap hashMap = new HashMap(c72863XpS.A00);
            obj3.A00 = hashMap;
            MSX.A1N(xyv.A01.A01, hashMap, xyv.A00);
            y05 = new Y05(y06);
            y05.A01 = obj3;
        } else {
            if (!(abstractC72503XfI instanceof XXy)) {
                return y06;
            }
            y05 = new Y05(y06);
            y05.A03 = ((XXy) abstractC72503XfI).A00;
        }
        return new Y06(y05.A00, y05.A01, y05.A02, y05.A03);
    }
}
