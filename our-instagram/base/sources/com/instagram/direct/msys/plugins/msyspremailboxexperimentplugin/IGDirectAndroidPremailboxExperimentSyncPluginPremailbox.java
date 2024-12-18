package com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin;

import X.AbstractC20100yh;
import X.C06090Tz;
import X.C0tH;
import X.C14360o3;
import X.C18U;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class IGDirectAndroidPremailboxExperimentSyncPluginPremailbox extends Premailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGDirectAndroidPremailboxExperimentSyncPluginPremailbox(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentCriticalPriorityForDGWRequestsEnabled(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentDatabaseNormalPriorityCongestionDetectionEnabled(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCleanUpAndRetrySchemaUpgradeSQLiteFull(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCleanUpDatabaseWhenSchemaUpgradeFail(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentInitContactSyncTraceSampleRate(long j, boolean z) {
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMailboxInitSyncTraceSampleRate(long j, boolean z) {
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessageSendTraceSampleRate(long j, boolean z) {
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloMessageTruncation(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableArmadilloThreadTruncation(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableContactTruncation(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableDanglingContactTruncation(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableMessageTruncation(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadContactTruncation(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncEnableThreadTruncation(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSecureMessageSendTraceSampleRate(long j, boolean z) {
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupMailboxEnabledCustomMethod(long j, boolean z) {
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSyncGroupSecuremailboxEnabled(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeEnabled(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskClientModeTincanActEnabled(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelRequestIdSampleRate(String str, long j, boolean z) {
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public long IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTaskLabelSendTraceSampleRate(String str, long j, boolean z) {
        return j;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentTraceOpenTextSendEnabled(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public void IGDirectAndroidPremailboxExperimentSyncPluginPremailboxExtensionsDestroy() {
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgrade(boolean z, boolean z2) {
        Object A00;
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        C0tH A002 = AbstractC20100yh.A00(36324496927502537L);
        if (z2) {
            A00 = A002.A01(userSession);
        } else {
            A00 = A002.A00(userSession);
        }
        C14360o3.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowInPlaceRetrySchemaUpgradeV2(boolean z, boolean z2) {
        Object A00;
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        C0tH A002 = AbstractC20100yh.A00(36324496927699148L);
        if (z2) {
            A00 = A002.A01(userSession);
        } else {
            A00 = A002.A00(userSession);
        }
        C14360o3.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentAllowRetrySchemaUpgrade(boolean z, boolean z2) {
        Object A00;
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        C0tH A002 = AbstractC20100yh.A00(36324496927437000L);
        if (z2) {
            A00 = A002.A01(userSession);
        } else {
            A00 = A002.A00(userSession);
        }
        C14360o3.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableCriticalStatementCache(boolean z, boolean z2) {
        Object A00;
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        C0tH A002 = AbstractC20100yh.A00(36328843434409801L);
        if (z2) {
            A00 = A002.A01(userSession);
        } else {
            A00 = A002.A00(userSession);
        }
        C14360o3.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentEnableDasmTrace(boolean z, boolean z2) {
        Object A00;
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        C0tH A002 = AbstractC20100yh.A00(36320781780657043L);
        if (z2) {
            A00 = A002.A01(userSession);
        } else {
            A00 = A002.A00(userSession);
        }
        C14360o3.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMainContextCongestionDetectionEnabled(boolean z, boolean z2) {
        return Boolean.valueOf(C18U.A06(C06090Tz.A05, this.mAppContext, 36319553420074509L)).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentMessengerCoreSyncCongestionDetectionEnabled(boolean z, boolean z2) {
        return Boolean.valueOf(C18U.A06(C06090Tz.A05, this.mAppContext, 36319553420008972L)).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentNetworkContextCongestionDetectionEnabled(boolean z, boolean z2) {
        return Boolean.valueOf(C18U.A06(C06090Tz.A05, this.mAppContext, 36319553420140046L)).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentQueueInformationLoggingFilterEnabled(boolean z, boolean z2) {
        Object A00;
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        C0tH A002 = AbstractC20100yh.A00(36319553420271120L);
        if (z2) {
            A00 = A002.A01(userSession);
        } else {
            A00 = A002.A00(userSession);
        }
        C14360o3.A09(A00);
        return ((Boolean) A00).booleanValue();
    }

    @Override // com.instagram.direct.msys.plugins.msyspremailboxexperimentplugin.Premailbox
    public boolean IGDirectAndroidPremailboxExperimentSyncImpl_MsysPremailboxExperimentSendTasksOverDgwByDefault(boolean z, boolean z2) {
        return Boolean.valueOf(C18U.A06(C06090Tz.A05, this.mAppContext, 36321679428953780L)).booleanValue();
    }
}
