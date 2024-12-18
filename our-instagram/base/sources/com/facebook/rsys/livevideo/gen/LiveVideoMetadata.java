package com.facebook.rsys.livevideo.gen;

import X.AbstractC25228BEl;
import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class LiveVideoMetadata {
    public static C2N9 CONVERTER = YAN.A00(61);
    public static long sMcfTypeId;
    public final long viewerCount;

    public static native LiveVideoMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveVideoMetadata) && this.viewerCount == ((LiveVideoMetadata) obj).viewerCount;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AbstractC25228BEl.A03(this.viewerCount);
    }

    public String toString() {
        return AnonymousClass001.A0e("LiveVideoMetadata{viewerCount=", "}", this.viewerCount);
    }

    public LiveVideoMetadata(long j) {
        this.viewerCount = j;
    }
}
