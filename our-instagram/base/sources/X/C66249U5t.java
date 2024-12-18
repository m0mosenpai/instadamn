package X;

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;

/* renamed from: X.U5t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C66249U5t extends ValueAnimator {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public final U5Q A07;

    public static final void A01(C66249U5t c66249U5t) {
        c66249U5t.A06 = -1L;
        c66249U5t.A04 = -1L;
        c66249U5t.A05 = 0L;
        c66249U5t.A02 = -1L;
        c66249U5t.A00 = 0L;
        super.setStartDelay(c66249U5t.A03);
        c66249U5t.A01 = 0L;
    }

    @Override // android.animation.ValueAnimator
    public final long getCurrentPlayTime() {
        long j;
        if (this.A06 == -1) {
            long j2 = this.A05;
            if (j2 == -1) {
                return 0L;
            }
            return j2;
        }
        if (isPaused() && this.A04 > this.A02) {
            return this.A05;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j3 = this.A01;
        if (j3 == 0) {
            long j4 = (this.A05 + currentAnimationTimeMillis) - this.A06;
            boolean isPaused = isPaused();
            long j5 = this.A00;
            if (isPaused) {
                j5 = (j5 + AnimationUtils.currentAnimationTimeMillis()) - this.A02;
            }
            j = j4 - j5;
        } else {
            j = this.A03 + j3;
        }
        long duration = this.A03 + getDuration();
        if (j <= duration) {
            return j;
        }
        return duration;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        return this.A03;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getTotalDuration() {
        return this.A03 + getDuration();
    }

    @Override // android.animation.ValueAnimator
    public final void setCurrentPlayTime(long j) {
        long A06 = C17s.A06(j, 0L, this.A03 + getDuration());
        this.A04 = AnimationUtils.currentAnimationTimeMillis();
        this.A05 = A06;
        long j2 = this.A03;
        if (A06 < j2) {
            super.setStartDelay(j2 - A06);
            if (isPaused()) {
                super.setCurrentPlayTime(0L);
                return;
            } else {
                if (this.A01 <= 0) {
                    return;
                }
                start();
                return;
            }
        }
        super.setStartDelay(0L);
        super.setCurrentPlayTime(A06 - j2);
    }

    public C66249U5t() {
        U5Q u5q = new U5Q(this, 6);
        this.A07 = u5q;
        this.A06 = -1L;
        this.A02 = -1L;
        this.A04 = -1L;
        super.addListener(u5q);
        super.addUpdateListener(new C65759TtZ(this, 1));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void pause() {
        boolean isPaused = isPaused();
        super.pause();
        if (!isPaused && isPaused()) {
            this.A02 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void resume() {
        boolean isPaused = isPaused();
        super.resume();
        if (isPaused && !isPaused()) {
            this.A00 += AnimationUtils.currentAnimationTimeMillis() - this.A02;
            this.A02 = -1L;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        super.setStartDelay(j);
        this.A03 = j;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        super.start();
        this.A06 = AnimationUtils.currentAnimationTimeMillis();
        this.A02 = -1L;
        this.A00 = 0L;
        this.A01 = 0L;
    }
}
