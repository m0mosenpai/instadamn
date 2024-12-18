package X;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class Y0o {
    public static final Y0o A00 = new Object();
    public static final int[][] A01 = {new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1}};

    public final C09530e4 A00(int[][] iArr, int i) {
        int length = iArr.length;
        int length2 = iArr[0].length;
        ArrayList A17 = AbstractC25225BEi.A17(length);
        for (int[] iArr2 : iArr) {
            A17.add(iArr2.clone());
        }
        int[][] iArr3 = (int[][]) A17.toArray(new int[0]);
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                int[] iArr4 = iArr3[i2];
                int i4 = 255;
                if (iArr4[i3] <= i) {
                    i4 = 0;
                }
                iArr4[i3] = i4;
            }
        }
        int length3 = iArr3.length;
        int length4 = iArr3[0].length;
        ArrayList A172 = AbstractC25225BEi.A17(length3);
        for (int[] iArr5 : iArr3) {
            A172.add(iArr5.clone());
        }
        int[][] iArr6 = (int[][]) A172.toArray(new int[0]);
        int i5 = 0;
        for (int i6 = 0; i6 < length3; i6++) {
            for (int i7 = 0; i7 < length4; i7++) {
                if (iArr6[i6][i7] == 255) {
                    i5++;
                    int length5 = iArr6.length;
                    int length6 = iArr6[0].length;
                    C01U c01u = new C01U();
                    AbstractC166997dE.A1R(Integer.valueOf(i7), Integer.valueOf(i6), c01u);
                    while (!c01u.isEmpty()) {
                        C09530e4 c09530e4 = (C09530e4) c01u.removeFirst();
                        int A0H = AbstractC166987dD.A0H(c09530e4.A00);
                        int A0H2 = AbstractC166987dD.A0H(c09530e4.A01);
                        if (A0H >= 0 && A0H < length6 && A0H2 >= 0 && A0H2 < length5) {
                            int[] iArr7 = iArr6[A0H2];
                            if (iArr7[A0H] == 255) {
                                iArr7[A0H] = i5;
                                int[][] iArr8 = A01;
                                int i8 = 0;
                                do {
                                    int[] iArr9 = iArr8[i8];
                                    AbstractC166997dE.A1R(Integer.valueOf(iArr9[0] + A0H), Integer.valueOf(iArr9[1] + A0H2), c01u);
                                    i8++;
                                } while (i8 < 4);
                            }
                        }
                    }
                }
            }
        }
        return AbstractC166987dD.A1L(Integer.valueOf(i5), iArr6);
    }
}
