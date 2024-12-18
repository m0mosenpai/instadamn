package com.facebook.rsys.livevideo.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC31180DnO;
import X.AbstractC50523MSb;
import X.AbstractC72049XLp;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class LiveVideoStartParameters {
    public static C2N9 CONVERTER = YAN.A00(63);
    public static long sMcfTypeId;
    public final ArrayList activeParticipants;
    public final String funnelSessionId;
    public final ArrayList participantsMediaStatus;

    public static native LiveVideoStartParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveVideoStartParameters)) {
            return false;
        }
        LiveVideoStartParameters liveVideoStartParameters = (LiveVideoStartParameters) obj;
        return this.activeParticipants.equals(liveVideoStartParameters.activeParticipants) && this.participantsMediaStatus.equals(liveVideoStartParameters.participantsMediaStatus) && this.funnelSessionId.equals(liveVideoStartParameters.funnelSessionId);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.funnelSessionId, AbstractC166997dE.A0J(this.participantsMediaStatus, AbstractC72049XLp.A02(this.activeParticipants)));
    }

    public LiveVideoStartParameters(ArrayList arrayList, ArrayList arrayList2, String str) {
        AbstractC31180DnO.A1U(arrayList, arrayList2, str);
        this.activeParticipants = arrayList;
        this.participantsMediaStatus = arrayList2;
        this.funnelSessionId = str;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LiveVideoStartParameters{activeParticipants=");
        A1C.append(this.activeParticipants);
        A1C.append(",participantsMediaStatus=");
        A1C.append(this.participantsMediaStatus);
        A1C.append(",funnelSessionId=");
        return AbstractC50523MSb.A0W(this.funnelSessionId, A1C);
    }
}
