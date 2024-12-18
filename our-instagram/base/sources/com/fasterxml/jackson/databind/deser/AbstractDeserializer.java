package com.fasterxml.jackson.databind.deser;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC60563R8d;
import X.AbstractC60564R8e;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C44W;
import X.C64520THn;
import X.C910844k;
import X.C913945y;
import X.C914045z;
import X.InterfaceC102474jf;
import X.InterfaceC65236TgS;
import X.InterfaceC65620ToB;
import X.RBL;
import X.RBV;
import X.SZ3;
import X.TI2;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes10.dex */
public class AbstractDeserializer extends JsonDeserializer implements InterfaceC102474jf, Serializable {
    public final AbstractC910944l A00;
    public final C64520THn A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final Map A06;
    public transient Map A07;

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, C64520THn c64520THn) {
        this.A00 = abstractDeserializer.A00;
        this.A06 = abstractDeserializer.A06;
        this.A05 = abstractDeserializer.A05;
        this.A02 = abstractDeserializer.A02;
        this.A04 = abstractDeserializer.A04;
        this.A03 = abstractDeserializer.A03;
        this.A01 = c64520THn;
        this.A07 = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean A0M() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Class cls = this.A00.A00;
        if (anonymousClass469.A02.A08 != null) {
            throw AbstractC166987dD.A15("handleMissingInstantiator");
        }
        anonymousClass469.A09(String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", C914045z.A06(cls), "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information"), cls);
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final RBV A0E(String str) {
        Map map = this.A06;
        if (map == null) {
            return null;
        }
        return (RBV) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final C64520THn A0F() {
        return this.A01;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Class A0H() {
        return this.A00.A00;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0N;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x005f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable, X.400, X.R97, X.4j6, java.io.IOException] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0J(X.C16L r6, X.AnonymousClass469 r7, X.AbstractC63020Sal r8) {
        /*
            r5 = this;
            X.THn r3 = r5.A01
            if (r3 == 0) goto L5b
            X.16R r1 = r6.A10()
            if (r1 == 0) goto L5b
            boolean r0 = r1.A03
            if (r0 == 0) goto L54
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A03
            java.lang.Object r2 = r0.A0D(r6, r7)
            X.TI2 r1 = r3.A00
            X.TgS r0 = r3.A01
            X.SP8 r4 = r7.A0I(r1, r0, r2)
            X.TgS r0 = r4.A00
            X.TI4 r1 = r4.A03
            X.T2Y r0 = (X.T2Y) r0
            java.util.Map r0 = r0.A00
            if (r0 != 0) goto L4e
            r0 = 0
        L27:
            r4.A01 = r0
            if (r0 != 0) goto L53
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Could not resolve Object Id ["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] -- unresolved forward-reference?"
            java.lang.String r3 = X.AbstractC166997dE.A0x(r0, r1)
            X.TID r2 = r6.A1H()
            r1 = 0
            X.R97 r0 = new X.R97
            r0.<init>(r3, r1)
            r0.A00 = r2
            r0.A01 = r6
            r0.A00 = r4
            throw r0
        L4e:
            java.lang.Object r0 = r0.get(r1)
            goto L27
        L53:
            return r0
        L54:
            X.16R r0 = X.C16R.A0D
            if (r1 != r0) goto L5b
            r6.A1J()
        L5b:
            int r0 = r6.A0x()
            switch(r0) {
                case 6: goto L67;
                case 7: goto L70;
                case 8: goto L7d;
                case 9: goto L8c;
                case 10: goto L93;
                default: goto L62;
            }
        L62:
            java.lang.Object r0 = r8.A05(r6, r7)
            return r0
        L67:
            boolean r0 = r5.A05
            if (r0 == 0) goto L62
            java.lang.String r0 = r6.A1P()
            goto L89
        L70:
            boolean r0 = r5.A04
            if (r0 == 0) goto L62
            int r0 = r6.A0i()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L89
        L7d:
            boolean r0 = r5.A03
            if (r0 == 0) goto L62
            double r0 = r6.A0g()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L89:
            if (r0 == 0) goto L62
            return r0
        L8c:
            boolean r0 = r5.A02
            if (r0 == 0) goto L62
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L93:
            boolean r0 = r5.A02
            if (r0 == 0) goto L62
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.A0J(X.16L, X.469, X.Sal):java.lang.Object");
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        C64520THn c64520THn;
        RBL BSA;
        SZ3 A0H;
        AbstractC910944l abstractC910944l;
        TI2 A02;
        String A08;
        C44W A00 = anonymousClass469.A02.A00();
        RBV rbv = null;
        if (interfaceC65620ToB != null && A00 != null && (BSA = interfaceC65620ToB.BSA()) != null && (A0H = A00.A0H(BSA)) != null) {
            Class cls = A0H.A02;
            boolean A05 = anonymousClass469.A03().A05();
            InterfaceC65236TgS interfaceC65236TgS = (InterfaceC65236TgS) C914045z.A03(cls, A05);
            SZ3 A0I = A00.A0I(BSA, A0H);
            Class cls2 = A0I.A01;
            if (cls2 == AbstractC60563R8d.class) {
                C913945y c913945y = A0I.A00;
                Map map = this.A07;
                if (map != null && (rbv = (RBV) map.get(c913945y.A02)) != null) {
                    abstractC910944l = rbv.A04;
                    A02 = new AbstractC60564R8e(A0I.A03);
                } else {
                    AbstractC910944l abstractC910944l2 = this.A00;
                    String A06 = C914045z.A06(abstractC910944l2.A00);
                    if (c913945y == null) {
                        A08 = "[null]";
                    } else {
                        A08 = C914045z.A08(c913945y.A02);
                    }
                    AbstractC58318PtA.A1N(anonymousClass469, abstractC910944l2, "Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{A06, A08});
                    throw C00O.createAndThrow();
                }
            } else {
                interfaceC65236TgS = (InterfaceC65236TgS) C914045z.A03(A0I.A02, A05);
                abstractC910944l = C910844k.A03(anonymousClass469.A0A(cls2), TI2.class)[0];
                A02 = anonymousClass469.A02(A0I);
            }
            c64520THn = new C64520THn(A02, interfaceC65236TgS, abstractC910944l, anonymousClass469.A0E(abstractC910944l), A0I.A00, rbv);
        } else {
            if (this.A07 == null) {
                return this;
            }
            c64520THn = this.A01;
        }
        return new AbstractDeserializer(this, c64520THn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r3.isAssignableFrom(java.lang.Boolean.class) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.isAssignableFrom(java.lang.Integer.class) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractDeserializer(X.SQ5 r5, X.C45B r6, java.util.Map r7, java.util.Map r8) {
        /*
            r4 = this;
            r4.<init>()
            X.44l r1 = r6.A05
            r4.A00 = r1
            X.THn r0 = r5.A03
            r4.A01 = r0
            r4.A06 = r7
            r4.A07 = r8
            java.lang.Class r3 = r1.A00
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r3.isAssignableFrom(r0)
            r4.A05 = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r2 = 0
            if (r3 == r0) goto L27
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L28
        L27:
            r0 = 1
        L28:
            r4.A02 = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r3 == r0) goto L37
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L38
        L37:
            r0 = 1
        L38:
            r4.A04 = r0
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r3 == r0) goto L46
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L47
        L46:
            r2 = 1
        L47:
            r4.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.SQ5, X.45B, java.util.Map, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r3.isAssignableFrom(java.lang.Boolean.class) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r3.isAssignableFrom(java.lang.Integer.class) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractDeserializer(X.C45B r5) {
        /*
            r4 = this;
            r4.<init>()
            X.44l r1 = r5.A05
            r4.A00 = r1
            r0 = 0
            r4.A01 = r0
            r4.A06 = r0
            java.lang.Class r3 = r1.A00
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r3.isAssignableFrom(r0)
            r4.A05 = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r2 = 0
            if (r3 == r0) goto L24
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L25
        L24:
            r0 = 1
        L25:
            r4.A02 = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r3 == r0) goto L34
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L35
        L34:
            r0 = 1
        L35:
            r4.A04 = r0
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r3 == r0) goto L43
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L44
        L43:
            r2 = 1
        L44:
            r4.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.45B):void");
    }
}
