package com.facebook.rsys.rooms.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class RoomsOptions {
    public final boolean disableRoomOwnerAutoJoin;
    public final RoomPollingOptions pollingOptions;
    public final boolean shouldAttemptRetryOnFailedResolve;
    public final boolean shouldEnableGVCLink;
    public final boolean shouldEnableGVCLinkCallExperience;
    public final boolean shouldEnableRoomsUIForGVCLink;
    public final boolean shouldSkipEnterRoomSproc;

    public static native RoomsOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomsOptions)) {
                return false;
            }
            RoomsOptions roomsOptions = (RoomsOptions) obj;
            if (this.shouldSkipEnterRoomSproc == roomsOptions.shouldSkipEnterRoomSproc && this.shouldEnableGVCLink == roomsOptions.shouldEnableGVCLink && this.shouldEnableRoomsUIForGVCLink == roomsOptions.shouldEnableRoomsUIForGVCLink && this.shouldEnableGVCLinkCallExperience == roomsOptions.shouldEnableGVCLinkCallExperience && this.shouldAttemptRetryOnFailedResolve == roomsOptions.shouldAttemptRetryOnFailedResolve) {
                RoomPollingOptions roomPollingOptions = this.pollingOptions;
                RoomPollingOptions roomPollingOptions2 = roomsOptions.pollingOptions;
                if (roomPollingOptions != null) {
                    if (!roomPollingOptions.equals(roomPollingOptions2)) {
                        return false;
                    }
                } else if (roomPollingOptions2 != null) {
                    return false;
                }
                if (this.disableRoomOwnerAutoJoin != roomsOptions.disableRoomOwnerAutoJoin) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((JQ0.A01(this.shouldSkipEnterRoomSproc ? 1 : 0) + (this.shouldEnableGVCLink ? 1 : 0)) * 31) + (this.shouldEnableRoomsUIForGVCLink ? 1 : 0)) * 31) + (this.shouldEnableGVCLinkCallExperience ? 1 : 0)) * 31) + (this.shouldAttemptRetryOnFailedResolve ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.pollingOptions)) * 31) + (this.disableRoomOwnerAutoJoin ? 1 : 0);
    }

    public RoomsOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, RoomPollingOptions roomPollingOptions, boolean z6) {
        this.shouldSkipEnterRoomSproc = z;
        this.shouldEnableGVCLink = z2;
        this.shouldEnableRoomsUIForGVCLink = z3;
        this.shouldEnableGVCLinkCallExperience = z4;
        this.shouldAttemptRetryOnFailedResolve = z5;
        this.pollingOptions = roomPollingOptions;
        this.disableRoomOwnerAutoJoin = z6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RoomsOptions{shouldSkipEnterRoomSproc=");
        A1C.append(this.shouldSkipEnterRoomSproc);
        A1C.append(",shouldEnableGVCLink=");
        A1C.append(this.shouldEnableGVCLink);
        A1C.append(",shouldEnableRoomsUIForGVCLink=");
        A1C.append(this.shouldEnableRoomsUIForGVCLink);
        A1C.append(",shouldEnableGVCLinkCallExperience=");
        A1C.append(this.shouldEnableGVCLinkCallExperience);
        A1C.append(",shouldAttemptRetryOnFailedResolve=");
        A1C.append(this.shouldAttemptRetryOnFailedResolve);
        A1C.append(",pollingOptions=");
        A1C.append(this.pollingOptions);
        A1C.append(",disableRoomOwnerAutoJoin=");
        return AbstractC50523MSb.A0X(A1C, this.disableRoomOwnerAutoJoin);
    }
}
