package X;

import android.content.Context;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.FRg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34719FRg {
    public final Context A00;
    public final Locale A0J;
    public final ThreadLocal A06 = new ThreadLocal();
    public final ThreadLocal A0F = new ThreadLocal();
    public final ThreadLocal A01 = new ThreadLocal();
    public final ThreadLocal A02 = new ThreadLocal();
    public final ThreadLocal A07 = new ThreadLocal();
    public final ThreadLocal A0D = new ThreadLocal();
    public final ThreadLocal A0I = new ThreadLocal();
    public final ThreadLocal A08 = new ThreadLocal();
    public final ThreadLocal A03 = new ThreadLocal();
    public final ThreadLocal A0A = new ThreadLocal();
    public final ThreadLocal A04 = new ThreadLocal();
    public final ThreadLocal A0G = new ThreadLocal();
    public final ThreadLocal A0E = new ThreadLocal();
    public final ThreadLocal A0H = new ThreadLocal();
    public final ThreadLocal A09 = new ThreadLocal();
    public final ThreadLocal A0B = new ThreadLocal();
    public final ThreadLocal A05 = new ThreadLocal();
    public final ThreadLocal A0C = new ThreadLocal();

    public final DateFormat A00() {
        ThreadLocal threadLocal = this.A01;
        DateFormat dateFormat = (DateFormat) threadLocal.get();
        if (dateFormat == null) {
            dateFormat = DateFormat.getDateInstance(2, this.A0J);
            threadLocal.set(dateFormat);
        }
        C14360o3.A0A(dateFormat);
        return dateFormat;
    }

    public final DateFormat A01() {
        String str;
        ThreadLocal threadLocal = this.A06;
        DateFormat dateFormat = (DateFormat) threadLocal.get();
        if (dateFormat == null) {
            Context context = this.A00;
            if (context != null) {
                if (android.text.format.DateFormat.is24HourFormat(context)) {
                    str = "Hm";
                } else {
                    str = "hm";
                }
                Locale locale = this.A0J;
                dateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, str), locale);
            } else {
                dateFormat = DateFormat.getTimeInstance(3, this.A0J);
            }
            threadLocal.set(dateFormat);
        }
        C14360o3.A0A(dateFormat);
        return dateFormat;
    }

    public final SimpleDateFormat A02() {
        ThreadLocal threadLocal = this.A09;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            Object clone = A00().clone();
            C14360o3.A0C(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
            SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) clone;
            simpleDateFormat2.applyPattern(android.text.format.DateFormat.getBestDateTimePattern(this.A0J, "MMM d h:mm a"));
            threadLocal.set(simpleDateFormat2);
            return simpleDateFormat2;
        }
        return simpleDateFormat;
    }

    public final SimpleDateFormat A03() {
        ThreadLocal threadLocal = this.A0A;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
        if (simpleDateFormat == null) {
            Object clone = A00().clone();
            C14360o3.A0C(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
            SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) clone;
            simpleDateFormat2.applyPattern(android.text.format.DateFormat.getBestDateTimePattern(this.A0J, "MMMd, yyyy"));
            threadLocal.set(simpleDateFormat2);
            return simpleDateFormat2;
        }
        return simpleDateFormat;
    }

    public C34719FRg(Context context, Locale locale) {
        this.A0J = locale;
        this.A00 = context;
    }
}
