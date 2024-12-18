package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

/* renamed from: X.45w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC913745w extends AbstractC913845x implements Serializable {
    public final AnonymousClass461 A00;

    public static final TIG A03(C912845h c912845h, RBL rbl, Class cls) {
        boolean A08;
        Enum[] A01;
        HashMap hashMap;
        Enum A0U;
        boolean z;
        if (rbl != null) {
            if (c912845h.A05()) {
                C914045z.A0H(rbl.A0C(), c912845h.A07());
            }
            C44W A00 = c912845h.A00();
            A08 = c912845h.A08(C45Y.A03);
            A01 = TIG.A01(cls);
            hashMap = new HashMap();
            int length = A01.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Enum r3 = A01[length];
                try {
                    Object A0A = rbl.A0A(r3);
                    if (A0A != null) {
                        hashMap.put(A0A.toString(), r3);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to access @JsonValue of Enum value ");
                    sb.append(r3);
                    sb.append(": ");
                    sb.append(e.getMessage());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (A00 != null) {
                A0U = A00.A0U(cls);
            } else {
                A0U = null;
            }
            Class A04 = rbl.A04();
            if (A04.isPrimitive()) {
                A04 = C914045z.A02(A04);
            }
            if (A04 == Long.class || A04 == Integer.class || A04 == Short.class || A04 == Byte.class) {
                z = true;
                return new TIG(cls, A0U, hashMap, A01, A08, z);
            }
        } else {
            C44W A002 = c912845h.A00();
            A08 = c912845h.A08(C45Y.A03);
            A01 = TIG.A01(cls);
            int length2 = A01.length;
            String[] strArr = new String[length2];
            A002.A0k(cls, A01, strArr);
            String[][] strArr2 = new String[length2];
            A002.A0l(cls, A01, strArr2);
            hashMap = new HashMap();
            for (int i = 0; i < length2; i++) {
                Enum r5 = A01[i];
                String str = strArr[i];
                if (str == null) {
                    str = r5.name();
                }
                hashMap.put(str, r5);
                String[] strArr3 = strArr2[i];
                if (strArr3 != null) {
                    for (String str2 : strArr3) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, r5);
                        }
                    }
                }
            }
            A0U = A002.A0U(cls);
        }
        z = false;
        return new TIG(cls, A0U, hashMap, A01, A08, z);
    }

    public static final void A04(C63212SfH c63212SfH, RBH rbh, boolean z, boolean z2) {
        Class A0I = rbh.A0I(0);
        int i = 1;
        if (A0I != String.class && A0I != CharSequence.class) {
            if (A0I != Integer.TYPE && A0I != Integer.class) {
                if (A0I != Long.TYPE && A0I != Long.class) {
                    if (A0I != Double.TYPE && A0I != Double.class) {
                        if (A0I != Boolean.TYPE && A0I != Boolean.class) {
                            if (A0I == BigInteger.class && (z || z2)) {
                                c63212SfH.A03(rbh, 4, z);
                            }
                            if (A0I == BigDecimal.class) {
                                if (z || z2) {
                                    c63212SfH.A03(rbh, 6, z);
                                } else {
                                    return;
                                }
                            }
                            if (z) {
                                c63212SfH.A01(rbh, null, 0, z);
                                return;
                            }
                            return;
                        }
                        if (!z && !z2) {
                            return;
                        } else {
                            i = 7;
                        }
                    } else if (!z && !z2) {
                        return;
                    } else {
                        i = 5;
                    }
                } else if (!z && !z2) {
                    return;
                } else {
                    i = 3;
                }
            } else if (!z && !z2) {
                return;
            } else {
                i = 2;
            }
        } else if (!z && !z2) {
            return;
        }
        c63212SfH.A03(rbh, i, z);
    }

    public static boolean A05(C44W c44w, RBH rbh, AbstractC63037SbC abstractC63037SbC) {
        String A0L;
        return ((abstractC63037SbC == null || !abstractC63037SbC.A0T()) && c44w.A02(rbh.A0H(0)) == null && (abstractC63037SbC == null || (A0L = abstractC63037SbC.A0L()) == null || A0L.isEmpty() || !abstractC63037SbC.A0O())) ? false : true;
    }

    static {
        C913945y c913945y = C913945y.A03;
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
    }

    public static final JsonDeserializer A02(AnonymousClass469 anonymousClass469, AnonymousClass455 anonymousClass455) {
        Object A0Z;
        C44W A00 = anonymousClass469.A02.A00();
        if (A00 != null && (A0Z = A00.A0Z(anonymousClass455)) != null) {
            return anonymousClass469.A0F(A0Z);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC910944l A09(X.AnonymousClass469 r6, X.AbstractC910944l r7, X.RBL r8) {
        /*
            r5 = this;
            X.45h r3 = r6.A02
            X.44W r2 = r3.A00()
            if (r2 != 0) goto L9
            return r7
        L9:
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L25
            X.44l r0 = r7.A04()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.A0b(r8)
            X.SJv r0 = r6.A0H(r0)
            if (r0 == 0) goto L25
            X.558 r7 = (X.AnonymousClass558) r7
            X.558 r7 = r7.A0W(r0)
        L25:
            boolean r0 = r7 instanceof X.C911644s
            if (r0 == 0) goto L30
            r0 = r7
            X.44s r0 = (X.C911644s) r0
            boolean r0 = r0 instanceof X.C102414jI
            if (r0 == 0) goto L52
        L30:
            java.lang.Object r0 = r2.A0W(r8)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r6.A0F(r0)
            if (r0 == 0) goto L3e
            X.44l r7 = r7.A0D(r0)
        L3e:
            X.Tla r4 = r2.A0J(r7, r3, r8)
            X.44l r1 = r7.A03()
            if (r4 != 0) goto L72
            X.RBd r0 = r5.A08(r3, r1)
        L4c:
            if (r0 == 0) goto L52
            X.44l r7 = r7.A0C(r0)
        L52:
            boolean r0 = r2 instanceof X.C44V
            if (r0 == 0) goto L91
            r1 = r2
            X.44V r1 = (X.C44V) r1
            boolean r0 = r7.A0N()
            if (r0 != 0) goto L91
            boolean r0 = r7.A02()
            if (r0 != 0) goto L91
            X.Tla r1 = r1.A0q(r3, r8)
            if (r1 == 0) goto L91
            X.45C r0 = r3.A03
            java.util.ArrayList r0 = r0.A02(r7, r3, r8)
            goto L7d
        L72:
            X.45C r0 = r3.A03
            java.util.ArrayList r0 = r0.A02(r1, r3, r8)
            X.RBd r0 = r4.AEn(r3, r1, r0)
            goto L4c
        L7d:
            X.RBd r0 = r1.AEn(r3, r7, r0)     // Catch: java.lang.Throwable -> L82
            goto L95
        L82:
            r3 = move-exception
            r2 = 0
            java.lang.String r1 = X.C914045z.A09(r3)
            X.R9A r0 = new X.R9A
            r0.<init>(r2, r7, r1)
            r0.initCause(r3)
            throw r0
        L91:
            X.RBd r0 = r5.A08(r3, r7)
        L95:
            if (r0 == 0) goto L9b
            X.44l r7 = r7.A0E(r0)
        L9b:
            X.44l r0 = r2.A0B(r7, r3, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC913745w.A09(X.469, X.44l, X.RBL):X.44l");
    }

    public final RBV A0A(TIB tib, AnonymousClass469 anonymousClass469, C913945y c913945y, RBI rbi, C45B c45b, int i) {
        TIH A00;
        C912845h c912845h = anonymousClass469.A02;
        C44W A002 = c912845h.A00();
        if (A002 == null) {
            A00 = TIH.A09;
        } else {
            A00 = TIH.A00(A002.A0S(rbi), A002.A0V(rbi), A002.A0g(rbi), A002.A0f(rbi));
        }
        C45K c45k = null;
        AbstractC910944l A09 = A09(anonymousClass469, rbi.A01, rbi);
        AbstractC63020Sal abstractC63020Sal = (AbstractC63020Sal) A09.A01;
        if (abstractC63020Sal == null) {
            abstractC63020Sal = A08(c912845h, A09);
        }
        C45K c45k2 = null;
        if (A002 != null) {
            C45J A092 = A002.A09(rbi);
            c45k2 = A092.A01;
            C45K c45k3 = C45K.DEFAULT;
            if (c45k2 == c45k3) {
                c45k2 = null;
            }
            c45k = A092.A00;
            if (c45k == c45k3) {
                c45k = null;
            }
        }
        C45J c45j = ((C45S) c912845h).A01.A01;
        if (c45k2 == null && (c45k2 = c45j.A01) == C45K.DEFAULT) {
            c45k2 = null;
        }
        if (c45k == null && (c45k = c45j.A00) == C45K.DEFAULT) {
            c45k = null;
        }
        if (c45k2 != null || c45k != null) {
            C45K c45k4 = c45k;
            A00 = new TIH(c45k2, c45k4, A00.A06, A00.A02, A00.A03, A00.A05, A00.A04);
        }
        R9k r9k = new R9k(tib, A09, A00, c913945y, rbi, abstractC63020Sal, c45b.A07.A04, i);
        JsonDeserializer A02 = A02(anonymousClass469, rbi);
        if (A02 != null || (A02 = (JsonDeserializer) A09.A02) != null) {
            return r9k.A04(anonymousClass469.A0C(r9k, A09, A02));
        }
        return r9k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r2.getClass() != r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC63035SbA A0B(X.AnonymousClass469 r5, X.C45B r6) {
        /*
            r4 = this;
            X.45h r2 = r5.A02
            X.454 r1 = r6.A07
            X.44W r0 = r2.A00()
            boolean r0 = r0 instanceof X.C44V
            if (r0 == 0) goto L3a
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonValueInstantiator> r0 = com.fasterxml.jackson.databind.annotation.JsonValueInstantiator.class
            java.lang.annotation.Annotation r0 = r1.A06(r0)
            com.fasterxml.jackson.databind.annotation.JsonValueInstantiator r0 = (com.fasterxml.jackson.databind.annotation.JsonValueInstantiator) r0
            if (r0 == 0) goto L3a
            java.lang.Class r1 = r0.value()
            if (r1 == 0) goto L3a
            boolean r0 = r1 instanceof X.AbstractC63035SbA
            if (r0 != 0) goto L36
            boolean r0 = X.C914045z.A0I(r1)
            if (r0 != 0) goto L3a
            java.lang.Class<X.SbA> r0 = X.AbstractC63035SbA.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto La8
            boolean r0 = r2.A05()
            java.lang.Object r1 = X.C914045z.A03(r1, r0)
        L36:
            X.SbA r1 = (X.AbstractC63035SbA) r1
            if (r1 != 0) goto L47
        L3a:
            X.44l r0 = r6.A05
            java.lang.Class r1 = r0.A00
            java.lang.Class<X.TID> r0 = X.TID.class
            if (r1 != r0) goto L64
            X.R9l r1 = new X.R9l
            r1.<init>()
        L47:
            X.461 r0 = r4.A00
            X.465[] r3 = r0.A04
            int r0 = r3.length
            if (r0 <= 0) goto La7
            X.55A r2 = new X.55A
            r2.<init>(r3)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            r2.next()
            java.lang.String r0 = "findValueInstantiator"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L64:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L7e
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            if (r1 != r0) goto L73
            X.R9n r1 = X.R9n.A00
            goto L47
        L73:
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            java.lang.Class r0 = r2.getClass()
            if (r0 == r1) goto L9c
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            goto L96
        L7e:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto La2
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            if (r1 != r0) goto L8d
            X.R9p r1 = X.R9p.A00
            goto L47
        L8d:
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            if (r1 != r0) goto L94
            X.R9o r1 = X.R9o.A00
            goto L47
        L94:
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
        L96:
            java.lang.Class r0 = r2.getClass()
            if (r0 != r1) goto La2
        L9c:
            X.R9m r1 = new X.R9m
            r1.<init>(r2)
            goto L47
        La2:
            X.R9r r1 = r4.A0C(r5, r6)
            goto L47
        La7:
            return r1
        La8:
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.String r0 = X.AnonymousClass001.A0g(r2, r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC913745w.A0B(X.469, X.45B):X.SbA");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x028f, code lost:
    
        if (r7 != null) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.R9r A0C(X.AnonymousClass469 r32, X.C45B r33) {
        /*
            Method dump skipped, instructions count: 1527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC913745w.A0C(X.469, X.45B):X.R9r");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        if (r5.A0O() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0089, code lost:
    
        if (r10 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(X.AnonymousClass469 r15, X.C1126656w r16, X.C62946SYo r17, X.C63212SfH r18, X.C45B r19) {
        /*
            r14 = this;
            r4 = r17
            int r5 = r4.A00
            r2 = 1
            r13 = 0
            r7 = r14
            r9 = r15
            r3 = r18
            r12 = r19
            if (r2 == r5) goto L34
            r2 = 0
            r1 = -1
        L10:
            if (r2 >= r5) goto L20
            X.SG6[] r0 = r4.A02
            r0 = r0[r2]
            X.TIB r0 = r0.A00
            if (r0 != 0) goto L1d
            if (r1 >= 0) goto Lbb
            r1 = r2
        L1d:
            int r2 = r2 + 1
            goto L10
        L20:
            if (r1 < 0) goto Lbb
            X.SG6[] r0 = r4.A02
            r0 = r0[r1]
            X.SbC r0 = r0.A02
            if (r0 == 0) goto L30
            X.45y r0 = r0.A0C()
            if (r0 != 0) goto Lbb
        L30:
            r14.A0E(r15, r4, r3, r12)
            return
        L34:
            X.SG6[] r1 = r4.A02
            r6 = r1[r13]
            X.RBI r11 = r6.A01
            X.TIB r8 = r6.A00
            r0 = r16
            java.lang.Integer r0 = r0.A00
            int r5 = r0.intValue()
            if (r5 == r13) goto Laa
            if (r5 == r2) goto L81
            r0 = 3
            if (r5 == r0) goto L9a
            X.SbC r5 = r6.A02
            if (r5 == 0) goto L7f
            boolean r0 = r5.A0T()
            if (r0 == 0) goto L7f
            X.45y r10 = r5.A0C()
            if (r10 != 0) goto L71
        L5b:
            if (r8 != 0) goto L71
            if (r5 == 0) goto Laa
            r0 = r1[r13]
            X.SbC r0 = r0.A02
            if (r0 == 0) goto Laa
            X.45y r10 = r0.A0C()
            if (r10 == 0) goto Laa
            boolean r0 = r5.A0O()
            if (r0 == 0) goto Laa
        L71:
            X.RBV r0 = r7.A0A(r8, r9, r10, r11, r12, r13)
            X.RBV[] r1 = new X.RBV[]{r0}
            X.RBH r0 = r4.A01
            r3.A02(r0, r1, r2)
            return
        L7f:
            r10 = 0
            goto L5b
        L81:
            X.SbC r0 = r6.A02
            if (r0 == 0) goto L98
            X.45y r10 = r0.A0C()
            if (r10 != 0) goto L71
        L8b:
            if (r8 != 0) goto L71
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator"
            goto La2
        L98:
            r10 = 0
            goto L8b
        L9a:
            X.RBH r0 = r4.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`"
        La2:
            r15.A0a(r12, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Laa:
            X.RBH r0 = r4.A01
            A04(r3, r0, r2, r2)
            r0 = r1[r13]
            X.SbC r1 = r0.A02
            if (r1 == 0) goto Lbe
            X.RBQ r1 = (X.RBQ) r1
            r0 = 0
            r1.A00 = r0
            return
        Lbb:
            r14.A0F(r15, r4, r3, r12)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC913745w.A0D(X.469, X.56w, X.SYo, X.SfH, X.45B):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        r14.A0a(r17, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.AnonymousClass469 r14, X.C62946SYo r15, X.C63212SfH r16, X.C45B r17) {
        /*
            r13 = this;
            int r5 = r15.A00
            X.RBV[] r4 = new X.RBV[r5]
            r3 = 0
            r2 = -1
            r12 = 0
        L7:
            r1 = 1
            r8 = r14
            r11 = r17
            if (r12 >= r5) goto L26
            X.SG6[] r0 = r15.A02
            r0 = r0[r12]
            X.RBI r10 = r0.A01
            X.TIB r7 = r0.A00
            if (r7 == 0) goto L22
            r9 = 0
            r6 = r13
            X.RBV r0 = r6.A0A(r7, r8, r9, r10, r11, r12)
            r4[r12] = r0
        L1f:
            int r12 = r12 + 1
            goto L7
        L22:
            if (r2 >= 0) goto L2f
            r2 = r12
            goto L1f
        L26:
            if (r2 >= 0) goto L45
            java.lang.Object[] r1 = new java.lang.Object[]{r15}
            java.lang.String r0 = "No argument left as delegating for Creator %s: exactly one required"
            goto L3d
        L2f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r15}
            java.lang.String r0 = "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed"
        L3d:
            r14.A0a(r11, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L45:
            X.RBH r0 = r15.A01
            r6 = r16
            if (r5 != r1) goto L5c
            A04(r6, r0, r1, r1)
            X.SG6[] r0 = r15.A02
            r0 = r0[r3]
            X.SbC r1 = r0.A02
            if (r1 == 0) goto L5b
            X.RBQ r1 = (X.RBQ) r1
            r0 = 0
            r1.A00 = r0
        L5b:
            return
        L5c:
            r6.A01(r0, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC913745w.A0E(X.469, X.SYo, X.SfH, X.45B):void");
    }

    public final void A0F(AnonymousClass469 anonymousClass469, C62946SYo c62946SYo, C63212SfH c63212SfH, C45B c45b) {
        Object[] objArr;
        String str;
        C913945y c913945y;
        int i = c62946SYo.A00;
        RBV[] rbvArr = new RBV[i];
        for (int i2 = 0; i2 < i; i2++) {
            SG6 sg6 = c62946SYo.A02[i2];
            TIB tib = sg6.A00;
            RBI rbi = sg6.A01;
            AbstractC63037SbC abstractC63037SbC = sg6.A02;
            if (abstractC63037SbC == null || (c913945y = abstractC63037SbC.A0C()) == null) {
                if (anonymousClass469.A02.A00().A0L(rbi) != null) {
                    objArr = new Object[]{Integer.valueOf(rbi.A00)};
                    str = "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported";
                } else {
                    c913945y = null;
                    if (tib == null) {
                        objArr = new Object[]{Integer.valueOf(i2), c62946SYo};
                        str = "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator";
                    }
                }
                anonymousClass469.A0a(c45b, str, objArr);
                throw C00O.createAndThrow();
            }
            rbvArr[i2] = A0A(tib, anonymousClass469, c913945y, rbi, c45b, i2);
        }
        c63212SfH.A02(c62946SYo.A01, rbvArr, true);
    }

    public AbstractC913745w(AnonymousClass461 anonymousClass461) {
        this.A00 = anonymousClass461;
    }
}
