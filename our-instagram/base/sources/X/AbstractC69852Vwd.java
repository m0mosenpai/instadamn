package X;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: X.Vwd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69852Vwd {
    public static void A00(MediaDrm mediaDrm, C4WZ c4wz, byte[] bArr) {
        LogSessionId A00 = c4wz.A00();
        if (!A00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(A00);
        }
    }

    public static boolean A01(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }
}
