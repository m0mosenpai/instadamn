package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class SO4 {
    public final AddressFormFieldsConfig A00;
    public final FbPayNewCreditCardOption A01;
    public final FbPayNewPayPalOption A02;
    public final SNM A03;
    public final ImmutableList A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SO4) {
                SO4 so4 = (SO4) obj;
                if (!C14360o3.A0K(this.A00, so4.A00) || !C14360o3.A0K(this.A01, so4.A01) || !C14360o3.A0K(this.A02, so4.A02) || !C14360o3.A0K(this.A03, so4.A03) || !C14360o3.A0K(this.A04, so4.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04);
    }

    public SO4(SIN sin) {
        this.A00 = sin.A00;
        this.A01 = sin.A01;
        this.A02 = sin.A02;
        this.A03 = sin.A03;
        ImmutableList immutableList = sin.A04;
        AbstractC63311ShH.A04(immutableList, "paymentMethods");
        this.A04 = immutableList;
    }
}
