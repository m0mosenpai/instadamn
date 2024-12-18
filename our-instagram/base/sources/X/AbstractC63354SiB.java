package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* renamed from: X.SiB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63354SiB {
    public static final int[] A00 = A03(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void A00(final int[] state) {
        for (int i = 0; i < 10; i++) {
            A01(state, 0, 4, 8, 12);
            A01(state, 1, 5, 9, 13);
            A01(state, 2, 6, 10, 14);
            A01(state, 3, 7, 11, 15);
            A01(state, 0, 5, 10, 15);
            A01(state, 1, 6, 11, 12);
            A01(state, 2, 7, 8, 13);
            A01(state, 3, 4, 9, 14);
        }
    }

    public static int[] A03(final byte[] input) {
        if (input.length % 4 == 0) {
            IntBuffer asIntBuffer = ByteBuffer.wrap(input).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[asIntBuffer.remaining()];
            asIntBuffer.get(iArr);
            return iArr;
        }
        throw AbstractC166987dD.A12("invalid input length");
    }

    public static void A01(int[] x, int a, int b, int c, int d) {
        int i = x[a] + x[b];
        x[a] = i;
        int i2 = i ^ x[d];
        int i3 = (i2 >>> (-16)) | (i2 << 16);
        x[d] = i3;
        int i4 = x[c] + i3;
        x[c] = i4;
        int i5 = x[b] ^ i4;
        int i6 = (i5 >>> (-12)) | (i5 << 12);
        x[b] = i6;
        int i7 = x[a] + i6;
        x[a] = i7;
        int i8 = x[d] ^ i7;
        int i9 = (i8 >>> (-8)) | (i8 << 8);
        x[d] = i9;
        int i10 = x[c] + i9;
        x[c] = i10;
        int i11 = x[b] ^ i10;
        x[b] = (i11 >>> (-7)) | (i11 << 7);
    }

    public static void A02(int[] state, final int[] key) {
        int[] iArr = A00;
        int length = iArr.length;
        System.arraycopy(iArr, 0, state, 0, length);
        System.arraycopy(key, 0, state, length, 8);
    }

    public static int[] A04(final int[] key, final int[] nonce) {
        A02(r4, key);
        int[] iArr = {0, 0, 0, 0, iArr[12], iArr[13], iArr[14], iArr[15], 0, 0, 0, 0, nonce[0], nonce[1], nonce[2], nonce[3]};
        A00(iArr);
        return Arrays.copyOf(iArr, 8);
    }
}
