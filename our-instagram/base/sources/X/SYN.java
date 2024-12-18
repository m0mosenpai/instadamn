package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class SYN {
    public int A00;
    public int A01;

    public static String A01(SYN syn) {
        LocalTime of;
        if (syn == null) {
            return null;
        }
        Configuration configuration = Resources.getSystem().getConfiguration();
        DateTimeFormatter ofLocalizedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        Locale locale = ((C53092bq) AbstractC61637Rr1.A00(configuration).A00).A00.get(0);
        if (locale == null || ofLocalizedTime == null || (of = LocalTime.of(syn.A00, syn.A01)) == null) {
            return null;
        }
        return of.format(ofLocalizedTime.withLocale(locale));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.SYN] */
    public static SYN A00(String str) {
        String[] split = str.split(":");
        if (split.length >= 2) {
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                if (parseInt >= 0 && parseInt <= 23 && parseInt2 >= 0 && parseInt2 <= 59) {
                    ?? obj = new Object();
                    obj.A00 = parseInt;
                    obj.A01 = parseInt2;
                    return obj;
                }
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AnonymousClass001.A0g(String.format(locale, "%02d", AbstractC25228BEl.A1Y(this.A00)), ":", String.format(locale, "%02d", AbstractC25228BEl.A1Y(this.A01)));
    }
}
