package X;

import android.text.Editable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ADx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23041ADx {
    public static final List A01(List list) {
        String A05;
        C1575075i c1575075i;
        String str;
        C7CG c7cg;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51753Mtc c51753Mtc = (C51753Mtc) it.next();
            AbstractC160207Gg abstractC160207Gg = (AbstractC160207Gg) c51753Mtc.A02;
            Integer A03 = abstractC160207Gg.A03();
            Long l = null;
            if (A03 != null) {
                int intValue = A03.intValue();
                if (!(abstractC160207Gg instanceof C7CG) || (c7cg = (C7CG) abstractC160207Gg) == null || (A05 = c7cg.A07()) == null) {
                    A05 = abstractC160207Gg.A05();
                }
                int i = c51753Mtc.A01;
                int length = A05.length();
                if ((abstractC160207Gg instanceof C1575075i) && (c1575075i = (C1575075i) abstractC160207Gg) != null && (str = c1575075i.A06) != null) {
                    l = AbstractC166997dE.A0j(str);
                }
                A1E.add(new C206179Ba(l, 0L, length, intValue, i, 0));
            }
        }
        return A1E;
    }

    public static final List A00(Editable editable) {
        A7L[] a7lArr;
        if (editable != null && (a7lArr = (A7L[]) editable.getSpans(0, editable.length(), A7L.class)) != null) {
            ArrayList arrayList = new ArrayList(a7lArr.length);
            for (A7L a7l : a7lArr) {
                arrayList.add(new C51753Mtc(a7l.A00, Math.max(0, editable.getSpanStart(a7l))));
            }
            return arrayList;
        }
        return C16930sl.A00;
    }
}
