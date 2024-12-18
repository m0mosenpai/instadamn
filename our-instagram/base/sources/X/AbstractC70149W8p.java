package X;

import java.util.Arrays;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.W8p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70149W8p {
    public static final int[] A00 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] A02 = {-1, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] A03 = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, C3OO.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] A01 = {CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] A06 = {5, 8, 10, 12};
    public static final int[] A08 = {6, 9, 12, 15};
    public static final int[] A04 = {2, 4, 6, 8};
    public static final int[] A05 = {9, 11, 13, 16};
    public static final int[] A07 = {5, 8, 10, 12};

    public static int A00(WFZ wfz, int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (wfz.A0C()) {
            i2++;
            i++;
            if (i >= 3) {
                break;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + wfz.A04(iArr[i2]);
    }

    public static WFZ A01(byte[] bArr) {
        byte b = bArr[0];
        if (b != Byte.MAX_VALUE && b != 100 && b != 64 && b != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            WFZ wfz = new WFZ(copyOf);
            if (copyOf[0] == 31) {
                WFZ wfz2 = new WFZ(copyOf);
                while (wfz2.A03() >= 16) {
                    wfz2.A08(2);
                    int A042 = wfz2.A04(14) & ((1 << 14) - 1);
                    int i3 = wfz.A00;
                    int i4 = 8 - i3;
                    int min = Math.min(i4, 14);
                    int i5 = i4 - min;
                    byte[] bArr2 = wfz.A03;
                    int i6 = wfz.A02;
                    byte b4 = (byte) (((65280 >> i3) | ((1 << i5) - 1)) & bArr2[i6]);
                    bArr2[i6] = b4;
                    int i7 = 14 - min;
                    bArr2[i6] = (byte) (b4 | ((A042 >>> i7) << i5));
                    int i8 = i6 + 1;
                    while (i7 > 8) {
                        i7 -= 8;
                        bArr2[i8] = (byte) (A042 >>> i7);
                        i8++;
                    }
                    int i9 = 8 - i7;
                    byte b5 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                    bArr2[i8] = b5;
                    bArr2[i8] = (byte) (((A042 & ((1 << i7) - 1)) << i9) | b5);
                    wfz.A08(14);
                    WFZ.A01(wfz);
                }
            }
            int length = copyOf.length;
            wfz.A03 = copyOf;
            wfz.A02 = 0;
            wfz.A00 = 0;
            wfz.A01 = length;
            return wfz;
        }
        return new WFZ(bArr);
    }
}
