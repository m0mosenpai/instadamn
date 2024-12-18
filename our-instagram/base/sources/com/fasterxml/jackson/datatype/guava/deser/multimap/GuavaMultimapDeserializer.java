package com.fasterxml.jackson.datatype.guava.deser.multimap;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC62638SJv;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.AnonymousClass558;
import X.C05F;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C18C;
import X.C46g;
import X.C64175T2e;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.TID;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.list.LinkedListMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.HashMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.LinkedHashMultimapDeserializer;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedListMultimap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class GuavaMultimapDeserializer extends StdDeserializer implements InterfaceC102474jf {
    public static final List A07 = ImmutableList.of((Object) "copyOf", (Object) "create");
    public final JsonDeserializer A00;
    public final AbstractC62638SJv A01;
    public final InterfaceC102444jN A02;
    public final AbstractC63020Sal A03;
    public final AnonymousClass558 A04;
    public final Method A05;
    public final boolean A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GuavaMultimapDeserializer(com.fasterxml.jackson.databind.JsonDeserializer r11, X.AbstractC62638SJv r12, X.AbstractC63020Sal r13, X.AnonymousClass558 r14) {
        /*
            r10 = this;
            r8 = r14
            java.lang.Class r5 = r14.A00
            java.lang.Class<com.google.common.collect.LinkedListMultimap> r0 = com.google.common.collect.LinkedListMultimap.class
            r6 = 0
            if (r5 == r0) goto L44
            java.lang.Class<X.4OI> r0 = X.C4OI.class
            if (r5 == r0) goto L44
            java.lang.Class<X.46g> r4 = X.C46g.class
            if (r5 == r4) goto L44
            java.util.List r3 = com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.A07
            java.util.Iterator r2 = r3.iterator()
        L16:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2b
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            java.lang.Class[] r0 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L16
            java.lang.reflect.Method r9 = r5.getMethod(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L16
            if (r9 == 0) goto L16
            goto L45
        L2b:
            java.util.Iterator r2 = r3.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L44
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            java.lang.Class[] r0 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L2f
            java.lang.reflect.Method r9 = r5.getMethod(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L2f
            if (r9 == 0) goto L2f
            goto L45
        L44:
            r9 = r6
        L45:
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.<init>(com.fasterxml.jackson.databind.JsonDeserializer, X.SJv, X.Sal, X.558):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C46g A0x;
        Object A0q;
        Object A0D;
        Object A0q2;
        Object A0D2;
        Object A0D3;
        if (anonymousClass469.A0j(EnumC912945i.A06)) {
            A0x = A0x();
            A00(c16l, C16R.A0D);
            while (c16l.A1J() != C16R.A09) {
                AbstractC62638SJv abstractC62638SJv = this.A01;
                if (abstractC62638SJv != null) {
                    A0q2 = abstractC62638SJv.A00(anonymousClass469, c16l.A0q());
                } else {
                    A0q2 = c16l.A0q();
                }
                c16l.A1J();
                if (c16l.A10() != C16R.A0C) {
                    if (c16l.A11() == C16R.A0G) {
                        A0D2 = null;
                    } else {
                        AbstractC63020Sal abstractC63020Sal = this.A03;
                        JsonDeserializer jsonDeserializer = this.A00;
                        if (abstractC63020Sal != null) {
                            A0D2 = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
                        } else {
                            A0D2 = jsonDeserializer.A0D(c16l, anonymousClass469);
                        }
                    }
                    A0x.E6z(A0q2, A0D2);
                } else {
                    while (c16l.A1J() != C16R.A08) {
                        if (c16l.A11() == C16R.A0G) {
                            A0D3 = null;
                        } else {
                            AbstractC63020Sal abstractC63020Sal2 = this.A03;
                            JsonDeserializer jsonDeserializer2 = this.A00;
                            if (abstractC63020Sal2 != null) {
                                A0D3 = jsonDeserializer2.A0J(c16l, anonymousClass469, abstractC63020Sal2);
                            } else {
                                A0D3 = jsonDeserializer2.A0D(c16l, anonymousClass469);
                            }
                        }
                        A0x.E6z(A0q2, A0D3);
                    }
                }
            }
            Method method = this.A05;
            if (method != null) {
                try {
                    return method.invoke(null, A0x);
                } catch (IllegalAccessException e) {
                    e = e;
                    String A0v = AbstractC166997dE.A0v(this.A04, AbstractC166997dE.A11("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C102314j6(c16l, A0v, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    String A0v2 = AbstractC166997dE.A0v(this.A04, AbstractC166997dE.A11("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C102314j6(c16l, A0v2, e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    String A0v3 = AbstractC166997dE.A0v(this.A04, AbstractC166997dE.A11("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C102314j6(c16l, A0v3, e);
                }
            }
        } else {
            A0x = A0x();
            A00(c16l, C16R.A0D);
            while (c16l.A1J() != C16R.A09) {
                AbstractC62638SJv abstractC62638SJv2 = this.A01;
                if (abstractC62638SJv2 != null) {
                    A0q = abstractC62638SJv2.A00(anonymousClass469, c16l.A0q());
                } else {
                    A0q = c16l.A0q();
                }
                c16l.A1J();
                A00(c16l, C16R.A0C);
                while (c16l.A1J() != C16R.A08) {
                    if (c16l.A11() == C16R.A0G) {
                        if (!this.A06) {
                            A0D = this.A02.BXX(anonymousClass469);
                        }
                    } else {
                        AbstractC63020Sal abstractC63020Sal3 = this.A03;
                        JsonDeserializer jsonDeserializer3 = this.A00;
                        if (abstractC63020Sal3 != null) {
                            A0D = jsonDeserializer3.A0J(c16l, anonymousClass469, abstractC63020Sal3);
                        } else {
                            A0D = jsonDeserializer3.A0D(c16l, anonymousClass469);
                        }
                    }
                    A0x.E6z(A0q, A0D);
                }
            }
            Method method2 = this.A05;
            if (method2 != null) {
                try {
                    return method2.invoke(null, A0x);
                } catch (IllegalAccessException e4) {
                    e = e4;
                    String A0v4 = AbstractC166997dE.A0v(this.A04, AbstractC166997dE.A11("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C102314j6(c16l, A0v4, e);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    String A0v5 = AbstractC166997dE.A0v(this.A04, AbstractC166997dE.A11("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C102314j6(c16l, A0v5, e);
                } catch (InvocationTargetException e6) {
                    e = e6;
                    String A0v6 = AbstractC166997dE.A0v(this.A04, AbstractC166997dE.A11("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C102314j6(c16l, A0v6, e);
                }
            }
        }
        return A0x;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0C;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.common.collect.AbstractMapBasedMultimap, X.46g, java.lang.Object, com.google.common.collect.LinkedHashMultimap] */
    public final C46g A0x() {
        if (this instanceof LinkedHashMultimapDeserializer) {
            CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(16);
            ?? obj = new Object();
            C18C.A0E(compactLinkedHashMap.isEmpty());
            obj.A01 = compactLinkedHashMap;
            obj.valueSetCapacity = 2;
            obj.valueSetCapacity = 2;
            LinkedHashMultimap.ValueEntry valueEntry = new LinkedHashMultimap.ValueEntry(null, null, null, 0);
            obj.A00 = valueEntry;
            valueEntry.successorInMultimap = valueEntry;
            valueEntry.predecessorInMultimap = valueEntry;
            return obj;
        }
        if (this instanceof HashMultimapDeserializer) {
            return new HashMultimap();
        }
        if (this instanceof LinkedListMultimapDeserializer) {
            return new LinkedListMultimap();
        }
        return new ArrayListMultimap();
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        JsonDeserializer A0D;
        AbstractC62638SJv abstractC62638SJv = this.A01;
        if (abstractC62638SJv == null) {
            abstractC62638SJv = anonymousClass469.A0G(this.A04.A00);
        }
        JsonDeserializer jsonDeserializer = this.A00;
        AnonymousClass558 anonymousClass558 = this.A04;
        AbstractC910944l abstractC910944l = anonymousClass558.A01;
        if (jsonDeserializer == null) {
            A0D = anonymousClass469.A0B(interfaceC65620ToB, abstractC910944l);
        } else {
            A0D = anonymousClass469.A0D(interfaceC65620ToB, abstractC910944l, jsonDeserializer);
        }
        AbstractC63020Sal abstractC63020Sal = this.A03;
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        Method method = this.A05;
        InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, A0D);
        if (this instanceof LinkedHashMultimapDeserializer) {
            return new GuavaMultimapDeserializer(A0D, abstractC62638SJv, A0V, abstractC63020Sal, anonymousClass558, method);
        }
        if (this instanceof HashMultimapDeserializer) {
            return new GuavaMultimapDeserializer(A0D, abstractC62638SJv, A0V, abstractC63020Sal, anonymousClass558, method);
        }
        if (this instanceof LinkedListMultimapDeserializer) {
            return new GuavaMultimapDeserializer(A0D, abstractC62638SJv, A0V, abstractC63020Sal, anonymousClass558, method);
        }
        return new GuavaMultimapDeserializer(A0D, abstractC62638SJv, A0V, abstractC63020Sal, anonymousClass558, method);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, X.400, X.4j6, java.io.IOException] */
    public static void A00(C16L c16l, C16R c16r) {
        if (c16l.A11() == c16r) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Expecting ");
        A1C.append(c16r);
        A1C.append(", found ");
        String A0v = AbstractC166997dE.A0v(c16l.A11(), A1C);
        TID A1H = c16l.A1H();
        ?? iOException = new IOException(A0v, null);
        iOException.A00 = A1H;
        iOException.A01 = c16l;
        throw iOException;
    }

    public GuavaMultimapDeserializer(JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, InterfaceC102444jN interfaceC102444jN, AbstractC63020Sal abstractC63020Sal, AnonymousClass558 anonymousClass558, Method method) {
        super(anonymousClass558);
        boolean A1X;
        this.A04 = anonymousClass558;
        this.A01 = abstractC62638SJv;
        this.A03 = abstractC63020Sal;
        this.A00 = jsonDeserializer;
        this.A05 = method;
        this.A02 = interfaceC102444jN;
        if (interfaceC102444jN == null) {
            A1X = false;
        } else {
            A1X = AbstractC167007dF.A1X(interfaceC102444jN, C64175T2e.A02);
        }
        this.A06 = A1X;
    }
}
