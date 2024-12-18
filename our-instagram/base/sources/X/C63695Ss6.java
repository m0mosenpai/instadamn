package X;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Ss6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63695Ss6 implements InterfaceC65311Thn {
    public int A00;

    @Override // X.InterfaceC65311Thn
    public final /* bridge */ /* synthetic */ Object E3O(THX thx, float f) {
        int i;
        float f2;
        int i2;
        float A01;
        float f3;
        ArrayList A1E = AbstractC166987dD.A1E();
        int i3 = 0;
        boolean z = false;
        if (thx.A0E() == C05F.A00) {
            z = true;
            thx.A0I();
        }
        while (thx.A0Q()) {
            A1E.add(Float.valueOf(AbstractC58321PtD.A03(thx)));
        }
        if (A1E.size() == 4 && AbstractC166987dD.A09(A1E.get(0)) == 1.0f) {
            A1E.set(0, AbstractC25227BEk.A0l());
            A1E.add(Float.valueOf(1.0f));
            A1E.add(A1E.get(1));
            A1E.add(A1E.get(2));
            A1E.add(A1E.get(3));
            this.A00 = 2;
        }
        if (z) {
            thx.A0K();
        }
        int i4 = this.A00;
        if (i4 == -1) {
            i4 = A1E.size() / 4;
            this.A00 = i4;
        }
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.A00 * 4;
            if (i3 >= i) {
                break;
            }
            int i7 = i3 / 4;
            double A09 = AbstractC166987dD.A09(A1E.get(i3));
            int i8 = i3 % 4;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            iArr[i7] = Color.argb(255, i5, i6, (int) (A09 * 255.0d));
                        }
                    } else {
                        i6 = (int) (A09 * 255.0d);
                    }
                } else {
                    i5 = (int) (A09 * 255.0d);
                }
            } else {
                if (i7 > 0) {
                    float f4 = (float) A09;
                    if (fArr[i7 - 1] >= f4) {
                        f3 = f4 + 0.01f;
                        fArr[i7] = f3;
                    }
                }
                f3 = (float) A09;
                fArr[i7] = f3;
            }
            i3++;
        }
        SOT sot = new SOT(fArr, iArr);
        if (A1E.size() > i) {
            float[] fArr2 = sot.A00;
            int[] iArr2 = sot.A01;
            int size = (A1E.size() - i) / 2;
            float[] fArr3 = new float[size];
            float[] fArr4 = new float[size];
            int i9 = 0;
            while (i < A1E.size()) {
                int i10 = i % 2;
                float A092 = AbstractC166987dD.A09(A1E.get(i));
                if (i10 == 0) {
                    fArr3[i9] = A092;
                } else {
                    fArr4[i9] = A092;
                    i9++;
                }
                i++;
            }
            float[] fArr5 = fArr2;
            int length = fArr2.length;
            if (length == 0) {
                fArr5 = fArr3;
            } else if (size != 0) {
                int i11 = length + size;
                fArr5 = new float[i11];
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    float f5 = Float.NaN;
                    if (i13 < length) {
                        f2 = fArr2[i13];
                    } else {
                        f2 = Float.NaN;
                    }
                    if (i14 < size) {
                        f5 = fArr3[i14];
                    }
                    if (!Float.isNaN(f5) && f2 >= f5) {
                        if (!Float.isNaN(f2) && f5 >= f2) {
                            fArr5[i15] = f2;
                            i13++;
                            i14++;
                            i12++;
                        } else {
                            fArr5[i15] = f5;
                            i14++;
                        }
                    } else {
                        fArr5[i15] = f2;
                        i13++;
                    }
                }
                if (i12 != 0) {
                    fArr5 = Arrays.copyOf(fArr5, i11 - i12);
                }
            }
            int length2 = fArr5.length;
            int[] iArr3 = new int[length2];
            for (int i16 = 0; i16 < length2; i16++) {
                float f6 = fArr5[i16];
                int binarySearch = Arrays.binarySearch(fArr2, f6);
                int binarySearch2 = Arrays.binarySearch(fArr3, f6);
                if (binarySearch >= 0) {
                    if (binarySearch2 <= 0) {
                        int i17 = iArr2[binarySearch];
                        if (size >= 2 && f6 > fArr3[0]) {
                            int i18 = 1;
                            do {
                                float f7 = fArr3[i18];
                                if (f7 < f6 && i18 != size - 1) {
                                    i18++;
                                } else {
                                    if (f7 <= f6) {
                                        A01 = fArr4[i18];
                                    } else {
                                        int i19 = i18 - 1;
                                        float f8 = fArr3[i19];
                                        A01 = AbstractC58321PtD.A01(fArr4[i18], fArr4[i19], (f6 - f8) / (f7 - f8));
                                    }
                                    i2 = AbstractC167017dG.A02(i17, (int) (A01 * 255.0f));
                                }
                            } while (i18 < size);
                            throw AbstractC166987dD.A12("Unreachable code.");
                        }
                        i2 = AbstractC167017dG.A02(i17, (int) (fArr4[0] * 255.0f));
                        iArr3[i16] = i2;
                    }
                } else if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f9 = fArr4[binarySearch2];
                if (iArr2.length >= 2 && f6 != fArr2[0]) {
                    for (int i20 = 1; i20 < length; i20++) {
                        float f10 = fArr2[i20];
                        if (f10 >= f6 || i20 == length - 1) {
                            if (i20 == length - 1 && f6 >= f10) {
                                i2 = Color.argb((int) (f9 * 255.0f), Color.red(iArr2[i20]), Color.green(iArr2[i20]), Color.blue(iArr2[i20]));
                            } else {
                                int i21 = i20 - 1;
                                float f11 = fArr2[i21];
                                i2 = AbstractC167017dG.A02(AbstractC63043SbM.A02((f6 - f11) / (f10 - f11), iArr2[i21], iArr2[i20]), (int) (f9 * 255.0f));
                            }
                        }
                    }
                    throw AbstractC166987dD.A12("Unreachable code.");
                }
                i2 = iArr2[0];
                iArr3[i16] = i2;
            }
            return new SOT(fArr5, iArr3);
        }
        return sot;
    }
}
