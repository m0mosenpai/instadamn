package X;

import com.facebook.rsys.call.gen.ParticipantMediaState;
import com.facebook.rsys.video.gen.VideoStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.NpS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53735NpS {
    public static final boolean A00(ParticipantMediaState participantMediaState) {
        ArrayList arrayList = participantMediaState.videoStreams;
        C14360o3.A06(arrayList);
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i = ((VideoStream) it.next()).streamState;
                if (i == 3 || i == 4 || i == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
