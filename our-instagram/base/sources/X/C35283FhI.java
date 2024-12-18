package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.FhI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35283FhI implements Animator.AnimatorListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ boolean A03;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C35283FhI(Context context, View view, Fragment fragment, boolean z) {
        this.A02 = fragment;
        this.A00 = context;
        this.A01 = view;
        this.A03 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.A01;
        if (this.A03 && view != null) {
            view.setElevation(0.0f);
            view.setBackground(AbstractC140816Yj.A02);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Context context = this.A00;
        View view = this.A01;
        if (this.A03 && view != null) {
            view.setElevation(AbstractC13880nE.A04(context, 4));
            Drawable background = view.getBackground();
            background.getClass();
            AbstractC140816Yj.A02 = background;
            AbstractC31174DnI.A1C(view, AbstractC53242c7.A00(context));
        }
    }
}
