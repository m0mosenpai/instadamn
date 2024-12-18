package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.BB2;
import X.C14360o3;
import X.LS5;
import X.N04;
import com.facebook.cameracore.mediapipeline.services.participant.interfaces.ParticipantData;
import java.util.List;

/* loaded from: classes8.dex */
public final class ParticipantServiceDelegateBridge {
    public BB2 delegate;

    public final ParticipantData getCurrentUserDataSnapshot() {
        BB2 bb2 = this.delegate;
        if (bb2 != null) {
            N04 n04 = ((LS5) bb2).A01;
            String str = n04.A05;
            if (str == null) {
                str = n04.A08.userId;
            }
            return new ParticipantData(str, true, true, 1);
        }
        return null;
    }

    public final List getPeersDataSnapshot() {
        BB2 bb2 = this.delegate;
        if (bb2 != null) {
            return ((LS5) bb2).A01.A06;
        }
        return null;
    }

    public final void setParticipantUpdateHandler(Object obj) {
        BB2 bb2 = this.delegate;
        if (bb2 != null) {
            ParticipantUpdateHandlerHybrid participantUpdateHandlerHybrid = (ParticipantUpdateHandlerHybrid) obj;
            C14360o3.A0B(participantUpdateHandlerHybrid, 0);
            ((LS5) bb2).A00 = participantUpdateHandlerHybrid;
        }
    }
}
