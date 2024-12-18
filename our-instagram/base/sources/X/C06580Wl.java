package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06580Wl {
    public static final boolean A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        Locale locale = Locale.ROOT;
        C14360o3.A08(locale);
        String lowerCase = str.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        List A0R = AbstractC001900j.A0R(lowerCase, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0R) {
            if (!((String) obj).equals("")) {
                arrayList.add(obj);
            }
        }
        String lowerCase2 = str2.toLowerCase(locale);
        C14360o3.A07(lowerCase2);
        return arrayList.contains(lowerCase2);
    }

    public static final String A00(Context context) {
        Object systemService = context.getSystemService("phone");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (simCountryIso == null && (simCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
            simCountryIso = Locale.getDefault().getCountry();
        }
        C14360o3.A0A(simCountryIso);
        Locale locale = Locale.ROOT;
        C14360o3.A08(locale);
        String lowerCase = simCountryIso.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }
}
