package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.widget.ImageView;

/* loaded from: classes11.dex */
public final class U58 extends ImageView {
    public final Paint A00;
    public final Path A01;
    public final float[] A02;

    public U58(Context context, float[] fArr) {
        super(context);
        this.A02 = fArr;
        this.A01 = new Path();
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.DST_OUT);
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.drawPath(this.A01, this.A00);
    }

    public final float[] getRadii() {
        return this.A02;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1547611089);
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.A01;
        path.reset();
        float f = i;
        float f2 = i2;
        path.addRoundRect(new RectF(0.0f, 0.0f, f, f2), this.A02, Path.Direction.CW);
        path.addRect(new RectF(0.0f, 0.0f, f, f2), Path.Direction.CCW);
        path.close();
        C0f9.A0D(-309986971, A06);
    }
}
