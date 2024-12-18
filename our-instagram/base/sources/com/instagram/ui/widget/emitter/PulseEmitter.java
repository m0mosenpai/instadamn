package com.instagram.ui.widget.emitter;

import X.C0f9;
import X.C14360o3;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.instagram.ui.widget.emitter.PulseEmitter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class PulseEmitter extends View {
    public boolean A00;
    public int[] A01;
    public final List A02;
    public final List A03;
    public final Paint A04;
    public final Picture A05;
    public final Handler A06;
    public final float[] A07;
    public static final int[] A09 = {Color.argb(255, 25, 25, 25), Color.argb(255, 69, 69, 69), Color.argb(255, 89, 89, 89)};
    public static final float[] A08 = {0.75f, 0.95f, 1.0f};

    public PulseEmitter(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Picture picture = this.A05;
        Canvas beginRecording = picture.beginRecording(getWidth(), getHeight());
        C14360o3.A07(beginRecording);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Paint paint = this.A04;
        beginRecording.drawCircle(width, height, width, paint);
        List list = this.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object animatedValue = ((ValueAnimator) list.get(i)).getAnimatedValue();
            C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Number) animatedValue).floatValue();
            beginRecording.save();
            beginRecording.scale(floatValue, floatValue, width, height);
            beginRecording.drawCircle(width, height, width, paint);
            beginRecording.restore();
        }
        canvas.drawPicture(picture);
    }

    public final void setGradientColors(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        this.A01 = iArr;
        if (getWidth() > 0 && getHeight() > 0) {
            A00(getWidth(), getHeight());
        }
    }

    private final void A00(int i, int i2) {
        float f = i / 2.0f;
        this.A04.setShader(new RadialGradient(f, i2 / 2.0f, f, this.A01, this.A07, Shader.TileMode.CLAMP));
    }

    public final void A01() {
        if (!this.A00) {
            this.A00 = true;
            this.A06.sendEmptyMessage(0);
        }
    }

    public final void A02() {
        if (this.A00) {
            this.A00 = false;
            this.A06.removeMessages(0);
            List list = this.A03;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).cancel();
            }
            list.clear();
            this.A02.clear();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1526535855);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            A01();
        }
        C0f9.A0D(1282001367, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(551056016);
        super.onDetachedFromWindow();
        A02();
        C0f9.A0D(1816822822, A06);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            A01();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(216059109);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        C0f9.A0D(1589603495, A06);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A02();
    }

    public PulseEmitter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A05 = new Picture();
        Paint paint = new Paint();
        this.A04 = paint;
        this.A01 = A09;
        this.A07 = A08;
        final Looper mainLooper = Looper.getMainLooper();
        this.A06 = new Handler(mainLooper) { // from class: X.4vj
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                final ValueAnimator duration;
                C14360o3.A0B(message, 0);
                if (message.what == 0) {
                    final PulseEmitter pulseEmitter = this;
                    if (pulseEmitter.isShown()) {
                        int[] iArr = PulseEmitter.A09;
                        List list = pulseEmitter.A02;
                        if (!list.isEmpty()) {
                            duration = (ValueAnimator) list.remove(0);
                            duration.setCurrentPlayTime(0L);
                        } else {
                            duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(2000L);
                            duration.setInterpolator(new DecelerateInterpolator());
                            duration.addListener(new AnimatorListenerAdapter() { // from class: X.4vp
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    PulseEmitter pulseEmitter2 = pulseEmitter;
                                    int[] iArr2 = PulseEmitter.A09;
                                    if (pulseEmitter2.A00) {
                                        List list2 = pulseEmitter2.A03;
                                        ValueAnimator valueAnimator = duration;
                                        list2.remove(valueAnimator);
                                        pulseEmitter2.A02.add(valueAnimator);
                                    }
                                }
                            });
                            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.4vq
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    PulseEmitter.this.invalidate();
                                }
                            });
                        }
                        pulseEmitter.A03.add(duration);
                        duration.start();
                        sendEmptyMessageDelayed(0, 800L);
                        return;
                    }
                    pulseEmitter.A02();
                }
            }
        };
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
    }

    public PulseEmitter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* synthetic */ PulseEmitter(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
