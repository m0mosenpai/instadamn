package com.fasterxml.jackson.databind.ser.std;

import X.C46K;
import java.util.UUID;

/* loaded from: classes2.dex */
public class UUIDSerializer extends StdScalarSerializer implements C46K {
    public static final char[] A01 = "0123456789abcdef".toCharArray();
    public final Boolean A00;

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this.A00 = bool;
    }

    public static final void A03(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void A04(char[] cArr, int i, int i2) {
        char[] cArr2 = A01;
        cArr[i2] = cArr2[(i >> 12) & 15];
        int i3 = i2 + 1;
        cArr[i3] = cArr2[(i >> 8) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i >> 4) & 15];
        cArr[i4 + 1] = cArr2[i & 15];
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r3, X.AbstractC913345m r4) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.A00
            X.45U r0 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r3, r4, r0)
            if (r0 == 0) goto L27
            X.45V r1 = r0.A00
            X.45V r0 = X.C45V.BINARY
            if (r1 != r0) goto L21
            r0 = 1
        Lf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L13:
            java.lang.Boolean r0 = r2.A00
            boolean r0 = X.C2I7.A00(r1, r0)
            if (r0 != 0) goto L29
            com.fasterxml.jackson.databind.ser.std.UUIDSerializer r0 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer
            r0.<init>(r1)
            return r0
        L21:
            X.45V r0 = X.C45V.STRING
            if (r1 != r0) goto L27
            r0 = 0
            goto Lf
        L27:
            r1 = 0
            goto L13
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.UUIDSerializer.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public UUIDSerializer() {
        this(null);
    }
}
