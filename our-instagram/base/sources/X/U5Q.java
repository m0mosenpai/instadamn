package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.instagram.direct.ui.countertextview.CounterTextView;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class U5Q extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public U5Q(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new U5Q(obj, i));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A01;
                actionBarOverlayLayout.A00 = null;
                actionBarOverlayLayout.A04 = false;
                return;
            case 3:
                InterfaceC71887X8u interfaceC71887X8u = ((C66351UBk) this.A01).A06;
                if (interfaceC71887X8u == null) {
                    return;
                }
                interfaceC71887X8u.Dlx();
                return;
            case 4:
                InterfaceC71886X8t interfaceC71886X8t = ((C66351UBk) this.A01).A05;
                if (interfaceC71886X8t == null) {
                    return;
                }
                interfaceC71886X8t.DAk();
                return;
            case 6:
                C66249U5t.A01((C66249U5t) this.A01);
                return;
            case 21:
                C14360o3.A0B(animator, 0);
                super.onAnimationCancel(animator);
                LnN.A04 = false;
                return;
            case 23:
                C141596ac c141596ac = ((C138466Pc) this.A01).A00;
                if (c141596ac == null) {
                    return;
                }
                c141596ac.A0i = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator;
        switch (this.A00) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A01;
                actionBarOverlayLayout.A00 = null;
                actionBarOverlayLayout.A04 = false;
                return;
            case 1:
                ((AbstractC66024TyM) this.A01).A0J();
                animator.removeListener(this);
                return;
            case 2:
                C66211U4h c66211U4h = (C66211U4h) this.A01;
                if (c66211U4h.getChildCount() <= 0) {
                    return;
                }
                Interpolator interpolator = C66211U4h.A07;
                if (animator == c66211U4h.A04 && (objectAnimator = c66211U4h.A03) != null && objectAnimator.isStarted()) {
                    return;
                }
                C66211U4h.A01(c66211U4h.getChildAt(0), c66211U4h);
                return;
            case 3:
                InterfaceC71887X8u interfaceC71887X8u = ((C66351UBk) this.A01).A06;
                if (interfaceC71887X8u == null) {
                    return;
                }
                interfaceC71887X8u.Dlx();
                return;
            case 4:
                InterfaceC71886X8t interfaceC71886X8t = ((C66351UBk) this.A01).A05;
                if (interfaceC71886X8t == null) {
                    return;
                }
                interfaceC71886X8t.DAk();
                return;
            case 5:
                U65 u65 = (U65) this.A01;
                U65.A00(u65, new C57560PgY(u65, 42));
                return;
            case 6:
                C66249U5t.A01((C66249U5t) this.A01);
                return;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.A01).A02 = null;
                return;
            case 8:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
            default:
                super.onAnimationEnd(animator);
                return;
            case 9:
                super.onAnimationEnd(animator);
                C67764Uxf c67764Uxf = (C67764Uxf) this.A01;
                c67764Uxf.A00();
                c67764Uxf.A05.A00();
                return;
            case 11:
                super.onAnimationEnd(animator);
                AbstractC66307U8g abstractC66307U8g = (AbstractC66307U8g) this.A01;
                AbstractC66307U8g.A00(abstractC66307U8g);
                List list = abstractC66307U8g.A05;
                if (list == null || abstractC66307U8g.A06) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC68255VJs) it.next()).A00();
                }
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                super.onAnimationEnd(animator);
                C67763Uxe c67763Uxe = (C67763Uxe) this.A01;
                Property property = C67763Uxe.A08;
                if (!c67763Uxe.A04) {
                    return;
                }
                c67763Uxe.A02.setRepeatCount(-1);
                c67763Uxe.A03.A00();
                c67763Uxe.A04 = false;
                return;
            case 14:
            case Process.SIGTERM /* 15 */:
                ((AbstractC70175WEx) this.A01).A06();
                return;
            case 17:
                ((AbstractC69084Vha) this.A01).A02.setEndIconVisible(false);
                return;
            case 18:
                C67777Uxt c67777Uxt = (C67777Uxt) this.A01;
                ((AbstractC69084Vha) c67777Uxt).A01.setChecked(c67777Uxt.A07);
                c67777Uxt.A01.start();
                return;
            case Process.SIGSTOP /* 19 */:
                C14360o3.A0B(animator, 0);
                if (((WH7) this.A01).A01) {
                    return;
                }
                animator.start();
                return;
            case 20:
                UHS uhs = (UHS) this.A01;
                if (uhs.A01 != C05F.A01) {
                    return;
                }
                ((View) uhs.A0B.getValue()).setVisibility(4);
                return;
            case 21:
                AbstractC43593JPy.A1Q(this.A01);
                LnN.A04 = false;
                return;
            case 22:
                CounterTextView counterTextView = (CounterTextView) this.A01;
                counterTextView.A00.setShader(null);
                CounterTextView.A04(counterTextView);
                CounterTextView.A02(counterTextView);
                counterTextView.invalidate();
                counterTextView.post(counterTextView.A0B);
                return;
            case 23:
                C141596ac c141596ac = ((C138466Pc) this.A01).A00;
                if (c141596ac == null) {
                    return;
                }
                c141596ac.A0i = true;
                return;
            case 24:
                List list2 = ((WOO) this.A01).A03.A02;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((View) it2.next()).setHasTransientState(false);
                    }
                }
                list2.clear();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.A00) {
            case 8:
                super.onAnimationRepeat(animator);
                C67764Uxf c67764Uxf = (C67764Uxf) this.A01;
                c67764Uxf.A02 = (c67764Uxf.A02 + 4) % c67764Uxf.A07.A05.length;
                return;
            case 9:
            case 10:
            case 11:
            default:
                super.onAnimationRepeat(animator);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                super.onAnimationRepeat(animator);
                C67762Uxd c67762Uxd = (C67762Uxd) this.A01;
                c67762Uxd.A01 = (c67762Uxd.A01 + 1) % c67762Uxd.A05.A05.length;
                c67762Uxd.A04 = true;
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                super.onAnimationRepeat(animator);
                C67763Uxe c67763Uxe = (C67763Uxe) this.A01;
                c67763Uxe.A01 = (c67763Uxe.A01 + 1) % c67763Uxe.A06.A05.length;
                c67763Uxe.A05 = true;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 10:
                super.onAnimationStart(animator);
                AbstractC66307U8g abstractC66307U8g = (AbstractC66307U8g) this.A01;
                Property property = AbstractC66307U8g.A0A;
                List list = abstractC66307U8g.A05;
                if (list == null || abstractC66307U8g.A06) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            case Process.SIGTERM /* 15 */:
                AbstractC70175WEx abstractC70175WEx = (AbstractC70175WEx) this.A01;
                Handler handler = AbstractC70175WEx.A0D;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) abstractC70175WEx.A0A;
                snackbarContentLayout.A01.setAlpha(0.0f);
                snackbarContentLayout.A01.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                if (snackbarContentLayout.A00.getVisibility() != 0) {
                    return;
                }
                snackbarContentLayout.A00.setAlpha(0.0f);
                snackbarContentLayout.A00.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                return;
            case 16:
                ((AbstractC69084Vha) this.A01).A02.setEndIconVisible(true);
                return;
            case 20:
                UHS uhs = (UHS) this.A01;
                if (uhs.A01 != C05F.A00) {
                    return;
                }
                ((View) uhs.A0B.getValue()).setVisibility(0);
                return;
            case 22:
                C14360o3.A0B(animator, 0);
                super.onAnimationStart(animator);
                CounterTextView counterTextView = (CounterTextView) this.A01;
                counterTextView.A00.setShader(counterTextView.A01);
                counterTextView.invalidate();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
