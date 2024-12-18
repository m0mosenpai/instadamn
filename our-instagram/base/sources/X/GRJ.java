package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes6.dex */
public final class GRJ implements Comparator {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GRJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        double d;
        double d2;
        double d3;
        if (this.A00 != 0) {
            ArrayList arrayList = C35163Ff5.A05;
            arrayList.contains(obj);
            if (!arrayList.contains(obj2)) {
                AbstractMap abstractMap = (AbstractMap) this.A01;
                Number A0W = AbstractC31171DnF.A0W(obj, abstractMap);
                double d4 = 0.0d;
                if (A0W != null) {
                    d = A0W.doubleValue();
                } else {
                    d = 0.0d;
                }
                Number A0W2 = AbstractC31171DnF.A0W(obj2, abstractMap);
                if (A0W2 != null) {
                    d2 = A0W2.doubleValue();
                } else {
                    d2 = 0.0d;
                }
                if (d > d2) {
                    return -1;
                }
                if (d >= d2) {
                    AbstractMap abstractMap2 = (AbstractMap) this.A02;
                    Number A0W3 = AbstractC31171DnF.A0W(obj, abstractMap2);
                    if (A0W3 != null) {
                        d3 = A0W3.doubleValue();
                    } else {
                        d3 = 0.0d;
                    }
                    Number A0W4 = AbstractC31171DnF.A0W(obj2, abstractMap2);
                    if (A0W4 != null) {
                        d4 = A0W4.doubleValue();
                    }
                    if (d3 > d4) {
                        return -1;
                    }
                    if (d3 >= d4) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        List list = (List) this.A02;
        return list.indexOf(((C38321qM) obj).A2u()) - list.indexOf(((C38321qM) obj2).A2u());
    }
}
