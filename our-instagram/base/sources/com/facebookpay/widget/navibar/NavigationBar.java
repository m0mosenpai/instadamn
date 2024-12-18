package com.facebookpay.widget.navibar;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC55922hc;
import X.AbstractC70177WFc;
import X.AnonymousClass013;
import X.C00O;
import X.C0YR;
import X.C110964z8;
import X.C14360o3;
import X.C17060sy;
import X.C2FP;
import X.C60615REa;
import X.C69679VtP;
import X.InterfaceC16530ry;
import X.MSX;
import X.Q1y;
import X.VEP;
import X.VET;
import X.VTA;
import X.W5t;
import X.WF7;
import X.WOE;
import X.X6H;
import X.X6I;
import X.X6J;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes11.dex */
public final class NavigationBar extends FrameLayout {
    public static final /* synthetic */ C0YR[] A0g = {new AnonymousClass013(NavigationBar.class, DialogModule.KEY_TITLE, "getTitle()Ljava/lang/String;", 0), new AnonymousClass013(NavigationBar.class, "titleIcon", "getTitleIcon()Lcom/facebookpay/widget/style/Icon;", 0), new AnonymousClass013(NavigationBar.class, "leftIconButtonIcon", "getLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;", 0), new AnonymousClass013(NavigationBar.class, "isLeftProfileIcon", "isLeftProfileIcon()Z", 0), new AnonymousClass013(NavigationBar.class, "leftIconButtonOnClickListener", "getLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(NavigationBar.class, "leftTextButtonText", "getLeftTextButtonText()Ljava/lang/String;", 0), new AnonymousClass013(NavigationBar.class, "isRightProfileIcon", "isRightProfileIcon()Z", 0), new AnonymousClass013(NavigationBar.class, "rightIconButtonIcon", "getRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;", 0), new AnonymousClass013(NavigationBar.class, "rightIconButtonOnClickListener", "getRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(NavigationBar.class, "rightTextButtonText", "getRightTextButtonText()Ljava/lang/String;", 0), new AnonymousClass013(NavigationBar.class, "leftIconButtonEnable", "getLeftIconButtonEnable()Z", 0), new AnonymousClass013(NavigationBar.class, "rightIconButtonEnable", "getRightIconButtonEnable()Z", 0), new AnonymousClass013(NavigationBar.class, "leftTextButtonEnable", "getLeftTextButtonEnable()Z", 0), new AnonymousClass013(NavigationBar.class, "rightTextButtonEnable", "getRightTextButtonEnable()Z", 0), new AnonymousClass013(NavigationBar.class, "navBarClickableActionsEnable", "getNavBarClickableActionsEnable()Z", 0), new AnonymousClass013(NavigationBar.class, "progressIconShow", "getProgressIconShow()Z", 0), new AnonymousClass013(NavigationBar.class, "leftIconButtonLabel", "getLeftIconButtonLabel()Ljava/lang/String;", 0), new AnonymousClass013(NavigationBar.class, "leftTextButtonHint", "getLeftTextButtonHint()Ljava/lang/String;", 0), new AnonymousClass013(NavigationBar.class, "rightIconButtonLabel", "getRightIconButtonLabel()Ljava/lang/String;", 0), new AnonymousClass013(NavigationBar.class, "rightTextButtonHint", "getRightTextButtonHint()Ljava/lang/String;", 0), new AnonymousClass013(NavigationBar.class, "leftTextButtonOnClickListener", "getLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(NavigationBar.class, "rightTextButtonOnClickListener", "getRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(NavigationBar.class, "bottomDividerVisible", "getBottomDividerVisible()Z", 0)};
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public LinearLayout A09;
    public ProgressBar A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public Q1y A0E;
    public boolean A0F;
    public final WOE A0G;
    public final WOE A0H;
    public final WOE A0I;
    public final InterfaceC16530ry A0J;
    public final InterfaceC16530ry A0K;
    public final InterfaceC16530ry A0L;
    public final InterfaceC16530ry A0M;
    public final InterfaceC16530ry A0N;
    public final InterfaceC16530ry A0O;
    public final InterfaceC16530ry A0P;
    public final InterfaceC16530ry A0Q;
    public final InterfaceC16530ry A0R;
    public final InterfaceC16530ry A0S;
    public final InterfaceC16530ry A0T;
    public final InterfaceC16530ry A0U;
    public final InterfaceC16530ry A0V;
    public final InterfaceC16530ry A0W;
    public final InterfaceC16530ry A0X;
    public final InterfaceC16530ry A0Y;
    public final InterfaceC16530ry A0Z;
    public final InterfaceC16530ry A0a;
    public final InterfaceC16530ry A0b;
    public final InterfaceC16530ry A0c;
    public final InterfaceC16530ry A0d;
    public final InterfaceC16530ry A0e;
    public final InterfaceC16530ry A0f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0H = new WOE(this, 7);
        this.A0G = new WOE(this, 6);
        this.A0I = new WOE(this, 8);
        this.A0e = new X6J(this, 66);
        this.A0f = new X6I(6, context, this);
        this.A0N = new X6I(7, context, this);
        this.A0K = new X6H(0, this, false);
        this.A0P = new X6H(this, 1);
        this.A0T = new X6H(this, 2);
        this.A0L = new X6H(3, this, false);
        this.A0X = new X6I(8, context, this);
        this.A0Z = new X6H(this, 4);
        this.A0d = new X6J(this, 58);
        this.A0M = new X6J(59, this, false);
        this.A0W = new X6J(60, this, false);
        this.A0Q = new X6I(context, this, false, 4);
        this.A0a = new X6I(context, this, false, 5);
        this.A0U = new X6J(61, this, false);
        this.A0V = new X6J(62, this, false);
        this.A0O = new X6J(this, 63);
        this.A0R = new X6J(this, 64);
        this.A0Y = new X6J(this, 65);
        this.A0b = new X6J(this, 67);
        this.A0S = new X6J(this, 68);
        this.A0c = new X6J(this, 69);
        this.A0J = new X6J(70, this, false);
        VTA A09 = C2FP.A09();
        C14360o3.A0A(A09);
        Q1y q1y = new Q1y(context, A09);
        this.A0E = q1y;
        View.inflate(q1y, R.layout.fbpay_ui_navigation_bar, this);
        this.A08 = (LinearLayout) findViewById(R.id.navbar_left_container);
        this.A07 = (LinearLayout) findViewById(R.id.navbar_center_container);
        this.A09 = (LinearLayout) findViewById(R.id.navbar_right_container);
        this.A06 = (ImageView) findViewById(R.id.title_icon);
        this.A0D = (TextView) findViewById(R.id.title_text);
        this.A04 = (ImageView) findViewById(R.id.left_icon_button);
        this.A0B = (TextView) findViewById(R.id.left_text_button);
        this.A0C = (TextView) findViewById(R.id.right_text_button);
        this.A05 = (ImageView) findViewById(R.id.right_icon_button);
        Context context2 = this.A0E;
        Context context3 = context2;
        this.A03 = new View(context2 == null ? getContext() : context2);
        this.A0A = (ProgressBar) findViewById(R.id.progress_icon);
        View view = this.A03;
        String str = "bottomDivider";
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            addView(view, layoutParams);
            TextView textView = this.A0D;
            if (textView != null) {
                WF7.A02(textView, VEP.A0v);
                TextView textView2 = this.A0B;
                if (textView2 != null) {
                    VEP vep = VEP.A10;
                    WF7.A02(textView2, vep);
                    TextView textView3 = this.A0C;
                    if (textView3 != null) {
                        WF7.A02(textView3, vep);
                        TextView textView4 = this.A0B;
                        if (textView4 != null) {
                            WF7.A00(textView4);
                            TextView textView5 = this.A0C;
                            if (textView5 != null) {
                                WF7.A00(textView5);
                                ProgressBar progressBar = this.A0A;
                                if (progressBar == null) {
                                    str = "progressIcon";
                                } else {
                                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                                    if (indeterminateDrawable != null) {
                                        W5t A0A = C2FP.A0A();
                                        Context context4 = context3 == null ? getContext() : context3;
                                        C14360o3.A0A(context4);
                                        indeterminateDrawable.setColorFilter(A0A.A02(context4, 25), PorterDuff.Mode.MULTIPLY);
                                    }
                                    Context context5 = context3 == null ? getContext() : context3;
                                    C2FP.A0A();
                                    TypedArray obtainStyledAttributes = context5.obtainStyledAttributes(R.style.FBPayUINavigationBar, AbstractC55922hc.A0f);
                                    AbstractC70177WFc.A00(obtainStyledAttributes, AbstractC166987dD.A0c(this, R.id.navi_bar_container), 1, R.style.FBPayUINavigationBarContainer);
                                    ImageView imageView = this.A06;
                                    if (imageView == null) {
                                        str = "titleIconView";
                                    } else {
                                        AbstractC70177WFc.A00(obtainStyledAttributes, imageView, 3, R.style.FBPayUINavigationBarTitleIcon);
                                        TextView textView6 = this.A0D;
                                        if (textView6 != null) {
                                            AbstractC70177WFc.A00(obtainStyledAttributes, textView6, 4, R.style.FBPayUINavigationBarTitle);
                                            View view2 = this.A03;
                                            if (view2 != null) {
                                                AbstractC70177WFc.A05(view2, obtainStyledAttributes.getResourceId(0, R.style.FBPayUINavigationBarBottomDivider), false);
                                                TextView textView7 = this.A0B;
                                                if (textView7 != null) {
                                                    AbstractC70177WFc.A00(obtainStyledAttributes, textView7, 2, R.style.FBPayUINavigationBarLeftOrRightTextButton);
                                                    TextView textView8 = this.A0C;
                                                    if (textView8 != null) {
                                                        AbstractC70177WFc.A00(obtainStyledAttributes, textView8, 2, R.style.FBPayUINavigationBarLeftOrRightTextButton);
                                                        ImageView imageView2 = this.A04;
                                                        if (imageView2 == null) {
                                                            str = "leftIconButton";
                                                        } else {
                                                            AbstractC70177WFc.A05(imageView2, R.style.FBPayUINavigationBarRightIconButton, false);
                                                            ImageView imageView3 = this.A05;
                                                            if (imageView3 == null) {
                                                                str = "rightIconButton";
                                                            } else {
                                                                AbstractC70177WFc.A05(imageView3, R.style.FBPayUINavigationBarRightIconButton, false);
                                                                obtainStyledAttributes.recycle();
                                                                context3 = context3 == null ? getContext() : context3;
                                                                C14360o3.A0A(context3);
                                                                View view3 = this.A03;
                                                                if (view3 != null) {
                                                                    C14360o3.A0B(context3, 0);
                                                                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                                                                    int applyDimension = (int) TypedValue.applyDimension(1, 0.5f, AbstractC167007dF.A0K(context3));
                                                                    layoutParams2.height = applyDimension == 0 ? 1 : applyDimension;
                                                                    AbstractC70177WFc.A01(this, 2);
                                                                    View view4 = this.A03;
                                                                    if (view4 != null) {
                                                                        AbstractC70177WFc.A01(view4, 19);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("rightTextButton");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F("leftTextButton");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("titleTextView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(NavigationBar navigationBar) {
        String str;
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            str = "navbarLeftContainer";
        } else {
            float measuredWidth = linearLayout.getMeasuredWidth();
            if (navigationBar.A07 == null) {
                str = "navbarCenterContainer";
            } else {
                float measuredWidth2 = r0.getMeasuredWidth() * 0.6f;
                LinearLayout linearLayout2 = navigationBar.A09;
                if (linearLayout2 == null) {
                    str = "navbarRightContainer";
                } else {
                    float measuredWidth3 = linearLayout2.getMeasuredWidth();
                    float f = measuredWidth + measuredWidth2 + measuredWidth3;
                    float f2 = measuredWidth / f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    float f3 = measuredWidth2 / f;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    float f4 = measuredWidth3 / f;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(R.id.navi_bar_container);
                    C110964z8 c110964z8 = new C110964z8();
                    c110964z8.A0I(constraintLayout);
                    c110964z8.A07(R.id.navbar_left_container, f2);
                    c110964z8.A07(R.id.navbar_center_container, f3);
                    c110964z8.A07(R.id.navbar_right_container, f4);
                    c110964z8.A0G(constraintLayout);
                    constraintLayout.requestLayout();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            C14360o3.A0F("navbarLeftContainer");
            throw C00O.createAndThrow();
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0H);
    }

    public static final void A04(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A09;
        if (linearLayout == null) {
            C14360o3.A0F("navbarRightContainer");
            throw C00O.createAndThrow();
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0I);
    }

    public static final void A05(NavigationBar navigationBar, boolean z) {
        int i;
        Context context = navigationBar.A0E;
        if (context == null) {
            context = navigationBar.getContext();
        }
        C2FP.A0A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUINavigationBarContainer_Custom, AbstractC55922hc.A0g);
        int i2 = 0;
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0, 0);
        View findViewById = navigationBar.findViewById(R.id.navi_bar_container);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.leftMargin;
        boolean z2 = navigationBar.A0F;
        if (z2) {
            i = 0;
        } else {
            i = marginLayoutParams.topMargin;
        }
        int i4 = marginLayoutParams.rightMargin;
        if (!z2) {
            i2 = dimensionPixelOffset;
        }
        marginLayoutParams.setMargins(i3, i, i4, i2);
        findViewById.requestLayout();
        findViewById.invalidate();
        obtainStyledAttributes.recycle();
    }

    public final boolean getBottomDividerVisible() {
        return AbstractC167017dG.A1b(this, this.A0J, A0g, 22);
    }

    public final boolean getLeftIconButtonEnable() {
        return AbstractC167017dG.A1b(this, this.A0M, A0g, 10);
    }

    public final VET getLeftIconButtonIcon() {
        return (VET) this.A0N.CES(this, A0g[2]);
    }

    public final String getLeftIconButtonLabel() {
        return MSX.A0j(this, this.A0O, A0g, 16);
    }

    public final View.OnClickListener getLeftIconButtonOnClickListener() {
        return (View.OnClickListener) this.A0P.CES(this, A0g[4]);
    }

    public final boolean getLeftTextButtonEnable() {
        return AbstractC167017dG.A1b(this, this.A0Q, A0g, 12);
    }

    public final String getLeftTextButtonHint() {
        return MSX.A0j(this, this.A0R, A0g, 17);
    }

    public final View.OnClickListener getLeftTextButtonOnClickListener() {
        return (View.OnClickListener) this.A0S.CES(this, A0g[20]);
    }

    public final String getLeftTextButtonText() {
        return MSX.A0j(this, this.A0T, A0g, 5);
    }

    public final boolean getNavBarClickableActionsEnable() {
        return AbstractC167017dG.A1b(this, this.A0U, A0g, 14);
    }

    public final boolean getProgressIconShow() {
        return AbstractC167017dG.A1b(this, this.A0V, A0g, 15);
    }

    public final boolean getRightIconButtonEnable() {
        return AbstractC167017dG.A1b(this, this.A0W, A0g, 11);
    }

    public final VET getRightIconButtonIcon() {
        return (VET) this.A0X.CES(this, A0g[7]);
    }

    public final String getRightIconButtonLabel() {
        return MSX.A0j(this, this.A0Y, A0g, 18);
    }

    public final View.OnClickListener getRightIconButtonOnClickListener() {
        return (View.OnClickListener) this.A0Z.CES(this, A0g[8]);
    }

    public final boolean getRightTextButtonEnable() {
        return AbstractC167017dG.A1b(this, this.A0a, A0g, 13);
    }

    public final String getRightTextButtonHint() {
        return MSX.A0j(this, this.A0b, A0g, 19);
    }

    public final View.OnClickListener getRightTextButtonOnClickListener() {
        return (View.OnClickListener) this.A0c.CES(this, A0g[21]);
    }

    public final String getRightTextButtonText() {
        return MSX.A0j(this, this.A0d, A0g, 9);
    }

    public final String getTitle() {
        return MSX.A0j(this, this.A0e, A0g, 0);
    }

    public final VET getTitleIcon() {
        return (VET) this.A0f.CES(this, A0g[1]);
    }

    public final void setBottomDividerVisible(boolean z) {
        AbstractC167007dF.A1L(this, this.A0J, A0g, 22, z);
    }

    public final void setLandscape(boolean z) {
        this.A0F = z;
        A05(this, getBottomDividerVisible());
    }

    public final void setLeftIconButtonEnable(boolean z) {
        AbstractC167007dF.A1L(this, this.A0M, A0g, 10, z);
    }

    public final void setLeftIconButtonIcon(VET vet) {
        AbstractC31171DnF.A1S(this, vet, this.A0N, A0g, 2);
    }

    public final void setLeftIconButtonLabel(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0O, A0g, 16);
    }

    public final void setLeftIconButtonOnClickListener(View.OnClickListener onClickListener) {
        AbstractC31171DnF.A1S(this, onClickListener, this.A0P, A0g, 4);
    }

    public final void setLeftProfileIcon(boolean z) {
        AbstractC167007dF.A1L(this, this.A0K, A0g, 3, z);
    }

    public final void setLeftTextButtonEnable(boolean z) {
        AbstractC167007dF.A1L(this, this.A0Q, A0g, 12, z);
    }

    public final void setLeftTextButtonHint(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0R, A0g, 17);
    }

    public final void setLeftTextButtonOnClickListener(View.OnClickListener onClickListener) {
        AbstractC31171DnF.A1S(this, onClickListener, this.A0S, A0g, 20);
    }

    public final void setLeftTextButtonText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0T, A0g, 5);
    }

    public final void setNavBarClickableActionsEnable(boolean z) {
        AbstractC167007dF.A1L(this, this.A0U, A0g, 14, z);
    }

    public final void setProgressIconShow(boolean z) {
        AbstractC167007dF.A1L(this, this.A0V, A0g, 15, z);
    }

    public final void setRightIconButtonEnable(boolean z) {
        AbstractC167007dF.A1L(this, this.A0W, A0g, 11, z);
    }

    public final void setRightIconButtonIcon(VET vet) {
        AbstractC31171DnF.A1S(this, vet, this.A0X, A0g, 7);
    }

    public final void setRightIconButtonLabel(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0Y, A0g, 18);
    }

    public final void setRightIconButtonOnClickListener(View.OnClickListener onClickListener) {
        AbstractC31171DnF.A1S(this, onClickListener, this.A0Z, A0g, 8);
    }

    public final void setRightProfileIcon(boolean z) {
        AbstractC167007dF.A1L(this, this.A0L, A0g, 6, z);
    }

    public final void setRightTextButtonEnable(boolean z) {
        AbstractC167007dF.A1L(this, this.A0a, A0g, 13, z);
    }

    public final void setRightTextButtonHint(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0b, A0g, 19);
    }

    public final void setRightTextButtonOnClickListener(View.OnClickListener onClickListener) {
        AbstractC31171DnF.A1S(this, onClickListener, this.A0c, A0g, 21);
    }

    public final void setRightTextButtonText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0d, A0g, 9);
    }

    public final void setTitle(String str) {
        AbstractC31171DnF.A1S(this, str, this.A0e, A0g, 0);
    }

    public final void setTitleIcon(VET vet) {
        AbstractC31171DnF.A1S(this, vet, this.A0f, A0g, 1);
    }

    public static final void A00(ImageView imageView) {
        imageView.setImageDrawable(C2FP.A0A().A04(AbstractC166997dE.A0L(imageView), 11, 18));
        String url = C17060sy.A01.A01(C2FP.A0H().A00).Bhu().getUrl();
        if (url != null) {
            C69679VtP A0G = C2FP.A0G();
            if (A0G.A01(url)) {
                C60615REa A00 = A0G.A00(url, "ProfileIconButtonContextName");
                A00.A06 = true;
                A00.A02(imageView);
            }
        }
        imageView.setVisibility(0);
    }

    public static final void A02(NavigationBar navigationBar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(R.id.navi_bar_container);
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(constraintLayout);
        c110964z8.A07(R.id.navbar_left_container, 0.0f);
        c110964z8.A07(R.id.navbar_center_container, 0.0f);
        c110964z8.A07(R.id.navbar_right_container, 0.0f);
        c110964z8.A0G(constraintLayout);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
