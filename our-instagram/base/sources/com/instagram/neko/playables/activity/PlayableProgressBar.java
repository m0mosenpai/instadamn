package com.instagram.neko.playables.activity;

import X.AbstractC43592JPx;
import X.C14360o3;
import X.C70203WGv;
import X.JQ0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class PlayableProgressBar extends ProgressBar {
    public int A00;
    public ObjectAnimator A01;
    public final long A02;
    public final long A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = 300L;
        this.A02 = 300L;
        this.A01 = new ObjectAnimator();
    }

    public final void A00(int i) {
        int i2 = i * 100;
        if (i2 > getProgress() && i2 > this.A00) {
            this.A00 = i2;
            int progress = getProgress();
            this.A01.cancel();
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, ReactProgressBarViewManager.PROP_PROGRESS, progress, i2);
            this.A01 = ofInt;
            ofInt.setDuration(this.A03);
            AbstractC43592JPx.A1B(this.A01);
            if (i == 100) {
                this.A01.addListener(new C70203WGv(this, 5));
            }
            this.A01.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A03 = 300L;
        this.A02 = 300L;
        this.A01 = new ObjectAnimator();
    }

    public /* synthetic */ PlayableProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayableProgressBar(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A03 = 300L;
        this.A02 = 300L;
        this.A01 = new ObjectAnimator();
    }
}
