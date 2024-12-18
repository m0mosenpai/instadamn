package X;

import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Sbn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63066Sbn {
    public static String A01(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            A1C.append("-");
            A1C.append(locale.getCountry().toLowerCase(locale));
        }
        return A1C.toString();
    }

    public static void A02(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.RFu, java.lang.Object] */
    public static C60644RFu A00(C60687RMf c60687RMf, String str) {
        C3U5.A02(c60687RMf);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map A00 = AbstractC62872SUw.A00(new java.net.URI(AbstractC58321PtD.A0w("?", str)));
            ?? obj = new Object();
            obj.A05 = AbstractC166987dD.A1A("utm_content", A00);
            obj.A03 = AbstractC166987dD.A1A("utm_medium", A00);
            obj.A00 = AbstractC166987dD.A1A("utm_campaign", A00);
            obj.A02 = AbstractC166987dD.A1A("utm_source", A00);
            obj.A04 = AbstractC166987dD.A1A("utm_term", A00);
            obj.A01 = AbstractC166987dD.A1A("utm_id", A00);
            obj.A06 = AbstractC166987dD.A1A("anid", A00);
            obj.A07 = AbstractC166987dD.A1A("gclid", A00);
            obj.A08 = AbstractC166987dD.A1A("dclid", A00);
            obj.A09 = AbstractC166987dD.A1A("aclid", A00);
            return obj;
        } catch (URISyntaxException e) {
            c60687RMf.A0F("No valid campaign data found", e);
            return null;
        }
    }
}
