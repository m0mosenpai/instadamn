package com.instagram.igds.components.bottomsheet;

import X.AbstractC03240Dh;
import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC11490j8;
import X.AbstractC13880nE;
import X.AbstractC18680vv;
import X.AbstractC53242c7;
import X.AbstractC56402iY;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.BTZ;
import X.C03L;
import X.C04100Kb;
import X.C05F;
import X.C06090Tz;
import X.C06J;
import X.C06N;
import X.C06P;
import X.C0f9;
import X.C0w9;
import X.C114795Gm;
import X.C14240no;
import X.C14360o3;
import X.C189448aO;
import X.C189478aR;
import X.C18U;
import X.C19260xA;
import X.C1ZV;
import X.C1ZX;
import X.C2d4;
import X.C32285EJx;
import X.C34494FIg;
import X.C3DN;
import X.C3DP;
import X.C51029Mgc;
import X.C51D;
import X.C55091Ob2;
import X.C56342iS;
import X.C56352iT;
import X.C57982lB;
import X.C66305U8d;
import X.EnumC60772q1;
import X.GSf;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC189488aT;
import X.InterfaceC189498aU;
import X.InterfaceC47352Fi;
import X.InterfaceC56362iU;
import X.InterfaceC56392iX;
import X.InterfaceC59892oW;
import X.InterfaceC59992oh;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC86363t8;
import X.RunnableC24471Asq;
import X.ViewOnClickListenerC23230ARo;
import X.ViewOnClickListenerC23231ARp;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes4.dex */
public final class BottomSheetFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC189488aT, C2d4, InterfaceC60122ou {
    public int A00;
    public int A01;
    public C189478aR A02;
    public C189448aO A03;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C19260xA A09;
    public C66305U8d A0A;
    public Boolean A0B;
    public boolean A0C;
    public C56352iT _actionBarService;
    public IgdsBottomButtonLayout bottomButton;
    public ViewGroup bottomSheetContainer;
    public InterfaceC56392iX buttonContainer;
    public TouchInterceptorFrameLayout contentView;
    public IgFrameLayout dragHandleFrame;
    public ImageView dragHandleView;
    public ImageView dragHandleViewPrism;
    public InterfaceC56392iX elementAboveTitleView;
    public InterfaceC56392iX leftNavButtonIcon;
    public InterfaceC56392iX leftNavButtonText;
    public InterfaceC56392iX navBarDivider;
    public Guideline navButtonEndGuideline;
    public Guideline navButtonStartGuideline;
    public InterfaceC56392iX rightLoadingSpinnerIcon;
    public InterfaceC56392iX rightNavButtonIcon;
    public InterfaceC56392iX rightNavButtonText;
    public InterfaceC56392iX secondaryRightNavButtonIcon;
    public InterfaceC56392iX subtitleTextView;
    public ViewGroup titleAndNavContainer;
    public InterfaceC56392iX titleTextView;
    public final View.OnClickListener A0F = new View.OnClickListener() { // from class: X.8aV
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int A05 = C0f9.A05(313543649);
            BottomSheetFragment.this.onBackPressed();
            C0f9.A0C(1733213697, A05);
        }
    };
    public InterfaceC47352Fi A04 = new InterfaceC47352Fi() { // from class: X.8aW
        @Override // X.InterfaceC47352Fi
        public final C3DN getBottomSheetNavigator() {
            FragmentActivity activity = BottomSheetFragment.this.getActivity();
            if (activity != null) {
                return C3DN.A00.A00(activity);
            }
            return null;
        }
    };
    public final Stack A0D = new Stack();
    public final Stack A0E = new Stack();
    public boolean A05 = true;
    public final C06N A0H = new C06N() { // from class: X.8aX
        @Override // X.C06N
        public final void onBackStackChanged() {
            C56352iT c56352iT = BottomSheetFragment.this._actionBarService;
            if (c56352iT != null) {
                c56352iT.A0T();
            }
        }
    };
    public final InterfaceC09390do A0I = AbstractC60492pY.A01(this);
    public final C03L A0G = new C03L() { // from class: X.8aY
        @Override // X.C03L
        public final C011504d Cx7(View view, C011504d c011504d) {
            C14360o3.A0B(view, 0);
            C14360o3.A0B(c011504d, 1);
            BottomSheetFragment bottomSheetFragment = BottomSheetFragment.this;
            ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
            if (viewGroup != null && viewGroup.getFitsSystemWindows()) {
                View rootView = view.getRootView();
                C14360o3.A07(rootView);
                RectF rectF = AbstractC13880nE.A01;
                int systemUiVisibility = rootView.getSystemUiVisibility();
                if ((systemUiVisibility & 2) != 0 || (systemUiVisibility & 512) != 0 || (systemUiVisibility & 4) != 0) {
                    if (bottomSheetFragment.A01 == 0) {
                        bottomSheetFragment.A01 = c011504d.A00.A01().A00;
                    }
                    int max = Math.max(0, c011504d.A02() - bottomSheetFragment.A01);
                    if (BottomSheetFragment.A0K(bottomSheetFragment) && max > view.getRootView().getHeight() * 0.25f) {
                        return c011504d;
                    }
                    C04Z c04z = new C04Z();
                    C02I A00 = C02I.A00(0, 0, 0, max);
                    AbstractC011204a abstractC011204a = c04z.A00;
                    abstractC011204a.A06(A00);
                    c011504d = abstractC011204a.A00();
                }
            }
            ViewGroup viewGroup2 = bottomSheetFragment.bottomSheetContainer;
            if (viewGroup2 != null) {
                return AbstractC010103p.A05(viewGroup2, c011504d);
            }
            throw new IllegalStateException("Required value was null.");
        }
    };

    public static final void A0E(BottomSheetFragment bottomSheetFragment, CharSequence charSequence, CharSequence charSequence2) {
        InterfaceC56392iX interfaceC56392iX;
        View view;
        Context context;
        int i;
        TextView textView;
        if (charSequence != null && charSequence.length() != 0) {
            if (charSequence2 != null && charSequence2.length() != 0) {
                InterfaceC56392iX interfaceC56392iX2 = bottomSheetFragment.subtitleTextView;
                if (interfaceC56392iX2 != null) {
                    interfaceC56392iX2.setVisibility(0);
                }
                InterfaceC56392iX interfaceC56392iX3 = bottomSheetFragment.subtitleTextView;
                if (interfaceC56392iX3 != null && (textView = (TextView) interfaceC56392iX3.getView()) != null) {
                    textView.setText(charSequence2);
                }
                interfaceC56392iX = bottomSheetFragment.titleTextView;
                if (interfaceC56392iX != null) {
                    view = interfaceC56392iX.getView();
                    context = interfaceC56392iX.getView().getContext();
                    C14360o3.A07(context);
                    i = 6;
                } else {
                    return;
                }
            } else {
                InterfaceC56392iX interfaceC56392iX4 = bottomSheetFragment.subtitleTextView;
                if (interfaceC56392iX4 != null) {
                    interfaceC56392iX4.setVisibility(8);
                }
                interfaceC56392iX = bottomSheetFragment.titleTextView;
                if (interfaceC56392iX == null) {
                    return;
                }
                view = interfaceC56392iX.getView();
                context = interfaceC56392iX.getView().getContext();
                C14360o3.A07(context);
                i = 11;
            }
            int A04 = (int) AbstractC13880nE.A04(context, i);
            Context context2 = interfaceC56392iX.getView().getContext();
            C14360o3.A07(context2);
            AbstractC13880nE.A0j(view, A04, (int) AbstractC13880nE.A04(context2, i));
            return;
        }
        InterfaceC56392iX interfaceC56392iX5 = bottomSheetFragment.titleTextView;
        if (interfaceC56392iX5 == null) {
            return;
        }
        AbstractC13880nE.A0j(interfaceC56392iX5.getView(), 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r3.length() == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        if (r9.isElementAboveTitleEnabled() != true) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0U(android.content.Context r12, final androidx.fragment.app.Fragment r13, int r14) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.A0U(android.content.Context, androidx.fragment.app.Fragment, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0V(Fragment fragment, C189448aO c189448aO, boolean z, boolean z2, boolean z3) {
        View view;
        Integer num;
        ViewGroup.LayoutParams layoutParams;
        C14360o3.A0B(fragment, 0);
        if (A0I(this) && (view = this.mView) != null && view.findViewById(R.id.bottom_sheet_container_view) != null) {
            Bundle bundle = fragment.mArguments;
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.getString("IgSessionManager.SESSION_TOKEN_KEY") == null) {
                AbstractC03240Dh.A00(bundle, c189448aO.A1V);
                fragment.setArguments(bundle);
            }
            C14240no c14240no = new C14240no(getChildFragmentManager());
            if (z) {
                String str = c189448aO.A0f;
                if (str == null || str.length() == 0) {
                    str = fragment.getClass().getSimpleName();
                }
                c14240no.A0I(str);
            }
            if (this.A0C) {
                if (A0M() != null && C04100Kb.A00(requireContext()) > 2012) {
                    c189448aO.A03();
                } else {
                    c189448aO.A1U = null;
                }
            }
            int[] iArr = c189448aO.A1U;
            if (iArr != null) {
                c14240no.A07(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            if (fragment instanceof InterfaceC59992oh) {
                InterfaceC59992oh interfaceC59992oh = (InterfaceC59992oh) fragment;
                interfaceC59992oh.registerLifecycleListener(new BTZ(interfaceC59992oh, this));
            }
            String canonicalName = fragment.getClass().getCanonicalName();
            if (z3) {
                c14240no.A0C(fragment, canonicalName, R.id.bottom_sheet_container_view);
            } else {
                c14240no.A0D(fragment, canonicalName, R.id.bottom_sheet_container_view);
            }
            c14240no.A00();
            if (z2) {
                getChildFragmentManager().A0Z();
            }
            this.A03 = c189448aO;
            this.A05 = z;
            if (z) {
                this.A0D.push(c189448aO);
                Stack stack = this.A0E;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.contentView;
                if (touchInterceptorFrameLayout != null && (layoutParams = touchInterceptorFrameLayout.getLayoutParams()) != null) {
                    num = Integer.valueOf(layoutParams.height);
                } else {
                    num = null;
                }
                stack.push(num);
            }
            A0H(this);
            A0U(getThemedContext(), fragment, getChildFragmentManager().A0L());
        }
    }

    @Override // X.InterfaceC189488aT
    public final boolean ABC() {
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        C14360o3.A0B(context, 0);
        int i = A00(this).A0F;
        if (i == 0) {
            return ViewConfiguration.get(context).getScaledTouchSlop();
        }
        return i;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        this.A08 = false;
        if (A0J(this) && !A00(this).A0x && !A0G()) {
            A03(0);
        }
        if (isAdded()) {
            InterfaceC08430c6 A0M = A0M();
            if (A0M instanceof InterfaceC189498aU) {
                ((InterfaceC189498aU) A0M).DOM();
            }
        }
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        this.A08 = true;
        if (!A00(this).A0x && !A0G()) {
            A03(i);
        }
        if (isAdded()) {
            InterfaceC08430c6 A0M = A0M();
            if (A0M instanceof InterfaceC189498aU) {
                ((InterfaceC189498aU) A0M).DON(i);
            }
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        InterfaceC08430c6 A0M = A0M();
        if (A0M != null && (A0M instanceof InterfaceC60122ou)) {
            interfaceC56362iU.EkF(true);
            interfaceC56362iU.EPD(new ColorDrawable(requireContext().getColor(R.color.fds_transparent)));
            ((InterfaceC60122ou) A0M).configureActionBar(interfaceC56362iU);
            InterfaceC56392iX interfaceC56392iX = this.navBarDivider;
            if (((C56352iT) interfaceC56362iU).A0A && interfaceC56392iX != null && this.contentView != null) {
                interfaceC56392iX.setVisibility(0);
                A0B(this);
            }
        } else {
            interfaceC56362iU.EkF(false);
        }
        if (A0J(this) && !AbstractC56402iY.A09() && A00(this).A0B != 0) {
            interfaceC56362iU.Ehg(new C114795Gm(null, null, null, null, null, null, C05F.A00, -2, requireContext().getColor(A00(this).A0B), -2, -2, -2, -2, -2, false));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "bottom_sheet_component";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        getChildFragmentManager().A0r(this.A0H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (r3.A1R != true) goto L15;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A03(int i) {
        View view;
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.bottomButton;
        if (igdsBottomButtonLayout != null && igdsBottomButtonLayout.getVisibility() == 0) {
            view = this.bottomSheetContainer;
        } else {
            view = this.contentView;
        }
        if (view != null && isAdded()) {
            AbstractC13880nE.A0Y(view, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x03ce, code lost:
    
        if (r1 != null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03d0, code lost:
    
        r5 = (android.widget.ImageView) r1.getView();
        r2 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x03d8, code lost:
    
        if (r2 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x03dc, code lost:
    
        if (r7.A09 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x03de, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x03df, code lost:
    
        r1 = X.AbstractC85953sP.A00;
        X.C14360o3.A0B(r5, 0);
        r5.setColorFilter(X.C3DY.A00(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x03f9, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x03fa, code lost:
    
        if (r2 == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x03fc, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x03eb, code lost:
    
        r2 = r10.leftNavButtonIcon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x03ed, code lost:
    
        if (r2 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x03f1, code lost:
    
        if (r12.A12 != false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x03f3, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x03f4, code lost:
    
        r2.setVisibility(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0444, code lost:
    
        if (r1 != null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r4.CWW() != true) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(android.content.Context r11, X.C189448aO r12, int r13) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.A04(android.content.Context, X.8aO, int):void");
    }

    public static final void A05(Context context, BottomSheetFragment bottomSheetFragment) {
        Guideline guideline = bottomSheetFragment.navButtonStartGuideline;
        if (guideline != null) {
            Resources resources = context.getResources();
            boolean A0F = bottomSheetFragment.A0F();
            int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            if (A0F) {
                i = R.dimen.ad_not_delivering_thumbnail_height;
            }
            guideline.setGuidelineBegin(resources.getDimensionPixelSize(i));
        }
        Guideline guideline2 = bottomSheetFragment.navButtonEndGuideline;
        if (guideline2 != null) {
            Resources resources2 = context.getResources();
            boolean A0F2 = bottomSheetFragment.A0F();
            int i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            if (A0F2) {
                i2 = R.dimen.ad_not_delivering_thumbnail_height;
            }
            guideline2.setGuidelineEnd(resources2.getDimensionPixelSize(i2));
        }
    }

    private final void A07(C189448aO c189448aO) {
        View.OnClickListener onClickListener;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        View.OnClickListener onClickListener2;
        String str = c189448aO.A0g;
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.bottomButton;
        if (igdsBottomButtonLayout2 != null) {
            if (str != null && str.length() != 0) {
                igdsBottomButtonLayout2.setPrimaryActionText(str);
                if (c189448aO.A0v) {
                    onClickListener = new ViewOnClickListenerC23230ARo(c189448aO, this);
                } else {
                    onClickListener = c189448aO.A0K;
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.bottomButton;
                if (igdsBottomButtonLayout3 != null) {
                    igdsBottomButtonLayout3.setPrimaryActionOnClickListener(onClickListener);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout4 = this.bottomButton;
                if (igdsBottomButtonLayout4 != null) {
                    igdsBottomButtonLayout4.setPrimaryButtonEnabled(this.A06);
                }
                String str2 = c189448aO.A0h;
                if (str2 != null && str2.length() != 0) {
                    IgdsBottomButtonLayout igdsBottomButtonLayout5 = this.bottomButton;
                    if (igdsBottomButtonLayout5 != null) {
                        igdsBottomButtonLayout5.setSecondaryActionText(str2);
                    }
                    if (c189448aO.A0w) {
                        onClickListener2 = new ViewOnClickListenerC23231ARp(c189448aO, this);
                    } else {
                        onClickListener2 = c189448aO.A0L;
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout6 = this.bottomButton;
                    if (igdsBottomButtonLayout6 != null) {
                        igdsBottomButtonLayout6.setSecondaryActionOnClickListener(onClickListener2);
                    }
                    IgdsBottomButtonLayout igdsBottomButtonLayout7 = this.bottomButton;
                    if (igdsBottomButtonLayout7 != null) {
                        igdsBottomButtonLayout7.setSecondaryButtonEnabled(this.A07);
                    }
                }
                CharSequence charSequence = c189448aO.A0b;
                if (charSequence != null && charSequence.length() != 0 && (igdsBottomButtonLayout = this.bottomButton) != null) {
                    igdsBottomButtonLayout.setFooterText(charSequence);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout8 = this.bottomButton;
                if (igdsBottomButtonLayout8 != null) {
                    igdsBottomButtonLayout8.setDividerVisible(A00(this).A14);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout9 = this.bottomButton;
                if (igdsBottomButtonLayout9 != null) {
                    igdsBottomButtonLayout9.setVisibility(0);
                    return;
                }
                return;
            }
            igdsBottomButtonLayout2.setVisibility(8);
            IgdsBottomButtonLayout igdsBottomButtonLayout10 = this.bottomButton;
            if (igdsBottomButtonLayout10 == null) {
                return;
            }
            igdsBottomButtonLayout10.setOnClickListener(null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0A(BottomSheetFragment bottomSheetFragment) {
        CharSequence charSequence;
        ViewGroup.LayoutParams layoutParams;
        C189448aO c189448aO = bottomSheetFragment.A03;
        if ((c189448aO != null && c189448aO.A1R) || ((charSequence = A00(bottomSheetFragment).A0d) != null && charSequence.length() != 0)) {
            A0B(bottomSheetFragment);
            return;
        }
        C56352iT c56352iT = bottomSheetFragment._actionBarService;
        if (bottomSheetFragment.A0F() || c56352iT == null || c56352iT.A0A) {
            return;
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = bottomSheetFragment.contentView;
        if (touchInterceptorFrameLayout != null) {
            layoutParams = touchInterceptorFrameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = bottomSheetFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = bottomSheetFragment.contentView;
        if (touchInterceptorFrameLayout2 == null) {
            return;
        }
        touchInterceptorFrameLayout2.setLayoutParams(marginLayoutParams);
    }

    public static final void A0B(BottomSheetFragment bottomSheetFragment) {
        ViewGroup.LayoutParams layoutParams;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = bottomSheetFragment.contentView;
        if (touchInterceptorFrameLayout != null) {
            layoutParams = touchInterceptorFrameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.topMargin != 0) {
            marginLayoutParams.topMargin = 0;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = bottomSheetFragment.contentView;
            if (touchInterceptorFrameLayout2 != null) {
                touchInterceptorFrameLayout2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static final void A0C(BottomSheetFragment bottomSheetFragment) {
        ViewGroup viewGroup;
        InterfaceC56392iX interfaceC56392iX;
        InterfaceC56392iX interfaceC56392iX2 = bottomSheetFragment.navBarDivider;
        if (interfaceC56392iX2 != null) {
            int i = 0;
            if (!A00(bottomSheetFragment).A1C || (((viewGroup = bottomSheetFragment.titleAndNavContainer) == null || viewGroup.getVisibility() != 0 || (interfaceC56392iX = bottomSheetFragment.titleTextView) == null || interfaceC56392iX.CGb() != 0) && !bottomSheetFragment.A0F())) {
                i = 8;
            }
            interfaceC56392iX2.setVisibility(i);
        }
    }

    private final boolean A0F() {
        InterfaceC56392iX interfaceC56392iX;
        InterfaceC56392iX interfaceC56392iX2;
        InterfaceC56392iX interfaceC56392iX3;
        InterfaceC56392iX interfaceC56392iX4;
        InterfaceC56392iX interfaceC56392iX5;
        InterfaceC56392iX interfaceC56392iX6;
        ViewGroup viewGroup = this.titleAndNavContainer;
        if ((viewGroup == null || viewGroup.getVisibility() != 8) && ((interfaceC56392iX = this.leftNavButtonText) == null || interfaceC56392iX.CGb() != 8 || (interfaceC56392iX2 = this.leftNavButtonIcon) == null || interfaceC56392iX2.CGb() != 8 || (interfaceC56392iX3 = this.rightNavButtonText) == null || interfaceC56392iX3.CGb() != 8 || (interfaceC56392iX4 = this.rightNavButtonIcon) == null || interfaceC56392iX4.CGb() != 8 || (interfaceC56392iX5 = this.secondaryRightNavButtonIcon) == null || interfaceC56392iX5.CGb() != 8 || (interfaceC56392iX6 = this.rightLoadingSpinnerIcon) == null || interfaceC56392iX6.CGb() != 8)) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(BottomSheetFragment bottomSheetFragment) {
        String str;
        if (bottomSheetFragment.A05) {
            int A0L = bottomSheetFragment.getChildFragmentManager().A0L();
            int size = bottomSheetFragment.A0D.size();
            if ((bottomSheetFragment.getSession() instanceof UserSession) && A0L != size) {
                AbstractC18680vv session = bottomSheetFragment.getSession();
                C14360o3.A0C(session, AbstractC111324zv.A00(6));
                C1ZX A00 = C1ZV.A00((UserSession) session).A00(C05F.A0B, 817895635, 0, false);
                A00.A01("child_fragment_manager_back_stack_size", A0L);
                A00.A01("builder_back_stack_size", size);
                InterfaceC08430c6 A0M = bottomSheetFragment.A0M();
                if (A0M instanceof InterfaceC11380iw) {
                    str = ((InterfaceC11380iw) A0M).getModuleName();
                } else {
                    str = "bottom_sheet_component";
                }
                A00.A03("fragment_module", str);
                A00.A00();
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0J(BottomSheetFragment bottomSheetFragment) {
        String str;
        boolean z = true;
        if (bottomSheetFragment.A03 == null) {
            z = false;
            Locale locale = Locale.US;
            InterfaceC08430c6 A0M = bottomSheetFragment.A0M();
            if (A0M instanceof InterfaceC11380iw) {
                str = ((InterfaceC11380iw) A0M).getModuleName();
            } else {
                str = "bottom_sheet_component";
            }
            String format = String.format(locale, "hasBuilder() returns false, so current bottom sheet builder is null. Analytics module: %s.", Arrays.copyOf(new Object[]{str}, 1));
            C14360o3.A07(format);
            C0w9.A03("BottomSheetFragment", format);
        }
        return z;
    }

    public final TextView A0L() {
        InterfaceC56392iX interfaceC56392iX = this.titleTextView;
        if (isAdded() && interfaceC56392iX != null) {
            return (TextView) interfaceC56392iX.getView();
        }
        return null;
    }

    public final void A0O() {
        View view = this.mView;
        if (view != null) {
            View requireViewById = view.requireViewById(R.id.action_bar_container);
            C14360o3.A07(requireViewById);
            this._actionBarService = C56342iS.A01(new View.OnClickListener() { // from class: X.9Ik
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int A05 = C0f9.A05(371228104);
                    BottomSheetFragment.this.onBackPressed();
                    C0f9.A0C(-145040276, A05);
                }
            }, (ViewGroup) requireViewById);
        }
        C56352iT c56352iT = this._actionBarService;
        if (c56352iT != null) {
            c56352iT.A0X(this);
        }
    }

    public final void A0Q() {
        if (this.bottomButton != null) {
            A07(A00(this));
        }
    }

    public final void A0S(int i) {
        ViewGroup viewGroup = this.bottomSheetContainer;
        if (viewGroup != null) {
            Drawable background = viewGroup.getBackground();
            if (background != null) {
                Drawable mutate = background.mutate();
                C14360o3.A07(mutate);
                mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0T(int i) {
        ViewGroup viewGroup = this.titleAndNavContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
        InterfaceC56392iX interfaceC56392iX = this.navBarDivider;
        if (interfaceC56392iX != null) {
            interfaceC56392iX.setVisibility(i);
        }
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        return this._actionBarService;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.bottomSheetContainer;
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        if (this.A03 != null) {
            return !r0.A1I;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0I.getValue();
    }

    @Override // X.AbstractC59962oe
    public final EnumC60772q1 getStatusBarType() {
        return EnumC60772q1.A04;
    }

    public static final C189448aO A00(BottomSheetFragment bottomSheetFragment) {
        A0J(bottomSheetFragment);
        C189448aO c189448aO = bottomSheetFragment.A03;
        if (c189448aO != null) {
            return c189448aO;
        }
        throw new IllegalStateException("BottomSheetFragment builder is null");
    }

    private final void A01() {
        if (A0I(this)) {
            boolean A0H = A0H(this);
            getChildFragmentManager().A12();
            if (A0J(this)) {
                C3DN bottomSheetNavigator = this.A04.getBottomSheetNavigator();
                if (bottomSheetNavigator != null) {
                    InterfaceC86363t8 interfaceC86363t8 = A00(this).A0X;
                    if (interfaceC86363t8 != null) {
                        bottomSheetNavigator.A0S(interfaceC86363t8);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (A0H) {
                this.A0D.pop();
            }
            if (A0H(this)) {
                this.A03 = (C189448aO) this.A0D.peek();
                Fragment A0M = A0M();
                if (A0M instanceof C32285EJx) {
                    C32285EJx c32285EJx = (C32285EJx) A0M;
                    if (!c32285EJx.A0H) {
                        ((C51029Mgc) c32285EJx.A0Q.getValue()).A03(c32285EJx.requireContext(), c32285EJx.getViewLifecycleOwner(), new GSf(c32285EJx), C32285EJx.A00(c32285EJx));
                        return;
                    }
                    c32285EJx.A0G = false;
                    C34494FIg c34494FIg = c32285EJx.A07;
                    C55091Ob2 c55091Ob2 = (C55091Ob2) ((C51029Mgc) c32285EJx.A0Q.getValue()).A0B.getValue();
                    C14360o3.A0B(c55091Ob2, 0);
                    c34494FIg.A01 = c55091Ob2.A0A;
                    c34494FIg.A00 = c55091Ob2.A08;
                    C32285EJx.A0F(c32285EJx, true);
                    return;
                }
                return;
            }
            C189478aR c189478aR = this.A02;
            if (c189478aR == null) {
                return;
            }
            if (!C18U.A06(C06090Tz.A05, getSession(), 36323354466069690L)) {
                return;
            }
            c189478aR.A0L(null);
        }
    }

    private final void A02() {
        int i;
        if (A00(this).A0A != 0) {
            i = getThemedContext().getColor(A00(this).A0A);
        } else if (A00(this).A09 != 0) {
            i = A00(this).A09;
        } else {
            i = 255;
        }
        C3DN bottomSheetNavigator = this.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            bottomSheetNavigator.A0H(i);
        }
    }

    private final void A06(ViewGroup viewGroup) {
        if (A0J(this)) {
            C189448aO c189448aO = this.A03;
            if (c189448aO != null) {
                if (c189448aO.A17 && viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A08(BottomSheetFragment bottomSheetFragment) {
        boolean z;
        C189448aO c189448aO;
        String str;
        if (bottomSheetFragment.getContext() == null) {
            str = "getContext() is null when trying to reanchor bottom sheet fragment";
        } else {
            C3DN bottomSheetNavigator = bottomSheetFragment.A04.getBottomSheetNavigator();
            if (bottomSheetNavigator == null) {
                str = "getBottomSheetNavigator(context) returns null when trying toreanchor bottom sheet fragment";
            } else {
                if (bottomSheetFragment.A0C && (((c189448aO = bottomSheetFragment.A03) != null && c189448aO.A1U != null) || C04100Kb.A00(bottomSheetFragment.requireContext()) <= 2012)) {
                    z = true;
                } else {
                    z = false;
                }
                bottomSheetNavigator.A0W(!z);
                return;
            }
        }
        C0w9.A03("BottomSheetFragment", str);
    }

    public static final void A09(BottomSheetFragment bottomSheetFragment) {
        Context themedContext = bottomSheetFragment.getThemedContext();
        Fragment A0M = bottomSheetFragment.A0M();
        if (A0M != null) {
            bottomSheetFragment.A0U(themedContext, A0M, bottomSheetFragment.getChildFragmentManager().A0L());
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A0D(BottomSheetFragment bottomSheetFragment, int i) {
        if (A00(bottomSheetFragment).A13) {
            ImageView imageView = bottomSheetFragment.dragHandleView;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = bottomSheetFragment.dragHandleView;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(i);
    }

    private final boolean A0G() {
        Activity rootActivity;
        if (!isAdded() || (rootActivity = getRootActivity()) == null || rootActivity.getWindow() == null || (rootActivity.getWindow().getAttributes().softInputMode & 240) != 16) {
            return false;
        }
        return true;
    }

    public static final boolean A0I(BottomSheetFragment bottomSheetFragment) {
        if (bottomSheetFragment.isAdded() && !C06P.A00(bottomSheetFragment.getChildFragmentManager()) && !bottomSheetFragment.getChildFragmentManager().A11()) {
            return true;
        }
        return false;
    }

    public static final boolean A0K(BottomSheetFragment bottomSheetFragment) {
        Boolean bool = A00(bottomSheetFragment).A0a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C14360o3.A0K(bottomSheetFragment.A0B, true);
    }

    public final Fragment A0M() {
        if (!isAdded()) {
            return null;
        }
        return getChildFragmentManager().A0O(R.id.bottom_sheet_container_view);
    }

    public final void A0N() {
        if (A0I(this)) {
            A0H(this);
            AbstractC10360h2 childFragmentManager = getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            if (childFragmentManager.A0L() > 0) {
                C06J A0S = childFragmentManager.A0S(0);
                C14360o3.A07(A0S);
                childFragmentManager.A0c(((C14240no) A0S).A00);
            }
            this.A0D.clear();
            A0H(this);
        }
    }

    public final void A0P() {
        if (getChildFragmentManager().A0L() <= 0) {
            C0w9.A03("BottomSheetFragment", "No back stack entry in child fragment manager.");
            return;
        }
        ViewGroup viewGroup = this.bottomSheetContainer;
        if (viewGroup != null) {
            AbstractC13880nE.A0O(viewGroup);
            DOM();
        }
        if (getChildFragmentManager().A0L() == 1) {
            C189478aR c189478aR = this.A02;
            if (c189478aR == null) {
                return;
            }
            c189478aR.A0L(null);
            return;
        }
        A01();
        A09(this);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.contentView;
        if (touchInterceptorFrameLayout == null) {
            return;
        }
        touchInterceptorFrameLayout.post(new RunnableC24471Asq(this));
    }

    public final void A0R() {
        if (isAdded()) {
            A04(requireContext(), A00(this), getChildFragmentManager().A0L());
        }
    }

    @Override // X.InterfaceC189488aT
    public final boolean ANe() {
        C51D c51d = A00(this).A0T;
        if (c51d != null) {
            return c51d.useCustomScrollDetermination();
        }
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        if (!A0K(this)) {
            return -2;
        }
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        if (isAdded() && this.A00 == 0) {
            ImageView imageView = this.dragHandleView;
            if (imageView != null && imageView.getVisibility() == 0) {
                this.A00 += imageView.getHeight();
            }
            ViewGroup viewGroup = this.titleAndNavContainer;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                this.A00 += viewGroup.getHeight();
            }
            InterfaceC56392iX interfaceC56392iX = this.navBarDivider;
            if (interfaceC56392iX != null && interfaceC56392iX.CGb() == 0) {
                this.A00 += interfaceC56392iX.getView().getHeight();
            }
        }
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x013a, code lost:
    
        if (r0.isInMultiWindowMode() != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float Cpk() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.Cpk():float");
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        if (A0J(this)) {
            C189448aO c189448aO = this.A03;
            if (c189448aO != null) {
                return c189448aO.A0y;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        if (A00(this).A1G) {
            return 1.0f;
        }
        if (A0K(this) && !A00(this).A1E) {
            return A00(this).A04;
        }
        return Cpk();
    }

    @Override // X.InterfaceC189488aT
    public final float Cpk() {
        Float f = A00(this).A0e;
        if (A00(this).A0s) {
            return A00(this).A01;
        }
        if (f == null) {
            return Cpk();
        }
        return f.floatValue();
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        C51D c51d;
        if (A00(this).A0T != null && ((c51d = A00(this).A0T) == null || !c51d.isScrolledToTop())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Fragment A0M = A0M();
        if (!(A0M instanceof InterfaceC60072op) || !((InterfaceC60072op) A0M).onBackPressed()) {
            ViewGroup viewGroup = this.bottomSheetContainer;
            if (viewGroup != null) {
                AbstractC13880nE.A0O(viewGroup);
                DOM();
            }
            if (getChildFragmentManager().A0L() > 1) {
                C3DN bottomSheetNavigator = this.A04.getBottomSheetNavigator();
                if (bottomSheetNavigator != null) {
                    if (A0M != 0) {
                        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
                        C14360o3.A07(childFragmentManager);
                        bottomSheetNavigator.A0L(A0M, childFragmentManager, C05F.A0N);
                        A01();
                    }
                    A09(this);
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.contentView;
                    if (touchInterceptorFrameLayout != null) {
                        touchInterceptorFrameLayout.post(new RunnableC24471Asq(this));
                        return true;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 != null) goto L6;
     */
    @Override // X.InterfaceC189488aT, X.C51D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBottomSheetClosed() {
        /*
            r2 = this;
            X.8aO r0 = A00(r2)
            X.51D r0 = r0.A0T
            if (r0 == 0) goto L1e
            X.8aO r0 = A00(r2)
            X.51D r1 = r0.A0T
            if (r1 == 0) goto L13
        L10:
            r1.onBottomSheetClosed()
        L13:
            X.U8d r0 = r2.A0A
            if (r0 == 0) goto L1d
            r0.A06()
            r0 = 0
            r2.A0A = r0
        L1d:
            return
        L1e:
            androidx.fragment.app.Fragment r0 = r2.A0M()
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment r0 = r2.A0M()
            boolean r0 = r0 instanceof X.C51D
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment r1 = r2.A0M()
            r0 = 3
            java.lang.String r0 = X.MSV.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.51D r1 = (X.C51D) r1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottomsheet.BottomSheetFragment.onBottomSheetClosed():void");
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        View view;
        int intValue;
        Context context;
        ViewGroup viewGroup;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        C51D c51d = A00(this).A0T;
        if (c51d != null) {
            c51d.onBottomSheetPositionChanged(i, i2);
        }
        C66305U8d c66305U8d = this.A0A;
        if (c66305U8d != null) {
            c66305U8d.invalidateSelf();
        }
        if (A00(this).A0x) {
            if (A0K(this) || A00(this).A1G) {
                ViewGroup viewGroup2 = this.bottomSheetContainer;
                if (viewGroup2 != null) {
                    int height = (viewGroup2.getHeight() - C9V()) - i;
                    if (!this.A08) {
                        height -= i2;
                        if (A00(this).A05 > 0.0f) {
                            if (this.bottomSheetContainer != null) {
                                int height2 = (int) (r0.getHeight() * A00(this).A05);
                                if (height < height2) {
                                    height = height2;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    if (height >= 0 && (touchInterceptorFrameLayout = this.contentView) != null) {
                        AbstractC13880nE.A0W(touchInterceptorFrameLayout, height);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (A00(this).A1G) {
                view = this.bottomSheetContainer;
                if (view != null) {
                    if (view.getLayoutParams().height != view.getHeight()) {
                        intValue = view.getHeight();
                        AbstractC13880nE.A0W(view, intValue);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (!A00(this).A1M && (context = getContext()) != null && (viewGroup = this.bottomSheetContainer) != null) {
                viewGroup.setBackground(context.getDrawable(AbstractC53242c7.A0H(context, R.attr.bottomSheetBackground)));
                return;
            }
            return;
        }
        int size = this.A0D.size();
        Stack stack = this.A0E;
        if (size < stack.size() && (view = this.contentView) != null) {
            Object pop = stack.pop();
            C14360o3.A07(pop);
            intValue = ((Number) pop).intValue();
            AbstractC13880nE.A0W(view, intValue);
        }
        if (!A00(this).A1M) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Map map;
        int A02 = C0f9.A02(636098638);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("BottomSheetNavigator.ARG_EXTRA_BUNDLE");
        C19260xA c19260xA = null;
        if ((serializable instanceof Map) && (map = (Map) serializable) != null) {
            c19260xA = AbstractC11490j8.A01(map);
        }
        this.A09 = c19260xA;
        this.A0C = C18U.A06(C06090Tz.A05, getSession(), 36313785278925052L);
        C189448aO c189448aO = this.A03;
        if (c189448aO != null) {
            setDayNightMode(c189448aO.A0O);
        }
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            C57982lB.A0B.A04(rootActivity, new InterfaceC59892oW() { // from class: X.9Ij
                @Override // X.InterfaceC59892oW
                public final void Dnp(int i, int i2) {
                    BottomSheetFragment.this.A01 = i2;
                }
            }, false);
        }
        C0f9.A09(152522905, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1282599313);
        C14360o3.A0B(layoutInflater, 0);
        if (viewGroup != null) {
            A06(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getRootView().findViewById(R.id.bottom_sheet_container);
            if (viewGroup2 != null) {
                A06(viewGroup2);
            }
        }
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-881852558, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-234722526);
        super.onDestroyView();
        BottomSheetFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-977151747, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(-1013884039);
        super.onDetach();
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A0H);
        C0f9.A09(-1192721251, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int A02 = C0f9.A02(-1141826257);
        super.onResume();
        C3DN bottomSheetNavigator = this.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            C3DP c3dp = (C3DP) bottomSheetNavigator;
            if (c3dp.A0h && A0J(this) && !AbstractC56402iY.A09()) {
                boolean z = false;
                if (A00(this).A0B != 0) {
                    z = true;
                }
                FragmentActivity requireActivity = requireActivity();
                Context themedContext = getThemedContext();
                if (z) {
                    i = A00(this).A0B;
                } else {
                    i = R.color.black_50_transparent;
                }
                AbstractC56402iY.A02(requireActivity, themedContext.getColor(i));
            }
            if (c3dp.A0h && A0J(this)) {
                A02();
            }
        }
        C0f9.A09(-992995534, A02);
    }
}
