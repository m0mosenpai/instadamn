package com.facebook.mobileconfig;

import X.AbstractC225918h;
import X.AbstractC226118l;
import X.C09270dc;
import X.C0U0;
import X.C0U3;
import X.C1A6;
import X.C23091Ao;
import X.EnumC72343Xbf;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class MobileConfigManagerHolderImpl extends AbstractC225918h {
    public boolean mHasSessionId;
    public final HybridData mHybridData;
    public String mDataDirPath = "";
    public volatile MobileConfigUpdateOverridesTableCallback mOverridesTableCallback = null;
    public ScheduledExecutorService mScheduledExecutor = null;
    public C1A6 mFamilyDeviceIdProvider = null;
    public boolean mUseFileRepo = false;
    public final CountDownLatch SET_NETWORK_SERVICE_SIGNAL = new CountDownLatch(1);

    private native boolean updateConfigsInternal(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, int[] iArr);

    private native boolean usePartialAndFullSyncFetch();

    public native void clearChangeListeners();

    public native void clearCurrentUserData();

    public native void clearOverrides();

    public native boolean containsParamsHashForPackage(String str, String str2, int i);

    public native String copyManagerDirToNextTempDir();

    public native boolean deleteManagerDirs();

    public native void deleteOldUserData(int i);

    public native void deleteTableFromStorage(String str);

    @Override // X.AbstractC225918h
    public native void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    public native boolean finalizeCreation();

    public native String getAllPackageParamsMapHashInfo();

    public native String getBufferPathPostFix();

    public native String getConsistencyLoggingFlagsJSON();

    public native String getDirectoryPathForSession();

    public native String getFamilyDeviceId();

    public native String getFrameworkStatus();

    public native long getLastErrorCode();

    @Override // X.AbstractC225918h
    public native long getLastNormalUpdateTimestamp();

    public native MobileConfigMmapHandleHolder getLatestHandleHolder();

    public native long getLatestTotalParamsCount();

    public native String getNextBufferPathPostfix();

    public native MobileConfigOverridesTableHolder getOrCreateOverridesTableHolder();

    public native String getPackageParamsMapAndHashParsingOrder();

    public native String getParamsHashForPackage(String str);

    public native String getQueryHashString();

    public native String getSchemaHash();

    public native String getSchemaString();

    public native boolean isConsistencyLoggingNeeded(int i);

    public native boolean isFetchNeeded();

    public native boolean isNetworkServiceSet();

    @Override // X.AbstractC225918h
    public native boolean isValid();

    @Override // X.AbstractC225918h
    public native void logAccessWithoutExposure(String str, String str2);

    public native void logConfigs(String str, int i, Map map);

    @Override // X.AbstractC225918h
    public native void logExposure(String str, long j, String str2, String str3);

    public native void logStorageConsistency();

    @Override // X.AbstractC225918h
    public native boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener);

    public native String saveCurrentParamsMapToDisk();

    public native boolean setEpHandler(MobileConfigEmergencyPushChangeListener mobileConfigEmergencyPushChangeListener);

    public native void setFamilyDeviceId(String str);

    public native boolean setSandboxURL(String str);

    public native boolean shouldRefetchFdidAndUpdateConfigs();

    @Override // X.AbstractC225918h
    public native String syncFetchReason();

    @Override // X.AbstractC225918h
    public boolean updateConfigs(final C0U3 c0u3) {
        int i;
        if (2 - c0u3.A02.intValue() != 0) {
            i = 2;
        } else {
            i = 1;
        }
        return updateConfigsInternal(i, c0u3.A00, c0u3.A03, c0u3.A04, false, false, new MobileConfigUpdateConfigsCallback() { // from class: X.5N2
            @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
            public final void onNetworkComplete(boolean z) {
                ScheduledExecutorService scheduledExecutorService;
                C1A6 c1a6;
                MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = c0u3.A01;
                if (mobileConfigUpdateConfigsCallback != null) {
                    mobileConfigUpdateConfigsCallback.onNetworkComplete(z);
                }
                MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = MobileConfigManagerHolderImpl.this;
                if (mobileConfigManagerHolderImpl.shouldRefetchFdidAndUpdateConfigs() && (scheduledExecutorService = mobileConfigManagerHolderImpl.mScheduledExecutor) != null && (c1a6 = mobileConfigManagerHolderImpl.mFamilyDeviceIdProvider) != null) {
                    scheduledExecutorService.schedule(new RunnableC71589Wwl(mobileConfigManagerHolderImpl, c1a6, scheduledExecutorService, 30), 0L, TimeUnit.MILLISECONDS);
                }
            }
        }, null);
    }

    public native MobileConfigManagerHolderImpl updateConfigsWithParamsListAndMayCreateManager(int i);

    @Override // X.AbstractC225918h
    public native boolean updateEmergencyPushConfigs();

    public native boolean updateEmergencyPushConfigsSynchronously(int i);

    @Override // X.AbstractC225918h
    public String getDataDirPath() {
        return this.mDataDirPath;
    }

    @Override // X.AbstractC225918h
    public void logConfigs(String str, EnumC72343Xbf enumC72343Xbf, Map map) {
        logConfigs(str, enumC72343Xbf.A00, map);
    }

    @Override // X.AbstractC225918h
    public void logExposure(String str, long j, String str2) {
        logExposure(str, 0L, "", "");
    }

    static {
        C09270dc.A03("mobileconfig-jni");
    }

    public MobileConfigManagerHolderImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.AbstractC225918h
    public AbstractC226118l getLatestHandle() {
        MobileConfigMmapHandleHolder latestHandleHolder = getLatestHandleHolder();
        if (latestHandleHolder == null) {
            return null;
        }
        if (!this.mUseFileRepo) {
            return latestHandleHolder;
        }
        return new C23091Ao(latestHandleHolder.getFilename());
    }

    @Override // X.AbstractC225918h
    public C0U0 getOrCreateOverridesTable() {
        MobileConfigOverridesTableHolder orCreateOverridesTableHolder = getOrCreateOverridesTableHolder();
        if (this.mOverridesTableCallback != null) {
            orCreateOverridesTableHolder.setOverridesFileUpdatedCallback(this.mOverridesTableCallback);
        }
        return orCreateOverridesTableHolder;
    }
}
