package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.6Yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140806Yi {
    public static int A00;
    public static int A01;
    public static Interpolator A02;
    public static boolean A03;
    public static boolean A04;

    public static Animation A00(Fragment fragment, int i, boolean z, boolean z2, boolean z3, final boolean z4) {
        final Context context;
        int i2;
        int i3;
        int i4;
        final View view = fragment.mView;
        if (fragment instanceof AbstractC59962oe) {
            context = ((AbstractC59962oe) fragment).getThemedContext();
        } else {
            context = fragment.getContext();
        }
        Animation animation = null;
        if (z) {
            context.getClass();
            animation = AnimationUtils.loadAnimation(context, i);
            animation.setAnimationListener(new Animation.AnimationListener() { // from class: X.6we
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation2) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation2) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation2) {
                    View view2 = view;
                    if (view2 != null) {
                        Context context2 = context;
                        view2.setElevation(AbstractC13880nE.A04(context2, 4));
                        if (!z4) {
                            view2.setBackground(new ColorDrawable(AbstractC53242c7.A0F(context2, R.attr.igds_color_primary_background)));
                        }
                    }
                }
            });
            if (A03) {
                animation.setInterpolator(A02);
                if (z3) {
                    i4 = A00;
                } else {
                    i4 = A01;
                }
                animation.setDuration(i4);
                A03 = false;
            }
            if (!A04 && (context instanceof C2d4)) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.6we
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation2) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation2) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation2) {
                        View view2 = view;
                        if (view2 != null) {
                            Context context2 = context;
                            view2.setElevation(AbstractC13880nE.A04(context2, 4));
                            if (!z4) {
                                view2.setBackground(new ColorDrawable(AbstractC53242c7.A0F(context2, R.attr.igds_color_primary_background)));
                            }
                        }
                    }
                });
                if (A03) {
                    loadAnimation.setInterpolator(A02);
                    if (z3) {
                        i3 = A00;
                    } else {
                        i3 = A01;
                    }
                    loadAnimation.setDuration(i3);
                    A03 = false;
                }
                loadAnimation.reset();
                Activity activity = (Activity) context;
                ViewGroup viewGroup = C56352iT.A0t.A03(activity).A0P;
                viewGroup.clearAnimation();
                viewGroup.setAnimation(loadAnimation);
                View findViewById = activity.findViewById(android.R.id.statusBarBackground);
                if (findViewById != null) {
                    findViewById.clearAnimation();
                    findViewById.setAnimation(loadAnimation);
                }
            }
        } else if (view != null && z2) {
            A04 = fragment instanceof InterfaceC60122ou;
            context.getClass();
            view.setElevation(0.0f);
            animation = AnimationUtils.loadAnimation(context, i);
            if (A03) {
                animation.setInterpolator(A02);
                if (z3) {
                    i2 = A00;
                } else {
                    i2 = A01;
                }
                animation.setDuration(i2);
                A03 = false;
                return animation;
            }
        }
        return animation;
    }
}
