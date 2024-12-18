package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BYK extends Drawable {
    public static final float[] A07;
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final boolean A05;
    public final RectF A06;

    static {
        int A00 = AbstractC25689BWz.A00(-6278145, 0.1f);
        A09 = new int[]{A00, AbstractC25689BWz.A00(-15173646, 0.1f), AbstractC25689BWz.A00(-14298266, 0.1f), AbstractC25689BWz.A00(-668109, 0.1f), AbstractC25689BWz.A00(-37796, 0.1f), A00};
        int A002 = AbstractC25689BWz.A00(-7982634, 0.2f);
        A08 = new int[]{A002, AbstractC25689BWz.A00(-15111988, 0.2f), AbstractC25689BWz.A00(-14438052, 0.2f), AbstractC25689BWz.A00(-3494861, 0.2f), AbstractC25689BWz.A00(-2990252, 0.2f), A002};
        A07 = new float[]{0.0f, 0.15428571f, 0.46666667f, 0.6027778f, 0.69166666f, 1.0f};
        A0A = new int[]{16777215, 16777215, AbstractC25689BWz.A00(-16777216, 0.3f), AbstractC25689BWz.A00(-16777216, 0.2f), 16777215};
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public BYK(Context context, C6FH c6fh) {
        Paint A0R = AbstractC166987dD.A0R();
        this.A04 = A0R;
        A0R.setAntiAlias(false);
        A0R.setDither(true);
        AbstractC166987dD.A1R(A0R);
        this.A03 = U5C.A00(context, 12.0f);
        this.A06 = AbstractC166987dD.A0X();
        this.A05 = c6fh.CSL();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(94.0f, this.A00, this.A01);
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A04);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int[] iArr;
        super.onBoundsChange(rect);
        RectF rectF = this.A06;
        float f = rect.left;
        float f2 = this.A03;
        AbstractC25234BEr.A0m(rect, rectF, f2, f + f2);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = AbstractC166987dD.A02(rect.width());
        if (this.A05) {
            iArr = A08;
        } else {
            iArr = A09;
        }
        SweepGradient sweepGradient = new SweepGradient(this.A00, this.A01, iArr, A07);
        float f3 = this.A02;
        if (f3 > 0.0f) {
            float f4 = f2 / f3;
            float f5 = 1.0f - f4;
            float f6 = (f4 * 0.25f) + f5;
            if (f6 > 1.0f) {
                AbstractC25241Le.A02("CDSCircularShadowDrawable", AnonymousClass001.A0N("Gradient quarter fraction cannot be greater than 1, value is: ", f6));
            } else {
                this.A04.setShader(new ComposeShader(new RadialGradient(this.A00, this.A01, f3, A0A, new float[]{0.0f, f5, f5, f6, 1.0f}, Shader.TileMode.CLAMP), sweepGradient, PorterDuff.Mode.SRC_IN));
            }
        }
    }
}
