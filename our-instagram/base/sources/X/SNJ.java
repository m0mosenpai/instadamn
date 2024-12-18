package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.smartcapture.view.SelfieReviewActivity;

/* loaded from: classes10.dex */
public final class SNJ {
    public final /* synthetic */ K5Y A00;

    public SNJ(K5Y k5y) {
        this.A00 = k5y;
    }

    public final void A00() {
        Fragment fragment;
        K5Y k5y = this.A00;
        AbstractC10360h2 abstractC10360h2 = k5y.A04;
        if (abstractC10360h2 != null) {
            fragment = abstractC10360h2.A0Q("progressDialog");
        } else {
            fragment = null;
        }
        C0SG c0sg = (C0SG) fragment;
        if (c0sg != null) {
            c0sg.A08();
        }
        if (k5y.isAdded()) {
            C193328hC c193328hC = new C193328hC(new C52182aJ(k5y.requireContext(), R.style.Theme_Instagram));
            c193328hC.A0A(2131973271);
            c193328hC.A07();
            c193328hC.A0s(true);
            C0fJ.A00(c193328hC.A02());
        }
        TF9 tf9 = k5y.A08;
        if (tf9 != null) {
            tf9.A00(EnumC61065Ree.A03, EnumC61067Reg.A05, k5y.A0A);
        }
    }

    public final void A01(String str) {
        Fragment fragment;
        K5Y k5y = this.A00;
        AbstractC10360h2 abstractC10360h2 = k5y.A04;
        if (abstractC10360h2 != null) {
            fragment = abstractC10360h2.A0Q("progressDialog");
        } else {
            fragment = null;
        }
        C0SG c0sg = (C0SG) fragment;
        if (c0sg != null) {
            c0sg.A08();
        }
        InterfaceC50383MMl interfaceC50383MMl = (InterfaceC50383MMl) ((K5L) k5y).A00.get();
        if (interfaceC50383MMl != null) {
            SelfieReviewActivity selfieReviewActivity = (SelfieReviewActivity) interfaceC50383MMl;
            selfieReviewActivity.A04(selfieReviewActivity.A00, str);
        }
    }
}
