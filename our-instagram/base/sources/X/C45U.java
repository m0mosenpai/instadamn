package X;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.45U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45U implements Serializable {
    public static final C45U A07 = new C45U();
    public final C45V A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final Locale A04;
    public final C45W A05;
    public transient TimeZone A06;

    public final C45U A00(C45U c45u) {
        TimeZone timeZone;
        C45U c45u2 = A07;
        if (c45u != c45u2 && c45u != this) {
            if (this == c45u2) {
                return c45u;
            }
            String str = c45u.A02;
            if (str.isEmpty()) {
                str = this.A02;
            }
            C45V c45v = c45u.A00;
            if (c45v == C45V.ANY) {
                c45v = this.A00;
            }
            Locale locale = c45u.A04;
            if (locale == null) {
                locale = this.A04;
            }
            C45W c45w = this.A05;
            C45W c45w2 = c45u.A05;
            int i = c45w2.A00;
            int i2 = c45w2.A01;
            if (i != 0 || i2 != 0) {
                int i3 = c45w.A01;
                if (i3 != 0 || c45w.A00 != 0) {
                    int i4 = ((i ^ (-1)) & i3) | i2;
                    int i5 = c45w.A00;
                    int i6 = i | ((i2 ^ (-1)) & i5);
                    if (i4 != i3 || i6 != i5) {
                        c45w2 = new C45W(i4, i6);
                    }
                }
                c45w = c45w2;
            }
            Boolean bool = c45u.A01;
            if (bool == null) {
                bool = this.A01;
            }
            String str2 = c45u.A03;
            if (str2 != null && !str2.isEmpty()) {
                timeZone = c45u.A06;
            } else {
                str2 = this.A03;
                timeZone = this.A06;
            }
            return new C45U(c45w, c45v, bool, str, str2, locale, timeZone);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C45U c45u = (C45U) obj;
                if (this.A00 == c45u.A00 && this.A05.equals(c45u.A05)) {
                    Boolean bool = this.A01;
                    Boolean bool2 = c45u.A01;
                    if (bool == null) {
                        if (bool2 != null) {
                            return false;
                        }
                    } else if (bool2 == null || !bool.equals(bool2)) {
                        return false;
                    }
                    String str = this.A03;
                    String str2 = c45u.A03;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (str2 == null || !str.equals(str2)) {
                        return false;
                    }
                    if (this.A02.equals(c45u.A02)) {
                        TimeZone timeZone = this.A06;
                        TimeZone timeZone2 = c45u.A06;
                        if (timeZone == null) {
                            if (timeZone2 != null) {
                                return false;
                            }
                        } else if (timeZone2 == null || !timeZone.equals(timeZone2)) {
                            return false;
                        }
                        Locale locale = this.A04;
                        Locale locale2 = c45u.A04;
                        if (locale != null) {
                            return locale2 != null && locale.equals(locale2);
                        }
                        if (locale2 != null) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean A01(EnumC61060ReZ enumC61060ReZ) {
        C45W c45w = this.A05;
        int ordinal = 1 << enumC61060ReZ.ordinal();
        if ((c45w.A00 & ordinal) != 0) {
            return Boolean.FALSE;
        }
        if ((ordinal & c45w.A01) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final TimeZone A02() {
        TimeZone timeZone = this.A06;
        if (timeZone == null) {
            String str = this.A03;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.A06 = timeZone2;
            return timeZone2;
        }
        return timeZone;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A03;
        if (str == null) {
            hashCode = 1;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (hashCode ^ this.A02.hashCode()) + this.A00.hashCode();
        Boolean bool = this.A01;
        if (bool != null) {
            hashCode2 ^= bool.hashCode();
        }
        Locale locale = this.A04;
        if (locale != null) {
            hashCode2 += locale.hashCode();
        }
        return hashCode2 ^ this.A05.hashCode();
    }

    public final String toString() {
        return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.A02, this.A00, this.A01, this.A04, this.A03, this.A05);
    }

    public C45U(C45W c45w, C45V c45v, Boolean bool, String str, String str2, Locale locale, TimeZone timeZone) {
        this.A02 = str == null ? "" : str;
        this.A00 = c45v == null ? C45V.ANY : c45v;
        this.A04 = locale;
        this.A06 = timeZone;
        this.A03 = str2;
        this.A05 = c45w;
        this.A01 = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45U() {
        /*
            r8 = this;
            X.45V r2 = X.C45V.ANY
            X.45W r1 = X.C45W.A02
            java.lang.String r4 = ""
            r3 = 0
            int r0 = r4.length()
            if (r0 == 0) goto L19
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r4)
            r5 = r4
        L13:
            r0 = r8
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L19:
            r6 = r3
            r5 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45U.<init>():void");
    }
}
