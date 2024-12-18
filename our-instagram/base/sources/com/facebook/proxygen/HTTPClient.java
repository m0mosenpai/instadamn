package com.facebook.proxygen;

import X.AbstractC166987dD;
import X.AbstractC25229BEm;
import X.AbstractC58320PtC;
import X.AnonymousClass001;
import X.MSZ;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class HTTPClient implements NativeHandle {
    public String mAllowProxyDomains;
    public final long mAppBuildTime;
    public final boolean mAttemptEarlyDataInQuicPreconnect;
    public final boolean mBidirectionalStreamingEnabled;
    public String mBypassProxyDomains;
    public final String mCdnOverride;
    public final boolean mCloseConnectionOnDnsChange;
    public final int mCloseStaleSessionsDelayMs;
    public boolean mClosed;
    public final Executor mDNSResolverExecutor;
    public final boolean mDisableCircularLogSink;
    public final boolean mDnsCacheEnabled;
    public final String mDnsCacheTtlEnabledHosts;
    public final int mDnsCacheTtlSecs;
    public final int mDnsMaxRetries;
    public final boolean mDoNotForceShutdownClosePendingSessions;
    public final boolean mEnableClientConnectionUuidHeader;
    public final boolean mEnableDzCompression;
    public final boolean mEnableHTTP2;
    public final boolean mEnableLigerPreconnect;
    public final boolean mEnableSimplePreconnectForReinit;
    public final boolean mEnableTransportCallbacks;
    public final boolean mEnableZstd;
    public final EventBase mEventBase;
    public final boolean mFizzHTTP2StaticOverride;
    public final FizzSettings mFizzSettings;
    public final String mH2PubSubHostnames;
    public final String mInitialNetworkType;
    public boolean mInitialized;
    public final boolean mInlinePersistenceLoading;
    public final boolean mIsHTTPSEnforced;
    public final boolean mIsSSLSessionCacheEnabled;
    public boolean mIsSandbox;
    public final boolean mLargerFlowControlWindow;
    public final boolean mLeaveClosePendingQuicSessionsAlone;
    public final int mMaxIdleHTTP2Sessions;
    public NetworkStatusMonitor mNetworkStatusMonitor;
    public final Executor mPersistentCachesExecutor;
    public final PersistentSSLCacheSettings mPersistentDNSCacheSettings;
    public final PersistentSSLCacheSettings mPersistentSSLCacheSettings;
    public final String mPreConnects;
    public final boolean mPreemptBeforeCloseStaleSessions;
    public String mProxyClientAddress;
    public boolean mProxyFallbackEnabled;
    public String mProxyHost;
    public String mProxyPassword;
    public int mProxyPort;
    public String mProxyUsername;
    public final FizzSettings mQuicFizzSettings;
    public final QuicSettings mQuicSettings;
    public final long mQuicVersion;
    public String mReInitReason;
    public boolean mReInitToRefreshSettings;
    public final boolean mResetDNSResolverAsynchronously;
    public final RootCACallbacks mRootCACallbacks;
    public final SSLKeyMaterialCallback mSSLKeyMaterialCallback;
    public String mSecureProxyHost;
    public String mSecureProxyPassword;
    public int mSecureProxyPort;
    public String mSecureProxyUsername;
    public final int mSessionFlowControlWindow;
    public final int mSessionManagerConnectTimeoutExtra;
    public long mSettings;
    public final boolean mShouldOverrideFizzHTTP2Static;
    public final boolean mShouldOverrideTlsHTTP2;
    public final boolean mStaleAnswersEnabled;
    public final int mStreamFlowControlWindow;
    public final boolean mSupportH2PubSub;
    public final int mTcpNotsentLowat;
    public final boolean mTlsHTTP2Override;
    public final boolean mTransactionIdleTimeoutDisabled;
    public final boolean mUseLoadBalancing;
    public final boolean mUseMNSCertificateVerifier;
    public String mUserAgent;
    public byte[][] mUserInstalledCertificates;

    /* loaded from: classes10.dex */
    public class Builder {
        public String mAllowProxyDomains;
        public boolean mBidirectionalStreamingEnabled;
        public String mBypassProxyDomains;
        public boolean mClosed;
        public Executor mDNSResolverExecutor;
        public EventBase mEventBase;
        public FizzSettings mFizzSettings;
        public String mInitialNetworkType;
        public boolean mInitialized;
        public NetworkStatusMonitor mNetworkStatusMonitor;
        public Executor mPersistentCachesExecutor;
        public PersistentSSLCacheSettings mPersistentDNSCacheSettings;
        public PersistentSSLCacheSettings mPersistentSSLCacheSettings;
        public String mPreConnects;
        public String mProxyClientAddress;
        public boolean mProxyFallbackEnabled;
        public int mProxyPort;
        public FizzSettings mQuicFizzSettings;
        public QuicSettings mQuicSettings;
        public boolean mReInitToRefreshSettings;
        public RootCACallbacks mRootCACallbacks;
        public SSLKeyMaterialCallback mSSLKeyMaterialCallback;
        public int mSecureProxyPort;
        public long mSettings;
        public UnexpectedErrorReporter mUnexpectedErrorReporter;
        public String mUserAgent;
        public byte[][] mUserInstalledCertificates;
        public boolean mIsSSLSessionCacheEnabled = true;
        public int mMaxIdleHTTP2Sessions = 2;
        public boolean mIsHTTPSEnforced = false;
        public boolean mIsSandbox = false;
        public String mProxyHost = "";
        public String mProxyUsername = "";
        public String mProxyPassword = "";
        public String mSecureProxyHost = "";
        public String mSecureProxyUsername = "";
        public String mSecureProxyPassword = "";
        public long mAppBuildTime = 0;
        public Boolean mUseMNSCertificateVerifier = false;
        public boolean mDnsCacheEnabled = false;
        public boolean mStaleAnswersEnabled = true;
        public int mDnsCacheTtlSecs = 0;
        public String mDnsCacheTtlEnabledHosts = "";
        public int mDnsMaxRetries = 4;
        public boolean mCloseConnectionOnDnsChange = false;
        public boolean mDoNotForceShutdownClosePendingSessions = false;
        public boolean mLeaveClosePendingQuicSessionsAlone = false;
        public int mCloseStaleSessionsDelayMs = 0;
        public boolean mPreemptBeforeCloseStaleSessions = false;
        public boolean mDisableCircularLogSink = false;
        public boolean mEnableClientConnectionUuidHeader = false;
        public boolean mTransactionIdleTimeoutDisabled = false;
        public boolean mEnableTransportCallbacks = false;
        public boolean mLargerFlowControlWindow = false;
        public int mSessionFlowControlWindow = 65535;
        public int mStreamFlowControlWindow = 65535;
        public boolean mUseLoadBalancing = false;
        public boolean mEnableLigerPreconnect = false;
        public boolean mEnableSimplePreconnectForReinit = false;
        public boolean mEnableHTTP2 = true;
        public long mQuicVersion = -87117822;
        public boolean mShouldOverrideTlsHTTP2 = false;
        public boolean mTlsHTTP2Override = true;
        public boolean mShouldOverrideFizzHTTP2Static = false;
        public boolean mFizzHTTP2StaticOverride = true;
        public boolean mSupportH2PubSub = false;
        public String mH2PubSubHostnames = "";
        public boolean mAttemptEarlyDataInQuicPreconnect = false;
        public String mCdnOverride = null;
        public boolean mInlinePersistenceLoading = true;
        public boolean mResetDNSResolverAsynchronously = false;
        public boolean mEnableZstd = false;
        public boolean mEnableDzCompression = false;
        public int mTcpNotsentLowat = -1;
        public int mSessionManagerConnectTimeoutExtra = 0;

        public Builder setCloseStaleSessionsDelayMs(int i) {
            if (isValidOrReportUnexpectedError("closeStaleSessionsDelayMs", i, 0L, 30000L)) {
                this.mCloseStaleSessionsDelayMs = i;
            }
            return this;
        }

        public Builder setDnsCacheTtlSecs(int i) {
            if (i == 0 || isValidOrReportUnexpectedError("dnsCacheTtlSecs", i, 30L, 604800L)) {
                this.mDnsCacheTtlSecs = i;
            }
            return this;
        }

        public Builder setDnsMaxRetries(int i) {
            if (isValidOrReportUnexpectedError("dnsMaxRetries", i, 0L, 4L)) {
                this.mDnsMaxRetries = i;
            }
            return this;
        }

        public Builder setFlowControl(boolean z, int i, int i2) {
            if (isValidOrReportUnexpectedError("sessionFlowControlWindowSize", i, 65535L, 2147483647L) && isValidOrReportUnexpectedError("streamFlowControlWindowSize", i2, 65535L, 2147483647L)) {
                this.mLargerFlowControlWindow = z;
                this.mSessionFlowControlWindow = i;
                this.mStreamFlowControlWindow = i2;
            }
            return this;
        }

        public Builder setMaxIdleHTTP2Sessions(int i) {
            if (isValidOrReportUnexpectedError("maxIdleHTTP2Sessions", i, 1L, 2L)) {
                this.mMaxIdleHTTP2Sessions = i;
            }
            return this;
        }

        public Builder setSessionManagerConnectTimeoutExtra(int i) {
            if (isValidOrReportUnexpectedError("sessionManagerConnectTimeoutExtra", i, 0L, 2000L)) {
                this.mSessionManagerConnectTimeoutExtra = i;
            }
            return this;
        }

        public Builder setTcpNotsentLowat(int i) {
            if (isValidOrReportUnexpectedError("tcpNotsentLowat", i, OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED, OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED)) {
                this.mTcpNotsentLowat = i;
            }
            return this;
        }

        private boolean isValidOrReportUnexpectedError(String str, long j, long j2, long j3) {
            if (j >= j2 && j <= j3) {
                return true;
            }
            UnexpectedErrorReporter unexpectedErrorReporter = this.mUnexpectedErrorReporter;
            if (unexpectedErrorReporter != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Setting: ");
                A1C.append(str);
                A1C.append(" value:");
                A1C.append(j);
                A1C.append(" min: ");
                A1C.append(j2);
                unexpectedErrorReporter.report("Invalid Liger Android setting input", AbstractC58320PtC.A13(" max: ", A1C, j3));
                return false;
            }
            return false;
        }

        public HTTPClient build() {
            if (this.mRootCACallbacks != null) {
                return new HTTPClient(this);
            }
            throw AbstractC166987dD.A15("You must call setRootCACallbacks().");
        }

        public Builder setFizzHTTP2StaticOverride(boolean z, boolean z2) {
            this.mShouldOverrideFizzHTTP2Static = z;
            this.mFizzHTTP2StaticOverride = z2;
            return this;
        }

        public Builder setIsSandbox(boolean z) {
            if (this.mIsSandbox != z) {
                this.mReInitToRefreshSettings = true;
                this.mIsSandbox = z;
            }
            return this;
        }

        public Builder setProxy(String str, int i, String str2, String str3) {
            if (HTTPClient.stringEquals(str, this.mProxyHost) && i == this.mProxyPort && HTTPClient.stringEquals(str2, this.mProxyUsername) && HTTPClient.stringEquals(str3, this.mProxyPassword)) {
                return this;
            }
            this.mProxyHost = str;
            this.mProxyPort = i;
            this.mProxyUsername = str2;
            this.mProxyPassword = str3;
            this.mReInitToRefreshSettings = true;
            return this;
        }

        public Builder setProxyDomainsRules(String str, String str2) {
            if (HTTPClient.stringEquals(str, this.mAllowProxyDomains) && HTTPClient.stringEquals(str2, this.mBypassProxyDomains)) {
                return this;
            }
            this.mAllowProxyDomains = str;
            this.mBypassProxyDomains = str2;
            this.mReInitToRefreshSettings = true;
            return this;
        }

        public Builder setSecureProxy(String str, int i, String str2, String str3) {
            if (HTTPClient.stringEquals(str, this.mSecureProxyHost) && i == this.mSecureProxyPort && HTTPClient.stringEquals(str2, this.mSecureProxyUsername) && HTTPClient.stringEquals(str3, this.mSecureProxyPassword)) {
                return this;
            }
            this.mSecureProxyHost = str;
            this.mSecureProxyPort = i;
            this.mSecureProxyUsername = str2;
            this.mSecureProxyPassword = str3;
            this.mReInitToRefreshSettings = true;
            return this;
        }

        public Builder setTlsHTTP2Override(boolean z, boolean z2) {
            this.mShouldOverrideTlsHTTP2 = z;
            this.mTlsHTTP2Override = z2;
            return this;
        }

        public Builder(UnexpectedErrorReporter unexpectedErrorReporter) {
            this.mUnexpectedErrorReporter = unexpectedErrorReporter;
        }

        public Builder setAppBuildTime(long j) {
            this.mAppBuildTime = j;
            return this;
        }

        public Builder setAttemptEarlyDataInQuicPreconnect(boolean z) {
            this.mAttemptEarlyDataInQuicPreconnect = z;
            return this;
        }

        public Builder setBidirectionalStreamingEnabled(boolean z) {
            this.mBidirectionalStreamingEnabled = z;
            return this;
        }

        public Builder setCdnOverride(String str) {
            this.mCdnOverride = str;
            return this;
        }

        public Builder setCloseConnectionOnDnsChange(boolean z) {
            this.mCloseConnectionOnDnsChange = z;
            return this;
        }

        public Builder setDNSCacheEnabled(boolean z) {
            this.mDnsCacheEnabled = z;
            return this;
        }

        public Builder setDNSResolverExecutor(Executor executor) {
            this.mDNSResolverExecutor = executor;
            return this;
        }

        public Builder setDisableCircularLogSink(boolean z) {
            this.mDisableCircularLogSink = z;
            return this;
        }

        public Builder setDisableTransactionIdleTimeout(boolean z) {
            this.mTransactionIdleTimeoutDisabled = z;
            return this;
        }

        public Builder setDnsCacheTtlEnabledHosts(String str) {
            this.mDnsCacheTtlEnabledHosts = str;
            return this;
        }

        public Builder setDoNotForceShutdownClosePendingSessions(boolean z) {
            this.mDoNotForceShutdownClosePendingSessions = z;
            return this;
        }

        public Builder setEnableClientConnectionUuidHeader(boolean z) {
            this.mEnableClientConnectionUuidHeader = z;
            return this;
        }

        public Builder setEnableDzCompression(boolean z) {
            this.mEnableDzCompression = z;
            return this;
        }

        public Builder setEnableHTTP2(boolean z) {
            this.mEnableHTTP2 = z;
            return this;
        }

        public Builder setEnableLigerPreconnect(boolean z) {
            this.mEnableLigerPreconnect = z;
            return this;
        }

        public Builder setEnableSimplePreconnectForReinit(boolean z) {
            this.mEnableSimplePreconnectForReinit = z;
            return this;
        }

        public Builder setEnableZstd(boolean z) {
            this.mEnableZstd = z;
            return this;
        }

        public Builder setEventBase(EventBase eventBase) {
            this.mEventBase = eventBase;
            return this;
        }

        public Builder setFizzSettings(FizzSettings fizzSettings) {
            this.mFizzSettings = fizzSettings;
            return this;
        }

        public Builder setH2PubSubHostnames(String str) {
            this.mH2PubSubHostnames = str;
            return this;
        }

        public Builder setHTTPSEnforced(boolean z) {
            this.mIsHTTPSEnforced = z;
            return this;
        }

        public Builder setInitialNetworkType(String str) {
            this.mInitialNetworkType = str;
            return this;
        }

        public Builder setInlinePersistenceLoading(boolean z) {
            this.mInlinePersistenceLoading = z;
            return this;
        }

        public Builder setLeaveClosePendingQuicSessionsAlone(boolean z) {
            this.mLeaveClosePendingQuicSessionsAlone = z;
            return this;
        }

        public Builder setLoadBalancing(boolean z) {
            this.mUseLoadBalancing = z;
            return this;
        }

        public Builder setNetworkStatusMonitor(NetworkStatusMonitor networkStatusMonitor) {
            this.mNetworkStatusMonitor = networkStatusMonitor;
            return this;
        }

        public Builder setPersistentCachesExecutor(Executor executor) {
            this.mPersistentCachesExecutor = executor;
            return this;
        }

        public Builder setPersistentDNSCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
            this.mPersistentDNSCacheSettings = persistentSSLCacheSettings;
            return this;
        }

        public Builder setPersistentSSLCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
            this.mPersistentSSLCacheSettings = persistentSSLCacheSettings;
            return this;
        }

        public Builder setPreConnects(String str) {
            this.mPreConnects = str;
            return this;
        }

        public Builder setPreemptBeforeCloseStaleSessions(boolean z) {
            this.mPreemptBeforeCloseStaleSessions = z;
            return this;
        }

        public Builder setProxyClientAddress(String str) {
            this.mProxyClientAddress = str;
            return this;
        }

        public Builder setProxyFallbackEnabled(boolean z) {
            this.mProxyFallbackEnabled = z;
            return this;
        }

        public Builder setQuicFizzSettings(FizzSettings fizzSettings) {
            this.mQuicFizzSettings = fizzSettings;
            return this;
        }

        public Builder setQuicSettings(QuicSettings quicSettings) {
            this.mQuicSettings = quicSettings;
            return this;
        }

        public Builder setQuicVersion(long j) {
            this.mQuicVersion = j;
            return this;
        }

        public Builder setResetDNSResolverAsynchronously(boolean z) {
            this.mResetDNSResolverAsynchronously = z;
            return this;
        }

        public Builder setRootCACallbacks(RootCACallbacks rootCACallbacks) {
            this.mRootCACallbacks = rootCACallbacks;
            return this;
        }

        public Builder setSSLKeyMaterialCallback(SSLKeyMaterialCallback sSLKeyMaterialCallback) {
            this.mSSLKeyMaterialCallback = sSLKeyMaterialCallback;
            return this;
        }

        public Builder setSSLSessionCache(boolean z) {
            this.mIsSSLSessionCacheEnabled = z;
            return this;
        }

        public Builder setStaleAnswersEnabled(boolean z) {
            this.mStaleAnswersEnabled = z;
            return this;
        }

        public Builder setSupportH2PubSub(boolean z) {
            this.mSupportH2PubSub = z;
            return this;
        }

        public Builder setTransportCallbackEnabled(boolean z) {
            this.mEnableTransportCallbacks = z;
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mUserAgent = str;
            return this;
        }

        public Builder setUserInstalledCertificates(byte[][] bArr) {
            this.mUserInstalledCertificates = bArr;
            return this;
        }

        public Builder useMNSCertificateVerifier(boolean z) {
            this.mUseMNSCertificateVerifier = Boolean.valueOf(z);
            return this;
        }
    }

    /* loaded from: classes10.dex */
    public interface UnexpectedErrorReporter {
        void report(String str, String str2);
    }

    private native void close(EventBase eventBase);

    private native void connect(EventBase eventBase, String[] strArr);

    private native void init(EventBase eventBase, boolean z, boolean z2, boolean z3, String str, int i, boolean z4, boolean z5, String str2, int i2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, String str9, String str10, boolean z6, PersistentSSLCacheSettings persistentSSLCacheSettings, long j, boolean z7, byte[][] bArr, boolean z8, PersistentSSLCacheSettings persistentSSLCacheSettings2, boolean z9, boolean z10, int i4, String str11, int i5, boolean z11, boolean z12, boolean z13, int i6, boolean z14, boolean z15, boolean z16, NetworkStatusMonitor networkStatusMonitor, String str12, boolean z17, int i7, int i8, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, FizzSettings fizzSettings, RootCACallbacks rootCACallbacks, SSLKeyMaterialCallback sSLKeyMaterialCallback, FizzSettings fizzSettings2, QuicSettings quicSettings, long j2, boolean z26, String str13, boolean z27, String str14, boolean z28, Executor executor, Executor executor2, boolean z29, boolean z30, boolean z31, boolean z32, String str15, int i9, int i10);

    public void init() {
        callNativeInit(false, true);
    }

    public void make(JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, TraceEventContext traceEventContext) {
        int i;
        if (this.mEnableTransportCallbacks) {
            i = jniHandler.getEnabledCallbackFlag();
        } else {
            i = 0;
        }
        make(jniHandler, nativeReadBuffer, traceEventContext.mSamplePolicy.isSampled(), traceEventContext, this.mNetworkStatusMonitor, i, this.mBidirectionalStreamingEnabled);
    }

    public native synchronized void make(JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, boolean z, TraceEventContext traceEventContext, NetworkStatusMonitor networkStatusMonitor, int i, boolean z2);

    public void nonBlockingInit() {
        callNativeInit(false, false);
    }

    public native void onNetworkChange(EventBase eventBase, String str, String str2, boolean z);

    public void reinit() {
        callNativeInit(true, true);
    }

    public static boolean stringEquals(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return AbstractC25229BEm.A1Z(str2);
    }

    private String workaroundSamsungLocalProxyBug(String str) {
        if (stringEquals(str, "[::1]")) {
            return "::1";
        }
        return str;
    }

    public synchronized void callNativeInit(boolean z, boolean z2) {
        init(this.mEventBase, z, z2, this.mIsSSLSessionCacheEnabled, this.mPreConnects, this.mMaxIdleHTTP2Sessions, this.mIsHTTPSEnforced, this.mIsSandbox, this.mProxyHost, this.mProxyPort, this.mProxyUsername, this.mProxyPassword, this.mSecureProxyHost, this.mSecureProxyPort, this.mSecureProxyUsername, this.mSecureProxyPassword, this.mAllowProxyDomains, this.mBypassProxyDomains, this.mProxyClientAddress, this.mProxyFallbackEnabled, this.mPersistentSSLCacheSettings, this.mAppBuildTime, this.mUseMNSCertificateVerifier, this.mUserInstalledCertificates, this.mTransactionIdleTimeoutDisabled, this.mPersistentDNSCacheSettings, this.mDnsCacheEnabled, this.mStaleAnswersEnabled, this.mDnsCacheTtlSecs, this.mDnsCacheTtlEnabledHosts, this.mDnsMaxRetries, this.mCloseConnectionOnDnsChange, this.mDoNotForceShutdownClosePendingSessions, this.mLeaveClosePendingQuicSessionsAlone, this.mCloseStaleSessionsDelayMs, this.mPreemptBeforeCloseStaleSessions, this.mDisableCircularLogSink, this.mEnableClientConnectionUuidHeader, this.mNetworkStatusMonitor, this.mUserAgent, this.mLargerFlowControlWindow, this.mSessionFlowControlWindow, this.mStreamFlowControlWindow, this.mUseLoadBalancing, this.mEnableLigerPreconnect, this.mEnableSimplePreconnectForReinit, this.mEnableHTTP2, this.mShouldOverrideTlsHTTP2, this.mTlsHTTP2Override, this.mShouldOverrideFizzHTTP2Static, this.mFizzHTTP2StaticOverride, this.mFizzSettings, this.mRootCACallbacks, this.mSSLKeyMaterialCallback, this.mQuicFizzSettings, this.mQuicSettings, this.mQuicVersion, this.mSupportH2PubSub, this.mH2PubSubHostnames, this.mAttemptEarlyDataInQuicPreconnect, this.mCdnOverride, this.mInlinePersistenceLoading, this.mPersistentCachesExecutor, this.mDNSResolverExecutor, this.mResetDNSResolverAsynchronously, this.mEnableZstd, this.mEnableDzCompression, this.mBidirectionalStreamingEnabled, this.mInitialNetworkType, this.mTcpNotsentLowat, this.mSessionManagerConnectTimeoutExtra);
        this.mInitialized = true;
        this.mReInitToRefreshSettings = false;
    }

    public void close() {
        if (this.mInitialized && !this.mClosed) {
            close(this.mEventBase);
            this.mClosed = true;
        }
    }

    public void connect(String[] strArr) {
        if (this.mInitialized && !this.mClosed) {
            connect(this.mEventBase, strArr);
        }
    }

    public void connectToPreconnectHostnames() {
        String str;
        if (this.mInitialized && !this.mClosed && (str = this.mPreConnects) != null && str.length() > 0) {
            connect(this.mEventBase, str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
        }
    }

    public EventBase getEventBase() {
        return this.mEventBase;
    }

    @Override // com.facebook.proxygen.NativeHandle
    public long getNativeHandle() {
        return this.mSettings;
    }

    public String getReInitReason() {
        return this.mReInitReason;
    }

    public boolean isSandbox() {
        return this.mIsSandbox;
    }

    public boolean reInitializeIfNeeded() {
        if (this.mReInitToRefreshSettings && this.mInitialized) {
            callNativeInit(true, true);
            this.mClosed = false;
            this.mReInitToRefreshSettings = false;
            return true;
        }
        this.mReInitToRefreshSettings = false;
        return false;
    }

    public HTTPClient setIsSandbox(boolean z) {
        if (this.mIsSandbox != z) {
            this.mReInitToRefreshSettings = true;
            this.mIsSandbox = z;
            this.mReInitReason = AnonymousClass001.A1D("sandbox setting changed: ", z);
        }
        return this;
    }

    public HTTPClient setProxyDomainsRules(String str, String str2) {
        if (stringEquals(str, this.mAllowProxyDomains) && stringEquals(str2, this.mBypassProxyDomains)) {
            return this;
        }
        this.mAllowProxyDomains = str;
        this.mBypassProxyDomains = str2;
        this.mReInitToRefreshSettings = true;
        this.mReInitReason = AnonymousClass001.A0u("secure proxy domains rules changed: allowDomains=", str, ", bypassDomains=", str2);
        return this;
    }

    public HTTPClient(Builder builder) {
        this.mEventBase = builder.mEventBase;
        this.mIsSSLSessionCacheEnabled = builder.mIsSSLSessionCacheEnabled;
        this.mPreConnects = builder.mPreConnects;
        this.mMaxIdleHTTP2Sessions = builder.mMaxIdleHTTP2Sessions;
        this.mIsHTTPSEnforced = builder.mIsHTTPSEnforced;
        this.mIsSandbox = builder.mIsSandbox;
        this.mProxyHost = builder.mProxyHost;
        this.mProxyPort = builder.mProxyPort;
        this.mProxyUsername = builder.mProxyUsername;
        this.mProxyPassword = builder.mProxyPassword;
        this.mSecureProxyHost = builder.mSecureProxyHost;
        this.mSecureProxyPort = builder.mSecureProxyPort;
        this.mSecureProxyUsername = builder.mSecureProxyUsername;
        this.mSecureProxyPassword = builder.mSecureProxyPassword;
        this.mUserAgent = builder.mUserAgent;
        this.mAllowProxyDomains = builder.mAllowProxyDomains;
        this.mBypassProxyDomains = builder.mBypassProxyDomains;
        this.mProxyClientAddress = builder.mProxyClientAddress;
        this.mProxyFallbackEnabled = builder.mProxyFallbackEnabled;
        this.mPersistentSSLCacheSettings = builder.mPersistentSSLCacheSettings;
        this.mAppBuildTime = builder.mAppBuildTime;
        this.mDnsCacheEnabled = builder.mDnsCacheEnabled;
        this.mStaleAnswersEnabled = builder.mStaleAnswersEnabled;
        this.mDnsCacheTtlSecs = builder.mDnsCacheTtlSecs;
        this.mDnsCacheTtlEnabledHosts = builder.mDnsCacheTtlEnabledHosts;
        this.mDnsMaxRetries = builder.mDnsMaxRetries;
        this.mCloseConnectionOnDnsChange = builder.mCloseConnectionOnDnsChange;
        this.mDoNotForceShutdownClosePendingSessions = builder.mDoNotForceShutdownClosePendingSessions;
        this.mLeaveClosePendingQuicSessionsAlone = builder.mLeaveClosePendingQuicSessionsAlone;
        this.mCloseStaleSessionsDelayMs = builder.mCloseStaleSessionsDelayMs;
        this.mPreemptBeforeCloseStaleSessions = builder.mPreemptBeforeCloseStaleSessions;
        this.mDisableCircularLogSink = builder.mDisableCircularLogSink;
        this.mEnableClientConnectionUuidHeader = builder.mEnableClientConnectionUuidHeader;
        this.mUserInstalledCertificates = builder.mUserInstalledCertificates;
        this.mTransactionIdleTimeoutDisabled = builder.mTransactionIdleTimeoutDisabled;
        this.mPersistentDNSCacheSettings = builder.mPersistentDNSCacheSettings;
        this.mNetworkStatusMonitor = builder.mNetworkStatusMonitor;
        this.mEnableTransportCallbacks = builder.mEnableTransportCallbacks;
        this.mLargerFlowControlWindow = builder.mLargerFlowControlWindow;
        this.mSessionFlowControlWindow = builder.mSessionFlowControlWindow;
        this.mStreamFlowControlWindow = builder.mStreamFlowControlWindow;
        this.mUseLoadBalancing = builder.mUseLoadBalancing;
        this.mEnableLigerPreconnect = builder.mEnableLigerPreconnect;
        this.mEnableSimplePreconnectForReinit = builder.mEnableSimplePreconnectForReinit;
        this.mEnableHTTP2 = builder.mEnableHTTP2;
        this.mFizzSettings = builder.mFizzSettings;
        this.mQuicFizzSettings = builder.mQuicFizzSettings;
        this.mUseMNSCertificateVerifier = builder.mUseMNSCertificateVerifier.booleanValue();
        this.mQuicSettings = builder.mQuicSettings;
        this.mQuicVersion = builder.mQuicVersion;
        this.mReInitToRefreshSettings = builder.mReInitToRefreshSettings;
        this.mInitialized = builder.mInitialized;
        this.mClosed = builder.mClosed;
        this.mSettings = builder.mSettings;
        this.mShouldOverrideTlsHTTP2 = builder.mShouldOverrideTlsHTTP2;
        this.mTlsHTTP2Override = builder.mTlsHTTP2Override;
        this.mShouldOverrideFizzHTTP2Static = builder.mShouldOverrideFizzHTTP2Static;
        this.mFizzHTTP2StaticOverride = builder.mFizzHTTP2StaticOverride;
        this.mRootCACallbacks = builder.mRootCACallbacks;
        this.mSSLKeyMaterialCallback = builder.mSSLKeyMaterialCallback;
        this.mSupportH2PubSub = builder.mSupportH2PubSub;
        this.mH2PubSubHostnames = builder.mH2PubSubHostnames;
        this.mAttemptEarlyDataInQuicPreconnect = builder.mAttemptEarlyDataInQuicPreconnect;
        this.mCdnOverride = builder.mCdnOverride;
        this.mInlinePersistenceLoading = builder.mInlinePersistenceLoading;
        this.mPersistentCachesExecutor = builder.mPersistentCachesExecutor;
        this.mDNSResolverExecutor = builder.mDNSResolverExecutor;
        this.mResetDNSResolverAsynchronously = builder.mResetDNSResolverAsynchronously;
        this.mEnableZstd = builder.mEnableZstd;
        this.mEnableDzCompression = builder.mEnableDzCompression;
        this.mBidirectionalStreamingEnabled = builder.mBidirectionalStreamingEnabled;
        this.mInitialNetworkType = builder.mInitialNetworkType;
        this.mTcpNotsentLowat = builder.mTcpNotsentLowat;
        this.mSessionManagerConnectTimeoutExtra = builder.mSessionManagerConnectTimeoutExtra;
    }

    public void finalize() {
        close();
    }

    @Override // com.facebook.proxygen.NativeHandle
    public void setNativeHandle(long j) {
        this.mSettings = j;
    }

    public HTTPClient setNetworkStatusMonitor(NetworkStatusMonitor networkStatusMonitor) {
        this.mNetworkStatusMonitor = networkStatusMonitor;
        return this;
    }

    public HTTPClient setProxy(String str, int i, String str2, String str3) {
        String workaroundSamsungLocalProxyBug = workaroundSamsungLocalProxyBug(str);
        if (stringEquals(workaroundSamsungLocalProxyBug, this.mProxyHost) && i == this.mProxyPort && stringEquals(str2, this.mProxyUsername) && stringEquals(str3, this.mProxyPassword)) {
            return this;
        }
        this.mProxyHost = workaroundSamsungLocalProxyBug;
        this.mProxyPort = i;
        this.mProxyUsername = str2;
        this.mProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("proxy settings changed: proxy host: ");
        A1C.append(workaroundSamsungLocalProxyBug);
        A1C.append(", proxy port: ");
        A1C.append(i);
        this.mReInitReason = MSZ.A0u(", proxy username: ", str2, A1C);
        return this;
    }

    public HTTPClient setProxyClientAddress(String str) {
        this.mProxyClientAddress = str;
        return this;
    }

    public HTTPClient setProxyFallbackEnabled(boolean z) {
        this.mProxyFallbackEnabled = z;
        return this;
    }

    public HTTPClient setSecureProxy(String str, int i, String str2, String str3) {
        String workaroundSamsungLocalProxyBug = workaroundSamsungLocalProxyBug(str);
        if (stringEquals(workaroundSamsungLocalProxyBug, this.mSecureProxyHost) && i == this.mSecureProxyPort && stringEquals(str2, this.mSecureProxyUsername) && stringEquals(str3, this.mSecureProxyPassword)) {
            return this;
        }
        this.mSecureProxyHost = workaroundSamsungLocalProxyBug;
        this.mSecureProxyPort = i;
        this.mSecureProxyUsername = str2;
        this.mSecureProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("secure proxy settings changed: proxy host: ");
        A1C.append(workaroundSamsungLocalProxyBug);
        A1C.append(", proxy port: ");
        A1C.append(i);
        this.mReInitReason = MSZ.A0u(", proxy username: ", str2, A1C);
        return this;
    }

    public HTTPClient setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    public HTTPClient setUserInstalledCertificates(byte[][] bArr) {
        this.mUserInstalledCertificates = bArr;
        return this;
    }
}
