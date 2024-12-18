package com.facebook.rsys.grid.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class GridOrderingParameters {
    public static C2N9 CONVERTER = new LSW(7);
    public static long sMcfTypeId;
    public final boolean considerPinnedPeers;
    public final boolean considerRecentDominantSpeakers;
    public final boolean considerRecentlyConnectedPeers;
    public final boolean considerScreensharingPeers;
    public final boolean considerVideoStreamingPeers;
    public final GridDisplayEligibleStates displayEligibleStates;
    public final int maxPeersVisible;
    public final int orderingPreset;

    public static native GridOrderingParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridOrderingParameters)) {
            return false;
        }
        GridOrderingParameters gridOrderingParameters = (GridOrderingParameters) obj;
        return this.considerRecentlyConnectedPeers == gridOrderingParameters.considerRecentlyConnectedPeers && this.considerRecentDominantSpeakers == gridOrderingParameters.considerRecentDominantSpeakers && this.considerScreensharingPeers == gridOrderingParameters.considerScreensharingPeers && this.considerPinnedPeers == gridOrderingParameters.considerPinnedPeers && this.considerVideoStreamingPeers == gridOrderingParameters.considerVideoStreamingPeers && this.displayEligibleStates.equals(gridOrderingParameters.displayEligibleStates) && this.maxPeersVisible == gridOrderingParameters.maxPeersVisible && this.orderingPreset == gridOrderingParameters.orderingPreset;
    }

    public int hashCode() {
        return ((AbstractC166997dE.A0J(this.displayEligibleStates, (((((((JQ0.A01(this.considerRecentlyConnectedPeers ? 1 : 0) + (this.considerRecentDominantSpeakers ? 1 : 0)) * 31) + (this.considerScreensharingPeers ? 1 : 0)) * 31) + (this.considerPinnedPeers ? 1 : 0)) * 31) + (this.considerVideoStreamingPeers ? 1 : 0)) * 31) + this.maxPeersVisible) * 31) + this.orderingPreset;
    }

    public GridOrderingParameters(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridDisplayEligibleStates gridDisplayEligibleStates, int i, int i2) {
        gridDisplayEligibleStates.getClass();
        this.considerRecentlyConnectedPeers = z;
        this.considerRecentDominantSpeakers = z2;
        this.considerScreensharingPeers = z3;
        this.considerPinnedPeers = z4;
        this.considerVideoStreamingPeers = z5;
        this.displayEligibleStates = gridDisplayEligibleStates;
        this.maxPeersVisible = i;
        this.orderingPreset = i2;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridOrderingParameters{considerRecentlyConnectedPeers=");
        A1C.append(this.considerRecentlyConnectedPeers);
        A1C.append(",considerRecentDominantSpeakers=");
        A1C.append(this.considerRecentDominantSpeakers);
        A1C.append(",considerScreensharingPeers=");
        A1C.append(this.considerScreensharingPeers);
        A1C.append(",considerPinnedPeers=");
        A1C.append(this.considerPinnedPeers);
        A1C.append(",considerVideoStreamingPeers=");
        A1C.append(this.considerVideoStreamingPeers);
        A1C.append(",displayEligibleStates=");
        A1C.append(this.displayEligibleStates);
        A1C.append(",maxPeersVisible=");
        A1C.append(this.maxPeersVisible);
        A1C.append(",orderingPreset=");
        A1C.append(this.orderingPreset);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
