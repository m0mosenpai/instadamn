package X;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class OMh {
    public byte A00;
    public int A01;
    public final ByteBuffer A02;

    public final void A03(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= 15) {
                break;
            }
            int i5 = (1 << i3) + i4;
            if (i < i5) {
                i2 = i3;
                break;
            } else {
                i3++;
                i4 = i5;
            }
        }
        A04(i2, 0L);
        A01(1);
        A04(i2, i - i4);
    }

    public final void A04(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            A01((int) ((j >> ((i - i2) - 1)) & 1));
        }
    }

    public final void A00() {
        if (this.A01 != 0) {
            this.A02.put(this.A00);
            this.A01 = 0;
            this.A00 = (byte) 0;
        }
    }

    public final void A01(int i) {
        byte b = this.A00;
        int i2 = this.A01;
        this.A00 = (byte) (((i & 1) << (7 - i2)) | b);
        int i3 = i2 + 1;
        this.A01 = i3;
        if (i3 == 8) {
            A00();
        }
    }

    public final void A02(int i) {
        if (this.A01 > 0) {
            A00();
        }
        ByteBuffer byteBuffer = this.A02;
        long j = i;
        C18C.A05(j, "out of range: %s", AbstractC167007dF.A1N(((j >> 8) > 0L ? 1 : ((j >> 8) == 0L ? 0 : -1))));
        byteBuffer.put((byte) j);
    }

    public OMh(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        C14360o3.A07(allocateDirect);
        this.A02 = allocateDirect;
    }

    public final void A05(ByteBuffer byteBuffer) {
        A00();
        ByteBuffer duplicate = byteBuffer.duplicate();
        C14360o3.A07(duplicate);
        while (duplicate.position() < duplicate.limit()) {
            A02(duplicate.get() & 255);
        }
    }
}
