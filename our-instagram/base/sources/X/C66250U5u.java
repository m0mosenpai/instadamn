package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.facebook.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.U5u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66250U5u {
    public static final C66250U5u A01 = new Object();
    public static final long A00 = AbstractC43593JPy.A09(TimeUnit.SECONDS);

    public static final long A00(Animator animator) {
        C14360o3.A0B(animator, 0);
        if (animator instanceof C66292U7o) {
            C66292U7o c66292U7o = (C66292U7o) animator;
            return (c66292U7o.A04 * c66292U7o.A00) + A00(c66292U7o.A05);
        }
        if (animator instanceof U65) {
            List list = ((U65) animator).A02;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1X(A0q, A00((Animator) it.next()));
            }
            return AbstractC25232BEp.A0t((Number) AbstractC001800i.A04(A0q));
        }
        if (animator instanceof C66249U5t) {
            return ((ValueAnimator) animator).getCurrentPlayTime();
        }
        return 0L;
    }

    public static final Animator A01(C6FG c6fg, String str) {
        C14360o3.A0B(str, 1);
        return (Animator) ((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).get(str);
    }

    public static final void A02(Animator animator, long j) {
        C14360o3.A0B(animator, 0);
        animator.setStartDelay(animator.getStartDelay() + j);
    }

    public static final void A03(Animator animator, long j) {
        C14360o3.A0B(animator, 0);
        if (animator instanceof C66292U7o) {
            C66292U7o c66292U7o = (C66292U7o) animator;
            long A06 = C17s.A06(j, 0L, c66292U7o.getDuration());
            long j2 = c66292U7o.A04;
            c66292U7o.A00 = (int) (A06 / j2);
            A03(c66292U7o.A05, A06 % j2);
            return;
        }
        if (animator instanceof U65) {
            Iterator it = ((U65) animator).A02.iterator();
            while (it.hasNext()) {
                A03((Animator) it.next(), j);
            }
        } else {
            if (!(animator instanceof C66249U5t)) {
                return;
            }
            ((ValueAnimator) animator).setCurrentPlayTime(j);
        }
    }

    public static final void A04(Animator animator, C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        C14360o3.A0B(animator, 0);
        animator.addListener(new C66301U7z(c6fg, c6fq, interfaceC103384lE));
    }

    public final void A06(C6FG c6fg, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        Animator animator = (Animator) ((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).get(str);
        if (animator != null) {
            if (animator.isStarted()) {
                animator.start();
                return;
            }
            InterfaceC62872tQ interfaceC62872tQ = c6fg.A02;
            C63142tr Abv = interfaceC62872tQ.AgS().Abv();
            animator.addListener(new C66251U5v(c6fg, Abv, str, z));
            animator.addPauseListener(new C66253U5x(Abv, str));
            animator.start();
            if (Abv == null) {
                return;
            }
            Map map = Abv.A02;
            int size = map.size();
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                C66254U5y c66254U5y = (C66254U5y) A16.next();
                int i = c66254U5y.A02 + 1;
                c66254U5y.A02 = i;
                c66254U5y.A03 = Math.max(c66254U5y.A03, i);
            }
            int i2 = Abv.A00;
            C66254U5y c66254U5y2 = new C66254U5y(Abv.A01, str2, (String) interfaceC62872tQ.AMf().get(R.id.bk_context_key_analytics_module), str, i2, C63142tr.A03.getAndIncrement(), size);
            map.put(str, c66254U5y2);
            AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
            if (!A02.A0O) {
                List list = A02.A0F;
                synchronized (list) {
                    list.add(c66254U5y2);
                }
            }
            c66254U5y2.A06 = true;
            c66254U5y2.A09.markerStart(36713009, c66254U5y2.A07);
        }
    }

    public static final void A05(Animator animator, C6FG c6fg, String str) {
        AbstractC167017dG.A1P(animator, str);
        Animator animator2 = (Animator) ((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            AbstractC25241Le.A02("BloksAnimation", String.format("Found previously started animator with key %s. Canceling it.", str));
        }
    }
}
