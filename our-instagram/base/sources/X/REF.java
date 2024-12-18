package X;

import android.os.Bundle;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;

/* loaded from: classes10.dex */
public final class REF extends Q8X {
    public AddressFormFieldsConfig A00;
    public FBPayLoggerData A01;
    public final C2GT A02;
    public final C2GC A03;
    public final SGD A04;

    public REF(C2GC c2gc, SGD sgd) {
        this.A04 = sgd;
        this.A03 = c2gc;
        C58252li c58252li = sgd.A00;
        this.A02 = TW3.A00(c58252li, this, 12);
        C63628Sqa.A03(c58252li, super.A03, this, 65);
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A01 = AbstractC58320PtC.A0Z(bundle);
    }
}
