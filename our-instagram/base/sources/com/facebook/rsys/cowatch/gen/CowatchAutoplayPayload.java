package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AbstractC25236BEt;
import X.AbstractC31180DnO;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CowatchAutoplayPayload {
    public final String mediaId;
    public final String mediaSource;
    public final long previewDurationMs;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public static native CowatchAutoplayPayload createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAutoplayPayload)) {
            return false;
        }
        CowatchAutoplayPayload cowatchAutoplayPayload = (CowatchAutoplayPayload) obj;
        return this.mediaId.equals(cowatchAutoplayPayload.mediaId) && this.mediaSource.equals(cowatchAutoplayPayload.mediaSource) && this.previewDurationMs == cowatchAutoplayPayload.previewDurationMs && this.sourceMediaId.equals(cowatchAutoplayPayload.sourceMediaId) && this.sourceMediaSource.equals(cowatchAutoplayPayload.sourceMediaSource);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.sourceMediaSource, AbstractC166997dE.A0K(this.sourceMediaId, AbstractC25236BEt.A01(this.previewDurationMs, AbstractC166997dE.A0K(this.mediaSource, (527 + this.mediaId.hashCode()) * 31))));
    }

    public CowatchAutoplayPayload(String str, String str2, long j, String str3, String str4) {
        AbstractC31180DnO.A1U(str, str2, str3);
        str4.getClass();
        this.mediaId = str;
        this.mediaSource = str2;
        this.previewDurationMs = j;
        this.sourceMediaId = str3;
        this.sourceMediaSource = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchAutoplayPayload{mediaId=");
        A1C.append(this.mediaId);
        A1C.append(",mediaSource=");
        A1C.append(this.mediaSource);
        A1C.append(",previewDurationMs=");
        A1C.append(this.previewDurationMs);
        A1C.append(",sourceMediaId=");
        A1C.append(this.sourceMediaId);
        A1C.append(",sourceMediaSource=");
        A1C.append(this.sourceMediaSource);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
