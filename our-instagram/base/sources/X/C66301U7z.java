package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.U7z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66301U7z extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C6FQ A02;
    public final /* synthetic */ InterfaceC103384lE A03;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C14360o3.A0B(animator, 0);
        C6FX c6fx = new C6FX();
        c6fx.A03(animator, 0);
        c6fx.A02(Boolean.valueOf(!this.A00));
        c6fx.A03(this.A01, 2);
        C131845xK.A00(this.A02, c6fx.A00(), this.A03);
        this.A00 = false;
    }

    public C66301U7z(C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A01 = c6fg;
        this.A03 = interfaceC103384lE;
        this.A02 = c6fq;
    }
}
