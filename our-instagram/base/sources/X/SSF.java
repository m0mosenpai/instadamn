package X;

import android.os.Build;
import java.security.Signature;

/* loaded from: classes10.dex */
public abstract class SSF {
    public static final String A00(Signature signature, byte[] bArr, boolean z) {
        int i;
        signature.update(bArr);
        byte[] sign = signature.sign();
        if (z) {
            C14360o3.A07(sign);
            int length = sign.length;
            if (length >= 8 && sign[0] == 48) {
                byte b = sign[1];
                if (b > 0) {
                    i = 2;
                } else if (b == -127) {
                    i = 3;
                } else {
                    throw AbstractC166987dD.A12("Invalid ECDSA signature format");
                }
                int i2 = sign[i + 1];
                int i3 = i2;
                while (i3 > 0 && sign[((i + 2) + i2) - i3] == 0) {
                    i3--;
                }
                int i4 = i + 2 + i2;
                int i5 = sign[i4 + 1];
                int i6 = i5;
                while (i6 > 0 && sign[((i4 + 2) + i5) - i6] == 0) {
                    i6--;
                }
                int max = Math.max(Math.max(i3, i6), 32);
                int i7 = sign[i - 1] & 255;
                if (i7 == length - i && i7 == i2 + 2 + 2 + i5 && sign[i] == 2 && sign[i4] == 2) {
                    int i8 = max * 2;
                    byte[] bArr2 = new byte[i8];
                    System.arraycopy(sign, i4 - i3, bArr2, max - i3, i3);
                    System.arraycopy(sign, ((i4 + 2) + i5) - i6, bArr2, i8 - i6, i6);
                    sign = bArr2;
                } else {
                    throw AbstractC166987dD.A12("Invalid ECDSA signature format");
                }
            } else {
                throw AbstractC166987dD.A12("Invalid ECDSA signature format");
            }
        }
        String A0x = AbstractC58319PtB.A0x(sign);
        C14360o3.A07(A0x);
        return A0x;
    }

    public static final boolean A01() {
        return AbstractC43593JPy.A1Z(Build.VERSION.SDK_INT, 30);
    }
}
