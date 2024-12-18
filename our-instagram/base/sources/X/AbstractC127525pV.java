package X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.5pV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127525pV {
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 7350};
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int A00(C98364bF c98364bF) {
        String str;
        int A012 = c98364bF.A01(4);
        if (A012 == 15) {
            if (((c98364bF.A01 - c98364bF.A02) * 8) - c98364bF.A00 >= 24) {
                return c98364bF.A01(24);
            }
            str = "AAC header insufficient data";
        } else {
            if (A012 < 13) {
                return A01[A012];
            }
            str = "AAC header wrong Sampling Frequency Index";
        }
        throw C93194Fv.A00(str, null);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.4bF] */
    public static C127535pW A01(byte[] bArr) {
        int length = bArr.length;
        ?? obj = new Object();
        obj.A03 = bArr;
        obj.A01 = length;
        int A012 = obj.A01(5);
        if (A012 == 31) {
            A012 = obj.A01(6) + 32;
        }
        int A002 = A00(obj);
        int A013 = obj.A01(4);
        String A0O = AnonymousClass001.A0O("mp4a.40.", A012);
        if (A012 == 5 || A012 == 29) {
            A002 = A00(obj);
            int A014 = obj.A01(5);
            if (A014 == 31) {
                A014 = obj.A01(6) + 32;
            }
            if (A014 == 22) {
                A013 = obj.A01(4);
            }
        }
        int i = A00[A013];
        if (i != -1) {
            return new C127535pW(A002, i, A0O);
        }
        throw C93194Fv.A00(null, null);
    }
}
