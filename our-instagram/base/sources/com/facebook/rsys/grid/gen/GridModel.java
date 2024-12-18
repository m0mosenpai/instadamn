package com.facebook.rsys.grid.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public class GridModel {
    public static C2N9 CONVERTER = new LSW(6);
    public static long sMcfTypeId;
    public final HashSet explicitlyPinnedPeerIds;
    public final String gridDominantSpeakerId;
    public final Map groups;
    public final String newParticipantsDefaultGridGroupId;
    public final ArrayList operationalRaisedHandsQueueUserIds;
    public final GridOrderingParameters orderingParameters;
    public final Map participantsToGroup;
    public final ArrayList peerIdsOrdered;
    public final ArrayList recencyQueue;

    public static native GridModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridModel)) {
                return false;
            }
            GridModel gridModel = (GridModel) obj;
            if (this.peerIdsOrdered.equals(gridModel.peerIdsOrdered) && this.explicitlyPinnedPeerIds.equals(gridModel.explicitlyPinnedPeerIds) && this.orderingParameters.equals(gridModel.orderingParameters) && this.recencyQueue.equals(gridModel.recencyQueue) && this.groups.equals(gridModel.groups) && this.participantsToGroup.equals(gridModel.participantsToGroup)) {
                String str = this.newParticipantsDefaultGridGroupId;
                String str2 = gridModel.newParticipantsDefaultGridGroupId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.gridDominantSpeakerId;
                String str4 = gridModel.gridDominantSpeakerId;
                if (str3 != null) {
                    if (!str3.equals(str4)) {
                        return false;
                    }
                } else if (str4 != null) {
                    return false;
                }
                if (!this.operationalRaisedHandsQueueUserIds.equals(gridModel.operationalRaisedHandsQueueUserIds)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.operationalRaisedHandsQueueUserIds, (((((((AbstractC166997dE.A0J(this.recencyQueue, AbstractC166997dE.A0J(this.orderingParameters, AbstractC166997dE.A0J(this.explicitlyPinnedPeerIds, JQ0.A01(this.peerIdsOrdered.hashCode())))) + this.groups.hashCode()) * 31) + this.participantsToGroup.hashCode()) * 31) + AbstractC167017dG.A0O(this.newParticipantsDefaultGridGroupId)) * 31) + AbstractC25227BEk.A07(this.gridDominantSpeakerId)) * 31);
    }

    public GridModel(ArrayList arrayList, HashSet hashSet, GridOrderingParameters gridOrderingParameters, ArrayList arrayList2, Map map, Map map2, String str, String str2, ArrayList arrayList3) {
        AbstractC31180DnO.A1U(arrayList, hashSet, gridOrderingParameters);
        AbstractC31180DnO.A1U(arrayList2, map, map2);
        arrayList3.getClass();
        this.peerIdsOrdered = arrayList;
        this.explicitlyPinnedPeerIds = hashSet;
        this.orderingParameters = gridOrderingParameters;
        this.recencyQueue = arrayList2;
        this.groups = map;
        this.participantsToGroup = map2;
        this.newParticipantsDefaultGridGroupId = str;
        this.gridDominantSpeakerId = str2;
        this.operationalRaisedHandsQueueUserIds = arrayList3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridModel{peerIdsOrdered=");
        A1C.append(this.peerIdsOrdered);
        A1C.append(",explicitlyPinnedPeerIds=");
        A1C.append(this.explicitlyPinnedPeerIds);
        A1C.append(",orderingParameters=");
        A1C.append(this.orderingParameters);
        A1C.append(",recencyQueue=");
        A1C.append(this.recencyQueue);
        A1C.append(",groups=");
        A1C.append(this.groups);
        A1C.append(",participantsToGroup=");
        A1C.append(this.participantsToGroup);
        A1C.append(",newParticipantsDefaultGridGroupId=");
        A1C.append(this.newParticipantsDefaultGridGroupId);
        A1C.append(",gridDominantSpeakerId=");
        A1C.append(this.gridDominantSpeakerId);
        A1C.append(",operationalRaisedHandsQueueUserIds=");
        return JQ0.A0l(this.operationalRaisedHandsQueueUserIds, A1C);
    }
}
