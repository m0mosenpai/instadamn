package X;

import android.content.Context;
import android.location.Location;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.Currency;

/* loaded from: classes11.dex */
public abstract class WFD {
    public static final String[] A00 = {"US", "MM", "LR"};

    public static String A01(Context context, double d, double d2, double d3, double d4) {
        double d5;
        String str;
        StringBuilder sb;
        Object valueOf;
        String str2;
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        String country = AbstractC58319PtB.A08(context).locale.getCountry();
        int i = 0;
        float f = fArr[0] / 1000.0f;
        String[] strArr = A00;
        while (true) {
            if (country.equals(strArr[i])) {
                f *= 0.6213712f;
                d5 = 20.0d;
                str = "mi";
                break;
            }
            i++;
            if (i >= 3) {
                str = "km";
                d5 = 32.2d;
                break;
            }
        }
        if (f > d5) {
            sb = new StringBuilder();
            valueOf = Integer.valueOf((int) f);
            str2 = "%d ";
        } else {
            sb = new StringBuilder();
            valueOf = Float.valueOf(f);
            str2 = "%.1f ";
        }
        return MSZ.A0u(StringFormatUtil.formatStrLocaleSafe(str2, valueOf), str, sb);
    }

    public static String A02(Context context, UserSession userSession, Venue venue, String str) {
        Location lastLocation;
        if (!C1VW.isLocationPermitted(context, userSession, str) || C1VW.A00 == null || venue == null || venue.A00() == null || venue.A01() == null || (lastLocation = C1VW.A00.getLastLocation(userSession, "getFormattedDistanceFromVenue")) == null) {
            return "";
        }
        return A01(context, lastLocation.getLatitude(), lastLocation.getLongitude(), venue.A00().doubleValue(), venue.A01().doubleValue());
    }

    public static Currency A03(UserSession userSession) {
        if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36327550649121444L)) {
            try {
                return Currency.getInstance(C1Q2.A02());
            } catch (IllegalArgumentException | NullPointerException unused) {
                return Currency.getInstance("USD");
            }
        }
        return Currency.getInstance(C1Q2.A02());
    }

    public static SpannableString A00(Context context, UserSession userSession, int i) {
        String symbol = A03(userSession).getSymbol();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        do {
            sb.append(symbol);
            i2++;
        } while (i2 < 4);
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.grey_5)), i, 4, 33);
        return spannableString;
    }
}
