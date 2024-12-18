package psi;

import go.Seq;

/* loaded from: classes10.dex */
public abstract class Psi {

    /* loaded from: classes12.dex */
    public final class proxyPsiphonProvider implements Seq.Proxy, PsiphonProvider {
        public final int refnum;

        @Override // psi.PsiphonProvider
        public native String bindToDevice(long j);

        @Override // psi.PsiphonProvider
        public native String getDNSServersAsString();

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public native String getNetworkID();

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public native long hasIPv6Route();

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public native long hasNetworkConnectivity();

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public native String iPv6Synthesize(String str);

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNoticeHandler
        public native void notice(String str);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public proxyPsiphonProvider(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }
    }

    /* loaded from: classes12.dex */
    public final class proxyPsiphonProviderFeedbackHandler implements Seq.Proxy, PsiphonProviderFeedbackHandler {
        public final int refnum;

        @Override // psi.PsiphonProviderFeedbackHandler
        public native void sendFeedbackCompleted(Exception exc);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public proxyPsiphonProviderFeedbackHandler(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }
    }

    /* loaded from: classes12.dex */
    public final class proxyPsiphonProviderNetwork implements Seq.Proxy, PsiphonProviderNetwork {
        public final int refnum;

        @Override // psi.PsiphonProviderNetwork
        public native String getNetworkID();

        @Override // psi.PsiphonProviderNetwork
        public native long hasIPv6Route();

        @Override // psi.PsiphonProviderNetwork
        public native long hasNetworkConnectivity();

        @Override // psi.PsiphonProviderNetwork
        public native String iPv6Synthesize(String str);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public proxyPsiphonProviderNetwork(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }
    }

    /* loaded from: classes12.dex */
    public final class proxyPsiphonProviderNoticeHandler implements Seq.Proxy, PsiphonProviderNoticeHandler {
        public final int refnum;

        @Override // psi.PsiphonProviderNoticeHandler
        public native void notice(String str);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public proxyPsiphonProviderNoticeHandler(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }
    }

    public static native void _init();

    public static native String exportExchangePayload();

    public static native String getBuildInfo();

    public static native String getPacketTunnelDNSResolverIPv4Address();

    public static native String getPacketTunnelDNSResolverIPv6Address();

    public static native long getPacketTunnelMTU();

    public static native String homepageFilePath(String str);

    public static native boolean importExchangePayload(String str);

    public static native void noticeUserLog(String str);

    public static native String noticesFilePath(String str);

    public static native String oldNoticesFilePath(String str);

    public static native void reconnectTunnel();

    public static native void setDynamicConfig(String str, String str2);

    public static native void start(String str, String str2, String str3, PsiphonProvider psiphonProvider, boolean z, boolean z2, boolean z3);

    public static native void startSendFeedback(String str, String str2, String str3, PsiphonProviderFeedbackHandler psiphonProviderFeedbackHandler, PsiphonProviderNetwork psiphonProviderNetwork, PsiphonProviderNoticeHandler psiphonProviderNoticeHandler, boolean z, boolean z2);

    public static native void stop();

    public static native void stopSendFeedback();

    public static void touch() {
    }

    public static native String upgradeDownloadFilePath(String str);

    public static native void writeRuntimeProfiles(String str, long j, long j2);

    static {
        Seq.touch();
        _init();
    }
}
