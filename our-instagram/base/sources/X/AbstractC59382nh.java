package X;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.2nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59382nh {
    public static final C59392ni A00(PointF pointF, Rect rect, Object obj, String str, Map map, Map map2, Map map3, Map map4, Map map5) {
        C59392ni c59392ni = new C59392ni();
        if (rect != null) {
            c59392ni.A01 = rect.width();
            c59392ni.A00 = rect.height();
        }
        c59392ni.A06 = str;
        if (pointF != null) {
            c59392ni.A03 = Float.valueOf(pointF.x);
            c59392ni.A04 = Float.valueOf(pointF.y);
        }
        c59392ni.A05 = obj;
        c59392ni.A09 = map3;
        c59392ni.A0A = map5;
        c59392ni.A0C = map2;
        c59392ni.A08 = map;
        c59392ni.A0B = map4;
        return c59392ni;
    }
}
