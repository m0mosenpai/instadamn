package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.facebook.R;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.3Eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70523Eo implements InterfaceC70533Ep {
    public Paint A00;
    public final AlphaAnimation A01;
    public final AlphaAnimation A02;
    public final RefreshableNestedScrollingParent A03;
    public final Drawable A04;
    public final LayerDrawable A05;
    public final Transformation A06;
    public final C70543Eq A07;

    public C70523Eo(RefreshableNestedScrollingParent refreshableNestedScrollingParent, boolean z) {
        C14360o3.A0B(refreshableNestedScrollingParent, 1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A01 = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(-0.2f, 0.2f);
        this.A02 = alphaAnimation2;
        this.A06 = new Transformation();
        Context context = refreshableNestedScrollingParent.getContext();
        this.A03 = refreshableNestedScrollingParent;
        this.A07 = new C70543Eq(String.valueOf(refreshableNestedScrollingParent.hashCode()));
        if (z) {
            Paint paint = new Paint();
            this.A00 = paint;
            paint.setColor(AbstractC53242c7.A0F(context, R.attr.dividerColor));
            this.A00.setStrokeWidth(1.0f);
        }
        Drawable drawable = context.getDrawable(R.drawable.refreshable_progress_drawable);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        this.A05 = (LayerDrawable) drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.refreshable_spinner_drawable);
        if (drawable2 != null) {
            this.A04 = drawable2;
            alphaAnimation2.setDuration(300L);
            alphaAnimation.setDuration(700L);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(-1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC70533Ep
    public final void EGe(Canvas canvas, View view, RefreshableNestedScrollingParent refreshableNestedScrollingParent, float f, int i, boolean z) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.A03;
        this.A07.A00(f, refreshableNestedScrollingParent2.A0B);
        if (f <= 0.0f) {
            this.A01.cancel();
            this.A02.cancel();
            return;
        }
        canvas.save();
        try {
            canvas.translate(0.0f, view.getTop() + view.getPaddingTop());
            float width = canvas.getWidth();
            float f2 = i;
            float f3 = f * f2;
            canvas.clipRect(0.0f, 0.0f, width, 1.0f + f3);
            Paint paint = this.A00;
            if (paint != null) {
                canvas.drawLine(0.0f, f3, width, f3, paint);
            }
            int i2 = (int) ((width - f2) / 2.0f);
            if (!refreshableNestedScrollingParent2.A0B) {
                LayerDrawable layerDrawable = this.A05;
                layerDrawable.setBounds(i2, 0, i2 + i, i);
                layerDrawable.setLevel((int) (Math.max(0.0f, f) * 10000.0f));
                layerDrawable.draw(canvas);
            } else {
                AlphaAnimation alphaAnimation = this.A02;
                long drawingTime = refreshableNestedScrollingParent.getDrawingTime();
                Transformation transformation = this.A06;
                if (alphaAnimation.getTransformation(drawingTime, transformation)) {
                    float abs = 1.2f - Math.abs(transformation.getAlpha());
                    canvas.scale(abs, abs, width / 2.0f, i / 2);
                }
                if (this.A01.getTransformation(refreshableNestedScrollingParent.getDrawingTime(), transformation)) {
                    float alpha = transformation.getAlpha();
                    Drawable drawable = this.A04;
                    drawable.setBounds(i2, 0, i2 + i, i);
                    drawable.setLevel((int) (alpha * 10000.0f));
                    drawable.draw(canvas);
                    refreshableNestedScrollingParent.postInvalidateOnAnimation();
                }
            }
        } finally {
            canvas.restore();
        }
    }

    @Override // X.InterfaceC70533Ep
    public final void DA2(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        C70543Eq c70543Eq = this.A07;
        if (c70543Eq.A00 > 0.0d || c70543Eq.A01) {
            c70543Eq.A00 = 0.0d;
            c70543Eq.A01 = false;
            C1KM.A08(c70543Eq.A03);
        }
        this.A01.cancel();
        this.A02.cancel();
    }

    @Override // X.InterfaceC70533Ep
    public final void EWc(boolean z) {
        if (z) {
            AlphaAnimation alphaAnimation = this.A02;
            alphaAnimation.reset();
            alphaAnimation.setStartTime(-1L);
            alphaAnimation.start();
            AlphaAnimation alphaAnimation2 = this.A01;
            alphaAnimation2.reset();
            alphaAnimation2.setStartTime(-1L);
            alphaAnimation2.start();
            this.A03.invalidate();
            return;
        }
        this.A01.cancel();
        this.A02.cancel();
    }
}
