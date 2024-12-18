package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class CowatchClosedCaptionResponse {
    public final long endTime;
    public final long startTime;
    public final String text;

    public static native CowatchClosedCaptionResponse createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchClosedCaptionResponse)) {
            return false;
        }
        CowatchClosedCaptionResponse cowatchClosedCaptionResponse = (CowatchClosedCaptionResponse) obj;
        return this.startTime == cowatchClosedCaptionResponse.startTime && this.endTime == cowatchClosedCaptionResponse.endTime && this.text.equals(cowatchClosedCaptionResponse.text);
    }

    public final int hashCode() {
        long j = this.startTime;
        int A01 = JQ0.A01((int) (j ^ (j >>> 32)));
        long j2 = this.endTime;
        return AbstractC25226BEj.A03(this.text, (A01 + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public CowatchClosedCaptionResponse(long j, long j2, String str) {
        str.getClass();
        this.startTime = j;
        this.endTime = j2;
        this.text = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchClosedCaptionResponse{startTime=");
        A1C.append(this.startTime);
        A1C.append(",endTime=");
        A1C.append(this.endTime);
        A1C.append(",text=");
        return AbstractC50523MSb.A0W(this.text, A1C);
    }
}
