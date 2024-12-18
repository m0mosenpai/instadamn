package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00O;
import X.C16G;
import X.C61052ReQ;
import X.C911944v;
import X.C912044w;
import X.RB6;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes10.dex */
public class UUIDDeserializer extends FromStringDeserializer {
    public static final int[] A00;

    private UUID A01(AnonymousClass469 anonymousClass469, byte[] bArr) {
        int length = bArr.length;
        if (length == 16) {
            return new UUID(A00(bArr, 0), A00(bArr, 8));
        }
        throw new RB6(anonymousClass469.A07, bArr, AnonymousClass001.A0c("Can only construct UUIDs from byte[16]; got ", " bytes", length));
    }

    static {
        int[] iArr;
        int[] iArr2 = new int[StringTreeSet.MAX_SYMBOL_COUNT];
        A00 = iArr2;
        Arrays.fill(iArr2, -1);
        int i = 0;
        int i2 = 0;
        do {
            iArr = A00;
            iArr[i2 + 48] = i2;
            i2++;
        } while (i2 < 10);
        do {
            int i3 = i + 10;
            iArr[i + 97] = i3;
            iArr[i + 65] = i3;
            i++;
        } while (i < 6);
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    public static long A00(byte[] bArr, int i) {
        int i2 = i + 4;
        return ((((bArr[i2 + 3] & 255) | (((bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16)) | ((bArr[i2 + 2] & 255) << 8))) << 32) >>> 32) | (((bArr[i + 3] & 255) | (((bArr[i] << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8))) << 32);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return new UUID(0L, 0L);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final /* bridge */ /* synthetic */ Object A0y(AnonymousClass469 anonymousClass469, Object obj) {
        if (obj instanceof byte[]) {
            return A01(anonymousClass469, (byte[]) obj);
        }
        super.A0y(anonymousClass469, obj);
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final /* bridge */ /* synthetic */ Object A0z(AnonymousClass469 anonymousClass469, String str) {
        int length = str.length();
        if (length != 36) {
            if (length == 24) {
                C912044w c912044w = C911944v.A01;
                C61052ReQ c61052ReQ = new C61052ReQ((C16G) null);
                c912044w.A06(c61052ReQ, str);
                return A01(anonymousClass469, c61052ReQ.A05());
            }
        } else if (str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-') {
            return new UUID((A12(anonymousClass469, str, 0) << 32) + ((A13(anonymousClass469, str, 9) << 16) | A13(anonymousClass469, str, 14)), ((A12(anonymousClass469, str, 28) << 32) >>> 32) | ((A13(anonymousClass469, str, 24) | (A13(anonymousClass469, str, 19) << 16)) << 32));
        }
        anonymousClass469.A0e(A0H(), str, "UUID has to be represented by standard 36-char representation", AbstractC58318PtA.A1b());
        throw C00O.createAndThrow();
    }

    public final int A11(AnonymousClass469 anonymousClass469, String str, int i) {
        Class A0H;
        Object[] objArr;
        String hexString;
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt <= 127) {
            if (charAt2 <= 127) {
                int[] iArr = A00;
                int i2 = iArr[charAt2] | (iArr[charAt] << 4);
                if (i2 >= 0) {
                    return i2;
                }
            }
            if (A00[charAt] >= 0) {
                A0H = A0H();
                objArr = new Object[2];
                objArr[0] = Character.valueOf(charAt2);
                hexString = Integer.toHexString(charAt2);
                objArr[1] = hexString;
                throw anonymousClass469.A0J(A0H, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", objArr));
            }
        }
        A0H = A0H();
        objArr = new Object[2];
        objArr[0] = Character.valueOf(charAt);
        hexString = Integer.toHexString(charAt);
        objArr[1] = hexString;
        throw anonymousClass469.A0J(A0H, str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", objArr));
    }

    public final int A12(AnonymousClass469 anonymousClass469, String str, int i) {
        return (A11(anonymousClass469, str, i) << 24) + (A11(anonymousClass469, str, i + 2) << 16) + (A11(anonymousClass469, str, i + 4) << 8) + A11(anonymousClass469, str, i + 6);
    }

    public final int A13(AnonymousClass469 anonymousClass469, String str, int i) {
        return (A11(anonymousClass469, str, i) << 8) + A11(anonymousClass469, str, i + 2);
    }
}
