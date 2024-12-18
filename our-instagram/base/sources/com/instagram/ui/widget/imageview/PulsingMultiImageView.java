package com.instagram.ui.widget.imageview;

import X.AbstractC55922hc;
import X.B8J;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.InterfaceC11380iw;
import X.InterfaceC73023Pd;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PulsingMultiImageView extends CircularImageView implements InterfaceC73023Pd {
    public int A00;
    public ValueAnimator A01;
    public ValueAnimator A02;
    public Matrix A03;
    public Drawable A04;
    public List A05;
    public boolean A06;
    public long A07;
    public InterfaceC11380iw A08;
    public final Handler A09;
    public final boolean A0A;

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
    }

    @Override // com.instagram.common.ui.widget.imageview.CircularImageView, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Object animatedValue;
        C14360o3.A0B(canvas, 0);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Drawable drawable = this.A04;
        if (drawable != null) {
            canvas.save();
            ValueAnimator valueAnimator = this.A02;
            if (valueAnimator != null) {
                if (valueAnimator.isStarted()) {
                    animatedValue = valueAnimator.getAnimatedValue();
                } else {
                    ValueAnimator valueAnimator2 = this.A01;
                    if (valueAnimator2 != null) {
                        animatedValue = valueAnimator2.getAnimatedValue();
                    }
                    C14360o3.A0F("pulseAnimator");
                }
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Number) animatedValue).floatValue();
                canvas.scale(floatValue, floatValue, width, height);
                canvas.concat(this.A03);
                drawable.draw(canvas);
                canvas.restore();
                return;
            }
            C14360o3.A0F("resizeAnimator");
        } else {
            ValueAnimator valueAnimator3 = this.A02;
            if (valueAnimator3 != null) {
                if (!valueAnimator3.isStarted()) {
                    valueAnimator3 = this.A01;
                    if (valueAnimator3 != null) {
                        if (!valueAnimator3.isStarted()) {
                            return;
                        }
                    }
                    C14360o3.A0F("pulseAnimator");
                }
                Object animatedValue2 = valueAnimator3.getAnimatedValue();
                C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Number) animatedValue2).floatValue();
                canvas.save();
                canvas.scale(floatValue2, floatValue2, width, height);
                super.onDraw(canvas);
                canvas.restore();
                return;
            }
            C14360o3.A0F("resizeAnimator");
        }
        throw C00O.createAndThrow();
    }

    public final void setAnimatingImageUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageUrl);
        setAnimatingImageUrls(arrayList, interfaceC11380iw);
    }

    public /* synthetic */ PulsingMultiImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final void A01(PulsingMultiImageView pulsingMultiImageView) {
        List list = pulsingMultiImageView.A05;
        if (list != null && list.size() > 1) {
            pulsingMultiImageView.A04 = pulsingMultiImageView.getDrawable();
            pulsingMultiImageView.A03 = new Matrix(pulsingMultiImageView.getImageMatrix());
            int i = pulsingMultiImageView.A00 + 1;
            List list2 = pulsingMultiImageView.A05;
            if (list2 != null) {
                pulsingMultiImageView.A00 = i % list2.size();
                pulsingMultiImageView.A00();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0I() {
        String str;
        if (this.A06) {
            this.A06 = false;
            Handler handler = this.A09;
            handler.removeMessages(0);
            handler.removeMessages(1);
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator == null) {
                str = "pulseAnimator";
            } else {
                valueAnimator.cancel();
                ValueAnimator valueAnimator2 = this.A02;
                if (valueAnimator2 == null) {
                    str = "resizeAnimator";
                } else {
                    valueAnimator2.cancel();
                    this.A04 = null;
                    this.A03 = null;
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // X.InterfaceC73023Pd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DPX(X.C73083Pj r7) {
        /*
            r6 = this;
            boolean r0 = r6.A06
            if (r0 == 0) goto L5f
            android.graphics.drawable.Drawable r0 = r6.A04
            if (r0 != 0) goto L43
            boolean r0 = r6.A0A
            if (r0 == 0) goto L31
            java.util.List r0 = r6.A05
            if (r0 == 0) goto L3b
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L31
            android.animation.ValueAnimator r0 = r6.A02
            if (r0 != 0) goto L25
            java.lang.String r0 = "resizeAnimator"
        L1d:
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L25:
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto L31
            android.os.Handler r0 = r6.A09
            r0.sendEmptyMessage(r1)
            goto L34
        L31:
            A01(r6)
        L34:
            android.animation.ValueAnimator r0 = r6.A01
            if (r0 != 0) goto L5c
            java.lang.String r0 = "pulseAnimator"
            goto L1d
        L3b:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L43:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A07
            long r2 = r2 - r0
            android.os.Handler r5 = r6.A09
            r4 = 0
            r0 = 3000(0xbb8, double:1.482E-320)
            long r0 = r0 - r2
            double r2 = (double) r0
            r0 = 0
            double r2 = java.lang.Math.max(r2, r0)
            long r0 = (long) r2
            r5.sendEmptyMessageDelayed(r4, r0)
            return
        L5c:
            r0.start()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.imageview.PulsingMultiImageView.DPX(X.3Pj):void");
    }

    public final void setPulseDurationMs(long j) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            C14360o3.A0F("pulseAnimator");
            throw C00O.createAndThrow();
        }
        valueAnimator.setDuration(j / 2);
    }

    private final void A00() {
        this.A07 = SystemClock.elapsedRealtime();
        List list = this.A05;
        if (list != null) {
            ImageUrl imageUrl = (ImageUrl) list.get(this.A00);
            InterfaceC11380iw interfaceC11380iw = this.A08;
            if (interfaceC11380iw != null) {
                setUrl(imageUrl, interfaceC11380iw);
                return;
            }
            throw new IllegalStateException(B8J.A00.toString());
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-25695805);
        super.onAttachedToWindow();
        if (getVisibility() == 0 && !this.A06 && this.A05 != null) {
            this.A06 = true;
            A00();
        }
        C0f9.A0D(-1118463951, A06);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1739088936);
        super.onDetachedFromWindow();
        A0I();
        C0f9.A0D(1963775678, A06);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0 && !this.A06 && this.A05 != null) {
            this.A06 = true;
            A00();
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A0I();
    }

    public final void setAnimatingImageUrls(List list, InterfaceC11380iw interfaceC11380iw) {
        A0I();
        this.A05 = list;
        this.A08 = interfaceC11380iw;
        this.A00 = 0;
        if (!this.A06 && list != null) {
            this.A06 = true;
            A00();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulsingMultiImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        final Looper mainLooper = Looper.getMainLooper();
        this.A09 = new Handler(mainLooper) { // from class: X.4vl
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C14360o3.A0B(message, 0);
                PulsingMultiImageView pulsingMultiImageView = this;
                if (!pulsingMultiImageView.isShown()) {
                    pulsingMultiImageView.A0I();
                    return;
                }
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 != 1) {
                        return;
                    }
                    ValueAnimator valueAnimator = pulsingMultiImageView.A02;
                    if (valueAnimator != null) {
                        valueAnimator.reverse();
                        return;
                    }
                } else {
                    ValueAnimator valueAnimator2 = pulsingMultiImageView.A01;
                    if (valueAnimator2 == null) {
                        C14360o3.A0F("pulseAnimator");
                        throw C00O.createAndThrow();
                    }
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    float floatValue = ((Number) animatedValue).floatValue();
                    valueAnimator2.end();
                    ValueAnimator valueAnimator3 = pulsingMultiImageView.A02;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setCurrentPlayTime(Math.round(400.0f * (1.0f - floatValue)));
                        valueAnimator3.start();
                        return;
                    }
                }
                C14360o3.A0F("resizeAnimator");
                throw C00O.createAndThrow();
            }
        };
        this.A0E = this;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.4vm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PulsingMultiImageView.this.invalidate();
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1s);
        C14360o3.A07(obtainStyledAttributes);
        this.A0A = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.A02 = ofFloat;
        String str = "resizeAnimator";
        if (ofFloat != null) {
            ofFloat.setDuration(400L);
            ValueAnimator valueAnimator = this.A02;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
                ValueAnimator valueAnimator2 = this.A02;
                if (valueAnimator2 != null) {
                    valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: X.4vn
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            String str2;
                            PulsingMultiImageView pulsingMultiImageView = PulsingMultiImageView.this;
                            if (pulsingMultiImageView.A06) {
                                ValueAnimator valueAnimator3 = pulsingMultiImageView.A02;
                                if (valueAnimator3 == null) {
                                    str2 = "resizeAnimator";
                                } else {
                                    Object animatedValue = valueAnimator3.getAnimatedValue();
                                    C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                    if (((Number) animatedValue).floatValue() == 1.0f) {
                                        PulsingMultiImageView.A01(pulsingMultiImageView);
                                        ValueAnimator valueAnimator4 = pulsingMultiImageView.A01;
                                        if (valueAnimator4 == null) {
                                            str2 = "pulseAnimator";
                                        } else {
                                            valueAnimator4.start();
                                            return;
                                        }
                                    } else {
                                        pulsingMultiImageView.A04 = null;
                                        pulsingMultiImageView.A03 = null;
                                        pulsingMultiImageView.A09.sendEmptyMessage(1);
                                        return;
                                    }
                                }
                                C14360o3.A0F(str2);
                                throw C00O.createAndThrow();
                            }
                        }
                    });
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.95f);
                    this.A01 = ofFloat2;
                    str = "pulseAnimator";
                    if (ofFloat2 != null) {
                        ofFloat2.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator valueAnimator3 = this.A01;
                        if (valueAnimator3 != null) {
                            valueAnimator3.setDuration(400L);
                            ValueAnimator valueAnimator4 = this.A01;
                            if (valueAnimator4 != null) {
                                valueAnimator4.setRepeatCount(-1);
                                ValueAnimator valueAnimator5 = this.A01;
                                if (valueAnimator5 != null) {
                                    valueAnimator5.setRepeatMode(2);
                                    ValueAnimator valueAnimator6 = this.A01;
                                    if (valueAnimator6 != null) {
                                        valueAnimator6.addUpdateListener(animatorUpdateListener);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PulsingMultiImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PulsingMultiImageView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
