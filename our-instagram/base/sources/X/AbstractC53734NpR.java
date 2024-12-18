package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.NpR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53734NpR {
    public static final boolean A00(CallModel callModel) {
        if (callModel != null) {
            ParticipantMediaState participantMediaState = callModel.selfParticipant.mediaState;
            if (participantMediaState == null || AbstractC53735NpS.A00(participantMediaState)) {
                return true;
            }
            ArrayList arrayList = callModel.remoteParticipants;
            C14360o3.A06(arrayList);
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ParticipantMediaState participantMediaState2 = ((CallParticipant) it.next()).mediaState;
                    C14360o3.A06(participantMediaState2);
                    if (AbstractC53735NpS.A00(participantMediaState2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
