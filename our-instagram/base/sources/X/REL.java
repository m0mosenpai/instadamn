package X;

import android.os.Bundle;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormParams;

/* loaded from: classes10.dex */
public final class REL extends Q8X {
    public FBPayLoggerData A00;
    public C62580SHf A01;
    public final C2GT A02;
    public final C2GC A03;

    public REL(C2GC c2gc, C62580SHf c62580SHf) {
        this.A01 = c62580SHf;
        this.A03 = c2gc;
        C58252li c58252li = c62580SHf.A00;
        this.A02 = TW3.A00(c58252li, this, 13);
        C63628Sqa.A03(c58252li, super.A03, this, 68);
    }

    public static void A00(REL rel, FormParams formParams) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("form_params", formParams);
        C63167SeR.A00(rel.A06, new C62902SWi("form", A0b));
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A00 = AbstractC58320PtC.A0Z(bundle);
    }

    public final void A06(String str) {
        C63184Sej c63184Sej = new C63184Sej(5, 2131962955, null, 0);
        C67664Uuw c67664Uuw = new C67664Uuw(2);
        c67664Uuw.A0B = str;
        c67664Uuw.A03 = 2131962955;
        c67664Uuw.A0G.add((Object) new TextValidatorParams(C05F.A0Y, "", 2131962954, 0));
        c63184Sej.A09.add((Object) c67664Uuw.A00());
        A00(this, c63184Sej.A01());
    }
}
