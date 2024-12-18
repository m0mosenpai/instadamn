package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9SB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SB extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public final ValueAnimator A01;
    public final Resources A02;
    public final Bitmap A03;
    public final Bitmap A04;
    public final Paint A05 = AbstractC166987dD.A0R();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        canvas.save();
        double d = this.A00;
        double A00 = AbstractC166987dD.A00(bounds);
        Bitmap bitmap = this.A04;
        bitmap.getClass();
        canvas.translate((float) AbstractC70163Da.A04(d, 1.0d, 0.0d, A00, -bitmap.getWidth()), 0.0f);
        Paint paint = this.A05;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.save();
        float f2 = this.A00;
        if (f2 > 0.5d) {
            f = f2 - 0.5f;
        } else {
            f = f2 + 0.5f;
        }
        this.A00 = f;
        double A002 = AbstractC166987dD.A00(bounds);
        Bitmap bitmap2 = this.A03;
        bitmap2.getClass();
        canvas.translate((float) AbstractC70163Da.A04(f, 1.0d, 0.0d, A002, -bitmap2.getWidth()), 0.0f);
        canvas.drawBitmap(bitmap2, 0.0f, this.A02.getDimension(R.dimen.abc_edit_text_inset_top_material), paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    public C9SB(Resources resources) {
        this.A02 = resources;
        this.A04 = BitmapFactory.decodeResource(resources, R.drawable.small_cloud);
        this.A03 = BitmapFactory.decodeResource(resources, R.drawable.big_cloud);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.A01 = ofFloat;
        ofFloat.setInterpolator(null);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(this);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00 = AbstractC166987dD.A09(valueAnimator.getAnimatedValue());
        invalidateSelf();
    }
}
