package X;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.0I9, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0I9 {
    public static C0I8 A00;
    public static final Pattern A01 = Pattern.compile("^[0-9]+L$");

    public static C0I8 A00(C0IE c0ie, String str) {
        long j;
        String A002 = c0ie.A00("com.facebook.versioncontrol.revision", str);
        if (A002 == null) {
            A002 = "";
        }
        c0ie.A00("com.facebook.versioncontrol.branch", str);
        String A003 = c0ie.A00("com.facebook.build_time", str);
        if (A003 == null) {
            A003 = "";
        }
        if (A01.matcher(A003).matches()) {
            j = Long.parseLong(A003.substring(0, A003.length() - 1));
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 0, Locale.US);
            dateTimeInstance.setTimeZone(TimeZone.getTimeZone("PST8PDT"));
            dateTimeInstance.format(new Date(j));
        } else {
            j = 0;
        }
        return new C0I8(j, A002);
    }
}
