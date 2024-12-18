package com.instagram.creation.video.ui;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31173DnH;
import X.AbstractC43841Ja4;
import X.C05F;
import X.C23831Eq;
import X.C44059Jdk;
import X.C44274JhQ;
import X.MRD;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public class VideoCaptureTimerView extends FrameLayout implements MRD {
    public Animation A00;
    public ImageView A01;
    public TextView A02;
    public C44274JhQ A03;

    public VideoCaptureTimerView(Context context) {
        this(context, null);
    }

    @Override // X.MRD
    public final void D4l(C44059Jdk c44059Jdk) {
    }

    @Override // X.MRD
    public final void D4s(C44059Jdk c44059Jdk) {
    }

    @Override // X.MRD
    public final void D4t() {
    }

    @Override // X.MRD
    public final void Dgq() {
    }

    private void A00() {
        this.A03.getClass();
        this.A02.setText(C23831Eq.A02(r0.A01.A00()));
    }

    @Override // X.MRD
    public final void D4m(C44059Jdk c44059Jdk, Integer num) {
        if (num == C05F.A00) {
            A00();
            setVisibility(0);
            this.A01.startAnimation(this.A00);
        } else {
            setVisibility(4);
            this.A01.clearAnimation();
        }
    }

    public void setClipStackManager(C44274JhQ c44274JhQ) {
        this.A03 = c44274JhQ;
        A00();
    }

    @Override // X.MRD
    public final void D4n(C44059Jdk c44059Jdk) {
        A00();
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        View.inflate(context2, R.layout.video_capture_timer_view, this);
        this.A01 = AbstractC31173DnH.A0I(this, R.id.video_capture_blinker);
        this.A02 = AbstractC166997dE.A0T(this, R.id.video_capture_timer);
        Integer A01 = AbstractC43841Ja4.A01(context2);
        if (A01 == C05F.A0C || A01 == C05F.A0N) {
            AbstractC166987dD.A1O(context2, this.A02, R.color.design_dark_default_color_on_background);
        }
        this.A00 = AnimationUtils.loadAnimation(context2, R.anim.recording_blinker);
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
