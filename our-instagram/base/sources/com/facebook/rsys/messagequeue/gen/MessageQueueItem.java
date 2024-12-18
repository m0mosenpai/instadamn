package com.facebook.rsys.messagequeue.gen;

import X.AbstractC166987dD;
import X.C2N9;
import X.JQ0;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class MessageQueueItem {
    public static C2N9 CONVERTER = YAM.A00(3);
    public static long sMcfTypeId;
    public final int expiryTimeMsec;
    public final int id;
    public final McfReference message;

    public static native MessageQueueItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageQueueItem)) {
            return false;
        }
        MessageQueueItem messageQueueItem = (MessageQueueItem) obj;
        return this.id == messageQueueItem.id && this.expiryTimeMsec == messageQueueItem.expiryTimeMsec && this.message.equals(messageQueueItem.message);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.message, (JQ0.A01(this.id) + this.expiryTimeMsec) * 31);
    }

    public MessageQueueItem(int i, int i2, McfReference mcfReference) {
        mcfReference.getClass();
        this.id = i;
        this.expiryTimeMsec = i2;
        this.message = mcfReference;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MessageQueueItem{id=");
        A1C.append(this.id);
        A1C.append(",expiryTimeMsec=");
        A1C.append(this.expiryTimeMsec);
        A1C.append(",message=");
        return JQ0.A0l(this.message, A1C);
    }
}
