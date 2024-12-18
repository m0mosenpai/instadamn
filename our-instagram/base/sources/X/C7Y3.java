package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Y3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Y3 {
    public float A00;
    public View A01;
    public View A02;
    public InterfaceC56392iX A03;
    public boolean A04;
    public final AbstractC59962oe A05;
    public final InterfaceC11380iw A06;
    public final InterfaceC41501vz A07;
    public final UserSession A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;

    public C7Y3(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC16820sZ, 4);
        this.A05 = abstractC59962oe;
        this.A08 = userSession;
        this.A06 = interfaceC11380iw;
        this.A09 = interfaceC16820sZ;
        this.A0A = interfaceC16820sZ2;
        this.A07 = new InterfaceC41501vz() { // from class: X.7Y4
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-619163748);
                LYK lyk = (LYK) obj;
                int A032 = C0f9.A03(1053557649);
                C14360o3.A0B(lyk, 0);
                if (lyk.A01) {
                    String str = lyk.A00;
                    final C7Y3 c7y3 = C7Y3.this;
                    if (C14360o3.A0K(str, ((C7U0) c7y3.A09.invoke()).C7r().C7I())) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(500L);
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.9RS
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                C7Y3.this.A04 = false;
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                C7Y3.this.A04 = true;
                            }
                        });
                        ofFloat.addUpdateListener(new ANG(c7y3));
                        ofFloat.start();
                    }
                }
                C0f9.A0A(-103470697, A032);
                C0f9.A0A(1915023420, A03);
            }
        };
    }

    public static final ViewGroup A00(C7Y3 c7y3) {
        ViewGroup viewGroup;
        Window window = AbstractC13110lx.A00(c7y3.A05.requireActivity()).getWindow();
        View view = null;
        if (window != null) {
            view = window.getDecorView();
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            return viewGroup;
        }
        throw new IllegalStateException("Couldn't find activity root view");
    }
}
