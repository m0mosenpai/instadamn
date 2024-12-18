package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MediaSyncOutboundWireState {
    public final int action;
    public final long actionCursor;
    public final int adminMessageType;
    public final Integer carouselItemIndex;
    public final String contentId;
    public final int contentSource;
    public final String initiatorId;
    public final long mediaPositionMs;
    public final String seedContentId;
    public final String tabSource;

    public static native MediaSyncOutboundWireState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncOutboundWireState)) {
                return false;
            }
            MediaSyncOutboundWireState mediaSyncOutboundWireState = (MediaSyncOutboundWireState) obj;
            if (this.action == mediaSyncOutboundWireState.action && this.mediaPositionMs == mediaSyncOutboundWireState.mediaPositionMs && this.contentId.equals(mediaSyncOutboundWireState.contentId) && this.contentSource == mediaSyncOutboundWireState.contentSource && this.adminMessageType == mediaSyncOutboundWireState.adminMessageType) {
                String str = this.tabSource;
                String str2 = mediaSyncOutboundWireState.tabSource;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.actionCursor != mediaSyncOutboundWireState.actionCursor) {
                    return false;
                }
                Integer num = this.carouselItemIndex;
                Integer num2 = mediaSyncOutboundWireState.carouselItemIndex;
                if (num == null) {
                    if (num2 != null) {
                        return false;
                    }
                } else if (!num.equals(num2)) {
                    return false;
                }
                String str3 = this.seedContentId;
                String str4 = mediaSyncOutboundWireState.seedContentId;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.initiatorId;
                String str6 = mediaSyncOutboundWireState.initiatorId;
                if (str5 != null) {
                    if (!str5.equals(str6)) {
                        return false;
                    }
                } else if (str6 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A07(this.actionCursor, (((((AbstractC166997dE.A0K(this.contentId, AbstractC167007dF.A07(this.mediaPositionMs, JQ0.A01(this.action))) + this.contentSource) * 31) + this.adminMessageType) * 31) + AbstractC167017dG.A0O(this.tabSource)) * 31) + AbstractC167017dG.A0M(this.carouselItemIndex)) * 31) + AbstractC167017dG.A0O(this.seedContentId)) * 31) + AbstractC25227BEk.A07(this.initiatorId);
    }

    public MediaSyncOutboundWireState(int i, long j, String str, int i2, int i3, String str2, long j2, Integer num, String str3, String str4) {
        str.getClass();
        this.action = i;
        this.mediaPositionMs = j;
        this.contentId = str;
        this.contentSource = i2;
        this.adminMessageType = i3;
        this.tabSource = str2;
        this.actionCursor = j2;
        this.carouselItemIndex = num;
        this.seedContentId = str3;
        this.initiatorId = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaSyncOutboundWireState{action=");
        A1C.append(this.action);
        A1C.append(",mediaPositionMs=");
        A1C.append(this.mediaPositionMs);
        A1C.append(",contentId=");
        A1C.append(this.contentId);
        A1C.append(",contentSource=");
        A1C.append(this.contentSource);
        A1C.append(",adminMessageType=");
        A1C.append(this.adminMessageType);
        A1C.append(",tabSource=");
        A1C.append(this.tabSource);
        A1C.append(",actionCursor=");
        A1C.append(this.actionCursor);
        A1C.append(",carouselItemIndex=");
        A1C.append(this.carouselItemIndex);
        A1C.append(",seedContentId=");
        A1C.append(this.seedContentId);
        A1C.append(",initiatorId=");
        return AbstractC50523MSb.A0W(this.initiatorId, A1C);
    }
}
