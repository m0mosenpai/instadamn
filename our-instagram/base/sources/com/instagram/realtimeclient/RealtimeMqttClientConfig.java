package com.instagram.realtimeclient;

import X.AbstractC11060iN;
import X.AbstractC12880la;
import X.AbstractC15660qM;
import X.AbstractC23021Ah;
import X.AbstractC47132Ef;
import X.AbstractC93754Jh;
import X.AnonymousClass001;
import X.C19280xC;
import X.C1FO;
import X.C23031Ai;
import X.C63302Sh6;
import X.InterfaceC11380iw;
import X.InterfaceC93784Jk;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.L;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RealtimeMqttClientConfig extends AbstractC93754Jh {
    public static final Class TAG = RealtimeMqttClientConfig.class;
    public final InterfaceC93784Jk mAnalyticsLogger = new InterfaceC93784Jk() { // from class: com.instagram.realtimeclient.RealtimeMqttClientConfig.1
        @Override // X.InterfaceC93784Jk
        public synchronized void reportEvent(final C63302Sh6 c63302Sh6) {
            if (RealtimeMqttClientConfig.this.mRealtimeClientConfig.getMqttAnalyticsLoggingEnabled()) {
                C19280xC A00 = C19280xC.A00(new InterfaceC11380iw() { // from class: com.instagram.realtimeclient.RealtimeMqttClientConfig.1.1
                    @Override // X.InterfaceC11380iw
                    public String getModuleName() {
                        return c63302Sh6.A04;
                    }
                }, c63302Sh6.A05);
                for (Map.Entry entry : c63302Sh6.A06.entrySet()) {
                    A00.A0C((String) entry.getKey(), (String) entry.getValue());
                }
                A00.A0B("client_nano_time", Long.valueOf(System.nanoTime()));
                AbstractC11060iN.A00(RealtimeMqttClientConfig.this.mUserSession).EHW(A00);
            }
        }
    };
    public String mCurrentlyConnectedHost;
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final UserSession mUserSession;

    @Override // X.AbstractC93754Jh
    public int getHealthStatsSamplingRate() {
        return 30;
    }

    public synchronized void setHost(String str, String str2, boolean z) {
        if (str != null) {
            if (!str.equals(this.mCurrentlyConnectedHost)) {
                this.mCurrentlyConnectedHost = str;
                if (z) {
                    this.mPreferredTier = "sandbox";
                    setPreferredSandbox(this.mCurrentlyConnectedHost);
                } else {
                    this.mPreferredTier = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    setMqttConnectionConfig(AnonymousClass001.A0g("{\"host_name_v6\":\"", this.mCurrentlyConnectedHost, "\"}"));
                    this.mFallbackHostName = str2;
                }
            }
        }
    }

    private String getEverclearSubscriptions() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inapp_notification_subscribe_comment", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_comment_mention_and_reply", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put(GraphQLSubscriptionID.VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_NAME, GraphQLSubscriptionID.VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_story_emoji_reaction", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_prompt_sticker_reply", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_fundraiser_cohost_invited", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            if (L.ig_android_reels_together.is_enabled.getAndExpose(this.mUserSession).booleanValue()) {
                jSONObject.put("inapp_notification_subscribe_reels_together", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            }
            jSONObject.put("inapp_notification_subscribe_watch_receipt", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
        } catch (JSONException unused) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject.toString();
        }
        return null;
    }

    private String getPubSubMsgTypeBlacklist() {
        return AnonymousClass001.A0R(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, ", typing_type");
    }

    @Override // X.AbstractC93754Jh
    public InterfaceC93784Jk getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    @Override // X.AbstractC93754Jh, X.InterfaceC93764Ji
    public Map getAppSpecificInfo() {
        Context A06 = this.mUserSession.deviceSession.A06();
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, AbstractC12880la.A04(A06));
        hashMap.put("capabilities", "3brTv10=");
        hashMap.put("Accept-Language", AbstractC15660qM.A00());
        hashMap.put("User-Agent", C1FO.A00());
        hashMap.put("ig_mqtt_route", "django");
        if (this.mRealtimeClientConfig.getMqttAnalyticsLoggingEnabled()) {
            hashMap.put("client_session_id", String.valueOf(System.currentTimeMillis()));
        }
        String A0R = AnonymousClass001.A0R(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, ", typing_type");
        if (!TextUtils.isEmpty(A0R)) {
            hashMap.put("pubsub_msg_type_blacklist", A0R);
        }
        String everclearSubscriptions = getEverclearSubscriptions();
        if (!TextUtils.isEmpty(everclearSubscriptions)) {
            hashMap.put("everclear_subscriptions", everclearSubscriptions);
        }
        if (AbstractC47132Ef.A00(this.mUserSession).A06()) {
            hashMap.put("presence_msys_consumption_enabled", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        return hashMap;
    }

    @Override // X.AbstractC93754Jh, X.InterfaceC93764Ji
    public String getRequestRoutingRegion() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.mUserSession);
        return (String) A00.A6t.CES(A00, C23031Ai.A8c[178]);
    }

    public RealtimeMqttClientConfig(UserSession userSession, RealtimeClientConfig realtimeClientConfig) {
        this.mUserSession = userSession;
        this.mRealtimeClientConfig = realtimeClientConfig;
    }
}
