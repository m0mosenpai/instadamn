package com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin;

import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public abstract class Premailbox {
    public UserSession mAppContext;

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgrade(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgradeV2(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowRetrySchemaUpgrade(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentCriticalPriorityForDGWRequestsEnabled(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentDatabaseNormalPriorityCongestionDetectionEnabled(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCleanUpAndRetrySchemaUpgradeSQLiteFull(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCleanUpDatabaseWhenSchemaUpgradeFail(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCriticalStatementCache(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableDasmTrace(boolean z, boolean z2);

    public abstract long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentInitContactSyncTraceSampleRate(long j, boolean z);

    public abstract long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMailboxInitSyncTraceSampleRate(long j, boolean z);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMainContextCongestionDetectionEnabled(boolean z, boolean z2);

    public abstract long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessageSendTraceSampleRate(long j, boolean z);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncCongestionDetectionEnabled(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloMessageTruncation(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloThreadTruncation(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableContactTruncation(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableDanglingContactTruncation(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableMessageTruncation(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadContactTruncation(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadTruncation(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentNetworkContextCongestionDetectionEnabled(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentQueueInformationLoggingFilterEnabled(boolean z, boolean z2);

    public abstract long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSecureMessageSendTraceSampleRate(long j, boolean z);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSendTasksOverDgwByDefault(boolean z, boolean z2);

    public abstract long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupMailboxEnabledCustomMethod(long j, boolean z);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupSecuremailboxEnabled(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeEnabled(boolean z, boolean z2);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeTincanActEnabled(boolean z, boolean z2);

    public abstract long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelRequestIdSampleRate(String str, long j, boolean z);

    public abstract long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelSendTraceSampleRate(String str, long j, boolean z);

    public abstract boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTraceOpenTextSendEnabled(boolean z, boolean z2);

    public abstract void IGDirectAndroidPremailboxExperimentSyncPluginPremailboxExtensionsDestroy();

    public Premailbox(UserSession userSession) {
        this.mAppContext = userSession;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgradeJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgrade(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgradeV2JNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgradeV2(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowRetrySchemaUpgradeJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowRetrySchemaUpgrade(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCriticalStatementCacheJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCriticalStatementCache(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableDasmTraceJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableDasmTrace(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMainContextCongestionDetectionEnabledJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMainContextCongestionDetectionEnabled(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncCongestionDetectionEnabledJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncCongestionDetectionEnabled(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentNetworkContextCongestionDetectionEnabledJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentNetworkContextCongestionDetectionEnabled(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentQueueInformationLoggingFilterEnabledJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentQueueInformationLoggingFilterEnabled(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSendTasksOverDgwByDefaultJNI(boolean z, boolean z2) {
        return IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSendTasksOverDgwByDefault(z, z2);
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentCriticalPriorityForDGWRequestsEnabledJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentDatabaseNormalPriorityCongestionDetectionEnabledJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCleanUpAndRetrySchemaUpgradeSQLiteFullJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCleanUpDatabaseWhenSchemaUpgradeFailJNI(boolean z, boolean z2) {
        return z;
    }

    private long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentInitContactSyncTraceSampleRateJNI(long j, boolean z) {
        return j;
    }

    private long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMailboxInitSyncTraceSampleRateJNI(long j, boolean z) {
        return j;
    }

    private long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessageSendTraceSampleRateJNI(long j, boolean z) {
        return j;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloMessageTruncationJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloThreadTruncationJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableContactTruncationJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableDanglingContactTruncationJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableMessageTruncationJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadContactTruncationJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadTruncationJNI(boolean z, boolean z2) {
        return z;
    }

    private long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSecureMessageSendTraceSampleRateJNI(long j, boolean z) {
        return j;
    }

    private long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupMailboxEnabledCustomMethodJNI(long j, boolean z) {
        return j;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupSecuremailboxEnabledJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeEnabledJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeTincanActEnabledJNI(boolean z, boolean z2) {
        return z;
    }

    private boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTraceOpenTextSendEnabledJNI(boolean z, boolean z2) {
        return z;
    }

    private long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelRequestIdSampleRateJNI(String str, long j, boolean z) {
        return j;
    }

    private long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelSendTraceSampleRateJNI(String str, long j, boolean z) {
        return j;
    }
}
