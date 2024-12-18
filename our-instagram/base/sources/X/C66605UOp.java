package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.nio.ByteBuffer;

/* renamed from: X.UOp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66605UOp extends C56562ip implements X98 {
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x005f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001d. Please report as an issue. */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] A06 = WGe.A06(byteBuffer, i, 0);
        if (A06 != null) {
            float[] A07 = WGe.A07(byteBuffer, i, 1);
            if (A07 != null) {
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int length = A06.length;
                    if (i9 < length) {
                        switch (A06[i9]) {
                            case 0:
                            case 1:
                            case 4:
                            case 5:
                                i8 = this.A01 + 2;
                                this.A01 = i8;
                                break;
                            case 2:
                            case 7:
                                i8 = this.A01 + 4;
                                this.A01 = i8;
                                break;
                            case 3:
                            case 10:
                                i8 = this.A01 + 6;
                                this.A01 = i8;
                                break;
                            case 6:
                                i7 = this.A01 + 2;
                                this.A01 = i7;
                                i10++;
                                break;
                            case 8:
                            case 9:
                                i7 = this.A01 + 4;
                                this.A01 = i7;
                                i10++;
                                break;
                            case 11:
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                i7 = this.A01 + 6;
                                this.A01 = i7;
                                i10++;
                                break;
                        }
                        i9++;
                    } else {
                        float[] fArr = new float[this.A01];
                        this.A03 = fArr;
                        int i11 = length + i10;
                        this.A00 = i11;
                        byte[] bArr = new byte[i11];
                        this.A02 = bArr;
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        while (i12 < i11) {
                            switch (A06[i12]) {
                                case 0:
                                    bArr[i12] = 0;
                                    i6 = 0;
                                    do {
                                        fArr[i13] = A07[i14];
                                        i6++;
                                        i13++;
                                        i14++;
                                    } while (i6 < 2);
                                case 1:
                                    bArr[i12] = 1;
                                    i6 = 0;
                                    do {
                                        fArr[i13] = A07[i14];
                                        i6++;
                                        i13++;
                                        i14++;
                                    } while (i6 < 2);
                                case 2:
                                    bArr[i12] = 2;
                                    int i15 = 0;
                                    do {
                                        fArr[i13] = A07[i14];
                                        i15++;
                                        i13++;
                                        i14++;
                                    } while (i15 < 4);
                                case 3:
                                    bArr[i12] = 3;
                                    int i16 = 0;
                                    do {
                                        fArr[i13] = A07[i14];
                                        i16++;
                                        i13++;
                                        i14++;
                                    } while (i16 < 6);
                                case 4:
                                    bArr[i12] = 1;
                                    int i17 = i13 + 1;
                                    fArr[i13] = A07[i14];
                                    i13 = i17 + 1;
                                    fArr[i17] = fArr[i17 - A00(bArr, i12)];
                                    i14++;
                                    break;
                                case 5:
                                    bArr[i12] = 1;
                                    int i18 = i13 + 1;
                                    fArr[i13] = fArr[i13 - A00(bArr, i12)];
                                    i13 = i18 + 1;
                                    fArr[i18] = A07[i14];
                                    i14++;
                                    break;
                                case 6:
                                    bArr[i12] = 1;
                                    int i19 = i13 + 1;
                                    fArr[i13] = fArr[0];
                                    i5 = i19 + 1;
                                    fArr[i19] = fArr[1];
                                    i12++;
                                    bArr[i12] = 4;
                                    i13 = i5;
                                    break;
                                case 7:
                                    bArr[i12] = 2;
                                    int A00 = i13 - A00(bArr, i12);
                                    int i20 = i13;
                                    int i21 = 0;
                                    do {
                                        i5 = i20 + 1;
                                        fArr[i20] = A07[i14];
                                        i21++;
                                        i20 = i5;
                                        i14++;
                                    } while (i21 < 2);
                                    int i22 = 0;
                                    do {
                                        i5++;
                                        fArr[i20] = (fArr[A00 + i22] * 2.0f) - fArr[(i13 - 2) + i22];
                                        i22++;
                                        i20 = i5;
                                    } while (i22 < 2);
                                    i13 = i5;
                                    break;
                                case 8:
                                    bArr[i12] = 2;
                                    int i23 = i13 + 1;
                                    fArr[i13] = fArr[0];
                                    i2 = i23 + 1;
                                    fArr[i23] = fArr[1];
                                    i13 = i2;
                                    i3 = 0;
                                    do {
                                        fArr[i13] = A07[i14];
                                        i3++;
                                        i13++;
                                        i14++;
                                    } while (i3 < 2);
                                    i12++;
                                    bArr[i12] = 4;
                                    break;
                                case 9:
                                    bArr[i12] = 2;
                                    int A002 = i13 - A00(bArr, i12);
                                    int i24 = i13;
                                    int i25 = 0;
                                    do {
                                        i5 = i24 + 1;
                                        fArr[i24] = fArr[i25];
                                        i25++;
                                        i24 = i5;
                                    } while (i25 < 2);
                                    int i26 = 0;
                                    do {
                                        i5++;
                                        fArr[i24] = (fArr[A002 + i26] * 2.0f) - fArr[(i13 - 2) + i26];
                                        i26++;
                                        i24 = i5;
                                    } while (i26 < 2);
                                    i12++;
                                    bArr[i12] = 4;
                                    i13 = i5;
                                    break;
                                case 10:
                                    bArr[i12] = 3;
                                    int A003 = i13 - A00(bArr, i12);
                                    int i27 = i13;
                                    int i28 = 0;
                                    do {
                                        i4 = i27 + 1;
                                        fArr[i27] = A07[i14];
                                        i28++;
                                        i27 = i4;
                                        i14++;
                                    } while (i28 < 2);
                                    int i29 = 0;
                                    do {
                                        i4++;
                                        fArr[i27] = (fArr[A003 + i29] * 2.0f) - fArr[(i13 - 2) + i29];
                                        i29++;
                                        i27 = i4;
                                    } while (i29 < 2);
                                    i13 = i4;
                                    int i30 = 0;
                                    do {
                                        i27++;
                                        fArr[i13] = A07[i14];
                                        i30++;
                                        i13 = i27;
                                        i14++;
                                    } while (i30 < 2);
                                case 11:
                                    bArr[i12] = 3;
                                    int i31 = i13 + 1;
                                    fArr[i13] = fArr[0];
                                    i13 = i31 + 1;
                                    fArr[i31] = fArr[1];
                                    int i32 = 0;
                                    do {
                                        fArr[i13] = A07[i14];
                                        i32++;
                                        i13++;
                                        i14++;
                                    } while (i32 < 4);
                                    i12++;
                                    bArr[i12] = 4;
                                    break;
                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                    bArr[i12] = 3;
                                    int A004 = i13 - A00(bArr, i12);
                                    int i33 = i13;
                                    int i34 = 0;
                                    do {
                                        i2 = i33 + 1;
                                        fArr[i33] = fArr[i34];
                                        i34++;
                                        i33 = i2;
                                    } while (i34 < 2);
                                    int i35 = 0;
                                    do {
                                        i2++;
                                        fArr[i33] = (fArr[A004 + i35] * 2.0f) - fArr[(i13 - 2) + i35];
                                        i35++;
                                        i33 = i2;
                                    } while (i35 < 2);
                                    i13 = i2;
                                    i3 = 0;
                                    do {
                                        fArr[i13] = A07[i14];
                                        i3++;
                                        i13++;
                                        i14++;
                                    } while (i3 < 2);
                                    i12++;
                                    bArr[i12] = 4;
                                    break;
                            }
                            i12++;
                        }
                        return;
                    }
                }
            } else {
                throw new IllegalArgumentException("points cannot be null");
            }
        } else {
            throw new IllegalArgumentException("commands cannot be null");
        }
    }

    public static int A00(byte[] bArr, int i) {
        byte b = bArr[i - 1];
        if (b == 4) {
            int i2 = i - 2;
            if (i2 >= 0) {
                b = bArr[i2];
            }
            return 2;
        }
        if (b == 2) {
            return 4;
        }
        if (b != 3) {
            return 2;
        }
        return 6;
    }
}
