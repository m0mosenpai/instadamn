package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import android.view.animation.LinearInterpolator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.696, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass696 extends ValueAnimator implements Choreographer.FrameCallback {
    public static Choreographer A0H;
    public float A02;
    public final C56682j1 A0E;
    public float A06 = 1.667E7f;
    public float A04 = 1.667E7f;
    public long A09 = 0;
    public int A08 = 1;
    public int A0D = 1;
    public float A05 = 0.0f;
    public float A07 = 0.0f;
    public float A00 = 1.0f;
    public float A03 = 0.0f;
    public float A01 = 0.0f;
    public boolean A0B = false;
    public boolean A0C = false;
    public final java.util.Set A0F = new CopyOnWriteArraySet();
    public final java.util.Set A0G = new CopyOnWriteArraySet();
    public TimeInterpolator A0A = new LinearInterpolator();

    @Override // android.animation.ValueAnimator
    public final void setRepeatCount(int i) {
        int max = Math.max(i, 1);
        this.A0D = max;
        this.A08 = max;
    }

    public final void A00(float f, float f2) {
        float max;
        this.A07 = f;
        this.A00 = f2;
        boolean z = false;
        if (f2 < f) {
            z = true;
        }
        float f3 = this.A03;
        if (z) {
            max = Math.min(f, Math.max(f2, f3));
        } else {
            max = Math.max(f, Math.min(f2, f3));
        }
        setCurrentFraction(max);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.A0F.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0G.add(animatorUpdateListener);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        float f;
        long j2 = this.A09;
        if (j2 > 0) {
            f = (float) (j - j2);
        } else {
            f = 1.667E7f;
        }
        if (this.A0C) {
            float f2 = (f + (this.A04 * 24.0f)) / 25.0f;
            this.A04 = f2;
            float f3 = this.A06;
            float f4 = f3 + ((f2 - f3) * 0.1f);
            this.A06 = f4;
            f = f4;
        }
        double d = this.A05;
        C56682j1 c56682j1 = this.A0E;
        double d2 = (f / 1.0E9d) / c56682j1.A0E.A00;
        boolean z = false;
        if (this.A00 < this.A07) {
            z = true;
        }
        int i = 1;
        if (z) {
            i = -1;
        }
        float f5 = (float) (d + (d2 * i));
        this.A05 = f5;
        float interpolation = this.A0A.getInterpolation(f5);
        this.A03 = interpolation;
        this.A09 = j;
        if (this.A0B) {
            float f6 = this.A01 + f;
            this.A01 = f6;
            float f7 = this.A02;
            if (f6 < f7) {
                Choreographer choreographer = A0H;
                if (choreographer == null) {
                    choreographer = Choreographer.getInstance();
                    A0H = choreographer;
                }
                choreographer.postFrameCallback(this);
                return;
            }
            this.A01 = f6 % f7;
        }
        float f8 = this.A00;
        float f9 = this.A07;
        if (f8 >= f9 ? interpolation > f8 || this.A05 > f8 : interpolation < f8 || this.A05 < f8) {
            float f10 = interpolation - (f8 - f9);
            this.A03 = f10;
            this.A05 = f10;
            int i2 = this.A08 - 1;
            this.A08 = i2;
            if (i2 == 0) {
                pause();
                return;
            } else {
                Iterator it = this.A0F.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
            }
        }
        if (c56682j1.A01 == 2) {
            return;
        }
        Choreographer choreographer2 = A0H;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            A0H = choreographer2;
        }
        choreographer2.postFrameCallback(this);
        Iterator it2 = this.A0G.iterator();
        while (it2.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it2.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void end() {
        C56682j1 c56682j1 = this.A0E;
        if (c56682j1.A01 == 1) {
            this.A08 = 0;
            this.A03 = 0.0f;
            this.A05 = 0.0f;
            this.A09 = 0L;
            this.A06 = 1.667E7f;
            this.A04 = 1.667E7f;
            this.A01 = 0.0f;
            c56682j1.A03(0);
            Choreographer choreographer = A0H;
            if (choreographer == null) {
                choreographer = Choreographer.getInstance();
                A0H = choreographer;
            }
            choreographer.removeFrameCallback(this);
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        return this.A03;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        if (this.A0E.A01 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void pause() {
        C56682j1 c56682j1 = this.A0E;
        if (c56682j1.A01 == 1) {
            this.A09 = -this.A09;
            c56682j1.A03(2);
            Choreographer choreographer = A0H;
            if (choreographer == null) {
                choreographer = Choreographer.getInstance();
                A0H = choreographer;
            }
            choreographer.removeFrameCallback(this);
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.A0F.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.A0G.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.A0F.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0G.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public final void setCurrentFraction(float f) {
        this.A03 = f;
        this.A05 = f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        if (timeInterpolator == null) {
            timeInterpolator = new LinearInterpolator();
        }
        this.A0A = timeInterpolator;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        C56682j1 c56682j1 = this.A0E;
        if (c56682j1.A01 != 1 && c56682j1.A0E.A00 != 0.0f) {
            if (this.A08 == 0) {
                this.A08 = this.A0D;
                setCurrentFraction(this.A07);
            }
            c56682j1.A03(1);
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationStart(this);
            }
            Choreographer choreographer = A0H;
            if (choreographer == null) {
                choreographer = Choreographer.getInstance();
                A0H = choreographer;
            }
            choreographer.postFrameCallback(this);
        }
    }

    public AnonymousClass696(C56682j1 c56682j1) {
        this.A0E = c56682j1;
    }
}
