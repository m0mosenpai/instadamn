package com.instagram.ui.widget.pulsingbutton;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25226BEj;
import X.AbstractC31176DnK;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C3DY;
import X.RunnableC36870GMr;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PulsingPillButton extends FrameLayout {
    public float A00;
    public float A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final AnimatorSet A06;
    public final GradientDrawable A07;
    public final FrameLayout A08;
    public final FrameLayout A09;
    public final TypedArray A0A;
    public final GradientDrawable A0B;
    public final GradientDrawable A0C;
    public final View A0D;
    public final ImageView A0E;
    public final ImageView A0F;
    public final ImageView A0G;
    public final ImageView A0H;
    public final LinearLayout A0I;
    public final TextView A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulsingPillButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(context), this, R.layout.pulsing_pill_button, true);
        this.A0D = A0R;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1t);
        C14360o3.A07(obtainStyledAttributes);
        this.A0A = obtainStyledAttributes;
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(A0R, R.id.pulsing_pill_button_container);
        this.A0I = linearLayout;
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(A0R, R.id.pulse_inner_circle);
        this.A08 = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) AbstractC166997dE.A0R(A0R, R.id.pulse_outer_circle);
        this.A09 = frameLayout2;
        this.A0F = AbstractC31176DnK.A0D(A0R, R.id.pulsing_pill_button_icon);
        this.A0G = AbstractC31176DnK.A0D(A0R, R.id.pulsing_pill_button_secondary_icon);
        this.A0H = AbstractC31176DnK.A0D(A0R, R.id.pulsing_pill_button_tertiary_icon);
        this.A0E = AbstractC31176DnK.A0D(A0R, R.id.pulsing_pill_button_end_icon);
        this.A0J = AbstractC167007dF.A0N(A0R, R.id.pulsing_pill_button_text);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A0B = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.A0C = gradientDrawable2;
        this.A06 = new AnimatorSet();
        this.A00 = 4.0f;
        this.A01 = 8.0f;
        this.A02 = 2;
        int color = context.getColor(R.color.audio_bar_action_color_enabled);
        int color2 = context.getColor(R.color.audio_bar_action_color_enabled);
        int color3 = context.getColor(R.color.default_pulsing_pill_button_background_color);
        this.A05 = obtainStyledAttributes.getColor(1, color3);
        int color4 = obtainStyledAttributes.getColor(0, color3);
        int i2 = this.A05;
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i2, color4});
        this.A07 = gradientDrawable3;
        gradientDrawable3.setShape(0);
        linearLayout.setBackground(gradientDrawable3);
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, i2);
        frameLayout.setBackground(gradientDrawable);
        gradientDrawable2.setShape(0);
        gradientDrawable2.setStroke(2, i2);
        frameLayout2.setBackground(gradientDrawable2);
        setButtonText(obtainStyledAttributes.getResourceId(6, 0));
        setButtonTextColor(obtainStyledAttributes.getColor(7, color));
        setButtonDrawable(obtainStyledAttributes.getDrawable(2));
        setIconColor(obtainStyledAttributes.getColor(3, color2));
        setPulsingEnabled(obtainStyledAttributes.getBoolean(4, false));
        this.A02 = obtainStyledAttributes.getInt(5, 0);
        obtainStyledAttributes.recycle();
        this.A08.post(new RunnableC36870GMr(this));
    }

    public final void setEndButtonClickListener(View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 0);
        this.A0E.setOnClickListener(onClickListener);
    }

    public final void A00(int i, int i2) {
        this.A05 = i;
        this.A07.setColors(new int[]{i, i2});
        this.A0B.setStroke(2, i);
        this.A0C.setStroke(2, i);
    }

    public final void setButtonDrawable(Drawable drawable) {
        this.A0F.setImageDrawable(drawable);
    }

    public final void setButtonResource(int i) {
        this.A0F.setImageResource(i);
    }

    public final void setButtonSecondaryResource(int i) {
        ImageView imageView = this.A0G;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    public final void setButtonTertiaryResource(int i) {
        ImageView imageView = this.A0H;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    public final void setButtonText(int i) {
        if (i != 0) {
            this.A0J.setText(i);
            this.A07.setSize(0, 0);
            AnimatorSet animatorSet = this.A06;
            if (animatorSet.isStarted()) {
                animatorSet.end();
                FrameLayout frameLayout = this.A08;
                frameLayout.setVisibility(8);
                this.A09.setVisibility(8);
                frameLayout.post(new RunnableC36870GMr(this));
                return;
            }
            return;
        }
        this.A0J.setText((CharSequence) null);
    }

    public final void setButtonTextCaps(boolean z) {
        this.A0J.setAllCaps(z);
    }

    public final void setButtonTextColor(int i) {
        this.A0J.setTextColor(i);
    }

    public final void setButtonTextStyle(int i) {
        this.A0J.setTextAppearance(i);
    }

    public final void setEndButtonResource(int i) {
        ImageView imageView = this.A0E;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
    }

    public final void setIconColor(int i) {
        this.A0F.setColorFilter(C3DY.A00(i));
        this.A0G.setColorFilter(C3DY.A00(i));
        this.A0H.setColorFilter(C3DY.A00(i));
        this.A0E.setColorFilter(C3DY.A00(i));
    }

    public final void setPulseCircleStrokeColor(int i) {
        this.A0B.setStroke(2, i);
        this.A0C.setStroke(2, i);
    }

    public final void setPulsingEnabled(boolean z) {
        this.A04 = z;
        if (z) {
            if (!this.A06.isStarted()) {
                this.A08.post(new RunnableC36870GMr(this));
            }
        } else {
            AnimatorSet animatorSet = this.A06;
            if (!animatorSet.isStarted()) {
                return;
            }
            animatorSet.end();
        }
    }

    public final View getView() {
        return this.A0D;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.A0I;
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        float f = measuredHeight / 2.0f;
        GradientDrawable gradientDrawable = this.A07;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setSize(measuredWidth, measuredHeight);
        FrameLayout frameLayout = this.A08;
        frameLayout.getLayoutParams().width = measuredWidth;
        frameLayout.getLayoutParams().height = measuredHeight;
        GradientDrawable gradientDrawable2 = this.A0B;
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setSize(measuredWidth, measuredHeight);
        FrameLayout frameLayout2 = this.A09;
        frameLayout2.getLayoutParams().width = measuredWidth;
        frameLayout2.getLayoutParams().height = measuredHeight;
        GradientDrawable gradientDrawable3 = this.A0C;
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setSize(measuredWidth, measuredHeight);
    }

    public final void setInnerCirclePulseDistanceDp(float f) {
        this.A00 = f;
    }

    public final void setOuterCirclePulseDistanceDp(float f) {
        this.A01 = f;
    }

    public final void setPulseInward(boolean z) {
        this.A03 = z;
    }

    public final void setPulseRepeatCount(int i) {
        this.A02 = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PulsingPillButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ PulsingPillButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PulsingPillButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
