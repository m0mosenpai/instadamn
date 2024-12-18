package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

/* renamed from: X.4Jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93754Jh implements InterfaceC93764Ji {
    public final InterfaceC93784Jk mEmptyAnalyticsLogger = new InterfaceC93784Jk() { // from class: X.4Jj
        @Override // X.InterfaceC93784Jk
        public final void reportEvent(C63302Sh6 c63302Sh6) {
        }
    };
    public volatile String mMqttConnectionConfig = "{}";
    public volatile String mPreferredTier = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public volatile String mPreferredSandbox = "";
    public volatile String mFallbackHostName = null;

    public SHW earlyDataSslSocketFactoryAdapter() {
        return null;
    }

    public abstract InterfaceC93784Jk getAnalyticsLogger();

    @Override // X.InterfaceC93764Ji
    public abstract Map getAppSpecificInfo();

    public String getCustomAnalyticsEventNameSuffix() {
        return null;
    }

    public long getEndpointCapabilities() {
        return 0L;
    }

    public abstract int getHealthStatsSamplingRate();

    @Override // X.InterfaceC93764Ji
    public abstract String getRequestRoutingRegion();

    public String getFallbackHostName() {
        return this.mFallbackHostName;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Tj1] */
    @Override // X.InterfaceC93764Ji
    public InterfaceC65369Tj1 getKeepaliveParams() {
        return new Object();
    }

    public String getMqttConnectionConfig() {
        return this.mMqttConnectionConfig;
    }

    public String getMqttConnectionPreferredSandbox() {
        return this.mPreferredSandbox;
    }

    public String getMqttConnectionPreferredTier() {
        return this.mPreferredTier;
    }

    public void setPreferredTier(String str) {
        if (!"sandbox".equals(str) && !GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(str)) {
            throw new RuntimeException("Preferred tier must be either 'sandbox' or 'default'");
        }
        this.mPreferredTier = str;
    }

    public void setMqttConnectionConfig(String str) {
        str.getClass();
        this.mMqttConnectionConfig = str;
    }

    public void setPreferredSandbox(String str) {
        str.getClass();
        this.mPreferredSandbox = str;
    }

    public void setFallbackHostName(String str) {
        this.mFallbackHostName = str;
    }
}
