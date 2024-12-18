package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC62638SJv;
import X.AbstractC63020Sal;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C45Y;
import X.C63173SeY;
import X.C912845h;
import X.C914045z;
import X.InterfaceC102444jN;
import X.InterfaceC102464je;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.MSY;
import X.R9r;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: classes10.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase implements InterfaceC102464je, InterfaceC102474jf {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public AbstractC62638SJv A02;
    public C63173SeY A03;
    public final AbstractC63035SbA A04;
    public final AbstractC63020Sal A05;
    public final Class A06;

    public EnumMapDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AbstractC63035SbA abstractC63035SbA, AbstractC63020Sal abstractC63020Sal) {
        super(abstractC910944l, (InterfaceC102444jN) null, (Boolean) null);
        this.A06 = abstractC910944l.A04().A00;
        this.A02 = null;
        this.A01 = jsonDeserializer;
        this.A05 = abstractC63020Sal;
        this.A04 = abstractC63035SbA;
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        AbstractC62638SJv abstractC62638SJv = this.A02;
        if (abstractC62638SJv == null) {
            abstractC62638SJv = anonymousClass469.A0G(((ContainerDeserializerBase) this).A00.A04());
        }
        JsonDeserializer jsonDeserializer = this.A01;
        JsonDeserializer A0b = AbstractC58320PtC.A0b(interfaceC65620ToB, anonymousClass469, ((ContainerDeserializerBase) this).A00, jsonDeserializer);
        AbstractC63020Sal abstractC63020Sal = this.A05;
        if (abstractC63020Sal != null) {
            abstractC63020Sal = abstractC63020Sal.A02(interfaceC65620ToB);
        }
        InterfaceC102444jN A0V = A0V(interfaceC65620ToB, anonymousClass469, A0b);
        if (abstractC62638SJv == abstractC62638SJv && A0V == ((ContainerDeserializerBase) this).A01 && A0b == jsonDeserializer && abstractC63020Sal == abstractC63020Sal) {
            return this;
        }
        return new EnumMapDeserializer(A0b, abstractC62638SJv, A0V, this, abstractC63020Sal);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        EnumMap enumMap = (EnumMap) obj;
        A0y(c16l, anonymousClass469, enumMap);
        return enumMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: Exception -> 0x009f, TRY_ENTER, TryCatch #0 {Exception -> 0x009f, blocks: (B:14:0x008e, B:27:0x005b, B:29:0x005f, B:31:0x0063, B:33:0x0068, B:35:0x006c, B:36:0x0073, B:40:0x0098), top: B:26:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0089 -> B:8:0x001e). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.C16L r8, X.AnonymousClass469 r9) {
        /*
            r7 = this;
            X.SeY r4 = r7.A03
            if (r4 == 0) goto Lac
            r2 = 0
            int r0 = r4.A00
            X.SQ0 r3 = new X.SQ0
            r3.<init>(r8, r9, r2, r0)
            boolean r0 = r8.A17()
            if (r0 != 0) goto L89
            X.16R r0 = X.C16R.A0A
            boolean r0 = r8.A19(r0)
            if (r0 == 0) goto L1e
            java.lang.String r2 = r8.A0Y()
        L1e:
            if (r2 == 0) goto L98
            X.16R r6 = r8.A1J()
            X.RBV r1 = X.C63173SeY.A00(r4, r2)
            if (r1 == 0) goto L38
            java.lang.Object r0 = r1.A0C(r8, r9)
            boolean r0 = r3.A03(r1, r0)
            if (r0 == 0) goto L89
            r8.A1J()
            goto L8e
        L38:
            X.SJv r0 = r7.A02
            java.lang.Object r5 = r0.A00(r9, r2)
            if (r5 != 0) goto L5b
            X.45i r0 = X.EnumC912945i.A0K
            boolean r0 = r9.A0j(r0)
            if (r0 != 0) goto L83
            java.lang.Class r3 = r7.A06
            X.44l r0 = r7.A00
            X.44l r0 = r0.A04()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            r9.A0e(r3, r2, r0, r1)
            goto Ld1
        L5b:
            X.16R r0 = X.C16R.A0G     // Catch: java.lang.Exception -> L9f
            if (r6 != r0) goto L68
            boolean r0 = r7.A03     // Catch: java.lang.Exception -> L9f
            if (r0 != 0) goto L89
            java.lang.Object r2 = X.AbstractC58318PtA.A0d(r9, r7)     // Catch: java.lang.Exception -> L9f
            goto L79
        L68:
            X.Sal r1 = r7.A05     // Catch: java.lang.Exception -> L9f
            if (r1 != 0) goto L73
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A01     // Catch: java.lang.Exception -> L9f
            java.lang.Object r2 = r0.A0D(r8, r9)     // Catch: java.lang.Exception -> L9f
            goto L79
        L73:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A01     // Catch: java.lang.Exception -> L9f
            java.lang.Object r2 = r0.A0J(r8, r9, r1)     // Catch: java.lang.Exception -> L9f
        L79:
            X.SDz r1 = r3.A02
            X.R9s r0 = new X.R9s
            r0.<init>(r1, r2, r5)
            r3.A02 = r0
            goto L89
        L83:
            r8.A1J()
            r8.A0z()
        L89:
            java.lang.String r2 = r8.A1N()
            goto L1e
        L8e:
            java.lang.Object r0 = r4.A02(r9, r3)     // Catch: java.lang.Exception -> L9f
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch: java.lang.Exception -> L9f
            r7.A0y(r8, r9, r0)
            return r0
        L98:
            java.lang.Object r0 = r4.A02(r9, r3)     // Catch: java.lang.Exception -> L9f
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch: java.lang.Exception -> L9f
            return r0
        L9f:
            r1 = move-exception
            X.44l r0 = r7.A00
            java.lang.Class r0 = r0.A00
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r9, r0, r2, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lac:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A00
            if (r0 == 0) goto Lbb
            X.SbA r1 = r7.A04
            java.lang.Object r0 = r0.A0D(r8, r9)
            java.lang.Object r0 = r1.A09(r9, r0)
            return r0
        Lbb:
            int r1 = r8.A0x()
            r0 = 1
            if (r1 == r0) goto Le0
            r0 = 2
            if (r1 == r0) goto Le0
            r0 = 3
            if (r1 == r0) goto Ldb
            r0 = 5
            if (r1 == r0) goto Le0
            r0 = 6
            if (r1 == r0) goto Ld6
            X.AbstractC58319PtB.A1G(r8, r9, r7)
        Ld1:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Ld6:
            java.lang.Object r0 = r7.A0h(r8, r9)
            return r0
        Ldb:
            java.lang.Object r0 = r7.A0g(r8, r9)
            return r0
        Le0:
            java.util.EnumMap r0 = r7.A0x(r9)
            r7.A0y(r8, r9, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0C;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        if (this.A01 == null && this.A02 == null && this.A05 == null) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC63035SbA A0W() {
        return this.A04;
    }

    public final EnumMap A0x(AnonymousClass469 anonymousClass469) {
        AbstractC63035SbA abstractC63035SbA = this.A04;
        if (abstractC63035SbA == null) {
            return new EnumMap(this.A06);
        }
        try {
            if (!abstractC63035SbA.A0L()) {
                anonymousClass469.A0Y(abstractC63035SbA, A0H(), "no default constructor found", AbstractC58318PtA.A1b());
                throw C00O.createAndThrow();
            }
            return (EnumMap) abstractC63035SbA.A04(anonymousClass469);
        } catch (IOException e) {
            C914045z.A0D(anonymousClass469, e);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC102464je
    public final void EK8(AnonymousClass469 anonymousClass469) {
        AbstractC910944l abstractC910944l;
        Object[] objArr;
        String str;
        AbstractC910944l abstractC910944l2;
        AbstractC63035SbA abstractC63035SbA = this.A04;
        if (abstractC63035SbA != null) {
            if (abstractC63035SbA.A0M()) {
                if (!(abstractC63035SbA instanceof R9r) || (abstractC910944l2 = ((R9r) abstractC63035SbA).A01) == null) {
                    abstractC910944l = ((ContainerDeserializerBase) this).A00;
                    objArr = new Object[]{abstractC910944l, MSY.A0h(abstractC63035SbA)};
                    str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                    AbstractC58318PtA.A1N(anonymousClass469, abstractC910944l, str, objArr);
                    throw C00O.createAndThrow();
                }
                this.A00 = anonymousClass469.A0B(null, abstractC910944l2);
                return;
            }
            if (abstractC63035SbA.A0K()) {
                if (!(abstractC63035SbA instanceof R9r) || (abstractC910944l2 = ((R9r) abstractC63035SbA).A00) == null) {
                    abstractC910944l = ((ContainerDeserializerBase) this).A00;
                    objArr = new Object[]{abstractC910944l, MSY.A0h(abstractC63035SbA)};
                    str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                    AbstractC58318PtA.A1N(anonymousClass469, abstractC910944l, str, objArr);
                    throw C00O.createAndThrow();
                }
                this.A00 = anonymousClass469.A0B(null, abstractC910944l2);
                return;
            }
            if (abstractC63035SbA.A0I()) {
                C912845h c912845h = anonymousClass469.A02;
                this.A03 = C63173SeY.A01(anonymousClass469, abstractC63035SbA, abstractC63035SbA.A0O(c912845h), c912845h.A08(C45Y.A04));
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A05(c16l, anonymousClass469);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0025 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0y(X.C16L r7, X.AnonymousClass469 r8, java.util.EnumMap r9) {
        /*
            r6 = this;
            r7.A0t(r9)
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r6.A01
            X.Sal r4 = r6.A05
            boolean r0 = r7.A17()
            r3 = 0
            if (r0 != 0) goto L25
            X.16R r1 = r7.A10()
            X.16R r2 = X.C16R.A0A
            if (r1 == r2) goto L2a
            X.16R r0 = X.C16R.A09
            if (r1 == r0) goto L82
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r8.A0V(r2, r1, r0)
        L20:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L25:
            java.lang.String r3 = r7.A1N()
            goto L2e
        L2a:
            java.lang.String r3 = r7.A0Y()
        L2e:
            if (r3 == 0) goto L82
            X.SJv r0 = r6.A02
            java.lang.Object r2 = r0.A00(r8, r3)
            java.lang.Enum r2 = (java.lang.Enum) r2
            X.16R r1 = r7.A1J()
            if (r2 != 0) goto L5d
            X.45i r0 = X.EnumC912945i.A0K
            boolean r0 = r8.A0j(r0)
            if (r0 != 0) goto L59
            java.lang.Class r2 = r6.A06
            X.44l r0 = r6.A00
            X.44l r0 = r0.A04()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            r8.A0e(r2, r3, r0, r1)
            goto L20
        L59:
            r7.A0z()
            goto L25
        L5d:
            X.16R r0 = X.C16R.A0G     // Catch: java.lang.Exception -> L79
            if (r1 != r0) goto L6a
            boolean r0 = r6.A03     // Catch: java.lang.Exception -> L79
            if (r0 != 0) goto L25
            java.lang.Object r0 = X.AbstractC58318PtA.A0d(r8, r6)     // Catch: java.lang.Exception -> L79
            goto L75
        L6a:
            if (r4 != 0) goto L71
            java.lang.Object r0 = r5.A0D(r7, r8)     // Catch: java.lang.Exception -> L79
            goto L75
        L71:
            java.lang.Object r0 = r5.A0J(r7, r8, r4)     // Catch: java.lang.Exception -> L79
        L75:
            r9.put(r2, r0)
            goto L25
        L79:
            r0 = move-exception
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r8, r9, r3, r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A0y(X.16L, X.469, java.util.EnumMap):void");
    }

    public EnumMapDeserializer(JsonDeserializer jsonDeserializer, AbstractC62638SJv abstractC62638SJv, InterfaceC102444jN interfaceC102444jN, EnumMapDeserializer enumMapDeserializer, AbstractC63020Sal abstractC63020Sal) {
        super(interfaceC102444jN, enumMapDeserializer, ((ContainerDeserializerBase) enumMapDeserializer).A02);
        this.A06 = enumMapDeserializer.A06;
        this.A02 = abstractC62638SJv;
        this.A01 = jsonDeserializer;
        this.A05 = abstractC63020Sal;
        this.A04 = enumMapDeserializer.A04;
        this.A00 = enumMapDeserializer.A00;
        this.A03 = enumMapDeserializer.A03;
    }
}
