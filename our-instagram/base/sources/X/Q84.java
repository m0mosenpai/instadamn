package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebookpay.logging.FBPayLoggerData;

/* loaded from: classes10.dex */
public final class Q84 extends Fragment implements InterfaceC65384TjH, InterfaceC65387TjK {
    public View A00;
    public FBPayLoggerData A01;
    public REA A02;
    public Q8a A03;

    @Override // X.InterfaceC65387TjK
    public final SOB C8u() {
        return new SOB(null, null, null, getString(2131969406), 0, 0, false, false, true);
    }

    public static Bundle A00(Q84 q84) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("has_container_fragment", true);
        bundle.putParcelable("logger_data", q84.A01);
        return bundle;
    }

    @Override // X.InterfaceC65384TjH
    public final boolean DIB(Bundle bundle, int i, boolean z) {
        return this.A02.DIB(bundle, i, z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        REA rea = this.A02;
        boolean A1P = AbstractC167007dF.A1P(i2, -1);
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        rea.DIB(extras, i, A1P);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FBPayLoggerData A00;
        int A02 = C0f9.A02(-2083136841);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getParcelable("logger_data") != null) {
            A00 = AbstractC58319PtB.A0W(this.mArguments);
        } else {
            A00 = AbstractC58442PvL.A00();
        }
        this.A01 = A00;
        if (bundle == null) {
            C2FP.A0E().A05().Chz("client_load_paymentsettings_init", AbstractC58442PvL.A08(this.A01));
            C63307ShD.A01().markerStart(110177837);
        }
        C0f9.A09(-1375032198, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(937647495);
        FragmentActivity activity = getActivity();
        C2FP.A0E();
        View A0A = AbstractC31172DnG.A0A(AbstractC43593JPy.A0C(activity, layoutInflater, R.style.Ig4aFbPay), viewGroup, R.layout.fragment_hub_settings);
        C0f9.A09(-150750660, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.A00 = view.requireViewById(R.id.progress_bar);
        if (this.A02 == null) {
            this.A02 = (REA) C2FP.A0E().A04(A00(this), "payment_methods");
            C14240no A0F = AbstractC43593JPy.A0F(this);
            A0F.A0A(this.A02, R.id.payment_methods_fragment_container);
            A0F.A00();
        }
        if (getChildFragmentManager().A0O(R.id.order_info_section_fragment_container) == null) {
            Bundle A00 = A00(this);
            C14240no A0F2 = AbstractC43593JPy.A0F(this);
            A0F2.A0A(C2FP.A0E().A04(A00, "order_info"), R.id.order_info_section_fragment_container);
            A0F2.A00();
        }
        C2FP.A0E().A06();
        if (getChildFragmentManager().A0O(R.id.merchant_loyalty_list_section_fragment_container) == null) {
            Bundle A002 = A00(this);
            C14240no A0F3 = AbstractC43593JPy.A0F(this);
            A0F3.A0A(C2FP.A0E().A04(A002, "merchant_loyalty_list"), R.id.merchant_loyalty_list_section_fragment_container);
            A0F3.A00();
        }
        this.A03 = (Q8a) C63307ShD.A00(this).A00(Q8a.class);
        REI rei = (REI) C63307ShD.A00(this).A00(REI.class);
        REL rel = (REL) C63307ShD.A00(this).A00(REL.class);
        Q8U q8u = (Q8U) C63307ShD.A00(this).A00(Q8U.class);
        Q8a q8a = this.A03;
        FBPayLoggerData A0Z = AbstractC58320PtC.A0Z(this.mArguments);
        q8a.A00 = A0Z;
        q8a.A07.Chz("fbpay_payment_settings_page_display", AbstractC58442PvL.A08(A0Z));
        q8a.A03 = rei;
        q8a.A01 = rel;
        q8a.A02 = q8u;
        C58252li c58252li = q8a.A05;
        C58252li c58252li2 = ((Q8X) rei).A03;
        InterfaceC58362lv interfaceC58362lv = q8a.A06;
        c58252li.A0E(c58252li2, interfaceC58362lv);
        c58252li.A0E(((Q8X) q8a.A01).A03, interfaceC58362lv);
        Q8U q8u2 = q8a.A02;
        if (q8u2 != null) {
            c58252li.A0E(q8u2.A01, interfaceC58362lv);
        }
        C63627SqZ.A00(this, this.A03.A05, 34);
    }
}
