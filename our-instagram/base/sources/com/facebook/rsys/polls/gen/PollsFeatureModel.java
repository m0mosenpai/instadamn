package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public class PollsFeatureModel {
    public static C2N9 CONVERTER = new LSW(13);
    public static long sMcfTypeId;
    public final ArrayList pendingActionsQueue;
    public final PollsFeaturePermissionsModel permissions;
    public final Map polls;

    public static native PollsFeatureModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsFeatureModel)) {
            return false;
        }
        PollsFeatureModel pollsFeatureModel = (PollsFeatureModel) obj;
        return this.polls.equals(pollsFeatureModel.polls) && this.permissions.equals(pollsFeatureModel.permissions) && this.pendingActionsQueue.equals(pollsFeatureModel.pendingActionsQueue);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.pendingActionsQueue, AbstractC166997dE.A0J(this.permissions, JQ0.A01(this.polls.hashCode())));
    }

    public PollsFeatureModel(Map map, PollsFeaturePermissionsModel pollsFeaturePermissionsModel, ArrayList arrayList) {
        AbstractC31180DnO.A1U(map, pollsFeaturePermissionsModel, arrayList);
        this.polls = map;
        this.permissions = pollsFeaturePermissionsModel;
        this.pendingActionsQueue = arrayList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollsFeatureModel{polls=");
        A1C.append(this.polls);
        A1C.append(",permissions=");
        A1C.append(this.permissions);
        A1C.append(",pendingActionsQueue=");
        return JQ0.A0l(this.pendingActionsQueue, A1C);
    }
}
