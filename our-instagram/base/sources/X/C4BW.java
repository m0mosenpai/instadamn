package X;

import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4BW, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4BW {
    public static C4B6 A01(C4B6[] c4b6Arr) {
        C4B6 c4b6 = c4b6Arr[0];
        for (int i = 1; i < c4b6Arr.length; i++) {
            if (c4b6Arr[i].A05 > c4b6.A05) {
                c4b6 = c4b6Arr[i];
            }
        }
        return c4b6;
    }

    public static boolean A02(C4B6 c4b6) {
        String str = c4b6.A0S;
        if (str != null && str.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Is, java.lang.Object] */
    public static C4Is A00(C2B4 c2b4, String str, int i, long j) {
        VideoBandwidthEstimate A00 = c2b4.A00();
        if (i != -1 && (i <= 0 || i >= 100)) {
            i = 80;
        }
        long estimatedBitrate = A00.getEstimatedBitrate(j, -1, str);
        long estimatedBitrate2 = A00.getEstimatedBitrate(j, i, str);
        ?? obj = new Object();
        obj.A02 = estimatedBitrate;
        obj.A01 = estimatedBitrate2;
        obj.A00 = i;
        return obj;
    }
}
