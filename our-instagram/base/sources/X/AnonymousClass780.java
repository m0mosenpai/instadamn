package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.Locale;

/* renamed from: X.780, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass780 {
    public static final CountryCodeData A00(Context context) {
        C14360o3.A0B(context, 0);
        Object systemService = context.getSystemService("phone");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (simCountryIso == null && (simCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
            simCountryIso = Locale.getDefault().getCountry();
        }
        C14360o3.A07(simCountryIso);
        String upperCase = simCountryIso.toUpperCase(Locale.ROOT);
        C14360o3.A07(upperCase);
        if (upperCase.length() == 0) {
            upperCase = "US";
        }
        return new CountryCodeData(String.valueOf(PhoneNumberUtil.A01(context).A0A(upperCase)), new Locale("", upperCase).getDisplayCountry(), upperCase);
    }

    public static final CountryCodeData A01(Context context, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        if (str.length() == 0) {
            return A00(context);
        }
        int parseInt = Integer.parseInt(str);
        String A01 = PhoneNumberUtil.A01(context).A00.A01(parseInt);
        C14360o3.A07(A01);
        return new CountryCodeData(parseInt, A01);
    }
}
