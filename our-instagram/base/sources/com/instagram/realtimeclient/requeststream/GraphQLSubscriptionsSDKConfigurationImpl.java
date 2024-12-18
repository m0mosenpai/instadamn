package com.instagram.realtimeclient.requeststream;

import X.AbstractC111324zv;
import X.C48F;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import com.instagram.realtimeclient.requeststream.L;

/* loaded from: classes4.dex */
public class GraphQLSubscriptionsSDKConfigurationImpl implements C48F {
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final UserSession mUserSession;

    @Override // X.C48F
    public boolean getBoolForContext(String str, String str2, boolean z) {
        return z;
    }

    public double getDoubleForContext(String str, String str2, double d) {
        return d;
    }

    public double getGlobalDouble(String str, double d) {
        return d;
    }

    @Override // X.C48F
    public String getGlobalString(String str, String str2) {
        return str2;
    }

    public int getIntForContext(String str, String str2, int i) {
        return i;
    }

    @Override // X.C48F
    public String getStringForContext(String str, String str2, String str3) {
        return str3;
    }

    @Override // X.C48F
    public boolean getGlobalBool(String str, boolean z) {
        if (str.equals("graphQLSubscriptionsDisableRetryStrategy")) {
            return L.ig_gqls_sdk_config.disable_gqls_retry_strategy.getAndExpose(this.mUserSession).booleanValue();
        }
        if (!str.equals(AbstractC111324zv.A00(1647))) {
            return z;
        }
        return this.mRealtimeClientConfig.isGqlsDebugLogEnable();
    }

    @Override // X.C48F
    public int getGlobalInt(String str, int i) {
        if (str.equals(AbstractC111324zv.A00(1646))) {
            return (int) this.mRealtimeClientConfig.getGQLSSamplingWeight();
        }
        return i;
    }

    public GraphQLSubscriptionsSDKConfigurationImpl(UserSession userSession) {
        this.mUserSession = userSession;
        this.mRealtimeClientConfig = new RealtimeClientConfig(userSession);
    }
}
