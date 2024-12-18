package com.facebook.rsys.mosaicgrid.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class FrameSize {
    public static C2N9 CONVERTER = C55648OnZ.A00(59);
    public static long sMcfTypeId;
    public final int height;
    public final int width;

    public static native FrameSize createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameSize)) {
            return false;
        }
        FrameSize frameSize = (FrameSize) obj;
        return this.width == frameSize.width && this.height == frameSize.height;
    }

    public int hashCode() {
        return JQ0.A01(this.width) + this.height;
    }

    public String toString() {
        return AnonymousClass001.A0n("FrameSize{width=", ",height=", "}", this.width, this.height);
    }

    public FrameSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
