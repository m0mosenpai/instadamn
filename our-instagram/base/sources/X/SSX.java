package X;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class SSX {
    public static List A01(zzf zzfVar) {
        double radians = Math.toRadians(zzfVar.A00);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        int i = zzfVar.A01;
        int i2 = zzfVar.A02;
        double d = zzfVar.A03;
        Point point = new Point((int) (i + (d * cos)), (int) (i2 + (d * sin)));
        double d2 = point.x;
        double d3 = zzfVar.A04;
        Point point2 = r6[0];
        int i3 = point2.x;
        Point point3 = r6[2];
        int i4 = point3.x;
        Point point4 = r6[1];
        Point[] pointArr = {new Point(i, i2), point, new Point((int) (d2 - (d3 * sin)), (int) (pointArr[1].y + (d3 * cos))), new Point(i3 + (i4 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }

    public static Rect A00(List list) {
        Iterator it = list.iterator();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            int i5 = point.x;
            i3 = Math.min(i3, i5);
            i = Math.max(i, i5);
            int i6 = point.y;
            i4 = Math.min(i4, i6);
            i2 = Math.max(i2, i6);
        }
        return new Rect(i3, i4, i, i2);
    }
}
