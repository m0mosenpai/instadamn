package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class WbN implements InterfaceC65383TjG {
    public final int A00;
    public final Object A01;

    public WbN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.UFZ] */
    @Override // X.InterfaceC65383TjG
    public final void DP6(C62901SWh c62901SWh) {
        String str;
        String str2;
        C67713Uwe c67713Uwe;
        String str3;
        String str4;
        AbstractC61604RqT A07;
        Context requireContext;
        switch (this.A00) {
            case 2:
                C67713Uwe c67713Uwe2 = (C67713Uwe) this.A01;
                str2 = c62901SWh.A03;
                if (str2 == null) {
                    return;
                }
                C67713Uwe.A01(c67713Uwe2, "user_click_payouthub_atomic", "payouthub_link_click", str2);
                c67713Uwe = c67713Uwe2;
                C63167SeR.A00(((UFZ) c67713Uwe).A03, new Wb0(str2));
                return;
            case 3:
                str2 = c62901SWh.A03;
                if (str2 == null) {
                    return;
                }
                c67713Uwe = (UFZ) this.A01;
                C63167SeR.A00(((UFZ) c67713Uwe).A03, new Wb0(str2));
                return;
            case 4:
                Q1y q1y = ((VKC) this.A01).A00;
                if (q1y == null || (str3 = c62901SWh.A03) == null) {
                    return;
                }
                C2FP.A07().A01(q1y, str3);
                return;
            case 5:
                C67727Uwt c67727Uwt = (C67727Uwt) this.A01;
                UFX ufx = c67727Uwt.A0B;
                if (ufx == null) {
                    str = "ecpViewModel";
                } else {
                    UFG ufg = ufx.A1V;
                    AbstractC10360h2 childFragmentManager = c67727Uwt.getChildFragmentManager();
                    C14360o3.A07(childFragmentManager);
                    Bundle bundle = new Bundle();
                    ECPPaymentRequest eCPPaymentRequest = ufg.A00;
                    if (eCPPaymentRequest == null) {
                        str = "ecpPaymentRequest";
                    } else {
                        bundle.putParcelable("ECP_LAUNCH_PARAMS", eCPPaymentRequest);
                        LoggingContext loggingContext = ufg.A01;
                        if (loggingContext == null) {
                            str = "loggingContext";
                        } else {
                            bundle.putParcelable("logging_context", loggingContext);
                            Fragment A01 = C2FP.A01().A01(bundle, "blank_bottom_sheet_fragment");
                            C14360o3.A0C(A01, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
                            ((C67752UxP) A01).A0I(bundle, childFragmentManager, "terms_condition_fragment", "TERMS_CONTENT_FRAGMENT_TAG");
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                str4 = c62901SWh.A03;
                if (str4 == null) {
                    return;
                }
                C67727Uwt c67727Uwt2 = (C67727Uwt) this.A01;
                A07 = C2FP.A07();
                requireContext = c67727Uwt2.A01;
                if (requireContext == null) {
                    str = "viewContext";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A07.A01(requireContext, str4);
                return;
            case 7:
                String str5 = c62901SWh.A03;
                if (str5 == null) {
                    return;
                }
                C2FP.A07().A00(((Fragment) this.A01).requireContext(), str5);
                return;
            case 8:
                str4 = c62901SWh.A03;
                if (str4 == null) {
                    return;
                }
                Fragment fragment = (Fragment) this.A01;
                A07 = C2FP.A07();
                requireContext = fragment.requireContext();
                A07.A01(requireContext, str4);
                return;
            case 9:
                String str6 = c62901SWh.A03;
                if (str6 == null) {
                    return;
                }
                C2FP.A07().A01((Context) this.A01, str6);
                return;
            default:
                ((InterfaceC16660sJ) this.A01).invoke(c62901SWh.A03);
                return;
        }
    }
}
