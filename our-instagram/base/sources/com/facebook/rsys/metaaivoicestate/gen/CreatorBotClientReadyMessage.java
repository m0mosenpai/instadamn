package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class CreatorBotClientReadyMessage {
    public static C2N9 CONVERTER = YAM.A00(4);
    public static long sMcfTypeId;
    public final boolean ready;

    public static native CreatorBotClientReadyMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CreatorBotClientReadyMessage) && this.ready == ((CreatorBotClientReadyMessage) obj).ready;
        }
        return true;
    }

    public int hashCode() {
        return 527 + (this.ready ? 1 : 0);
    }

    public String toString() {
        return AnonymousClass001.A1B("CreatorBotClientReadyMessage{ready=", "}", this.ready);
    }

    public CreatorBotClientReadyMessage(boolean z) {
        this.ready = z;
    }
}
