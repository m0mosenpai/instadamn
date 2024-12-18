package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WEP {
    public static final C2TB A03;
    public final double[] A02 = new double[2];
    public final C2TB A01 = new Object();
    public final C69401Vml A00 = new C69401Vml(A03, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A01 = 0.0d;
        obj.A03 = 0.0d;
        obj.A02 = 1.0d;
        obj.A00 = 1.0d;
        A03 = obj;
    }

    public static void A00(C69401Vml c69401Vml, WEP wep, C2TB c2tb, Collection collection) {
        double d = c2tb.A01;
        double d2 = c2tb.A02;
        if (d > d2) {
            C2TB c2tb2 = wep.A01;
            c2tb2.A03 = c2tb.A03;
            c2tb2.A00 = c2tb.A00;
            c2tb2.A01 = d;
            c2tb2.A02 = d2;
            c2tb2.A02 = 1.0d;
            A00(c69401Vml, wep, c2tb2, collection);
            c2tb2.A03 = c2tb.A03;
            c2tb2.A00 = c2tb.A00;
            c2tb2.A01 = c2tb.A01;
            c2tb2.A02 = c2tb.A02;
            c2tb2.A01 = 0.0d;
            A00(c69401Vml, wep, c2tb2, collection);
            return;
        }
        C2TB c2tb3 = c69401Vml.A06;
        if (c2tb3.A01 > d2 || d > c2tb3.A02 || c2tb3.A03 > c2tb.A00 || c2tb.A03 > c2tb3.A00) {
            return;
        }
        if (!c69401Vml.A04) {
            A00(c69401Vml.A01, wep, c2tb, collection);
            A00(c69401Vml.A00, wep, c2tb, collection);
            A00(c69401Vml.A03, wep, c2tb, collection);
            A00(c69401Vml.A02, wep, c2tb, collection);
            return;
        }
        boolean A01 = c2tb.A01(c2tb3);
        ArrayList arrayList = c69401Vml.A07;
        if (A01) {
            collection.addAll(arrayList);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC71891X8y interfaceC71891X8y = (InterfaceC71891X8y) it.next();
            double[] dArr = wep.A02;
            interfaceC71891X8y.Amj(dArr);
            if (c2tb.A00(dArr[0], dArr[1])) {
                collection.add(interfaceC71891X8y);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.2TB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.2TB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.2TB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.2TB, java.lang.Object] */
    public static boolean A01(InterfaceC71891X8y interfaceC71891X8y, C69401Vml c69401Vml, WEP wep) {
        int i;
        double[] dArr = wep.A02;
        interfaceC71891X8y.Amj(dArr);
        C2TB c2tb = c69401Vml.A06;
        boolean z = true;
        if (!c2tb.A00(dArr[0], dArr[1])) {
            return false;
        }
        if (c69401Vml.A04) {
            ArrayList arrayList = c69401Vml.A07;
            if (arrayList.size() >= 40 && (i = c69401Vml.A05) <= 20) {
                double d = c2tb.A01;
                double d2 = c2tb.A02;
                double d3 = (d + d2) * 0.5d;
                double d4 = c2tb.A03;
                double d5 = (d4 + c2tb.A00) * 0.5d;
                ?? obj = new Object();
                obj.A01 = d3;
                obj.A03 = d4;
                obj.A02 = d2;
                obj.A00 = d5;
                int i2 = i + 1;
                c69401Vml.A00 = new C69401Vml(obj, i2);
                double d6 = c2tb.A01;
                double d7 = c2tb.A00;
                ?? obj2 = new Object();
                obj2.A01 = d6;
                obj2.A03 = d5;
                obj2.A02 = d3;
                obj2.A00 = d7;
                c69401Vml.A03 = new C69401Vml(obj2, i2);
                double d8 = c2tb.A01;
                double d9 = c2tb.A03;
                ?? obj3 = new Object();
                obj3.A01 = d8;
                obj3.A03 = d9;
                obj3.A02 = d3;
                obj3.A00 = d5;
                c69401Vml.A01 = new C69401Vml(obj3, i2);
                double d10 = c2tb.A02;
                double d11 = c2tb.A00;
                ?? obj4 = new Object();
                obj4.A01 = d3;
                obj4.A03 = d5;
                obj4.A02 = d10;
                obj4.A00 = d11;
                c69401Vml.A02 = new C69401Vml(obj4, i2);
                c69401Vml.A04 = false;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC71891X8y interfaceC71891X8y2 = (InterfaceC71891X8y) arrayList.get(i3);
                    if (!A01(interfaceC71891X8y2, c69401Vml.A01, wep) && !A01(interfaceC71891X8y2, c69401Vml.A00, wep) && !A01(interfaceC71891X8y2, c69401Vml.A03, wep)) {
                        A01(interfaceC71891X8y2, c69401Vml.A02, wep);
                    }
                }
                arrayList.clear();
            } else {
                arrayList.add(interfaceC71891X8y);
                return z;
            }
        }
        if (!A01(interfaceC71891X8y, c69401Vml.A01, wep) && !A01(interfaceC71891X8y, c69401Vml.A00, wep) && !A01(interfaceC71891X8y, c69401Vml.A03, wep)) {
            z = false;
            if (A01(interfaceC71891X8y, c69401Vml.A02, wep)) {
                return true;
            }
            return z;
        }
        return true;
    }
}
