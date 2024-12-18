package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23831Eq {
    public static final C23831Eq A00 = new Object();

    public static final String A03(Context context, double d) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return A0E(resources, EnumC89613z1.A06, C05F.A0N, d, true, false);
    }

    public static final String A04(Context context, double d) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return A0E(resources, EnumC89613z1.A04, C05F.A00, d, false, false);
    }

    public static final String A05(Context context, double d, boolean z) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return A0E(resources, EnumC89613z1.A06, C05F.A0N, d, false, z);
    }

    public static final String A08(Context context, long j) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return A0E(resources, EnumC89613z1.A06, C05F.A01, j, false, false);
    }

    public static final String A09(Resources resources, double d) {
        C14360o3.A0B(resources, 0);
        return A0E(resources, EnumC89613z1.A06, C05F.A00, d, false, false);
    }

    public static final String A0B(Resources resources, double d, boolean z) {
        C14360o3.A0B(resources, 0);
        return A0D(resources, EnumC89613z1.A06, C05F.A00, d, System.currentTimeMillis() / 1000, false, false, false, z, false);
    }

    public static final void A0G(Date date, Date date2, Map map) {
        int i;
        int i2;
        int i3;
        Locale locale = Locale.ENGLISH;
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTime(date2);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTime(date);
        int i4 = calendar2.get(5);
        int i5 = 0;
        int i6 = 0;
        while (calendar2.getTimeInMillis() < timeInMillis) {
            i4 = calendar2.get(5);
            calendar2.add(2, 1);
            i6++;
        }
        if (i6 > 0) {
            calendar2.add(2, -1);
            calendar2.set(5, i4);
            i6--;
        }
        long timeInMillis2 = timeInMillis - calendar2.getTimeInMillis();
        if (timeInMillis2 > 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            i5 = (int) timeUnit.toDays(timeInMillis2);
            long millis = timeInMillis2 - TimeUnit.DAYS.toMillis(i5);
            i2 = (int) timeUnit.toHours(millis);
            long millis2 = millis - TimeUnit.HOURS.toMillis(i2);
            i = (int) timeUnit.toMinutes(millis2);
            i3 = (int) timeUnit.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(i));
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        map.put(EnumC89613z1.A05, Integer.valueOf(i6));
        map.put(EnumC89613z1.A02, Integer.valueOf(i5));
        map.put(EnumC89613z1.A03, Integer.valueOf(i2));
        map.put(EnumC89613z1.A04, Integer.valueOf(i));
        map.put(EnumC89613z1.A06, Integer.valueOf(i3));
    }

    public static final void A0H(Date date, Map map) {
        C14360o3.A0B(map, 0);
        C14360o3.A0B(date, 1);
        A0G(new Date(), date, map);
    }

    public static final String A01(double d) {
        Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
        calendar.setTimeInMillis((long) (d * 1000.0d));
        String format = DateFormat.getDateInstance(1, C1Q2.A02()).format(calendar.getTime());
        C14360o3.A07(format);
        return format;
    }

    public static final String A02(long j) {
        Object[] copyOf;
        String str;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j) % 24;
        long minutes = timeUnit.toMinutes(j) % 60;
        long seconds = timeUnit.toSeconds(j) % 60;
        if (hours == 0) {
            copyOf = Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2);
            str = "%d:%02d";
        } else {
            copyOf = Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3);
            str = "%d:%02d:%02d";
        }
        String format = String.format(str, copyOf);
        C14360o3.A07(format);
        return format;
    }

    public static final String A0A(Resources resources, double d) {
        return A0D(resources, EnumC89613z1.A06, C05F.A0C, System.currentTimeMillis() / 1000, d, false, true, true, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A0D(android.content.res.Resources r9, X.EnumC89613z1 r10, java.lang.Integer r11, double r12, double r14, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23831Eq.A0D(android.content.res.Resources, X.3z1, java.lang.Integer, double, double, boolean, boolean, boolean, boolean, boolean):java.lang.String");
    }

    public static final String A0F(String str, double d, double d2) {
        DateFormat dateFormat;
        Locale locale = Locale.ENGLISH;
        Calendar calendar = Calendar.getInstance(locale);
        calendar.setTimeInMillis((long) (d * 1000.0d));
        int i = calendar.get(1);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis((long) (d2 * 1000.0d));
        int i2 = calendar2.get(1);
        Locale A02 = C1Q2.A02();
        if (i2 == i) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, A02);
            simpleDateFormat.applyPattern(android.text.format.DateFormat.getBestDateTimePattern(C1Q2.A02(), str));
            dateFormat = simpleDateFormat;
        } else {
            dateFormat = DateFormat.getDateInstance(1, A02);
        }
        String format = dateFormat.format(time);
        C14360o3.A0A(format);
        return format;
    }

    public static final long A00() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }

    public static final String A06(Context context, long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(C1Q2.A02(), "MMMM d"));
        Long valueOf = Long.valueOf(j);
        String format = simpleDateFormat.format(valueOf);
        String format2 = DateFormat.getTimeInstance(3, C1Q2.A02()).format(valueOf);
        C14360o3.A07(format2);
        String lowerCase = format2.toLowerCase(C1Q2.A02());
        C14360o3.A07(lowerCase);
        String string = context.getString(2131957527, format, lowerCase);
        C14360o3.A07(string);
        return string;
    }

    public static final String A07(Context context, long j) {
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return A0E(resources, EnumC89613z1.A06, C05F.A00, j, false, false);
    }

    public static final String A0C(Resources resources, EnumC89613z1 enumC89613z1, int i) {
        int i2;
        switch (enumC89613z1.ordinal()) {
            case 0:
                i2 = R.plurals.x_seconds_ago;
                break;
            case 1:
                i2 = R.plurals.x_minutes_ago;
                break;
            case 2:
                i2 = R.plurals.x_hours_ago;
                break;
            case 3:
                i2 = R.plurals.x_days_ago;
                break;
            case 4:
                i2 = R.plurals.x_weeks_ago;
                break;
            case 5:
                i2 = R.plurals.x_months_ago;
                break;
            default:
                i2 = R.plurals.x_years_ago;
                break;
        }
        String quantityString = resources.getQuantityString(i2, i, Integer.valueOf(i));
        C14360o3.A07(quantityString);
        return quantityString;
    }

    public static final String A0E(Resources resources, EnumC89613z1 enumC89613z1, Integer num, double d, boolean z, boolean z2) {
        return A0D(resources, enumC89613z1, num, d, System.currentTimeMillis() / 1000, false, z, false, false, z2);
    }
}
