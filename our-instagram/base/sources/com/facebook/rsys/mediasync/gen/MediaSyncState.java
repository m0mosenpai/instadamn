package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class MediaSyncState {
    public static C2N9 CONVERTER = C55648OnZ.A00(49);
    public static long sMcfTypeId;
    public final int action;
    public final ActionMetadata actionMetadata;
    public final String actorId;
    public final String adminMessage;
    public final MediaSyncContent content;
    public final String contentId;
    public final int contentSource;
    public final String initiatorId;
    public final boolean isRefresh;
    public final long localClockOffsetMs;
    public final String seedContentId;
    public final String tabSource;

    public static native MediaSyncState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaSyncState)) {
                return false;
            }
            MediaSyncState mediaSyncState = (MediaSyncState) obj;
            if (this.action == mediaSyncState.action && this.actionMetadata.equals(mediaSyncState.actionMetadata) && this.contentId.equals(mediaSyncState.contentId) && this.contentSource == mediaSyncState.contentSource) {
                MediaSyncContent mediaSyncContent = this.content;
                MediaSyncContent mediaSyncContent2 = mediaSyncState.content;
                if (mediaSyncContent == null) {
                    if (mediaSyncContent2 != null) {
                        return false;
                    }
                } else if (!mediaSyncContent.equals(mediaSyncContent2)) {
                    return false;
                }
                String str = this.adminMessage;
                String str2 = mediaSyncState.adminMessage;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.localClockOffsetMs != mediaSyncState.localClockOffsetMs) {
                    return false;
                }
                String str3 = this.tabSource;
                String str4 = mediaSyncState.tabSource;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                if (this.isRefresh != mediaSyncState.isRefresh) {
                    return false;
                }
                String str5 = this.actorId;
                String str6 = mediaSyncState.actorId;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                String str7 = this.seedContentId;
                String str8 = mediaSyncState.seedContentId;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                String str9 = this.initiatorId;
                String str10 = mediaSyncState.initiatorId;
                if (str9 != null) {
                    if (!str9.equals(str10)) {
                        return false;
                    }
                } else if (str10 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC25236BEt.A01(this.localClockOffsetMs, (((((AbstractC166997dE.A0K(this.contentId, AbstractC166997dE.A0J(this.actionMetadata, JQ0.A01(this.action))) + this.contentSource) * 31) + AbstractC167017dG.A0M(this.content)) * 31) + AbstractC167017dG.A0O(this.adminMessage)) * 31) + AbstractC167017dG.A0O(this.tabSource)) * 31) + (this.isRefresh ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.actorId)) * 31) + AbstractC167017dG.A0O(this.seedContentId)) * 31) + AbstractC25227BEk.A07(this.initiatorId);
    }

    public MediaSyncState(int i, ActionMetadata actionMetadata, String str, int i2, MediaSyncContent mediaSyncContent, String str2, long j, String str3, boolean z, String str4, String str5, String str6) {
        actionMetadata.getClass();
        str.getClass();
        this.action = i;
        this.actionMetadata = actionMetadata;
        this.contentId = str;
        this.contentSource = i2;
        this.content = mediaSyncContent;
        this.adminMessage = str2;
        this.localClockOffsetMs = j;
        this.tabSource = str3;
        this.isRefresh = z;
        this.actorId = str4;
        this.seedContentId = str5;
        this.initiatorId = str6;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaSyncState{action=");
        A1C.append(this.action);
        A1C.append(",actionMetadata=");
        A1C.append(this.actionMetadata);
        A1C.append(",contentId=");
        A1C.append(this.contentId);
        A1C.append(",contentSource=");
        A1C.append(this.contentSource);
        A1C.append(",content=");
        A1C.append(this.content);
        A1C.append(",adminMessage=");
        A1C.append(this.adminMessage);
        A1C.append(",localClockOffsetMs=");
        A1C.append(this.localClockOffsetMs);
        A1C.append(",tabSource=");
        A1C.append(this.tabSource);
        A1C.append(",isRefresh=");
        A1C.append(this.isRefresh);
        A1C.append(",actorId=");
        A1C.append(this.actorId);
        A1C.append(",seedContentId=");
        A1C.append(this.seedContentId);
        A1C.append(",initiatorId=");
        return AbstractC50523MSb.A0W(this.initiatorId, A1C);
    }
}
