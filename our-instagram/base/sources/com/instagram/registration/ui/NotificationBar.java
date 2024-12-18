package com.instagram.registration.ui;

import X.AbstractC31174DnI;
import X.AnimationAnimationListenerC35726Fq0;
import X.C05F;
import X.GMU;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public class NotificationBar extends TextView {
    public Animation A00;
    public Context A01;
    public Animation A02;
    public Integer A03;
    public final Runnable A04;

    private void A00(Context context) {
        this.A01 = context;
        this.A00 = AnimationUtils.loadAnimation(context, R.anim.notification_slide_down);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.A01, R.anim.notification_slide_up);
        this.A02 = loadAnimation;
        loadAnimation.setAnimationListener(new AnimationAnimationListenerC35726Fq0(this, 6));
    }

    public static void A01(NotificationBar notificationBar) {
        if (notificationBar.A01 != null) {
            notificationBar.startAnimation(notificationBar.A02);
        }
        notificationBar.A03 = C05F.A0C;
    }

    public final void A02() {
        if (this.A03 == C05F.A01) {
            A01(this);
        }
    }

    public final void A03() {
        if (this.A03 != C05F.A0C) {
            removeCallbacks(this.A04);
            A01(this);
        }
    }

    public final void A04(String str, int i, int i2) {
        removeCallbacks(this.A04);
        if (this.A03 != C05F.A0C) {
            A01(this);
        }
        this.A03 = C05F.A01;
        setText(str);
        setTextColor(i2);
        AbstractC31174DnI.A1C(this, i);
        setVisibility(0);
        startAnimation(this.A00);
    }

    public NotificationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = C05F.A0C;
        this.A04 = new GMU(this);
        A00(context);
    }

    public NotificationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = C05F.A0C;
        this.A04 = new GMU(this);
        A00(context);
    }

    public NotificationBar(Context context) {
        super(context);
        this.A03 = C05F.A0C;
        this.A04 = new GMU(this);
        A00(context);
    }
}
