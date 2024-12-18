package X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.2in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56542in {
    public final C56562ip A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;
    public static final C56552io A06 = new Object();
    public static final float[] A07 = {1.0f, 0.0f, 0.55191505f, 1.0f, 1.0f, 0.55191505f};
    public static final float[] A08 = {-1.0f, 0.0f, -0.55191505f, 1.0f, -1.0f, 0.55191505f};
    public static final C12550kz A05 = new C12550kz(2);

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.2ip] */
    public C56542in(C56472ig c56472ig, ByteBuffer byteBuffer) {
        int i;
        float f;
        int i2;
        int i3;
        float[] copyOf;
        byte b;
        int i4;
        int i5;
        byte b2;
        int i6;
        int i7;
        int i8;
        int i9 = byteBuffer.get() & 255;
        int position = byteBuffer.position();
        int max = Math.max(i9, 32) * 2;
        C12550kz c12550kz = A05;
        byte[] bArr = (byte[]) c12550kz.A7H();
        bArr = (bArr == null || bArr.length < max) ? new byte[max] : bArr;
        int i10 = i9;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i11 < i9) {
            int i17 = i12 + 1;
            byte b3 = byteBuffer.get();
            bArr[i12] = b3;
            int i18 = (b3 >> 5) & 7;
            boolean z = (b3 & 16) != 0;
            int i19 = b3 & 15;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            throw new IllegalArgumentException(Integer.toHexString(b3));
                        }
                    } else {
                        i12 = i17 + 1;
                        byte b4 = byteBuffer.get();
                        bArr[i17] = b4;
                        int i20 = (b4 >> 4) & 15;
                        int i21 = b4 & 15;
                        if (z) {
                            b2 = byteBuffer.get();
                            bArr[i12] = b2;
                            i12++;
                        } else {
                            b2 = 1;
                        }
                        i16 += b2 * 3;
                        if ((i19 & 8) != 0) {
                            i6 = 1;
                        } else {
                            i6 = 2;
                            if ((i19 & 4) != 0) {
                                i6 = 0;
                            }
                        }
                        if ((i20 & 8) != 0) {
                            i7 = 1;
                        } else {
                            i7 = 2;
                            if ((i20 & 4) != 0) {
                                i7 = 0;
                            }
                        }
                        int i22 = i6 + i7;
                        if ((i21 & 8) != 0) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                            if ((i21 & 4) != 0) {
                                i8 = 0;
                            }
                        }
                        i13 += (i22 + i8) * b2;
                        int i23 = 2;
                        if ((i19 & 2) != 0) {
                            i23 = 1;
                        } else if ((i19 & 1) != 0) {
                            i23 = 0;
                        }
                        int i24 = 2;
                        if ((i20 & 2) != 0) {
                            i24 = 1;
                        } else if ((i20 & 1) != 0) {
                            i24 = 0;
                        }
                        int i25 = i23 + i24;
                        int i26 = 2;
                        if ((i21 & 2) != 0) {
                            i26 = 1;
                        } else if ((i21 & 1) != 0) {
                            i26 = 0;
                        }
                        i14 += (i25 + i26) * b2;
                        if (b2 > 1) {
                            i11 += b2 - 1;
                        }
                        i11++;
                    }
                } else {
                    i10 += 4;
                    i16 += 13;
                    if ((i19 & 8) != 0) {
                        i5 = 1;
                    } else {
                        i5 = 2;
                        if ((i19 & 4) != 0) {
                            i5 = 0;
                        }
                    }
                    i13 += i5;
                    int i27 = 2;
                    if ((i19 & 2) != 0) {
                        i27 = 1;
                    } else if ((i19 & 1) != 0) {
                        i27 = 0;
                    }
                    i14 += i27;
                    i15 += z ? 1 : 2;
                }
            } else {
                i16++;
                if ((i19 & 8) != 0) {
                    i4 = 1;
                } else {
                    i4 = 2;
                    if ((i19 & 4) != 0) {
                        i4 = 0;
                    }
                }
                i13 += i4;
                int i28 = 2;
                if ((i19 & 2) != 0) {
                    i28 = 1;
                } else if ((i19 & 1) != 0) {
                    i28 = 0;
                }
                i14 += i28;
            }
            i12 = i17;
            i11++;
        }
        this.A01 = Arrays.copyOf(bArr, i12);
        c12550kz.EE6(bArr);
        byte[] bArr2 = new byte[i13];
        byte[] bArr3 = new byte[i14];
        byte[] bArr4 = new byte[i15];
        int position2 = byteBuffer.position();
        byteBuffer.get(bArr2);
        int position3 = byteBuffer.position();
        byteBuffer.get(bArr3);
        int position4 = byteBuffer.position();
        byteBuffer.get(bArr4);
        int position5 = byteBuffer.position();
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A02 = bArr4;
        byte[] bArr5 = new byte[i10];
        int i29 = i16 * 2;
        float[] fArr = new float[i29];
        float[] fArr2 = new float[2];
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = position + 1;
            byte b5 = byteBuffer.get(position);
            int i33 = (b5 >> 5) & 7;
            byte b6 = (b5 & 16) != 0 ? (byte) 1 : (byte) 0;
            int i34 = b5 & 15;
            if (i33 != 0) {
                if (i33 != 1) {
                    if (i33 != 2) {
                        if (i33 == 3) {
                            bArr5[i30] = 4;
                        } else {
                            throw new IllegalArgumentException(Integer.toHexString(b5));
                        }
                    } else {
                        int i35 = i32 + 1;
                        byte b7 = byteBuffer.get(i32);
                        int i36 = (b7 >> 4) & 15;
                        int i37 = b7 & 15;
                        if (b6 != 0) {
                            position = i35 + 1;
                            b = byteBuffer.get(i35);
                        } else {
                            position = i35;
                            b = 1;
                        }
                        int i38 = b + i30;
                        while (i30 < i38) {
                            bArr5[i30] = 3;
                            int i39 = i31 + 1;
                            int A00 = position2 + C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i34, position2, i31, true);
                            int i40 = i39 + 1;
                            int A002 = position3 + C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i34, position3, i39, false);
                            int i41 = i40 + 1;
                            int A003 = A00 + C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i36, A00, i40, true);
                            int i42 = i41 + 1;
                            int A004 = A002 + C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i36, A002, i41, false);
                            int i43 = i42 + 1;
                            position2 = A003 + C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i37, A003, i42, true);
                            i31 = i43 + 1;
                            position3 = A004 + C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i37, A004, i43, false);
                            i30++;
                        }
                        i30--;
                        i30++;
                    }
                } else {
                    int i44 = i31 + 1;
                    position2 += C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i34, position2, i31, true);
                    i31 = i44 + 1;
                    position3 += C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i34, position3, i44, false);
                    float f2 = fArr[i31 - 2];
                    int i45 = i31 - 1;
                    float f3 = fArr[i45];
                    if (b6 != 0) {
                        i2 = position4 + 1;
                        i = byteBuffer.get(position4) & 255;
                        f = c56472ig.A00 + (i * c56472ig.A02);
                    } else {
                        i = byteBuffer.getShort(position4) & 65535;
                        f = c56472ig.A00 + (i * c56472ig.A01);
                        i2 = position4 + 2;
                    }
                    boolean z2 = (i & 1) == 0;
                    bArr5[i30] = 0;
                    fArr[i45] = f3 + f;
                    if (z2) {
                        i3 = 6;
                        copyOf = Arrays.copyOf(A08, 6);
                    } else {
                        i3 = 6;
                        copyOf = Arrays.copyOf(A07, 6);
                    }
                    int i46 = i30 + 4;
                    while (i30 < i46) {
                        i30++;
                        bArr5[i30] = 3;
                        int i47 = 0;
                        do {
                            float f4 = copyOf[i47];
                            int i48 = i47 + 1;
                            float f5 = copyOf[i48];
                            int i49 = i31 + 1;
                            fArr[i31] = f2 + (f * f4);
                            i31 = i49 + 1;
                            fArr[i49] = f3 + (f * f5);
                            if (z2) {
                                copyOf[i47] = -f5;
                                i47 = i48 + 1;
                            } else {
                                copyOf[i47] = f5;
                                i47 = i48 + 1;
                                f4 = -f4;
                            }
                            copyOf[i48] = f4;
                        } while (i47 < i3);
                    }
                    position4 = i2;
                }
            } else {
                bArr5[i30] = b6;
                int i50 = i31 + 1;
                position2 += C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i34, position2, i31, true);
                i31 = i50 + 1;
                position3 += C56552io.A00(c56472ig, byteBuffer, fArr, fArr2, i34, position3, i50, false);
            }
            position = i32;
            i30++;
        }
        if (i31 == i29) {
            byteBuffer.position(position5);
            ?? obj = new Object();
            obj.A02 = bArr5;
            obj.A00 = i10;
            obj.A03 = fArr;
            obj.A01 = i29;
            this.A00 = obj;
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A02(i31, i29, "Only parsed a subset of points! ", ", "));
    }
}
