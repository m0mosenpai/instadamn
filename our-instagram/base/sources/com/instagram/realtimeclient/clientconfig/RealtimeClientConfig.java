package com.instagram.realtimeclient.clientconfig;

import X.C14360o3;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.clientconfig.L;

/* loaded from: classes.dex */
public final class RealtimeClientConfig {
    public final int delayDisconnectMQTTMS;
    public boolean isRealtimeEventLogEnabled;
    public int logReceiveMessageSampleRate;
    public boolean mqttAnalyticsLoggingEnabled;
    public final UserSession userSession;

    public RealtimeClientConfig(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        this.delayDisconnectMQTTMS = 300000;
    }

    public final synchronized int getLogReceiveMessageSampleRate() {
        return this.logReceiveMessageSampleRate;
    }

    public final synchronized boolean getMqttAnalyticsLoggingEnabled() {
        return this.mqttAnalyticsLoggingEnabled;
    }

    public final synchronized boolean isRealtimeEventLogEnabled() {
        return this.isRealtimeEventLogEnabled;
    }

    public final synchronized void loadConfig() {
        this.mqttAnalyticsLoggingEnabled = false;
        this.logReceiveMessageSampleRate = 0;
        this.isRealtimeEventLogEnabled = L.ig_android_realtime_subscription_log.is_enabled.getAndExpose(this.userSession).booleanValue();
    }

    public final int getDelayDisconnectMQTTMS() {
        return this.delayDisconnectMQTTMS;
    }

    public final long getGQLSSamplingWeight() {
        return L.ig_android_realtime_subscription_log.sampling_weight.getAndExpose(this.userSession).longValue();
    }

    public final boolean isGqlsDebugLogEnable() {
        return L.ig_android_realtime_subscription_log.is_gqls_debug_log_enabled.getAndExpose(this.userSession).booleanValue();
    }
}
