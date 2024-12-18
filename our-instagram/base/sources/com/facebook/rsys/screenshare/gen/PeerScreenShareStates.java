package com.facebook.rsys.screenshare.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public class PeerScreenShareStates {
    public static C2N9 CONVERTER = new LSW(17);
    public static long sMcfTypeId;
    public final HashSet screenSharingPeers;
    public final Map screenSharingSourcePerUserId;

    public static native PeerScreenShareStates createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PeerScreenShareStates)) {
                return false;
            }
            PeerScreenShareStates peerScreenShareStates = (PeerScreenShareStates) obj;
            if (this.screenSharingPeers.equals(peerScreenShareStates.screenSharingPeers)) {
                Map map = this.screenSharingSourcePerUserId;
                Map map2 = peerScreenShareStates.screenSharingSourcePerUserId;
                if (map != null) {
                    if (!map.equals(map2)) {
                        return false;
                    }
                } else if (map2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A01 = JQ0.A01(this.screenSharingPeers.hashCode());
        Map map = this.screenSharingSourcePerUserId;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return A01 + hashCode;
    }

    public PeerScreenShareStates(HashSet hashSet, Map map) {
        hashSet.getClass();
        this.screenSharingPeers = hashSet;
        this.screenSharingSourcePerUserId = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PeerScreenShareStates{screenSharingPeers=");
        A1C.append(this.screenSharingPeers);
        A1C.append(",screenSharingSourcePerUserId=");
        return JQ0.A0l(this.screenSharingSourcePerUserId, A1C);
    }
}
