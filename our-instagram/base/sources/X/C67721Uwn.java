package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import java.util.Map;

/* renamed from: X.Uwn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67721Uwn extends AbstractC66388UEw {
    public UFU A00;
    public LoggingContext A01;
    public ContextThemeWrapper A02;
    public ECPPaymentRequest A03;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new X2w(this, 10));
    public final Map A05 = AbstractC167007dF.A0n(EnumC129485tD.A09, new WDM(false));
    public final InterfaceC58362lv A04 = new C70303WQi(this, 38);

    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C2GS F8A;
        C2GS F8A2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        WGJ.A02(this);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.recyclerView);
        AbstractC31174DnI.A16(requireActivity(), recyclerView, 1, false);
        recyclerView.setItemAnimator(null);
        AbstractC37304Gc5.A10(recyclerView, this.A06);
        WDM wdm = (WDM) this.A05.get(EnumC129485tD.A09);
        if (wdm != null) {
            wdm.A02(new X2w(this, 11));
        }
        UFU ufu = this.A00;
        if (ufu != null) {
            ECPHandler eCPHandler = ufu.A00;
            if (eCPHandler != null && (F8A2 = eCPHandler.F8A()) != null) {
                F8A2.A08(this.A04);
            }
            UFU ufu2 = this.A00;
            if (ufu2 != null) {
                ECPHandler eCPHandler2 = ufu2.A00;
                if (eCPHandler2 != null && (F8A = eCPHandler2.F8A()) != null) {
                    F8A.A06(this, this.A04);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("ecpViewModel");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1614821285);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("logging_context");
        C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext");
        this.A01 = (LoggingContext) parcelable;
        Parcelable parcelable2 = requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        C14360o3.A0C(parcelable2, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest");
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) parcelable2;
        this.A03 = eCPPaymentRequest;
        LoggingContext loggingContext = this.A01;
        if (loggingContext == null) {
            str = "loggingContext";
        } else if (eCPPaymentRequest == null) {
            str = "ecpPaymentRequest";
        } else {
            this.A00 = AbstractC69842VwS.A00(this, eCPPaymentRequest, loggingContext);
            C0f9.A09(-1867836128, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-730699084);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A02 = A00;
        View inflate = layoutInflater.cloneInContext(A00).inflate(R.layout.ecp_see_item_details_fragment, viewGroup, false);
        C0f9.A09(746017516, A02);
        return inflate;
    }
}
