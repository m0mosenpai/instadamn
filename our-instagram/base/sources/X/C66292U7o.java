package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: X.U7o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66292U7o extends Animator {
    public int A00;
    public boolean A01;
    public long A02;
    public final int A03;
    public final long A04;
    public final Animator A05;

    public C66292U7o(Animator animator, C6FG c6fg, int i) {
        C14360o3.A0B(animator, 2);
        AnonymousClass634.A07(animator, c6fg);
        this.A05 = animator;
        this.A04 = animator.getTotalDuration();
        this.A03 = i;
        if (i > 0 || i == -1) {
            animator.addListener(new U84(this, i));
        }
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        C14360o3.A0B(timeInterpolator, 0);
        this.A05.setInterpolator(timeInterpolator);
    }

    @Override // android.animation.Animator
    public final void start() {
        this.A00 = 0;
        this.A01 = false;
        long j = this.A02;
        if (j != 0) {
            C66250U5u.A02(this.A05, j);
        }
        this.A05.start();
    }

    @Override // android.animation.Animator
    public final void cancel() {
        this.A05.cancel();
    }

    @Override // android.animation.Animator
    public final void end() {
        this.A05.end();
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        int i = this.A03;
        if (i != -1) {
            long j = this.A04;
            if (j != -1) {
                return j * i;
            }
            return -1L;
        }
        return -1L;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.A02;
    }

    @Override // android.animation.Animator
    public final long getTotalDuration() {
        int i = this.A03;
        if (i != -1) {
            long j = this.A04;
            if (j != -1) {
                return (j * i) + this.A02;
            }
            return -1L;
        }
        return -1L;
    }

    @Override // android.animation.Animator
    public final boolean isPaused() {
        return this.A05.isPaused();
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.A05.isRunning();
    }

    @Override // android.animation.Animator
    public final void pause() {
        this.A05.pause();
    }

    @Override // android.animation.Animator
    public final void resume() {
        this.A05.resume();
    }

    public static final void A00(C66292U7o c66292U7o, InterfaceC16660sJ interfaceC16660sJ) {
        ArrayList<Animator.AnimatorListener> listeners = c66292U7o.getListeners();
        if (listeners != null) {
            for (Object obj : AbstractC001800i.A0a(listeners)) {
                C14360o3.A0A(obj);
                interfaceC16660sJ.invoke(obj);
            }
        }
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        return this;
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.A02 = j;
    }
}
