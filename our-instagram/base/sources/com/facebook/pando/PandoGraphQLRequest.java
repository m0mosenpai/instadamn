package com.facebook.pando;

import X.C09170dP;
import X.C14360o3;
import X.C16920sk;
import X.C16930sl;
import X.C1Dk;
import X.C1Dl;
import X.C2JN;
import X.C2JQ;
import X.C47680L3n;
import X.C70431WVj;
import X.EnumC61150RgB;
import X.InterfaceC40501uJ;
import X.L35;
import X.X7S;
import com.facebook.jni.HybridData;
import com.facebook.nativeutil.NativeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class PandoGraphQLRequest implements C1Dk, C1Dl {
    public static final C2JQ Companion = new Object();
    public boolean _hasAcsToken;
    public boolean _hasOhaiConfig;
    public final int injectionCapabilities;
    public final boolean isMutation;
    public final HybridData mHybridData;
    public final Map params;
    public final String queryName;
    public final String rootCallVariable;
    public final String rootFieldName;
    public String schemaName;
    public final Map transientParams;

    private final native void addAdditionalHttpHeaderNative(String str, String str2);

    private final native void addAdditionalHttpRequestParamNative(String str, String str2);

    private final native void addTrackedHttpResponseHeaderNative(String str);

    private final native int getTimeoutSeconds();

    private final native boolean hasRealtimeSubscriptionInfo();

    private final native HybridData initHybridData(String str, String str2, String str3, String str4, NativeMap nativeMap, NativeMap nativeMap2, Class cls, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, List list, String str5);

    private final native void removeAdditionalHttpHeaderNative(String str);

    private final native void setAcsTokenNative(String str, String str2, String str3, String str4, String str5, String str6);

    private final native void setCacheFallbackByDuration_EXPERIMENTALNative(long j);

    private final native void setCacheTtlMs(long j);

    private final native void setEnableCacheReadWriteOnCallerThreadNative(boolean z);

    private final native void setEnsureCacheWriteNative(boolean z);

    private final native void setForceCacheOnNetworkError_EXPERIMENTALNative(boolean z);

    private final native void setFreshCacheTtlMs(long j);

    private final native void setIsPeakNative(boolean z);

    private final native void setOhaiConfigNative(int i, String str, int i2, int i3, int i4);

    private final native void setOptimisticUpdater(TreeUpdaterJNI treeUpdaterJNI);

    private final native void setPublishMode(int i);

    private final native void setQueryVariablesNative(NativeMap nativeMap, NativeMap nativeMap2);

    private final native void setRealtimeBackgroundPolicyNative(int i);

    private final native void setRequestPurposeNative(int i);

    private final native void setTimeoutSeconds(int i);

    public native long getCacheFallbackByDuration_EXPERIMENTAL();

    @Override // X.C1Dk
    public native boolean getEnsureCacheWrite();

    public native boolean getForceCacheOnNetworkError_EXPERIMENTAL();

    public native long getFreshCacheAgeMs();

    @Override // X.C1Dk
    public native long getMaxToleratedCacheAgeMs();

    public native int getRequestPurpose();

    public native int getRetryPolicy();

    public /* bridge */ /* synthetic */ C1Dk setAcsToken(C47680L3n c47680L3n) {
        this._hasAcsToken = true;
        setAcsTokenNative(c47680L3n.A03, c47680L3n.A01, c47680L3n.A00, c47680L3n.A02, c47680L3n.A04, c47680L3n.A05);
        return this;
    }

    public final native void setAdditionalCacheQueryKey(String str);

    public /* bridge */ /* synthetic */ C1Dk setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(boolean z) {
        setEnableCacheReadWriteOnCallerThreadNative(true);
        return this;
    }

    public final native void setLocale(String str);

    public final native void setManuallyManageActiveFieldUpdates(boolean z);

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setNetworkTimeoutSeconds(int i) {
        setTimeoutSeconds(Math.max(i, 0));
        return this;
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setOhaiConfig(L35 l35) {
        this._hasOhaiConfig = true;
        setOhaiConfigNative(l35.A03, l35.A04, l35.A02, l35.A01, l35.A00);
        return this;
    }

    public final native void setPerformOptimisticMerge(boolean z);

    public final PandoGraphQLRequest setPublishMode(EnumC61150RgB enumC61150RgB) {
        C14360o3.A0B(enumC61150RgB, 0);
        setPublishMode(enumC61150RgB.A00);
        return this;
    }

    public /* bridge */ /* synthetic */ C1Dk setRealtimeBackgroundPolicy(int i) {
        setRealtimeBackgroundPolicyNative(2);
        return this;
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setRetryPolicy(int i) {
        setRetryPolicyNative(1);
        return this;
    }

    public final native void setRetryPolicyNative(int i);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2JQ] */
    static {
        C09170dP.A0C("pando-graphql-jni");
    }

    public PandoGraphQLRequest(InterfaceC40501uJ interfaceC40501uJ, String str, Map map, Map map2, Class cls, boolean z, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, int i, String str2, String str3, List list) {
        String str4;
        List list2 = list;
        Map map3 = map2;
        Map map4 = map;
        C14360o3.A0B(str, 2);
        this.isMutation = z;
        this.injectionCapabilities = i;
        this.rootCallVariable = str2;
        this.rootFieldName = str3;
        String clientDocIdForQuery = interfaceC40501uJ.clientDocIdForQuery(str);
        if (clientDocIdForQuery == null) {
            str4 = interfaceC40501uJ.persistIdForQuery(str);
        } else {
            str4 = null;
        }
        this.queryName = str;
        this.schemaName = interfaceC40501uJ.schemaForQuery(str);
        if (list != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((PandoGraphQLConnectionConfig) it.next()).setGeneratedPaginationQueryClientDocId(interfaceC40501uJ);
            }
        }
        this.params = map4;
        this.transientParams = map3;
        str4 = str4 == null ? "" : str4;
        clientDocIdForQuery = clientDocIdForQuery == null ? "" : clientDocIdForQuery;
        String str5 = this.rootFieldName;
        str5 = str5 == null ? "" : str5;
        NativeMap nativeMap = NativeMap.$redex_init_class;
        if (map == null) {
            map4 = C16920sk.A00;
            C14360o3.A0C(map4, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        NativeMap nativeMap2 = new NativeMap(map4);
        if (map2 == null) {
            map3 = C16920sk.A00;
            C14360o3.A0C(map3, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        NativeMap nativeMap3 = new NativeMap(map3);
        list2 = list == null ? C16930sl.A00 : list2;
        String str6 = this.schemaName;
        this.mHybridData = initHybridData(str4, clientDocIdForQuery, str, str5, nativeMap2, nativeMap3, cls, pandoRealtimeInfoJNI, list2, str6 == null ? "" : str6);
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk addAdditionalHttpHeader(String str, String str2) {
        if (str2 != null) {
            addAdditionalHttpHeaderNative(str, str2);
            return this;
        }
        removeAdditionalHttpHeaderNative(str);
        return this;
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk addTrackedHttpResponseHeader(String str) {
        addTrackedHttpResponseHeaderNative("X-IG-Request-Elapsed-Time-MS");
        return this;
    }

    @Override // X.C1Dk
    public String getCallName() {
        return this.queryName;
    }

    @Override // X.C1Dk
    public String getFriendlyName() {
        return this.queryName;
    }

    @Override // X.C1Dk
    public C2JN getQueryParams() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public String getSchema() {
        return this.schemaName;
    }

    @Override // X.C1Dk
    public Class getTreeModelType() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public boolean hasAcsToken() {
        return this._hasAcsToken;
    }

    @Override // X.C1Dk
    public boolean hasOhaiConfig() {
        return this._hasOhaiConfig;
    }

    @Override // X.C1Dk
    public boolean isMutation() {
        return this.isMutation;
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setCacheFallbackByDuration_EXPERIMENTAL(long j) {
        setCacheFallbackByDuration_EXPERIMENTALNative(4000L);
        return this;
    }

    public /* bridge */ /* synthetic */ C1Dl setOptimisticBuilder(X7S x7s) {
        setOptimisticUpdater(new TreeUpdaterJNI("XDTUserDict", ((C70431WVj) x7s).A00));
        return this;
    }

    public final void setQueryVariables(Map map, Map map2) {
        NativeMap nativeMap = NativeMap.$redex_init_class;
        if (map == null) {
            map = C16920sk.A00;
            C14360o3.A0C(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        NativeMap nativeMap2 = new NativeMap(map);
        if (map2 == null) {
            map2 = C16920sk.A00;
            C14360o3.A0C(map2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        setQueryVariablesNative(nativeMap2, new NativeMap(map2));
    }

    public PandoGraphQLRequest addAdditionalHttpRequestParam(String str, String str2) {
        addAdditionalHttpRequestParamNative("ig_legacy_dict_validate_null", "true");
        return this;
    }

    public final boolean isSubscription() {
        return hasRealtimeSubscriptionInfo();
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setEnsureCacheWrite(boolean z) {
        setEnsureCacheWriteNative(z);
        return this;
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setFreshCacheAgeMs(long j) {
        setFreshCacheTtlMs(j);
        return this;
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setMaxToleratedCacheAgeMs(long j) {
        setCacheTtlMs(j);
        return this;
    }

    @Override // X.C1Dk
    public /* bridge */ /* synthetic */ C1Dk setRequestPurpose(int i) {
        setRequestPurposeNative(i);
        return this;
    }

    @Override // X.C1Dk
    public PandoGraphQLRequest setFreshCacheAgeMs(long j) {
        setFreshCacheTtlMs(j);
        return this;
    }

    @Override // X.C1Dk
    public PandoGraphQLRequest setMaxToleratedCacheAgeMs(long j) {
        setCacheTtlMs(j);
        return this;
    }
}
