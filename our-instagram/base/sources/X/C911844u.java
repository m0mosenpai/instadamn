package X;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.44u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C911844u extends DateFormat {
    public static final C911844u A06;
    public static final DateFormat A07;
    public static final Calendar A08;
    public static final Locale A09;
    public static final TimeZone A0A;
    public static final Pattern A0B;
    public static final Pattern A0C = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final String[] A0D;
    public Boolean A00;
    public boolean A01;
    public final Locale A02;
    public transient DateFormat A03;
    public transient Calendar A04;
    public transient TimeZone A05;

    @Override // java.text.DateFormat
    public final boolean equals(Object obj) {
        return obj == this;
    }

    static {
        try {
            A0B = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            A0D = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            A0A = timeZone;
            Locale locale = Locale.US;
            A09 = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            A07 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            A06 = new C911844u();
            A08 = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static void A01(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01ef, code lost:
    
        r1 = r22.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01f1, code lost:
    
        if (r1 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01f3, code lost:
    
        r1 = X.C911844u.A07;
        r6 = r22.A05;
        r5 = r22.A02;
        r4 = r22.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0203, code lost:
    
        if (r5.equals(X.C911844u.A09) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0205, code lost:
    
        r1 = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x020a, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x020c, code lost:
    
        r6 = X.C911844u.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x020e, code lost:
    
        r1.setTimeZone(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0211, code lost:
    
        if (r4 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0213, code lost:
    
        r1.setLenient(r4.booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x021a, code lost:
    
        r22.A03 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0221, code lost:
    
        r1 = (java.text.DateFormat) r1.clone();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0227, code lost:
    
        if (r6 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0220, code lost:
    
        return r1.parse(r23, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024a, code lost:
    
        if (r1 < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024c, code lost:
    
        if (r4 != false) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date A02(java.lang.String r23, java.text.ParsePosition r24) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C911844u.A02(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    @Override // java.text.DateFormat, java.text.Format
    public final /* bridge */ /* synthetic */ Object clone() {
        TimeZone timeZone = this.A05;
        return new C911844u(this.A00, this.A02, timeZone, this.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    @Override // java.text.DateFormat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.StringBuffer format(java.util.Date r8, java.lang.StringBuffer r9, java.text.FieldPosition r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C911844u.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition):java.lang.StringBuffer");
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.A05;
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        Boolean bool = this.A00;
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this.A05)) {
            this.A03 = null;
            this.A05 = timeZone;
        }
    }

    public C911844u(Boolean bool, Locale locale, TimeZone timeZone, boolean z) {
        this.A05 = timeZone;
        this.A02 = locale;
        this.A00 = bool;
        this.A01 = z;
    }

    public static int A00(String str, int i) {
        return ((str.charAt(i) - '0') * 10) + (str.charAt(i + 1) - '0');
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date A02 = A02(trim, parsePosition);
        if (A02 != null) {
            return A02;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : A0D) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", trim, sb.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Boolean bool = this.A00;
        if (valueOf != bool) {
            if (valueOf != null && valueOf.equals(bool)) {
                return;
            }
            this.A00 = valueOf;
            this.A03 = null;
        }
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.A05, this.A02, this.A00);
    }

    public C911844u() {
        this.A01 = true;
        this.A02 = A09;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return A02(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
