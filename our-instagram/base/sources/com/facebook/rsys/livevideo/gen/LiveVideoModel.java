package com.facebook.rsys.livevideo.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class LiveVideoModel {
    public static C2N9 CONVERTER = YAN.A00(62);
    public static long sMcfTypeId;
    public final ArrayList acceptedUsers;
    public final Long broadcastId;
    public final LiveVideoCancelCreatedNotStartedParameters cancelCreatedNotStartedParameters;
    public final LiveVideoCreationParameters creationParameters;
    public final LiveVideoEndParameters endParameters;
    public final Long errorCode;
    public final int liveStreamStatus;
    public final boolean livestreamStateSyncTopicInitialized;
    public final LiveVideoMetadata metadata;
    public final boolean needsStateSyncUnsubscribe;
    public final String negotiationToken;
    public final LiveStreamOptInInfo optInInfo;
    public final LiveVideoStartParameters startParameters;
    public final boolean userAcknowledged;
    public final String videoId;

    public static native LiveVideoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveVideoModel)) {
                return false;
            }
            LiveVideoModel liveVideoModel = (LiveVideoModel) obj;
            if (this.liveStreamStatus == liveVideoModel.liveStreamStatus) {
                Long l = this.errorCode;
                Long l2 = liveVideoModel.errorCode;
                if (l == null) {
                    if (l2 != null) {
                        return false;
                    }
                } else if (!l.equals(l2)) {
                    return false;
                }
                if (this.userAcknowledged != liveVideoModel.userAcknowledged) {
                    return false;
                }
                String str = this.negotiationToken;
                String str2 = liveVideoModel.negotiationToken;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                LiveStreamOptInInfo liveStreamOptInInfo = this.optInInfo;
                LiveStreamOptInInfo liveStreamOptInInfo2 = liveVideoModel.optInInfo;
                if (liveStreamOptInInfo == null) {
                    if (liveStreamOptInInfo2 != null) {
                        return false;
                    }
                } else if (!liveStreamOptInInfo.equals(liveStreamOptInInfo2)) {
                    return false;
                }
                ArrayList arrayList = this.acceptedUsers;
                ArrayList arrayList2 = liveVideoModel.acceptedUsers;
                if (arrayList == null) {
                    if (arrayList2 != null) {
                        return false;
                    }
                } else if (!arrayList.equals(arrayList2)) {
                    return false;
                }
                Long l3 = this.broadcastId;
                Long l4 = liveVideoModel.broadcastId;
                if (l3 == null) {
                    if (l4 != null) {
                        return false;
                    }
                } else if (!l3.equals(l4)) {
                    return false;
                }
                String str3 = this.videoId;
                String str4 = liveVideoModel.videoId;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                if (this.needsStateSyncUnsubscribe != liveVideoModel.needsStateSyncUnsubscribe) {
                    return false;
                }
                LiveVideoCreationParameters liveVideoCreationParameters = this.creationParameters;
                LiveVideoCreationParameters liveVideoCreationParameters2 = liveVideoModel.creationParameters;
                if (liveVideoCreationParameters == null) {
                    if (liveVideoCreationParameters2 != null) {
                        return false;
                    }
                } else if (!liveVideoCreationParameters.equals(liveVideoCreationParameters2)) {
                    return false;
                }
                LiveVideoStartParameters liveVideoStartParameters = this.startParameters;
                LiveVideoStartParameters liveVideoStartParameters2 = liveVideoModel.startParameters;
                if (liveVideoStartParameters == null) {
                    if (liveVideoStartParameters2 != null) {
                        return false;
                    }
                } else if (!liveVideoStartParameters.equals(liveVideoStartParameters2)) {
                    return false;
                }
                LiveVideoEndParameters liveVideoEndParameters = this.endParameters;
                LiveVideoEndParameters liveVideoEndParameters2 = liveVideoModel.endParameters;
                if (liveVideoEndParameters == null) {
                    if (liveVideoEndParameters2 != null) {
                        return false;
                    }
                } else if (!liveVideoEndParameters.equals(liveVideoEndParameters2)) {
                    return false;
                }
                LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters = this.cancelCreatedNotStartedParameters;
                LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters2 = liveVideoModel.cancelCreatedNotStartedParameters;
                if (liveVideoCancelCreatedNotStartedParameters == null) {
                    if (liveVideoCancelCreatedNotStartedParameters2 != null) {
                        return false;
                    }
                } else if (!liveVideoCancelCreatedNotStartedParameters.equals(liveVideoCancelCreatedNotStartedParameters2)) {
                    return false;
                }
                LiveVideoMetadata liveVideoMetadata = this.metadata;
                LiveVideoMetadata liveVideoMetadata2 = liveVideoModel.metadata;
                if (liveVideoMetadata != null) {
                    if (!liveVideoMetadata.equals(liveVideoMetadata2)) {
                        return false;
                    }
                } else if (liveVideoMetadata2 != null) {
                    return false;
                }
                if (this.livestreamStateSyncTopicInitialized != liveVideoModel.livestreamStateSyncTopicInitialized) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((JQ0.A01(this.liveStreamStatus) + AbstractC167017dG.A0M(this.errorCode)) * 31) + (this.userAcknowledged ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.negotiationToken)) * 31) + AbstractC167017dG.A0M(this.optInInfo)) * 31) + AbstractC167017dG.A0M(this.acceptedUsers)) * 31) + AbstractC167017dG.A0M(this.broadcastId)) * 31) + AbstractC167017dG.A0O(this.videoId)) * 31) + (this.needsStateSyncUnsubscribe ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.creationParameters)) * 31) + AbstractC167017dG.A0M(this.startParameters)) * 31) + AbstractC167017dG.A0M(this.endParameters)) * 31) + AbstractC167017dG.A0M(this.cancelCreatedNotStartedParameters)) * 31) + AbstractC166997dE.A0I(this.metadata)) * 31) + (this.livestreamStateSyncTopicInitialized ? 1 : 0);
    }

    public LiveVideoModel(int i, Long l, boolean z, String str, LiveStreamOptInInfo liveStreamOptInInfo, ArrayList arrayList, Long l2, String str2, boolean z2, LiveVideoCreationParameters liveVideoCreationParameters, LiveVideoStartParameters liveVideoStartParameters, LiveVideoEndParameters liveVideoEndParameters, LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters, LiveVideoMetadata liveVideoMetadata, boolean z3) {
        this.liveStreamStatus = i;
        this.errorCode = l;
        this.userAcknowledged = z;
        this.negotiationToken = str;
        this.optInInfo = liveStreamOptInInfo;
        this.acceptedUsers = arrayList;
        this.broadcastId = l2;
        this.videoId = str2;
        this.needsStateSyncUnsubscribe = z2;
        this.creationParameters = liveVideoCreationParameters;
        this.startParameters = liveVideoStartParameters;
        this.endParameters = liveVideoEndParameters;
        this.cancelCreatedNotStartedParameters = liveVideoCancelCreatedNotStartedParameters;
        this.metadata = liveVideoMetadata;
        this.livestreamStateSyncTopicInitialized = z3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LiveVideoModel{liveStreamStatus=");
        A1C.append(this.liveStreamStatus);
        A1C.append(",errorCode=");
        A1C.append(this.errorCode);
        A1C.append(",userAcknowledged=");
        A1C.append(this.userAcknowledged);
        A1C.append(",negotiationToken=");
        A1C.append(this.negotiationToken);
        A1C.append(",optInInfo=");
        A1C.append(this.optInInfo);
        A1C.append(",acceptedUsers=");
        A1C.append(this.acceptedUsers);
        A1C.append(",broadcastId=");
        A1C.append(this.broadcastId);
        A1C.append(",videoId=");
        A1C.append(this.videoId);
        A1C.append(",needsStateSyncUnsubscribe=");
        A1C.append(this.needsStateSyncUnsubscribe);
        A1C.append(",creationParameters=");
        A1C.append(this.creationParameters);
        A1C.append(",startParameters=");
        A1C.append(this.startParameters);
        A1C.append(",endParameters=");
        A1C.append(this.endParameters);
        A1C.append(",cancelCreatedNotStartedParameters=");
        A1C.append(this.cancelCreatedNotStartedParameters);
        A1C.append(",metadata=");
        A1C.append(this.metadata);
        A1C.append(",livestreamStateSyncTopicInitialized=");
        return AbstractC50523MSb.A0X(A1C, this.livestreamStateSyncTopicInitialized);
    }
}
