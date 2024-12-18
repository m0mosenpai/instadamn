package com.instagram.ui.widget.countdowntimer;

import X.AbstractC166997dE;
import X.BBI;
import X.C14360o3;
import X.C185458Kn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CountdownTimerView extends FrameLayout {
    public int A00;
    public AlphaAnimation A01;
    public TextView A02;
    public BBI A03;
    public GradientSpinner A04;
    public C185458Kn A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setCallback(BBI bbi) {
        this.A03 = bbi;
    }

    public final void setNumTicks(int i) {
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 3;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_countdown_timer, this);
        this.A04 = (GradientSpinner) requireViewById(R.id.countdown_timer_spinner);
        this.A02 = AbstractC166997dE.A0T(this, R.id.countdown_timer_title_text);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        this.A01 = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation2 = this.A01;
        C14360o3.A0A(alphaAnimation2);
        alphaAnimation2.setRepeatCount(-1);
        AlphaAnimation alphaAnimation3 = this.A01;
        C14360o3.A0A(alphaAnimation3);
        alphaAnimation3.setRepeatMode(2);
    }

    public /* synthetic */ CountdownTimerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountdownTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
