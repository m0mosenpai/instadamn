package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BYF extends Drawable {
    public final float A00;
    public final Paint A01;
    public final Path A02 = AbstractC166987dD.A0T();
    public final RectF A03 = AbstractC166987dD.A0X();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawPath(this.A02, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        rectF.set(0.0f, 0.0f, rect.width(), rect.height());
        Path path = this.A02;
        path.reset();
        float f = this.A00;
        float[] fArr = {f, f, f, f};
        AbstractC167017dG.A1X(fArr, f);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public BYF(Context context, float f, float f2) {
        this.A00 = f;
        Paint A0Q = AbstractC166997dE.A0Q();
        AbstractC166987dD.A1N(context, A0Q, AbstractC53242c7.A02(context));
        AbstractC166987dD.A1R(A0Q);
        A0Q.setShadowLayer(f2, 0.0f, 0.0f, AbstractC167007dF.A09(context, R.attr.igds_color_shadow_on_media));
        this.A01 = A0Q;
    }
}
