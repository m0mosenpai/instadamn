package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;

/* renamed from: X.K5k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45351K5k extends AbstractC44367Jj6 {
    public float A00;
    public float A01;
    public ValueAnimator A02;
    public final GradientDrawable A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        GradientDrawable gradientDrawable = this.A03;
        gradientDrawable.setBounds(getBounds().left, AbstractC166987dD.A0D(this) - 100, getBounds().right, AbstractC166987dD.A0D(this));
        float A0F = AbstractC166997dE.A0F(this);
        int save = canvas.save();
        canvas.rotate(this.A01, A0F + 0.0f, AbstractC166987dD.A0D(this) - (100.0f * 0.5f));
        try {
            float f = this.A00;
            save = canvas.save();
            canvas.translate(0.0f, f);
            try {
                gradientDrawable.draw(canvas);
                canvas.restoreToCount(save);
                invalidateSelf();
            } finally {
                canvas.restoreToCount(save);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        ValueAnimator valueAnimator = this.A02;
        valueAnimator.cancel();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        valueAnimator.setDuration(300L);
        LMA.A01(valueAnimator, this, 3);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C45351K5k(Context context, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A03 = gradientDrawable;
        float[] A1b = AbstractC43592JPx.A1b();
        // fill-array-data instruction
        A1b[0] = 0.0f;
        A1b[1] = 1.0f;
        this.A02 = ValueAnimator.ofFloat(A1b);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(context.getColor(R.color.avatar_powerups_angry_bubble_to));
    }
}
