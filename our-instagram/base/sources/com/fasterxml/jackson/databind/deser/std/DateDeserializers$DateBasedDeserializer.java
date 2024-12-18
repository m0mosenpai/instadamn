package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166997dE;
import X.AbstractC58318PtA;
import X.AnonymousClass451;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C45T;
import X.C45U;
import X.C911844u;
import X.C912845h;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public abstract class DateDeserializers$DateBasedDeserializer extends StdScalarDeserializer implements InterfaceC102474jf {
    public final String A00;
    public final DateFormat A01;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A03;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final Date A0l(C16L c16l, AnonymousClass469 anonymousClass469) {
        Date parse;
        DateFormat dateFormat = this.A01;
        if (dateFormat != null && c16l.A19(C16R.A0J)) {
            String trim = c16l.A1P().trim();
            if (trim.isEmpty()) {
                if (A0e(anonymousClass469, trim).intValue() != 3) {
                    return null;
                }
                return new Date(0L);
            }
            synchronized (dateFormat) {
                try {
                    parse = dateFormat.parse(trim);
                } catch (ParseException unused) {
                    anonymousClass469.A0e(A0H(), trim, "expected format \"%s\"", this.A00);
                    throw C00O.createAndThrow();
                }
            }
            return parse;
        }
        return super.A0l(c16l, anonymousClass469);
    }

    public DateDeserializers$DateBasedDeserializer(Class cls) {
        super(cls);
        this.A01 = null;
        this.A00 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.44u] */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.44u] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.text.SimpleDateFormat, java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.text.DateFormat] */
    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        C45U c45u;
        ?? r3;
        String str;
        Boolean bool;
        Class A0H = A0H();
        C912845h c912845h = anonymousClass469.A02;
        if (interfaceC65620ToB != null) {
            c45u = interfaceC65620ToB.AVZ(c912845h, A0H);
        } else {
            c45u = C45U.A07;
        }
        TimeZone A02 = c45u.A02();
        Boolean bool2 = c45u.A01;
        String str2 = c45u.A02;
        if (str2.length() > 0) {
            Locale locale = c45u.A04;
            if (locale == null) {
                locale = ((C45T) c912845h).A01.A09;
            }
            r3 = new SimpleDateFormat(str2, locale);
            if (A02 == null && (A02 = ((C45T) c912845h).A01.A0A) == null) {
                A02 = AnonymousClass451.A0B;
            }
            r3.setTimeZone(A02);
            if (bool2 != null) {
                r3.setLenient(bool2.booleanValue());
            }
        } else if (A02 != null) {
            AnonymousClass451 anonymousClass451 = ((C45T) c912845h).A01;
            DateFormat dateFormat = anonymousClass451.A08;
            if (dateFormat.getClass() == C911844u.class) {
                Locale locale2 = c45u.A04;
                if (locale2 == null) {
                    locale2 = anonymousClass451.A09;
                }
                C911844u c911844u = (C911844u) dateFormat;
                TimeZone timeZone = c911844u.A05;
                C911844u c911844u2 = c911844u;
                if (A02 != timeZone) {
                    c911844u2 = c911844u;
                    if (!A02.equals(timeZone)) {
                        c911844u2 = new C911844u(c911844u.A00, c911844u.A02, A02, c911844u.A01);
                    }
                }
                boolean equals = locale2.equals(c911844u2.A02);
                r3 = c911844u2;
                if (!equals) {
                    r3 = new C911844u(c911844u2.A00, locale2, c911844u2.A05, c911844u2.A01);
                }
                if (bool2 != null && bool2 != (bool = r3.A00) && !bool2.equals(bool)) {
                    r3 = new C911844u(bool2, r3.A02, r3.A05, r3.A01);
                }
            } else {
                r3 = (DateFormat) dateFormat.clone();
                r3.setTimeZone(A02);
                if (bool2 != null) {
                    r3.setLenient(bool2.booleanValue());
                }
            }
            str2 = this.A00;
        } else if (bool2 != null) {
            DateFormat dateFormat2 = ((C45T) c912845h).A01.A08;
            str2 = this.A00;
            if (dateFormat2.getClass() == C911844u.class) {
                C911844u c911844u3 = (C911844u) dateFormat2;
                Boolean bool3 = c911844u3.A00;
                C911844u c911844u4 = c911844u3;
                if (bool2 != bool3) {
                    c911844u4 = c911844u3;
                    if (!bool2.equals(bool3)) {
                        c911844u4 = new C911844u(bool2, c911844u3.A02, c911844u3.A05, c911844u3.A01);
                    }
                }
                StringBuilder A0q = AbstractC58318PtA.A0q(100);
                A0q.append("[one of: '");
                A0q.append("yyyy-MM-dd'T'HH:mm:ss.SSSX");
                A0q.append("', '");
                A0q.append("EEE, dd MMM yyyy HH:mm:ss zzz");
                A0q.append("' (");
                if (Boolean.FALSE.equals(c911844u4.A00)) {
                    str = "strict";
                } else {
                    str = "lenient";
                }
                A0q.append(str);
                str2 = AbstractC166997dE.A0x(")]", A0q);
                r3 = c911844u4;
            } else {
                DateFormat dateFormat3 = (DateFormat) dateFormat2.clone();
                dateFormat3.setLenient(bool2.booleanValue());
                boolean z = dateFormat3 instanceof SimpleDateFormat;
                r3 = dateFormat3;
                if (z) {
                    ((SimpleDateFormat) dateFormat3).toPattern();
                    r3 = dateFormat3;
                }
            }
            if (str2 == null) {
                str2 = "[unknown]";
            }
        } else {
            return this;
        }
        if (this instanceof DateDeserializers$TimestampDeserializer) {
            return new DateDeserializers$DateBasedDeserializer(this, str2, r3);
        }
        if (this instanceof DateDeserializers$SqlDateDeserializer) {
            return new DateDeserializers$DateBasedDeserializer(this, str2, r3);
        }
        if (this instanceof DateDeserializers$DateDeserializer) {
            return new DateDeserializers$DateBasedDeserializer(this, str2, r3);
        }
        return new DateDeserializers$CalendarDeserializer((DateDeserializers$CalendarDeserializer) this, str2, r3);
    }

    public DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer dateDeserializers$DateBasedDeserializer, String str, DateFormat dateFormat) {
        super(((StdDeserializer) dateDeserializers$DateBasedDeserializer).A00);
        this.A01 = dateFormat;
        this.A00 = str;
    }
}
