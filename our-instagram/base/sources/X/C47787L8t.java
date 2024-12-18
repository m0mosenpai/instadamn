package X;

import java.util.Arrays;

/* renamed from: X.L8t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47787L8t {
    public final Integer A00;
    public final Integer A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C47787L8t c47787L8t = (C47787L8t) obj;
            if (!Arrays.equals(this.A02, c47787L8t.A02) || !Arrays.equals(this.A03, c47787L8t.A03) || !C14360o3.A0K(this.A00, c47787L8t.A00) || !C14360o3.A0K(this.A01, c47787L8t.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((Arrays.hashCode(this.A02) * 31) + Arrays.hashCode(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C47787L8t(Integer num, Integer num2, byte[] bArr, byte[] bArr2) {
        AbstractC167017dG.A1P(bArr, bArr2);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = JQ0.A1b(bArr);
        this.A03 = JQ0.A1b(bArr2);
    }
}
