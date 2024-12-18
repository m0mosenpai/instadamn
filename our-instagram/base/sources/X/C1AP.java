package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.1AP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AP {
    public static final Charset A0A = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ByteBuffer A06;
    public boolean A07;
    public int[] A08;
    public int[] A09;

    public final void A03() {
        if (!this.A07) {
            int[] iArr = this.A08;
            if (iArr == null || iArr.length < 3) {
                iArr = new int[3];
                this.A08 = iArr;
            }
            this.A05 = 3;
            Arrays.fill(iArr, 0, 3, 0);
            this.A07 = true;
            this.A02 = this.A06.capacity() - this.A03;
            return;
        }
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    public final void A04(int i) {
        A06(4, 0);
        int capacity = this.A06.capacity();
        int i2 = this.A03;
        int i3 = ((capacity - i2) - i) + 4;
        ByteBuffer byteBuffer = this.A06;
        int i4 = i2 - 4;
        this.A03 = i4;
        byteBuffer.putInt(i4, i3);
    }

    public final void A05(int i, int i2) {
        if (i2 != 0) {
            A04(i2);
            this.A08[i] = this.A06.capacity() - this.A03;
        }
    }

    public final int A00() {
        if (this.A08 != null && this.A07) {
            A06(4, 0);
            ByteBuffer byteBuffer = this.A06;
            int i = this.A03 - 4;
            this.A03 = i;
            byteBuffer.putInt(i, 0);
            int capacity = this.A06.capacity() - this.A03;
            int i2 = this.A05;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                int i3 = this.A08[i2];
                int i4 = 0;
                if (i3 != 0) {
                    i4 = capacity - i3;
                }
                short s = (short) i4;
                A06(2, 0);
                ByteBuffer byteBuffer2 = this.A06;
                int i5 = this.A03 - 2;
                this.A03 = i5;
                byteBuffer2.putShort(i5, s);
            }
            short s2 = (short) (capacity - this.A02);
            A06(2, 0);
            ByteBuffer byteBuffer3 = this.A06;
            int i6 = this.A03 - 2;
            this.A03 = i6;
            byteBuffer3.putShort(i6, s2);
            short s3 = (short) ((this.A05 + 2) * 2);
            A06(2, 0);
            ByteBuffer byteBuffer4 = this.A06;
            int i7 = this.A03 - 2;
            this.A03 = i7;
            byteBuffer4.putShort(i7, s3);
            int i8 = 0;
            while (true) {
                if (i8 >= this.A01) {
                    break;
                }
                int capacity2 = this.A06.capacity() - this.A09[i8];
                int i9 = this.A03;
                short s4 = this.A06.getShort(capacity2);
                if (s4 == this.A06.getShort(i9)) {
                    for (int i10 = 2; i10 < s4; i10 += 2) {
                        if (this.A06.getShort(capacity2 + i10) == this.A06.getShort(i9 + i10)) {
                        }
                    }
                    int i11 = this.A09[i8];
                    if (i11 != 0) {
                        int capacity3 = this.A06.capacity() - capacity;
                        this.A03 = capacity3;
                        this.A06.putInt(capacity3, i11 - capacity);
                    }
                }
                i8++;
            }
            int i12 = this.A01;
            int[] iArr = this.A09;
            if (i12 == iArr.length) {
                iArr = Arrays.copyOf(iArr, i12 * 2);
                this.A09 = iArr;
            }
            int i13 = this.A01;
            this.A01 = i13 + 1;
            iArr[i13] = this.A06.capacity() - this.A03;
            ByteBuffer byteBuffer5 = this.A06;
            byteBuffer5.putInt(byteBuffer5.capacity() - capacity, (this.A06.capacity() - this.A03) - capacity);
            this.A07 = false;
            return capacity;
        }
        throw new AssertionError("FlatBuffers: endObject called without startObject");
    }

    public final int A01() {
        int i = this.A04;
        ByteBuffer byteBuffer = this.A06;
        int i2 = this.A03 - 4;
        this.A03 = i2;
        byteBuffer.putInt(i2, i);
        return this.A06.capacity() - this.A03;
    }

    public final int A02(String str) {
        byte[] bytes = str.getBytes(A0A);
        A06(1, 0);
        ByteBuffer byteBuffer = this.A06;
        int i = this.A03 - 1;
        this.A03 = i;
        byteBuffer.put(i, (byte) 0);
        int length = bytes.length;
        A07(1, length, 1);
        ByteBuffer byteBuffer2 = this.A06;
        int i2 = this.A03 - length;
        this.A03 = i2;
        byteBuffer2.position(i2);
        this.A06.put(bytes, 0, length);
        return A01();
    }

    public final void A06(int i, int i2) {
        if (i > this.A00) {
            this.A00 = i;
        }
        int capacity = this.A06.capacity();
        int i3 = this.A03;
        int i4 = ((((capacity - i3) + i2) ^ (-1)) + 1) & (i - 1);
        while (i3 < i4 + i + i2) {
            int capacity2 = this.A06.capacity();
            ByteBuffer byteBuffer = this.A06;
            int capacity3 = byteBuffer.capacity();
            if (((-1073741824) & capacity3) == 0) {
                int i5 = capacity3 << 1;
                byteBuffer.position(0);
                ByteBuffer allocate = ByteBuffer.allocate(i5);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.position(i5 - capacity3);
                allocate.put(byteBuffer);
                this.A06 = allocate;
                i3 = this.A03 + (allocate.capacity() - capacity2);
                this.A03 = i3;
            } else {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ByteBuffer byteBuffer2 = this.A06;
            int i7 = this.A03 - 1;
            this.A03 = i7;
            byteBuffer2.put(i7, (byte) 0);
        }
    }

    public final void A07(int i, int i2, int i3) {
        if (!this.A07) {
            this.A04 = i2;
            int i4 = i * i2;
            A06(4, i4);
            A06(i3, i4);
            return;
        }
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    public C1AP(int i) {
        this.A00 = 1;
        this.A08 = null;
        this.A05 = 0;
        this.A07 = false;
        this.A09 = new int[16];
        this.A01 = 0;
        this.A04 = 0;
        this.A03 = i;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.A06 = allocate;
    }

    public C1AP() {
        this(1024);
    }
}
