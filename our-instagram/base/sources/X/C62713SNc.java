package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.google.common.collect.ImmutableList;

/* renamed from: X.SNc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62713SNc {
    public final AddressFormFieldsConfig A00;
    public final ImmutableList A01;

    public C62713SNc(AddressFormFieldsConfig addressFormFieldsConfig, ImmutableList immutableList) {
        AbstractC63311ShH.A04(immutableList, "addresses");
        this.A01 = immutableList;
        this.A00 = addressFormFieldsConfig;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62713SNc) {
                C62713SNc c62713SNc = (C62713SNc) obj;
                if (!C14360o3.A0K(this.A01, c62713SNc.A01) || !C14360o3.A0K(this.A00, c62713SNc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC63311ShH.A02(this.A01) * 31) + AbstractC25235BEs.A06(this.A00);
    }
}
