package X;

import android.content.Context;
import android.content.res.Resources;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.7Px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162607Px {
    public static Boolean A00;
    public static final DateFormat A04 = new SimpleDateFormat("h:mm a", C1Q2.A02());
    public static final DateFormat A03 = new SimpleDateFormat("HH:mm", C1Q2.A02());
    public static final DateFormat A02 = new SimpleDateFormat("EEE h:mm a", C1Q2.A02());
    public static final DateFormat A01 = new SimpleDateFormat("EEE HH:mm", C1Q2.A02());
    public static final InterfaceC09390do A08 = AbstractC09440dt.A01(C162617Py.A00);
    public static final InterfaceC09390do A07 = AbstractC09440dt.A01(C162627Pz.A00);
    public static final InterfaceC09390do A09 = AbstractC09440dt.A01(C7Q0.A00);
    public static final Calendar A06 = Calendar.getInstance();
    public static final Calendar A05 = Calendar.getInstance();

    public static final String A00(Context context, long j) {
        boolean is24HourFormat;
        DateFormat dateFormat;
        StringBuilder sb;
        Resources resources;
        int i;
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(C13920nI.A00, 1);
        long j2 = j / 1000;
        Calendar calendar = A06;
        calendar.setTimeInMillis(System.currentTimeMillis());
        Calendar calendar2 = A05;
        calendar2.setTimeInMillis(j2);
        int i2 = calendar.get(2);
        int i3 = calendar2.get(2);
        int i4 = calendar.get(1) - calendar2.get(1);
        if (((Boolean) AbstractC15930qn.A02.A09.invoke()).booleanValue()) {
            is24HourFormat = true;
        } else if (((Boolean) AbstractC15930qn.A02.A07.invoke()).booleanValue()) {
            Boolean bool = A00;
            if (bool == null) {
                bool = Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context));
                A00 = bool;
            }
            is24HourFormat = C14360o3.A0K(bool, true);
        } else {
            is24HourFormat = android.text.format.DateFormat.is24HourFormat(context);
        }
        String str = "";
        if (calendar.get(1) != calendar2.get(1)) {
            if (i4 != 1 || i3 <= i2) {
                interfaceC09390do = A09;
                dateFormat = (DateFormat) interfaceC09390do.getValue();
                return AnonymousClass001.A0R(str, dateFormat.format(new Date(j2)));
            }
        } else {
            int abs = Math.abs(calendar.get(6) - calendar2.get(6));
            if (abs == 0) {
                sb = new StringBuilder();
                resources = context.getResources();
                i = 2131960739;
            } else if (abs == 1) {
                sb = new StringBuilder();
                resources = context.getResources();
                i = 2131960740;
            } else if (abs < 6) {
                if (is24HourFormat) {
                    dateFormat = A01;
                } else {
                    dateFormat = A02;
                }
                return AnonymousClass001.A0R(str, dateFormat.format(new Date(j2)));
            }
            String string = resources.getString(i);
            C14360o3.A07(string);
            sb.append(string);
            sb.append(' ');
            str = sb.toString();
            if (is24HourFormat) {
                dateFormat = A03;
            } else {
                dateFormat = A04;
            }
            return AnonymousClass001.A0R(str, dateFormat.format(new Date(j2)));
        }
        if (is24HourFormat) {
            interfaceC09390do = A07;
        } else {
            interfaceC09390do = A08;
        }
        dateFormat = (DateFormat) interfaceC09390do.getValue();
        return AnonymousClass001.A0R(str, dateFormat.format(new Date(j2)));
    }

    public static final String A01(Context context, long j) {
        DateFormat dateFormat;
        if (android.text.format.DateFormat.is24HourFormat(context)) {
            dateFormat = A03;
        } else {
            dateFormat = A04;
        }
        String format = dateFormat.format(new Date(j / 1000));
        C14360o3.A07(format);
        return format;
    }
}
