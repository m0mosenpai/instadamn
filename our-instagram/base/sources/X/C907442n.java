package X;

/* renamed from: X.42n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C907442n implements C1Dk, C1Dl {
    public final C2JM A00;
    public final Class A01;
    public final String A02;
    public final boolean A03;

    public C907442n(C2JM c2jm, Class cls, String str, boolean z) {
        C14360o3.A0B(c2jm, 2);
        this.A02 = str;
        this.A00 = c2jm;
        this.A01 = cls;
        this.A03 = z;
    }

    @Override // X.C1Dk
    public final String getSchema() {
        return null;
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk addAdditionalHttpHeader(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk addTrackedHttpResponseHeader(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final String getCallName() {
        return this.A02;
    }

    @Override // X.C1Dk
    public final String getFriendlyName() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final C2JN getQueryParams() {
        return this.A00;
    }

    @Override // X.C1Dk
    public final Class getTreeModelType() {
        return this.A01;
    }

    @Override // X.C1Dk
    public final boolean hasAcsToken() {
        return false;
    }

    @Override // X.C1Dk
    public final boolean hasOhaiConfig() {
        return false;
    }

    @Override // X.C1Dk
    public final boolean isMutation() {
        return this.A03;
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setCacheFallbackByDuration_EXPERIMENTAL(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setEnsureCacheWrite(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setFreshCacheAgeMs(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setMaxToleratedCacheAgeMs(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setNetworkTimeoutSeconds(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setRequestPurpose(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setRetryPolicy(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C1Dk
    public final boolean getEnsureCacheWrite() {
        throw C00O.createAndThrow();
    }

    @Override // X.C1Dk
    public final long getMaxToleratedCacheAgeMs() {
        throw C00O.createAndThrow();
    }

    @Override // X.C1Dk
    public final /* bridge */ /* synthetic */ C1Dk setOhaiConfig(L35 l35) {
        throw C00O.createAndThrow();
    }
}
