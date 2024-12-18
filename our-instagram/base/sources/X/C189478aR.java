package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.common.base.Strings;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Stack;
import kotlin.Deprecated;

/* renamed from: X.8aR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189478aR {
    public C3DN A00;
    public C1ZW A01;
    public final C189448aO A02;
    public final BottomSheetFragment A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.3DN] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    public static final C189478aR A00(Context context, Context context2, Fragment fragment, C189478aR c189478aR, C3DN c3dn) {
        C3DP c3dp;
        int i;
        int i2;
        String simpleName;
        C1ZW c1zw;
        Integer num;
        if (c3dn == null) {
            boolean z = context instanceof Activity;
            C3DO c3do = C3DN.A00;
            if (z) {
                c3dp = c3do.A00((Activity) context);
            } else {
                c3dp = c3do.A01(context);
            }
        } else {
            c3dp = c3dn;
        }
        c189478aR.A00 = c3dp;
        if (c3dp == 0) {
            simpleName = fragment.getClass().getSimpleName();
            c1zw = c189478aR.A01;
            if (c1zw != null) {
                num = C05F.A0A;
                C1ZX A00 = c1zw.A00(num, 817895635, 0, false);
                C14360o3.A0A(simpleName);
                A00.A03("class_name", simpleName);
                A00.A00();
            }
            return null;
        }
        C3DP c3dp2 = c3dp;
        if (c3dp2.A0h) {
            C7XU c7xu = c3dp2.A0H;
            if (!c3dp2.A0g && !c3dp2.A0n) {
                simpleName = fragment.getClass().getSimpleName();
                c1zw = c189478aR.A01;
                if (c1zw != null) {
                    num = C05F.A09;
                    C1ZX A002 = c1zw.A00(num, 817895635, 0, false);
                    C14360o3.A0A(simpleName);
                    A002.A03("class_name", simpleName);
                    A002.A00();
                }
            } else {
                c3dp2.A0H = new C24129AnE(context, context2, fragment, c189478aR, c7xu, c3dp);
                c3dp.A0B();
                c3dp2.A0f = true;
                InterfaceC65577TnB interfaceC65577TnB = c3dp2.A0G;
                if (interfaceC65577TnB != null) {
                    interfaceC65577TnB.DWf();
                    return null;
                }
            }
            return null;
        }
        if (c3dn != null) {
            c189478aR.A03.A04 = new C24130AnF(c3dn);
        }
        C189448aO c189448aO = c189478aR.A02;
        if (c189448aO.A0T == null && (fragment instanceof C51D)) {
            c189448aO.A0T = (C51D) fragment;
        }
        if (c189448aO.A1B) {
            c3dp2.A0k = true;
        }
        c3dp2.A0f = false;
        boolean z2 = c3dp instanceof C3DP;
        if (z2) {
            c3dp2.A0J = c189448aO.A0Y;
            c3dp2.A01 = c189448aO.A02;
            c3dp2.A02 = c189448aO.A07;
        }
        c3dp2.A0N = c189448aO.A0k;
        c3dp2.A0X = c189448aO.A10;
        c3dp2.A0R = c189448aO.A0q;
        c3dp2.A0L = c189448aO.A11;
        c3dp2.A0m = c189448aO.A1L;
        c3dp2.A0F = c189448aO.A0V;
        c3dp2.A0T = c189448aO.A0t;
        c3dp2.A0O = c189448aO.A0l;
        c3dp2.A0P = c189448aO.A0n;
        c3dp2.A0G = c189448aO.A0W;
        c3dp2.A0V = c189448aO.A0u;
        c3dp2.A0l = c189448aO.A1K;
        c3dp2.A0p = c189448aO.A1T;
        c3dp2.A0Q = c189448aO.A0o;
        c3dp2.A0M = c189448aO.A0j;
        c3dp2.A07 = (long) c189448aO.A00;
        int i3 = c189448aO.A0B;
        if (i3 != 0) {
            i = context2.getColor(i3);
        } else {
            i = 255;
        }
        int i4 = c189448aO.A0A;
        if (i4 != 0) {
            i2 = context2.getColor(i4);
        } else {
            i2 = c189448aO.A09;
            if (i2 == 0) {
                i2 = 255;
            }
        }
        BottomSheetFragment bottomSheetFragment = c189478aR.A03;
        c3dp.A0O(bottomSheetFragment, C05F.A00, i, i2, c189448aO.A1O);
        if (z2 && (fragment instanceof C51E)) {
            C51E c51e = (C51E) fragment;
            ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp2.A0D;
            if (viewOnTouchListenerC65896Tw0 != null) {
                viewOnTouchListenerC65896Tw0.A0D = c51e;
            }
        }
        c3dp2.A0H = new JXN(c189478aR);
        if (bottomSheetFragment.mView == null) {
            bottomSheetFragment.registerLifecycleListener(new C23618AdD(fragment, c189478aR));
            return c189478aR;
        }
        bottomSheetFragment.A0V(fragment, c189448aO, true, true, false);
        return c189478aR;
    }

    public final C189478aR A02(Activity activity, Fragment fragment) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(fragment, 1);
        return A00(activity, activity, fragment, this, null);
    }

    @Deprecated(message = "")
    public final C189478aR A03(Context context, Fragment fragment) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(fragment, 1);
        return A00(context, context, fragment, this, null);
    }

    public final void A07() {
        A0L(null);
    }

    public final void A0D(Context context, Fragment fragment) {
        C14360o3.A0B(context, 0);
        C189448aO c189448aO = this.A02;
        c189448aO.A0A = AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background);
        c189448aO.A0B = R.color.fds_transparent;
        A00(context, context, fragment, this, null);
    }

    public final void A0E(Fragment fragment, C189448aO c189448aO) {
        C14360o3.A0B(fragment, 1);
        A0F(fragment, c189448aO);
    }

    public final void A0F(Fragment fragment, C189448aO c189448aO) {
        A0H(fragment, c189448aO, true, true, false, false);
    }

    public final void A0G(Fragment fragment, C189448aO c189448aO, boolean z, boolean z2) {
        A0H(fragment, c189448aO, z, z2, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H(Fragment fragment, C189448aO c189448aO, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(c189448aO, 0);
        C14360o3.A0B(fragment, 1);
        C3DN c3dn = this.A00;
        BottomSheetFragment bottomSheetFragment = this.A03;
        Fragment A0M = bottomSheetFragment.A0M();
        if (bottomSheetFragment.isAdded() && c3dn != null && A0M != null) {
            AbstractC10360h2 childFragmentManager = bottomSheetFragment.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            c3dn.A0L(A0M, childFragmentManager, C05F.A0C);
        }
        if (this.A02.A0T == null && (fragment instanceof C51D)) {
            c189448aO.A0T = (C51D) fragment;
        }
        if (z4) {
            boolean z5 = c189448aO.A1J;
            boolean z6 = c189448aO.A1N;
            if (c189448aO.A0K == null && c189448aO.A0v) {
                z5 = true;
            }
            if (c189448aO.A0w) {
                z6 = true;
            }
            A0R(z5, z6);
        }
        bottomSheetFragment.A0V(fragment, c189448aO, z, z2, z3);
    }

    private final void A01() {
        C3DN c3dn;
        Object[] objArr = new Object[0];
        if (this.A00 != null) {
            BottomSheetFragment bottomSheetFragment = this.A03;
            Fragment A0M = bottomSheetFragment.A0M();
            if (A0M != null && (c3dn = this.A00) != null) {
                AbstractC10360h2 childFragmentManager = bottomSheetFragment.getChildFragmentManager();
                C14360o3.A07(childFragmentManager);
                c3dn.A0L(A0M, childFragmentManager, C05F.A0N);
                return;
            }
            return;
        }
        throw new NullPointerException(Strings.A00("mBottomSheetNavigator cannot be null", objArr));
    }

    public final void A04() {
        if (A0S()) {
            BottomSheetFragment bottomSheetFragment = this.A03;
            InterfaceC56392iX interfaceC56392iX = bottomSheetFragment.subtitleTextView;
            if (bottomSheetFragment.isAdded() && interfaceC56392iX != null && interfaceC56392iX.getView() != null) {
                ((TextView) interfaceC56392iX.getView()).setTextSize(14.0f);
                interfaceC56392iX.getView().setTranslationY(-20.0f);
            }
        }
    }

    public final void A06() {
        TextView textView;
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0d = null;
        InterfaceC56392iX interfaceC56392iX = bottomSheetFragment.titleTextView;
        if (interfaceC56392iX != null && (textView = (TextView) interfaceC56392iX.getView()) != null) {
            textView.setText("");
        }
        InterfaceC56392iX interfaceC56392iX2 = bottomSheetFragment.titleTextView;
        if (interfaceC56392iX2 != null) {
            interfaceC56392iX2.setVisibility(8);
        }
        BottomSheetFragment.A0E(bottomSheetFragment, null, null);
        BottomSheetFragment.A0C(bottomSheetFragment);
        BottomSheetFragment.A05(bottomSheetFragment.requireContext(), bottomSheetFragment);
    }

    public final void A0A(int i, int i2) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        ImageView imageView = bottomSheetFragment.dragHandleView;
        if (imageView != null) {
            AbstractC13880nE.A0d(imageView, i);
            ImageView imageView2 = bottomSheetFragment.dragHandleView;
            if (imageView2 != null) {
                AbstractC13880nE.A0Y(imageView2, i2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0B(int i, int i2) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (bottomSheetFragment.isAdded() && bottomSheetFragment.mView != null) {
            A0C(i, i2);
        } else {
            bottomSheetFragment.registerLifecycleListener(new C23620AdF(this, i, i2));
        }
    }

    public final void A0C(int i, int i2) {
        Drawable background;
        Drawable mutate;
        BottomSheetFragment bottomSheetFragment = this.A03;
        C189448aO c189448aO = bottomSheetFragment.A03;
        if (c189448aO != null) {
            c189448aO.A06 = i;
        }
        ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
        if (viewGroup != null && (background = viewGroup.getBackground()) != null && (mutate = background.mutate()) != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        ImageView imageView = bottomSheetFragment.dragHandleView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
        }
    }

    public final void A0I(C189468aQ c189468aQ) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0S = c189468aQ;
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        this.A02.A0S = c189468aQ;
    }

    public final void A0J(C189468aQ c189468aQ, boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0Q = c189468aQ;
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        if (z) {
            this.A02.A0Q = c189468aQ;
        }
    }

    public final void A0K(C189468aQ c189468aQ, boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0R = c189468aQ;
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        if (z) {
            this.A02.A0R = c189468aQ;
        }
    }

    @Deprecated(message = "")
    public final void A0L(C7XU c7xu) {
        C3DN c3dn = this.A00;
        if (c3dn != null) {
            if (c7xu != null) {
                ((C3DP) c3dn).A0H = c7xu;
            }
            c3dn.A0B();
        }
    }

    public final void A0M(String str) {
        TextView textView;
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A0d = str;
        if (str != null && str.length() != 0) {
            InterfaceC56392iX interfaceC56392iX = bottomSheetFragment.titleTextView;
            if (interfaceC56392iX != null && (textView = (TextView) interfaceC56392iX.getView()) != null) {
                textView.setText(str);
            }
            InterfaceC56392iX interfaceC56392iX2 = bottomSheetFragment.titleTextView;
            if (interfaceC56392iX2 != null) {
                interfaceC56392iX2.setVisibility(0);
            }
            BottomSheetFragment.A0E(bottomSheetFragment, str, null);
            BottomSheetFragment.A0C(bottomSheetFragment);
            BottomSheetFragment.A05(bottomSheetFragment.requireContext(), bottomSheetFragment);
        }
    }

    public final void A0O(boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        BottomSheetFragment.A00(bottomSheetFragment).A02();
        bottomSheetFragment.A0R();
        bottomSheetFragment.A0R();
        if (z) {
            this.A02.A02();
        }
    }

    public final void A0P(boolean z) {
        View view;
        InterfaceC56392iX interfaceC56392iX = this.A03.rightLoadingSpinnerIcon;
        if (z) {
            if (interfaceC56392iX != null && (view = interfaceC56392iX.getView()) != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (interfaceC56392iX == null || !interfaceC56392iX.CWW()) {
            return;
        }
        interfaceC56392iX.setVisibility(8);
    }

    public final void A0Q(boolean z) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        bottomSheetFragment.A06 = z;
        bottomSheetFragment.A0Q();
    }

    public final void A0R(boolean z, boolean z2) {
        BottomSheetFragment bottomSheetFragment = this.A03;
        bottomSheetFragment.A06 = z;
        bottomSheetFragment.A07 = z2;
        bottomSheetFragment.A0Q();
    }

    public final boolean A0S() {
        Fragment A0M;
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (bottomSheetFragment.isAdded() && (A0M = bottomSheetFragment.A0M()) != null) {
            return A0M.isVisible();
        }
        return false;
    }

    public final boolean A0T() {
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (!bottomSheetFragment.isAdded()) {
            return false;
        }
        return bottomSheetFragment.onBackPressed();
    }

    public C189478aR(AbstractC12990ll abstractC12990ll, C189448aO c189448aO) {
        this.A02 = c189448aO;
        Bundle bundle = new Bundle();
        AbstractC03240Dh.A00(bundle, abstractC12990ll);
        BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
        bottomSheetFragment.setArguments(bundle);
        this.A03 = bottomSheetFragment;
        bottomSheetFragment.A03 = c189448aO;
        boolean z = c189448aO.A1J;
        boolean z2 = c189448aO.A1N;
        if (c189448aO.A0K == null && c189448aO.A0v) {
            z = true;
        }
        A0R(z, c189448aO.A0w ? true : z2);
        bottomSheetFragment.A02 = this;
        UserSession A01 = AbstractC03270Dk.A01(abstractC12990ll);
        if (A01 != null) {
            this.A01 = C1ZV.A00(A01);
        }
    }

    public final void A05() {
        A01();
        this.A03.A0N();
    }

    public final void A08() {
        A01();
        BottomSheetFragment bottomSheetFragment = this.A03;
        if (bottomSheetFragment.A0D.size() > 1) {
            bottomSheetFragment.A0P();
        } else {
            C0w9.A03("BottomSheet", "Can't pop bottom sheet with empty back stack");
        }
    }

    public final void A09(int i) {
        View view;
        if (A0S()) {
            BottomSheetFragment bottomSheetFragment = this.A03;
            ViewGroup viewGroup = bottomSheetFragment.titleAndNavContainer;
            if (bottomSheetFragment.isAdded() && viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.height = i;
                viewGroup.setLayoutParams(layoutParams);
                ImageView imageView = bottomSheetFragment.dragHandleView;
                if (imageView != null) {
                    imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), 0);
                }
            }
            InterfaceC56392iX interfaceC56392iX = bottomSheetFragment.navBarDivider;
            if (interfaceC56392iX != null && (view = interfaceC56392iX.getView()) != null) {
                view.setBackgroundColor(bottomSheetFragment.requireContext().getColor(AbstractC53242c7.A0H(bottomSheetFragment.requireContext(), R.attr.igds_color_creation_tools_grey_08)));
            }
        }
    }

    public final void A0N(String str, boolean z) {
        A01();
        BottomSheetFragment bottomSheetFragment = this.A03;
        ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
        if (viewGroup != null) {
            AbstractC13880nE.A0O(viewGroup);
            bottomSheetFragment.DOM();
        }
        if (bottomSheetFragment.getChildFragmentManager().A0L() > 0) {
            AbstractC10360h2 childFragmentManager = bottomSheetFragment.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            int A0L = childFragmentManager.A0L();
            for (int i = 0; i < A0L; i++) {
                String str2 = ((AbstractC016706m) childFragmentManager.A0S(i)).A09;
                if (str2 != null && str2.equals(str)) {
                    if (BottomSheetFragment.A0I(bottomSheetFragment)) {
                        boolean A0H = BottomSheetFragment.A0H(bottomSheetFragment);
                        Stack stack = bottomSheetFragment.A0D;
                        Object peek = stack.peek();
                        if (peek != null) {
                            if (!str.equals(((C189448aO) peek).A0f)) {
                                C18C.A0J(bottomSheetFragment.getChildFragmentManager().A18(str, 0), "fragmentId not in ChildFragmentManager stack", new Object[0]);
                                while (true) {
                                    Object peek2 = stack.peek();
                                    if (peek2 != null) {
                                        if (!str.equals(((C189448aO) peek2).A0f)) {
                                            InterfaceC86363t8 interfaceC86363t8 = BottomSheetFragment.A00(bottomSheetFragment).A0X;
                                            if (interfaceC86363t8 != null) {
                                                C3DN bottomSheetNavigator = bottomSheetFragment.A04.getBottomSheetNavigator();
                                                if (bottomSheetNavigator != null) {
                                                    bottomSheetNavigator.A0S(interfaceC86363t8);
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                            if (A0H) {
                                                stack.pop();
                                            }
                                        } else if (BottomSheetFragment.A0H(bottomSheetFragment)) {
                                            bottomSheetFragment.A03 = (C189448aO) stack.peek();
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    if (z) {
                        bottomSheetFragment.A0P();
                        return;
                    }
                    BottomSheetFragment.A09(bottomSheetFragment);
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = bottomSheetFragment.contentView;
                    if (touchInterceptorFrameLayout != null) {
                        touchInterceptorFrameLayout.post(new RunnableC24471Asq(bottomSheetFragment));
                        return;
                    }
                    return;
                }
            }
        }
    }
}
