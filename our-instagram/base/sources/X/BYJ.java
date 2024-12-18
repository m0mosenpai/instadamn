package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BYJ extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final RectF A04 = AbstractC166987dD.A0X();
    public final float[] A05;
    public final int[] A06;

    public BYJ(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A02 = dimensionPixelSize;
        this.A01 = AbstractC166997dE.A04(context, R.dimen.abc_action_bar_elevation_material);
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setStyle(Paint.Style.STROKE);
        AbstractC166987dD.A1N(context, A0S, R.color.grey_2);
        A0S.setStrokeWidth(dimensionPixelSize);
        this.A03 = A0S;
        this.A05 = AbstractC23047AEd.A00();
        this.A06 = AbstractC23047AEd.A01(context);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A04;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        float A02 = AbstractC166987dD.A02(this.A02);
        AbstractC25234BEr.A0m(rect, this.A04, A02, rect.left + A02);
        A00(this);
    }

    public static final void A00(BYJ byj) {
        LinearGradient linearGradient;
        boolean z = byj.A00;
        Paint paint = byj.A03;
        if (z) {
            RectF rectF = byj.A04;
            linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, byj.A06, byj.A05, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        paint.setShader(linearGradient);
        byj.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
