package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class YCX implements YNt {
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, X.XpS] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, X.XpS] */
    @Override // X.YNt
    public final /* bridge */ /* synthetic */ Object ECl(Object obj, Object obj2) {
        boolean z;
        String str;
        C72577XhG c72577XhG;
        YDO ydo;
        YDP ydp;
        YDP ydp2;
        C72863XpS c72863XpS;
        Y0H y0h = (Y0H) obj;
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj2;
        if (abstractC72503XfI instanceof XYS) {
            XYS xys = (XYS) abstractC72503XfI;
            C72863XpS c72863XpS2 = y0h.A03;
            z = y0h.A06;
            str = y0h.A05;
            c72577XhG = y0h.A00;
            ydo = y0h.A04;
            ydp = y0h.A02;
            ydp2 = y0h.A01;
            long j = xys.A00 + ((AbstractC72503XfI) xys).A00;
            ?? obj3 = new Object();
            HashMap hashMap = new HashMap(c72863XpS2.A00);
            obj3.A00 = hashMap;
            hashMap.put("cs_periodic_ping", new C72762Xme(xys, y0h, j));
            c72863XpS = obj3;
        } else if (abstractC72503XfI instanceof XY1) {
            C72863XpS c72863XpS3 = y0h.A03;
            z = y0h.A06;
            str = y0h.A05;
            c72577XhG = y0h.A00;
            ydo = y0h.A04;
            ydp = y0h.A02;
            ydp2 = y0h.A01;
            String str2 = ((XY1) abstractC72503XfI).A00;
            ?? obj4 = new Object();
            HashMap hashMap2 = new HashMap(c72863XpS3.A00);
            obj4.A00 = hashMap2;
            hashMap2.remove(str2);
            c72863XpS = obj4;
        } else if (abstractC72503XfI instanceof XXu) {
            if (y0h.A06) {
                return y0h;
            }
            C72863XpS c72863XpS4 = y0h.A03;
            str = y0h.A05;
            c72577XhG = y0h.A00;
            ydo = y0h.A04;
            ydp = y0h.A02;
            ydp2 = y0h.A01;
            z = true;
            c72863XpS = c72863XpS4;
        } else {
            if (!(abstractC72503XfI instanceof XY8)) {
                return y0h;
            }
            XY8 xy8 = (XY8) abstractC72503XfI;
            C72863XpS c72863XpS5 = y0h.A03;
            z = y0h.A06;
            str = y0h.A05;
            c72577XhG = y0h.A00;
            ydo = xy8.A02;
            ydp = xy8.A01;
            ydp2 = xy8.A00;
            c72863XpS = c72863XpS5;
        }
        return new Y0H(c72577XhG, ydp, ydp2, c72863XpS, ydo, str, z);
    }
}
