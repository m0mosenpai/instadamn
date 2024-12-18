package X;

/* renamed from: X.1Dk, reason: invalid class name */
/* loaded from: classes.dex */
public interface C1Dk {
    C1Dk addAdditionalHttpHeader(String str, String str2);

    C1Dk addTrackedHttpResponseHeader(String str);

    String getCallName();

    boolean getEnsureCacheWrite();

    String getFriendlyName();

    long getMaxToleratedCacheAgeMs();

    C2JN getQueryParams();

    String getSchema();

    Class getTreeModelType();

    boolean hasAcsToken();

    boolean hasOhaiConfig();

    boolean isMutation();

    C1Dk setCacheFallbackByDuration_EXPERIMENTAL(long j);

    C1Dk setEnsureCacheWrite(boolean z);

    C1Dk setFreshCacheAgeMs(long j);

    C1Dk setMaxToleratedCacheAgeMs(long j);

    C1Dk setNetworkTimeoutSeconds(int i);

    C1Dk setOhaiConfig(L35 l35);

    C1Dk setRequestPurpose(int i);

    C1Dk setRetryPolicy(int i);
}
