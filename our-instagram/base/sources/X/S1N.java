package X;

import android.graphics.Point;
import android.graphics.Rect;
import com.facebook.smartcapture.diagnostic.Color;
import com.facebook.smartcapture.diagnostic.PolygonAnnotation;

/* loaded from: classes10.dex */
public abstract class S1N {
    public static final PolygonAnnotation A00(Rect rect, Color color, Color color2, int i) {
        return new PolygonAnnotation(new Point[]{new Point(rect.left, rect.top), new Point(rect.right, rect.top), new Point(rect.right, rect.bottom), new Point(rect.left, rect.bottom)}, color, i, color2);
    }
}
