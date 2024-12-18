package X;

import android.os.SystemClock;
import android.util.Base64;
import java.nio.MappedByteBuffer;

/* renamed from: X.0Mo, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Mo {
    public int A01;
    public boolean A02;
    public byte A03;
    public final int A05;
    public final int A06;
    public final InterfaceC04680Mk A07;
    public final MappedByteBuffer A08;
    public final byte[] A09;
    public final byte[] A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final byte A0D;
    public final boolean A0E;
    public final boolean A0F;
    public boolean A04 = false;
    public int A00 = -1;

    private boolean A09(byte[] bArr, int i, boolean z) {
        boolean z2 = false;
        if (i != 0) {
            A01();
            MappedByteBuffer mappedByteBuffer = this.A08;
            int position = mappedByteBuffer.position() + i;
            int i2 = this.A05;
            if (position >= i2) {
                boolean A08 = A08(z);
                int position2 = i2 - mappedByteBuffer.position();
                mappedByteBuffer.put(bArr, 0, position2);
                mappedByteBuffer.position(this.A06);
                mappedByteBuffer.put(bArr, position2, i - position2);
                z2 = A08;
            } else {
                mappedByteBuffer.put(bArr, 0, i);
            }
            if (this.A01 == 0) {
                this.A01 = this.A06;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r1 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(int r15) {
        /*
            r14 = this;
            int r12 = r14.A01
            if (r12 != 0) goto L72
            int r12 = r14.A05
            java.nio.MappedByteBuffer r2 = r14.A08
            int r0 = r2.position()
            int r12 = r12 - r0
        Ld:
            int[] r5 = r14.A0C
            r0 = 1
            int r15 = r15 - r0
            r13 = r5[r15]
            byte[] r6 = r14.A0A
            int r4 = r6.length
            int r13 = r13 + r4
            byte[] r0 = r14.A09
            int r3 = r0.length
            int r13 = r13 + r3
            r10 = 0
            r1 = 0
        L1d:
            if (r13 <= r12) goto L9a
            int r0 = r14.A01
            r11 = 0
            if (r0 == 0) goto L8a
            int r9 = r2.position()
            int r0 = r14.A01
            r2.position(r0)
            r8 = 0
        L2e:
            if (r8 >= r4) goto L6d
            byte r7 = r2.get()
            if (r8 != 0) goto L59
            if (r7 != 0) goto L59
        L38:
            r2.position(r9)
            if (r11 <= 0) goto L8a
            int r0 = r5.length
            byte r0 = (byte) r0
            if (r11 > r0) goto L8a
            int r0 = r11 + (-1)
            r0 = r5[r0]
            int r0 = r0 + r4
            int r0 = r0 + r3
            int r12 = r12 + r0
            int r1 = r14.A01
            int r1 = r1 + r0
            r14.A01 = r1
            int r0 = r14.A05
            if (r1 < r0) goto L57
            int r1 = r1 - r0
            int r0 = r14.A06
            int r1 = r1 + r0
            r14.A01 = r1
        L57:
            r1 = 1
            goto L1d
        L59:
            int r1 = r2.position()
            int r0 = r14.A05
            if (r1 < r0) goto L66
            int r0 = r14.A06
            r2.position(r0)
        L66:
            r0 = r6[r8]
            if (r7 != r0) goto L82
            int r8 = r8 + 1
            goto L2e
        L6d:
            byte r11 = r2.get()
            goto L38
        L72:
            java.nio.MappedByteBuffer r2 = r14.A08
            int r0 = r2.position()
            int r12 = r12 - r0
            if (r12 >= 0) goto Ld
            int r1 = r14.A05
            int r0 = r14.A06
            int r1 = r1 - r0
            int r12 = r12 + r1
            goto Ld
        L82:
            java.lang.String r1 = "Invalid start record marker"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L8a:
            java.lang.String r8 = "Invalid type for next record: "
            java.lang.String r9 = " space: "
            java.lang.String r10 = " size: "
            java.lang.String r1 = X.AnonymousClass001.A0p(r8, r9, r10, r11, r12, r13)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L9a:
            if (r1 == 0) goto L9e
            int r10 = r12 - r13
        L9e:
            int r0 = r14.A01
            if (r0 == 0) goto La8
            if (r1 == 0) goto La7
        La4:
            r14.A02()
        La7:
            return r10
        La8:
            int r0 = r14.A06
            r14.A01 = r0
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Mo.A00(int):int");
    }

    private void A01() {
        int position = this.A08.position();
        if (position >= this.A06) {
            if (position < this.A05) {
                return;
            } else {
                throw new IllegalStateException("Wrote past buffer end");
            }
        }
        throw new IllegalStateException("Writing on header");
    }

    private void A02() {
        MappedByteBuffer mappedByteBuffer = this.A08;
        int position = mappedByteBuffer.position();
        try {
            mappedByteBuffer.position(2);
            if (this.A0E) {
                mappedByteBuffer.putShort((short) this.A01);
            } else {
                mappedByteBuffer.putInt(this.A01);
            }
        } finally {
            mappedByteBuffer.position(position);
        }
    }

    public static void A03(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void A04(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
    }

    public static void A05(C0Mo c0Mo) {
        if (c0Mo.A04) {
        } else {
            throw new IllegalStateException("Buffer not initialized before write");
        }
    }

    public static void A06(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s >>> 8);
        bArr[i + 1] = (byte) s;
    }

    private boolean A08(boolean z) {
        if (z && this.A03 < Byte.MAX_VALUE) {
            MappedByteBuffer mappedByteBuffer = this.A08;
            int position = mappedByteBuffer.position();
            this.A03 = (byte) (this.A03 + 1);
            try {
                mappedByteBuffer.position(1);
                mappedByteBuffer.put(this.A03);
                return true;
            } finally {
                mappedByteBuffer.position(position);
            }
        }
        return false;
    }

    public final long A0A() {
        MappedByteBuffer mappedByteBuffer = this.A08;
        mappedByteBuffer.position(0);
        mappedByteBuffer.put(this.A0D);
        mappedByteBuffer.put((byte) 0);
        boolean z = this.A0E;
        int i = this.A06;
        if (z) {
            mappedByteBuffer.putShort((short) i);
        } else {
            mappedByteBuffer.putInt(i);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        mappedByteBuffer.putLong(uptimeMillis);
        InterfaceC04680Mk interfaceC04680Mk = this.A07;
        if (interfaceC04680Mk != null) {
            for (int i2 = 0; i2 < interfaceC04680Mk.BYD(); i2++) {
                int Bxh = interfaceC04680Mk.Bxh(i2);
                if (Bxh != 1) {
                    if (Bxh != 2) {
                        if (Bxh != 4) {
                            if (Bxh == 8) {
                                mappedByteBuffer.putLong(interfaceC04680Mk.BP8(i2));
                            } else {
                                throw new IllegalArgumentException(AnonymousClass001.A0O("Invalid field size: ", Bxh));
                            }
                        } else {
                            mappedByteBuffer.putInt(interfaceC04680Mk.BIh(i2));
                        }
                    } else {
                        mappedByteBuffer.putShort(interfaceC04680Mk.Bus(i2));
                    }
                } else {
                    mappedByteBuffer.put(interfaceC04680Mk.AjS(i2));
                }
            }
        }
        mappedByteBuffer.put(new byte[this.A05 - i]);
        mappedByteBuffer.position(i);
        this.A04 = true;
        return uptimeMillis;
    }

    public final String A0B() {
        MappedByteBuffer mappedByteBuffer = this.A08;
        int position = mappedByteBuffer.position();
        mappedByteBuffer.position(0);
        byte[] bArr = new byte[this.A05];
        mappedByteBuffer.get(bArr);
        mappedByteBuffer.position(position);
        return Base64.encodeToString(bArr, 2);
    }

    public final void A0D() {
        MappedByteBuffer mappedByteBuffer = this.A08;
        int i = this.A06;
        mappedByteBuffer.position(i);
        for (int i2 = i; i2 < this.A05; i2++) {
            mappedByteBuffer.put((byte) 0);
        }
        mappedByteBuffer.position(2);
        if (this.A0E) {
            mappedByteBuffer.putShort((short) i);
        } else {
            mappedByteBuffer.putInt(i);
        }
        mappedByteBuffer.position(i);
        this.A01 = 0;
    }

    public final void A0H(StringBuilder sb) {
        sb.append("Read position: ");
        sb.append(this.A01);
        sb.append(" cycle counter: ");
        sb.append((int) this.A03);
        sb.append(" write position: ");
        sb.append(this.A08.position());
        sb.append(" last record start: ");
        sb.append(this.A00);
        sb.append(" last cycled: ");
        sb.append(this.A02);
    }

    public C0Mo(InterfaceC04680Mk interfaceC04680Mk, MappedByteBuffer mappedByteBuffer, int[] iArr, byte b, int i, boolean z) {
        int i2;
        int i3;
        if (i > 0) {
            this.A0E = i <= 32767;
            this.A08 = mappedByteBuffer;
            this.A05 = i;
            this.A07 = interfaceC04680Mk;
            if (interfaceC04680Mk != null) {
                i2 = interfaceC04680Mk.BYD();
                i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    i3 += this.A07.Bxh(i4);
                }
                if (i3 > i) {
                    throw new IllegalArgumentException("Header size too big");
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            this.A0B = new int[i2];
            int i5 = (this.A0E ? 2 : 4) + 10;
            if (this.A07 != null) {
                int i6 = i5;
                for (int i7 = 0; i7 < i2; i7++) {
                    if (i7 > 0) {
                        i6 += this.A07.Bxh(i7 - 1);
                    }
                    this.A0B[i7] = i6;
                }
            }
            this.A0D = b;
            int i8 = i3 + i5;
            this.A06 = i8;
            if (iArr.length < 127) {
                this.A0C = iArr;
                int i9 = 0;
                for (int i10 : iArr) {
                    if (i10 > i9) {
                        i9 = i10;
                    }
                }
                if (i9 <= this.A05 - i8) {
                    this.A0F = z;
                    this.A0A = new byte[0];
                    this.A09 = new byte[0];
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0c("Record size of ", " too big", i9));
            }
            throw new IllegalArgumentException("Too many record types");
        }
        throw new IllegalArgumentException("Invalid buffer size");
    }

    private boolean A07(byte b, boolean z) {
        A01();
        MappedByteBuffer mappedByteBuffer = this.A08;
        mappedByteBuffer.put(b);
        if (mappedByteBuffer.position() >= this.A05) {
            boolean A08 = A08(z);
            mappedByteBuffer.position(this.A06);
            return A08;
        }
        return false;
    }

    public final void A0C() {
        A05(this);
        int i = this.A00;
        if (i != -1) {
            int i2 = this.A05;
            MappedByteBuffer mappedByteBuffer = this.A08;
            if (i >= i2) {
                mappedByteBuffer.position(this.A06);
            } else {
                mappedByteBuffer.position(i);
            }
            try {
                mappedByteBuffer.put((byte) 0);
                if (this.A02) {
                    this.A03 = (byte) (this.A03 - 1);
                    mappedByteBuffer.position(1);
                    mappedByteBuffer.put(this.A03);
                    this.A02 = false;
                }
                mappedByteBuffer.position(this.A00);
                if (this.A00 == this.A06 && this.A03 == 0) {
                    this.A01 = 0;
                    A02();
                }
                this.A00 = -1;
            } finally {
            }
        } else {
            throw new IllegalStateException("Cannot remove");
        }
    }

    public final void A0E(int i, byte b) {
        A05(this);
        int i2 = this.A0B[i];
        MappedByteBuffer mappedByteBuffer = this.A08;
        int position = mappedByteBuffer.position();
        try {
            mappedByteBuffer.position(i2);
            mappedByteBuffer.put(b);
        } finally {
            mappedByteBuffer.position(position);
        }
    }

    public final void A0F(int i, long j) {
        A05(this);
        int i2 = this.A0B[i];
        MappedByteBuffer mappedByteBuffer = this.A08;
        int position = mappedByteBuffer.position();
        try {
            mappedByteBuffer.position(i2);
            mappedByteBuffer.putLong(j);
        } finally {
            mappedByteBuffer.position(position);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r2 != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(int r9, byte... r10) {
        /*
            r8 = this;
            A05(r8)
            boolean r2 = r8.A0F
            int[] r1 = r8.A0C
            int r0 = r9 + (-1)
            r7 = r1[r0]
            r5 = 1
            int r7 = r7 - r5
            int r0 = r10.length
            if (r2 == 0) goto L57
            if (r0 < r7) goto Lb0
            java.nio.MappedByteBuffer r4 = r8.A08
            int r0 = r4.position()
            r8.A00 = r0
            int r3 = r8.A00(r9)
            byte[] r1 = r8.A0A
            int r0 = r1.length
            boolean r2 = r8.A09(r1, r0, r5)
            byte[] r1 = new byte[r5]
            byte r0 = (byte) r9
            r6 = 0
            r1[r6] = r0
            boolean r0 = r8.A09(r1, r5, r5)
            if (r0 != 0) goto L34
            r1 = 0
            if (r2 == 0) goto L35
        L34:
            r1 = 1
        L35:
            boolean r0 = r8.A09(r10, r7, r5)
            if (r0 != 0) goto L3e
            r2 = 0
            if (r1 == 0) goto L3f
        L3e:
            r2 = 1
        L3f:
            byte[] r1 = r8.A09
            int r0 = r1.length
            boolean r0 = r8.A09(r1, r0, r5)
            if (r0 != 0) goto L4b
            if (r2 != 0) goto L4b
            r5 = 0
        L4b:
            if (r3 <= 0) goto Lae
            int r1 = r4.position()
            byte[] r0 = new byte[r3]     // Catch: java.lang.Throwable -> La6
            r8.A09(r0, r3, r6)     // Catch: java.lang.Throwable -> La6
            goto Lab
        L57:
            if (r0 < r7) goto Lb0
            java.nio.MappedByteBuffer r4 = r8.A08
            int r0 = r4.position()
            r8.A00 = r0
            int r3 = r8.A00(r9)
            byte[] r1 = r8.A0A
            int r0 = r1.length
            boolean r1 = r8.A09(r1, r0, r5)
            byte r0 = (byte) r9
            boolean r0 = r8.A07(r0, r5)
            r6 = 0
            if (r0 != 0) goto L77
            r2 = 0
            if (r1 == 0) goto L78
        L77:
            r2 = 1
        L78:
            r1 = 0
        L79:
            if (r1 >= r7) goto L8b
            r0 = r10[r1]
            boolean r0 = r8.A07(r0, r5)
            if (r0 != 0) goto L87
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L88
        L87:
            r2 = 1
        L88:
            int r1 = r1 + 1
            goto L79
        L8b:
            byte[] r1 = r8.A09
            int r0 = r1.length
            boolean r0 = r8.A09(r1, r0, r5)
            if (r0 != 0) goto L97
            if (r2 != 0) goto L97
            r5 = 0
        L97:
            if (r3 <= 0) goto Lae
            int r1 = r4.position()
            r0 = 0
        L9e:
            r8.A07(r6, r6)     // Catch: java.lang.Throwable -> La6
            int r0 = r0 + 1
            if (r0 >= r3) goto Lab
            goto L9e
        La6:
            r0 = move-exception
            r4.position(r1)
            throw r0
        Lab:
            r4.position(r1)
        Lae:
            r8.A02 = r5
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Mo.A0G(int, byte[]):void");
    }
}
