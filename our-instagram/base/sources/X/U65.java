package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes11.dex */
public final class U65 extends Animator {
    public long A00;
    public long A01;
    public final List A02;
    public final Integer A03;

    @Override // android.animation.Animator
    public final void cancel() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        A00(this, new C57560PgY(this, 43));
    }

    @Override // android.animation.Animator
    public final void end() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).end();
        }
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.A00;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.A01;
    }

    @Override // android.animation.Animator
    public final long getTotalDuration() {
        long j = this.A00;
        if (j != -1) {
            return j + this.A01;
        }
        return j;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            if (((Animator) it.next()).isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.animation.Animator
    public final boolean isStarted() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            if (((Animator) it.next()).isStarted()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).setInterpolator(timeInterpolator);
        }
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.A01 = j;
        for (Animator animator : this.A02) {
            if (animator instanceof U65) {
                animator.setStartDelay(j);
            } else {
                C66250U5u.A02(animator, j);
            }
        }
    }

    @Override // android.animation.Animator
    public final void start() {
        List list = this.A02;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).start();
        }
        A00(this, new C57560PgY(this, 44));
        if (list.isEmpty()) {
            A00(this, new C57560PgY(this, 45));
        }
    }

    public U65(Integer num, List list) {
        Object next;
        this.A03 = num;
        this.A02 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Animator animator = (Animator) it.next();
            C14360o3.A0B(animator, 0);
            long totalDuration = animator.getTotalDuration();
            if (totalDuration == -1) {
                this.A00 = -1L;
                break;
            }
            this.A00 = Math.max(this.A00, totalDuration);
        }
        if (this.A00 != -1 && (!this.A02.isEmpty())) {
            int intValue = this.A03.intValue();
            if (intValue != 0 && intValue != 2) {
                if (intValue == 1) {
                    next = AbstractC001800i.A0K(this.A02);
                } else {
                    throw new RuntimeException();
                }
            } else {
                Iterator it2 = this.A02.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Animator animator2 = (Animator) next;
                        C14360o3.A0B(animator2, 0);
                        long totalDuration2 = animator2.getTotalDuration();
                        do {
                            Object next2 = it2.next();
                            Animator animator3 = (Animator) next2;
                            C14360o3.A0B(animator3, 0);
                            long totalDuration3 = animator3.getTotalDuration();
                            if (totalDuration2 < totalDuration3) {
                                next = next2;
                                totalDuration2 = totalDuration3;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            U5Q.A00((Animator) next, this, 5);
        }
    }

    public static final void A00(U65 u65, InterfaceC16660sJ interfaceC16660sJ) {
        ArrayList<Animator.AnimatorListener> listeners = u65.getListeners();
        if (listeners != null) {
            for (Object obj : AbstractC001800i.A0a(listeners)) {
                C14360o3.A0A(obj);
                interfaceC16660sJ.invoke(obj);
            }
        }
    }

    @Override // android.animation.Animator
    public final void pause() {
        super.pause();
        if (isPaused()) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).pause();
            }
        }
    }

    @Override // android.animation.Animator
    public final void resume() {
        super.resume();
        if (!isPaused()) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).resume();
            }
        }
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        return this;
    }
}
