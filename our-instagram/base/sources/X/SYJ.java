package X;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;

/* loaded from: classes10.dex */
public abstract class SYJ {
    public int[] A00;
    public final int A01;

    public static void A00(SYJ syj, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        int i;
        int length = bArr.length;
        if (syj instanceof RTS) {
            i = 24;
        } else {
            i = 12;
        }
        if (length == i) {
            int remaining = byteBuffer2.remaining();
            int i2 = (remaining / 64) + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer A01 = syj.A01(bArr, syj.A01 + i3);
                int i4 = 64;
                if (i3 == i2 - 1) {
                    i4 = remaining % 64;
                }
                AbstractC63315ShN.A00(byteBuffer, byteBuffer2, A01, i4);
            }
            return;
        }
        throw AbstractC58320PtC.A1A("The nonce length (in bytes) must be ", i);
    }

    public SYJ(final byte[] key, int initialCounter) {
        if (key.length == 32) {
            this.A00 = AbstractC63354SiB.A03(key);
            this.A01 = initialCounter;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final ByteBuffer A01(final byte[] nonce, int counter) {
        int i;
        int[] iArr;
        int[] A03 = AbstractC63354SiB.A03(nonce);
        if (this instanceof RTS) {
            int length = A03.length;
            if (length == 6) {
                i = 16;
                iArr = new int[16];
                AbstractC63354SiB.A02(iArr, AbstractC63354SiB.A04(this.A00, A03));
                iArr[12] = counter;
                iArr[13] = 0;
                iArr[14] = A03[4];
                iArr[15] = A03[5];
            } else {
                throw AbstractC58319PtB.A0j("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", AbstractC25228BEl.A1Y(length * 32));
            }
        } else {
            int length2 = A03.length;
            if (length2 == 3) {
                i = 16;
                iArr = new int[16];
                AbstractC63354SiB.A02(iArr, this.A00);
                iArr[12] = counter;
                System.arraycopy(A03, 0, iArr, 13, length2);
            } else {
                throw AbstractC58319PtB.A0j("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", AbstractC25228BEl.A1Y(length2 * 32));
            }
        }
        int[] iArr2 = (int[]) iArr.clone();
        AbstractC63354SiB.A00(iArr2);
        int i2 = 0;
        do {
            iArr[i2] = iArr[i2] + iArr2[i2];
            i2++;
        } while (i2 < i);
        ByteBuffer A17 = AbstractC58320PtC.A17(64);
        A17.asIntBuffer().put(iArr, 0, i);
        return A17;
    }
}
