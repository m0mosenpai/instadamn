package X;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

/* renamed from: X.SHo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62588SHo {
    public final Rect A00;
    public final String A01;
    public final String A02;
    public final Point[] A03;

    public AbstractC62588SHo(Rect rect, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = new Rect(rect);
        Point[] pointArr = new Point[list.size()];
        for (int i = 0; i < list.size(); i++) {
            pointArr[i] = new Point((Point) list.get(i));
        }
        this.A03 = pointArr;
        this.A02 = str2;
    }
}
