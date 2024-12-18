package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MediaSyncModel {
    public final boolean isRefresh;
    public final MediaSyncOutboundWireState outboundWireState;
    public final MediaSyncState state;

    public static native MediaSyncModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncModel)) {
                return false;
            }
            MediaSyncModel mediaSyncModel = (MediaSyncModel) obj;
            MediaSyncState mediaSyncState = this.state;
            MediaSyncState mediaSyncState2 = mediaSyncModel.state;
            if (mediaSyncState == null) {
                if (mediaSyncState2 != null) {
                    return false;
                }
            } else if (!mediaSyncState.equals(mediaSyncState2)) {
                return false;
            }
            MediaSyncOutboundWireState mediaSyncOutboundWireState = this.outboundWireState;
            MediaSyncOutboundWireState mediaSyncOutboundWireState2 = mediaSyncModel.outboundWireState;
            if (mediaSyncOutboundWireState != null) {
                if (!mediaSyncOutboundWireState.equals(mediaSyncOutboundWireState2)) {
                    return false;
                }
            } else if (mediaSyncOutboundWireState2 != null) {
                return false;
            }
            if (this.isRefresh != mediaSyncModel.isRefresh) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((JQ0.A01(AbstractC167017dG.A0M(this.state)) + AbstractC166997dE.A0I(this.outboundWireState)) * 31) + (this.isRefresh ? 1 : 0);
    }

    public MediaSyncModel(MediaSyncState mediaSyncState, MediaSyncOutboundWireState mediaSyncOutboundWireState, boolean z) {
        this.state = mediaSyncState;
        this.outboundWireState = mediaSyncOutboundWireState;
        this.isRefresh = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaSyncModel{state=");
        A1C.append(this.state);
        A1C.append(",outboundWireState=");
        A1C.append(this.outboundWireState);
        A1C.append(",isRefresh=");
        return AbstractC50523MSb.A0X(A1C, this.isRefresh);
    }
}
