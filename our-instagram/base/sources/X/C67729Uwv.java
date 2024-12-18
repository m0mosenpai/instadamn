package X;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Uwv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67729Uwv extends C67752UxP implements XF6 {
    public ECPHandler A00;
    public ECPPaymentRequest A01;
    public Q1y A02;
    public boolean A03;
    public final C58252li A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final VTA A0B;

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        Q5b q5b;
        BottomSheetBehavior A07;
        C14360o3.A0B(fragment, 0);
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            if (fragment instanceof XCE) {
                ((XCE) fragment).ETZ(eCPHandler);
            }
            ((UFX) this.A05.getValue()).A0n(eCPHandler);
        }
        A02();
        Dialog dialog = ((C0SG) this).A01;
        if ((dialog instanceof Q5b) && (q5b = (Q5b) dialog) != null && (A07 = q5b.A07()) != null) {
            A07.A0b(!A03(this));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        C14360o3.A07(AbstractC166997dE.A0N(this));
        super.onConfigurationChanged(configuration);
    }

    @Override // X.C67752UxP, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest != null && WGr.A0L(eCPPaymentRequest)) {
            A0H();
            ConstraintLayout constraintLayout = ((C67752UxP) this).A04;
            if (constraintLayout != null) {
                WNN.A00(constraintLayout, 36, this);
            } else {
                C14360o3.A0F("transparentViewContainer");
                throw C00O.createAndThrow();
            }
        }
        Dialog dialog = ((C0SG) this).A01;
        if (dialog instanceof Q5b) {
            BottomSheetBehavior A07 = ((Q5b) dialog).A07();
            A07.A0b(false);
            A07.A0a(new C67745UxH(this, A07));
        }
    }

    public static final ECPPaymentRequest A01(C67729Uwv c67729Uwv) {
        ECPPaymentRequest eCPPaymentRequest = c67729Uwv.A01;
        if (eCPPaymentRequest == null) {
            Parcelable parcelable = c67729Uwv.requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
            if (parcelable instanceof ECPPaymentRequest) {
                eCPPaymentRequest = (ECPPaymentRequest) parcelable;
            } else {
                eCPPaymentRequest = null;
            }
            c67729Uwv.A01 = eCPPaymentRequest;
        }
        return eCPPaymentRequest;
    }

    private final void A02() {
        Dialog dialog = ((C0SG) this).A01;
        if (dialog instanceof Q5b) {
            ConstraintLayout constraintLayout = ((C67752UxP) this).A05;
            if (constraintLayout != null) {
                constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new WOH(0, dialog, this));
            } else {
                C14360o3.A0F("viewContainer");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.C67752UxP, X.UDB, X.AbstractC66383UEr, X.C0SG
    public final Dialog A0F(Bundle bundle) {
        return A0G(new X2x(this, 48));
    }

    public final void A0K(ECPHandler eCPHandler) {
        XCE xce;
        this.A00 = eCPHandler;
        InterfaceC08430c6 A0Q = getChildFragmentManager().A0Q("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        if ((A0Q instanceof XCE) && (xce = (XCE) A0Q) != null) {
            xce.ETZ(this.A00);
        }
        if (getChildFragmentManager().A0Q("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG") != null) {
            ((UFX) this.A05.getValue()).A0n(this.A00);
        }
    }

    public C67729Uwv() {
        VTA A09 = C2FP.A09();
        C14360o3.A07(A09);
        this.A0B = A09;
        this.A04 = new C58252li();
        this.A06 = AbstractC09440dt.A01(new X2x(this, 45));
        this.A09 = new X2x(this, 44);
        this.A0A = new X2w(this, 0);
        this.A08 = AbstractC09440dt.A01(new X2w(this, 1));
        this.A05 = AbstractC09440dt.A01(new X2x(this, 43));
        this.A07 = AbstractC09440dt.A01(new X2x(this, 46));
    }

    public static final boolean A03(C67729Uwv c67729Uwv) {
        AbstractC66388UEw abstractC66388UEw;
        Fragment A0Q = c67729Uwv.getChildFragmentManager().A0Q("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        if ((A0Q instanceof AbstractC66388UEw) && (abstractC66388UEw = (AbstractC66388UEw) A0Q) != null && (abstractC66388UEw instanceof C67724Uwq)) {
            return false;
        }
        return true;
    }

    public final void A0L(Integer num) {
        Boolean bool;
        XCE xce;
        InterfaceC08430c6 A0Q = getChildFragmentManager().A0Q("BOTTOM_SHEET_CONTENT_FRAGMENT_TAG");
        if ((A0Q instanceof XCE) && (xce = (XCE) A0Q) != null) {
            bool = Boolean.valueOf(xce.D1o((LoggingContext) this.A06.getValue(), num));
        } else {
            bool = null;
        }
        if (!AbstractC31177DnL.A1b(bool)) {
            ((UFX) this.A05.getValue()).A0l(getViewLifecycleOwner(), (LoggingContext) this.A06.getValue(), num);
        }
        A07();
    }

    @Override // X.C67752UxP, X.InterfaceC72028XFq
    public final boolean D7Z() {
        A02();
        return super.D7Z();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(947327772);
        super.onCreate(bundle);
        A01(this);
        this.A02 = new Q1y(requireContext(), this.A0B);
        C58252li c58252li = this.A04;
        AbstractC58321PtD.A1D(((UFX) this.A05.getValue()).A0o, c58252li, new X58(this, 18), 29);
        AbstractC58321PtD.A1D(((UFU) this.A07.getValue()).A07, c58252li, new X58(this, 19), 29);
        C2FP.A0D();
        Context context = getContext();
        if (context != null) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager.isEnabled() && autofillManager.isAutofillSupported()) {
                C2FP.A01().A04.A01.markerStart(223872246);
                ((AutofillManager) context.getSystemService(AutofillManager.class)).registerCallback((AutofillManager.AutofillCallback) VYS.A00.getValue());
                Wap wap = C2FP.A01().A04;
                LoggingContext loggingContext = (LoggingContext) this.A06.getValue();
                String str = null;
                ComponentName autofillServiceComponentName = ((AutofillManager) context.getSystemService(AutofillManager.class)).getAutofillServiceComponentName();
                if (autofillServiceComponentName != null) {
                    str = autofillServiceComponentName.flattenToShortString();
                }
                C14360o3.A0B(loggingContext, 0);
                wap.A01.markerEnd(223872246, (short) 2);
                Wap.A02(new C25531Mh(MSY.A0H(wap.A00, "client_enable_platformautofill_success"), 36), loggingContext, null, str, 14);
            }
        }
        C0f9.A09(-951073789, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(971937823);
        C58252li c58252li = this.A04;
        c58252li.A0D(((UFX) this.A05.getValue()).A0o);
        c58252li.A0D(((UFU) this.A07.getValue()).A07);
        Context context = getContext();
        if (context != null) {
            ((AutofillManager) context.getSystemService(AutofillManager.class)).unregisterCallback((AutofillManager.AutofillCallback) VYS.A00.getValue());
        }
        super.onDestroy();
        C0f9.A09(-1232211660, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1530022880);
        super.onPause();
        requireActivity().setRequestedOrientation(10);
        C0f9.A09(-1995717248, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        CheckoutConfiguration checkoutConfiguration;
        int A02 = C0f9.A02(824119500);
        super.onResume();
        C14360o3.A07(AbstractC166997dE.A0N(this));
        FragmentActivity requireActivity = requireActivity();
        ECPPaymentRequest eCPPaymentRequest = this.A01;
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null) {
            i = checkoutConfiguration.A00;
        } else {
            i = 1;
        }
        requireActivity.setRequestedOrientation(i);
        C0f9.A09(1942760132, A02);
    }
}
