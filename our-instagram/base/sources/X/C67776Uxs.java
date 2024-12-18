package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Uxs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67776Uxs extends AbstractC69084Vha {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public final TextWatcher A02;
    public final View.OnFocusChangeListener A03;
    public final InterfaceC71913X9x A04;
    public final InterfaceC71914X9y A05;

    public static void A00(C67776Uxs c67776Uxs, boolean z) {
        Animator animator;
        boolean A0M = ((AbstractC69084Vha) c67776Uxs).A02.A0M();
        boolean A1P = AbstractC167007dF.A1P(A0M ? 1 : 0, z ? 1 : 0);
        AnimatorSet animatorSet = c67776Uxs.A00;
        if (z) {
            if (!animatorSet.isRunning()) {
                c67776Uxs.A01.cancel();
                c67776Uxs.A00.start();
                if (A1P) {
                    animator = c67776Uxs.A00;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            animatorSet.cancel();
            c67776Uxs.A01.start();
            if (!A1P) {
                return;
            } else {
                animator = c67776Uxs.A01;
            }
        }
        animator.end();
    }

    public C67776Uxs(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.A02 = new WKU(this, 1);
        this.A03 = new WNY(this, 2);
        this.A04 = new C70540WcW(this);
        this.A05 = new C70543WcZ(this);
    }
}
