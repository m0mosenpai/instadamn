package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.3j5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80753j5 extends Drawable implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, InterfaceC80783j8 {
    public int A00;
    public int A01;
    public Drawable A02;
    public Integer A03;
    public final ValueAnimator A04;
    public final Matrix A05;
    public final Matrix A06;
    public final Drawable A07;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float f;
        float f2;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            Matrix matrix = this.A05;
            matrix.reset();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A00;
            int i2 = intrinsicWidth * i;
            int i3 = this.A01;
            float f3 = 0.0f;
            if (i2 > i3 * intrinsicHeight) {
                f = i / intrinsicHeight;
                f3 = (i3 - (intrinsicWidth * f)) * 0.5f;
                f2 = 0.0f;
            } else {
                f = i3 / intrinsicWidth;
                f2 = (i - (intrinsicHeight * f)) * 0.5f;
            }
            matrix.setScale(f, f);
            matrix.postTranslate((int) (f3 + 0.5f), (int) (f2 + 0.5f));
        }
        Drawable drawable2 = this.A07;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(Drawable drawable, String str, StringBuilder sb) {
        String name;
        if (drawable != 0) {
            sb.append(str);
            sb.append(":");
            if (drawable instanceof InterfaceC80783j8) {
                sb.append(",image:");
                name = ((InterfaceC80783j8) drawable).BGc();
            } else {
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    if (bitmap == null) {
                        return;
                    }
                    sb.append("bmp:");
                    sb.append(bitmap.getWidth());
                    sb.append("x");
                    sb.append(bitmap.getHeight());
                    return;
                }
                sb.append(MSV.A00(647));
                name = drawable.getClass().getName();
            }
            sb.append(name);
        }
    }

    @Override // X.InterfaceC80783j8
    public final String BGc() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[TransitionAnimationDrawable:");
        A01(this.A02, CacheBehaviorLogger.SOURCE, sb);
        sb.append(", src mat:");
        sb.append(this.A05.toShortString());
        A01(this.A07, ", target", sb);
        sb.append(", src mat:");
        sb.append(this.A06.toShortString());
        sb.append(", State:");
        switch (this.A03.intValue()) {
            case 1:
                str = "IN_TRANSITION";
                break;
            case 2:
                str = "POST_TRANSITION";
                break;
            default:
                str = "PRE_TRANSITION";
                break;
        }
        sb.append(str);
        sb.append(", animation:");
        sb.append(this.A04.getAnimatedFraction());
        sb.append("]");
        return sb.toString();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.A02;
        if (this.A03 != C05F.A0C && drawable != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.concat(this.A05);
            drawable.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (this.A03 != C05F.A00) {
            this.A07.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A03 = C05F.A0C;
        this.A07.setAlpha(255);
        this.A02 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A03 = C05F.A01;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A07.setAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.A01 = rect.width();
        this.A00 = rect.height();
        A00();
    }

    public C80753j5(Drawable drawable, Drawable drawable2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        this.A04 = ofInt;
        this.A05 = new Matrix();
        this.A06 = new Matrix();
        this.A03 = C05F.A00;
        this.A02 = drawable;
        this.A07 = drawable2;
        drawable2.setAlpha(0);
        this.A01 = drawable2.getIntrinsicWidth();
        this.A00 = drawable2.getIntrinsicHeight();
        ofInt.addListener(this);
        ofInt.addUpdateListener(this);
        A00();
    }
}
