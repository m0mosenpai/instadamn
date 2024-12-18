package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.LSW;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: classes8.dex */
public class CowatchPlayerInternalModel {
    public static C2N9 CONVERTER = new LSW(3);
    public static long sMcfTypeId;
    public final long audioUpdateCursor;
    public final String cowatchSessionID;
    public final boolean forceToSyncLatestState;
    public final CowatchLoggingModel log;
    public final long mediaPositionMsPerceivedDelta;
    public final String mediaUniqueID;
    public final int mutationSource;
    public final Long startWatchTimestampInMs;
    public final String suggestedContext;
    public final int swipeDirection;
    public final String tabSelectedFromAmdPlayNow;
    public final Map watchedHistory;

    public static native CowatchPlayerInternalModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPlayerInternalModel)) {
                return false;
            }
            CowatchPlayerInternalModel cowatchPlayerInternalModel = (CowatchPlayerInternalModel) obj;
            String str = this.cowatchSessionID;
            String str2 = cowatchPlayerInternalModel.cowatchSessionID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.mutationSource != cowatchPlayerInternalModel.mutationSource || this.mediaPositionMsPerceivedDelta != cowatchPlayerInternalModel.mediaPositionMsPerceivedDelta) {
                return false;
            }
            String str3 = this.mediaUniqueID;
            String str4 = cowatchPlayerInternalModel.mediaUniqueID;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.audioUpdateCursor != cowatchPlayerInternalModel.audioUpdateCursor || this.forceToSyncLatestState != cowatchPlayerInternalModel.forceToSyncLatestState) {
                return false;
            }
            CowatchLoggingModel cowatchLoggingModel = this.log;
            CowatchLoggingModel cowatchLoggingModel2 = cowatchPlayerInternalModel.log;
            if (cowatchLoggingModel == null) {
                if (cowatchLoggingModel2 != null) {
                    return false;
                }
            } else if (!cowatchLoggingModel.equals(cowatchLoggingModel2)) {
                return false;
            }
            Long l = this.startWatchTimestampInMs;
            Long l2 = cowatchPlayerInternalModel.startWatchTimestampInMs;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str5 = this.tabSelectedFromAmdPlayNow;
            String str6 = cowatchPlayerInternalModel.tabSelectedFromAmdPlayNow;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (this.swipeDirection != cowatchPlayerInternalModel.swipeDirection) {
                return false;
            }
            String str7 = this.suggestedContext;
            String str8 = cowatchPlayerInternalModel.suggestedContext;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            Map map = this.watchedHistory;
            Map map2 = cowatchPlayerInternalModel.watchedHistory;
            if (map != null) {
                if (!map.equals(map2)) {
                    return false;
                }
            } else if (map2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A07 = (((((((((((AbstractC167007dF.A07(this.audioUpdateCursor, (AbstractC167007dF.A07(this.mediaPositionMsPerceivedDelta, (JQ0.A01(AbstractC167017dG.A0O(this.cowatchSessionID)) + this.mutationSource) * 31) + AbstractC167017dG.A0O(this.mediaUniqueID)) * 31) + (this.forceToSyncLatestState ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.log)) * 31) + AbstractC167017dG.A0M(this.startWatchTimestampInMs)) * 31) + AbstractC167017dG.A0O(this.tabSelectedFromAmdPlayNow)) * 31) + this.swipeDirection) * 31) + AbstractC167017dG.A0O(this.suggestedContext)) * 31;
        Map map = this.watchedHistory;
        if (map != null) {
            i = map.hashCode();
        }
        return A07 + i;
    }

    public CowatchPlayerInternalModel(String str, int i, long j, String str2, long j2, boolean z, CowatchLoggingModel cowatchLoggingModel, Long l, String str3, int i2, String str4, Map map) {
        this.cowatchSessionID = str;
        this.mutationSource = i;
        this.mediaPositionMsPerceivedDelta = j;
        this.mediaUniqueID = str2;
        this.audioUpdateCursor = j2;
        this.forceToSyncLatestState = z;
        this.log = cowatchLoggingModel;
        this.startWatchTimestampInMs = l;
        this.tabSelectedFromAmdPlayNow = str3;
        this.swipeDirection = i2;
        this.suggestedContext = str4;
        this.watchedHistory = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchPlayerInternalModel{cowatchSessionID=");
        A1C.append(this.cowatchSessionID);
        A1C.append(",mutationSource=");
        A1C.append(this.mutationSource);
        A1C.append(",mediaPositionMsPerceivedDelta=");
        A1C.append(this.mediaPositionMsPerceivedDelta);
        A1C.append(",mediaUniqueID=");
        A1C.append(this.mediaUniqueID);
        A1C.append(",audioUpdateCursor=");
        A1C.append(this.audioUpdateCursor);
        A1C.append(",forceToSyncLatestState=");
        A1C.append(this.forceToSyncLatestState);
        A1C.append(",log=");
        A1C.append(this.log);
        A1C.append(",startWatchTimestampInMs=");
        A1C.append(this.startWatchTimestampInMs);
        A1C.append(",tabSelectedFromAmdPlayNow=");
        A1C.append(this.tabSelectedFromAmdPlayNow);
        A1C.append(",swipeDirection=");
        A1C.append(this.swipeDirection);
        A1C.append(",suggestedContext=");
        A1C.append(this.suggestedContext);
        A1C.append(",watchedHistory=");
        return JQ0.A0l(this.watchedHistory, A1C);
    }
}
