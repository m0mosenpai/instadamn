package com.instagram.reels.music.external.pulseanimation;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC43592JPx;
import X.AbstractC55922hc;
import X.C00O;
import X.C14360o3;
import X.C44408Jjm;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes8.dex */
public final class PulseAnimation extends RelativeLayout {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AnimatorSet A06;
    public Paint A07;
    public ArrayList A08;
    public ArrayList A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulseAnimation(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = getContext().getColor(R.color.pulse_color);
        this.A05 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        this.A03 = 4;
        this.A00 = getResources().getDimension(R.dimen.appreciation_reels_grid_item_width);
        this.A01 = 3.0f;
        A00();
    }

    public final void A01() {
        String str;
        this.A0B = true;
        if (!this.A0C) {
            ArrayList arrayList = this.A09;
            if (arrayList == null) {
                str = "circleViewList";
            } else {
                Iterator A13 = AbstractC166997dE.A13(arrayList);
                while (A13.hasNext()) {
                    ((View) AbstractC166997dE.A0l(A13)).setVisibility(0);
                }
                this.A0C = true;
                AnimatorSet animatorSet = this.A06;
                if (animatorSet == null) {
                    str = "animatorSet";
                } else {
                    animatorSet.start();
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    private final void A00() {
        String str;
        if (!this.A0B) {
            this.A04 = this.A05 / this.A03;
            Paint A0R = AbstractC166987dD.A0R();
            this.A07 = A0R;
            A0R.setAntiAlias(true);
            Paint paint = this.A07;
            if (paint != null) {
                AbstractC166987dD.A1R(paint);
                Paint paint2 = this.A07;
                if (paint2 != null) {
                    paint2.setColor(this.A02);
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.A06 = animatorSet;
                    AbstractC43592JPx.A1A(animatorSet);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    this.A08 = A1E;
                    this.A09 = AbstractC166987dD.A1E();
                    int i = this.A03;
                    int i2 = 0;
                    while (true) {
                        str = "animatorList";
                        if (i2 < i) {
                            C44408Jjm c44408Jjm = new C44408Jjm(AbstractC166997dE.A0L(this), this);
                            int i3 = (int) (2.0f * this.A00);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                            layoutParams.addRule(12, -1);
                            layoutParams.addRule(14, -1);
                            addView(c44408Jjm, layoutParams);
                            ArrayList arrayList = this.A09;
                            if (arrayList == null) {
                                str = "circleViewList";
                                break;
                            }
                            arrayList.add(c44408Jjm);
                            float random = (float) ((Math.random() * ((float) (-(this.A04 / 2.5d)))) + (((float) r2) - r7));
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c44408Jjm, "ScaleX", 1.0f, getRippleScale());
                            C14360o3.A0A(ofFloat);
                            long j = this.A05;
                            ofFloat.setRepeatCount(1000);
                            ofFloat.setRepeatMode(1);
                            ofFloat.setDuration(j);
                            ofFloat.setStartDelay((this.A04 * i2) + random);
                            ArrayList arrayList2 = this.A08;
                            if (arrayList2 == null) {
                                break;
                            }
                            arrayList2.add(ofFloat);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c44408Jjm, "ScaleY", 1.0f, getRippleScale());
                            C14360o3.A0A(ofFloat2);
                            long j2 = this.A05;
                            ofFloat2.setRepeatCount(1000);
                            ofFloat2.setRepeatMode(1);
                            ofFloat2.setDuration(j2);
                            ofFloat2.setStartDelay((this.A04 * i2) + random);
                            ArrayList arrayList3 = this.A08;
                            if (arrayList3 == null) {
                                break;
                            }
                            arrayList3.add(ofFloat2);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c44408Jjm, "Alpha", 1.0f, 0.0f);
                            C14360o3.A0A(ofFloat3);
                            long j3 = this.A05;
                            ofFloat3.setRepeatCount(1000);
                            ofFloat3.setRepeatMode(1);
                            ofFloat3.setDuration(j3);
                            ofFloat3.setStartDelay((this.A04 * i2) + random);
                            A1E = this.A08;
                            if (A1E == null) {
                                break;
                            }
                            A1E.add(ofFloat3);
                            i2++;
                        } else {
                            AnimatorSet animatorSet2 = this.A06;
                            if (animatorSet2 == null) {
                                str = "animatorSet";
                            } else if (A1E != null) {
                                animatorSet2.playTogether(A1E);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F("paint");
            throw C00O.createAndThrow();
        }
    }

    public final void A02() {
        if (this.A0C) {
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                if (animatorSet.isStarted()) {
                    AnimatorSet animatorSet2 = this.A06;
                    if (animatorSet2 != null) {
                        animatorSet2.end();
                    }
                }
                this.A0C = false;
                return;
            }
            C14360o3.A0F("animatorSet");
            throw C00O.createAndThrow();
        }
    }

    public final boolean getRandomScaling() {
        return this.A0A;
    }

    public final int getRippleColor() {
        return this.A02;
    }

    public final int getRippleCount() {
        return this.A03;
    }

    public final int getRippleDelayMs() {
        return this.A04;
    }

    public final int getRippleDurationMs() {
        return this.A05;
    }

    public final float getRippleRadius() {
        return this.A00;
    }

    public final float getRippleScale() {
        boolean z = this.A0A;
        float f = this.A01;
        if (z) {
            return (float) ((Math.random() * (f / 2.0f)) + (f - r4));
        }
        return f;
    }

    public final void setRandomScaling(boolean z) {
        this.A0A = z;
    }

    public final void setRippleColor(int i) {
        this.A02 = i;
    }

    public final void setRippleCount(int i) {
        this.A03 = i;
    }

    public final void setRippleDelayMs(int i) {
        this.A04 = i;
    }

    public final void setRippleDurationMs(int i) {
        this.A05 = i;
    }

    public final void setRippleRadius(float f) {
        this.A00 = f;
    }

    public final void setRippleScale(float f) {
        this.A01 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulseAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A06 = AbstractC167007dF.A06(1, context, attributeSet);
        this.A02 = getContext().getColor(R.color.pulse_color);
        this.A05 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        this.A03 = 4;
        Resources resources = getResources();
        this.A00 = resources.getDimension(R.dimen.appreciation_reels_grid_item_width);
        this.A01 = 3.0f;
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1r);
            C14360o3.A07(obtainStyledAttributes);
            this.A02 = obtainStyledAttributes.getColor(0, context.getColor(R.color.pulse_color));
            this.A00 = obtainStyledAttributes.getDimension(A06, resources.getDimension(R.dimen.appreciation_reels_grid_item_width));
            this.A05 = obtainStyledAttributes.getInt(1, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            this.A03 = obtainStyledAttributes.getInt(4, 4);
            this.A01 = obtainStyledAttributes.getFloat(5, 3.0f);
            this.A0A = obtainStyledAttributes.getBoolean(3, false);
            obtainStyledAttributes.recycle();
        }
        A00();
    }
}
