package X;

import com.facebook.hyperthrift.HyperThriftBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Xff, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72526Xff {
    public static final List A00(List list) {
        List list2;
        Object obj;
        Number number;
        Object y9d;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HyperThriftBase hyperThriftBase = (HyperThriftBase) it.next();
            HyperThriftBase hyperThriftBase2 = (HyperThriftBase) hyperThriftBase.A00(1);
            HyperThriftBase hyperThriftBase3 = (HyperThriftBase) hyperThriftBase.A00(0);
            if (hyperThriftBase3 != null) {
                Long l = (Long) hyperThriftBase3.A00(0);
                if (l != null) {
                    Integer A00 = AbstractC72527Xfg.A00(l);
                    Integer A002 = AbstractC72527Xfg.A00(Long.valueOf(l.longValue() << 1));
                    if (A00 != null && A002 != null) {
                        y9d = new Object();
                    }
                }
                y9d = new Object();
            } else {
                if (hyperThriftBase2 != null && (number = (Number) hyperThriftBase2.A00(0)) != null) {
                    y9d = new Y9D(number.intValue());
                }
                y9d = new Object();
            }
            A1E.add(y9d);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HyperThriftBase hyperThriftBase4 = (HyperThriftBase) list.get(i);
            YNU ynu = (YNU) A1E.get(i);
            if (ynu instanceof Y9D) {
                Y9D y9d2 = (Y9D) ynu;
                HyperThriftBase hyperThriftBase5 = (HyperThriftBase) hyperThriftBase4.A00(1);
                if (hyperThriftBase5 != null && (list2 = (List) hyperThriftBase5.A00(1)) != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        long A07 = MSY.A07(it2);
                        if (A07 >= 0 && A07 < A1E.size()) {
                            obj = A1E.get((int) A07);
                        } else {
                            obj = new Object();
                        }
                        C14360o3.A0B(obj, 0);
                        y9d2.A00.add(obj);
                    }
                }
            }
        }
        return AbstractC001800i.A0a(A1E);
    }
}
