package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CowatchPlayerIosModel {
    public static C2N9 CONVERTER = YAN.A00(35);
    public static long sMcfTypeId;
    public final boolean isInReportFlow;

    public static native CowatchPlayerIosModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CowatchPlayerIosModel) && this.isInReportFlow == ((CowatchPlayerIosModel) obj).isInReportFlow;
        }
        return true;
    }

    public int hashCode() {
        return 527 + (this.isInReportFlow ? 1 : 0);
    }

    public String toString() {
        return AnonymousClass001.A1B("CowatchPlayerIosModel{isInReportFlow=", "}", this.isInReportFlow);
    }

    public CowatchPlayerIosModel(boolean z) {
        this.isInReportFlow = z;
    }
}
