package com.facebook.ale.p000native;

import X.AbstractC166987dD;
import X.C14360o3;
import X.YMZ;

/* loaded from: classes12.dex */
public final class AvatarLiveEditingNetworkInterface {
    public final YMZ avatarLiveEditingNetworkInterface;

    public AvatarLiveEditingNetworkInterface(YMZ ymz) {
        C14360o3.A0B(ymz, 1);
        this.avatarLiveEditingNetworkInterface = ymz;
    }

    public final boolean makeCDNRequest(String str, ResponseCallback responseCallback) {
        C14360o3.A0B(responseCallback, 1);
        throw AbstractC166987dD.A15("makeCDNRequest");
    }

    public final CancellationToken makeCancellableCDNRequest(String str, ResponseCallback responseCallback) {
        C14360o3.A0B(responseCallback, 1);
        throw AbstractC166987dD.A15("makeCancellableCDNRequest");
    }

    public final boolean makeGraphQLRequest(String str, String str2, ResponseCallback responseCallback) {
        C14360o3.A0B(responseCallback, 2);
        throw AbstractC166987dD.A15("makeGraphQLRequest");
    }
}
