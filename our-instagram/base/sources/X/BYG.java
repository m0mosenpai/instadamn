package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BYG extends Drawable {
    public final ClipDrawable A00;
    public final Paint A01;
    public final RectF A02;
    public final ShapeDrawable A03;
    public final float[] A04;
    public final int[] A05;

    public BYG(Context context) {
        boolean A02 = AbstractC13620mo.A02(context);
        this.A02 = AbstractC166987dD.A0X();
        Paint A0R = AbstractC166987dD.A0R();
        this.A01 = A0R;
        this.A04 = AbstractC23047AEd.A00();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        this.A03 = shapeDrawable;
        this.A00 = new ClipDrawable(shapeDrawable, A02 ? 5 : 3, 1);
        AbstractC166987dD.A1N(context, A0R, R.color.design_dark_default_color_on_background);
        this.A05 = AbstractC23047AEd.A01(context);
        this.A00.mutate().setLevel((int) (0.0f * 10000.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawRect(this.A02, this.A01);
        this.A00.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        this.A00.setBounds(rect);
        this.A03.getPaint().setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A05, this.A04, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
