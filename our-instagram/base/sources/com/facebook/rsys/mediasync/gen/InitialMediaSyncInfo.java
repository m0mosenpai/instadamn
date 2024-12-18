package com.facebook.rsys.mediasync.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class InitialMediaSyncInfo {
    public static C2N9 CONVERTER = C55648OnZ.A00(44);
    public static long sMcfTypeId;
    public final int action;
    public final int adminMessageType;
    public final Integer carouselItemIndex;
    public final MediaSyncContent content;
    public final String contentId;
    public final int contentSource;
    public final String initiatorId;
    public final Long mediaPositionMs;
    public final String seedContentId;
    public final String tabSource;

    public static native InitialMediaSyncInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InitialMediaSyncInfo)) {
                return false;
            }
            InitialMediaSyncInfo initialMediaSyncInfo = (InitialMediaSyncInfo) obj;
            if (this.action == initialMediaSyncInfo.action && this.contentId.equals(initialMediaSyncInfo.contentId) && this.contentSource == initialMediaSyncInfo.contentSource) {
                Long l = this.mediaPositionMs;
                Long l2 = initialMediaSyncInfo.mediaPositionMs;
                if (l == null) {
                    if (l2 != null) {
                        return false;
                    }
                } else if (!l.equals(l2)) {
                    return false;
                }
                MediaSyncContent mediaSyncContent = this.content;
                MediaSyncContent mediaSyncContent2 = initialMediaSyncInfo.content;
                if (mediaSyncContent == null) {
                    if (mediaSyncContent2 != null) {
                        return false;
                    }
                } else if (!mediaSyncContent.equals(mediaSyncContent2)) {
                    return false;
                }
                if (this.adminMessageType != initialMediaSyncInfo.adminMessageType) {
                    return false;
                }
                String str = this.tabSource;
                String str2 = initialMediaSyncInfo.tabSource;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                Integer num = this.carouselItemIndex;
                Integer num2 = initialMediaSyncInfo.carouselItemIndex;
                if (num == null) {
                    if (num2 != null) {
                        return false;
                    }
                } else if (!num.equals(num2)) {
                    return false;
                }
                String str3 = this.seedContentId;
                String str4 = initialMediaSyncInfo.seedContentId;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.initiatorId;
                String str6 = initialMediaSyncInfo.initiatorId;
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

    public int hashCode() {
        return ((((((((((((((AbstractC166997dE.A0K(this.contentId, JQ0.A01(this.action)) + this.contentSource) * 31) + AbstractC167017dG.A0M(this.mediaPositionMs)) * 31) + AbstractC167017dG.A0M(this.content)) * 31) + this.adminMessageType) * 31) + AbstractC167017dG.A0O(this.tabSource)) * 31) + AbstractC167017dG.A0M(this.carouselItemIndex)) * 31) + AbstractC167017dG.A0O(this.seedContentId)) * 31) + AbstractC25227BEk.A07(this.initiatorId);
    }

    public InitialMediaSyncInfo(int i, String str, int i2, Long l, MediaSyncContent mediaSyncContent, int i3, String str2, Integer num, String str3, String str4) {
        str.getClass();
        this.action = i;
        this.contentId = str;
        this.contentSource = i2;
        this.mediaPositionMs = l;
        this.content = mediaSyncContent;
        this.adminMessageType = i3;
        this.tabSource = str2;
        this.carouselItemIndex = num;
        this.seedContentId = str3;
        this.initiatorId = str4;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("InitialMediaSyncInfo{action=");
        A1C.append(this.action);
        A1C.append(",contentId=");
        A1C.append(this.contentId);
        A1C.append(",contentSource=");
        A1C.append(this.contentSource);
        A1C.append(",mediaPositionMs=");
        A1C.append(this.mediaPositionMs);
        A1C.append(",content=");
        A1C.append(this.content);
        A1C.append(",adminMessageType=");
        A1C.append(this.adminMessageType);
        A1C.append(",tabSource=");
        A1C.append(this.tabSource);
        A1C.append(",carouselItemIndex=");
        A1C.append(this.carouselItemIndex);
        A1C.append(",seedContentId=");
        A1C.append(this.seedContentId);
        A1C.append(",initiatorId=");
        return AbstractC50523MSb.A0W(this.initiatorId, A1C);
    }
}
