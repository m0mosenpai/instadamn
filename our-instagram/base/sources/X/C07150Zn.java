package X;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: X.0Zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07150Zn {
    public static final int[] A02 = new int[3];
    public final int A00;
    public final IntBuffer A01;

    public final int A01(int i, int i2) {
        int i3 = 0;
        do {
            int A022 = ((this.A00 * i3) + A02(i, i2, i3)) * 3;
            IntBuffer intBuffer = this.A01;
            intBuffer.position(A022);
            int i4 = intBuffer.get();
            int i5 = intBuffer.get();
            int i6 = intBuffer.get();
            if (i == i4 && i2 == i5) {
                intBuffer.position(A022);
                intBuffer.put(A02);
                return i6;
            }
            i3++;
        } while (i3 < 2);
        return 0;
    }

    public final int A03(int i, int i2, int i3) {
        if (i3 != 0) {
            return A00(i, i2, i3, 0, 0);
        }
        throw new IllegalArgumentException("Value 0 is reserved and can't be put into the map");
    }

    private int A00(int i, int i2, int i3, int i4, int i5) {
        int i6;
        IntBuffer intBuffer;
        if (i5 >= 5) {
            return i;
        }
        int i7 = 0;
        do {
            int A022 = A02(i, i2, i7);
            i6 = this.A00;
            intBuffer = this.A01;
            intBuffer.position(((i7 * i6) + A022) * 3);
            int i8 = intBuffer.get();
            int i9 = intBuffer.get();
            if (i8 == i && i9 == i2) {
                intBuffer.put(i3);
                return 0;
            }
            i7++;
        } while (i7 < 2);
        int A023 = ((i4 * i6) + A02(i, i2, i4)) * 3;
        intBuffer.position(A023);
        int i10 = intBuffer.get();
        int i11 = intBuffer.get();
        int i12 = intBuffer.get();
        intBuffer.position(A023);
        intBuffer.put(i);
        intBuffer.put(i2);
        intBuffer.put(i3);
        if (i10 == 0 && i11 == 0) {
            return 0;
        }
        return A00(i10, i11, i12, (i4 + 1) % 2, i5 + 1);
    }

    public final int A02(int i, int i2, int i3) {
        int abs;
        int i4;
        if (i3 != 0) {
            if (i3 == 1) {
                i4 = this.A00;
                abs = Math.abs((i + (i2 * 31)) / i4);
            } else {
                throw new IllegalArgumentException("Supporting only 2 hashes at the moment");
            }
        } else {
            abs = Math.abs(i + (i2 * 31));
            i4 = this.A00;
        }
        return abs % i4;
    }

    public C07150Zn(ByteBuffer byteBuffer) {
        int limit = ((byteBuffer.limit() / 4) / 3) / 2;
        this.A01 = byteBuffer.asIntBuffer();
        this.A00 = limit;
    }
}
