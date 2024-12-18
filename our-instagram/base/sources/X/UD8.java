package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.R;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UD8 extends VKK implements InterfaceC71831X6n {
    public static final Interpolator A0Q = new AccelerateInterpolator();
    public static final Interpolator A0R = new DecelerateInterpolator();
    public Context A01;
    public Context A02;
    public View A03;
    public UDE A04;
    public XDW A05;
    public VK7 A06;
    public C69708Vu3 A07;
    public ActionBarContainer A08;
    public ActionBarContextView A09;
    public ActionBarOverlayLayout A0A;
    public InterfaceC71936XBl A0B;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public Activity A0K;
    public ArrayList A0L = new ArrayList();
    public ArrayList A0C = new ArrayList();
    public int A00 = 0;
    public boolean A0D = true;
    public boolean A0M = true;
    public final C04F A0N = new UET(this, 2);
    public final C04F A0O = new UET(this, 3);
    public final C04G A0P = new WQS(this);

    public static void A01(UD8 ud8, boolean z) {
        View view;
        View view2;
        View view3;
        boolean z2 = ud8.A0F;
        boolean z3 = true;
        if (!ud8.A0J && z2) {
            z3 = false;
        }
        boolean z4 = ud8.A0M;
        if (z3) {
            if (!z4) {
                ud8.A0M = true;
                C69708Vu3 c69708Vu3 = ud8.A07;
                if (c69708Vu3 != null) {
                    c69708Vu3.A00();
                }
                ud8.A08.setVisibility(0);
                if (ud8.A00 == 0 && (ud8.A0I || z)) {
                    ud8.A08.setTranslationY(0.0f);
                    float f = -ud8.A08.getHeight();
                    if (z) {
                        ud8.A08.getLocationInWindow(new int[]{0, 0});
                        f -= r1[1];
                    }
                    ud8.A08.setTranslationY(f);
                    C69708Vu3 c69708Vu32 = new C69708Vu3();
                    C04E A03 = AbstractC010103p.A03(ud8.A08);
                    A03.A03(0.0f);
                    final C04G c04g = ud8.A0P;
                    final View view4 = (View) A03.A00.get();
                    if (view4 != null) {
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
                        if (c04g != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.04B
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    c04g.Cwi(view4);
                                }
                            };
                        }
                        view4.animate().setUpdateListener(animatorUpdateListener);
                    }
                    if (!c69708Vu32.A03) {
                        c69708Vu32.A04.add(A03);
                    }
                    if (ud8.A0D && (view3 = ud8.A03) != null) {
                        view3.setTranslationY(f);
                        C04E A032 = AbstractC010103p.A03(view3);
                        A032.A03(0.0f);
                        if (!c69708Vu32.A03) {
                            c69708Vu32.A04.add(A032);
                        }
                    }
                    Interpolator interpolator = A0R;
                    boolean z5 = c69708Vu32.A03;
                    if (!z5) {
                        c69708Vu32.A01 = interpolator;
                        c69708Vu32.A00 = 250L;
                    }
                    C04F c04f = ud8.A0O;
                    if (!z5) {
                        c69708Vu32.A02 = c04f;
                    }
                    ud8.A07 = c69708Vu32;
                    c69708Vu32.A01();
                } else {
                    ud8.A08.setAlpha(1.0f);
                    ud8.A08.setTranslationY(0.0f);
                    if (ud8.A0D && (view2 = ud8.A03) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    ud8.A0O.CwY(null);
                }
                ActionBarOverlayLayout actionBarOverlayLayout = ud8.A0A;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.requestApplyInsets();
                    return;
                }
                return;
            }
            return;
        }
        if (!z4) {
            return;
        }
        ud8.A0M = false;
        C69708Vu3 c69708Vu33 = ud8.A07;
        if (c69708Vu33 != null) {
            c69708Vu33.A00();
        }
        if (ud8.A00 == 0 && (ud8.A0I || z)) {
            ud8.A08.setAlpha(1.0f);
            ud8.A08.setTransitioning(true);
            C69708Vu3 c69708Vu34 = new C69708Vu3();
            float f2 = -ud8.A08.getHeight();
            if (z) {
                ud8.A08.getLocationInWindow(new int[]{0, 0});
                f2 -= r1[1];
            }
            C04E A033 = AbstractC010103p.A03(ud8.A08);
            A033.A03(f2);
            final C04G c04g2 = ud8.A0P;
            final View view5 = (View) A033.A00.get();
            if (view5 != null) {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = null;
                if (c04g2 != null) {
                    animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.04B
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            c04g2.Cwi(view5);
                        }
                    };
                }
                view5.animate().setUpdateListener(animatorUpdateListener2);
            }
            if (!c69708Vu34.A03) {
                c69708Vu34.A04.add(A033);
            }
            if (ud8.A0D && (view = ud8.A03) != null) {
                C04E A034 = AbstractC010103p.A03(view);
                A034.A03(f2);
                if (!c69708Vu34.A03) {
                    c69708Vu34.A04.add(A034);
                }
            }
            Interpolator interpolator2 = A0Q;
            boolean z6 = c69708Vu34.A03;
            if (!z6) {
                c69708Vu34.A01 = interpolator2;
                c69708Vu34.A00 = 250L;
            }
            C04F c04f2 = ud8.A0N;
            if (!z6) {
                c69708Vu34.A02 = c04f2;
            }
            ud8.A07 = c69708Vu34;
            c69708Vu34.A01();
            return;
        }
        ud8.A0N.CwY(null);
    }

    public final void A0L(boolean z) {
        boolean z2;
        C04E A03;
        C04E A032;
        long j;
        boolean z3 = this.A0J;
        if (z) {
            if (!z3) {
                this.A0J = true;
                z2 = false;
                A01(this, z2);
            }
        } else if (z3) {
            z2 = false;
            this.A0J = false;
            A01(this, z2);
        }
        boolean isLaidOut = this.A08.isLaidOut();
        InterfaceC71936XBl interfaceC71936XBl = this.A0B;
        if (isLaidOut) {
            if (z) {
                WPa wPa = (WPa) interfaceC71936XBl;
                A032 = AbstractC010103p.A03(wPa.A09);
                A032.A02(0.0f);
                A032.A04(100L);
                A032.A07(new UEU(wPa, 4));
                ActionBarContextView actionBarContextView = this.A09;
                C04E c04e = actionBarContextView.A03;
                if (c04e != null) {
                    c04e.A00();
                }
                if (actionBarContextView.getVisibility() != 0) {
                    actionBarContextView.setAlpha(0.0f);
                }
                A03 = AbstractC010103p.A03(actionBarContextView);
                A03.A02(1.0f);
                A03.A04(200L);
                WQR wqr = actionBarContextView.A0J;
                wqr.A02.A03 = A03;
                wqr.A00 = 0;
                A03.A07(wqr);
            } else {
                WPa wPa2 = (WPa) interfaceC71936XBl;
                A03 = AbstractC010103p.A03(wPa2.A09);
                A03.A02(1.0f);
                A03.A04(200L);
                A03.A07(new UEU(wPa2, 0));
                ActionBarContextView actionBarContextView2 = this.A09;
                C04E c04e2 = actionBarContextView2.A03;
                if (c04e2 != null) {
                    c04e2.A00();
                }
                A032 = AbstractC010103p.A03(actionBarContextView2);
                A032.A02(0.0f);
                A032.A04(100L);
                WQR wqr2 = actionBarContextView2.A0J;
                wqr2.A02.A03 = A032;
                wqr2.A00 = 8;
                A032.A07(wqr2);
            }
            C69708Vu3 c69708Vu3 = new C69708Vu3();
            ArrayList arrayList = c69708Vu3.A04;
            arrayList.add(A032);
            View view = (View) A032.A00.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            A03.A05(j);
            arrayList.add(A03);
            c69708Vu3.A01();
            return;
        }
        if (z) {
            ((WPa) interfaceC71936XBl).A09.setVisibility(4);
            this.A09.setVisibility(0);
        } else {
            ((WPa) interfaceC71936XBl).A09.setVisibility(0);
            this.A09.setVisibility(8);
        }
    }

    public UD8(Dialog dialog) {
        A00(dialog.getWindow().getDecorView());
    }

    private void A00(View view) {
        String str;
        InterfaceC71936XBl wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0A = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof InterfaceC71936XBl) {
            wrapper = (InterfaceC71936XBl) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = AbstractC31173DnH.A0q(findViewById);
            } else {
                str = "null";
            }
            throw AbstractC31175DnJ.A0V("Can't make a decor toolbar out of ", str);
        }
        this.A0B = wrapper;
        this.A09 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A08 = actionBarContainer;
        InterfaceC71936XBl interfaceC71936XBl = this.A0B;
        if (interfaceC71936XBl != null && this.A09 != null && actionBarContainer != null) {
            WPa wPa = (WPa) interfaceC71936XBl;
            Context context = wPa.A09.getContext();
            this.A01 = context;
            if ((wPa.A01 & 4) != 0) {
                this.A0E = true;
            }
            context.getApplicationInfo();
            context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
            this.A08.setTabContainer(null);
            ((WPa) this.A0B).A09.setCollapsible(false);
            this.A0A.A05 = false;
            TypedArray obtainStyledAttributes = this.A01.obtainStyledAttributes(null, AbstractC53402cO.A00, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0A;
                if (actionBarOverlayLayout2.A06) {
                    this.A0G = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                this.A08.setElevation(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw AbstractC31175DnJ.A0V(AbstractC31173DnH.A0q(this), " can only be used with a compatible window decor layout");
    }

    public UD8(Activity activity, boolean z) {
        this.A0K = activity;
        View A08 = AbstractC43592JPx.A08(activity);
        A00(A08);
        if (!z) {
            this.A03 = A08.findViewById(android.R.id.content);
        }
    }
}
