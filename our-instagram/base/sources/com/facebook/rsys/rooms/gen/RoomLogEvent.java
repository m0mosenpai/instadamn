package com.facebook.rsys.rooms.gen;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AnonymousClass001;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class RoomLogEvent {
    public final String eventName;
    public final String linkUrl;
    public final String localCallId;

    public static native RoomLogEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomLogEvent)) {
                return false;
            }
            RoomLogEvent roomLogEvent = (RoomLogEvent) obj;
            String str = this.linkUrl;
            String str2 = roomLogEvent.linkUrl;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (!this.eventName.equals(roomLogEvent.eventName) || !this.localCallId.equals(roomLogEvent.localCallId)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.localCallId, AbstractC166997dE.A0K(this.eventName, JQ0.A01(AbstractC167017dG.A0O(this.linkUrl))));
    }

    public final String toString() {
        return AnonymousClass001.A15("RoomLogEvent{linkUrl=", this.linkUrl, ",eventName=", this.eventName, ",localCallId=", this.localCallId, "}");
    }

    public RoomLogEvent(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.linkUrl = str;
        this.eventName = str2;
        this.localCallId = str3;
    }
}
