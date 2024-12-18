package X;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.8lM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC195798lM {
    public static final SimpleDateFormat A04 = new SimpleDateFormat("EE, MMM d");
    public static final SimpleDateFormat A01 = new SimpleDateFormat("EE MMM d");
    public static final SimpleDateFormat A00 = new SimpleDateFormat("MMM d");
    public static final SimpleDateFormat A05 = new SimpleDateFormat("EE, MMM d yyyy");
    public static final SimpleDateFormat A03 = new SimpleDateFormat("EE MMM d yyyy");
    public static final SimpleDateFormat A02 = new SimpleDateFormat("MMM d yyyy");

    public static final String A00(String str, String str2, Calendar calendar, Date date) {
        Calendar calendar2;
        SimpleDateFormat simpleDateFormat;
        Date A012 = A01(calendar, new Date());
        if (calendar == null) {
            calendar2 = Calendar.getInstance();
        } else {
            calendar2 = calendar;
        }
        calendar2.clear();
        calendar2.setTime(A012);
        int i = calendar2.get(1);
        int i2 = calendar2.get(2);
        int i3 = calendar2.get(5);
        Date A013 = A01(calendar, date);
        calendar2.setTime(A013);
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(2);
        int i6 = calendar2.get(5);
        if (i3 == i6 && i2 == i5 && i == i4) {
            return str;
        }
        if (i6 == i3 - 1 && i5 == i2 && i4 == i) {
            return str2;
        }
        if (A012.getTime() - A013.getTime() <= 31536000000L) {
            simpleDateFormat = A00;
        } else {
            simpleDateFormat = A02;
        }
        String format = simpleDateFormat.format(A013);
        C14360o3.A0A(format);
        return format;
    }

    public static final Date A01(Calendar calendar, Date date) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        calendar.clear();
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.clear();
        calendar.set(i, i2, i3);
        Date time = calendar.getTime();
        C14360o3.A07(time);
        return time;
    }
}
