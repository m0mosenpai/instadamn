package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class U8J extends Drawable {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final Path A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        int A0H = AbstractC166997dE.A0H(this);
        int i = this.A01 * 2;
        float f = A0H - i;
        float A0G = AbstractC166997dE.A0G(this) - i;
        Path path = this.A05;
        Paint paint = this.A02;
        canvas.drawPath(path, paint);
        path.close();
        canvas.translate(f, 0.0f);
        Path path2 = this.A06;
        canvas.drawPath(path2, paint);
        path2.close();
        canvas.translate(0.0f, A0G);
        Path path3 = this.A04;
        canvas.drawPath(path3, paint);
        path3.close();
        canvas.translate(-f, 0.0f);
        Path path4 = this.A03;
        canvas.drawPath(path4, paint);
        path4.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public U8J(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        Paint paint = new Paint();
        paint.setColor(paint.getColor());
        this.A02 = paint;
        Region region = new Region(0, 0, i, i);
        Path path = new Path();
        float f = i;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f, f, f, direction);
        Region region2 = new Region();
        region2.setPath(path, region);
        Region.Op op = Region.Op.DIFFERENCE;
        region.op(region2, op);
        Path boundaryPath = region.getBoundaryPath();
        C14360o3.A07(boundaryPath);
        this.A05 = boundaryPath;
        int i3 = i * 2;
        Region region3 = new Region(i, 0, i3, i);
        Path path2 = new Path();
        path2.addCircle(f, f, f, direction);
        Region region4 = new Region();
        region4.setPath(path2, region3);
        region3.op(region4, op);
        Path boundaryPath2 = region3.getBoundaryPath();
        C14360o3.A07(boundaryPath2);
        this.A06 = boundaryPath2;
        Region region5 = new Region(0, i, i, i3);
        Path path3 = new Path();
        path3.addCircle(f, f, f, direction);
        Region region6 = new Region();
        region6.setPath(path3, region5);
        region5.op(region6, op);
        Path boundaryPath3 = region5.getBoundaryPath();
        C14360o3.A07(boundaryPath3);
        this.A03 = boundaryPath3;
        Region region7 = new Region(i, i, i3, i3);
        Path path4 = new Path();
        path4.addCircle(f, f, f, direction);
        Region region8 = new Region();
        region8.setPath(path4, region7);
        region7.op(region8, op);
        Path boundaryPath4 = region7.getBoundaryPath();
        C14360o3.A07(boundaryPath4);
        this.A04 = boundaryPath4;
    }
}
