package com.instagram.realtimeclient;

import X.AnonymousClass206;
import X.AnonymousClass207;
import X.AnonymousClass209;
import X.C05F;
import X.C11830jh;
import X.C12250kT;
import X.C14360o3;
import X.C19T;
import X.C1EJ;
import X.C20C;
import X.C4MT;
import X.C4Mn;
import X.C5N0;
import X.InterfaceC93764Ji;
import android.content.Context;
import android.util.Pair;
import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;
import com.facebook.msys.mci.ProxyProvider;
import com.instagram.common.session.UserSession;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.realtimeclient.L;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class MqttClientSelector {

    /* renamed from: com.instagram.realtimeclient.MqttClientSelector$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 {
        public final /* synthetic */ UserSession val$userSession;

        public Executor getUiExecutor(Context context) {
            return null;
        }

        public AnonymousClass1(UserSession userSession) {
            this.val$userSession = userSession;
        }

        public Integer getMsysThreadPriority(Context context) {
            if (L.android_igd_preq.enable_msys_priority_in_mqtt.getAndExpose(this.val$userSession).booleanValue()) {
                return Integer.valueOf(L.android_igd_preq.msys_priority_in_mqtt.getAndExpose(this.val$userSession).intValue());
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [X.4Mm, java.lang.Object] */
        public ProxyProvider getProxyProvider(Context context) {
            Pair pair = new Pair(1920, 4800000);
            Pair pair2 = new Pair(1280, 2400000);
            Pair pair3 = new Pair(1280, 1200000);
            ?? obj = new Object();
            obj.A02 = pair;
            obj.A00 = pair2;
            obj.A01 = pair3;
            return C4Mn.A00(context, obj);
        }
    }

    public static boolean isMqttBypassEnabled(UserSession userSession) {
        if (userSession != null && L.mqttbypass_android_ig.enabled.getAndExpose(userSession).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean isXplatMqttEnabled(UserSession userSession) {
        if (userSession != null) {
            return L.ig_android_realtime_xplat_mqtt.is_enabled.getAndExpose(userSession).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [X.1EI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Syy, java.lang.Object, X.207] */
    public AnonymousClass207 newMqttClient(InterfaceC93764Ji interfaceC93764Ji, UserSession userSession) {
        DGWClientHolder dGWClientHolder;
        if (isXplatMqttEnabled(userSession)) {
            C4MT c4mt = new C4MT(L.ig_android_realtime_xplat_mqtt.connect_timeout_seconds.getAndExpose(userSession).intValue(), L.ig_android_realtime_xplat_mqtt.keepalive_seconds.getAndExpose(userSession).intValue(), L.ig_android_realtime_xplat_mqtt.keepalive_bg_seconds.getAndExpose(userSession).intValue(), L.ig_android_realtime_xplat_mqtt.keepalive_timeout_seconds.getAndExpose(userSession).intValue(), L.ig_android_realtime_xplat_mqtt.publish_timeout_seconds.getAndExpose(userSession).intValue(), L.ig_android_realtime_xplat_mqtt.preemptive_publish_timeout_seconds.getAndExpose(userSession).intValue(), L.ig4a_mqtt_fallback.num_failures_for_fallback.getAndExpose(userSession).intValue(), L.ig_android_realtime_xplat_mqtt.personalization_enabled.getAndExpose(userSession).booleanValue(), L.ig_android_realtime_xplat_mqtt.connect_personalization_enabled.getAndExpose(userSession).booleanValue(), L.ig_android_realtime_xplat_mqtt.qpl_enabled.getAndExpose(userSession).booleanValue());
            if (isMqttBypassEnabled(userSession)) {
                dGWClientHolder = DGWClientHolder.getInstance(userSession);
            } else {
                dGWClientHolder = null;
            }
            C1EJ.A01(new Object());
            C1EJ.A00();
            MCPPluginsRegistryIntegration.nativePreregisterMCPPluginsRegistry();
            String A02 = C11830jh.A04.A01(userSession).A02(C19T.A24);
            C5N0 mobileConfigData = getMobileConfigData(userSession);
            C14360o3.A0B(userSession, 1);
            return new AnonymousClass206(interfaceC93764Ji, c4mt, mobileConfigData, new C12250kT(null, userSession, "Mqttbypass"), dGWClientHolder, new AnonymousClass1(userSession), A02);
        }
        ?? obj = new Object();
        obj.A0G = C05F.A0N;
        obj.A0F = null;
        obj.A04 = interfaceC93764Ji;
        return obj;
    }

    public static C5N0 getMobileConfigData(UserSession userSession) {
        if (!isMqttBypassEnabled(userSession)) {
            return null;
        }
        return new C5N0(L.mqttbypass_android_ig.enabled_topics.getAndExpose(userSession), L.mqttbypass_android_ig.enabled_subscribe_topics.getAndExpose(userSession), L.mqttbypass_android_ig.immediate_retry_count.getAndExpose(userSession).intValue(), L.mqttbypass_android_ig.reconnect_timeout_in_seconds.getAndExpose(userSession).intValue(), L.mqttbypass_android_ig.max_pending_publish_queue_size.getAndExpose(userSession).intValue(), L.mqttbypass_android_ig.max_pending_publish_duration_in_seconds.getAndExpose(userSession).intValue(), L.mqttbypass_android_ig.restart_on_drain_enabled.getAndExpose(userSession).booleanValue(), L.mqttbypass_android_ig.disable_reconnects_in_background.getAndExpose(userSession).booleanValue(), L.mqttbypass_android_ig.app_jobs_enabled.getAndExpose(userSession).booleanValue(), L.mqttbypass_android_ig.block_reconnects_with_app_jobs.getAndExpose(userSession).booleanValue(), L.mqttbypass_android_ig.block_connects_until_first_publish.getAndExpose(userSession).booleanValue());
    }

    public static void maybePreloadNativeDependencies(UserSession userSession) {
        if (isXplatMqttEnabled(userSession) && L.ig_android_realtime_xplat_mqtt.preload_native_libs_enabled.getAndExpose(userSession).booleanValue()) {
            AnonymousClass209 anonymousClass209 = AnonymousClass206.A0G;
            anonymousClass209.A00();
            anonymousClass209.A02(C20C.A00);
        }
    }
}
