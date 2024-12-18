package com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin;

import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public abstract class Postmailbox {
    public UserSession mAppContext;
    public AccountSession mPluginContext;

    private int IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutesJNI(int i) {
        return i;
    }

    public void IGDirectAndroidDBMetricsExperimentsMobileConfigPluginExtensionsDestroy() {
        this.mPluginContext = null;
    }

    public abstract int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRate(int i);

    public abstract int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRate(int i);

    public abstract int IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutes(int i);

    public abstract boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabled(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentDropLoggingOnBackground(boolean z, boolean z2);

    public abstract int IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRate(int i);

    public abstract boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoring(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQuery(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipSyncAppForegrounded(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSyncPerfOptimization(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentUseInMemoryAllowlist(boolean z, boolean z2);

    public Postmailbox(AccountSession accountSession, UserSession userSession) {
        this.mPluginContext = accountSession;
        this.mAppContext = userSession;
    }

    private int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRateJNI(int i) {
        return IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRate(i);
    }

    private int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRateJNI(int i) {
        return IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRate(i);
    }

    private boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentDropLoggingOnBackgroundJNI(boolean z, boolean z2) {
        return IGDirectAndroidMCAExtensionsImpl_MsysExperimentDropLoggingOnBackground(z, z2);
    }

    private int IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRateJNI(int i) {
        return 1;
    }

    private boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabledJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoringJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQueryJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipSyncAppForegroundedJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSyncPerfOptimizationJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentUseInMemoryAllowlistJNI(boolean z, boolean z2) {
        return z;
    }
}
