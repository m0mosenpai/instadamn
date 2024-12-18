package com.instagram.creation.video.ui;

import X.AbstractC13880nE;
import X.C05F;
import X.C44059Jdk;
import X.C44274JhQ;
import X.JQ0;
import X.MRD;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* loaded from: classes8.dex */
public class CamcorderBlinker extends ColorFilterAlphaImageView implements MRD {
    public int A00;
    public Animation A01;
    public C44274JhQ A02;

    @Override // X.MRD
    public final void D4l(C44059Jdk c44059Jdk) {
    }

    @Override // X.MRD
    public final void Dgq() {
    }

    private void A00() {
        if (this.A02 != null) {
            double A00 = (r0.A01.A00() / 60000.0d) * this.A00;
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            RectF rectF = AbstractC13880nE.A01;
            double applyDimension = A00 - TypedValue.applyDimension(1, 1.0f, displayMetrics);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.setMargins((int) Math.max(applyDimension, 0.0d), 0, 0, 0);
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void A05() {
        C44274JhQ c44274JhQ = this.A02;
        c44274JhQ.getClass();
        if (60000 - c44274JhQ.A01.A00() <= 0) {
            clearAnimation();
            setVisibility(8);
        } else {
            startAnimation(this.A01);
            setVisibility(0);
            A00();
        }
    }

    @Override // X.MRD
    public final void D4m(C44059Jdk c44059Jdk, Integer num) {
        int i;
        if (num != C05F.A0C && num != C05F.A00) {
            startAnimation(this.A01);
            i = 0;
        } else {
            clearAnimation();
            i = 8;
        }
        setVisibility(i);
    }

    @Override // X.MRD
    public final void D4s(C44059Jdk c44059Jdk) {
        startAnimation(this.A01);
        setVisibility(0);
        A00();
    }

    public void setClipStackManager(C44274JhQ c44274JhQ) {
        this.A02 = c44274JhQ;
        A00();
    }

    public CamcorderBlinker(Context context) {
        super(context);
        JQ0.A1I(this);
    }

    @Override // X.MRD
    public final void D4t() {
        clearAnimation();
        setVisibility(8);
    }

    @Override // X.MRD
    public final void D4n(C44059Jdk c44059Jdk) {
        A00();
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        JQ0.A1I(this);
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        JQ0.A1I(this);
    }
}
