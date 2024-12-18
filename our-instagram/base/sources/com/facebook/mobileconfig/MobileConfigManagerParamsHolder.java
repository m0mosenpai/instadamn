package com.facebook.mobileconfig;

import X.C09270dc;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class MobileConfigManagerParamsHolder {
    public static final String SERVICE_MANAGER_NAME = "service_manager";
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native String getFamilyDeviceId();

    public native void setAdditionalParamsMapDirs(String str);

    public native void setAvoidRenamingCachesOnStart(boolean z);

    public native void setBufferDirName(String str);

    public native void setBufferPathPostfix(String str);

    public native void setConsistencyLoggingEnabled(boolean z);

    public native void setConsistencyLoggingEveryNSec(long j);

    public native void setDirectReadCacheFile(boolean z);

    public native void setEnableBlnSchema(boolean z);

    public native void setEnableClientCanary(boolean z);

    public native void setFamilyDeviceId(String str);

    public native void setInstagramFlags(boolean z, int i);

    public native void setIsMobileConfigService(boolean z);

    public native void setManagerName(String str);

    public native void setOTAAddedParamsPath(String str);

    public native void setOTAOneQueryHashPath(String str);

    public native void setQueryHashOptimization(boolean z);

    public native void setShouldIncludeStableSpecWithExposure(boolean z);

    public native void setShouldLogAccessWithoutExposures(boolean z);

    public native void setShouldSortPackageParamsMaps(boolean z);

    public native void setShouldUseOTAResource(boolean z);

    public native boolean setUniverseType(int i);

    public native boolean setUseCase(int i);

    public native void setUseFileRepo(boolean z);

    public native void setUseParamsMapV4(boolean z);

    public native void setUsePartialAndFullSyncFetch(boolean z);

    public native void setUsePlatformEpHandler(boolean z);

    static {
        C09270dc.A03("mobileconfig-jni");
    }
}
