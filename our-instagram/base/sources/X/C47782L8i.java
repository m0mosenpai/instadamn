package X;

import java.util.Arrays;

/* renamed from: X.L8i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47782L8i {
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C47782L8i c47782L8i = (C47782L8i) obj;
            if (!Arrays.equals(this.A01, c47782L8i.A01) || !Arrays.equals(this.A02, c47782L8i.A02) || !Arrays.equals(this.A00, c47782L8i.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.A01);
        int hashCode2 = hashCode + (hashCode * 31) + Arrays.hashCode(this.A02);
        return hashCode2 + (hashCode2 * 31) + Arrays.hashCode(this.A00);
    }

    public C47782L8i(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AbstractC167027dH.A13(bArr, bArr2, bArr3);
        this.A01 = JQ0.A1b(bArr);
        this.A00 = JQ0.A1b(bArr3);
        this.A02 = JQ0.A1b(bArr2);
    }
}
