package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AKY {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AbstractC223609u3 A06;
    public ByteBuffer A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public int[] A0B;
    public final SK3 A0C;

    public static ByteBuffer A00(AbstractC223609u3 abstractC223609u3, AKY aky, int i) {
        ByteBuffer order;
        aky.A00 = 1;
        aky.A0A = null;
        aky.A05 = 0;
        aky.A09 = false;
        aky.A08 = false;
        aky.A0B = new int[16];
        aky.A01 = 0;
        aky.A04 = 0;
        aky.A06 = abstractC223609u3;
        if (abstractC223609u3 instanceof C211359Wj) {
            order = ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
            C14360o3.A07(order);
        } else {
            order = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
        aky.A07 = order;
        return order;
    }

    public final void A05(int i) {
        A0B(4, 0);
        int capacity = this.A07.capacity();
        int i2 = this.A03;
        int i3 = ((capacity - i2) - i) + 4;
        ByteBuffer byteBuffer = this.A07;
        int i4 = i2 - 4;
        this.A03 = i4;
        byteBuffer.putInt(i4, i3);
    }

    public final void A09(int i, int i2) {
        if (i2 != 0) {
            A0B(4, 0);
            ByteBuffer byteBuffer = this.A07;
            int i3 = this.A03 - 4;
            this.A03 = i3;
            byteBuffer.putInt(i3, i2);
            A07(i);
        }
    }

    public final void A0A(int i, int i2) {
        if (i2 != 0) {
            A05(i2);
            A07(i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.SK3] */
    public AKY(AbstractC223609u3 abstractC223609u3, int i) {
        SK3 sk3 = SK3.A00;
        SK3 sk32 = sk3;
        if (sk3 == null) {
            ?? obj = new Object();
            SK3.A00 = obj;
            sk32 = obj;
        }
        ByteBuffer A00 = A00(abstractC223609u3, this, i);
        this.A0C = sk32;
        this.A03 = A00.capacity();
    }

    public final int A01() {
        if (this.A0A != null && this.A09) {
            A0B(4, 0);
            ByteBuffer byteBuffer = this.A07;
            int i = this.A03 - 4;
            this.A03 = i;
            byteBuffer.putInt(i, 0);
            int capacity = this.A07.capacity() - this.A03;
            int i2 = this.A05;
            do {
                i2--;
                if (i2 < 0) {
                    break;
                }
            } while (this.A0A[i2] == 0);
            int i3 = i2 + 1;
            while (i2 >= 0) {
                int i4 = this.A0A[i2];
                int i5 = 0;
                if (i4 != 0) {
                    i5 = capacity - i4;
                }
                short s = (short) i5;
                A0B(2, 0);
                ByteBuffer byteBuffer2 = this.A07;
                int i6 = this.A03 - 2;
                this.A03 = i6;
                byteBuffer2.putShort(i6, s);
                i2--;
            }
            short s2 = (short) (capacity - this.A02);
            A0B(2, 0);
            ByteBuffer byteBuffer3 = this.A07;
            int i7 = this.A03 - 2;
            this.A03 = i7;
            byteBuffer3.putShort(i7, s2);
            A0B(2, 0);
            ByteBuffer byteBuffer4 = this.A07;
            int i8 = this.A03 - 2;
            this.A03 = i8;
            byteBuffer4.putShort(i8, (short) ((i3 + 2) * 2));
            int i9 = 0;
            while (true) {
                if (i9 >= this.A01) {
                    break;
                }
                int capacity2 = this.A07.capacity() - this.A0B[i9];
                int i10 = this.A03;
                short s3 = this.A07.getShort(capacity2);
                if (s3 == this.A07.getShort(i10)) {
                    for (int i11 = 2; i11 < s3; i11 += 2) {
                        if (this.A07.getShort(capacity2 + i11) == this.A07.getShort(i10 + i11)) {
                        }
                    }
                    int i12 = this.A0B[i9];
                    if (i12 != 0) {
                        int capacity3 = this.A07.capacity() - capacity;
                        this.A03 = capacity3;
                        this.A07.putInt(capacity3, i12 - capacity);
                    }
                }
                i9++;
            }
            int i13 = this.A01;
            int[] iArr = this.A0B;
            if (i13 == iArr.length) {
                iArr = Arrays.copyOf(iArr, i13 * 2);
                this.A0B = iArr;
            }
            int i14 = this.A01;
            this.A01 = i14 + 1;
            iArr[i14] = this.A07.capacity() - this.A03;
            ByteBuffer byteBuffer5 = this.A07;
            byteBuffer5.putInt(byteBuffer5.capacity() - capacity, (this.A07.capacity() - this.A03) - capacity);
            this.A09 = false;
            return capacity;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public final int A02() {
        if (this.A09) {
            this.A09 = false;
            int i = this.A04;
            ByteBuffer byteBuffer = this.A07;
            int i2 = this.A03 - 4;
            this.A03 = i2;
            byteBuffer.putInt(i2, i);
            return this.A07.capacity() - this.A03;
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public final int A03(CharSequence charSequence) {
        SK3 sk3 = this.A0C;
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i) >= 65536) {
                                i++;
                            } else {
                                throw new RkL(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            A0B(1, 0);
            ByteBuffer byteBuffer = this.A07;
            int i4 = this.A03 - 1;
            this.A03 = i4;
            byteBuffer.put(i4, (byte) 0);
            if (!this.A09) {
                this.A04 = i2;
                A0B(4, i2);
                A0B(1, i2);
                this.A09 = true;
                ByteBuffer byteBuffer2 = this.A07;
                int i5 = this.A03 - i2;
                this.A03 = i5;
                byteBuffer2.position(i5);
                sk3.A00(this.A07, charSequence);
                return A02();
            }
            throw new AssertionError(AbstractC111324zv.A00(1633));
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0Q(AbstractC58317Pt9.A00(638), i2 + 4294967296L));
    }

    public final void A04() {
        if (this.A08) {
        } else {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public final void A06(int i) {
        A0B(this.A00, 4);
        A05(i);
        this.A07.position(this.A03);
        this.A08 = true;
    }

    public final void A07(int i) {
        this.A0A[i] = this.A07.capacity() - this.A03;
    }

    public final void A08(int i) {
        if (!this.A09) {
            int[] iArr = this.A0A;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
                this.A0A = iArr;
            }
            this.A05 = i;
            Arrays.fill(iArr, 0, i, 0);
            this.A09 = true;
            this.A02 = this.A07.capacity() - this.A03;
            return;
        }
        throw new AssertionError(AbstractC111324zv.A00(1633));
    }

    public final void A0B(int i, int i2) {
        ByteBuffer order;
        if (i > this.A00) {
            this.A00 = i;
        }
        int capacity = this.A07.capacity();
        int i3 = this.A03;
        int i4 = ((((capacity - i3) + i2) ^ (-1)) + 1) & (i - 1);
        while (i3 < i4 + i + i2) {
            int capacity2 = this.A07.capacity();
            ByteBuffer byteBuffer = this.A07;
            AbstractC223609u3 abstractC223609u3 = this.A06;
            int capacity3 = byteBuffer.capacity();
            int i5 = 1024;
            if (capacity3 != 0) {
                i5 = 2147483639;
                if (capacity3 != 2147483639) {
                    if (((-1073741824) & capacity3) == 0) {
                        i5 = capacity3 << 1;
                    }
                } else {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
            }
            byteBuffer.position(0);
            if (abstractC223609u3 instanceof C211359Wj) {
                order = ByteBuffer.allocateDirect(i5).order(ByteOrder.LITTLE_ENDIAN);
                C14360o3.A07(order);
            } else {
                order = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
            }
            order.position(order.clear().capacity() - capacity3);
            order.put(byteBuffer);
            this.A07 = order;
            i3 = this.A03 + (order.capacity() - capacity2);
            this.A03 = i3;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ByteBuffer byteBuffer2 = this.A07;
            int i7 = this.A03 - 1;
            this.A03 = i7;
            byteBuffer2.put(i7, (byte) 0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.SK3] */
    public AKY() {
        C211349Wi c211349Wi = C211349Wi.A00;
        SK3 sk3 = SK3.A00;
        SK3 sk32 = sk3;
        if (sk3 == null) {
            ?? obj = new Object();
            SK3.A00 = obj;
            sk32 = obj;
        }
        ByteBuffer A00 = A00(c211349Wi, this, 1024);
        this.A0C = sk32;
        this.A03 = A00.capacity();
    }
}
