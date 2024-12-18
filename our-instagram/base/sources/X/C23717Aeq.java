package X;

import android.animation.Animator;

/* renamed from: X.Aeq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23717Aeq implements MOL {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C84913qf A03;
    public final /* synthetic */ C38321qM A04;

    public C23717Aeq(Animator animator, Animator animator2, C51762Yz c51762Yz, C84913qf c84913qf, C38321qM c38321qM) {
        this.A02 = c51762Yz;
        this.A00 = animator;
        this.A01 = animator2;
        this.A03 = c84913qf;
        this.A04 = c38321qM;
    }

    @Override // X.MOL
    public final void ABT() {
        C51762Yz c51762Yz = this.A02;
        if (c51762Yz != null) {
            c51762Yz.A00();
        }
        Animator animator = this.A00;
        if (animator != null) {
            animator.start();
        }
        this.A01.start();
        C84913qf c84913qf = this.A03;
        C85013qp A00 = AbstractC84973ql.A00(c84913qf.A00);
        String moduleName = c84913qf.A02.getModuleName();
        String id = this.A04.getId();
        if (id != null) {
            A00.A03(moduleName, id);
        }
    }
}
