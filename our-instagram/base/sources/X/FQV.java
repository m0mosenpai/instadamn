package X;

import android.app.Activity;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.phonenumber.model.CountryCodeData;

/* loaded from: classes6.dex */
public final class FQV {
    public Activity A00;
    public EditText A01;
    public TextView A02;
    public AbstractC12990ll A03;
    public CountryCodeData A04;
    public EnumC31713DwI A05;
    public PhoneNumberFormattingTextWatcher A06;

    public final void A01() {
        EditText editText = this.A01;
        editText.removeTextChangedListener(this.A06);
        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = new PhoneNumberFormattingTextWatcher(this.A04.A00);
        this.A06 = phoneNumberFormattingTextWatcher;
        editText.addTextChangedListener(phoneNumberFormattingTextWatcher);
    }

    public static void A00(FQV fqv, Integer num, String str, String str2, String str3, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        Activity activity = fqv.A00;
        CountryCodeData countryCodeData = fqv.A04;
        AbstractC12990ll abstractC12990ll = fqv.A03;
        EnumC31713DwI enumC31713DwI = fqv.A05;
        AbstractC167027dH.A13(activity, abstractC12990ll, enumC31713DwI);
        String A01 = AbstractC35099FdA.A01(activity, countryCodeData, str3, null, C35270Fh5.A04(activity, abstractC12990ll, enumC31713DwI, C35270Fh5.A05(num)), AbstractC35100FdB.A02(activity, abstractC12990ll, num));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "prefill_phone_number");
        double d = currentTimeMillis;
        AbstractC31177DnL.A1B(A0f, d, AbstractC31171DnF.A00());
        AbstractC31178DnM.A19(A0f, enumC31713DwI.A01);
        AbstractC31176DnK.A1K(A0f, d);
        A0f.A7v("is_valid", Boolean.valueOf(z));
        A0f.AAP("phone_num_source", str2);
        C14360o3.A0B(activity, 0);
        A0f.A7v("found_contacts_me_phone", Boolean.valueOf(AbstractC167007dF.A1W(C35270Fh5.A03(activity))));
        A0f.AAP("available_prefills", A01);
        A0f.AAP("error", str);
        A0f.Cht();
    }
}
