package X;

import android.graphics.Rect;
import android.os.MemoryFile;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class XZL extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C72807XnU A01;
    public final /* synthetic */ XZO A02;
    public final /* synthetic */ byte[] A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZL(C72807XnU c72807XnU, XZO xzo, byte[] bArr, int i) {
        super(81, 2, false, false);
        this.A02 = xzo;
        this.A01 = c72807XnU;
        this.A03 = bArr;
        this.A00 = i;
    }

    public static void A00(byte[] bArr, int i, int i2, int i3, int i4) {
        byte b = bArr[i];
        byte b2 = bArr[i2];
        bArr[i] = bArr[i3];
        bArr[i2] = bArr[i4];
        bArr[i3] = b;
        bArr[i4] = b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        MemoryFile memoryFile;
        int length;
        final C72807XnU c72807XnU = this.A01;
        Rect rect = c72807XnU.A04;
        rect.getClass();
        int width = rect.width();
        int height = rect.height();
        int i = c72807XnU.A03;
        int i2 = c72807XnU.A02;
        if (i > width) {
            i = width;
        }
        if (i2 > height) {
            i2 = height;
        }
        byte[] bArr2 = this.A03;
        boolean z = c72807XnU.A06;
        int i3 = c72807XnU.A00;
        int i4 = c72807XnU.A01;
        if (i3 != 19) {
            if (i3 == 21) {
                bArr = AbstractC72655Xjz.A00(bArr2, width, height, i, i2);
                int length2 = bArr.length;
                int i5 = (length2 / 3) * 2;
                while (i5 < length2) {
                    byte b = bArr[i5];
                    int i6 = i5 + 1;
                    bArr[i5] = bArr[i6];
                    bArr[i6] = b;
                    i5 += 2;
                }
                if (z) {
                    int i7 = ((i4 + 45) / 90) * 90;
                    if (i7 != 90 && i7 != 270) {
                        int i8 = i / 2;
                        for (int i9 = 0; i9 < i8; i9++) {
                            int i10 = i5 / i;
                            for (int i11 = 0; i11 < i10; i11++) {
                                int i12 = i11 * i;
                                int i13 = i12 + i9;
                                int i14 = i12 + ((i - i9) - 1);
                                byte b2 = bArr[i13];
                                bArr[i13] = bArr[i14];
                                bArr[i14] = b2;
                            }
                        }
                        int i15 = i2 / 2;
                        for (int i16 = 0; i16 < i8; i16 += 2) {
                            for (int i17 = 0; i17 < i15; i17++) {
                                int i18 = (i17 * i) + i5;
                                int i19 = i18 + i16;
                                int i20 = i - i16;
                                A00(bArr, i19, i19 + 1, (i20 - 2) + i18, i18 + (i20 - 1));
                            }
                        }
                    } else {
                        for (int i21 = 0; i21 < i; i21++) {
                            int i22 = (i5 / i) / 2;
                            for (int i23 = 0; i23 < i22; i23++) {
                                int i24 = (i23 * i) + i21;
                                int i25 = (((i2 - i23) - 1) * i) + i21;
                                byte b3 = bArr[i24];
                                bArr[i24] = bArr[i25];
                                bArr[i25] = b3;
                            }
                        }
                        int i26 = i2 / 2;
                        for (int i27 = 0; i27 < i; i27 += 2) {
                            int i28 = i26 / 2;
                            for (int i29 = 0; i29 < i28; i29++) {
                                int i30 = (i29 * i) + i5 + i27;
                                int i31 = (((i26 - i29) - 1) * i) + i5 + i27;
                                A00(bArr, i30, i30 + 1, i31, i31 + 1);
                            }
                        }
                    }
                }
            } else {
                throw AbstractC166987dD.A18("Unsupported color format");
            }
        } else {
            byte[] A00 = AbstractC72655Xjz.A00(bArr2, width, height, i, i2);
            int length3 = A00.length;
            bArr = new byte[length3];
            System.arraycopy(A00, 0, bArr, 0, length3);
            int i32 = i * i2;
            int i33 = i32 / 4;
            for (int i34 = 0; i34 < i33; i34++) {
                int i35 = (i34 * 2) + i32;
                byte b4 = A00[i35];
                byte b5 = A00[i35 + 1];
                int i36 = i32 + i34;
                bArr[i36 + i33] = b4;
                bArr[i36] = b5;
            }
            if (z) {
                int i37 = ((i4 + 45) / 90) * 90;
                if (i37 != 90 && i37 != 270) {
                    int i38 = i / 2;
                    for (int i39 = 0; i39 < i38; i39++) {
                        for (int i40 = 0; i40 < i2; i40++) {
                            int i41 = i40 * i;
                            int i42 = i41 + i39;
                            int i43 = i41 + ((i - i39) - 1);
                            byte b6 = bArr[i42];
                            bArr[i42] = bArr[i43];
                            bArr[i43] = b6;
                        }
                    }
                    int i44 = (length3 - i32) / i;
                    for (int i45 = 0; i45 < i38; i45++) {
                        int i46 = i44 / 2;
                        for (int i47 = 0; i47 < i46; i47++) {
                            int i48 = (i47 * i) + i32;
                            int i49 = i48 + i45;
                            int i50 = i48 + ((i - i45) - 1);
                            A00(bArr, i49, i49 + i33, i50, i50 + i33);
                        }
                    }
                } else {
                    for (int i51 = 0; i51 < i; i51++) {
                        int i52 = i2 / 2;
                        for (int i53 = 0; i53 < i52; i53++) {
                            int i54 = (i53 * i) + i51;
                            int i55 = (((i2 - i53) - 1) * i) + i51;
                            byte b7 = bArr[i54];
                            bArr[i54] = bArr[i55];
                            bArr[i55] = b7;
                        }
                    }
                    int i56 = (length3 - i32) / i;
                    for (int i57 = 0; i57 < i; i57++) {
                        int i58 = i56 / 4;
                        for (int i59 = 0; i59 < i58; i59++) {
                            int i60 = (i59 * i) + i32 + i57;
                            int i61 = ((((i56 / 2) - 1) - i59) * i) + i32 + i57;
                            A00(bArr, i60, i60 + i33, i61, i61 + i33);
                        }
                    }
                }
            }
        }
        final MemoryFile memoryFile2 = null;
        try {
            length = bArr.length;
            memoryFile = new MemoryFile(null, length);
        } catch (IOException e) {
            e = e;
            memoryFile = null;
        }
        try {
            memoryFile.writeBytes(bArr, 0, 0, length);
        } catch (IOException e2) {
            e = e2;
            AbstractC12120kG.A0B("BoomerangCaptureController", "Failed to create MemoryFile", e);
            C0K8.A0F("BoomerangCaptureController", "Failed to create MemoryFile", e);
            if (memoryFile != null) {
                memoryFile.close();
                final int i62 = this.A00;
                C11T.A03(new Runnable() { // from class: X.YIc
                    @Override // java.lang.Runnable
                    public final void run() {
                        XZL xzl = this;
                        C72807XnU c72807XnU2 = c72807XnU;
                        MemoryFile memoryFile3 = memoryFile2;
                        int i63 = i62;
                        XZO xzo = xzl.A02;
                        String str = c72807XnU2.A05;
                        str.getClass();
                        if (XZO.A02(xzo, str)) {
                            if (memoryFile3 != null) {
                                if (xzo.A0I == null) {
                                    xzo.A0I = new MemoryFile[40];
                                }
                                if (i63 >= xzo.A0I.length) {
                                    MemoryFile[] memoryFileArr = xzo.A0I;
                                    int length4 = memoryFileArr.length;
                                    xzo.A0I = new MemoryFile[(int) (length4 * 1.5f)];
                                    System.arraycopy(memoryFileArr, 0, xzo.A0I, 0, length4);
                                }
                                xzo.A0I[i63] = memoryFile3;
                                xzo.A0A.add(Integer.valueOf(i63));
                                XZO.A00(xzo);
                                return;
                            }
                            AbstractC12120kG.A03("BoomerangCaptureController", "file is null in handlePreparedFile()");
                            xzo.A0E(false);
                            return;
                        }
                        if (memoryFile3 == null) {
                            return;
                        }
                        memoryFile3.close();
                    }
                });
            }
            memoryFile2 = memoryFile;
            final int i622 = this.A00;
            C11T.A03(new Runnable() { // from class: X.YIc
                @Override // java.lang.Runnable
                public final void run() {
                    XZL xzl = this;
                    C72807XnU c72807XnU2 = c72807XnU;
                    MemoryFile memoryFile3 = memoryFile2;
                    int i63 = i622;
                    XZO xzo = xzl.A02;
                    String str = c72807XnU2.A05;
                    str.getClass();
                    if (XZO.A02(xzo, str)) {
                        if (memoryFile3 != null) {
                            if (xzo.A0I == null) {
                                xzo.A0I = new MemoryFile[40];
                            }
                            if (i63 >= xzo.A0I.length) {
                                MemoryFile[] memoryFileArr = xzo.A0I;
                                int length4 = memoryFileArr.length;
                                xzo.A0I = new MemoryFile[(int) (length4 * 1.5f)];
                                System.arraycopy(memoryFileArr, 0, xzo.A0I, 0, length4);
                            }
                            xzo.A0I[i63] = memoryFile3;
                            xzo.A0A.add(Integer.valueOf(i63));
                            XZO.A00(xzo);
                            return;
                        }
                        AbstractC12120kG.A03("BoomerangCaptureController", "file is null in handlePreparedFile()");
                        xzo.A0E(false);
                        return;
                    }
                    if (memoryFile3 == null) {
                        return;
                    }
                    memoryFile3.close();
                }
            });
        }
        memoryFile2 = memoryFile;
        final int i6222 = this.A00;
        C11T.A03(new Runnable() { // from class: X.YIc
            @Override // java.lang.Runnable
            public final void run() {
                XZL xzl = this;
                C72807XnU c72807XnU2 = c72807XnU;
                MemoryFile memoryFile3 = memoryFile2;
                int i63 = i6222;
                XZO xzo = xzl.A02;
                String str = c72807XnU2.A05;
                str.getClass();
                if (XZO.A02(xzo, str)) {
                    if (memoryFile3 != null) {
                        if (xzo.A0I == null) {
                            xzo.A0I = new MemoryFile[40];
                        }
                        if (i63 >= xzo.A0I.length) {
                            MemoryFile[] memoryFileArr = xzo.A0I;
                            int length4 = memoryFileArr.length;
                            xzo.A0I = new MemoryFile[(int) (length4 * 1.5f)];
                            System.arraycopy(memoryFileArr, 0, xzo.A0I, 0, length4);
                        }
                        xzo.A0I[i63] = memoryFile3;
                        xzo.A0A.add(Integer.valueOf(i63));
                        XZO.A00(xzo);
                        return;
                    }
                    AbstractC12120kG.A03("BoomerangCaptureController", "file is null in handlePreparedFile()");
                    xzo.A0E(false);
                    return;
                }
                if (memoryFile3 == null) {
                    return;
                }
                memoryFile3.close();
            }
        });
    }
}
