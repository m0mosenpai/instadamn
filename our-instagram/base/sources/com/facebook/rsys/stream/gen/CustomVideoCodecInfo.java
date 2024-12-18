package com.facebook.rsys.stream.gen;

import X.AbstractC166987dD;
import X.AbstractC25236BEt;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: classes8.dex */
public class CustomVideoCodecInfo {
    public static C2N9 CONVERTER = new LSW(18);
    public static long sMcfTypeId;
    public final int codecName;
    public final int contentType;
    public final HashSet supportedUserIds;
    public final long version;

    public static native CustomVideoCodecInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomVideoCodecInfo)) {
            return false;
        }
        CustomVideoCodecInfo customVideoCodecInfo = (CustomVideoCodecInfo) obj;
        return this.codecName == customVideoCodecInfo.codecName && this.contentType == customVideoCodecInfo.contentType && this.version == customVideoCodecInfo.version && this.supportedUserIds.equals(customVideoCodecInfo.supportedUserIds);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.supportedUserIds, AbstractC25236BEt.A01(this.version, (JQ0.A01(this.codecName) + this.contentType) * 31));
    }

    public CustomVideoCodecInfo(int i, int i2, long j, HashSet hashSet) {
        hashSet.getClass();
        this.codecName = i;
        this.contentType = i2;
        this.version = j;
        this.supportedUserIds = hashSet;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CustomVideoCodecInfo{codecName=");
        A1C.append(this.codecName);
        A1C.append(",contentType=");
        A1C.append(this.contentType);
        A1C.append(",version=");
        A1C.append(this.version);
        A1C.append(",supportedUserIds=");
        return JQ0.A0l(this.supportedUserIds, A1C);
    }
}
