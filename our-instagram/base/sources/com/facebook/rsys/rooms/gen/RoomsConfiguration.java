package com.facebook.rsys.rooms.gen;

import X.AnonymousClass001;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomsConfiguration {
    public final boolean disableRoomOwnerAutoJoin;

    public static native RoomsConfiguration createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RoomsConfiguration) && this.disableRoomOwnerAutoJoin == ((RoomsConfiguration) obj).disableRoomOwnerAutoJoin;
        }
        return true;
    }

    public final int hashCode() {
        return 527 + (this.disableRoomOwnerAutoJoin ? 1 : 0);
    }

    public final String toString() {
        return AnonymousClass001.A1B("RoomsConfiguration{disableRoomOwnerAutoJoin=", "}", this.disableRoomOwnerAutoJoin);
    }

    public RoomsConfiguration(boolean z) {
        this.disableRoomOwnerAutoJoin = z;
    }
}
