package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class CowatchPlayerCaptionModel {
    public final String captionText;
    public final long endTimeMs;
    public final long startTimeMs;

    public static native CowatchPlayerCaptionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchPlayerCaptionModel)) {
            return false;
        }
        CowatchPlayerCaptionModel cowatchPlayerCaptionModel = (CowatchPlayerCaptionModel) obj;
        return this.startTimeMs == cowatchPlayerCaptionModel.startTimeMs && this.endTimeMs == cowatchPlayerCaptionModel.endTimeMs && this.captionText.equals(cowatchPlayerCaptionModel.captionText);
    }

    public final int hashCode() {
        long j = this.startTimeMs;
        int A01 = JQ0.A01((int) (j ^ (j >>> 32)));
        long j2 = this.endTimeMs;
        return AbstractC25226BEj.A03(this.captionText, (A01 + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public CowatchPlayerCaptionModel(long j, long j2, String str) {
        str.getClass();
        this.startTimeMs = j;
        this.endTimeMs = j2;
        this.captionText = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchPlayerCaptionModel{startTimeMs=");
        A1C.append(this.startTimeMs);
        A1C.append(",endTimeMs=");
        A1C.append(this.endTimeMs);
        A1C.append(",captionText=");
        return AbstractC50523MSb.A0W(this.captionText, A1C);
    }
}
