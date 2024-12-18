package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CowatchAutoplaySimpleModel {
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;

    public static native CowatchAutoplaySimpleModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAutoplaySimpleModel)) {
            return false;
        }
        CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = (CowatchAutoplaySimpleModel) obj;
        return this.mediaId.equals(cowatchAutoplaySimpleModel.mediaId) && this.mediaSource.equals(cowatchAutoplaySimpleModel.mediaSource) && this.previewDurationMs == cowatchAutoplaySimpleModel.previewDurationMs;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.mediaSource, (527 + this.mediaId.hashCode()) * 31);
        long j = this.previewDurationMs;
        return A0K + ((int) (j ^ (j >>> 32)));
    }

    public CowatchAutoplaySimpleModel(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchAutoplaySimpleModel{mediaId=");
        A1C.append(this.mediaId);
        A1C.append(",mediaSource=");
        A1C.append(this.mediaSource);
        A1C.append(",previewDurationMs=");
        A1C.append(this.previewDurationMs);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
