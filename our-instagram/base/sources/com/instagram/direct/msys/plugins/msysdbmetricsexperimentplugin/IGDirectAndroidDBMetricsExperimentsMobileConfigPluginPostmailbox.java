package com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin;

import X.AbstractC20100yh;
import X.C0tH;
import X.C14360o3;
import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class IGDirectAndroidDBMetricsExperimentsMobileConfigPluginPostmailbox extends Postmailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGDirectAndroidDBMetricsExperimentsMobileConfigPluginPostmailbox(AccountSession accountSession, UserSession userSession) {
        super(accountSession, userSession);
        C14360o3.A0B(accountSession, 1);
        C14360o3.A0B(userSession, 2);
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStaledSyncThresholdMinutes(int i) {
        return i;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentAvoidStalledSyncEnabled(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCAMailboxDatabaseDropSamplingRate(int i) {
        return 1;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentMCATrafficShouldEnableMailboxApiExecutionMonitoring(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipRedundantThreadListQuery(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSkipSyncAppForegrounded(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentSyncPerfOptimization(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentUseInMemoryAllowlist(boolean z, boolean z2) {
        return z;
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetDBMetricSamplingRate(int i) {
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        return (int) ((Number) AbstractC20100yh.A00(36599430668946977L).A01(userSession)).longValue();
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public int IGDirectAndroidDBMetricsLoggerExperimentExtensionsImpl_MsysDBMetricsLoggerExperimentGetTableMetricSamplingRate(int i) {
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        return (int) ((Number) AbstractC20100yh.A00(36599430669012514L).A01(userSession)).longValue();
    }

    @Override // com.instagram.direct.msys.plugins.msysdbmetricsexperimentplugin.Postmailbox
    public boolean IGDirectAndroidMCAExtensionsImpl_MsysExperimentDropLoggingOnBackground(boolean z, boolean z2) {
        Object A00;
        UserSession userSession = this.mAppContext;
        C14360o3.A06(userSession);
        C0tH A002 = AbstractC20100yh.A00(36324900654297680L);
        if (z2) {
            A00 = A002.A01(userSession);
        } else {
            A00 = A002.A00(userSession);
        }
        C14360o3.A09(A00);
        return ((Boolean) A00).booleanValue();
    }
}
