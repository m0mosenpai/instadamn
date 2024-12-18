package X;

import android.animation.Animator;

/* renamed from: X.CuE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29209CuE implements MOL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C29209CuE(Animator animator, C51762Yz c51762Yz, C25456BNv c25456BNv, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = c51762Yz;
            this.A03 = c25456BNv;
            this.A02 = animator;
        } else {
            this.A03 = c25456BNv;
            this.A02 = animator;
            this.A01 = c51762Yz;
        }
    }

    @Override // X.MOL
    public final void ABT() {
        C25456BNv c25456BNv;
        if (this.A00 != 0) {
            ((C51762Yz) this.A01).A00();
            c25456BNv = (C25456BNv) this.A03;
            C51762Yz c51762Yz = c25456BNv.A02;
            if (c51762Yz != null) {
                c51762Yz.A00();
            }
            Animator animator = c25456BNv.A00;
            if (animator != null) {
                animator.start();
            }
            ((Animator) this.A02).start();
        } else {
            c25456BNv = (C25456BNv) this.A03;
            C51762Yz c51762Yz2 = c25456BNv.A02;
            if (c51762Yz2 != null) {
                c51762Yz2.A00();
            }
            Animator animator2 = c25456BNv.A00;
            if (animator2 != null) {
                animator2.start();
            }
            Animator animator3 = (Animator) this.A02;
            animator3.start();
            animator3.addListener(new BQM(this.A01, 5));
        }
        AbstractC84973ql.A00(c25456BNv.A04).A04(c25456BNv.A03.getModuleName(), ((C120985dq) c25456BNv.A01.A01).A0D());
    }
}
