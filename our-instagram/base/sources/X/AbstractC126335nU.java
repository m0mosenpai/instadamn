package X;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: X.5nU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126335nU {
    public static void A00(AudioTrack audioTrack, C4WZ c4wz) {
        LogSessionId A00 = c4wz.A00();
        if (!A00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(A00);
        }
    }
}
