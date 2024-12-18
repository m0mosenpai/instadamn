package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Q0f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ChoreographerFrameCallbackC58691Q0f extends ValueAnimator implements Choreographer.FrameCallback {
    public SQ2 A07;
    public final java.util.Set A0D = new CopyOnWriteArraySet();
    public final java.util.Set A0B = new CopyOnWriteArraySet();
    public final java.util.Set A0C = new CopyOnWriteArraySet();
    public float A04 = 1.0f;
    public boolean A0A = false;
    public long A06 = 0;
    public float A01 = 0.0f;
    public float A00 = 0.0f;
    public int A05 = 0;
    public float A03 = -2.1474836E9f;
    public float A02 = 2.1474836E9f;
    public boolean A08 = false;
    public boolean A09 = false;

    public final float A00() {
        SQ2 sq2 = this.A07;
        if (sq2 == null) {
            return 0.0f;
        }
        float f = this.A00;
        float f2 = sq2.A03;
        return (f - f2) / (sq2.A00 - f2);
    }

    public final float A01() {
        SQ2 sq2 = this.A07;
        if (sq2 == null) {
            return 0.0f;
        }
        float f = this.A02;
        if (f != 2.1474836E9f) {
            return f;
        }
        return sq2.A00;
    }

    public final float A02() {
        SQ2 sq2 = this.A07;
        if (sq2 == null) {
            return 0.0f;
        }
        float f = this.A03;
        if (f != -2.1474836E9f) {
            return f;
        }
        return sq2.A03;
    }

    public final void A04() {
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void A05() {
        if (this.A08) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void A06(float f) {
        if (this.A01 != f) {
            float A02 = A02();
            float A01 = A01();
            PointF pointF = AbstractC63251Sg7.A00;
            float A012 = AbstractC58322PtE.A01(A01, f, A02);
            this.A01 = A012;
            if (this.A09) {
                A012 = (float) Math.floor(A012);
            }
            this.A00 = A012;
            this.A06 = 0L;
            A04();
        }
    }

    public final void A07(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            SQ2 sq2 = this.A07;
            if (sq2 == null) {
                f3 = -3.4028235E38f;
                f4 = Float.MAX_VALUE;
            } else {
                f3 = sq2.A03;
                f4 = sq2.A00;
            }
            PointF pointF = AbstractC63251Sg7.A00;
            float A01 = AbstractC58322PtE.A01(f4, f, f3);
            float A012 = AbstractC58322PtE.A01(f4, f2, f3);
            if (A01 != this.A03 || A012 != this.A02) {
                this.A03 = A01;
                this.A02 = A012;
                A06((int) AbstractC58322PtE.A01(A012, this.A00, A01));
                return;
            }
            return;
        }
        throw AbstractC58319PtB.A0j("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
    }

    public final void A08(boolean z) {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.A0B.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0C.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        A08(AbstractC25230BEn.A1P((this.A04 > 0.0f ? 1 : (this.A04 == 0.0f ? 0 : -1))));
        Choreographer.getInstance().removeFrameCallback(this);
        this.A08 = false;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float A02;
        if (this.A07 == null) {
            return 0.0f;
        }
        if (this.A04 < 0.0f) {
            f = A01();
            A02 = this.A00;
        } else {
            f = this.A00;
            A02 = A02();
        }
        return (f - A02) / (A01() - A02());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.A07 == null) {
            return 0L;
        }
        return r0.A00();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw AbstractC166987dD.A1D("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.A08;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.A0B.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.A0D.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.A0B.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0C.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0D.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw AbstractC166987dD.A1D("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw AbstractC166987dD.A1D("LottieAnimator does not support setStartDelay.");
    }

    public final void A03() {
        Choreographer.getInstance().removeFrameCallback(this);
        boolean z = false;
        this.A08 = false;
        if (this.A04 < 0.0f) {
            z = true;
        }
        A08(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r4 > r2) goto L16;
     */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doFrame(long r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ChoreographerFrameCallbackC58691Q0f.doFrame(long):void");
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(A00());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw C00O.createAndThrow();
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.A0A) {
            this.A0A = false;
            this.A04 = -this.A04;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw AbstractC166987dD.A1D("LottieAnimator does not support setDuration.");
    }
}
