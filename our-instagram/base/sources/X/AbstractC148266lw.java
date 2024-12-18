package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC148266lw {
    public static final InterfaceC148316m1 A01;
    public static final AtomicBoolean A03;
    public static final List A02 = AbstractC16960so.A1Q(0, 2, 3);
    public static final OvershootInterpolator A00 = new OvershootInterpolator(1.0f);

    static {
        C148276lx c148276lx = C148276lx.A0a;
        A01 = new C148306m0(AbstractC148296lz.A06(EnumC150226pU.A1A, "placeholder_sticker_id"));
        A03 = new AtomicBoolean(false);
    }

    public static final void A00(Animator.AnimatorListener animatorListener, List list) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(50L);
        ofFloat.addUpdateListener(new ANK(list));
        ofFloat.addListener(animatorListener);
        ofFloat.start();
    }

    public static final void A01(List list) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(A00);
        ofFloat.addUpdateListener(new ANL(list));
        ofFloat.start();
    }
}
