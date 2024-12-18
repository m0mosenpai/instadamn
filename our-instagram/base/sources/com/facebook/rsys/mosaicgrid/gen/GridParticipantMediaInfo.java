package com.facebook.rsys.mosaicgrid.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class GridParticipantMediaInfo {
    public static C2N9 CONVERTER = C55648OnZ.A00(60);
    public static long sMcfTypeId;
    public final boolean isMosaicGridCapable;
    public final FrameSize videoSize;

    public static native GridParticipantMediaInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridParticipantMediaInfo)) {
            return false;
        }
        GridParticipantMediaInfo gridParticipantMediaInfo = (GridParticipantMediaInfo) obj;
        return this.isMosaicGridCapable == gridParticipantMediaInfo.isMosaicGridCapable && this.videoSize.equals(gridParticipantMediaInfo.videoSize);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.videoSize, JQ0.A01(this.isMosaicGridCapable ? 1 : 0));
    }

    public GridParticipantMediaInfo(boolean z, FrameSize frameSize) {
        frameSize.getClass();
        this.isMosaicGridCapable = z;
        this.videoSize = frameSize;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridParticipantMediaInfo{isMosaicGridCapable=");
        A1C.append(this.isMosaicGridCapable);
        A1C.append(",videoSize=");
        return JQ0.A0l(this.videoSize, A1C);
    }
}
