package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.0m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13170m3 extends AnonymousClass073 {
    public AnimatorSet A00;
    public final C13420mS A01;

    @Override // X.AnonymousClass073
    public final void A03(final ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        C13420mS c13420mS = this.A01;
        if (!c13420mS.A01()) {
            Context context = viewGroup.getContext();
            C14360o3.A07(context);
            AnonymousClass064 A02 = c13420mS.A02(context);
            if (A02 != null) {
                animatorSet = A02.A00;
            } else {
                animatorSet = null;
            }
            this.A00 = animatorSet;
            final C10300gw c10300gw = ((AbstractC014105h) c13420mS).A00;
            Fragment fragment = c10300gw.A07;
            final boolean z = false;
            if (c10300gw.A00 == C05F.A0C) {
                z = true;
            }
            final View view = fragment.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.A00;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.05e
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        ViewGroup viewGroup2 = viewGroup;
                        View view2 = view;
                        viewGroup2.endViewTransition(view2);
                        if (z) {
                            Integer num = c10300gw.A00;
                            C14360o3.A06(view2);
                            AnonymousClass077.A00(view2, viewGroup2, num);
                        }
                        C13170m3 c13170m3 = this;
                        ((AbstractC014105h) c13170m3.A01).A00.A02(c13170m3);
                        AbstractC10360h2.A0H(2);
                    }
                });
            }
            AnimatorSet animatorSet3 = this.A00;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }

    @Override // X.AnonymousClass073
    public final boolean A07() {
        return true;
    }

    @Override // X.AnonymousClass073
    public final void A04(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.A00;
        C10300gw c10300gw = ((AbstractC014105h) this.A01).A00;
        if (animatorSet == null) {
            c10300gw.A02(this);
            return;
        }
        if (c10300gw.A05) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        AbstractC10360h2.A0H(2);
    }

    @Override // X.AnonymousClass073
    public final void A05(ViewGroup viewGroup) {
        C10300gw c10300gw = ((AbstractC014105h) this.A01).A00;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet == null) {
            c10300gw.A02(this);
        } else {
            animatorSet.start();
            AbstractC10360h2.A0H(2);
        }
    }

    @Override // X.AnonymousClass073
    public final void A06(ViewGroup viewGroup, AnonymousClass002 anonymousClass002) {
        C10300gw c10300gw = ((AbstractC014105h) this.A01).A00;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet == null) {
            c10300gw.A02(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c10300gw.A07.mTransitioning) {
            return;
        }
        AbstractC10360h2.A0H(2);
        long totalDuration = animatorSet.getTotalDuration();
        long j = anonymousClass002.A00 * ((float) totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = totalDuration - 1;
        }
        AbstractC10360h2.A0H(2);
        animatorSet.setCurrentPlayTime(j);
    }

    public C13170m3(C13420mS c13420mS) {
        this.A01 = c13420mS;
    }
}
