package com.instagram.realtimeclient.requeststream;

import X.AbstractC166997dE;
import X.C0K8;
import X.C1Dk;
import X.C2JN;
import X.C47680L3n;
import X.L35;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class GraphQLSubscriptionRequestStub implements C1Dk {
    public static final String TAG = "com.instagram.realtimeclient.requeststream.GraphQLSubscriptionRequestStub";
    public final Class mJsonHelperClass;
    public final IGGraphQLSubscriptionRequestStringStub mTypedGraphQLQueryString;
    public final String mUserSubscriptionId = AbstractC166997dE.A0n();
    public final SimpleGraphqlQueryParameters mSimpleGraphqlQueryParameters = new SimpleGraphqlQueryParameters();

    /* loaded from: classes11.dex */
    public class SimpleGraphqlQueryParameters implements C2JN {
        public final Map mParameters;

        public void addParameter(String str, Object obj) {
            this.mParameters.put(str, obj);
        }

        @Override // X.C2JN
        public Map getParamsCopy() {
            return new HashMap(this.mParameters);
        }

        public SimpleGraphqlQueryParameters() {
            this.mParameters = new HashMap();
        }
    }

    public boolean getEnableAsyncQuery() {
        return false;
    }

    public boolean getEnableOfflineCaching() {
        return false;
    }

    @Override // X.C1Dk
    public boolean getEnsureCacheWrite() {
        return true;
    }

    public long getFreshCacheAgeMs() {
        return 0L;
    }

    public boolean getIgnoreNonCriticalErrors() {
        return true;
    }

    public boolean getMarkHttpRequestAsReplaySafe() {
        return false;
    }

    @Override // X.C1Dk
    public long getMaxToleratedCacheAgeMs() {
        return 0L;
    }

    public int getNetworkTimeoutSeconds() {
        return 0;
    }

    public boolean getOnlyCacheInitialNetworkResponse() {
        return false;
    }

    public boolean getParseOnClientExecutor() {
        return false;
    }

    public int getRequestPurpose() {
        return 0;
    }

    public int getRetryPolicy() {
        return 0;
    }

    @Override // X.C1Dk
    public String getSchema() {
        return null;
    }

    public boolean getTerminateAfterFreshResponse() {
        return false;
    }

    @Override // X.C1Dk
    public boolean hasAcsToken() {
        return false;
    }

    @Override // X.C1Dk
    public boolean hasOhaiConfig() {
        return false;
    }

    @Override // X.C1Dk
    public boolean isMutation() {
        return false;
    }

    @Override // X.C1Dk
    public C1Dk addAdditionalHttpHeader(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public C1Dk addAdditionalHttpRequestParam(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public C1Dk addQueryParameter(String str, Object obj) {
        this.mSimpleGraphqlQueryParameters.addParameter(str, obj);
        return this;
    }

    @Override // X.C1Dk
    public C1Dk addTrackedHttpResponseHeader(String str) {
        throw new UnsupportedOperationException();
    }

    public C1Dk enableFullConsistency() {
        throw new UnsupportedOperationException();
    }

    public Map getAdaptiveFetchClientParams() {
        return new HashMap();
    }

    public Map getAdditionalHttpHeaders() {
        return new HashMap();
    }

    public Map getAdditionalHttpRequestParams() {
        throw new UnsupportedOperationException();
    }

    public List getAnalyticTags() {
        return new ArrayList();
    }

    public long getCacheFallbackByDuration_EXPERIMENTAL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public String getCallName() {
        return this.mTypedGraphQLQueryString.getCallName();
    }

    public String getClientTraceId() {
        return this.mUserSubscriptionId;
    }

    public boolean getForceCacheOnNetworkError_EXPERIMENTAL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public String getFriendlyName() {
        return this.mTypedGraphQLQueryString.getQueryName();
    }

    public Class getJsonHelperClass() {
        return this.mJsonHelperClass;
    }

    public String getOverrideRequestURL() {
        throw new UnsupportedOperationException();
    }

    public IGGraphQLSubscriptionRequestStringStub getQuery() {
        return this.mTypedGraphQLQueryString;
    }

    @Override // X.C1Dk
    public C2JN getQueryParams() {
        return this.mSimpleGraphqlQueryParameters;
    }

    public String getSequencingKey() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public Class getTreeModelType() {
        C0K8.A0C(TAG, "This method should not be callsed.");
        return String.class;
    }

    public C1Dk setAcsToken(C47680L3n c47680L3n) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setCacheFallbackByDuration_EXPERIMENTAL(long j) {
        throw new UnsupportedOperationException();
    }

    public C1Dk setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setEnsureCacheWrite(boolean z) {
        throw new UnsupportedOperationException();
    }

    public C1Dk setForceCacheOnNetworkError_EXPERIMENTAL(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setFreshCacheAgeMs(long j) {
        throw new UnsupportedOperationException();
    }

    public C1Dk setIgnoreNonCriticalErrors(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setMaxToleratedCacheAgeMs(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setNetworkTimeoutSeconds(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setOhaiConfig(L35 l35) {
        throw new UnsupportedOperationException();
    }

    public C1Dk setRealtimeBackgroundPolicy(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setRequestPurpose(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public C1Dk setRetryPolicy(int i) {
        throw new UnsupportedOperationException();
    }

    public C1Dk setSchemaOverride(String str) {
        throw new UnsupportedOperationException();
    }

    public GraphQLSubscriptionRequestStub(IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub, Class cls) {
        this.mTypedGraphQLQueryString = iGGraphQLSubscriptionRequestStringStub;
        this.mJsonHelperClass = cls;
    }
}
