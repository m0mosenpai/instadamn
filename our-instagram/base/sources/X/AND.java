package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes4.dex */
public final class AND implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final C3OO A0C;
    public final /* synthetic */ int A0D;
    public final /* synthetic */ C8SB A0E;
    public final /* synthetic */ C3OO A0F;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AND(C8SB c8sb, C3OO c3oo, C3OO c3oo2, float f, float f2, float f3, float f4, int i, int i2) {
        this.A0E = c8sb;
        this.A0D = i2;
        this.A0F = c3oo2;
        this.A0A = i;
        this.A0C = c3oo;
        this.A06 = f;
        this.A07 = f2;
        this.A08 = f3;
        this.A09 = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0B = ofFloat;
        ANV.A00(ofFloat, this, 0);
        ofFloat.setTarget(c3oo.itemView);
        ofFloat.addListener(this);
        this.A00 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3OO c3oo;
        if (!this.A05) {
            this.A0C.setIsRecyclable(true);
        }
        this.A05 = true;
        if (!this.A04) {
            int i = this.A0D;
            C8SB c8sb = this.A0E;
            if (i <= 0) {
                C8S8 c8s8 = c8sb.A0F;
                RecyclerView recyclerView = c8sb.A0I;
                c3oo = this.A0F;
                c8s8.clearView(recyclerView, c3oo);
            } else {
                List list = c8sb.A0Q;
                c3oo = this.A0F;
                list.add(c3oo.itemView);
                this.A03 = true;
                c8sb.A0I.post(new RunnableC24720Ax1(this, c8sb, i));
            }
            if (c8sb.A0D == c3oo.itemView) {
                c8sb.A0D = null;
            }
        }
    }
}
