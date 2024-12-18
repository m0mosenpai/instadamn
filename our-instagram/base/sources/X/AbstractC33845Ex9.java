package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Ex9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33845Ex9 {
    public static final String A00(C6FQ c6fq, C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        CountryCodeData countryCodeData = ((RegFlowExtras) A0B.A01(RegFlowExtras.class, GTO.A00)).A01;
        if (countryCodeData == null) {
            countryCodeData = AnonymousClass780.A00(A04);
        }
        try {
            return String.valueOf(Long.valueOf(PhoneNumberUtil.A01(A04).A0F(A0d, countryCodeData.A00).A02));
        } catch (C40f unused) {
            return null;
        }
    }
}
