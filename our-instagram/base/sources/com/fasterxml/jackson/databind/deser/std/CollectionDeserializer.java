package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC63020Sal;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C914045z;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.R97;
import X.R9w;
import X.SG7;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Collection;
import java.util.List;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class CollectionDeserializer extends ContainerDeserializerBase implements InterfaceC102474jf {
    public final JsonDeserializer A00;
    public final JsonDeserializer A01;
    public final AbstractC63035SbA A02;
    public final AbstractC63020Sal A03;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        Collection collection = (Collection) obj;
        if (c16l.A16()) {
            return A0x(c16l, anonymousClass469, collection);
        }
        A0y(c16l, anonymousClass469, collection);
        return collection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1 != null) goto L20;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.C16L r6, X.AnonymousClass469 r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.A00
            if (r0 == 0) goto Lf
            X.SbA r1 = r5.A02
            java.lang.Object r0 = r0.A0D(r6, r7)
            java.lang.Object r0 = r1.A09(r7, r0)
            return r0
        Lf:
            boolean r0 = r6.A16()
            if (r0 == 0) goto L28
            boolean r0 = r5 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L1f
            r0 = 0
        L1a:
            java.util.Collection r0 = r5.A0x(r6, r7, r0)
            return r0
        L1f:
            X.SbA r0 = r5.A02
            java.lang.Object r0 = r0.A04(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L1a
        L28:
            X.16R r0 = X.C16R.A0J
            boolean r0 = r6.A19(r0)
            if (r0 == 0) goto L69
            java.lang.String r4 = r6.A1P()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L4e
            java.lang.Integer r1 = X.C05F.A01
            java.lang.Integer r0 = X.C05F.A1I
            java.lang.Integer r1 = r7.A0N(r1, r0)
            java.lang.String r0 = "empty String (\"\")"
            r5.A0t(r7, r1, r4, r0)
            if (r1 == 0) goto L69
        L49:
            java.lang.Object r0 = r5.A0i(r7, r1)
            return r0
        L4e:
            int r3 = r4.length()
            r2 = 0
        L53:
            if (r2 >= r3) goto L60
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 > r0) goto L69
            int r2 = r2 + 1
            goto L53
        L60:
            java.lang.Integer r1 = X.C05F.A01
            java.lang.Integer r0 = X.C05F.A00
            java.lang.Integer r1 = r7.A0O(r1, r0)
            goto L49
        L69:
            boolean r0 = r5 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L72
            r0 = 0
        L6e:
            r5.A0y(r6, r7, r0)
            return r0
        L72:
            X.SbA r0 = r5.A02
            java.lang.Object r0 = r0.A04(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A01;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        if (this.A01 == null && this.A03 == null && this.A00 == null) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC63035SbA A0W() {
        return this.A02;
    }

    public final void A0y(C16L c16l, AnonymousClass469 anonymousClass469, Collection collection) {
        Object A0J;
        Boolean bool = super.A02;
        if (bool == Boolean.TRUE || (bool == null && anonymousClass469.A0j(EnumC912945i.A06))) {
            JsonDeserializer jsonDeserializer = this.A01;
            AbstractC63020Sal abstractC63020Sal = this.A03;
            try {
                if (c16l.A19(C16R.A0G)) {
                    if (!super.A03) {
                        A0J = AbstractC58318PtA.A0d(anonymousClass469, this);
                    } else {
                        return;
                    }
                } else if (abstractC63020Sal == null) {
                    A0J = jsonDeserializer.A0D(c16l, anonymousClass469);
                } else {
                    A0J = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
                }
                collection.add(A0J);
                return;
            } catch (Exception e) {
                if (!anonymousClass469.A0j(EnumC912945i.A0S)) {
                    C914045z.A0F(e);
                }
                throw C102314j6.A03(Object.class, e, collection.size());
            }
        }
        anonymousClass469.A0R(c16l, ((ContainerDeserializerBase) this).A00);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    @Override // X.InterfaceC102474jf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.fasterxml.jackson.databind.JsonDeserializer ALr(X.InterfaceC65620ToB r11, X.AnonymousClass469 r12) {
        /*
            r10 = this;
            X.SbA r7 = r10.A02
            if (r7 == 0) goto L4c
            boolean r0 = r7.A0M()
            if (r0 == 0) goto L29
            boolean r0 = r7 instanceof X.R9r
            if (r0 == 0) goto L15
            r0 = r7
            X.R9r r0 = (X.R9r) r0
            X.44l r0 = r0.A01
            if (r0 != 0) goto L47
        L15:
            X.44l r2 = r10.A00
            java.lang.String r0 = X.MSY.A0h(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
        L21:
            X.AbstractC58318PtA.A1N(r12, r2, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L29:
            boolean r0 = r7.A0K()
            if (r0 == 0) goto L4c
            boolean r0 = r7 instanceof X.R9r
            if (r0 == 0) goto L3a
            r0 = r7
            X.R9r r0 = (X.R9r) r0
            X.44l r0 = r0.A00
            if (r0 != 0) goto L47
        L3a:
            X.44l r2 = r10.A00
            java.lang.String r0 = X.MSY.A0h(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            goto L21
        L47:
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r12.A0B(r11, r0)
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            X.ReZ r1 = X.EnumC61060ReZ.A01
            X.45U r0 = X.AbstractC58320PtC.A0a(r11, r12, r0)
            java.lang.Boolean r9 = r0.A01(r1)
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r10.A01
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A05(r11, r12, r2)
            X.44l r3 = r10.A00
            com.fasterxml.jackson.databind.JsonDeserializer r4 = X.AbstractC58320PtC.A0b(r11, r12, r3, r0)
            X.Sal r8 = r10.A03
            r1 = r8
            if (r8 == 0) goto L6e
            X.Sal r8 = r8.A02(r11)
        L6e:
            X.4jN r6 = r10.A0V(r11, r12, r4)
            java.lang.Boolean r0 = r10.A02
            boolean r0 = X.C2I7.A00(r9, r0)
            if (r0 == 0) goto L87
            X.4jN r0 = r10.A01
            if (r6 != r0) goto L87
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.A00
            if (r5 != r0) goto L87
            if (r4 != r2) goto L87
            if (r8 != r1) goto L87
            return r10
        L87:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L91
            com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L91:
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.ALr(X.ToB, X.469):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public CollectionDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, InterfaceC102444jN interfaceC102444jN, AbstractC63035SbA abstractC63035SbA, AbstractC63020Sal abstractC63020Sal, Boolean bool) {
        super(abstractC910944l, interfaceC102444jN, bool);
        this.A01 = jsonDeserializer;
        this.A03 = abstractC63020Sal;
        this.A02 = abstractC63035SbA;
        this.A00 = jsonDeserializer2;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A04(c16l, anonymousClass469);
    }

    public Collection A0x(C16L c16l, AnonymousClass469 anonymousClass469, Collection collection) {
        Object A0J;
        Object A0J2;
        c16l.A0t(collection);
        JsonDeserializer jsonDeserializer = this.A01;
        try {
            if (jsonDeserializer.A0F() != null) {
                if (!c16l.A16()) {
                    A0y(c16l, anonymousClass469, collection);
                } else {
                    c16l.A0t(collection);
                    AbstractC63020Sal abstractC63020Sal = this.A03;
                    SG7 sg7 = new SG7(((ContainerDeserializerBase) this).A00.A03().A00, collection);
                    while (true) {
                        C16R A1J = c16l.A1J();
                        if (A1J == C16R.A08) {
                            break;
                        }
                        try {
                        } catch (R97 e) {
                            R9w r9w = new R9w(e, sg7, sg7.A01);
                            sg7.A00.add(r9w);
                            e.A00.A00(r9w);
                        }
                        if (A1J == C16R.A0G) {
                            if (!super.A03) {
                                A0J2 = AbstractC58318PtA.A0d(anonymousClass469, this);
                            }
                        } else if (abstractC63020Sal == null) {
                            A0J2 = jsonDeserializer.A0D(c16l, anonymousClass469);
                        } else {
                            A0J2 = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal);
                        }
                        List list = sg7.A00;
                        if (list.isEmpty()) {
                            sg7.A02.add(A0J2);
                        } else {
                            ((R9w) AbstractC58320PtC.A0u(list)).A01.add(A0J2);
                        }
                    }
                }
            } else {
                AbstractC63020Sal abstractC63020Sal2 = this.A03;
                while (true) {
                    C16R A1J2 = c16l.A1J();
                    if (A1J2 == C16R.A08) {
                        break;
                    }
                    if (A1J2 == C16R.A0G) {
                        if (!super.A03) {
                            A0J = AbstractC58318PtA.A0d(anonymousClass469, this);
                        }
                    } else if (abstractC63020Sal2 == null) {
                        A0J = jsonDeserializer.A0D(c16l, anonymousClass469);
                    } else {
                        A0J = jsonDeserializer.A0J(c16l, anonymousClass469, abstractC63020Sal2);
                    }
                    collection.add(A0J);
                }
            }
            return collection;
        } catch (Exception e2) {
            if (anonymousClass469 != null && !anonymousClass469.A0j(EnumC912945i.A0S)) {
                C914045z.A0F(e2);
            }
            throw C102314j6.A03(collection, e2, collection.size());
        }
    }
}
