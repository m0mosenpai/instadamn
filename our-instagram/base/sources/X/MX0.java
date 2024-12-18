package X;

import android.content.Context;
import android.text.format.DateFormat;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class MX0 {
    public static final MX0 A00 = new Object();
    public static final TimeZone A03 = TimeZone.getTimeZone("UTC");
    public static final Calendar A01 = Calendar.getInstance();
    public static final Calendar A02 = Calendar.getInstance();

    public static final String A00(Context context, long j) {
        int i;
        Object[] objArr;
        C14360o3.A0B(context, 0);
        int intValue = AbstractC53877Ns9.A00(new Date(), j).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 4 && intValue != 5) {
                        throw AbstractC166987dD.A14("Unsupported relative time period");
                    }
                    i = 2131957529;
                    objArr = new Object[]{A04("MMM d", j), A01(context, j)};
                    String string = context.getString(i, objArr);
                    C14360o3.A07(string);
                    return string;
                }
                i = 2131975647;
            } else {
                i = 2131977168;
            }
            objArr = new Object[]{A01(context, j)};
            String string2 = context.getString(i, objArr);
            C14360o3.A07(string2);
            return string2;
        }
        return A04("MMM d, yyyy", j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r3.inDaylightTime(r6) == false) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x003e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(com.instagram.common.session.UserSession r5, java.util.Date r6) {
        /*
            r4 = 0
            X.C14360o3.A0B(r5, r4)
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327503404481150(0x810fac00003a7e, double:3.036997659884355E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L22
            boolean r0 = r3.useDaylightTime()
            if (r0 == 0) goto L22
            boolean r0 = r3.inDaylightTime(r6)
            r1 = 1
            if (r0 != 0) goto L23
        L22:
            r1 = 0
        L23:
            java.lang.String r0 = "Europe/London"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L34
            if (r1 == 0) goto L34
            java.lang.String r1 = "BST"
            return r1
        L34:
            java.lang.String r1 = r3.getDisplayName(r1, r4)
            if (r1 == 0) goto L41
            int r0 = r1.hashCode()
            switch(r0) {
                case 66579: goto L8e;
                case 67044: goto L8b;
                case 68501: goto L80;
                case 68966: goto L7d;
                case 71384: goto L72;
                case 71849: goto L6f;
                case 76189: goto L64;
                case 76654: goto L61;
                case 79072: goto L56;
                case 79537: goto L53;
                case 2010682: goto L48;
                case 2011147: goto L45;
                default: goto L41;
            }
        L41:
            X.C14360o3.A0A(r1)
            return r1
        L45:
            java.lang.String r0 = "AKST"
            goto L4a
        L48:
            java.lang.String r0 = "AKDT"
        L4a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r1 = "AKT"
            return r1
        L53:
            java.lang.String r0 = "PST"
            goto L58
        L56:
            java.lang.String r0 = "PDT"
        L58:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r1 = "PT"
            return r1
        L61:
            java.lang.String r0 = "MST"
            goto L66
        L64:
            java.lang.String r0 = "MDT"
        L66:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r1 = "MT"
            return r1
        L6f:
            java.lang.String r0 = "HST"
            goto L74
        L72:
            java.lang.String r0 = "HDT"
        L74:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r1 = "HT"
            return r1
        L7d:
            java.lang.String r0 = "EST"
            goto L82
        L80:
            java.lang.String r0 = "EDT"
        L82:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r1 = "ET"
            return r1
        L8b:
            java.lang.String r0 = "CST"
            goto L90
        L8e:
            java.lang.String r0 = "CDT"
        L90:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L41
            java.lang.String r1 = "CT"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MX0.A03(com.instagram.common.session.UserSession, java.util.Date):java.lang.String");
    }

    public static final String A01(Context context, long j) {
        String str;
        Calendar calendar = A02;
        calendar.setTime(new Date(j));
        if (DateFormat.is24HourFormat(context)) {
            str = "H:mm";
        } else if (calendar.get(12) == 0) {
            str = "h a";
        } else {
            str = "h:mm a";
        }
        String format = new SimpleDateFormat(str, A05()).format(Long.valueOf(j));
        C14360o3.A07(format);
        return format;
    }

    public static final String A02(Context context, UserSession userSession, long j) {
        AbstractC167017dG.A1N(context, userSession);
        String string = context.getString(2131957561, A04("EE", j), A04("MMM d", j), A01(context, j), A03(userSession, new Date(j)));
        C14360o3.A07(string);
        return string;
    }

    public static final String A04(String str, long j) {
        Locale A05 = A05();
        String format = new SimpleDateFormat(DateFormat.getBestDateTimePattern(A05, str), A05).format(Long.valueOf(j));
        C14360o3.A07(format);
        return format;
    }

    public static final Locale A05() {
        Locale locale = ((AbstractC215613i) C11X.A00().A01()).A00.getConfiguration().locale;
        C14360o3.A07(locale);
        return locale;
    }
}
