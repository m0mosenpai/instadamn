package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C45T;
import X.C914045z;
import X.MSY;
import X.RB6;
import com.instagram.react.modules.base.IgReactQEModule;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class FromStringDeserializer extends StdScalarDeserializer {

    /* loaded from: classes10.dex */
    public class Std extends FromStringDeserializer {
        public final int A00;

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0K(AnonymousClass469 anonymousClass469) {
            int i = this.A00;
            if (i != 3) {
                if (i != 8) {
                    return BXX(anonymousClass469);
                }
                return Locale.ROOT;
            }
            return URI.create("");
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object A0z(AnonymousClass469 anonymousClass469, String str) {
            int indexOf;
            int parseInt;
            switch (this.A00) {
                case 1:
                    return AbstractC166987dD.A11(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return ((C45T) anonymousClass469.A02).A01.A07.A0D(str);
                    } catch (Exception e) {
                        e = e;
                        Class cls = super.A00;
                        Iterator it = C914045z.A00;
                        while (e.getCause() != null) {
                            e = e.getCause();
                        }
                        anonymousClass469.A0f(cls, e);
                        throw C00O.createAndThrow();
                    }
                case 5:
                    return anonymousClass469.A05().A08(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int length = str.length();
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            char charAt = str.charAt(i);
                            if (charAt != '_' && charAt != '-') {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, i);
                    String A0g = AbstractC58318PtA.A0g(i, str);
                    int length2 = A0g.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            char charAt2 = A0g.charAt(i2);
                            if (charAt2 != '_' && charAt2 != '-') {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    if (i2 < 0) {
                        return new Locale(substring, A0g);
                    }
                    String substring2 = A0g.substring(0, i2);
                    int indexOf2 = A0g.indexOf("_#");
                    if (indexOf2 < 0) {
                        return new Locale(substring, substring2, AbstractC58318PtA.A0g(i2, A0g));
                    }
                    String str2 = "";
                    if (indexOf2 > 0 && indexOf2 > i2) {
                        try {
                            str2 = A0g.substring(i2 + 1, indexOf2);
                        } catch (IllformedLocaleException unused) {
                            return new Locale(substring, substring2, "");
                        }
                    }
                    String substring3 = A0g.substring(indexOf2 + 2);
                    int indexOf3 = substring3.indexOf(95);
                    if (indexOf3 < 0 && substring3.indexOf(45) < 0) {
                        return new Locale.Builder().setLanguage(substring).setRegion(substring2).setVariant(str2).setScript(substring3).build();
                    }
                    if (indexOf3 < 0) {
                        return new Locale.Builder().setLanguage(substring).setRegion(substring2).setVariant(str2).setExtension(substring3.charAt(0), AbstractC58318PtA.A0g(substring3.indexOf(45), substring3)).build();
                    }
                    return new Locale.Builder().setLanguage(substring).setRegion(substring2).setVariant(str2).setScript(substring3.substring(0, indexOf3)).setExtension(substring3.charAt(indexOf3 + 1), substring3.substring(indexOf3 + 3)).build();
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf4 = str.indexOf(58, lastIndexOf);
                            if (indexOf4 > -1) {
                                parseInt = Integer.parseInt(AbstractC58318PtA.A0g(indexOf4, str));
                            } else {
                                parseInt = 0;
                            }
                            indexOf = lastIndexOf + 1;
                        } else {
                            throw new RB6(anonymousClass469.A07, str, "Bracketed IPv6 address must contain closing bracket");
                        }
                    } else {
                        indexOf = str.indexOf(58);
                        if (indexOf >= 0) {
                            int i3 = indexOf + 1;
                            if (str.indexOf(58, i3) < 0) {
                                parseInt = Integer.parseInt(str.substring(i3));
                            }
                        }
                        return new InetSocketAddress(str, 0);
                    }
                    return new InetSocketAddress(str.substring(0, indexOf), parseInt);
                default:
                    throw AbstractC166987dD.A18("Internal error: this code path should never get executed");
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final boolean A10() {
            return MSY.A1S(this.A00, 7);
        }

        public Std(Class cls, int i) {
            super(cls);
            this.A00 = i;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object A0x(AnonymousClass469 anonymousClass469) {
            return A0K(anonymousClass469);
        }
    }

    /* loaded from: classes10.dex */
    public class StringBufferDeserializer extends FromStringDeserializer {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Integer A0I() {
            return C05F.A1I;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0K(AnonymousClass469 anonymousClass469) {
            return new StringBuffer();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object A0z(AnonymousClass469 anonymousClass469, String str) {
            return new StringBuffer(str);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            String A1Q = c16l.A1Q();
            if (A1Q != null) {
                return new StringBuffer(A1Q);
            }
            return super.A0D(c16l, anonymousClass469);
        }
    }

    /* loaded from: classes10.dex */
    public class StringBuilderDeserializer extends FromStringDeserializer {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Integer A0I() {
            return C05F.A1I;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            String A1Q = c16l.A1Q();
            if (A1Q != null) {
                return AbstractC58318PtA.A0s(A1Q);
            }
            return super.A0D(c16l, anonymousClass469);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0K(AnonymousClass469 anonymousClass469) {
            return AbstractC166987dD.A1C();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object A0z(AnonymousClass469 anonymousClass469, String str) {
            return AbstractC58318PtA.A0s(str);
        }
    }

    public boolean A10() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        String A1Q = c16l.A1Q();
        if (A1Q == null) {
            C16R A10 = c16l.A10();
            if (A10 != C16R.A0D) {
                if (A10 == C16R.A0C) {
                    return A0g(c16l, anonymousClass469);
                }
                if (A10 == C16R.A0E) {
                    Object A0V = c16l.A0V();
                    if (A0V == null) {
                        return null;
                    }
                    if (this.A00.isAssignableFrom(A0V.getClass())) {
                        return A0V;
                    }
                    return A0y(anonymousClass469, A0V);
                }
            }
            anonymousClass469.A0T(c16l, this.A00);
        } else {
            if (!A1Q.isEmpty()) {
                if (A10()) {
                    String trim = A1Q.trim();
                    if (trim == A1Q || !trim.isEmpty()) {
                        A1Q = trim;
                    }
                }
                try {
                    return A0z(anonymousClass469, A1Q);
                } catch (IllegalArgumentException | MalformedURLException e) {
                    String str = "not a valid textual representation";
                    String message = e.getMessage();
                    if (message != null) {
                        str = AnonymousClass001.A0g("not a valid textual representation", ", problem: ", message);
                    }
                    RB6 A0J = anonymousClass469.A0J(this.A00, A1Q, str);
                    A0J.initCause(e);
                    throw A0J;
                }
            }
            Integer A0N = anonymousClass469.A0N(A0I(), C05F.A1I);
            if (A0N == C05F.A00) {
                anonymousClass469.A0h("Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", A0j());
            } else {
                if (A0N == C05F.A0C) {
                    return BXX(anonymousClass469);
                }
                if (A0N == C05F.A0N) {
                    return A0K(anonymousClass469);
                }
                return A0x(anonymousClass469);
            }
        }
        throw C00O.createAndThrow();
    }

    public Object A0x(AnonymousClass469 anonymousClass469) {
        return BXX(anonymousClass469);
    }

    public Object A0y(AnonymousClass469 anonymousClass469, Object obj) {
        anonymousClass469.A0h("Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.A00.getName());
        throw C00O.createAndThrow();
    }

    public Object A0z(AnonymousClass469 anonymousClass469, String str) {
        return AbstractC08820cl.A03(str);
    }
}
