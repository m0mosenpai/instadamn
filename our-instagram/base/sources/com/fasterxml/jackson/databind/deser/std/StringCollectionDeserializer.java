package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58318PtA;
import X.AbstractC63020Sal;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Collection;

@JacksonStdImpl
/* loaded from: classes10.dex */
public final class StringCollectionDeserializer extends ContainerDeserializerBase implements InterfaceC102474jf {
    public final JsonDeserializer A00;
    public final JsonDeserializer A01;
    public final AbstractC63035SbA A02;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer != null) {
            return this.A02.A09(anonymousClass469, jsonDeserializer.A0D(c16l, anonymousClass469));
        }
        return A0C(c16l, anonymousClass469, (Collection) this.A02.A04(anonymousClass469));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A01;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        if (this.A01 == null && this.A00 == null) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC63035SbA A0W() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // X.InterfaceC102474jf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALr(X.InterfaceC65620ToB r11, X.AnonymousClass469 r12) {
        /*
            r10 = this;
            X.SbA r8 = r10.A02
            r6 = 0
            if (r8 == 0) goto L65
            boolean r2 = r8 instanceof X.R9r
            if (r2 == 0) goto L59
            r1 = r8
            X.R9r r1 = (X.R9r) r1
            X.RBH r0 = r1.A02
            if (r0 == 0) goto L59
            X.44l r0 = r1.A00
        L12:
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r12.A0B(r11, r0)
        L16:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r10.A01
            X.44l r4 = r10.A00
            X.44l r0 = r4.A03()
            if (r2 != 0) goto L54
            com.fasterxml.jackson.databind.JsonDeserializer r3 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A05(r11, r12, r2)
            if (r3 != 0) goto L2a
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r12.A0B(r11, r0)
        L2a:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            X.ReZ r1 = X.EnumC61060ReZ.A01
            X.45U r0 = X.AbstractC58320PtC.A0a(r11, r12, r0)
            java.lang.Boolean r9 = r0.A01(r1)
            X.4jN r7 = r10.A0V(r11, r12, r3)
            boolean r0 = X.C914045z.A0K(r3)
            if (r0 != 0) goto L41
            r6 = r3
        L41:
            java.lang.Boolean r0 = r10.A02
            boolean r0 = X.C2I7.A00(r0, r9)
            if (r0 == 0) goto L67
            X.4jN r0 = r10.A01
            if (r0 != r7) goto L67
            if (r2 != r6) goto L67
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.A00
            if (r0 != r5) goto L67
            return r10
        L54:
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r12.A0D(r11, r0, r2)
            goto L2a
        L59:
            if (r2 == 0) goto L65
            r1 = r8
            X.R9r r1 = (X.R9r) r1
            X.RBH r0 = r1.A04
            if (r0 == 0) goto L65
            X.44l r0 = r1.A01
            goto L12
        L65:
            r5 = r6
            goto L16
        L67:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r3 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.ALr(X.ToB, X.469):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public StringCollectionDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, InterfaceC102444jN interfaceC102444jN, AbstractC63035SbA abstractC63035SbA, Boolean bool) {
        super(abstractC910944l, interfaceC102444jN, bool);
        this.A01 = jsonDeserializer2;
        this.A02 = abstractC63035SbA;
        this.A00 = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A04(c16l, anonymousClass469);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A0x, reason: merged with bridge method [inline-methods] */
    public final Collection A0C(C16L c16l, AnonymousClass469 anonymousClass469, Collection collection) {
        String str;
        boolean z;
        Object obj;
        try {
            if (!c16l.A16()) {
                Boolean bool = super.A02;
                if (bool == Boolean.TRUE || (bool == null && anonymousClass469.A0j(EnumC912945i.A06))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (c16l.A19(C16R.A0J)) {
                        return (Collection) A0h(c16l, anonymousClass469);
                    }
                    anonymousClass469.A0R(c16l, ((ContainerDeserializerBase) this).A00);
                    throw C00O.createAndThrow();
                }
                JsonDeserializer jsonDeserializer = this.A01;
                if (c16l.A10() == C16R.A0G) {
                    if (this.A03) {
                        return collection;
                    }
                    obj = AbstractC58318PtA.A0d(anonymousClass469, this);
                } else if (jsonDeserializer == null) {
                    obj = A0k(c16l, anonymousClass469);
                } else {
                    obj = (String) jsonDeserializer.A0D(c16l, anonymousClass469);
                }
                collection.add(obj);
                return collection;
            }
            JsonDeserializer jsonDeserializer2 = this.A01;
            if (jsonDeserializer2 != null) {
                while (true) {
                    if (c16l.A1O() == null) {
                        C16R A10 = c16l.A10();
                        if (A10 == C16R.A08) {
                            return collection;
                        }
                        if (A10 == C16R.A0G) {
                            if (!this.A03) {
                                str = (String) AbstractC58318PtA.A0d(anonymousClass469, this);
                            }
                        } else {
                            str = (String) jsonDeserializer2.A0D(c16l, anonymousClass469);
                        }
                    } else {
                        str = (String) jsonDeserializer2.A0D(c16l, anonymousClass469);
                    }
                    collection.add(str);
                }
            } else {
                while (true) {
                    String A1O = c16l.A1O();
                    if (A1O == null) {
                        C16R A102 = c16l.A10();
                        if (A102 == C16R.A08) {
                            return collection;
                        }
                        if (A102 == C16R.A0G) {
                            if (!this.A03) {
                                A1O = (String) AbstractC58318PtA.A0d(anonymousClass469, this);
                            }
                        } else {
                            A1O = A0k(c16l, anonymousClass469);
                        }
                    }
                    collection.add(A1O);
                }
            }
        } catch (Exception e) {
            throw C102314j6.A03(collection, e, collection.size());
        }
    }
}
