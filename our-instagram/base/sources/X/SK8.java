package X;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes10.dex */
public abstract class SK8 {
    public static final SK8 A00;
    public static final SK8 A01;
    public static final SK8 A02;
    public static final SK8 A03;
    public static final SK8 A04;

    public final String A00(byte[] bArr, int i) {
        int length = bArr.length;
        AbstractC63065Sbm.A02(0, i, length);
        RMH rmh = (RMH) this;
        C63004SaS c63004SaS = rmh.A00;
        int i2 = c63004SaS.A03;
        StringBuilder A0q = AbstractC58318PtA.A0q(c63004SaS.A02 * S2Z.A00(RoundingMode.CEILING, i, i2));
        try {
            if (rmh instanceof RMF) {
                int i3 = 0;
                AbstractC63065Sbm.A02(0, i, length);
                for (int i4 = i; i4 >= 3; i4 -= 3) {
                    int i5 = i3 + 1;
                    int i6 = i5 + 1;
                    int i7 = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                    char[] cArr = c63004SaS.A07;
                    A0q.append(cArr[i7 >>> 18]);
                    A0q.append(cArr[(i7 >>> 12) & 63]);
                    A0q.append(cArr[(i7 >>> 6) & 63]);
                    A0q.append(cArr[i7 & 63]);
                    i3 = i6 + 1;
                }
                if (i3 < i) {
                    rmh.A01(A0q, bArr, i3, i - i3);
                }
            } else if (rmh instanceof RMG) {
                RMG rmg = (RMG) rmh;
                AbstractC63065Sbm.A02(0, i, length);
                for (int i8 = 0; i8 < i; i8++) {
                    int i9 = bArr[i8] & 255;
                    char[] cArr2 = rmg.A00;
                    A0q.append(cArr2[i9]);
                    A0q.append(cArr2[i9 | 256]);
                }
            } else {
                AbstractC63065Sbm.A02(0, i, length);
                for (int i10 = 0; i10 < i; i10 += i2) {
                    rmh.A01(A0q, bArr, i10, Math.min(i2, i - i10));
                }
            }
            return A0q.toString();
        } catch (IOException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    static {
        C63004SaS c63004SaS = new C63004SaS("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        RMH rmh = new RMH(c63004SaS, '=');
        if (c63004SaS.A07.length == 64) {
            A01 = rmh;
            C63004SaS c63004SaS2 = new C63004SaS("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
            RMH rmh2 = new RMH(c63004SaS2, '=');
            if (c63004SaS2.A07.length == 64) {
                A02 = rmh2;
                A03 = new RMH(new C63004SaS("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
                A04 = new RMH(new C63004SaS("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
                A00 = new RMG(new C63004SaS("base16()", "0123456789ABCDEF".toCharArray()));
                return;
            }
            throw AbstractC58318PtA.A0Y();
        }
        throw AbstractC58318PtA.A0Y();
    }
}
