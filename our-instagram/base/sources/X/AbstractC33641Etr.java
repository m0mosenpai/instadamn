package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.Etr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33641Etr {
    public static final String A00(Locale locale, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(AbstractC111324zv.A00(655), locale);
        Date parse = simpleDateFormat.parse(str);
        if (parse != null) {
            String format = simpleDateFormat2.format(parse);
            C14360o3.A07(format);
            return format;
        }
        throw AbstractC166997dE.A0g();
    }
}
