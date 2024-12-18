package com.facebook.rsys.mosaicgrid.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MosaicGridParams {
    public static C2N9 CONVERTER = C55648OnZ.A00(61);
    public static long sMcfTypeId;
    public final FrameSize initialVideoSize;
    public final boolean isMosaicGridCapable;

    public static native MosaicGridParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MosaicGridParams)) {
            return false;
        }
        MosaicGridParams mosaicGridParams = (MosaicGridParams) obj;
        return this.isMosaicGridCapable == mosaicGridParams.isMosaicGridCapable && this.initialVideoSize.equals(mosaicGridParams.initialVideoSize);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.initialVideoSize, JQ0.A01(this.isMosaicGridCapable ? 1 : 0));
    }

    public MosaicGridParams(boolean z, FrameSize frameSize) {
        frameSize.getClass();
        this.isMosaicGridCapable = z;
        this.initialVideoSize = frameSize;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MosaicGridParams{isMosaicGridCapable=");
        A1C.append(this.isMosaicGridCapable);
        A1C.append(",initialVideoSize=");
        return JQ0.A0l(this.initialVideoSize, A1C);
    }
}
