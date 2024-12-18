package X;

import com.facebook.forker.Process;
import org.webrtc.CameraEnumerationAndroid;

/* loaded from: classes11.dex */
public abstract class W8a {
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 7350};
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int A00(WFZ wfz) {
        int i;
        int A04 = wfz.A04(4);
        if (A04 == 15) {
            if (wfz.A03() >= 24) {
                return wfz.A04(24);
            }
            i = 3476;
        } else {
            if (A04 < 13) {
                return A01[A04];
            }
            i = 3477;
        }
        throw new VCM(AbstractC111324zv.A00(i), null, 1, true);
    }

    public static C69034Vgb A01(WFZ wfz, boolean z) {
        StringBuilder sb;
        int A04 = wfz.A04(5);
        if (A04 == 31) {
            A04 = wfz.A04(6) + 32;
        }
        int A002 = A00(wfz);
        int A042 = wfz.A04(4);
        String A0O = AnonymousClass001.A0O("mp4a.40.", A04);
        if (A04 == 5 || A04 == 29) {
            A002 = A00(wfz);
            A04 = wfz.A04(5);
            if (A04 == 31) {
                A04 = wfz.A04(6) + 32;
            }
            if (A04 == 22) {
                A042 = wfz.A04(4);
            }
        }
        if (z) {
            if (A04 != 1 && A04 != 2 && A04 != 3 && A04 != 4 && A04 != 6 && A04 != 7 && A04 != 17) {
                switch (A04) {
                    case Process.SIGSTOP /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        sb = new StringBuilder();
                        sb.append("Unsupported audio object type: ");
                        sb.append(A04);
                        throw new VCM(sb.toString(), null, 1, false);
                }
            }
            if (wfz.A0C()) {
                AbstractC63374Sil.A04("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (wfz.A0C()) {
                wfz.A08(14);
            }
            boolean A0C = wfz.A0C();
            if (A042 != 0) {
                if (A04 == 6 || A04 == 20) {
                    wfz.A08(3);
                }
                if (A0C) {
                    if (A04 == 22) {
                        wfz.A08(16);
                    } else if (A04 == 17 || A04 == 19 || A04 == 20 || A04 == 23) {
                        wfz.A08(3);
                    }
                    wfz.A08(1);
                }
                switch (A04) {
                    case 17:
                    case Process.SIGSTOP /* 19 */:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int A043 = wfz.A04(2);
                        if (A043 == 2 || A043 == 3) {
                            sb = new StringBuilder();
                            sb.append("Unsupported epConfig: ");
                            sb.append(A043);
                            throw new VCM(sb.toString(), null, 1, false);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = A00[A042];
        if (i != -1) {
            return new C69034Vgb(A002, i, A0O);
        }
        throw new VCM(null, null, 1, true);
    }
}
