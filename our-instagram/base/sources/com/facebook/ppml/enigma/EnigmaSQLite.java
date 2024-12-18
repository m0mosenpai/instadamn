package com.facebook.ppml.enigma;

import X.C09170dP;
import X.C14360o3;
import X.C2053997k;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes4.dex */
public final class EnigmaSQLite {
    public static final C2053997k Companion = new Object();
    public final HybridData mHybridData;

    public EnigmaSQLite(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native EnigmaSQLite create(String str, int i);

    public static final native HybridData initHybrid0(String str, int i);

    public final native String basePath();

    public final native List calcOffsiteFeatures(long j, int i, int i2, int i3, long j2);

    public final native List calcOffsiteUserAdFeatures(long j, int i, long j2);

    public final native List calcOffsiteUserAdFeaturesWithGuard(long j, int i, long j2);

    public final native List calcOffsiteUserFeatures(long j, int i, int i2, int i3, long j2);

    public final native List calcOffsiteUserFeaturesWithGuard(long j, int i, int i2, int i3, long j2);

    public final native List getAllAdEvents();

    public final native List getAllFAMAdEventsV2();

    public final native List getAllOffsiteEvents();

    public final native List getAllOnsiteActivities();

    public final native List getAttrWindowV2();

    public final native long getAttributedAdEventCount();

    public final native List getAttributedAdEvents();

    public final native AttributionAccuracy getAttributionAccuracy(int i);

    public final native int getCurrentDBVersion();

    public final native List getFAMAttributedAdEvents(int i);

    public final native List getFAMAttributedAdEventsV2(int i);

    public final native List getFAMFeatures(long j, int i);

    public final native FamFeature getFAMFeaturesV2(long j, String str, int i);

    public final native List getFAMOnsiteFeatures(long j, int i);

    public final native List getInstallReferrerEvent(String str, long j, long j2, int i);

    public final native List getInstallReferrerEventV2(String str, long j, long j2, int i);

    public final native List getInstallReferrerEventV3(String str, long j, long j2, String str2, int i);

    public final native long getLatestCohortOffsiteEventTimestamp();

    public final native long getLatestGeckoEventTimestamp();

    public final native List getOffsiteEvents(int i, long j);

    public final native List getOffsiteFeatures(long j, int i);

    public final native List getOnsiteFeatures(long j, long j2);

    public final native int getWCAEligibleEntryCount(String str);

    public final native boolean insertAdEvent(String str, int i, long j, int i2, int i3, int i4, String str2, long j2, List list);

    public final native boolean insertFAMAdEvent(long j, int i, String str, String str2, long j2, List list);

    public final native boolean insertFAMAdEventV2(long j, int i, String str, String str2, String str3, long j2, long j3, String str4);

    public final native boolean insertInstallReferrerEvent(String str, int i, String str2, long j, int i2);

    public final native boolean insertInstallReferrerEventV2(String str, int i, String str2, long j, String str3, int i2);

    public final native boolean insertOffsiteEvent(String str, int i, String str2, String str3, double d, String str4, long j, long j2);

    public final native boolean insertOffsiteFeatures(long j, int i, long j2, List list);

    public final native boolean insertOffsiteFeaturesV2(long j, String str, int i, String str2, long j2);

    public final native boolean insertOffsiteUserAdFeatures(long j, int i, long j2);

    public final native boolean insertOffsiteUserFeatures(long j, int i, int i2, int i3, long j2);

    public final native boolean insertOnsiteActivity(long j, int i, long j2, String str);

    public final native boolean insertOnsiteActivityDEPRECATED(long j, int i, long j2);

    public final native boolean purge(long j);

    public final native boolean purgeCohortOffsiteEvent();

    public final native boolean purgeInstallReferrer(long j, long j2);

    public final native boolean purgeInstallReferrerV2(long j, long j2);

    public final native boolean purgeInstallReferrerV3(long j, long j2, long j3);

    public final native int runAttribution(long j, int i);

    public final native int runFAMAttributionV2(long j, int i);

    public final native int runFAMAttributionV2MultiWindow(int i);

    public final native void upgradeDBFromV2ToV3();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.97k] */
    static {
        C09170dP.A0C("enigma");
    }
}
