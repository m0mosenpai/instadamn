package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.Gsb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38292Gsb extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC109864xE A01;
    public final /* synthetic */ InterfaceC38401qU A02;
    public final /* synthetic */ C3h2 A03;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C14360o3.A0B(animator, 0);
        super.onAnimationEnd(animator);
        this.A03.D3H(this.A01, this.A02, this.A00);
    }

    public C38292Gsb(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, C3h2 c3h2, int i) {
        this.A03 = c3h2;
        this.A02 = interfaceC38401qU;
        this.A00 = i;
        this.A01 = interfaceC109864xE;
    }
}
