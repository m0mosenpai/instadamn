package X;

import java.util.Arrays;

/* renamed from: X.L8j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47783L8j {
    public final Integer A00;
    public final boolean A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C47783L8j c47783L8j = (C47783L8j) obj;
            Integer num = this.A00;
            Integer num2 = c47783L8j.A00;
            if (num == null) {
                equals = AbstractC25229BEm.A1Z(num2);
            } else {
                equals = num.equals(num2);
            }
            byte[] bArr = this.A02;
            byte[] bArr2 = c47783L8j.A02;
            if (bArr == null) {
                equals2 = AbstractC25229BEm.A1Z(bArr2);
            } else {
                equals2 = Arrays.equals(bArr, bArr2);
            }
            if (this.A01 != c47783L8j.A01 || !equals2 || !equals) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        byte[] bArr = this.A02;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return AbstractC167007dF.A0D(this.A01, hashCode * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C47783L8j(Integer num, byte[] bArr, boolean z) {
        byte[] copyOf;
        this.A01 = z;
        this.A00 = num;
        if (bArr == null) {
            copyOf = null;
        } else {
            copyOf = Arrays.copyOf(bArr, bArr.length);
        }
        this.A02 = copyOf;
    }
}
