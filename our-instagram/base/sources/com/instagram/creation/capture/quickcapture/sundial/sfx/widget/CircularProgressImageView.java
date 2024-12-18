package com.instagram.creation.capture.quickcapture.sundial.sfx.widget;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC43594JPz;
import X.B5y;
import X.C14360o3;
import X.C1H6;
import X.C3P9;
import X.InterfaceC09390do;
import X.JQ0;
import X.KKp;
import X.LM4;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CircularProgressImageView extends CircularImageView implements Animator.AnimatorListener {
    public float A00;
    public View.OnClickListener A01;
    public boolean A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05;
    public final InterfaceC09390do A06;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        setAngle(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // com.instagram.common.ui.widget.imageview.CircularImageView, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A02) {
            canvas.drawArc(this.A05, this.A00, 360.0f, false, this.A03);
        }
        canvas.drawArc(this.A05, 270.0f, this.A00, false, this.A04);
    }

    private final LM4 getAnimation() {
        return (LM4) this.A06.getValue();
    }

    public final float getAngle() {
        return this.A00;
    }

    public final View.OnClickListener getItemOnClickListener() {
        return this.A01;
    }

    public final void setItemOnClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public final void setProgressPaintColor(int i) {
        this.A04.setColor(i);
    }

    public final void setShouldDrawProgressBackground(boolean z) {
        this.A02 = z;
    }

    public /* synthetic */ CircularProgressImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    public final void A0I() {
        ValueAnimator valueAnimator = getAnimation().A02;
        if (valueAnimator.isStarted() && !valueAnimator.isPaused()) {
            valueAnimator.pause();
        }
    }

    public final void A0J() {
        LM4 animation = getAnimation();
        animation.A02.cancel();
        CircularProgressImageView circularProgressImageView = animation.A03;
        circularProgressImageView.setAngle(0.0f);
        circularProgressImageView.requestLayout();
    }

    public final void A0K() {
        getAnimation().A02.resume();
    }

    public final void A0L(int i) {
        clearAnimation();
        ValueAnimator valueAnimator = getAnimation().A02;
        valueAnimator.setDuration(i);
        valueAnimator.start();
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.A05;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = measuredWidth;
        rectF.bottom = measuredHeight;
    }

    public final void setAngle(float f) {
        invalidate();
        this.A00 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        float dimension = context.getResources().getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        A0R.setStyle(style);
        A0R.setStrokeWidth(dimension);
        Paint.Cap cap = Paint.Cap.ROUND;
        A0R.setStrokeCap(cap);
        AbstractC43594JPz.A14(context, A0R, R.attr.igds_color_icon_badge);
        this.A04 = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        A0R2.setAntiAlias(true);
        A0R2.setStyle(style);
        A0R2.setStrokeWidth(dimension);
        A0R2.setStrokeCap(cap);
        AbstractC43594JPz.A14(context, A0R2, C1H6.A03() ? R.attr.igds_color_separator_or_stroke_on_media : R.attr.igds_color_separator);
        this.A03 = A0R2;
        this.A05 = AbstractC166987dD.A0X();
        C3P9 A0s = AbstractC166987dD.A0s(this);
        A0s.A04 = new KKp(this, 15);
        A0s.A02 = 0.75f;
        A0s.A07 = false;
        A0s.A00();
        this.A06 = AbstractC09440dt.A01(new B5y(this, 3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressImageView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
