package com.fasterxml.jackson.databind.deser.std;

import X.C05F;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class NumberDeserializers$ByteDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$ByteDeserializer A00;
    public static final NumberDeserializers$ByteDeserializer A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Byte.TYPE;
        Integer num = C05F.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, (byte) 0, (byte) 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Byte.class, num, null, (byte) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r1 == X.C05F.A0N) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0059, code lost:
    
        if (r2 > 255) goto L35;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.C16L r6, X.AnonymousClass469 r7) {
        /*
            r5 = this;
            boolean r0 = r6.A15()
            if (r0 != 0) goto L7f
            boolean r0 = r5.A03
            if (r0 == 0) goto L13
            byte r0 = r5.A0N(r6, r7)
        Le:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L13:
            int r1 = r6.A0x()
            r0 = 1
            if (r1 == r0) goto L68
            r0 = 3
            if (r1 == r0) goto L97
            r0 = 11
            if (r1 == r0) goto L92
            r0 = 6
            if (r1 == r0) goto L33
            r0 = 7
            if (r1 == r0) goto L7f
            r0 = 8
            if (r1 == r0) goto L70
            X.AbstractC58319PtB.A1G(r6, r7, r5)
        L2e:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L33:
            java.lang.String r2 = r6.A1P()
            java.lang.Integer r1 = r5.A0e(r7, r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L92
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 == r0) goto L7c
            java.lang.String r4 = r2.trim()
            boolean r0 = r5.A0w(r7, r4)
            if (r0 != 0) goto L92
            r3 = 0
            int r2 = X.C16Y.A02(r4)     // Catch: java.lang.IllegalArgumentException -> L84
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r2 < r0) goto L5b
            r1 = 255(0xff, float:3.57E-43)
            r0 = 0
            if (r2 <= r1) goto L5c
        L5b:
            r0 = 1
        L5c:
            if (r0 == 0) goto L6e
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "overflow, value cannot be represented as 8-bit value"
            r7.A0e(r2, r4, r0, r1)
            goto L2e
        L68:
            java.lang.Class r0 = r5.A00
            r7.A0T(r6, r0)
            goto L2e
        L6e:
            byte r0 = (byte) r2
            goto Le
        L70:
            java.lang.Integer r1 = r5.A0b(r6, r7)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L92
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L7f
        L7c:
            java.lang.Object r0 = r5.A01
            return r0
        L7f:
            byte r0 = r6.A0T()
            goto Le
        L84:
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "not a valid Byte value"
            r7.A0e(r2, r4, r0, r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L92:
            java.lang.Object r0 = r5.BXX(r7)
            return r0
        L97:
            java.lang.Object r0 = r5.A0g(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }
}
