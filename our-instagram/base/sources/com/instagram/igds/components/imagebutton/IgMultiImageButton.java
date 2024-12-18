package com.instagram.igds.components.imagebutton;

import X.C0f9;
import X.C14360o3;
import X.C153406vA;
import X.InterfaceC11380iw;
import X.RunnableC152986uS;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class IgMultiImageButton extends IgImageButton {
    public RunnableC152986uS A00;
    public int A01;
    public boolean A02;
    public final ValueAnimator A03;
    public final ValueAnimator.AnimatorUpdateListener A04;
    public final C153406vA A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgMultiImageButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView
    public final void A0E(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, int i) {
        C14360o3.A0B(imageUrl, 0);
        RunnableC152986uS runnableC152986uS = this.A00;
        if (runnableC152986uS != null) {
            runnableC152986uS.A00(this);
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        super.A0E(interfaceC11380iw, imageUrl, i);
    }

    @Override // com.instagram.igds.components.imagebutton.IgImageButton, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A02) {
            C153406vA c153406vA = this.A05;
            int i = c153406vA.A00 + c153406vA.A06;
            float f = c153406vA.A07;
            c153406vA.setBounds(0, 0, i, i);
            canvas.save();
            canvas.translate((canvas.getWidth() - i) - f, f);
            c153406vA.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView
    public void setUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        RunnableC152986uS runnableC152986uS = this.A00;
        if (runnableC152986uS != null) {
            runnableC152986uS.A00(this);
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        super.setUrl(imageUrl, interfaceC11380iw);
    }

    public final void setCoordinator(RunnableC152986uS runnableC152986uS) {
        RunnableC152986uS runnableC152986uS2 = this.A00;
        if (runnableC152986uS2 != null) {
            runnableC152986uS2.A00(this);
        }
        this.A00 = runnableC152986uS;
    }

    public final void setNumberedCheckBoxEnabled(boolean z) {
        this.A02 = z;
        invalidate();
    }

    public final void setSelected(int i) {
        this.A01 = i;
        C153406vA c153406vA = this.A05;
        c153406vA.A00(i);
        boolean z = false;
        if (this.A01 > -1) {
            z = true;
        }
        c153406vA.A04 = z;
        c153406vA.invalidateSelf();
        invalidate();
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(616213253);
        super.onAttachedToWindow();
        this.A03.addUpdateListener(this.A04);
        C0f9.A0D(-337634269, A06);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-528950392);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A03;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeUpdateListener(this.A04);
        RunnableC152986uS runnableC152986uS = this.A00;
        if (runnableC152986uS != null) {
            runnableC152986uS.A00(this);
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        C0f9.A0D(-389131031, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgMultiImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.A04 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.6v9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IgMultiImageButton.this.invalidate();
            }
        };
        this.A05 = new C153406vA(context);
    }

    public /* synthetic */ IgMultiImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgMultiImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
