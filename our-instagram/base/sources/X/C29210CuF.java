package X;

import android.animation.Animator;

/* renamed from: X.CuF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29210CuF implements MOL {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C51762Yz A03;

    public C29210CuF(Animator animator, Animator animator2, C51762Yz c51762Yz, C51762Yz c51762Yz2) {
        this.A03 = c51762Yz;
        this.A00 = animator;
        this.A01 = animator2;
        this.A02 = c51762Yz2;
    }

    @Override // X.MOL
    public final void ABT() {
        this.A03.A00();
        this.A00.start();
        Animator animator = this.A01;
        animator.start();
        animator.addListener(new BQM(this.A02, 0));
    }
}
