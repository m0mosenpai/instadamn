package com.instagram.rtc.rsys.models;

import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class DismissNotification {
    public static C2N9 CONVERTER = new YAL(14);
    public static long sMcfTypeId;
    public final int reason;
    public final String serverInfoData;

    public static native DismissNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DismissNotification)) {
            return false;
        }
        DismissNotification dismissNotification = (DismissNotification) obj;
        return this.serverInfoData.equals(dismissNotification.serverInfoData) && this.reason == dismissNotification.reason;
    }

    public int hashCode() {
        return AbstractC50523MSb.A02(this.serverInfoData) + this.reason;
    }

    public String toString() {
        return AnonymousClass001.A09(this.reason, "DismissNotification{serverInfoData=", this.serverInfoData, ",reason=", "}");
    }

    public DismissNotification(String str, int i) {
        str.getClass();
        this.serverInfoData = str;
        this.reason = i;
    }
}
