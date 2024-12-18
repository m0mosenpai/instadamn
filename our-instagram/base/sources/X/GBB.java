package X;

import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* loaded from: classes6.dex */
public final class GBB implements GY8 {
    public final /* synthetic */ C81413kB A00;

    public GBB(C81413kB c81413kB) {
        this.A00 = c81413kB;
    }

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        C14360o3.A0B(countryCodeData, 0);
        EditPhoneNumberView editPhoneNumberView = this.A00.A01;
        if (editPhoneNumberView != null) {
            editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
        }
    }
}
