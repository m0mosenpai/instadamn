package com.facebook.falco.fabric;

import X.C09170dP;

/* loaded from: classes.dex */
public class FFSingletonJNILogger {
    public static native void bumpHealthCounterKeyWithEventName(String str, String str2, long j);

    public static native void bumpHealthCounterKeys(String[] strArr, long j);

    public static native void bumpHealthCounterWithKeyDescriptors(long[] jArr, long j);

    public static native void bumpHealthCountersWithDebugInfo(long j, String str, String str2, String str3, String str4, long j2);

    public static native CollectionControlDecision collectionControlCheck(long j, String str, long j2, long j3, boolean z, boolean z2, String str2, String str3);

    public static native long createIdentitiesWithAppScopedUser(String str, String str2, String str3, long j, String str4, String str5, String str6, int i, long j2, String[] strArr, long j3, String str7);

    public static native long createIdentitiesWithFacebookUser(String str, String str2, String str3, long j, String str4, String str5, String str6, int i, long j2, String[] strArr, long j3, long j4);

    public static native void enableLifoUpload();

    public static native void flushHealthCounters();

    public static native String getDebugUserId();

    public static native String getFFDBToken();

    public static native void log(long j, String str, long j2, boolean z, long j3, boolean z2, long j4, long j5, String str2, String str3);

    public static native void logWithCollectionControlDecision(long j, String str, long j2, boolean z, long j3, long j4, String str2, CollectionControlDecision collectionControlDecision, String str3);

    public static native void pauseTasksForInternalUse();

    public static native long[] reserveHealthCounterKeys(String[] strArr);

    public static native void resumeTasksForInternalUse();

    public static native void setAppId(String str);

    public static native void setBaseFilePath(String str);

    public static native void setCCEnabled(boolean z);

    public static native void setClientToken(String str);

    public static native void setDebugUserId(String str);

    public static native void setFFDBToken(String str);

    public static native void setFailOpenSampling(boolean z);

    public static native void setMaxNumberOfEvents(int i);

    public static native void setMaxPayloadSize(int i);

    public static native void setOneFabricHCEnabled(boolean z);

    public static native void setSamplingEnabled(boolean z);

    public static native void setShouldRequestDebugConfig(boolean z);

    public static native void setStaggerUploadDelay(long j);

    public static native void setUserAgent(String str);

    public static native boolean shouldRequestDebugConfig();

    public static native void triggerUploadNowForInternalUse();

    /* loaded from: classes12.dex */
    public class CollectionControlDecision {
        public long collectionControlChecksum;
        public long sampleRate;
        public CollectionControlDecisionStatus status;
        public long timeInMs;
        public boolean timeIsUnadjusted;

        public CollectionControlDecision(long j, long j2, long j3, boolean z, int i) {
            this.sampleRate = j;
            this.collectionControlChecksum = j2;
            this.timeInMs = j3;
            this.timeIsUnadjusted = z;
            this.status = CollectionControlDecisionStatus.fromVal(i);
        }
    }

    /* loaded from: classes12.dex */
    public enum CollectionControlDecisionStatus {
        SUCCESS(0),
        IDENTITY_UNAVAILABLE(1),
        EVENT_CONFIG_NOT_SET(2);

        public final int mVal;

        public static CollectionControlDecisionStatus fromVal(int i) {
            if (i != 1) {
                if (i != 2) {
                    return SUCCESS;
                }
                return EVENT_CONFIG_NOT_SET;
            }
            return IDENTITY_UNAVAILABLE;
        }

        CollectionControlDecisionStatus(int i) {
            this.mVal = i;
        }
    }

    static {
        C09170dP.A0C("ffsingletonjnilogger");
    }
}
