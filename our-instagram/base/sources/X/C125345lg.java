package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.R;

/* renamed from: X.5lg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125345lg implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C125335lf A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C125345lg(C125335lf c125335lf) {
        this.A00 = c125335lf;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C125335lf c125335lf = this.A00;
        View view = c125335lf.A0a;
        view.setTag(R.id.view_animator, null);
        int i = c125335lf.A03;
        if (i != -1) {
            view.setVisibility(i);
        }
        InterfaceC125355lh interfaceC125355lh = c125335lf.A05;
        if (interfaceC125355lh != null) {
            interfaceC125355lh.onFinish();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C125335lf c125335lf = this.A00;
        int i = c125335lf.A04;
        if (i != -1) {
            c125335lf.A0a.setVisibility(i);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0L(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
