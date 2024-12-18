package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC25229BEm;
import X.AbstractC58318PtA;
import java.util.Arrays;
import org.webrtc.PeerConnection;

/* loaded from: classes12.dex */
public class IceCandidate {
    public final PeerConnection.AdapterType adapterType;
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    public static boolean objectEquals(Object obj, Object obj2) {
        if (obj == null) {
            return AbstractC25229BEm.A1Z(obj2);
        }
        return obj.equals(obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        if (!objectEquals(this.sdpMid, iceCandidate.sdpMid) || this.sdpMLineIndex != iceCandidate.sdpMLineIndex || !objectEquals(this.sdp, iceCandidate.sdp)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.sdpMid, Integer.valueOf(this.sdpMLineIndex), this.sdp});
    }

    public IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = str3;
        this.adapterType = adapterType;
    }

    public String getSdp() {
        return this.sdp;
    }

    public String getSdpMid() {
        return this.sdpMid;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.sdpMid);
        A1C.append(":");
        A1C.append(this.sdpMLineIndex);
        A1C.append(":");
        A1C.append(this.sdp);
        A1C.append(":");
        A1C.append(this.serverUrl);
        A1C.append(":");
        AbstractC58318PtA.A1V(A1C, this.adapterType);
        return A1C.toString();
    }

    public IceCandidate(String str, int i, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = "";
        this.adapterType = PeerConnection.AdapterType.UNKNOWN;
    }
}
