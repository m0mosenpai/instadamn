package com.facebook.mobileconfig;

import X.C09270dc;
import X.C1A6;
import X.RunnableC71588Wwk;
import android.content.res.AssetManager;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class MobileConfigUsingPureJavaDependencies {
    public static final MobileConfigUsingPureJavaDependencies $redex_init_class = null;
    public final HybridData mHybridData;

    public MobileConfigUsingPureJavaDependencies(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, MobileConfigFetcher mobileConfigFetcher, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger, MobileConfigCxxPerfLogger mobileConfigCxxPerfLogger) {
        this.mHybridData = initHybrid(null, mobileConfigFetcher, z, mobileConfigCxxLogger, mobileConfigCxxPerfLogger);
    }

    private native MobileConfigManagerHolderImpl createManagerInternal(String str, String str2, String str3, String str4, int i, String str5, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map map, MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder);

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, MobileConfigFetcher mobileConfigFetcher, boolean z, MobileConfigCxxLogger mobileConfigCxxLogger, MobileConfigCxxPerfLogger mobileConfigCxxPerfLogger);

    public static native void setNetworkService(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, MobileConfigFetcher mobileConfigFetcher, boolean z);

    public MobileConfigManagerHolderImpl createManager(File file, String str, String str2, String str3, int i, String str4, AssetManager assetManager, boolean z, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map map, MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, C1A6 c1a6, ScheduledExecutorService scheduledExecutorService, boolean z2, FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder) {
        if (z2) {
            MobileConfigNativeFileRepository.registerFileRepository();
        }
        MobileConfigManagerHolderImpl createManagerInternal = createManagerInternal(file.getPath(), str, str2, str3, i, str4, assetManager, false, mobileConfigManagerParamsHolder, map, mobileConfigManagerHolderImpl, fBMobileConfigGlobalContextHolder);
        if (createManagerInternal != null && createManagerInternal.isValid()) {
            createManagerInternal.mDataDirPath = file.getAbsolutePath();
            boolean z3 = false;
            if (!str3.isEmpty()) {
                z3 = true;
            }
            createManagerInternal.mHasSessionId = z3;
            if (z2) {
                createManagerInternal.mUseFileRepo = z2;
            }
        }
        if (i == 1 && mobileConfigManagerParamsHolder.getFamilyDeviceId().equals("EMPTY_FAMILY_DEVICE_ID") && createManagerInternal != null && scheduledExecutorService != null && c1a6 != null) {
            createManagerInternal.mFamilyDeviceIdProvider = c1a6;
            createManagerInternal.mScheduledExecutor = scheduledExecutorService;
            scheduledExecutorService.schedule(new RunnableC71588Wwk(createManagerInternal, c1a6, scheduledExecutorService, 30), 100L, TimeUnit.MILLISECONDS);
        }
        return createManagerInternal;
    }

    static {
        C09270dc.A03("mobileconfig-jni");
    }
}
