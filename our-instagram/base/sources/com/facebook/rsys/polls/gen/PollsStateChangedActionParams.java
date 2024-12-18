package com.facebook.rsys.polls.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31180DnO;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public class PollsStateChangedActionParams {
    public final PollsFeaturePermissionsModel permissions;
    public final Map polls;
    public final HashSet processedActionIds;

    public static native PollsStateChangedActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsStateChangedActionParams)) {
            return false;
        }
        PollsStateChangedActionParams pollsStateChangedActionParams = (PollsStateChangedActionParams) obj;
        return this.polls.equals(pollsStateChangedActionParams.polls) && this.permissions.equals(pollsStateChangedActionParams.permissions) && this.processedActionIds.equals(pollsStateChangedActionParams.processedActionIds);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.processedActionIds, AbstractC166997dE.A0J(this.permissions, JQ0.A01(this.polls.hashCode())));
    }

    public PollsStateChangedActionParams(Map map, PollsFeaturePermissionsModel pollsFeaturePermissionsModel, HashSet hashSet) {
        AbstractC31180DnO.A1U(map, pollsFeaturePermissionsModel, hashSet);
        this.polls = map;
        this.permissions = pollsFeaturePermissionsModel;
        this.processedActionIds = hashSet;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PollsStateChangedActionParams{polls=");
        A1C.append(this.polls);
        A1C.append(",permissions=");
        A1C.append(this.permissions);
        A1C.append(",processedActionIds=");
        return JQ0.A0l(this.processedActionIds, A1C);
    }
}
