package X;

import android.media.AudioRecord;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;

/* loaded from: classes4.dex */
public abstract class AMJ {
    public static String A00;
    public static List A01;
    public static final int[] A02 = {CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};
    public static final short[] A04 = {3, 2, 4};
    public static final short[] A03 = {16, 12};

    public static int A00(int i) {
        int i2 = 1;
        if (i != 1 && i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        throw AbstractC166987dD.A12(AnonymousClass001.A0O(AbstractC111324zv.A00(1509), i));
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    public static String A02(List list) {
        String str = A00;
        if (str == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                A1C.append("(");
                A1C.append(iArr[0]);
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A1C.append(iArr[1]);
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                A1C.append(iArr[2]);
                A1C.append(");");
            }
            String obj = A1C.toString();
            A00 = obj;
            return obj;
        }
        return str;
    }

    public static List A03() {
        if (A01 == null) {
            A01 = AbstractC166987dD.A1E();
            short[] sArr = A03;
            int i = 0;
            do {
                short s = sArr[i];
                short[] sArr2 = A04;
                int i2 = 0;
                do {
                    short s2 = sArr2[i2];
                    int[] iArr = A02;
                    int i3 = 0;
                    do {
                        int i4 = iArr[i3];
                        if (AudioRecord.getMinBufferSize(i4, s, s2) >= 0) {
                            A01.add(new int[]{i4, s, s2});
                        }
                        i3++;
                    } while (i3 < 19);
                    i2++;
                } while (i2 < 3);
                i++;
            } while (i < 2);
        }
        return A01;
    }

    public static long A01(int i, int i2, long j, long j2) {
        return (((j / A00(i)) / i2) * 1000000) / j2;
    }
}
