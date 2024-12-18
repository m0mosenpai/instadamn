package X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.Ci7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28513Ci7 implements Animator.AnimatorListener {
    public final /* synthetic */ C144506fW A00;
    public final /* synthetic */ InterfaceC30951Dj8 A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C28513Ci7(C144506fW c144506fW, InterfaceC30951Dj8 interfaceC30951Dj8) {
        this.A00 = c144506fW;
        this.A01 = interfaceC30951Dj8;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C144506fW c144506fW = this.A00;
        InterfaceC30951Dj8 interfaceC30951Dj8 = this.A01;
        View view = c144506fW.A01;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        interfaceC30951Dj8.CwT();
    }
}
