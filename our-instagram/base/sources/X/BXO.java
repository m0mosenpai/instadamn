package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BXO extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public BXO(int i, int i2, float f) {
        Paint A0R = AbstractC166987dD.A0R();
        this.A07 = A0R;
        A0R.setAntiAlias(false);
        A0R.setDither(true);
        AbstractC166987dD.A1R(A0R);
        this.A03 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A08 = AbstractC166987dD.A0X();
        this.A04 = Color.alpha(i) / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A07);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = rect.left;
        float f2 = this.A03;
        AbstractC25234BEr.A0m(rect, rectF, f2, f + f2);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        float A02 = AbstractC166987dD.A02(rect.width());
        this.A02 = A02;
        if (A02 > 0.0f) {
            float f3 = f2 / A02;
            float f4 = 1.0f - f3;
            float f5 = (f3 * 0.25f) + f4;
            if (f5 > 1.0f) {
                AbstractC25241Le.A02("CDSCircularShadowDrawable", AnonymousClass001.A0N("Gradient quarter fraction cannot be greater than 1, value is: ", f5));
                return;
            }
            float[] fArr = {0.0f, f4, f4, f5, 1.0f};
            int i = this.A05;
            int i2 = this.A06;
            float f6 = this.A04;
            this.A07.setShader(new RadialGradient(this.A00, this.A01, A02, new int[]{i, i, AbstractC25689BWz.A00(i2, f6), AbstractC25689BWz.A00(i2, f6 * 0.66f), 16777215}, fArr, Shader.TileMode.CLAMP));
        }
    }
}
