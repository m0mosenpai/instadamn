package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58317Pt9;
import X.AbstractC63035SbA;
import X.AbstractC64180T2m;
import X.AbstractC910944l;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16M;
import X.C16R;
import X.C16Y;
import X.C44V;
import X.C44W;
import X.C45K;
import X.C45S;
import X.C45T;
import X.C45Y;
import X.C64173T2c;
import X.C64174T2d;
import X.C64175T2e;
import X.C913945y;
import X.C914045z;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC65620ToB;
import X.RB6;
import X.RBL;
import X.TmN;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class StdDeserializer extends JsonDeserializer implements Serializable {
    public static final int A02 = EnumC912945i.A0P.A00 | EnumC912945i.A0R.A00;
    public final Class A00;
    public final AbstractC910944l A01;

    public static final boolean A08(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'f') {
            return "false".equals(str);
        }
        if (charAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public static final boolean A09(String str) {
        char charAt = str.charAt(0);
        if (charAt == 't') {
            return "true".equals(str);
        }
        if (charAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    public final int A0R(AnonymousClass469 anonymousClass469, String str) {
        try {
            if (str.length() > 9) {
                long A04 = C16Y.A04(str);
                if (A04 >= -2147483648L && A04 <= 2147483647L) {
                    return (int) A04;
                }
                anonymousClass469.A0e(Integer.TYPE, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
                throw C00O.createAndThrow();
            }
            return C16Y.A02(str);
        } catch (IllegalArgumentException unused) {
            anonymousClass469.A0e(Integer.TYPE, str, "not a valid `int` value", new Object[0]);
            throw C00O.createAndThrow();
        }
    }

    public AbstractC63035SbA A0W() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r1 != 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date A0l(X.C16L r12, X.AnonymousClass469 r13) {
        /*
            r11 = this;
            r6 = r12
            int r1 = r12.A0x()
            r0 = 1
            r5 = r13
            if (r1 == r0) goto L40
            r4 = 3
            if (r1 == r4) goto L46
            r0 = 11
            if (r1 == r0) goto L8e
            r0 = 6
            if (r1 == r0) goto L33
            r0 = 7
            if (r1 != r0) goto L40
            long r1 = r12.A0j()     // Catch: X.AbstractC90183zz -> L20
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            return r0
        L20:
            java.lang.Class r3 = r11.A00
            java.lang.Number r2 = r12.A0p()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "not a valid 64-bit `long` for creating `java.util.Date`"
            r13.A0c(r3, r2, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L33:
            java.lang.String r0 = r12.A1P()
            java.lang.String r0 = r0.trim()
            java.util.Date r0 = r11.A0m(r13, r0)
            return r0
        L40:
            java.lang.Class r0 = r11.A00
            r13.A0T(r12, r0)
            goto L7f
        L46:
            java.lang.Integer r1 = r11.A0I()
            java.lang.Integer r0 = X.C05F.A15
            java.lang.Integer r3 = r13.A0N(r1, r0)
            X.45i r0 = X.EnumC912945i.A0N
            boolean r2 = r13.A0j(r0)
            if (r2 != 0) goto L5c
            java.lang.Integer r0 = X.C05F.A00
            if (r3 == r0) goto L70
        L5c:
            X.16R r1 = r12.A1J()
            X.16R r0 = X.C16R.A08
            if (r1 != r0) goto L84
            int r1 = r3.intValue()
            if (r1 == r4) goto L93
            r0 = 2
            if (r1 == r0) goto L8e
            r0 = 1
            if (r1 == r0) goto L8e
        L70:
            java.lang.Class r1 = r11.A00
            X.16R r7 = X.C16R.A0C
            r9 = 0
            r0 = 0
            java.lang.Object[] r10 = new java.lang.Object[r0]
            X.44l r8 = r13.A0A(r1)
            r5.A0Q(r6, r7, r8, r9, r10)
        L7f:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L84:
            if (r2 == 0) goto L70
            X.16R r0 = X.C16R.A0C
            if (r1 != r0) goto L9a
            r11.A0p(r12, r13)
            goto L7f
        L8e:
            java.lang.Object r0 = r11.BXX(r13)
            goto L97
        L93:
            java.lang.Object r0 = r11.A0K(r13)
        L97:
            java.util.Date r0 = (java.util.Date) r0
            return r0
        L9a:
            java.util.Date r0 = r11.A0l(r12, r13)
            r11.A0o(r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0l(X.16L, X.469):java.util.Date");
    }

    public final Date A0m(AnonymousClass469 anonymousClass469, String str) {
        try {
            if (str.isEmpty()) {
                if (A0e(anonymousClass469, str).intValue() != 3) {
                    return null;
                }
                return new Date(0L);
            }
            if ("null".equals(str)) {
                return null;
            }
            return anonymousClass469.A0P(str);
        } catch (IllegalArgumentException e) {
            anonymousClass469.A0e(this.A00, str, "not a valid representation (error: %s)", C914045z.A09(e));
            throw C00O.createAndThrow();
        }
    }

    public static final JsonDeserializer A05(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469, JsonDeserializer jsonDeserializer) {
        RBL BSA;
        JsonDeserialize jsonDeserialize;
        Class contentConverter;
        C44W A00 = anonymousClass469.A02.A00();
        if (A00 != null && interfaceC65620ToB != null && (BSA = interfaceC65620ToB.BSA()) != null && (A00 instanceof C44V) && (jsonDeserialize = (JsonDeserialize) BSA.A06(JsonDeserialize.class)) != null && (contentConverter = jsonDeserialize.contentConverter()) != null && !C914045z.A0I(contentConverter) && contentConverter != AbstractC64180T2m.class) {
            TmN A06 = anonymousClass469.A06(contentConverter);
            AbstractC910944l BI9 = A06.BI9(anonymousClass469.A05());
            if (jsonDeserializer == null) {
                jsonDeserializer = anonymousClass469.A0B(interfaceC65620ToB, BI9);
            }
            return new StdDelegatingDeserializer(BI9, jsonDeserializer, A06);
        }
        return jsonDeserializer;
    }

    public static final InterfaceC102444jN A06(C45K c45k, InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469, JsonDeserializer jsonDeserializer) {
        AbstractC910944l CBP;
        AbstractC910944l CBP2;
        C913945y B8w;
        Class<Object> A0H;
        if (c45k == C45K.FAIL) {
            if (interfaceC65620ToB == null) {
                if (jsonDeserializer == null) {
                    A0H = Object.class;
                } else {
                    A0H = jsonDeserializer.A0H();
                }
                CBP2 = anonymousClass469.A0A(A0H);
                B8w = null;
            } else {
                CBP2 = interfaceC65620ToB.CBP();
                B8w = interfaceC65620ToB.B8w();
            }
            return new C64174T2d(CBP2, B8w);
        }
        if (c45k == C45K.AS_EMPTY) {
            if (jsonDeserializer != null) {
                if (jsonDeserializer instanceof BeanDeserializerBase) {
                    BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) jsonDeserializer;
                    if (!beanDeserializerBase.A09.A0L()) {
                        if (interfaceC65620ToB == null) {
                            CBP = beanDeserializerBase.A08;
                        } else {
                            CBP = interfaceC65620ToB.CBP();
                        }
                        anonymousClass469.A08(CBP, String.format(AbstractC58317Pt9.A00(535), CBP));
                        throw C00O.createAndThrow();
                    }
                }
                if (jsonDeserializer.A0B() == C05F.A01) {
                    Object A0K = jsonDeserializer.A0K(anonymousClass469);
                    if (A0K == null) {
                        return C64175T2e.A01;
                    }
                    return new C64175T2e(A0K);
                }
                return new C64173T2c(jsonDeserializer);
            }
        } else if (c45k == C45K.SKIP) {
            return C64175T2e.A02;
        }
        return null;
    }

    public static final Object A07(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (anonymousClass469.A0j(EnumC912945i.A0P)) {
            return c16l.A0s();
        }
        if (anonymousClass469.A0j(EnumC912945i.A0R)) {
            return Long.valueOf(c16l.A0j());
        }
        return c16l.A0p();
    }

    public AbstractC910944l A0T() {
        return this.A01;
    }

    public final AbstractC910944l A0U(AnonymousClass469 anonymousClass469) {
        AbstractC910944l abstractC910944l = this.A01;
        if (abstractC910944l == null) {
            return anonymousClass469.A0A(this.A00);
        }
        return abstractC910944l;
    }

    public final InterfaceC102444jN A0V(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469, JsonDeserializer jsonDeserializer) {
        C45K c45k;
        AbstractC910944l A03;
        C913945y B8w;
        if (interfaceC65620ToB != null) {
            c45k = interfaceC65620ToB.BTQ().A00;
        } else {
            c45k = ((C45S) anonymousClass469.A02).A01.A01.A00;
        }
        if (c45k == C45K.SKIP) {
            return C64175T2e.A02;
        }
        if (c45k == C45K.FAIL) {
            if (interfaceC65620ToB == null) {
                A03 = anonymousClass469.A0A(jsonDeserializer.A0H());
                if (A03.A0N()) {
                    A03 = A03.A03();
                }
                B8w = null;
            } else {
                A03 = interfaceC65620ToB.CBP().A03();
                B8w = interfaceC65620ToB.B8w();
            }
            return new C64174T2d(A03, B8w);
        }
        InterfaceC102444jN A06 = A06(c45k, interfaceC65620ToB, anonymousClass469, jsonDeserializer);
        if (A06 != null) {
            return A06;
        }
        return jsonDeserializer;
    }

    public final Boolean A0X(C16L c16l, AnonymousClass469 anonymousClass469) {
        Integer A0N = anonymousClass469.A0N(C05F.A15, C05F.A0C);
        int intValue = A0N.intValue();
        boolean z = true;
        if (intValue != 3) {
            if (intValue != 2) {
                if (intValue != 0) {
                    if (c16l.A0n() == C05F.A00) {
                        if (c16l.A0i() == 0) {
                            z = false;
                        }
                    } else {
                        z = !"0".equals(c16l.A1P());
                    }
                    return Boolean.valueOf(z);
                }
                A0t(anonymousClass469, A0N, c16l.A0p(), AnonymousClass001.A0g(AbstractC58317Pt9.A00(574), c16l.A1P(), ")"));
            } else {
                return null;
            }
        }
        return Boolean.FALSE;
    }

    public final Integer A0b(C16L c16l, AnonymousClass469 anonymousClass469) {
        Integer A0N = anonymousClass469.A0N(C05F.A0j, C05F.A0N);
        if (A0N == C05F.A00) {
            A0t(anonymousClass469, A0N, c16l.A0p(), AnonymousClass001.A0g("Floating-point value (", c16l.A1P(), ")"));
            throw C00O.createAndThrow();
        }
        return A0N;
    }

    public final String A0k(C16L c16l, AnonymousClass469 anonymousClass469) {
        Class<String> cls;
        if (c16l.A19(C16R.A0J)) {
            return c16l.A1P();
        }
        if (c16l.A19(C16R.A0E)) {
            Object A0V = c16l.A0V();
            if (A0V instanceof byte[]) {
                return ((C45T) anonymousClass469.A02).A01.A00.A05((byte[]) A0V);
            }
            if (A0V == null) {
                return null;
            }
            return A0V.toString();
        }
        if (c16l.A19(C16R.A0D)) {
            cls = this.A00;
        } else {
            String A1Q = c16l.A1Q();
            if (A1Q != null) {
                return A1Q;
            }
            cls = String.class;
        }
        anonymousClass469.A0T(c16l, cls);
        throw C00O.createAndThrow();
    }

    public final void A0p(C16L c16l, AnonymousClass469 anonymousClass469) {
        String format = String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", C914045z.A06(this.A00), C16R.A0C, AbstractC58317Pt9.A00(548));
        anonymousClass469.A0Q(c16l, c16l.A10(), A0U(anonymousClass469), format, new Object[0]);
        throw C00O.createAndThrow();
    }

    public void A0q(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, String str) {
        if (obj == null) {
            obj = A0H();
        }
        anonymousClass469.A0S(c16l, this, obj, str);
    }

    public final void A0r(AnonymousClass469 anonymousClass469) {
        if (anonymousClass469.A0j(EnumC912945i.A0D)) {
            anonymousClass469.A0h("Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", A0j());
            throw C00O.createAndThrow();
        }
    }

    public final void A0s(AnonymousClass469 anonymousClass469) {
        anonymousClass469.A0V(C16R.A08, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", A0H().getName());
        throw C00O.createAndThrow();
    }

    public final void A0t(AnonymousClass469 anonymousClass469, Integer num, Object obj, String str) {
        if (num == C05F.A00) {
            throw new RB6(anonymousClass469.A07, obj, String.format("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, A0j()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0u(AnonymousClass469 anonymousClass469, String str) {
        boolean z;
        EnumC912945i enumC912945i;
        String format;
        String str2;
        C45Y c45y = C45Y.A06;
        if (!anonymousClass469.A02.A08(c45y)) {
            z = true;
            enumC912945i = c45y;
        } else {
            EnumC912945i enumC912945i2 = EnumC912945i.A0D;
            if (anonymousClass469.A0j(enumC912945i2)) {
                z = false;
                enumC912945i = enumC912945i2;
            } else {
                return;
            }
        }
        if (str.isEmpty()) {
            format = "empty String (\"\")";
        } else {
            format = String.format("String \"%s\"", str);
        }
        if (z) {
            str2 = "enable";
        } else {
            str2 = "disable";
        }
        anonymousClass469.A0h("Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", format, A0j(), str2, enumC912945i.getDeclaringClass().getSimpleName(), enumC912945i.name());
        throw C00O.createAndThrow();
    }

    public final boolean A0w(AnonymousClass469 anonymousClass469, String str) {
        if ("null".equals(str)) {
            C45Y c45y = C45Y.A06;
            if (anonymousClass469.A02.A08(c45y)) {
                return true;
            }
            anonymousClass469.A0h("Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", "String \"null\"", A0j(), "enable", c45y.getDeclaringClass().getSimpleName(), "ALLOW_COERCION_OF_SCALARS");
            throw C00O.createAndThrow();
        }
        return false;
    }

    public StdDeserializer(AbstractC910944l abstractC910944l) {
        Class<Object> cls;
        if (abstractC910944l == null) {
            cls = Object.class;
        } else {
            cls = abstractC910944l.A00;
        }
        this.A00 = cls;
        this.A01 = abstractC910944l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r1 != X.C05F.A0N) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte A0N(X.C16L r6, X.AnonymousClass469 r7) {
        /*
            r5 = this;
            int r1 = r6.A0x()
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L93
            r0 = 3
            if (r1 == r0) goto L6d
            r0 = 11
            if (r1 == r0) goto L69
            r0 = 6
            if (r1 == r0) goto L26
            r0 = 7
            if (r1 == r0) goto L48
            r0 = 8
            if (r1 != r0) goto L89
            java.lang.Integer r1 = r5.A0b(r6, r7)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L25
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L48
        L25:
            return r4
        L26:
            java.lang.String r2 = r6.A1P()
            java.lang.Integer r0 = X.C05F.A0j
            java.lang.Integer r1 = r5.A0d(r7, r0, r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L69
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L25
            java.lang.String r3 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4d
            r5.A0u(r7, r3)
            return r4
        L48:
            byte r4 = r6.A0T()
            return r4
        L4d:
            int r1 = X.C16Y.A02(r3)     // Catch: java.lang.IllegalArgumentException -> L5b
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L99
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L99
            byte r4 = (byte) r1     // Catch: java.lang.IllegalArgumentException -> L5b
            return r4
        L5b:
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "not a valid `byte` value"
            r7.A0e(r2, r3, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L69:
            r5.A0r(r7)
            return r4
        L6d:
            X.45i r0 = X.EnumC912945i.A0N
            boolean r0 = r7.A0j(r0)
            if (r0 == 0) goto L89
            X.16R r1 = r6.A1J()
            X.16R r0 = X.C16R.A0C
            if (r1 != r0) goto L81
            r5.A0p(r6, r7)
            goto La6
        L81:
            byte r4 = r5.A0N(r6, r7)
            r5.A0o(r6, r7)
            return r4
        L89:
            java.lang.Class r0 = java.lang.Byte.TYPE
            X.44l r0 = r7.A0A(r0)
            r7.A0R(r6, r0)
            goto La6
        L93:
            java.lang.Class r0 = java.lang.Byte.TYPE
            r7.A0T(r6, r0)
            goto La6
        L99:
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 898(0x382, float:1.258E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r7.A0e(r2, r3, r0, r1)
        La6:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0N(X.16L, X.469):byte");
    }

    public final double A0O(C16L c16l, AnonymousClass469 anonymousClass469) {
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x == 7 || A0x == 8) {
                            return c16l.A0g();
                        }
                    } else {
                        String A1P = c16l.A1P();
                        Double A0Z = A0Z(A1P);
                        if (A0Z != null) {
                            return A0Z.doubleValue();
                        }
                        Integer num = C05F.A0j;
                        Class cls = Double.TYPE;
                        Integer A0d = A0d(anonymousClass469, num, A1P);
                        if (A0d != C05F.A0C) {
                            if (A0d == C05F.A0N) {
                                return 0.0d;
                            }
                            String trim = A1P.trim();
                            if ("null".equals(trim)) {
                                A0u(anonymousClass469, trim);
                                return 0.0d;
                            }
                            try {
                                if ("2.2250738585072012e-308".equals(trim)) {
                                    return Double.MIN_NORMAL;
                                }
                                return Double.parseDouble(trim);
                            } catch (IllegalArgumentException unused) {
                                anonymousClass469.A0e(cls, trim, "not a valid `double` value (as String to convert)", new Object[0]);
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                A0r(anonymousClass469);
                return 0.0d;
            }
            if (anonymousClass469.A0j(EnumC912945i.A0N)) {
                if (c16l.A1J() == C16R.A0C) {
                    A0p(c16l, anonymousClass469);
                    throw C00O.createAndThrow();
                }
                double A0O = A0O(c16l, anonymousClass469);
                A0o(c16l, anonymousClass469);
                return A0O;
            }
        }
        anonymousClass469.A0T(c16l, Double.TYPE);
        throw C00O.createAndThrow();
    }

    public final float A0P(C16L c16l, AnonymousClass469 anonymousClass469) {
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x == 7 || A0x == 8) {
                            return c16l.A0h();
                        }
                    } else {
                        String A1P = c16l.A1P();
                        Float A0a = A0a(A1P);
                        if (A0a != null) {
                            return A0a.floatValue();
                        }
                        Integer num = C05F.A0j;
                        Class cls = Float.TYPE;
                        Integer A0d = A0d(anonymousClass469, num, A1P);
                        if (A0d != C05F.A0C) {
                            if (A0d == C05F.A0N) {
                                return 0.0f;
                            }
                            String trim = A1P.trim();
                            if ("null".equals(trim)) {
                                A0u(anonymousClass469, trim);
                                return 0.0f;
                            }
                            try {
                                return Float.parseFloat(trim);
                            } catch (IllegalArgumentException unused) {
                                anonymousClass469.A0e(cls, trim, "not a valid `float` value", new Object[0]);
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                A0r(anonymousClass469);
                return 0.0f;
            }
            if (anonymousClass469.A0j(EnumC912945i.A0N)) {
                if (c16l.A1J() == C16R.A0C) {
                    A0p(c16l, anonymousClass469);
                    throw C00O.createAndThrow();
                }
                float A0P = A0P(c16l, anonymousClass469);
                A0o(c16l, anonymousClass469);
                return A0P;
            }
        }
        anonymousClass469.A0T(c16l, Float.TYPE);
        throw C00O.createAndThrow();
    }

    public final int A0Q(C16L c16l, AnonymousClass469 anonymousClass469) {
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x != 7) {
                            if (A0x == 8) {
                                Integer A0b = A0b(c16l, anonymousClass469);
                                if (A0b == C05F.A0C || A0b == C05F.A0N) {
                                    return 0;
                                }
                                return c16l.A1D();
                            }
                        } else {
                            return c16l.A0i();
                        }
                    } else {
                        String A1P = c16l.A1P();
                        Integer A0d = A0d(anonymousClass469, C05F.A0j, A1P);
                        if (A0d != C05F.A0C) {
                            if (A0d == C05F.A0N) {
                                return 0;
                            }
                            String trim = A1P.trim();
                            if ("null".equals(trim)) {
                                A0u(anonymousClass469, trim);
                                return 0;
                            }
                            return A0R(anonymousClass469, trim);
                        }
                    }
                }
                A0r(anonymousClass469);
                return 0;
            }
            if (anonymousClass469.A0j(EnumC912945i.A0N)) {
                if (c16l.A1J() == C16R.A0C) {
                    A0p(c16l, anonymousClass469);
                    throw C00O.createAndThrow();
                }
                int A0Q = A0Q(c16l, anonymousClass469);
                A0o(c16l, anonymousClass469);
                return A0Q;
            }
        }
        anonymousClass469.A0T(c16l, Integer.TYPE);
        throw C00O.createAndThrow();
    }

    public final long A0S(C16L c16l, AnonymousClass469 anonymousClass469) {
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x != 7) {
                            if (A0x == 8) {
                                Integer A0b = A0b(c16l, anonymousClass469);
                                if (A0b == C05F.A0C || A0b == C05F.A0N) {
                                    return 0L;
                                }
                                return c16l.A0y();
                            }
                        } else {
                            return c16l.A0j();
                        }
                    } else {
                        String A1P = c16l.A1P();
                        Integer num = C05F.A0j;
                        Class cls = Long.TYPE;
                        Integer A0d = A0d(anonymousClass469, num, A1P);
                        if (A0d != C05F.A0C) {
                            if (A0d == C05F.A0N) {
                                return 0L;
                            }
                            String trim = A1P.trim();
                            if ("null".equals(trim)) {
                                A0u(anonymousClass469, trim);
                                return 0L;
                            }
                            try {
                                return C16Y.A04(trim);
                            } catch (IllegalArgumentException unused) {
                                anonymousClass469.A0e(cls, trim, "not a valid `long` value", new Object[0]);
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                }
                A0r(anonymousClass469);
                return 0L;
            }
            if (anonymousClass469.A0j(EnumC912945i.A0N)) {
                if (c16l.A1J() == C16R.A0C) {
                    A0p(c16l, anonymousClass469);
                    throw C00O.createAndThrow();
                }
                long A0S = A0S(c16l, anonymousClass469);
                A0o(c16l, anonymousClass469);
                return A0S;
            }
        }
        anonymousClass469.A0T(c16l, Long.TYPE);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (A09(r2) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004c, code lost:
    
        if (A08(r2) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean A0Y(X.C16L r7, X.AnonymousClass469 r8, java.lang.Class r9) {
        /*
            r6 = this;
            int r1 = r7.A0x()
            r3 = 0
            r5 = 1
            r4 = 0
            if (r1 == r5) goto L15
            r0 = 3
            if (r1 == r0) goto L66
            r0 = 6
            if (r1 == r0) goto L1d
            r0 = 7
            if (r1 == r0) goto L61
            switch(r1) {
                case 9: goto L40;
                case 10: goto L4e;
                case 11: goto L65;
                default: goto L15;
            }
        L15:
            r8.A0T(r7, r9)
        L18:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1d:
            java.lang.String r2 = r7.A1P()
            java.lang.Integer r0 = X.C05F.A15
            java.lang.Integer r1 = r6.A0d(r8, r0, r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L65
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L4e
            java.lang.String r2 = r2.trim()
            int r1 = r2.length()
            r0 = 4
            if (r1 != r0) goto L45
            boolean r0 = A09(r2)
            if (r0 == 0) goto L53
        L40:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            return r3
        L45:
            r0 = 5
            if (r1 != r0) goto L53
            boolean r0 = A08(r2)
            if (r0 == 0) goto L53
        L4e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            return r3
        L53:
            boolean r0 = r6.A0w(r8, r2)
            if (r0 != 0) goto L65
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "only \"true\" or \"false\" recognized"
            r8.A0e(r9, r2, r0, r1)
            goto L18
        L61:
            java.lang.Boolean r3 = r6.A0X(r7, r8)
        L65:
            return r3
        L66:
            java.lang.Object r3 = r6.A0g(r7, r8)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0Y(X.16L, X.469, java.lang.Class):java.lang.Boolean");
    }

    public final Double A0Z(String str) {
        double d;
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            if (charAt != '-') {
                if (charAt != 'I') {
                    if (charAt == 'N' && "NaN".equals(str)) {
                        d = Double.NaN;
                    } else {
                        return null;
                    }
                } else if ("Infinity".equals(str) || "INF".equals(str)) {
                    d = Double.POSITIVE_INFINITY;
                } else {
                    return null;
                }
            } else if ("-Infinity".equals(str) || "-INF".equals(str)) {
                d = Double.NEGATIVE_INFINITY;
            } else {
                return null;
            }
            return Double.valueOf(d);
        }
        return null;
    }

    public final Float A0a(String str) {
        float f;
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            if (charAt != '-') {
                if (charAt != 'I') {
                    if (charAt == 'N' && "NaN".equals(str)) {
                        f = Float.NaN;
                    } else {
                        return null;
                    }
                } else if ("Infinity".equals(str) || "INF".equals(str)) {
                    f = Float.POSITIVE_INFINITY;
                } else {
                    return null;
                }
            } else if ("-Infinity".equals(str) || "-INF".equals(str)) {
                f = Float.NEGATIVE_INFINITY;
            } else {
                return null;
            }
            return Float.valueOf(f);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        if (r1 > 2147483647L) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A0c(X.C16L r9, X.AnonymousClass469 r10, java.lang.Class r11) {
        /*
            r8 = this;
            int r1 = r9.A0x()
            r0 = 1
            if (r1 == r0) goto L24
            r0 = 3
            if (r1 == r0) goto Lba
            r0 = 11
            if (r1 == r0) goto Lb5
            r0 = 6
            if (r1 == r0) goto L42
            r0 = 7
            if (r1 == r0) goto L28
            r0 = 8
            if (r1 == r0) goto L2d
            X.44l r0 = r8.A0U(r10)
            r10.A0R(r9, r0)
        L1f:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            r10.A0T(r9, r11)
            goto L1f
        L28:
            int r0 = r9.A0i()
            goto L3d
        L2d:
            java.lang.Integer r1 = r8.A0b(r9, r10)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto Lb5
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto Lbf
            int r0 = r9.A1D()
        L3d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L42:
            java.lang.String r2 = r9.A1P()
            java.lang.Integer r1 = r8.A0e(r10, r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto Lb5
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto Lbf
            java.lang.String r4 = r2.trim()
            boolean r0 = r8.A0w(r10, r4)
            if (r0 != 0) goto Lb5
            r5 = 0
            int r1 = r4.length()     // Catch: java.lang.IllegalArgumentException -> La7
            r0 = 9
            if (r1 <= r0) goto L9e
            long r1 = X.C16Y.A04(r4)     // Catch: java.lang.IllegalArgumentException -> La7
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L78
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r0 = 0
            if (r3 <= 0) goto L79
        L78:
            r0 = 1
        L79:
            if (r0 == 0) goto L98
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.String r2 = "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)"
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> La7
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r1, r0}     // Catch: java.lang.IllegalArgumentException -> La7
            r10.A0e(r3, r4, r2, r0)     // Catch: java.lang.IllegalArgumentException -> La7
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.IllegalArgumentException -> La7
            throw r0     // Catch: java.lang.IllegalArgumentException -> La7
        L98:
            int r0 = (int) r1     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> La7
            return r0
        L9e:
            int r0 = X.C16Y.A02(r4)     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> La7
            return r0
        La7:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "not a valid `java.lang.Integer` value"
            r10.A0e(r2, r4, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lb5:
            java.lang.Object r0 = r8.BXX(r10)
            goto Lc3
        Lba:
            java.lang.Object r0 = r8.A0g(r9, r10)
            goto Lc3
        Lbf:
            java.lang.Object r0 = r8.A0K(r10)
        Lc3:
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0c(X.16L, X.469, java.lang.Class):java.lang.Integer");
    }

    public final Integer A0d(AnonymousClass469 anonymousClass469, Integer num, String str) {
        Integer A0O;
        String A00;
        if (str.isEmpty()) {
            A0O = anonymousClass469.A0N(num, C05F.A1I);
            A00 = "empty String (\"\")";
        } else {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) > ' ') {
                    if (anonymousClass469.A0i(C16M.UNTYPED_SCALARS)) {
                        return C05F.A01;
                    }
                    A0O = anonymousClass469.A0N(num, C05F.A0j);
                    if (A0O == C05F.A00) {
                        anonymousClass469.A0h("Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, A0j());
                        throw C00O.createAndThrow();
                    }
                    return A0O;
                }
            }
            A0O = anonymousClass469.A0O(num, C05F.A00);
            A00 = AbstractC58317Pt9.A00(692);
        }
        A0t(anonymousClass469, A0O, str, A00);
        return A0O;
    }

    public final Integer A0e(AnonymousClass469 anonymousClass469, String str) {
        return A0d(anonymousClass469, A0I(), str);
    }

    public final Long A0f(C16L c16l, AnonymousClass469 anonymousClass469, Class cls) {
        Object A0g;
        long A0j;
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x != 7) {
                            if (A0x != 8) {
                                anonymousClass469.A0R(c16l, A0U(anonymousClass469));
                            } else {
                                Integer A0b = A0b(c16l, anonymousClass469);
                                if (A0b != C05F.A0C) {
                                    if (A0b != C05F.A0N) {
                                        A0j = c16l.A0y();
                                    }
                                    A0g = A0K(anonymousClass469);
                                }
                            }
                        } else {
                            A0j = c16l.A0j();
                        }
                        return Long.valueOf(A0j);
                    }
                    String A1P = c16l.A1P();
                    Integer A0e = A0e(anonymousClass469, A1P);
                    if (A0e != C05F.A0C) {
                        if (A0e != C05F.A0N) {
                            String trim = A1P.trim();
                            if (!A0w(anonymousClass469, trim)) {
                                try {
                                    return Long.valueOf(C16Y.A04(trim));
                                } catch (IllegalArgumentException unused) {
                                    anonymousClass469.A0e(Long.class, trim, "not a valid `java.lang.Long` value", new Object[0]);
                                    throw C00O.createAndThrow();
                                }
                            }
                        }
                        A0g = A0K(anonymousClass469);
                    }
                }
                A0g = BXX(anonymousClass469);
            } else {
                A0g = A0g(c16l, anonymousClass469);
            }
            return (Long) A0g;
        }
        anonymousClass469.A0T(c16l, cls);
        throw C00O.createAndThrow();
    }

    public Object A0g(C16L c16l, AnonymousClass469 anonymousClass469) {
        Integer A0N = anonymousClass469.A0N(A0I(), C05F.A15);
        boolean A0j = anonymousClass469.A0j(EnumC912945i.A0N);
        if (A0j || A0N != C05F.A00) {
            C16R A1J = c16l.A1J();
            C16R c16r = C16R.A08;
            if (A1J == c16r) {
                int intValue = A0N.intValue();
                if (intValue != 3) {
                    if (intValue == 2 || intValue == 1) {
                        return BXX(anonymousClass469);
                    }
                } else {
                    return A0K(anonymousClass469);
                }
            } else if (A0j) {
                if (c16l.A19(C16R.A0C)) {
                    A0p(c16l, anonymousClass469);
                } else {
                    Object A0D = A0D(c16l, anonymousClass469);
                    if (c16l.A1J() != c16r) {
                        A0s(anonymousClass469);
                    } else {
                        return A0D;
                    }
                }
                throw C00O.createAndThrow();
            }
        }
        anonymousClass469.A0Q(c16l, C16R.A0C, A0U(anonymousClass469), null, new Object[0]);
        throw C00O.createAndThrow();
    }

    public final Object A0h(C16L c16l, AnonymousClass469 anonymousClass469) {
        AbstractC63035SbA A0W = A0W();
        Class A0H = A0H();
        String A1Q = c16l.A1Q();
        if (A0W != null && A0W.A0J()) {
            return A0W.A0A(anonymousClass469, A1Q);
        }
        if (A1Q.isEmpty()) {
            return A0i(anonymousClass469, anonymousClass469.A0N(A0I(), C05F.A1I));
        }
        int length = A1Q.length();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (A1Q.charAt(i) > ' ') {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return A0i(anonymousClass469, anonymousClass469.A0O(A0I(), C05F.A00));
        }
        if (A0W != null) {
            A1Q = A1Q.trim();
            if (A0W.A0G()) {
                Integer num = C05F.A0j;
                if (anonymousClass469.A0N(num, num) == C05F.A01) {
                    return A0W.A06(anonymousClass469, A0R(anonymousClass469, A1Q));
                }
            }
            if (A0W.A0H()) {
                Integer num2 = C05F.A0j;
                if (anonymousClass469.A0N(num2, num2) == C05F.A01) {
                    try {
                        return A0W.A07(anonymousClass469, C16Y.A04(A1Q));
                    } catch (IllegalArgumentException unused) {
                        anonymousClass469.A0e(Long.TYPE, A1Q, "not a valid `long` value", new Object[0]);
                        throw C00O.createAndThrow();
                    }
                }
            }
            if (A0W.A0F() && anonymousClass469.A0N(C05F.A15, C05F.A0j) == C05F.A01) {
                String trim = A1Q.trim();
                if ("true".equals(trim)) {
                    return A0W.A0D(anonymousClass469, true);
                }
                if ("false".equals(trim)) {
                    return A0W.A0D(anonymousClass469, false);
                }
            }
        }
        anonymousClass469.A0Y(A0W, A0H, AbstractC58317Pt9.A00(876), A1Q);
        throw C00O.createAndThrow();
    }

    public final Object A0i(AnonymousClass469 anonymousClass469, Integer num) {
        int intValue = num.intValue();
        if (intValue != 3) {
            if (intValue == 0) {
                A0t(anonymousClass469, num, "", "empty String (\"\")");
                return null;
            }
            return null;
        }
        return A0K(anonymousClass469);
    }

    public final String A0j() {
        String A06;
        StringBuilder sb;
        AbstractC910944l A0T = A0T();
        boolean z = false;
        if (A0T != null && !A0T.A00.isPrimitive()) {
            if (A0T.A0N() || A0T.A02()) {
                z = true;
            }
            A06 = C914045z.A04(A0T);
        } else {
            Class A0H = A0H();
            if (A0H.isArray() || Collection.class.isAssignableFrom(A0H) || Map.class.isAssignableFrom(A0H)) {
                z = true;
            }
            A06 = C914045z.A06(A0H);
        }
        if (z) {
            sb = new StringBuilder();
            sb.append("element of ");
        } else {
            sb = new StringBuilder();
            sb.append(A06);
            A06 = " value";
        }
        sb.append(A06);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r1 != X.C05F.A0N) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3, types: [short] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short A0n(X.C16L r6, X.AnonymousClass469 r7) {
        /*
            r5 = this;
            int r1 = r6.A0x()
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L93
            r0 = 3
            if (r1 == r0) goto L6d
            r0 = 11
            if (r1 == r0) goto L69
            r0 = 6
            if (r1 == r0) goto L26
            r0 = 7
            if (r1 == r0) goto L4a
            r0 = 8
            if (r1 != r0) goto L89
            java.lang.Integer r1 = r5.A0b(r6, r7)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L25
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L4a
        L25:
            return r4
        L26:
            java.lang.String r2 = r6.A1P()
            java.lang.Integer r0 = X.C05F.A0j
            java.lang.Class r3 = java.lang.Short.TYPE
            java.lang.Integer r1 = r5.A0d(r7, r0, r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L69
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L25
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4f
            r5.A0u(r7, r2)
            return r4
        L4a:
            short r4 = r6.A0Z()
            return r4
        L4f:
            int r1 = X.C16Y.A02(r2)     // Catch: java.lang.IllegalArgumentException -> L5d
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L99
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 > r0) goto L99
            short r4 = (short) r1     // Catch: java.lang.IllegalArgumentException -> L5d
            return r4
        L5d:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "not a valid `short` value"
            r7.A0e(r3, r2, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L69:
            r5.A0r(r7)
            return r4
        L6d:
            X.45i r0 = X.EnumC912945i.A0N
            boolean r0 = r7.A0j(r0)
            if (r0 == 0) goto L89
            X.16R r1 = r6.A1J()
            X.16R r0 = X.C16R.A0C
            if (r1 != r0) goto L81
            r5.A0p(r6, r7)
            goto La4
        L81:
            short r4 = r5.A0n(r6, r7)
            r5.A0o(r6, r7)
            return r4
        L89:
            java.lang.Class r0 = java.lang.Short.TYPE
            X.44l r0 = r7.A0A(r0)
            r7.A0R(r6, r0)
            goto La4
        L93:
            java.lang.Class r0 = java.lang.Short.TYPE
            r7.A0T(r6, r0)
            goto La4
        L99:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 897(0x381, float:1.257E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r7.A0e(r3, r2, r0, r1)
        La4:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0n(X.16L, X.469):short");
    }

    public final void A0o(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (c16l.A1J() != C16R.A08) {
            A0s(anonymousClass469);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        if (A08(r3) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0v(X.C16L r7, X.AnonymousClass469 r8) {
        /*
            r6 = this;
            int r1 = r7.A0x()
            r5 = 1
            r4 = 0
            if (r1 == r5) goto L14
            r0 = 3
            if (r1 == r0) goto L62
            r0 = 6
            if (r1 == r0) goto L1e
            r0 = 7
            if (r1 == r0) goto L76
            switch(r1) {
                case 9: goto L8c;
                case 10: goto L4d;
                case 11: goto L81;
                default: goto L14;
            }
        L14:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r8.A0T(r7, r0)
        L19:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1e:
            java.lang.String r3 = r7.A1P()
            java.lang.Integer r0 = X.C05F.A15
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Integer r1 = r6.A0d(r8, r0, r3)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L81
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L4d
            java.lang.String r3 = r3.trim()
            int r1 = r3.length()
            r0 = 4
            if (r1 != r0) goto L44
            boolean r0 = A09(r3)
            if (r0 == 0) goto L4e
            return r5
        L44:
            r0 = 5
            if (r1 != r0) goto L4e
            boolean r0 = A08(r3)
            if (r0 == 0) goto L4e
        L4d:
            return r4
        L4e:
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5a
            r6.A0u(r8, r3)
            return r4
        L5a:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            r8.A0e(r2, r3, r0, r1)
            goto L19
        L62:
            X.45i r0 = X.EnumC912945i.A0N
            boolean r0 = r8.A0j(r0)
            if (r0 == 0) goto L14
            X.16R r1 = r7.A1J()
            X.16R r0 = X.C16R.A0C
            if (r1 != r0) goto L85
            r6.A0p(r7, r8)
            goto L19
        L76:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r6.A0X(r7, r8)
            boolean r0 = r1.equals(r0)
            return r0
        L81:
            r6.A0r(r8)
            return r4
        L85:
            boolean r5 = r6.A0v(r7, r8)
            r6.A0o(r7, r8)
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0v(X.16L, X.469):boolean");
    }

    public StdDeserializer(StdDeserializer stdDeserializer) {
        this.A00 = stdDeserializer.A00;
        this.A01 = stdDeserializer.A01;
    }

    public StdDeserializer(Class cls) {
        this.A00 = cls;
        this.A01 = null;
    }
}
