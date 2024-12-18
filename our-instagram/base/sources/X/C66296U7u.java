package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.U7u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66296U7u extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC16820sZ A00;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C66296U7u(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.invoke();
    }
}
