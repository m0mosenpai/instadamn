package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6S3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6S3 {
    public static ArrayList A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C139136Ru c139136Ru = (C139136Ru) it.next();
            Path path = new Path();
            for (C139156Rw c139156Rw : c139136Ru.A00) {
                Object obj = c139156Rw.A03;
                if (obj == null && (obj = c139156Rw.A02) == null && (obj = c139156Rw.A01) == null && (obj = c139156Rw.A00) == null) {
                    throw new IllegalArgumentException("Unsupported Path action.");
                }
                if (obj instanceof C139146Rv) {
                    C139146Rv c139146Rv = (C139146Rv) obj;
                    path.moveTo(c139146Rv.A00, c139146Rv.A01);
                } else if (obj instanceof C139166Rx) {
                    C139166Rx c139166Rx = (C139166Rx) obj;
                    path.lineTo(c139166Rx.A00, c139166Rx.A01);
                } else if (obj instanceof C6S4) {
                    C6S4 c6s4 = (C6S4) obj;
                    path.addRoundRect(new RectF(c6s4.A03, c6s4.A05, c6s4.A04, c6s4.A02), c6s4.A00, c6s4.A01, c6s4.A06);
                } else if (obj instanceof C139176Ry) {
                    path.close();
                }
            }
            arrayList.add(path);
        }
        return arrayList;
    }
}
