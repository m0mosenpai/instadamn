package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.0mg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13540mg extends AnonymousClass073 {
    public final C13420mS A00;

    @Override // X.AnonymousClass073
    public final void A04(ViewGroup viewGroup) {
        C10300gw c10300gw = ((AbstractC014105h) this.A00).A00;
        View view = c10300gw.A07.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        c10300gw.A02(this);
        AbstractC10360h2.A0H(2);
    }

    @Override // X.AnonymousClass073
    public final void A05(final ViewGroup viewGroup) {
        C13420mS c13420mS = this.A00;
        if (!c13420mS.A01()) {
            Context context = viewGroup.getContext();
            final C10300gw c10300gw = ((AbstractC014105h) c13420mS).A00;
            final View view = c10300gw.A07.mView;
            C14360o3.A07(context);
            AnonymousClass064 A02 = c13420mS.A02(context);
            if (A02 != null) {
                Animation animation = A02.A01;
                if (animation != null) {
                    if (c10300gw.A00 != C05F.A00) {
                        view.startAnimation(animation);
                    } else {
                        viewGroup.startViewTransition(view);
                        AnonymousClass065 anonymousClass065 = new AnonymousClass065(view, viewGroup, animation);
                        anonymousClass065.setAnimationListener(new Animation.AnimationListener() { // from class: X.05d
                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation2) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation2) {
                                AbstractC10360h2.A0H(2);
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation2) {
                                final ViewGroup viewGroup2 = viewGroup;
                                final View view2 = view;
                                final C13540mg c13540mg = this;
                                viewGroup2.post(new Runnable() { // from class: X.05c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ViewGroup viewGroup3 = viewGroup2;
                                        View view3 = view2;
                                        C13540mg c13540mg2 = c13540mg;
                                        viewGroup3.endViewTransition(view3);
                                        ((AbstractC014105h) c13540mg2.A00).A00.A02(c13540mg2);
                                    }
                                });
                                AbstractC10360h2.A0H(2);
                            }
                        });
                        view.startAnimation(anonymousClass065);
                        AbstractC10360h2.A0H(2);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        ((AbstractC014105h) c13420mS).A00.A02(this);
    }

    public C13540mg(C13420mS c13420mS) {
        this.A00 = c13420mS;
    }
}
