package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.SKt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62659SKt {
    public final Map A00 = AbstractC166987dD.A1I();

    public final Path A00() {
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Path A0T = AbstractC166987dD.A0T();
        Map map = this.A00;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            PointF pointF = (PointF) A1K.getKey();
            if (!A0l.contains(pointF)) {
                A0l.add(pointF);
                A0T.moveTo(pointF.x, pointF.y);
                ArrayDeque arrayDeque = new ArrayDeque(AbstractC58318PtA.A0y(A1K));
                while (!arrayDeque.isEmpty()) {
                    PointF pointF2 = (PointF) arrayDeque.removeLast();
                    if (!A0l.contains(pointF2)) {
                        C14360o3.A0A(pointF2);
                        A0l.add(pointF2);
                        A0T.lineTo(pointF2.x, pointF2.y);
                        Collection collection = (Collection) map.get(pointF2);
                        if (collection != null) {
                            arrayDeque.addAll(collection);
                        }
                    }
                }
                A0T.close();
            }
        }
        return A0T;
    }
}
