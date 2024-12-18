package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC911344p;
import X.AnonymousClass469;
import X.AnonymousClass550;
import X.C00O;
import X.C102314j6;
import X.C1122354v;
import X.C16L;
import X.C16M;
import X.C54s;
import X.C55B;
import X.C60602RBt;
import X.C60603RBu;
import X.C60604RBv;
import X.C64172T2b;
import X.C913045j;
import X.EnumC912945i;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes2.dex */
public abstract class BaseNodeDeserializer extends StdDeserializer {
    public final Boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return new X.C60600RBr(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return new X.C1122654z(r2.A0j());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r1 == X.C05F.A01) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if ((r3 & X.EnumC912945i.A0P.A00) != 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r0 = r2.A0s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        return X.C60603RBu.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1122454w A01(X.C16L r2, int r3) {
        /*
            if (r3 == 0) goto L12
            X.45i r0 = X.EnumC912945i.A0P
            int r0 = r0.A00
            r3 = r3 & r0
            if (r3 == 0) goto L27
        L9:
            java.math.BigInteger r0 = r2.A0s()
            if (r0 != 0) goto L31
            X.RBu r2 = X.C60603RBu.A00
            return r2
        L12:
            java.lang.Integer r1 = r2.A0n()
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L23
            int r0 = r2.A0i()
            X.54x r2 = X.C1122554x.A00(r0)
            return r2
        L23:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L9
        L27:
            long r0 = r2.A0j()
            X.54z r2 = new X.54z
            r2.<init>(r0)
            return r2
        L31:
            X.RBr r2 = new X.RBr
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A01(X.16L, int):X.54w");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1122454w A03(X.C16L r2, X.AnonymousClass469 r3) {
        /*
            int r1 = r3.A01
            int r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A02
            r0 = r0 & r1
            if (r0 == 0) goto L27
            X.45i r0 = X.EnumC912945i.A0P
            int r0 = r0.A00
            r0 = r0 & r1
            if (r0 == 0) goto L1d
            java.lang.Integer r1 = X.C05F.A0C
        L10:
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L2c
            int r0 = r2.A0i()
            X.54x r2 = X.C1122554x.A00(r0)
            return r2
        L1d:
            X.45i r0 = X.EnumC912945i.A0R
            int r0 = r0.A00
            r1 = r1 & r0
            if (r1 == 0) goto L27
            java.lang.Integer r1 = X.C05F.A01
            goto L10
        L27:
            java.lang.Integer r1 = r2.A0n()
            goto L10
        L2c:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L3a
            long r0 = r2.A0j()
            X.54z r2 = new X.54z
            r2.<init>(r0)
            return r2
        L3a:
            java.math.BigInteger r0 = r2.A0s()
            if (r0 != 0) goto L43
            X.RBu r2 = X.C60603RBu.A00
            return r2
        L43:
            X.RBr r2 = new X.RBr
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A03(X.16L, X.469):X.54w");
    }

    public static final void A04(AnonymousClass469 anonymousClass469, AbstractC911344p abstractC911344p, AbstractC911344p abstractC911344p2, C913045j c913045j, C54s c54s, String str) {
        if (anonymousClass469.A0j(EnumC912945i.A0F)) {
            throw new C102314j6(anonymousClass469.A07, String.format("Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str));
        }
        if (anonymousClass469.A0i(C16M.DUPLICATE_PROPERTIES)) {
            if (abstractC911344p.A0A()) {
                ((C55B) abstractC911344p).A0C(abstractC911344p2);
                c54s.A00.put(str, abstractC911344p);
            } else {
                C55B c55b = new C55B(c913045j);
                c55b.A0C(abstractC911344p);
                c55b.A0C(abstractC911344p2);
                c54s.A00.put(str, c55b);
            }
        }
    }

    public final AbstractC911344p A0x(C16L c16l, AnonymousClass469 anonymousClass469) {
        C913045j c913045j = anonymousClass469.A02.A07;
        int A0x = c16l.A0x();
        if (A0x != 2) {
            switch (A0x) {
                case 6:
                    return C1122354v.A00(c16l.A1P());
                case 7:
                    return A03(c16l, anonymousClass469);
                case 8:
                    return A02(c16l, anonymousClass469);
                case 9:
                    return AnonymousClass550.A02;
                case 10:
                    return AnonymousClass550.A01;
                case 11:
                    return C60603RBu.A00;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    return A00(c16l);
                default:
                    anonymousClass469.A0T(c16l, A0H());
                    throw C00O.createAndThrow();
            }
        }
        return new C54s(c913045j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC911344p A0z(X.C16L r17, X.AnonymousClass469 r18, X.SLp r19, X.C54s r20) {
        /*
            r16 = this;
            r5 = r17
            boolean r0 = r5.A17()
            r4 = r16
            r6 = r18
            if (r0 == 0) goto L9e
            java.lang.String r2 = r5.A1N()
        L10:
            X.45h r0 = r6.A02
            X.45j r9 = r0.A07
        L14:
            r3 = r20
            if (r2 == 0) goto Lb3
            X.16R r1 = r5.A1J()
            X.44p r8 = r3.A04(r2)
            r7 = r19
            if (r8 == 0) goto L51
            boolean r0 = r8 instanceof X.C54s
            if (r0 == 0) goto L43
            X.16R r0 = X.C16R.A0D
            if (r1 != r0) goto L51
            r0 = r8
            X.54s r0 = (X.C54s) r0
            X.44p r14 = r4.A0z(r5, r6, r7, r0)
            if (r14 == r8) goto L3e
        L35:
            if (r14 != 0) goto L39
            X.RBu r14 = X.C60603RBu.A00
        L39:
            java.util.Map r0 = r3.A00
            r0.put(r2, r14)
        L3e:
            java.lang.String r2 = r5.A1N()
            goto L14
        L43:
            boolean r0 = r8 instanceof X.C55B
            if (r0 == 0) goto L51
            X.16R r0 = X.C16R.A0C
            if (r1 != r0) goto L51
            X.54t r8 = (X.C54t) r8
            r4.A11(r5, r6, r7, r8, r9)
            goto L3e
        L51:
            if (r1 != 0) goto L55
            X.16R r1 = X.C16R.A0B
        L55:
            int r1 = r1.A00
            r0 = 1
            if (r1 == r0) goto L90
            r0 = 3
            if (r1 == r0) goto L82
            r0 = 6
            if (r1 == r0) goto L79
            r0 = 7
            if (r1 == r0) goto L74
            switch(r1) {
                case 9: goto L6e;
                case 10: goto L6b;
                case 11: goto L71;
                default: goto L66;
            }
        L66:
            X.44p r14 = r4.A0y(r5, r6)
            goto L35
        L6b:
            X.550 r14 = X.AnonymousClass550.A01
            goto L35
        L6e:
            X.550 r14 = X.AnonymousClass550.A02
            goto L35
        L71:
            X.RBu r14 = X.C60603RBu.A00
            goto L35
        L74:
            X.54w r14 = A03(r5, r6)
            goto L35
        L79:
            java.lang.String r0 = r5.A1P()
            X.54v r14 = X.C1122354v.A00(r0)
            goto L35
        L82:
            X.55B r14 = new X.55B
            r14.<init>(r9)
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r15 = r9
            r10.A11(r11, r12, r13, r14, r15)
            goto L35
        L90:
            X.54s r14 = new X.54s
            r14.<init>(r9)
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r15 = r9
            r10.A11(r11, r12, r13, r14, r15)
            goto L35
        L9e:
            X.16R r0 = X.C16R.A0A
            boolean r0 = r5.A19(r0)
            if (r0 != 0) goto Lad
            java.lang.Object r0 = r4.A0D(r5, r6)
            X.44p r0 = (X.AbstractC911344p) r0
            return r0
        Lad:
            java.lang.String r2 = r5.A0Y()
            goto L10
        Lb3:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A0z(X.16L, X.469, X.SLp, X.54s):X.44p");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C54s A10(X.C16L r15, X.AnonymousClass469 r16, X.SLp r17, X.C913045j r18) {
        /*
            r14 = this;
            X.54s r6 = new X.54s
            r5 = r18
            r6.<init>(r5)
            r9 = r15
            java.lang.String r7 = r15.A0Y()
        Lc:
            if (r7 == 0) goto L50
            X.16R r0 = r15.A1J()
            if (r0 != 0) goto L16
            X.16R r0 = X.C16R.A0B
        L16:
            int r1 = r0.A00
            r0 = 1
            r8 = r14
            r2 = r16
            if (r1 == r0) goto L3c
            r0 = 3
            if (r1 == r0) goto L42
            X.44p r4 = r14.A0x(r15, r2)
        L25:
            r1 = r4
            if (r4 != 0) goto L2a
            X.RBu r1 = X.C60603RBu.A00
        L2a:
            java.util.Map r0 = r6.A00
            java.lang.Object r3 = r0.put(r7, r1)
            X.44p r3 = (X.AbstractC911344p) r3
            if (r3 == 0) goto L37
            A04(r2, r3, r4, r5, r6, r7)
        L37:
            java.lang.String r7 = r15.A1N()
            goto Lc
        L3c:
            X.54s r4 = new X.54s
            r4.<init>(r5)
            goto L47
        L42:
            X.55B r4 = new X.55B
            r4.<init>(r5)
        L47:
            r11 = r17
            r10 = r2
            r12 = r4
            r13 = r5
            r8.A11(r9, r10, r11, r12, r13)
            goto L25
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A10(X.16L, X.469, X.SLp, X.45j):X.54s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f7, code lost:
    
        r5.A0C(r10);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A11(X.C16L r21, X.AnonymousClass469 r22, X.SLp r23, X.C54t r24, X.C913045j r25) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A11(X.16L, X.469, X.SLp, X.54t, X.45j):void");
    }

    public BaseNodeDeserializer(Boolean bool, Class cls) {
        super(cls);
        this.A00 = bool;
    }

    public static final AbstractC911344p A00(C16L c16l) {
        Object A0V = c16l.A0V();
        if (A0V == null) {
            return C60603RBu.A00;
        }
        if (A0V.getClass() == byte[].class) {
            byte[] bArr = (byte[]) A0V;
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return C60604RBv.A01;
            }
            return new C60604RBv(bArr);
        }
        if (!(A0V instanceof C64172T2b) && (A0V instanceof AbstractC911344p)) {
            return (AbstractC911344p) A0V;
        }
        return new C60602RBt(A0V);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.A0v() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1122454w A02(X.C16L r2, X.AnonymousClass469 r3) {
        /*
            java.lang.Integer r1 = r2.A0n()
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 == r0) goto L2e
            X.45i r0 = X.EnumC912945i.A0O
            boolean r0 = r3.A0j(r0)
            if (r0 == 0) goto L20
            boolean r0 = r2.A0v()
            if (r0 == 0) goto L2e
        L16:
            double r0 = r2.A0g()
            X.RBo r2 = new X.RBo
            r2.<init>(r0)
            return r2
        L20:
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L16
            float r0 = r2.A0h()
            X.RBp r2 = new X.RBp
            r2.<init>(r0)
            return r2
        L2e:
            java.math.BigDecimal r1 = r2.A0r()
            if (r1 != 0) goto L37
            X.RBu r2 = X.C60603RBu.A00
            return r2
        L37:
            int r0 = r1.signum()
            if (r0 != 0) goto L40
            X.RBs r2 = X.C60601RBs.A01
            return r2
        L40:
            java.math.BigDecimal r1 = r1.stripTrailingZeros()     // Catch: java.lang.ArithmeticException -> L44
        L44:
            X.RBs r2 = new X.RBs
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A02(X.16L, X.469):X.54w");
    }

    public final AbstractC911344p A0y(C16L c16l, AnonymousClass469 anonymousClass469) {
        int A0x = c16l.A0x();
        if (A0x != 2) {
            if (A0x != 8) {
                if (A0x != 12) {
                    anonymousClass469.A0T(c16l, A0H());
                    throw C00O.createAndThrow();
                }
                return A00(c16l);
            }
            return A02(c16l, anonymousClass469);
        }
        return new C54s(anonymousClass469.A02.A07);
    }
}
