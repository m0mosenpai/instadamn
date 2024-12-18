package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* loaded from: classes6.dex */
public final class FRB {
    public final Fragment A00;
    public final AbstractC12990ll A01;
    public final C35146Fen A02;
    public volatile RegFlowExtras A03;

    public FRB(Fragment fragment, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A01 = abstractC12990ll;
        this.A00 = fragment;
        this.A02 = C35146Fen.A00(fragment.requireContext());
    }

    public final void A00() {
        C35146Fen c35146Fen = this.A02;
        c35146Fen.A00.A03(new C36032FvU(new FH6(this), c35146Fen), "reg_flow_extras_serialize_key");
    }

    public final void A01() {
        Bundle A0b;
        Fragment abstractC59962oe;
        Integer num = C35154Few.A00().A05;
        Integer num2 = C05F.A0C;
        if (num != num2 && C35160Ff2.A02.A00().A01() != num2) {
            RegFlowExtras regFlowExtras = new RegFlowExtras();
            A0b = AbstractC166987dD.A0b();
            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
            AbstractC12990ll abstractC12990ll = this.A01;
            AbstractC31175DnJ.A0r(A0b, abstractC12990ll);
            AbstractC31175DnJ.A0R();
            AbstractC31171DnF.A12(A0b, abstractC12990ll.getToken());
            abstractC59962oe = new EKF();
        } else {
            RegFlowExtras regFlowExtras2 = this.A03;
            A0b = AbstractC166987dD.A0b();
            if (regFlowExtras2 != null) {
                A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
            }
            AbstractC31172DnG.A1A();
            AbstractC31175DnJ.A0r(A0b, this.A01);
            abstractC59962oe = new AbstractC59962oe();
        }
        abstractC59962oe.setArguments(A0b);
        AbstractC31179DnN.A0z(abstractC59962oe, this.A00.getParentFragmentManager());
    }
}
