package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class ANB implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ANB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Animator animator2;
        switch (this.A00) {
            case 3:
            case 5:
                AbstractC166987dD.A1Y(this.A01);
                animator2 = (Animator) this.A02;
                break;
            case 4:
            case 6:
                AbstractC166987dD.A1Y(this.A01);
                animator2 = (Animator) this.A02;
                break;
            case 7:
                C36472G6w c36472G6w = (C36472G6w) this.A02;
                int A01 = AbstractC167027dH.A01(c36472G6w.A04);
                RecyclerView recyclerView = c36472G6w.A00;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.height = A01;
                recyclerView.setLayoutParams(layoutParams);
                AbstractC166987dD.A1Y(this.A01);
                return;
            default:
                return;
        }
        animator2.removeAllListeners();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Activity activity;
        Animator animator2;
        switch (this.A00) {
            case 0:
                Dialog dialog = (Dialog) this.A02;
                if (!dialog.isShowing() || (activity = (Activity) this.A01) == null || activity.isDestroyed()) {
                    return;
                }
                dialog.dismiss();
                return;
            case 1:
                return;
            case 2:
                View view = (View) this.A02;
                view.setAlpha(0.0f);
                view.setVisibility(8);
                C184668Hh c184668Hh = (C184668Hh) this.A01;
                ObjectAnimator objectAnimator = c184668Hh.A00;
                if (objectAnimator == null) {
                    return;
                }
                objectAnimator.removeAllListeners();
                c184668Hh.A00 = null;
                return;
            case 3:
            case 5:
                AbstractC166987dD.A1Y(this.A01);
                animator2 = (Animator) this.A02;
                animator2.removeAllListeners();
                return;
            case 4:
            case 6:
            default:
                AbstractC166987dD.A1Y(this.A01);
                animator2 = (Animator) this.A02;
                animator2.removeAllListeners();
                return;
            case 7:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 8:
                InterfaceC19630xq interfaceC19630xq = ((C23031Ai) this.A01).A01;
                String A00 = AbstractC111324zv.A00(1281);
                AbstractC167007dF.A18(interfaceC19630xq, A00, interfaceC19630xq.getInt(A00, 0) + 1);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(((C148176ln) this.A02).A0V);
                animatorSet.start();
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 1:
                View view = (View) this.A01;
                view.setVisibility(0);
                ABE abe = (ABE) this.A02;
                AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                A01.A0U(0.8f, 1.0f, -1.0f);
                A01.A0V(0.8f, 1.0f, -1.0f);
                A01.A0E(C55942hf.A02(20.0d)).A0H();
                view.post(new RunnableC24591Aum(view, abe));
                return;
            case 7:
                RecyclerView recyclerView = ((C36472G6w) this.A02).A00;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.height = 0;
                recyclerView.setLayoutParams(layoutParams);
                recyclerView.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
