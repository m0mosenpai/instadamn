package X;

import android.graphics.Bitmap;
import android.graphics.Point;

/* renamed from: X.Vm9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69363Vm9 {
    public long A00;
    public final double A01;
    public final double A02;
    public final Bitmap A03;
    public final Point A04;
    public final Point A05;

    public C69363Vm9(Bitmap bitmap, Point point, Point point2, Point point3, float f) {
        AbstractC167017dG.A1P(point, point2);
        this.A03 = bitmap;
        this.A05 = new Point(point.x - point3.x, point.y - point3.y);
        Point point4 = new Point(point2.x - point3.x, point2.y - point3.y);
        this.A04 = point4;
        double d = -Math.sin(0.879645943005142d);
        float f2 = r4.y - f;
        double d2 = -Math.sin(5.277875658030852d);
        int i = point4.y;
        double d3 = d2 - d;
        double d4 = (i - f2) / d3;
        double d5 = ((d2 * f2) - (d * i)) / d3;
        this.A01 = (-d4) + d5;
        this.A02 = d4 + d5;
    }
}
