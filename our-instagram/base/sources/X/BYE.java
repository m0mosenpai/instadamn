package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.creation.capture.GridShimmerView;

/* loaded from: classes5.dex */
public final class BYE extends Drawable {
    public float A00;
    public final float A01;
    public final Paint A02;
    public final RectF A03;
    public final /* synthetic */ GridShimmerView A04;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        float f2 = bounds.right;
        float f3 = this.A01;
        float f4 = (f2 - (2.0f * f3)) / 3.0f;
        this.A00 = f4;
        float f5 = bounds.top;
        while (true) {
            float f6 = f4 + f5;
            f = bounds.bottom;
            if (f6 > f) {
                break;
            }
            float f7 = bounds.left;
            int i = 0;
            do {
                RectF rectF = this.A03;
                rectF.set(f7, f5, f7 + f4, f4 + f5);
                canvas.drawRect(rectF, this.A02);
                f4 = this.A00;
                f7 = f7 + f4 + f3;
                i++;
            } while (i < 3);
            f5 = f5 + f4 + f3;
        }
        if (f5 < f) {
            float f8 = bounds.left;
            int i2 = 0;
            do {
                RectF rectF2 = this.A03;
                rectF2.set(f8, f5, f4 + f8, f);
                canvas.drawRect(rectF2, this.A02);
                f4 = this.A00;
                f8 = f8 + f4 + f3;
                i2++;
            } while (i2 < 3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public BYE(GridShimmerView gridShimmerView) {
        this.A04 = gridShimmerView;
        Paint A0P = AbstractC166997dE.A0P();
        this.A02 = A0P;
        AbstractC166987dD.A1R(A0P);
        AbstractC166987dD.A1N(gridShimmerView.getContext(), A0P, R.color.grey_1);
        this.A01 = gridShimmerView.getResources().getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        this.A03 = AbstractC166987dD.A0X();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
