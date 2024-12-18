package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.widget.navibar.NavigationBar;
import java.util.List;

/* renamed from: X.UxP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C67752UxP extends UDB implements InterfaceC72028XFq {
    public static final /* synthetic */ C0YR[] A0X = {new AnonymousClass013(C67752UxP.class, "headerTitle", "getHeaderTitle()Ljava/lang/String;", 0), new AnonymousClass013(C67752UxP.class, "headerIcon", "getHeaderIcon()Lcom/facebookpay/widget/style/Icon;", 0), new AnonymousClass013(C67752UxP.class, "headerLeftIconButtonIcon", "getHeaderLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;", 0), new AnonymousClass013(C67752UxP.class, "isLeftProfileIcon", "isLeftProfileIcon()Z", 0), new AnonymousClass013(C67752UxP.class, "headerLeftTextButtonText", "getHeaderLeftTextButtonText()Ljava/lang/String;", 0), new AnonymousClass013(C67752UxP.class, "headerRightIconButtonIcon", "getHeaderRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;", 0), new AnonymousClass013(C67752UxP.class, "headerRightTextButtonText", "getHeaderRightTextButtonText()Ljava/lang/String;", 0), new AnonymousClass013(C67752UxP.class, "isRightProfileIcon", "isRightProfileIcon()Z", 0), new AnonymousClass013(C67752UxP.class, "headerRightTextButtonEnable", "getHeaderRightTextButtonEnable()Z", 0), new AnonymousClass013(C67752UxP.class, "headerClickableActionsEnable", "getHeaderClickableActionsEnable()Z", 0), new AnonymousClass013(C67752UxP.class, "progressIconShow", "getProgressIconShow()Z", 0), new AnonymousClass013(C67752UxP.class, "headerLeftIconButtonOnClickListener", "getHeaderLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(C67752UxP.class, "headerLeftTextButtonOnClickListener", "getHeaderLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(C67752UxP.class, "headerRightIconButtonOnClickListener", "getHeaderRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(C67752UxP.class, "headerRightTextButtonOnClickListener", "getHeaderRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;", 0), new AnonymousClass013(C67752UxP.class, "headerLeftTextButtonHint", "getHeaderLeftTextButtonHint()Ljava/lang/String;", 0), new AnonymousClass013(C67752UxP.class, "headerLeftIconButtonHint", "getHeaderLeftIconButtonHint()Ljava/lang/String;", 0), new AnonymousClass013(C67752UxP.class, "headerRightIconButtonHint", "getHeaderRightIconButtonHint()Ljava/lang/String;", 0), new AnonymousClass013(C67752UxP.class, "headerRightTextButtonHint", "getHeaderRightTextButtonHint()Ljava/lang/String;", 0), new AnonymousClass013(C67752UxP.class, "headerDividerVisible", "getHeaderDividerVisible()Z", 0), new AnonymousClass013(C67752UxP.class, "isLandscape", "isLandscape()Z", 0)};
    public DialogInterface.OnDismissListener A00;
    public FrameLayout A01;
    public ImageView A02;
    public ProgressBar A03;
    public ConstraintLayout A04;
    public ConstraintLayout A05;
    public NavigationBar A06;
    public boolean A07;
    public Bundle A08;
    public ContextThemeWrapper A09;
    public Fragment A0A;
    public final InterfaceC16530ry A0C;
    public final InterfaceC16530ry A0D;
    public final InterfaceC16530ry A0F;
    public final InterfaceC16530ry A0H;
    public final InterfaceC16530ry A0I;
    public final InterfaceC16530ry A0J;
    public final InterfaceC16530ry A0K;
    public final InterfaceC16530ry A0L;
    public final InterfaceC16530ry A0M;
    public final InterfaceC16530ry A0N;
    public final InterfaceC16530ry A0O;
    public final InterfaceC16530ry A0P;
    public final InterfaceC16530ry A0Q;
    public final InterfaceC16530ry A0R;
    public final InterfaceC16530ry A0T;
    public final InterfaceC16530ry A0U;
    public final InterfaceC16530ry A0V;
    public final InterfaceC16530ry A0W;
    public String A0B = "";
    public final InterfaceC16530ry A0S = new X6J(this, 15);
    public final InterfaceC16530ry A0E = new X6J(this, 18);
    public final InterfaceC16530ry A0G = new X6J(this, 19);

    @Override // X.UDB, X.AbstractC66383UEr, X.C0SG
    public Dialog A0F(Bundle bundle) {
        return A0G(null);
    }

    public final void A0I(Bundle bundle, AbstractC10360h2 abstractC10360h2, String str, String str2) {
        C14360o3.A0B(abstractC10360h2, 0);
        this.A0B = str;
        this.A08 = bundle;
        SPR A01 = C2FP.A01();
        String str3 = this.A0B;
        Bundle bundle2 = this.A08;
        if (bundle2 == null) {
            C14360o3.A0F("fragmentBundle");
            throw C00O.createAndThrow();
        }
        A0J(A01.A01(bundle2, str3), abstractC10360h2, str2);
    }

    @Override // X.InterfaceC72028XFq
    public final void ES3(Fragment fragment, boolean z, boolean z2) {
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        if (z2 && childFragmentManager.A0L() > 0) {
            childFragmentManager.A0c(((C14240no) childFragmentManager.A0S(0)).A00);
        }
        C07K.A02(this);
        fragment.setTargetFragment(null, this.mTargetRequestCode);
        C14240no c14240no = new C14240no(childFragmentManager);
        c14240no.A0D(fragment, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG", R.id.content_fragment);
        if (z) {
            c14240no.A0I(null);
        }
        c14240no.A00();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        String str = this.A0B;
        if (str.length() > 0) {
            bundle.putString("SAVED_INSTANCE_FRAGMENT_ID_KEY", str);
        }
        Bundle bundle2 = this.A08;
        if (bundle2 != null) {
            bundle.putBundle("SAVED_INSTANCE_FRAGMENT_BUNDLE_KEY", bundle2);
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        if (r2.equals("loading_fragment") != false) goto L41;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67752UxP.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.UDB, X.C0SG
    public final void A07() {
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(super.A01);
        }
        super.A07();
    }

    public final void A0H() {
        C110964z8 c110964z8 = new C110964z8();
        ConstraintLayout constraintLayout = this.A04;
        if (constraintLayout != null) {
            c110964z8.A0I(constraintLayout);
            c110964z8.A07(R.id.bottom_sheet_container, 0.67f);
            ConstraintLayout constraintLayout2 = this.A04;
            if (constraintLayout2 != null) {
                c110964z8.A0G(constraintLayout2);
                return;
            }
        }
        C14360o3.A0F("transparentViewContainer");
        throw C00O.createAndThrow();
    }

    public C67752UxP() {
        Boolean A0a = AbstractC166997dE.A0a();
        this.A0U = new X6J(20, this, A0a);
        this.A0K = new X6J(this, 21);
        this.A0M = new X6J(this, 22);
        this.A0R = new X6J(this, 23);
        this.A0V = new X6J(24, this, A0a);
        this.A0O = new X6J(25, this, A0a);
        this.A0C = new X6J(5, this, A0a);
        this.A0W = new X6J(6, this, A0a);
        this.A0H = new X6J(this, 7);
        this.A0J = new X6J(this, 8);
        this.A0N = new X6J(this, 9);
        this.A0Q = new X6J(this, 10);
        this.A0I = new X6J(this, 11);
        this.A0F = new X6J(this, 12);
        this.A0L = new X6J(this, 13);
        this.A0P = new X6J(this, 14);
        this.A0D = new X6J(16, this, A0a);
        this.A0T = new X6J(17, this, A0a);
    }

    @Override // X.C0SG
    public final int A0E() {
        if (requireArguments().containsKey("STYLE_RES")) {
            return requireArguments().getInt("STYLE_RES");
        }
        C2FP.A0A();
        return R.style.FBPayUIWidget_BottomSheets;
    }

    public final DialogC67750UxN A0G(InterfaceC16820sZ interfaceC16820sZ) {
        Window window;
        DialogC67750UxN dialogC67750UxN = new DialogC67750UxN(requireContext(), this, interfaceC16820sZ, requireArguments().getInt("STYLE_RES"));
        dialogC67750UxN.setOnShowListener(new WIG(this, 1));
        if (requireArguments().getBoolean("checkoutInFullScreen", false) && (window = dialogC67750UxN.getWindow()) != null) {
            window.setFlags(1024, 1024);
        }
        return dialogC67750UxN;
    }

    public final void A0J(Fragment fragment, AbstractC10360h2 abstractC10360h2, String str) {
        AbstractC167017dG.A1N(abstractC10360h2, fragment);
        this.A0A = fragment;
        A0B(abstractC10360h2, str);
    }

    @Override // X.InterfaceC72028XFq
    public final boolean Cnu() {
        String str;
        if (getChildFragmentManager().A0L() > 1) {
            List A04 = getChildFragmentManager().A0U.A04();
            C14360o3.A07(A04);
            Fragment fragment = (Fragment) AbstractC001800i.A0K(A04);
            if (!(fragment instanceof AbstractC66388UEw)) {
                return true;
            }
            AbstractC66388UEw abstractC66388UEw = (AbstractC66388UEw) fragment;
            if (abstractC66388UEw instanceof C67722Uwo) {
                C67722Uwo c67722Uwo = (C67722Uwo) abstractC66388UEw;
                View view = c67722Uwo.A02;
                if (view == null) {
                    str = "loadingOverlay";
                } else {
                    if (view.getVisibility() == 0) {
                        return true;
                    }
                    UFR ufr = c67722Uwo.A0C;
                    if (ufr == null) {
                        str = "formFragmentViewModel";
                    } else if (!ufr.A07()) {
                        C67722Uwo.A02(c67722Uwo, true);
                    } else {
                        ContextThemeWrapper contextThemeWrapper = c67722Uwo.A00;
                        if (contextThemeWrapper == null) {
                            str = "viewContext";
                        } else {
                            WF6.A04(contextThemeWrapper, new X2w(c67722Uwo, 5), c67722Uwo.A0K);
                            return true;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            getChildFragmentManager().A12();
            return true;
        }
        return false;
    }

    public boolean D7Z() {
        if (getChildFragmentManager().A0L() > 1) {
            getChildFragmentManager().A12();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1301915478);
        C14360o3.A0B(layoutInflater, 0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), A0E());
        this.A09 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fbpay_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(1967154109, A02);
        return inflate;
    }
}
