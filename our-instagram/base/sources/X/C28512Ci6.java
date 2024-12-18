package X;

import android.animation.Animator;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.Ci6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28512Ci6 implements Animator.AnimatorListener {
    public final /* synthetic */ C58622mL A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C28512Ci6(C58622mL c58622mL) {
        this.A00 = c58622mL;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A01();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C11T.A04(this.A00.A08, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C23031Ai c23031Ai = this.A00.A07;
        InterfaceC16530ry interfaceC16530ry = c23031Ai.A6r;
        C0YR[] c0yrArr = C23031Ai.A8c;
        int A0H = AbstractC166987dD.A0H(interfaceC16530ry.CES(c23031Ai, c0yrArr[522])) + 1;
        interfaceC16530ry.Egi(c23031Ai, Integer.valueOf(A0H), c0yrArr[522]);
    }
}
