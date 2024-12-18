package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC31174DnI;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AbstractC913845x;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16M;
import X.C16R;
import X.C46A;
import X.C910844k;
import X.C911644s;
import X.C912845h;
import X.C914045z;
import X.EnumC912945i;
import X.InterfaceC102464je;
import X.InterfaceC102474jf;
import X.RD4;
import X.SQ8;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class UntypedObjectDeserializer extends StdDeserializer implements InterfaceC102464je, InterfaceC102474jf {
    public static final Object[] A07 = new Object[0];
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public JsonDeserializer A02;
    public JsonDeserializer A03;
    public AbstractC910944l A04;
    public AbstractC910944l A05;
    public final boolean A06;

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public class Vanilla extends StdDeserializer {
        public static final Vanilla A01 = new Vanilla(false);
        public final boolean A00;

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            return A00(c16l, anonymousClass469, 0);
        }

        public Vanilla(boolean z) {
            super(Object.class);
            this.A00 = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        
            if (r18.A1J() == X.C16R.A09) goto L8;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.Object A00(X.C16L r18, X.AnonymousClass469 r19, int r20) {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A00(X.16L, X.469, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
        
            if (r1 != 5) goto L14;
         */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A0C(X.C16L r5, X.AnonymousClass469 r6, java.lang.Object r7) {
            /*
                r4 = this;
                boolean r0 = r4.A00
                if (r0 != 0) goto L17
                int r1 = r5.A0x()
                r0 = 1
                if (r1 == r0) goto L3b
                r0 = 2
                if (r1 == r0) goto L3a
                r0 = 3
                if (r1 == r0) goto L1d
                r0 = 4
                if (r1 == r0) goto L3a
                r0 = 5
                if (r1 == r0) goto L44
            L17:
                r0 = 0
                java.lang.Object r0 = r4.A00(r5, r6, r0)
                return r0
            L1d:
                X.16R r0 = r5.A1J()
                X.16R r2 = X.C16R.A08
                if (r0 == r2) goto L3a
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L17
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1
            L2c:
                r0 = 0
                java.lang.Object r0 = r4.A00(r5, r6, r0)
                r1.add(r0)
                X.16R r0 = r5.A1J()
                if (r0 != r2) goto L2c
            L3a:
                return r7
            L3b:
                X.16R r1 = r5.A1J()
                X.16R r0 = X.C16R.A09
                if (r1 != r0) goto L44
                return r7
            L44:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L17
                r3 = r7
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r2 = r5.A0Y()
            L4f:
                r5.A1J()
                java.lang.Object r1 = r3.get(r2)
                if (r1 == 0) goto L68
                java.lang.Object r0 = r4.A0C(r5, r6, r1)
            L5c:
                if (r0 == r1) goto L61
                r3.put(r2, r0)
            L61:
                java.lang.String r2 = r5.A1N()
                if (r2 != 0) goto L4f
                return r7
            L68:
                r0 = 0
                java.lang.Object r0 = r4.A00(r5, r6, r0)
                goto L5c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A0C(X.16L, X.469, java.lang.Object):java.lang.Object");
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Boolean A0G(C912845h c912845h) {
            if (this.A00) {
                return Boolean.FALSE;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Integer A0I() {
            return C05F.A0Y;
        }

        public final void A0x(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, Object obj2, String str, String str2, Map map) {
            boolean A0i = anonymousClass469.A0i(C16M.DUPLICATE_PROPERTIES);
            if (A0i) {
                if (obj instanceof List) {
                    ((List) obj).add(obj2);
                    map.put(str, obj);
                } else {
                    ArrayList A0z = AbstractC31174DnI.A0z(obj);
                    A0z.add(obj2);
                    map.put(str, A0z);
                }
            }
            while (str2 != null) {
                c16l.A1J();
                Object A00 = A00(c16l, anonymousClass469, 0);
                Object put = map.put(str2, A00);
                if (put != null && A0i) {
                    if (put instanceof List) {
                        ((List) put).add(A00);
                        map.put(str2, put);
                    } else {
                        ArrayList A0z2 = AbstractC31174DnI.A0z(put);
                        A0z2.add(A00);
                        map.put(str2, A0z2);
                    }
                }
                str2 = c16l.A1N();
            }
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
            int A0x = c16l.A0x();
            if (A0x != 1 && A0x != 3) {
                switch (A0x) {
                    case 5:
                        break;
                    case 6:
                        return c16l.A1P();
                    case 7:
                        if (anonymousClass469.A0j(EnumC912945i.A0P)) {
                            return c16l.A0s();
                        }
                        break;
                    case 8:
                        if (anonymousClass469.A0j(EnumC912945i.A0O)) {
                            return c16l.A0r();
                        }
                        break;
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        return c16l.A0V();
                    default:
                        anonymousClass469.A0T(c16l, Object.class);
                        throw C00O.createAndThrow();
                }
                return c16l.A0p();
            }
            return abstractC63020Sal.A03(c16l, anonymousClass469);
        }

        public Vanilla() {
            this(false);
        }
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super(Object.class);
        this.A01 = untypedObjectDeserializer.A01;
        this.A00 = untypedObjectDeserializer.A00;
        this.A03 = untypedObjectDeserializer.A03;
        this.A02 = untypedObjectDeserializer.A02;
        this.A04 = untypedObjectDeserializer.A04;
        this.A05 = untypedObjectDeserializer.A05;
        this.A06 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9.put(r1, r6) != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r19.A1J();
        r14 = A0D(r19, r20);
        r13 = r9.put(r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r13 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        r8 = r19.A1N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r8 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        A0z(r19, r20, r13, r14, r8, r19.A1N(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap A0y(X.C16L r19, X.AnonymousClass469 r20) {
        /*
            r18 = this;
            r3 = r19
            X.16R r1 = r3.A10()
            X.16R r0 = X.C16R.A0D
            r2 = r18
            r4 = r20
            if (r1 != r0) goto L60
            java.lang.String r7 = r3.A1N()
        L12:
            r0 = 2
            if (r7 != 0) goto L1b
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r0)
        L1a:
            return r9
        L1b:
            r3.A1J()
            java.lang.Object r5 = r2.A0D(r3, r4)
            java.lang.String r1 = r3.A1N()
            if (r1 != 0) goto L31
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r0)
            r9.put(r7, r5)
            return r9
        L31:
            r3.A1J()
            java.lang.Object r6 = r2.A0D(r3, r4)
            java.lang.String r8 = r3.A1N()
            if (r8 != 0) goto L51
            r0 = 4
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r0)
            r9.put(r7, r5)
            java.lang.Object r0 = r9.put(r1, r6)
            if (r0 == 0) goto L1a
        L4d:
            r2.A0z(r3, r4, r5, r6, r7, r8, r9)
            return r9
        L51:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r9.put(r7, r5)
            java.lang.Object r0 = r9.put(r1, r6)
            if (r0 == 0) goto L7b
            goto L4d
        L60:
            X.16R r0 = X.C16R.A0A
            if (r1 != r0) goto L69
            java.lang.String r7 = r3.A0Y()
            goto L12
        L69:
            X.16R r0 = X.C16R.A09
            if (r1 == r0) goto L79
            java.lang.Class r0 = r2.A0H()
            r4.A0T(r3, r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L79:
            r7 = 0
            goto L12
        L7b:
            r3.A1J()
            java.lang.Object r14 = r2.A0D(r3, r4)
            java.lang.Object r13 = r9.put(r8, r14)
            if (r13 == 0) goto L96
            java.lang.String r16 = r3.A1N()
            r10 = r2
            r11 = r3
            r12 = r4
            r15 = r8
            r17 = r9
            r10.A0z(r11, r12, r13, r14, r15, r16, r17)
            return r9
        L96:
            java.lang.String r8 = r3.A1N()
            if (r8 != 0) goto L7b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.A0y(X.16L, X.469):java.util.LinkedHashMap");
    }

    public final void A0z(C16L c16l, AnonymousClass469 anonymousClass469, Object obj, Object obj2, String str, String str2, Map map) {
        boolean A0i = anonymousClass469.A0i(C16M.DUPLICATE_PROPERTIES);
        if (A0i) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                map.put(str, arrayList);
            }
        }
        while (str2 != null) {
            c16l.A1J();
            Object A0D = A0D(c16l, anonymousClass469);
            Object put = map.put(str2, A0D);
            if (put != null && A0i) {
                if (put instanceof List) {
                    ((List) put).add(A0D);
                    map.put(str, put);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(put);
                    arrayList2.add(A0D);
                    map.put(str, arrayList2);
                }
            }
            str2 = c16l.A1N();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (java.lang.Boolean.FALSE.equals(null) == false) goto L5;
     */
    @Override // X.InterfaceC102474jf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALr(X.InterfaceC65620ToB r4, X.AnonymousClass469 r5) {
        /*
            r3 = this;
            if (r4 != 0) goto Lc
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 0
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto Ld
        Lc:
            r2 = 0
        Ld:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A03
            if (r0 != 0) goto L31
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A02
            if (r0 != 0) goto L31
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A01
            if (r0 != 0) goto L31
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A00
            if (r0 != 0) goto L31
            java.lang.Class r1 = r3.getClass()
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer> r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.class
            if (r1 != r0) goto L31
            if (r2 == 0) goto L2e
            r1 = 1
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla
            r0.<init>(r1)
            return r0
        L2e:
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A01
            return r0
        L31:
            boolean r0 = r3.A06
            if (r2 == r0) goto L3b
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            r0.<init>(r3, r2)
            return r0
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.ALr(X.ToB, X.469):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // X.InterfaceC102464je
    public final void EK8(AnonymousClass469 anonymousClass469) {
        C46A c46a;
        AbstractC913845x abstractC913845x;
        JsonDeserializer A01;
        JsonDeserializer A012;
        AbstractC910944l A0A = anonymousClass469.A0A(Object.class);
        AbstractC910944l A0A2 = anonymousClass469.A0A(String.class);
        C910844k A05 = anonymousClass469.A05();
        AbstractC910944l abstractC910944l = this.A04;
        if (abstractC910944l == null) {
            RD4 A0A3 = A05.A0A(A0A, List.class);
            c46a = anonymousClass469.A03;
            abstractC913845x = anonymousClass469.A04;
            A01 = c46a.A01(anonymousClass469, A0A3, abstractC913845x);
            if (C914045z.A0K(A01)) {
                A01 = null;
            }
        } else {
            c46a = anonymousClass469.A03;
            abstractC913845x = anonymousClass469.A04;
            A01 = c46a.A01(anonymousClass469, abstractC910944l, abstractC913845x);
        }
        this.A00 = A01;
        AbstractC910944l abstractC910944l2 = this.A05;
        if (abstractC910944l2 == null) {
            A012 = c46a.A01(anonymousClass469, A05.A0B(A0A2, A0A, Map.class), abstractC913845x);
            if (C914045z.A0K(A012)) {
                A012 = null;
            }
        } else {
            A012 = c46a.A01(anonymousClass469, abstractC910944l2, abstractC913845x);
        }
        this.A01 = A012;
        JsonDeserializer A013 = c46a.A01(anonymousClass469, A0A2, abstractC913845x);
        if (C914045z.A0K(A013)) {
            A013 = null;
        }
        this.A03 = A013;
        JsonDeserializer A014 = c46a.A01(anonymousClass469, A05.A09(Number.class), abstractC913845x);
        if (C914045z.A0K(A014)) {
            A014 = null;
        }
        this.A02 = A014;
        C911644s c911644s = C910844k.A07;
        this.A01 = anonymousClass469.A0D(null, c911644s, this.A01);
        this.A00 = anonymousClass469.A0D(null, c911644s, this.A00);
        this.A03 = anonymousClass469.A0D(null, c911644s, this.A03);
        this.A02 = anonymousClass469.A0D(null, c911644s, this.A02);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        switch (c16l.A0x()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer jsonDeserializer = this.A01;
                if (jsonDeserializer != null) {
                    return jsonDeserializer.A0D(c16l, anonymousClass469);
                }
                return A0y(c16l, anonymousClass469);
            case 3:
                if (anonymousClass469.A0j(EnumC912945i.A0Q)) {
                    return A10(c16l, anonymousClass469);
                }
                JsonDeserializer jsonDeserializer2 = this.A00;
                if (jsonDeserializer2 != null) {
                    return jsonDeserializer2.A0D(c16l, anonymousClass469);
                }
                return A0x(c16l, anonymousClass469);
            case 4:
            default:
                anonymousClass469.A0T(c16l, Object.class);
                throw C00O.createAndThrow();
            case 6:
                JsonDeserializer jsonDeserializer3 = this.A03;
                if (jsonDeserializer3 != null) {
                    return jsonDeserializer3.A0D(c16l, anonymousClass469);
                }
                return c16l.A1P();
            case 7:
                JsonDeserializer jsonDeserializer4 = this.A02;
                if (jsonDeserializer4 != null) {
                    return jsonDeserializer4.A0D(c16l, anonymousClass469);
                }
                if ((StdDeserializer.A02 & anonymousClass469.A01) != 0) {
                    return StdDeserializer.A07(c16l, anonymousClass469);
                }
                return c16l.A0p();
            case 8:
                JsonDeserializer jsonDeserializer5 = this.A02;
                if (jsonDeserializer5 != null) {
                    return jsonDeserializer5.A0D(c16l, anonymousClass469);
                }
                if (anonymousClass469.A0j(EnumC912945i.A0O)) {
                    return c16l.A0r();
                }
                return c16l.A0p();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return c16l.A0V();
        }
    }

    public final ArrayList A0x(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A1J = c16l.A1J();
        C16R c16r = C16R.A08;
        int i = 2;
        if (A1J == c16r) {
            return new ArrayList(2);
        }
        Object A0D = A0D(c16l, anonymousClass469);
        if (c16l.A1J() == c16r) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(A0D);
            return arrayList;
        }
        Object A0D2 = A0D(c16l, anonymousClass469);
        if (c16l.A1J() == c16r) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(A0D);
            arrayList2.add(A0D2);
            return arrayList2;
        }
        SQ8 A0M = anonymousClass469.A0M();
        Object[] A03 = A0M.A03();
        A03[0] = A0D;
        A03[1] = A0D2;
        int i2 = 2;
        while (true) {
            Object A0D3 = A0D(c16l, anonymousClass469);
            i++;
            if (i2 >= A03.length) {
                A03 = A0M.A04(A03);
                i2 = 0;
            }
            int i3 = i2 + 1;
            A03[i2] = A0D3;
            if (c16l.A1J() == c16r) {
                ArrayList arrayList3 = new ArrayList(i);
                A0M.A01(arrayList3, A03, i3);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    public final Object[] A10(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A1J = c16l.A1J();
        C16R c16r = C16R.A08;
        if (A1J == c16r) {
            return A07;
        }
        SQ8 A0M = anonymousClass469.A0M();
        Object[] A03 = A0M.A03();
        int i = 0;
        while (true) {
            Object A0D = A0D(c16l, anonymousClass469);
            if (i >= A03.length) {
                A03 = A0M.A04(A03);
                i = 0;
            }
            int i2 = i + 1;
            A03[i] = A0D;
            if (c16l.A1J() == c16r) {
                int i3 = A0M.A00 + i2;
                Object[] objArr = new Object[i3];
                A0M.A02(A03, i3, i2, objArr);
                A0M.A00();
                return objArr;
            }
            i = i2;
        }
    }

    public UntypedObjectDeserializer(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2) {
        super(Object.class);
        this.A04 = abstractC910944l;
        this.A05 = abstractC910944l2;
        this.A06 = false;
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((AbstractC910944l) null, (AbstractC910944l) null);
    }
}
