package com.fasterxml.jackson.databind.deser;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C60570R8k;
import X.C63016Sag;
import X.C63242Sfw;
import X.C64540TIw;
import X.C914045z;
import X.C914146b;
import X.EnumC912945i;
import X.RB6;
import X.RBV;
import X.SXY;
import X.TI5;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.Serializable;

/* loaded from: classes10.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    public transient Exception A00;
    public volatile transient SXY A01;

    public final void A1I(C16L c16l, AnonymousClass469 anonymousClass469, Class cls, Object obj) {
        if (c16l.A18(5)) {
            String A0Y = c16l.A0Y();
            do {
                RBV A01 = C64540TIw.A01(c16l, this, A0Y);
                if (A01 != null) {
                    if (!A01.A0R(cls)) {
                        c16l.A0z();
                    } else {
                        try {
                            A01.A0K(obj, c16l, anonymousClass469);
                        } catch (Exception e) {
                            A1D(anonymousClass469, obj, A0Y, e);
                            throw C00O.createAndThrow();
                        }
                    }
                } else {
                    A1B(c16l, anonymousClass469, obj, A0Y);
                }
                A0Y = c16l.A1N();
            } while (A0Y != null);
        }
    }

    private final Object A00(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A04 = this.A09.A04(anonymousClass469);
        c16l.A0t(A04);
        if (c16l.A18(5)) {
            String A0Y = c16l.A0Y();
            do {
                RBV A01 = C64540TIw.A01(c16l, this, A0Y);
                if (A01 != null) {
                    try {
                        A01.A0K(A04, c16l, anonymousClass469);
                    } catch (Exception e) {
                        A1D(anonymousClass469, A04, A0Y, e);
                        throw C00O.createAndThrow();
                    }
                } else {
                    A1B(c16l, anonymousClass469, A04, A0Y);
                }
                A0Y = c16l.A1N();
            } while (A0Y != null);
        }
        return A04;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final JsonDeserializer A0A(SXY sxy) {
        boolean z = this instanceof ThrowableDeserializer;
        Class<?> cls = getClass();
        if (z) {
            if (cls != ThrowableDeserializer.class) {
                return this;
            }
            return new BeanDeserializerBase(this, sxy);
        }
        if (cls == BeanDeserializer.class && this.A01 != sxy) {
            this.A01 = sxy;
            try {
                return new BeanDeserializerBase(this, sxy);
            } finally {
                this.A01 = null;
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final Object A0g(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R c16r;
        AbstractC910944l A0U;
        Object[] objArr;
        String str;
        JsonDeserializer jsonDeserializer = ((BeanDeserializerBase) this).A00;
        if (jsonDeserializer == null && (jsonDeserializer = ((BeanDeserializerBase) this).A01) == null) {
            Integer A0N = anonymousClass469.A0N(A0I(), C05F.A15);
            boolean A0j = anonymousClass469.A0j(EnumC912945i.A0N);
            if (A0j || A0N != C05F.A00) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A08;
                if (A1J == c16r2) {
                    int intValue = A0N.intValue();
                    if (intValue != 3) {
                        if (intValue != 2 && intValue != 1) {
                            A0U = A0U(anonymousClass469);
                            c16r = C16R.A0C;
                            str = null;
                            objArr = new Object[0];
                        } else {
                            return BXX(anonymousClass469);
                        }
                    } else {
                        return A0K(anonymousClass469);
                    }
                } else if (A0j) {
                    C16R A1J2 = c16l.A1J();
                    c16r = C16R.A0C;
                    if (A1J2 == c16r) {
                        A0U = A0U(anonymousClass469);
                        objArr = new Object[]{C914045z.A04(A0U), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"};
                        str = "Cannot deserialize value of type %s from deeply-nested JSON Array: only single wrapper allowed with `%s`";
                    } else {
                        Object A0D = A0D(c16l, anonymousClass469);
                        if (c16l.A1J() != c16r2) {
                            A0s(anonymousClass469);
                            throw C00O.createAndThrow();
                        }
                        return A0D;
                    }
                }
                anonymousClass469.A0Q(c16l, c16r, A0U, str, objArr);
                throw C00O.createAndThrow();
            }
            AbstractC58319PtB.A1G(c16l, anonymousClass469, this);
            throw C00O.createAndThrow();
        }
        Object A08 = this.A09.A08(anonymousClass469, jsonDeserializer.A0D(c16l, anonymousClass469));
        AbstractC58321PtD.A1L(anonymousClass469, this);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:244:0x039c A[Catch: Exception -> 0x0445, TryCatch #3 {Exception -> 0x0445, blocks: (B:103:0x01b8, B:133:0x01f7, B:226:0x0321, B:229:0x032e, B:232:0x033c, B:234:0x034b, B:236:0x0353, B:242:0x0398, B:244:0x039c, B:247:0x03cc, B:248:0x03ac, B:249:0x03ce, B:251:0x03d6, B:253:0x03df, B:255:0x03e5, B:257:0x03ed, B:258:0x0401, B:264:0x0392, B:265:0x035e, B:267:0x0408, B:268:0x0418, B:270:0x0427, B:271:0x042a, B:260:0x0404, B:276:0x0368, B:278:0x0371, B:281:0x0377, B:282:0x0389, B:287:0x042b, B:290:0x0433, B:292:0x043d, B:294:0x0442), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03d6 A[Catch: Exception -> 0x0445, TryCatch #3 {Exception -> 0x0445, blocks: (B:103:0x01b8, B:133:0x01f7, B:226:0x0321, B:229:0x032e, B:232:0x033c, B:234:0x034b, B:236:0x0353, B:242:0x0398, B:244:0x039c, B:247:0x03cc, B:248:0x03ac, B:249:0x03ce, B:251:0x03d6, B:253:0x03df, B:255:0x03e5, B:257:0x03ed, B:258:0x0401, B:264:0x0392, B:265:0x035e, B:267:0x0408, B:268:0x0418, B:270:0x0427, B:271:0x042a, B:260:0x0404, B:276:0x0368, B:278:0x0371, B:281:0x0377, B:282:0x0389, B:287:0x042b, B:290:0x0433, B:292:0x043d, B:294:0x0442), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0427 A[Catch: Exception -> 0x0445, TryCatch #3 {Exception -> 0x0445, blocks: (B:103:0x01b8, B:133:0x01f7, B:226:0x0321, B:229:0x032e, B:232:0x033c, B:234:0x034b, B:236:0x0353, B:242:0x0398, B:244:0x039c, B:247:0x03cc, B:248:0x03ac, B:249:0x03ce, B:251:0x03d6, B:253:0x03df, B:255:0x03e5, B:257:0x03ed, B:258:0x0401, B:264:0x0392, B:265:0x035e, B:267:0x0408, B:268:0x0418, B:270:0x0427, B:271:0x042a, B:260:0x0404, B:276:0x0368, B:278:0x0371, B:281:0x0377, B:282:0x0389, B:287:0x042b, B:290:0x0433, B:292:0x043d, B:294:0x0442), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[Catch: Exception -> 0x0445, SYNTHETIC, TryCatch #3 {Exception -> 0x0445, blocks: (B:103:0x01b8, B:133:0x01f7, B:226:0x0321, B:229:0x032e, B:232:0x033c, B:234:0x034b, B:236:0x0353, B:242:0x0398, B:244:0x039c, B:247:0x03cc, B:248:0x03ac, B:249:0x03ce, B:251:0x03d6, B:253:0x03df, B:255:0x03e5, B:257:0x03ed, B:258:0x0401, B:264:0x0392, B:265:0x035e, B:267:0x0408, B:268:0x0418, B:270:0x0427, B:271:0x042a, B:260:0x0404, B:276:0x0368, B:278:0x0371, B:281:0x0377, B:282:0x0389, B:287:0x042b, B:290:0x0433, B:292:0x043d, B:294:0x0442), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.THn, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1F(X.C16L r19, X.AnonymousClass469 r20) {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.A1F(X.16L, X.469):java.lang.Object");
    }

    public final void A1H(C16L c16l, AnonymousClass469 anonymousClass469, C63016Sag c63016Sag, Object obj) {
        Class cls;
        if (this.A0F) {
            cls = anonymousClass469.A05;
        } else {
            cls = null;
        }
        C16R A10 = c16l.A10();
        while (A10 == C16R.A0A) {
            String A0Y = c16l.A0Y();
            C16R A1J = c16l.A1J();
            RBV A02 = this.A0A.A02(A0Y);
            if (A02 != null) {
                if (A1J.A03) {
                    c63016Sag.A00(c16l, anonymousClass469, obj, A0Y);
                }
                if (cls != null && !A02.A0R(cls)) {
                    c16l.A0z();
                } else {
                    try {
                        A02.A0K(obj, c16l, anonymousClass469);
                    } catch (Exception e) {
                        A1D(anonymousClass469, obj, A0Y, e);
                        throw C00O.createAndThrow();
                    }
                }
            } else if (C63242Sfw.A01(this, A0Y)) {
                A1A(c16l, anonymousClass469, obj, A0Y);
            } else if (!c63016Sag.A03(c16l, anonymousClass469, obj, A0Y)) {
                TI5 ti5 = this.A02;
                if (ti5 != null) {
                    ti5.A01(c16l, anonymousClass469, obj, A0Y);
                } else {
                    A0q(c16l, anonymousClass469, obj, A0Y);
                }
            }
            A10 = c16l.A1J();
        }
        c63016Sag.A02(obj, c16l, anonymousClass469);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00c0: INVOKE 
      (r5v0 ?? I:com.fasterxml.jackson.databind.deser.BeanDeserializerBase)
      (r7v0 ?? I:X.469)
      (r8v0 ?? I:java.lang.Object)
      (r2 I:java.lang.String)
      (r0 I:java.lang.Throwable)
     VIRTUAL call: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void A[MD:(X.469, java.lang.Object, java.lang.String, java.lang.Throwable):void (m)] (LINE:192), block:B:68:0x00c0 */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        String A1D;
        String A0Y;
        Class cls;
        Class cls2;
        c16l.A0t(obj);
        AbstractC58321PtD.A1L(anonymousClass469, this);
        try {
            if (this.A05 != null) {
                C16R A10 = c16l.A10();
                if (A10 == C16R.A0D) {
                    A10 = c16l.A1J();
                }
                C914146b c914146b = new C914146b(c16l, anonymousClass469);
                c914146b.A0d();
                if (this.A0F) {
                    cls2 = anonymousClass469.A05;
                } else {
                    cls2 = null;
                }
                while (A10 == C16R.A0A) {
                    String A0Y2 = c16l.A0Y();
                    RBV A02 = this.A0A.A02(A0Y2);
                    c16l.A1J();
                    if (A02 != null) {
                        if (cls2 != null && !A02.A0R(cls2)) {
                            c16l.A0z();
                        } else {
                            A02.A0K(obj, c16l, anonymousClass469);
                        }
                    } else if (C63242Sfw.A01(this, A0Y2)) {
                        A1A(c16l, anonymousClass469, obj, A0Y2);
                    } else if (this.A02 == null) {
                        c914146b.A0r(A0Y2);
                        c914146b.A14(c16l);
                    } else {
                        C914146b c914146b2 = new C914146b(c16l, anonymousClass469);
                        c914146b2.A14(c16l);
                        c914146b.A0r(A0Y2);
                        c914146b.A18(c914146b2);
                        this.A02.A01(AbstractC58322PtE.A0c(c914146b2), anonymousClass469, obj, A0Y2);
                    }
                    A10 = c16l.A1J();
                }
                c914146b.A0a();
                this.A05.A00(anonymousClass469, c914146b, obj);
            } else {
                C63016Sag c63016Sag = this.A03;
                if (c63016Sag != null) {
                    A1H(c16l, anonymousClass469, new C63016Sag(c63016Sag), obj);
                    return obj;
                }
                if (c16l.A17()) {
                    A0Y = c16l.A1N();
                    if (A0Y == null) {
                        return obj;
                    }
                } else if (c16l.A18(5)) {
                    A0Y = c16l.A0Y();
                }
                if (this.A0F && (cls = anonymousClass469.A05) != null) {
                    A1I(c16l, anonymousClass469, cls, obj);
                    return obj;
                }
                do {
                    RBV A01 = C64540TIw.A01(c16l, this, A0Y);
                    if (A01 != null) {
                        A01.A0K(obj, c16l, anonymousClass469);
                    } else {
                        A1B(c16l, anonymousClass469, obj, A0Y);
                    }
                    A0Y = c16l.A1N();
                } while (A0Y != null);
                return obj;
            }
            return obj;
        } catch (Exception e) {
            A1D(anonymousClass469, obj, A1D, e);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001c. Please report as an issue. */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A1F;
        if (c16l.A17()) {
            if (this.A07) {
                c16l.A1J();
                return A00(c16l, anonymousClass469);
            }
            c16l.A1J();
        } else {
            C16R A10 = c16l.A10();
            if (A10 != null) {
                switch (A10.ordinal()) {
                    case 2:
                    case 5:
                        if (this.A07) {
                            return A00(c16l, anonymousClass469);
                        }
                        break;
                    case 3:
                        return A0g(c16l, anonymousClass469);
                    case 6:
                        if (this.A0B != null) {
                            return A15(c16l, anonymousClass469);
                        }
                        JsonDeserializer jsonDeserializer = ((BeanDeserializerBase) this).A01;
                        if (jsonDeserializer != null || (jsonDeserializer = ((BeanDeserializerBase) this).A00) != null) {
                            AbstractC63035SbA abstractC63035SbA = this.A09;
                            if (!abstractC63035SbA.A0J()) {
                                return AbstractC63035SbA.A02(c16l, anonymousClass469, jsonDeserializer, this, abstractC63035SbA);
                            }
                        }
                        Object A0V = c16l.A0V();
                        if (A0V == null) {
                            return A0V;
                        }
                        AbstractC910944l abstractC910944l = this.A08;
                        Class<?> cls = A0V.getClass();
                        Class<?> cls2 = abstractC910944l.A00;
                        if (cls2 == cls || cls2.isAssignableFrom(cls)) {
                            return A0V;
                        }
                        if (anonymousClass469.A02.A08 != null) {
                            throw AbstractC166987dD.A15("handleWeirdNativeValue");
                        }
                        throw new RB6(anonymousClass469.A07, A0V, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", C914045z.A06(cls2), C914045z.A07(A0V)));
                    case 7:
                        return A17(c16l, anonymousClass469);
                    case 8:
                        return A14(c16l, anonymousClass469);
                    case 9:
                        return A13(c16l, anonymousClass469);
                    case 10:
                    case 11:
                        return A12(c16l, anonymousClass469);
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        if (c16l.A0e()) {
                            C914146b c914146b = new C914146b(c16l, anonymousClass469);
                            c914146b.A0a();
                            C60570R8k A11 = c914146b.A11(c16l);
                            A11.A1J();
                            if (this.A07) {
                                A1F = A00(A11, anonymousClass469);
                            } else {
                                A1F = A1F(A11, anonymousClass469);
                            }
                            A11.close();
                            return A1F;
                        }
                        break;
                }
            }
            AbstractC58319PtB.A1G(c16l, anonymousClass469, this);
            throw C00O.createAndThrow();
        }
        return A1F(c16l, anonymousClass469);
    }

    public final Object A1G(C16L c16l, AnonymousClass469 anonymousClass469, RBV rbv) {
        try {
            return rbv.A0C(c16l, anonymousClass469);
        } catch (Exception e) {
            A1D(anonymousClass469, this.A08.A00, rbv.A06.A02, e);
            throw C00O.createAndThrow();
        }
    }
}
