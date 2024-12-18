package X;

/* loaded from: classes11.dex */
public abstract class W1D {
    public static final int[] A01 = {1, 2, 3, 6};
    public static final int[] A03 = {48000, 44100, 32000};
    public static final int[] A04 = {24000, 22050, 16000};
    public static final int[] A02 = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] A00 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] A05 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int A00(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = A03;
            if (i < 3 && i2 >= 0) {
                int[] iArr2 = A05;
                if (i3 < 19) {
                    int i4 = iArr[i];
                    if (i4 == 44100) {
                        return (iArr2[i3] + (i2 % 2)) * 2;
                    }
                    int i5 = A00[i3];
                    int i6 = i5 * 4;
                    if (i4 != 32000) {
                        return i6;
                    }
                    return i5 * 6;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
}
