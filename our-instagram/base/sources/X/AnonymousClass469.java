package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.469, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass469 extends AbstractC913445n implements Serializable {
    public C1126556v A00;
    public final int A01;
    public final C912845h A02;
    public final C46A A03;
    public final AbstractC913845x A04;
    public final Class A05;
    public final C16N A06;
    public transient C16L A07;
    public transient DateFormat A08;
    public transient C912745g A09;
    public transient C102374jC A0A;
    public transient SQ8 A0B;

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer A0F(Object obj) {
        JsonDeserializer jsonDeserializer = null;
        jsonDeserializer = null;
        jsonDeserializer = null;
        if (obj != null) {
            if (!(obj instanceof JsonDeserializer)) {
                if (obj instanceof Class) {
                    Class cls = (Class) obj;
                    if (cls != JsonDeserializer.None.class && !C914045z.A0I(cls)) {
                        if (JsonDeserializer.class.isAssignableFrom(cls)) {
                            obj = C914045z.A03(cls, this.A02.A05());
                        } else {
                            throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<JsonDeserializer>"));
                        }
                    }
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned deserializer definition of type ", obj.getClass().getName(), "; expected type JsonDeserializer or Class<JsonDeserializer> instead"));
                }
            }
            JsonDeserializer jsonDeserializer2 = (JsonDeserializer) obj;
            boolean z = jsonDeserializer2 instanceof InterfaceC102464je;
            jsonDeserializer = jsonDeserializer2;
            if (z) {
                ((InterfaceC102464je) jsonDeserializer2).EK8(this);
                jsonDeserializer = jsonDeserializer2;
            }
        }
        return jsonDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC62638SJv A0H(Object obj) {
        AbstractC62638SJv abstractC62638SJv = null;
        abstractC62638SJv = null;
        abstractC62638SJv = null;
        if (obj != null) {
            if (!(obj instanceof AbstractC62638SJv)) {
                if (obj instanceof Class) {
                    Class cls = (Class) obj;
                    if (cls != R9S.class && !C914045z.A0I(cls)) {
                        if (AbstractC62638SJv.class.isAssignableFrom(cls)) {
                            obj = C914045z.A03(cls, this.A02.A05());
                        } else {
                            throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<KeyDeserializer>"));
                        }
                    }
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned key deserializer definition of type ", obj.getClass().getName(), "; expected type KeyDeserializer or Class<KeyDeserializer> instead"));
                }
            }
            AbstractC62638SJv abstractC62638SJv2 = (AbstractC62638SJv) obj;
            boolean z = abstractC62638SJv2 instanceof InterfaceC102464je;
            abstractC62638SJv = abstractC62638SJv2;
            if (z) {
                ((InterfaceC102464je) abstractC62638SJv2).EK8(this);
                abstractC62638SJv = abstractC62638SJv2;
            }
        }
        return abstractC62638SJv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.TgS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.TgS] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public final SP8 A0I(TI2 ti2, InterfaceC65236TgS interfaceC65236TgS, Object obj) {
        AnonymousClass468 anonymousClass468 = (AnonymousClass468) this;
        if (obj == null) {
            return null;
        }
        AbstractC60564R8e abstractC60564R8e = (AbstractC60564R8e) ti2;
        TI4 ti4 = new TI4(abstractC60564R8e.getClass(), abstractC60564R8e.A00, obj);
        LinkedHashMap linkedHashMap = anonymousClass468.A01;
        if (linkedHashMap == null) {
            anonymousClass468.A01 = new LinkedHashMap();
        } else {
            SP8 sp8 = (SP8) linkedHashMap.get(ti4);
            if (sp8 != null) {
                return sp8;
            }
        }
        List<??> list = anonymousClass468.A00;
        if (list == null) {
            anonymousClass468.A00 = new ArrayList(8);
        } else {
            for (?? r2 : list) {
                if (interfaceC65236TgS.getClass() == r2.getClass()) {
                    break;
                }
            }
        }
        r2 = new Object();
        anonymousClass468.A00.add(r2);
        SP8 sp82 = new SP8(ti4);
        sp82.A00 = r2;
        anonymousClass468.A01.put(ti4, sp82);
        return sp82;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r4 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q(X.C16L r3, X.C16R r4, X.AbstractC910944l r5, java.lang.String r6, java.lang.Object... r7) {
        /*
            r2 = this;
            int r0 = r7.length
            if (r0 <= 0) goto L7
            java.lang.String r6 = java.lang.String.format(r6, r7)
        L7:
            X.45h r0 = r2.A02
            X.56v r0 = r0.A08
            if (r0 == 0) goto L15
            java.lang.String r0 = "handleUnexpectedToken"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L15:
            if (r6 != 0) goto L5d
            java.lang.String r1 = X.C914045z.A04(r5)
            if (r4 != 0) goto L31
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Unexpected end-of-input when trying read value of type %s"
            java.lang.String r6 = java.lang.String.format(r0, r1)
        L27:
            X.16L r0 = r2.A07
            X.R98 r1 = new X.R98
            r1.<init>(r0, r6)
            X.460[] r0 = X.C914045z.A01
            throw r1
        L31:
            int r0 = r4.ordinal()
            switch(r0) {
                case 1: goto L45;
                case 2: goto L45;
                case 3: goto L48;
                case 4: goto L48;
                case 5: goto L45;
                case 6: goto L4e;
                case 7: goto L57;
                case 8: goto L54;
                case 9: goto L51;
                case 10: goto L4b;
                case 11: goto L4b;
                case 12: goto L5a;
                default: goto L38;
            }
        L38:
            java.lang.String r0 = "[Unavailable value]"
        L3a:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r4}
            java.lang.String r0 = "Cannot deserialize value of type %s from %s (token `JsonToken.%s`)"
            java.lang.String r6 = java.lang.String.format(r0, r1)
            goto L5f
        L45:
            java.lang.String r0 = "Object value"
            goto L3a
        L48:
            java.lang.String r0 = "Array value"
            goto L3a
        L4b:
            java.lang.String r0 = "Boolean value"
            goto L3a
        L4e:
            java.lang.String r0 = "Embedded Object"
            goto L3a
        L51:
            java.lang.String r0 = "Floating-point value"
            goto L3a
        L54:
            java.lang.String r0 = "Integer value"
            goto L3a
        L57:
            java.lang.String r0 = "String value"
            goto L3a
        L5a:
            java.lang.String r0 = "Null value"
            goto L3a
        L5d:
            if (r4 == 0) goto L27
        L5f:
            boolean r0 = r4.A03
            if (r0 == 0) goto L27
            r3.A1P()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass469.A0Q(X.16L, X.16R, X.44l, java.lang.String, java.lang.Object[]):void");
    }

    public final void A0R(C16L c16l, AbstractC910944l abstractC910944l) {
        A0Q(c16l, c16l.A10(), abstractC910944l, null, new Object[0]);
        throw C00O.createAndThrow();
    }

    public final void A0T(C16L c16l, Class cls) {
        A0Q(c16l, c16l.A10(), A0A(cls), null, new Object[0]);
        throw C00O.createAndThrow();
    }

    public final void A0U(C16R c16r, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        C16L c16l = this.A07;
        String format = String.format("Unexpected token (%s), expected %s", c16l.A10(), c16r);
        if (str != null) {
            format = AnonymousClass001.A0g(format, ": ", str);
        }
        C102314j6 c102314j6 = new C102314j6(c16l, format);
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
        throw c102314j6;
    }

    public final void A0V(C16R c16r, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        C16L c16l = this.A07;
        String format = String.format("Unexpected token (%s), expected %s", c16l.A10(), c16r);
        if (str != null) {
            format = AnonymousClass001.A0g(format, ": ", str);
        }
        throw new C102314j6(c16l, format);
    }

    public final void A0W(InterfaceC65620ToB interfaceC65620ToB, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        C102314j6 c102314j6 = new C102314j6(this.A07, str);
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
        if (interfaceC65620ToB != null) {
            RBL BSA = interfaceC65620ToB.BSA();
            if (BSA != null) {
                c102314j6.A08(BSA.A09(), interfaceC65620ToB.getName());
                throw c102314j6;
            }
            throw c102314j6;
        }
        throw c102314j6;
    }

    public final void A0Y(AbstractC63035SbA abstractC63035SbA, Class cls, String str, Object... objArr) {
        Object[] objArr2;
        String A00;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException(AbstractC58317Pt9.A00(793));
        }
        if (abstractC63035SbA == null) {
            objArr2 = new Object[]{C914045z.A06(cls), str};
            A00 = "Cannot construct instance of %s: %s";
        } else {
            boolean A0N = abstractC63035SbA.A0N();
            objArr2 = new Object[]{C914045z.A06(cls), str};
            if (!A0N) {
                A00 = AbstractC58317Pt9.A00(534);
            } else {
                throw new C102314j6(this.A07, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", objArr2));
            }
        }
        A09(String.format(A00, objArr2), cls);
        throw C00O.createAndThrow();
    }

    public final void A0Z(C45B c45b, AbstractC63037SbC abstractC63037SbC, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
        throw new R9A(this.A07, c45b, abstractC63037SbC, String.format("Invalid definition for property %s (of type %s): %s", C914045z.A08(abstractC63037SbC.A0L()), C914045z.A06(c45b.A05.A00), str));
    }

    public final void A0a(C45B c45b, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new R9A(this.A07, c45b, (AbstractC63037SbC) null, String.format("Invalid type definition for type %s: %s", C914045z.A06(c45b.A05.A00), str));
    }

    public final void A0c(Class cls, Number number, String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleWeirdNumberValue");
        }
        throw new RB6(this.A07, number, String.format("Cannot deserialize value of type %s from number %s: %s", C914045z.A06(cls), String.valueOf(number), str));
    }

    public final void A0d(Class cls, String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleWeirdKey");
        }
        throw new RB6(this.A07, str, String.format("Cannot deserialize Map key of type %s from String %s: %s", C914045z.A06(cls), A07(str), str2));
    }

    public final void A0e(Class cls, String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleWeirdStringValue");
        }
        throw A0J(cls, str, str2);
    }

    public final void A0h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new C102314j6(this.A07, str);
    }

    public final AbstractC910944l A0A(Class cls) {
        if (cls == null) {
            return null;
        }
        return ((C45T) this.A02).A01.A07.A09(cls);
    }

    public final JsonDeserializer A0B(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l) {
        JsonDeserializer A01 = this.A03.A01(this, abstractC910944l, this.A04);
        if (A01 != null) {
            return A0D(interfaceC65620ToB, abstractC910944l, A01);
        }
        return A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer A0C(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer) {
        boolean z = jsonDeserializer instanceof InterfaceC102474jf;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        if (z) {
            this.A00 = new C1126556v(this.A00, abstractC910944l);
            try {
            } finally {
                this.A00 = this.A00.A00;
            }
        }
        return jsonDeserializer2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonDeserializer A0D(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer) {
        boolean z = jsonDeserializer instanceof InterfaceC102474jf;
        JsonDeserializer jsonDeserializer2 = jsonDeserializer;
        if (z) {
            this.A00 = new C1126556v(this.A00, abstractC910944l);
            try {
            } finally {
                this.A00 = this.A00.A00;
            }
        }
        return jsonDeserializer2;
    }

    public final JsonDeserializer A0E(AbstractC910944l abstractC910944l) {
        C46A c46a = this.A03;
        AbstractC913845x abstractC913845x = this.A04;
        JsonDeserializer A01 = c46a.A01(this, abstractC910944l, abstractC913845x);
        if (A01 == null) {
            return null;
        }
        JsonDeserializer A0D = A0D(null, abstractC910944l, A01);
        RBd A08 = abstractC913845x.A08(this.A02, abstractC910944l);
        if (A08 != null) {
            return new TypeWrappedDeserializer(A0D, A08.A02(null));
        }
        return A0D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0194, code lost:
    
        r9 = new X.RAu(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02b0, code lost:
    
        if (r6 == 0) goto L186;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a7 A[Catch: IllegalArgumentException -> 0x0357, TryCatch #0 {IllegalArgumentException -> 0x0357, blocks: (B:2:0x0000, B:4:0x000d, B:5:0x0016, B:7:0x001c, B:9:0x0027, B:55:0x00ca, B:56:0x0331, B:58:0x0336, B:60:0x0341, B:61:0x034b, B:63:0x034c, B:65:0x0350, B:73:0x0085, B:71:0x032c, B:69:0x0091, B:118:0x00d2, B:121:0x00db, B:123:0x00df, B:125:0x00e9, B:127:0x00f1, B:129:0x00f7, B:131:0x00fd, B:133:0x0109, B:135:0x0117, B:137:0x011d, B:140:0x0125, B:141:0x012c, B:143:0x0132, B:145:0x0136, B:147:0x013c, B:148:0x0143, B:149:0x0153, B:151:0x0159, B:154:0x0161, B:157:0x0167, B:160:0x016b, B:162:0x0172, B:164:0x017e, B:167:0x0187, B:169:0x018d, B:170:0x0194, B:174:0x019d, B:182:0x01c6, B:184:0x01d8, B:185:0x01dc, B:186:0x01e0, B:188:0x01e6, B:191:0x01f7, B:196:0x022c, B:199:0x030a, B:200:0x0232, B:202:0x023e, B:203:0x0243, B:205:0x0249, B:208:0x025f, B:239:0x0267, B:216:0x027f, B:218:0x02a7, B:219:0x02ac, B:211:0x026c, B:213:0x0279, B:222:0x0285, B:225:0x028d, B:228:0x0293, B:230:0x029c, B:248:0x02b6, B:249:0x02c3, B:251:0x02c9, B:255:0x02d5, B:259:0x02da, B:264:0x02f6, B:266:0x02fd, B:268:0x0303, B:269:0x0313, B:272:0x02b2, B:278:0x0201, B:279:0x020a, B:281:0x0210, B:284:0x0220, B:289:0x00e3), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC62638SJv A0G(X.AbstractC910944l r12) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass469.A0G(X.44l):X.SJv");
    }

    public final R99 A0K(Class cls, Throwable th) {
        String A09;
        if (th == null) {
            A09 = "N/A";
        } else {
            A09 = C914045z.A09(th);
            if (A09 == null) {
                A09 = C914045z.A06(th.getClass());
            }
        }
        return new R99(this.A07, A0A(cls), String.format("Cannot construct instance of %s, problem: %s", C914045z.A06(cls), A09), th);
    }

    public final C102374jC A0L() {
        C102374jC c102374jC = this.A0A;
        if (c102374jC == null) {
            C102374jC c102374jC2 = new C102374jC();
            this.A0A = c102374jC2;
            return c102374jC2;
        }
        return c102374jC;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.SQ8] */
    public final SQ8 A0M() {
        SQ8 sq8 = this.A0B;
        if (sq8 == null) {
            return new Object();
        }
        this.A0B = null;
        return sq8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r2.A0C(X.EnumC912945i.A0E) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5 != X.C05F.A03) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r6 != X.C05F.A1I) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r1 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2.A0C(X.EnumC912945i.A04) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r5 != X.C05F.A04) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0036, code lost:
    
        return X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        return X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        return r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
    
        if (r2.A08(X.C45Y.A06) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0032, code lost:
    
        if (r2.A0C(X.EnumC912945i.A05) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006b, code lost:
    
        if (r2.A0C(X.EnumC912945i.A03) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A0N(java.lang.Integer r5, java.lang.Integer r6) {
        /*
            r4 = this;
            X.45h r2 = r4.A02
            X.45O r3 = r2.A05
            X.45P r0 = r3.A01
            java.lang.Integer[] r0 = r0.A00
            int r1 = r6.intValue()
            r0 = r0[r1]
            if (r0 != 0) goto L27
            r0 = 7
            if (r1 == r0) goto L65
            r0 = 3
            if (r1 == r0) goto L28
            r0 = 2
            if (r1 != r0) goto L37
            java.lang.Integer r0 = X.C05F.A1F
            if (r5 != r0) goto L37
            X.45i r0 = X.EnumC912945i.A0E
            boolean r0 = r2.A0C(r0)
            if (r0 == 0) goto L37
        L25:
            java.lang.Integer r0 = X.C05F.A00
        L27:
            return r0
        L28:
            java.lang.Integer r0 = X.C05F.A0j
            if (r5 != r0) goto L37
            X.45i r0 = X.EnumC912945i.A05
            boolean r0 = r2.A0C(r0)
            if (r0 == 0) goto L25
        L34:
            java.lang.Integer r0 = X.C05F.A01
            return r0
        L37:
            java.lang.Integer r0 = X.C05F.A0u
            if (r5 == r0) goto L48
            java.lang.Integer r0 = X.C05F.A0j
            if (r5 == r0) goto L48
            java.lang.Integer r0 = X.C05F.A15
            if (r5 == r0) goto L48
            java.lang.Integer r0 = X.C05F.A03
            r1 = 0
            if (r5 != r0) goto L52
        L48:
            r1 = 1
            X.45Y r0 = X.C45Y.A06
            boolean r0 = r2.A08(r0)
            if (r0 != 0) goto L52
            goto L25
        L52:
            java.lang.Integer r0 = X.C05F.A1I
            if (r6 != r0) goto L70
            if (r1 != 0) goto L6d
            X.45i r0 = X.EnumC912945i.A04
            boolean r0 = r2.A0C(r0)
            if (r0 != 0) goto L6d
            java.lang.Integer r0 = X.C05F.A04
            if (r5 != r0) goto L25
            goto L34
        L65:
            X.45i r0 = X.EnumC912945i.A03
            boolean r0 = r2.A0C(r0)
            if (r0 == 0) goto L25
        L6d:
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        L70:
            java.lang.Integer r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass469.A0N(java.lang.Integer, java.lang.Integer):java.lang.Integer");
    }

    public final Integer A0O(Integer num, Integer num2) {
        C912845h c912845h = this.A02;
        Integer num3 = c912845h.A05.A01.A00[9];
        if (!Boolean.FALSE.equals(null)) {
            if (num3 == null) {
                if (num == C05F.A0u || num == C05F.A0j || num == C05F.A15 || num == C05F.A03 || c912845h.A0C(EnumC912945i.A04)) {
                    return C05F.A0C;
                }
            } else {
                return num3;
            }
        }
        return num2;
    }

    public final Date A0P(String str) {
        try {
            DateFormat dateFormat = this.A08;
            if (dateFormat == null) {
                dateFormat = (DateFormat) ((C45T) this.A02).A01.A08.clone();
                this.A08 = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, C914045z.A09(e)));
        }
    }

    public final void A0S(C16L c16l, JsonDeserializer jsonDeserializer, Object obj, String str) {
        Class<?> cls;
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleUnknownProperty");
        }
        if (!A0j(EnumC912945i.A0H)) {
            c16l.A0z();
            return;
        }
        Collection A0L = jsonDeserializer.A0L();
        C16L c16l2 = this.A07;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        RBB rbb = new RBB(c16l2.A1H(), c16l2, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", str, cls.getName()), A0L);
        rbb.A08(obj, str);
        throw rbb;
    }

    public final void A0X(JsonDeserializer jsonDeserializer) {
        if (this.A02.A08(C45Y.A0J)) {
            return;
        }
        AbstractC910944l A0A = A0A(jsonDeserializer.A0H());
        throw new R9A(this.A07, A0A, String.format("Invalid configuration: values of type %s cannot be merged", C914045z.A04(A0A)));
    }

    public final void A0b(SQ8 sq8) {
        int length;
        SQ8 sq82 = this.A0B;
        if (sq82 != null) {
            Object[] objArr = sq8.A01;
            if (objArr == null) {
                length = 0;
            } else {
                length = objArr.length;
            }
            Object[] objArr2 = sq82.A01;
            if (objArr2 != null && length < objArr2.length) {
                return;
            }
        }
        this.A0B = sq8;
    }

    public final void A0f(Class cls, Throwable th) {
        if (this.A02.A08 != null) {
            throw new NullPointerException("handleInstantiationProblem");
        }
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
        if (!(th instanceof IOException)) {
            if (!A0j(EnumC912945i.A0S)) {
                C914045z.A0F(th);
            }
            throw A0K(cls, th);
        }
        throw th;
    }

    public final void A0g(Object obj) {
        Class<?> cls;
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        A09(String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj), cls);
        throw C00O.createAndThrow();
    }

    public final boolean A0i(C16M c16m) {
        if ((c16m.BPk() & this.A06.A00) == 0) {
            return false;
        }
        return true;
    }

    public final boolean A0j(EnumC912945i enumC912945i) {
        if ((enumC912945i.A00 & this.A01) == 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass469(AbstractC913845x abstractC913845x) {
        this.A04 = abstractC913845x;
        this.A03 = new C46A();
        this.A01 = 0;
        this.A06 = null;
        this.A02 = null;
        this.A05 = null;
        this.A09 = null;
    }

    public static final void A00(C16L c16l, C16R c16r, Class cls) {
        throw new C102314j6(c16l, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", c16r, C914045z.A06(cls)));
    }

    public final RB6 A0J(Class cls, String str, String str2) {
        return new RB6(this.A07, str, String.format("Cannot deserialize value of type %s from String %s: %s", C914045z.A06(cls), A07(str), str2));
    }

    public AnonymousClass469(C16L c16l, C912845h c912845h, AnonymousClass469 anonymousClass469) {
        this.A03 = anonymousClass469.A03;
        this.A04 = anonymousClass469.A04;
        this.A06 = c16l.A1L();
        this.A02 = c912845h;
        this.A01 = c912845h.A00;
        this.A05 = ((C45S) c912845h).A05;
        this.A07 = c16l;
        this.A09 = ((C45S) c912845h).A02;
    }

    public AnonymousClass469(C912845h c912845h, AnonymousClass469 anonymousClass469) {
        this.A03 = anonymousClass469.A03;
        this.A04 = anonymousClass469.A04;
        this.A06 = null;
        this.A02 = c912845h;
        this.A01 = c912845h.A00;
        this.A05 = null;
        this.A07 = null;
        this.A09 = null;
    }

    public AnonymousClass469(AnonymousClass469 anonymousClass469, AbstractC913845x abstractC913845x) {
        this.A03 = anonymousClass469.A03;
        this.A04 = abstractC913845x;
        this.A02 = anonymousClass469.A02;
        this.A01 = anonymousClass469.A01;
        this.A06 = anonymousClass469.A06;
        this.A05 = anonymousClass469.A05;
        this.A07 = anonymousClass469.A07;
        this.A09 = anonymousClass469.A09;
    }
}
