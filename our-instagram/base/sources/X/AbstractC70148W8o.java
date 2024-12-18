package X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.W8o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70148W8o {
    public static final String[] A06 = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] A05 = {44100, 48000, 32000};
    public static final int[] A00 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] A04 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] A01 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] A02 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] A03 = {CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int A00(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!AbstractC167007dF.A1P(i & (-2097152), -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = A05[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = A00[i4 - 1];
            } else {
                i7 = A04[i4 - 1];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                i6 = A01[i4 - 1];
            } else {
                i6 = A02[i4 - 1];
            }
            return ((i6 * 144) / i8) + i9;
        }
        int i10 = A03[i4 - 1];
        int i11 = 144;
        if (i3 == 1) {
            i11 = 72;
        }
        return ((i11 * i10) / i8) + i9;
    }

    public static int A01(int i) {
        int i2;
        int i3;
        if (!AbstractC167007dF.A1P(i & (-2097152), -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return 1152;
            }
            if (i3 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        if (i2 == 3) {
            return 1152;
        }
        return 576;
    }
}
