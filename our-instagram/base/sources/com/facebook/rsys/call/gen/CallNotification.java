package com.facebook.rsys.call.gen;

import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CallNotification {
    public static C2N9 CONVERTER = YAN.A00(19);
    public static long sMcfTypeId;
    public final int notificationType;
    public final String userId;

    public static native CallNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallNotification)) {
            return false;
        }
        CallNotification callNotification = (CallNotification) obj;
        return this.userId.equals(callNotification.userId) && this.notificationType == callNotification.notificationType;
    }

    public int hashCode() {
        return AbstractC50523MSb.A02(this.userId) + this.notificationType;
    }

    public String toString() {
        return AnonymousClass001.A09(this.notificationType, "CallNotification{userId=", this.userId, ",notificationType=", "}");
    }

    public CallNotification(String str, int i) {
        str.getClass();
        this.userId = str;
        this.notificationType = i;
    }
}
