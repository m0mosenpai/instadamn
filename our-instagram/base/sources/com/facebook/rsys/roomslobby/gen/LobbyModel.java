package com.facebook.rsys.roomslobby.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class LobbyModel {
    public static C2N9 CONVERTER = new LSW(16);
    public static long sMcfTypeId;
    public final ArrayList activeParticipants;
    public final boolean canDisplayActiveParticipants;
    public final String linkUrl;
    public final ArrayList ringlistParticipants;

    public static native LobbyModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LobbyModel)) {
            return false;
        }
        LobbyModel lobbyModel = (LobbyModel) obj;
        return this.linkUrl.equals(lobbyModel.linkUrl) && this.canDisplayActiveParticipants == lobbyModel.canDisplayActiveParticipants && this.activeParticipants.equals(lobbyModel.activeParticipants) && this.ringlistParticipants.equals(lobbyModel.ringlistParticipants);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.ringlistParticipants, AbstractC166997dE.A0J(this.activeParticipants, (JQ0.A01(this.linkUrl.hashCode()) + (this.canDisplayActiveParticipants ? 1 : 0)) * 31));
    }

    public LobbyModel(String str, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC31180DnO.A1U(str, arrayList, arrayList2);
        this.linkUrl = str;
        this.canDisplayActiveParticipants = z;
        this.activeParticipants = arrayList;
        this.ringlistParticipants = arrayList2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LobbyModel{linkUrl=");
        A1C.append(this.linkUrl);
        A1C.append(",canDisplayActiveParticipants=");
        A1C.append(this.canDisplayActiveParticipants);
        A1C.append(",activeParticipants=");
        A1C.append(this.activeParticipants);
        A1C.append(",ringlistParticipants=");
        return JQ0.A0l(this.ringlistParticipants, A1C);
    }
}
