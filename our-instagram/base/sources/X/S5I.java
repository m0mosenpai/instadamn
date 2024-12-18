package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public abstract class S5I {
    public static final long A00(String str, boolean z) {
        String str2;
        String str3;
        if (str != null) {
            if (z) {
                str2 = "yyyy:MM:dd kk:mm:ss";
            } else {
                str2 = "yyyyMMdd'T'HHmmss.SSS'Z'";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
            if (!z) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            }
            try {
                Date parse = simpleDateFormat.parse(str);
                if (parse != null) {
                    return parse.getTime();
                }
                return -1L;
            } catch (ParseException e) {
                if (z) {
                    str3 = "ExifTimestampUtil_Photo";
                } else {
                    str3 = "ExifTimestampUtil_Video";
                }
                C0w9.A03(str3, AbstractC167017dG.A0n(e, "Could not parse date time ", AbstractC166987dD.A1C()));
                return -1L;
            }
        }
        return -1L;
    }
}
