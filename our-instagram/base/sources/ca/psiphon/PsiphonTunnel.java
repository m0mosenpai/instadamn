package ca.psiphon;

import X.AbstractC09830fh;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.VpnService;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import psi.Psi;
import psi.PsiphonProvider;
import psi.PsiphonProviderFeedbackHandler;
import psi.PsiphonProviderNetwork;
import psi.PsiphonProviderNoticeHandler;

/* loaded from: classes10.dex */
public class PsiphonTunnel {
    public static final int UDPGW_SERVER_PORT = 7300;
    public static final int VPN_INTERFACE_MTU = 1500;
    public static final String VPN_INTERFACE_NETMASK = "255.255.255.0";
    public static PsiphonTunnel mPsiphonTunnel;
    public final HostService mHostService;
    public final NetworkMonitor mNetworkMonitor;
    public PrivateAddress mPrivateAddress;
    public final boolean mShouldRouteThroughTunnelAutomatically;
    public Thread mTun2SocksThread;
    public AtomicBoolean mVpnMode = new AtomicBoolean(false);
    public AtomicReference mTunFd = new AtomicReference();
    public AtomicInteger mLocalSocksProxyPort = new AtomicInteger(0);
    public AtomicBoolean mRoutingThroughTunnel = new AtomicBoolean(false);
    public AtomicBoolean mIsWaitingForNetworkConnectivity = new AtomicBoolean(false);
    public AtomicReference mClientPlatformPrefix = new AtomicReference("");
    public AtomicReference mClientPlatformSuffix = new AtomicReference("");
    public AtomicReference mActiveNetworkType = new AtomicReference("");
    public AtomicReference mActiveNetworkDNSServers = new AtomicReference("");

    /* loaded from: classes10.dex */
    public class Exception extends java.lang.Exception {
        public static final long serialVersionUID = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Exception(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r0 = ": "
                r1.append(r0)
                java.lang.String r0 = r4.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.Exception.<init>(java.lang.String, java.lang.Throwable):void");
        }

        public Exception(String str) {
            super(str);
        }
    }

    /* loaded from: classes10.dex */
    public interface HostFeedbackHandler {

        /* renamed from: ca.psiphon.PsiphonTunnel$HostFeedbackHandler$-CC, reason: invalid class name */
        /* loaded from: classes10.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$sendFeedbackCompleted(HostFeedbackHandler hostFeedbackHandler, java.lang.Exception exc) {
            }
        }

        void sendFeedbackCompleted(java.lang.Exception exc);
    }

    /* loaded from: classes10.dex */
    public interface HostLogger {

        /* renamed from: ca.psiphon.PsiphonTunnel$HostLogger$-CC, reason: invalid class name */
        /* loaded from: classes10.dex */
        public abstract /* synthetic */ class CC {
            public static void $default$onDiagnosticMessage(HostLogger hostLogger, String str) {
            }
        }

        void onDiagnosticMessage(String str);
    }

    /* loaded from: classes10.dex */
    public class NetworkMonitor {
        public AtomicReference activeNetworkDNSServers;
        public AtomicReference activeNetworkType;
        public final NetworkChangeListener listener;
        public HostLogger logger;
        public ConnectivityManager.NetworkCallback networkCallback;

        /* loaded from: classes10.dex */
        public interface NetworkChangeListener {
            void onChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(Context context) {
            final ConnectivityManager connectivityManager;
            if (Build.VERSION.SDK_INT < 21 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return;
            }
            this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: ca.psiphon.PsiphonTunnel.NetworkMonitor.1
                public Network currentActiveNetwork;
                public boolean isInitialState = true;

                private void consumeActiveNetwork(Network network) {
                    if (this.isInitialState) {
                        this.isInitialState = false;
                        setCurrentActiveNetworkAndProperties(network);
                    } else if (!network.equals(this.currentActiveNetwork)) {
                        setCurrentActiveNetworkAndProperties(network);
                        if (NetworkMonitor.this.listener != null) {
                            NetworkMonitor.this.listener.onChanged();
                        }
                    }
                }

                private void consumeLostNetwork(Network network) {
                    if (network.equals(this.currentActiveNetwork)) {
                        setCurrentActiveNetworkAndProperties(null);
                        if (NetworkMonitor.this.listener != null) {
                            NetworkMonitor.this.listener.onChanged();
                        }
                    }
                }

                private void setCurrentActiveNetworkAndProperties(Network network) {
                    this.currentActiveNetwork = network;
                    if (network == null) {
                        NetworkMonitor.this.activeNetworkType.set(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
                        NetworkMonitor.this.activeNetworkDNSServers.set("");
                        NetworkMonitor.this.logger.onDiagnosticMessage("NetworkMonitor: clear current active network");
                        return;
                    }
                    String str = "UNKNOWN";
                    try {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities.hasTransport(0)) {
                            str = "MOBILE";
                        } else if (networkCapabilities.hasTransport(1)) {
                            str = "WIFI";
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    NetworkMonitor.this.activeNetworkType.set(str);
                    ArrayList arrayList = new ArrayList();
                    try {
                        Iterator<InetAddress> it = connectivityManager.getLinkProperties(network).getDnsServers().iterator();
                        while (it.hasNext()) {
                            String obj = it.next().toString();
                            if (obj.startsWith("/")) {
                                obj = obj.substring(1);
                            }
                            arrayList.add(obj);
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                    NetworkMonitor.this.activeNetworkDNSServers.set(TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList));
                    StringBuilder sb = new StringBuilder();
                    sb.append("NetworkMonitor: set current active network ");
                    sb.append(str);
                    String obj2 = sb.toString();
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(obj2);
                        sb2.append(" with DNS");
                        obj2 = sb2.toString();
                    }
                    NetworkMonitor.this.logger.onDiagnosticMessage(obj2);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    if (Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    consumeActiveNetwork(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    if (Build.VERSION.SDK_INT >= 23 && networkCapabilities.hasCapability(16)) {
                        consumeActiveNetwork(network);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    consumeLostNetwork(network);
                }
            };
            try {
                NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
                if (PsiphonTunnel.mPsiphonTunnel.mVpnMode.get()) {
                    addCapability.addCapability(15);
                } else {
                    addCapability.removeCapability(15);
                }
                connectivityManager.requestNetwork(addCapability.build(), this.networkCallback);
            } catch (RuntimeException unused) {
                this.networkCallback = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop(Context context) {
            ConnectivityManager connectivityManager;
            if (this.networkCallback == null || Build.VERSION.SDK_INT < 21 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return;
            }
            try {
                connectivityManager.unregisterNetworkCallback(this.networkCallback);
            } catch (RuntimeException unused) {
            }
            this.networkCallback = null;
        }

        public NetworkMonitor(NetworkChangeListener networkChangeListener, AtomicReference atomicReference, AtomicReference atomicReference2, HostLogger hostLogger) {
            this.listener = networkChangeListener;
            this.activeNetworkType = atomicReference;
            this.activeNetworkDNSServers = atomicReference2;
            this.logger = hostLogger;
        }
    }

    /* loaded from: classes10.dex */
    public class PsiphonProviderShim implements PsiphonProvider {
        public PsiphonTunnel mPsiphonTunnel;

        public PsiphonProviderShim(PsiphonTunnel psiphonTunnel) {
            this.mPsiphonTunnel = psiphonTunnel;
        }

        @Override // psi.PsiphonProvider
        public String bindToDevice(long j) {
            return this.mPsiphonTunnel.bindToDevice(j);
        }

        @Override // psi.PsiphonProvider
        public String getDNSServersAsString() {
            return this.mPsiphonTunnel.getDNSServers(PsiphonTunnel.this.mHostService.getContext(), PsiphonTunnel.this.mHostService);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public String getNetworkID() {
            return PsiphonTunnel.getNetworkID(PsiphonTunnel.this.mHostService.getContext());
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public long hasIPv6Route() {
            return PsiphonTunnel.hasIPv6Route(PsiphonTunnel.this.mHostService.getContext(), PsiphonTunnel.this.mHostService);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public long hasNetworkConnectivity() {
            return this.mPsiphonTunnel.hasNetworkConnectivity();
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNoticeHandler
        public void notice(String str) {
            this.mPsiphonTunnel.notice(str);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public String iPv6Synthesize(String str) {
            return PsiphonTunnel.iPv6Synthesize(str);
        }
    }

    /* loaded from: classes10.dex */
    public class PsiphonTunnelFeedback {
        public final ExecutorService workQueue = Executors.newSingleThreadExecutor();
        public final ExecutorService callbackQueue = Executors.newSingleThreadExecutor();

        /* renamed from: ca.psiphon.PsiphonTunnel$PsiphonTunnelFeedback$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ String val$clientPlatformPrefix;
            public final /* synthetic */ String val$clientPlatformSuffix;
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ String val$diagnosticsJson;
            public final /* synthetic */ String val$feedbackConfigJson;
            public final /* synthetic */ HostFeedbackHandler val$feedbackHandler;
            public final /* synthetic */ HostLogger val$logger;
            public final /* synthetic */ String val$uploadPath;

            public AnonymousClass1(Context context, HostLogger hostLogger, String str, String str2, String str3, String str4, String str5, HostFeedbackHandler hostFeedbackHandler) {
                this.val$context = context;
                this.val$logger = hostLogger;
                this.val$feedbackConfigJson = str;
                this.val$clientPlatformPrefix = str2;
                this.val$clientPlatformSuffix = str3;
                this.val$diagnosticsJson = str4;
                this.val$uploadPath = str5;
                this.val$feedbackHandler = hostFeedbackHandler;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Psi.startSendFeedback(PsiphonTunnel.buildPsiphonConfig(this.val$context, this.val$logger, this.val$feedbackConfigJson, this.val$clientPlatformPrefix, this.val$clientPlatformSuffix, false, 0), this.val$diagnosticsJson, this.val$uploadPath, new PsiphonProviderFeedbackHandler() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.1
                        @Override // psi.PsiphonProviderFeedbackHandler
                        public void sendFeedbackCompleted(final java.lang.Exception exc) {
                            PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass1.this.val$feedbackHandler.sendFeedbackCompleted(exc);
                                }
                            });
                        }
                    }, new PsiphonProviderNetwork() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.2
                        @Override // psi.PsiphonProviderNetwork
                        public String getNetworkID() {
                            return PsiphonTunnel.getNetworkID(AnonymousClass1.this.val$context);
                        }

                        @Override // psi.PsiphonProviderNetwork
                        public long hasIPv6Route() {
                            return PsiphonTunnel.hasIPv6Route(AnonymousClass1.this.val$context, AnonymousClass1.this.val$logger);
                        }

                        @Override // psi.PsiphonProviderNetwork
                        public long hasNetworkConnectivity() {
                            if (PsiphonTunnel.hasNetworkConnectivity(AnonymousClass1.this.val$context)) {
                                return 1L;
                            }
                            return 0L;
                        }

                        @Override // psi.PsiphonProviderNetwork
                        public String iPv6Synthesize(String str) {
                            return PsiphonTunnel.iPv6Synthesize(str);
                        }
                    }, new PsiphonProviderNoticeHandler() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.3
                        @Override // psi.PsiphonProviderNoticeHandler
                        public void notice(String str) {
                            JSONObject jSONObject;
                            try {
                                JSONObject jSONObject2 = new JSONObject(str);
                                String string = jSONObject2.getString("noticeType");
                                if (string == null || (jSONObject = jSONObject2.getJSONObject("data")) == null) {
                                    return;
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(string);
                                sb.append(": ");
                                sb.append(jSONObject.toString());
                                final String obj = sb.toString();
                                PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AnonymousClass1.this.val$logger.onDiagnosticMessage(obj);
                                    }
                                });
                            } catch (java.lang.Exception e) {
                                PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.3.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        HostLogger hostLogger = AnonymousClass1.this.val$logger;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Error handling notice ");
                                        sb2.append(e.toString());
                                        hostLogger.onDiagnosticMessage(sb2.toString());
                                    }
                                });
                            }
                        }
                    }, false, true);
                } catch (java.lang.Exception e) {
                    PsiphonTunnelFeedback.this.callbackQueue.submit(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1.this.val$feedbackHandler.sendFeedbackCompleted(new Exception("Error sending feedback", e));
                        }
                    });
                }
            }
        }

        public void startSendFeedback(Context context, HostFeedbackHandler hostFeedbackHandler, HostLogger hostLogger, String str, String str2, String str3, String str4, String str5) {
            this.workQueue.submit(new AnonymousClass1(context, hostLogger, str, str4, str5, str2, str3, hostFeedbackHandler));
        }

        public void finalize() {
            shutdownAndAwaitTermination(this.callbackQueue);
            shutdownAndAwaitTermination(this.workQueue);
            super.finalize();
        }

        public void shutdownAndAwaitTermination(ExecutorService executorService) {
            try {
                if (!executorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                    executorService.shutdownNow();
                    if (!executorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                        System.err.println("PsiphonTunnelFeedback: pool did not terminate");
                    }
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        public Future stopSendFeedback() {
            return this.workQueue.submit(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.2
                @Override // java.lang.Runnable
                public void run() {
                    Psi.stopSendFeedback();
                }
            }, null);
        }
    }

    public static native int disableUdpGwKeepalive();

    public static native int enableUdpGwKeepalive();

    public static String iPv6Synthesize(String str) {
        return str;
    }

    public static native int runTun2Socks(int i, int i2, String str, String str2, String str3, String str4, int i3);

    private void startTun2Socks(final ParcelFileDescriptor parcelFileDescriptor, final int i, final String str, final String str2, final String str3, final String str4, final boolean z) {
        if (this.mTun2SocksThread != null) {
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.2
            @Override // java.lang.Runnable
            public void run() {
                PsiphonTunnel.runTun2Socks(parcelFileDescriptor.detachFd(), i, str, str2, str3, str4, z ? 1 : 0);
            }
        });
        this.mTun2SocksThread = thread;
        thread.start();
        this.mHostService.onDiagnosticMessage("tun2socks started");
    }

    public static native int terminateTun2Socks();

    public synchronized void reconnectPsiphon() {
        Psi.reconnectTunnel();
    }

    public synchronized void restartPsiphon() {
        stopPsiphon();
        startPsiphon("");
    }

    public synchronized boolean startRouting() {
        this.mHostService.loadLibrary("tun2socks");
        return startVpn();
    }

    public synchronized void startTunneling(String str) {
        startPsiphon(str);
    }

    public synchronized void stop() {
        stopVpn();
        stopPsiphon();
        this.mVpnMode.set(false);
        this.mLocalSocksProxyPort.set(0);
    }

    public void writeRuntimeProfiles(String str, int i, int i2) {
        Psi.writeRuntimeProfiles(str, i, i2);
    }

    /* loaded from: classes10.dex */
    public class PrivateAddress {
        public final String mIpAddress;
        public final int mPrefixLength;
        public final String mRouter;
        public final String mSubnet;

        public PrivateAddress(String str, String str2, int i, String str3) {
            this.mIpAddress = str;
            this.mSubnet = str2;
            this.mPrefixLength = i;
            this.mRouter = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String bindToDevice(long j) {
        if (((VpnService) this.mHostService.getVpnService()).protect((int) j)) {
            return "";
        }
        throw new Exception("protect socket failed");
    }

    public static String buildPsiphonConfig(Context context, HostLogger hostLogger, String str, String str2, String str3, boolean z, Integer num) {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("DataRootDirectory")) {
            File defaultDataRootDirectory = defaultDataRootDirectory(context);
            if (defaultDataRootDirectory.exists() || defaultDataRootDirectory.mkdir()) {
                jSONObject.put("DataRootDirectory", defaultDataRootDirectory(context));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to create data root directory: ");
                sb.append(defaultDataRootDirectory.getPath());
                throw new Exception(sb.toString());
            }
        }
        if (!jSONObject.has("DataStoreDirectory")) {
            jSONObject.put("MigrateDataStoreDirectory", context.getFilesDir());
        }
        if (!jSONObject.has("RemoteServerListDownloadFilename")) {
            jSONObject.put("MigrateRemoteServerListDownloadFilename", new File(context.getFilesDir(), "remote_server_list").getAbsolutePath());
        }
        jSONObject.put("MigrateObfuscatedServerListDownloadDirectory", new File(context.getFilesDir(), "osl").getAbsolutePath());
        if (!jSONObject.has("EstablishTunnelTimeoutSeconds")) {
            jSONObject.put("EstablishTunnelTimeoutSeconds", 0);
        }
        jSONObject.put("EmitBytesTransferred", true);
        if (num.intValue() != 0 && (!jSONObject.has("LocalSocksProxyPort") || jSONObject.getInt("LocalSocksProxyPort") == 0)) {
            jSONObject.put("LocalSocksProxyPort", num);
        }
        if (Build.VERSION.SDK_INT < 14) {
            try {
                jSONObject.put("TrustedCACertificatesFilename", setupTrustedCertificates(context, hostLogger));
            } catch (Exception e) {
                hostLogger.onDiagnosticMessage(e.getMessage());
            }
        }
        jSONObject.put("DeviceRegion", getDeviceRegion(context));
        StringBuilder sb2 = new StringBuilder();
        if (str2.length() > 0) {
            sb2.append(str2);
        }
        sb2.append("Android_");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("_");
        sb2.append(context.getPackageName());
        if (str3.length() > 0) {
            sb2.append(str3);
        }
        jSONObject.put("ClientPlatform", sb2.toString().replaceAll("[^\\w\\-\\.]", "_"));
        return jSONObject.toString();
    }

    public static File defaultDataRootDirectory(Context context) {
        return context.getFileStreamPath("ca.psiphon.PsiphonTunnel.tunnel-core");
    }

    public static Collection getActiveNetworkDNSServerAddresses(Context context, boolean z) {
        final ArrayList arrayList = new ArrayList();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                Class<?> cls = Class.forName("android.net.LinkProperties");
                Object invoke = ConnectivityManager.class.getMethod("getActiveLinkProperties", new Class[0]).invoke(connectivityManager, new Object[0]);
                if (invoke != null) {
                    if (Build.VERSION.SDK_INT < 21) {
                        Iterator it = ((Collection) cls.getMethod("getDnses", new Class[0]).invoke(invoke, new Object[0])).iterator();
                        while (it.hasNext()) {
                            arrayList.add((InetAddress) it.next());
                        }
                    } else {
                        Iterator<InetAddress> it2 = ((LinkProperties) invoke).getDnsServers().iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next());
                        }
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
                if (z) {
                    addCapability.addCapability(15);
                }
                NetworkRequest build = addCapability.build();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: ca.psiphon.PsiphonTunnel.3
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                            arrayList.addAll(linkProperties.getDnsServers());
                            countDownLatch.countDown();
                        }
                    };
                    connectivityManager.registerNetworkCallback(build, networkCallback);
                    countDownLatch.await(1L, TimeUnit.SECONDS);
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                } catch (RuntimeException unused3) {
                }
            }
            return arrayList;
        }
        throw new Exception("getActiveNetworkDNSServerAddresses failed", new Throwable("couldn't get ConnectivityManager system service"));
    }

    public static Collection getActiveNetworkDNSServers(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getActiveNetworkDNSServerAddresses(context, z).iterator();
        while (it.hasNext()) {
            String obj = ((InetAddress) it.next()).toString();
            if (obj.startsWith("/")) {
                obj = obj.substring(1);
            }
            arrayList.add(obj);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Exception("no active network DNS resolver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDNSServers(Context context, HostLogger hostLogger) {
        String str = (String) this.mActiveNetworkDNSServers.get();
        if (str != "") {
            return str;
        }
        try {
            str = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, getActiveNetworkDNSServers(context, this.mVpnMode.get()));
            return str;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to get active network DNS resolver: ");
            sb.append(e.getMessage());
            hostLogger.onDiagnosticMessage(sb.toString());
            return str;
        }
    }

    public static String getDeviceRegion(Context context) {
        Locale locale;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String str = "";
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso == null) {
                simCountryIso = "";
            }
            if (simCountryIso.length() == 0 && telephonyManager.getPhoneType() != 2) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null) {
                    str = networkCountryIso;
                }
            } else {
                str = simCountryIso;
            }
        }
        if (str.length() == 0 && (locale = Locale.getDefault()) != null) {
            str = locale.getCountry();
        }
        return str.toUpperCase(Locale.US);
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.net.NetworkInfo, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static String getNetworkID(Context context) {
        ?? r2;
        try {
            r2 = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
            r2 = 0;
        }
        try {
            if (r2 != 0 && r2.getType() == 1) {
                WifiInfo A00 = AbstractC09830fh.A00((WifiManager) context.getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI));
                if (A00 == null) {
                    return "WIFI";
                }
                String bssid = A00.getBSSID();
                if (bssid.equals("02:00:00:00:00:00")) {
                    bssid = String.valueOf(A00.getIpAddress());
                }
                StringBuilder sb = new StringBuilder();
                sb.append("WIFI");
                sb.append("-");
                sb.append(bssid);
                return sb.toString();
            }
            if (r2 != 0 && r2.getType() == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return "MOBILE";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MOBILE");
                sb2.append("-");
                sb2.append(telephonyManager.getNetworkOperator());
                return sb2.toString();
            }
            return "UNKNOWN";
        } catch (java.lang.Exception unused2) {
            return r2;
        }
    }

    private void handlePsiphonNotice(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("noticeType");
            boolean z = true;
            int i = 0;
            if (string.equals("Tunnels")) {
                int i2 = jSONObject.getJSONObject("data").getInt("count");
                if (i2 == 0) {
                    this.mHostService.onConnecting();
                } else if (i2 == 1) {
                    if (isVpnMode() && this.mShouldRouteThroughTunnelAutomatically) {
                        routeThroughTunnel();
                    }
                    this.mHostService.onConnected();
                }
            } else if (string.equals("AvailableEgressRegions")) {
                JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("regions");
                ArrayList arrayList = new ArrayList();
                while (i < jSONArray.length()) {
                    arrayList.add(jSONArray.getString(i));
                    i++;
                }
                this.mHostService.onAvailableEgressRegions(arrayList);
            } else if (string.equals("SocksProxyPortInUse")) {
                this.mHostService.onSocksProxyPortInUse(jSONObject.getJSONObject("data").getInt(TraceFieldType.Port));
            } else if (string.equals("HttpProxyPortInUse")) {
                this.mHostService.onHttpProxyPortInUse(jSONObject.getJSONObject("data").getInt(TraceFieldType.Port));
            } else if (string.equals("ListeningSocksProxyPort")) {
                int i3 = jSONObject.getJSONObject("data").getInt(TraceFieldType.Port);
                setLocalSocksProxyPort(i3);
                this.mHostService.onListeningSocksProxyPort(i3);
            } else if (string.equals("ListeningHttpProxyPort")) {
                this.mHostService.onListeningHttpProxyPort(jSONObject.getJSONObject("data").getInt(TraceFieldType.Port));
            } else {
                if (string.equals("UpstreamProxyError")) {
                    this.mHostService.onUpstreamProxyError(jSONObject.getJSONObject("data").getString(DialogModule.KEY_MESSAGE));
                } else if (string.equals("ClientUpgradeDownloaded")) {
                    this.mHostService.onClientUpgradeDownloaded(jSONObject.getJSONObject("data").getString("filename"));
                } else if (string.equals("ClientIsLatestVersion")) {
                    this.mHostService.onClientIsLatestVersion();
                } else if (string.equals("Homepage")) {
                    this.mHostService.onHomepage(jSONObject.getJSONObject("data").getString("url"));
                } else if (string.equals("ClientRegion")) {
                    this.mHostService.onClientRegion(jSONObject.getJSONObject("data").getString(ServerW3CShippingAddressConstants.REGION));
                } else if (string.equals("ClientAddress")) {
                    this.mHostService.onClientAddress(jSONObject.getJSONObject("data").getString("address"));
                } else if (string.equals("SplitTunnelRegions")) {
                    JSONArray jSONArray2 = jSONObject.getJSONObject("data").getJSONArray("regions");
                    ArrayList arrayList2 = new ArrayList();
                    while (i < jSONArray2.length()) {
                        arrayList2.add(jSONArray2.getString(i));
                        i++;
                    }
                    this.mHostService.onSplitTunnelRegions(arrayList2);
                } else if (string.equals("Untunneled")) {
                    this.mHostService.onUntunneledAddress(jSONObject.getJSONObject("data").getString("address"));
                } else if (string.equals("BytesTransferred")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    this.mHostService.onBytesTransferred(jSONObject2.getLong("sent"), jSONObject2.getLong("received"));
                } else if (string.equals("ActiveAuthorizationIDs")) {
                    JSONArray jSONArray3 = jSONObject.getJSONObject("data").getJSONArray("IDs");
                    ArrayList arrayList3 = new ArrayList();
                    while (i < jSONArray3.length()) {
                        arrayList3.add(jSONArray3.getString(i));
                        i++;
                    }
                    this.mHostService.onActiveAuthorizationIDs(arrayList3);
                } else if (string.equals("TrafficRateLimits")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                    this.mHostService.onTrafficRateLimits(jSONObject3.getLong("upstreamBytesPerSecond"), jSONObject3.getLong("downstreamBytesPerSecond"));
                } else if (string.equals("Exiting")) {
                    this.mHostService.onExiting();
                } else if (string.equals("ActiveTunnel")) {
                    if (isVpnMode()) {
                        if (jSONObject.getJSONObject("data").getBoolean("isTCS")) {
                            disableUdpGwKeepalive();
                        } else {
                            enableUdpGwKeepalive();
                        }
                    }
                } else if (string.equals("ApplicationParameter")) {
                    this.mHostService.onApplicationParameter(jSONObject.getJSONObject("data").getString("key"), jSONObject.getJSONObject("data").get(IntentModule.EXTRA_MAP_KEY_FOR_VALUE));
                } else if (string.equals("ServerAlert")) {
                    JSONArray jSONArray4 = jSONObject.getJSONObject("data").getJSONArray("actionURLs");
                    ArrayList arrayList4 = new ArrayList();
                    while (i < jSONArray4.length()) {
                        arrayList4.add(jSONArray4.getString(i));
                        i++;
                    }
                    this.mHostService.onServerAlert(jSONObject.getJSONObject("data").getString("reason"), jSONObject.getJSONObject("data").getString("subject"), arrayList4);
                }
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(": ");
                sb.append(jSONObject.getJSONObject("data").toString());
                this.mHostService.onDiagnosticMessage(sb.toString());
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean hasNetworkConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private boolean isVpnMode() {
        return this.mVpnMode.get();
    }

    private String loadPsiphonConfig(Context context) {
        HostService hostService = this.mHostService;
        return buildPsiphonConfig(context, hostService, hostService.getPsiphonConfig(), (String) this.mClientPlatformPrefix.get(), (String) this.mClientPlatformSuffix.get(), isVpnMode(), Integer.valueOf(this.mLocalSocksProxyPort.get()));
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("tun2socks: ");
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append("): ");
        sb.append(str3);
        mPsiphonTunnel.mHostService.onDiagnosticMessage(sb.toString());
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(HostService hostService, boolean z) {
        PsiphonTunnel newPsiphonTunnelImpl;
        synchronized (PsiphonTunnel.class) {
            newPsiphonTunnelImpl = newPsiphonTunnelImpl(hostService, z);
        }
        return newPsiphonTunnelImpl;
    }

    public static PsiphonTunnel newPsiphonTunnelImpl(HostService hostService, boolean z) {
        PsiphonTunnel psiphonTunnel = mPsiphonTunnel;
        if (psiphonTunnel != null) {
            psiphonTunnel.stop();
        }
        hostService.loadLibrary("gojni");
        PsiphonTunnel psiphonTunnel2 = new PsiphonTunnel(hostService, z);
        mPsiphonTunnel = psiphonTunnel2;
        return psiphonTunnel2;
    }

    public static PrivateAddress selectPrivateAddress() {
        HashMap hashMap = new HashMap();
        hashMap.put("10", new PrivateAddress("10.0.0.1", "10.0.0.0", 8, "10.0.0.2"));
        hashMap.put("172", new PrivateAddress("172.16.0.1", "172.16.0.0", 12, "172.16.0.2"));
        hashMap.put("192", new PrivateAddress("192.168.0.1", "192.168.0.0", 16, "192.168.0.2"));
        hashMap.put("169", new PrivateAddress("169.254.1.1", "169.254.1.0", 24, "169.254.1.2"));
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                Iterator it = Collections.list(networkInterfaces).iterator();
                while (it.hasNext()) {
                    Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                    while (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if (inetAddress instanceof Inet4Address) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.startsWith("10.")) {
                                hashMap.remove("10");
                            } else if (hostAddress.length() >= 6 && hostAddress.substring(0, 6).compareTo("172.16") >= 0 && hostAddress.substring(0, 6).compareTo("172.31") <= 0) {
                                hashMap.remove("172");
                            } else if (hostAddress.startsWith("192.168")) {
                                hashMap.remove("192");
                            }
                        }
                    }
                }
                if (hashMap.size() > 0) {
                    return (PrivateAddress) hashMap.values().iterator().next();
                }
                throw new Exception("no private address available");
            }
            throw new Exception("no network interfaces found");
        } catch (SocketException e) {
            throw new Exception("selectPrivateAddress failed", e);
        }
    }

    private void setLocalSocksProxyPort(int i) {
        this.mLocalSocksProxyPort.set(i);
    }

    public static String setupTrustedCertificates(Context context, HostLogger hostLogger) {
        PrintStream printStream;
        KeyStore keyStore;
        try {
            File file = new File(context.getDir("PsiphonCAStore", 0), "certs.dat");
            file.delete();
            try {
                printStream = new PrintStream(new FileOutputStream(file));
                try {
                    if (Build.VERSION.SDK_INT >= 14) {
                        keyStore = KeyStore.getInstance("AndroidCAStore");
                        keyStore.load(null, null);
                    } else {
                        keyStore = KeyStore.getInstance("BKS");
                        FileInputStream fileInputStream = new FileInputStream("/etc/security/cacerts.bks");
                        try {
                            keyStore.load(fileInputStream, "changeit".toCharArray());
                            fileInputStream.close();
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                    }
                    Enumeration<String> aliases = keyStore.aliases();
                    while (aliases.hasMoreElements()) {
                        X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                        printStream.println("-----BEGIN CERTIFICATE-----");
                        String str = new String(Base64.encode(x509Certificate.getEncoded(), 2), ReactWebViewManager.HTML_ENCODING);
                        int i = 0;
                        while (i < str.length()) {
                            int i2 = i + 64;
                            printStream.println(str.substring(i, Math.min(i2, str.length())));
                            i = i2;
                        }
                        printStream.println("-----END CERTIFICATE-----");
                    }
                    hostLogger.onDiagnosticMessage("prepared PsiphonCAStore");
                    String absolutePath = file.getAbsolutePath();
                    printStream.close();
                    return absolutePath;
                } catch (Throwable th2) {
                    th = th2;
                    if (printStream != null) {
                        printStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                printStream = null;
            }
        } catch (IOException e) {
            throw new Exception("copy AndroidCAStore failed", e);
        } catch (KeyStoreException e2) {
            throw new Exception("copy AndroidCAStore failed", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new Exception("copy AndroidCAStore failed", e3);
        } catch (CertificateException e4) {
            throw new Exception("copy AndroidCAStore failed", e4);
        }
    }

    private void stopPsiphon() {
        this.mHostService.onDiagnosticMessage("stopping Psiphon library");
        this.mNetworkMonitor.stop(this.mHostService.getContext());
        Psi.stop();
        this.mHostService.onDiagnosticMessage("Psiphon library stopped");
    }

    private void stopTun2Socks() {
        if (this.mTun2SocksThread != null) {
            try {
                terminateTun2Socks();
                this.mTun2SocksThread.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.mTun2SocksThread = null;
            this.mHostService.onDiagnosticMessage("tun2socks stopped");
        }
    }

    public Object clone() {
        throw new CloneNotSupportedException();
    }

    public void routeThroughTunnel() {
        ParcelFileDescriptor parcelFileDescriptor;
        if (!this.mRoutingThroughTunnel.compareAndSet(false, true) || (parcelFileDescriptor = (ParcelFileDescriptor) this.mTunFd.getAndSet(null)) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("127.0.0.1:");
        sb.append(Integer.toString(this.mLocalSocksProxyPort.get()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("127.0.0.1:");
        sb2.append(Integer.toString(UDPGW_SERVER_PORT));
        startTun2Socks(parcelFileDescriptor, VPN_INTERFACE_MTU, this.mPrivateAddress.mRouter, VPN_INTERFACE_NETMASK, obj, sb2.toString(), true);
        this.mHostService.onDiagnosticMessage("routing through tunnel");
    }

    public void setClientPlatformAffixes(String str, String str2) {
        this.mClientPlatformPrefix.set(str);
        this.mClientPlatformSuffix.set(str2);
    }

    /* loaded from: classes10.dex */
    public interface HostService extends HostLogger, HostLibraryLoader {
        String getAppName();

        Context getContext();

        String getPsiphonConfig();

        Object getVpnService();

        Object newVpnServiceBuilder();

        void onActiveAuthorizationIDs(List list);

        void onApplicationParameter(String str, Object obj);

        void onAvailableEgressRegions(List list);

        void onBytesTransferred(long j, long j2);

        void onClientAddress(String str);

        void onClientIsLatestVersion();

        void onClientRegion(String str);

        void onClientUpgradeDownloaded(String str);

        void onConnected();

        void onConnecting();

        void onExiting();

        void onHomepage(String str);

        void onHttpProxyPortInUse(int i);

        void onListeningHttpProxyPort(int i);

        void onListeningSocksProxyPort(int i);

        void onServerAlert(String str, String str2, List list);

        void onSocksProxyPortInUse(int i);

        void onSplitTunnelRegions(List list);

        void onStartedWaitingForNetworkConnectivity();

        void onStoppedWaitingForNetworkConnectivity();

        void onTrafficRateLimits(long j, long j2);

        void onUntunneledAddress(String str);

        void onUpstreamProxyError(String str);

        /* renamed from: ca.psiphon.PsiphonTunnel$HostService$-CC, reason: invalid class name */
        /* loaded from: classes9.dex */
        public abstract /* synthetic */ class CC {
            public static Object $default$getVpnService(HostService hostService) {
                return null;
            }

            public static Object $default$newVpnServiceBuilder(HostService hostService) {
                return null;
            }

            public static void $default$onActiveAuthorizationIDs(HostService hostService, List list) {
            }

            public static void $default$onAvailableEgressRegions(HostService hostService, List list) {
            }

            public static void $default$onClientAddress(HostService hostService, String str) {
            }

            public static void $default$onClientIsLatestVersion(HostService hostService) {
            }

            public static void $default$onClientRegion(HostService hostService, String str) {
            }

            public static void $default$onClientUpgradeDownloaded(HostService hostService, String str) {
            }

            public static void $default$onConnected(HostService hostService) {
            }

            public static void $default$onConnecting(HostService hostService) {
            }

            public static void $default$onExiting(HostService hostService) {
            }

            public static void $default$onHomepage(HostService hostService, String str) {
            }

            public static void $default$onHttpProxyPortInUse(HostService hostService, int i) {
            }

            public static void $default$onListeningHttpProxyPort(HostService hostService, int i) {
            }

            public static void $default$onListeningSocksProxyPort(HostService hostService, int i) {
            }

            public static void $default$onSocksProxyPortInUse(HostService hostService, int i) {
            }

            public static void $default$onSplitTunnelRegions(HostService hostService, List list) {
            }

            public static void $default$onStartedWaitingForNetworkConnectivity(HostService hostService) {
            }

            public static void $default$onStoppedWaitingForNetworkConnectivity(HostService hostService) {
            }

            public static void $default$onUntunneledAddress(HostService hostService, String str) {
            }

            public static void $default$onUpstreamProxyError(HostService hostService, String str) {
            }

            public static void $default$onApplicationParameter(HostService hostService, String str, Object obj) {
            }

            public static void $default$onBytesTransferred(HostService hostService, long j, long j2) {
            }

            public static void $default$onTrafficRateLimits(HostService hostService, long j, long j2) {
            }

            public static void $default$onServerAlert(HostService hostService, String str, String str2, List list) {
            }
        }
    }

    public PsiphonTunnel(HostService hostService, boolean z) {
        this.mHostService = hostService;
        this.mShouldRouteThroughTunnelAutomatically = z;
        this.mNetworkMonitor = new NetworkMonitor(new NetworkMonitor.NetworkChangeListener() { // from class: ca.psiphon.PsiphonTunnel.1
            @Override // ca.psiphon.PsiphonTunnel.NetworkMonitor.NetworkChangeListener
            public void onChanged() {
                try {
                    PsiphonTunnel.this.reconnectPsiphon();
                } catch (Exception e) {
                    HostService hostService2 = PsiphonTunnel.this.mHostService;
                    StringBuilder sb = new StringBuilder();
                    sb.append("reconnect error: ");
                    sb.append(e);
                    hostService2.onDiagnosticMessage(sb.toString());
                }
            }
        }, this.mActiveNetworkType, this.mActiveNetworkDNSServers, hostService);
    }

    public static String getDefaultUpgradeDownloadFilePath(Context context) {
        return Psi.upgradeDownloadFilePath(defaultDataRootDirectory(context).getAbsolutePath());
    }

    public static String getUpgradeDownloadFilePath(String str) {
        return Psi.upgradeDownloadFilePath(str);
    }

    public static long hasIPv6Route(Context context, HostLogger hostLogger) {
        boolean z;
        try {
            z = hasIPv6Route(context);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to check IPv6 route: ");
            sb.append(e.getMessage());
            hostLogger.onDiagnosticMessage(sb.toString());
            z = false;
        }
        if (z) {
            return 1L;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notice(String str) {
        handlePsiphonNotice(str);
    }

    private ParcelFileDescriptor startDummyVpn(VpnService.Builder builder) {
        PrivateAddress selectPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            try {
                Locale.setDefault(new Locale("en"));
                return builder.setSession(this.mHostService.getAppName()).setMtu(VPN_INTERFACE_MTU).addAddress(selectPrivateAddress.mIpAddress, selectPrivateAddress.mPrefixLength).addRoute("0.0.0.0", 0).addRoute(selectPrivateAddress.mSubnet, selectPrivateAddress.mPrefixLength).addDnsServer(selectPrivateAddress.mRouter).establish();
            } catch (IllegalArgumentException e) {
                throw new Exception("startDummyVpn failed", e);
            } catch (IllegalStateException e2) {
                throw new Exception("startDummyVpn failed", e2);
            } catch (SecurityException e3) {
                throw new Exception("startDummyVpn failed", e3);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void startPsiphon(String str) {
        stopPsiphon();
        this.mIsWaitingForNetworkConnectivity.set(false);
        this.mHostService.onDiagnosticMessage("starting Psiphon library");
        try {
            Psi.start(loadPsiphonConfig(this.mHostService.getContext()), str, "", new PsiphonProviderShim(this), isVpnMode(), false, true);
            this.mNetworkMonitor.start(this.mHostService.getContext());
            this.mHostService.onDiagnosticMessage("Psiphon library started");
        } catch (java.lang.Exception e) {
            throw new Exception("failed to start Psiphon library", e);
        }
    }

    private boolean startVpn() {
        this.mVpnMode.set(true);
        this.mPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            try {
                try {
                    try {
                        Locale.setDefault(new Locale("en"));
                        ParcelFileDescriptor establish = ((VpnService.Builder) this.mHostService.newVpnServiceBuilder()).setSession(this.mHostService.getAppName()).setMtu(VPN_INTERFACE_MTU).addAddress(this.mPrivateAddress.mIpAddress, this.mPrivateAddress.mPrefixLength).addRoute("0.0.0.0", 0).addRoute(this.mPrivateAddress.mSubnet, this.mPrivateAddress.mPrefixLength).addDnsServer(this.mPrivateAddress.mRouter).establish();
                        if (establish == null) {
                            return false;
                        }
                        this.mTunFd.set(establish);
                        this.mRoutingThroughTunnel.set(false);
                        this.mHostService.onDiagnosticMessage("VPN established");
                        return true;
                    } catch (IllegalStateException e) {
                        throw new Exception("startVpn failed", e);
                    }
                } catch (SecurityException e2) {
                    throw new Exception("startVpn failed", e2);
                }
            } catch (IllegalArgumentException e3) {
                throw new Exception("startVpn failed", e3);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void stopVpn() {
        stopTun2Socks();
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.mTunFd.getAndSet(null);
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
        this.mRoutingThroughTunnel.set(false);
    }

    public String exportExchangePayload() {
        return Psi.exportExchangePayload();
    }

    public boolean importExchangePayload(String str) {
        return Psi.importExchangePayload(str);
    }

    /* loaded from: classes10.dex */
    public interface HostLibraryLoader {
        void loadLibrary(String str);

        /* renamed from: ca.psiphon.PsiphonTunnel$HostLibraryLoader$-CC, reason: invalid class name */
        /* loaded from: classes10.dex */
        public abstract /* synthetic */ class CC {
        }
    }

    public static boolean hasIPv6Route(Context context) {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp() && !networkInterface.isLoopback() && !networkInterface.isPointToPoint()) {
                    Iterator it2 = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if ((inetAddress instanceof Inet6Address) && !inetAddress.isLinkLocalAddress() && !inetAddress.isSiteLocalAddress() && !inetAddress.isMulticastAddress()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (SocketException e) {
            throw new Exception("hasIPv6Route failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long hasNetworkConnectivity() {
        boolean hasNetworkConnectivity = hasNetworkConnectivity(this.mHostService.getContext());
        boolean andSet = this.mIsWaitingForNetworkConnectivity.getAndSet(!hasNetworkConnectivity);
        if (!hasNetworkConnectivity && !andSet) {
            this.mHostService.onStartedWaitingForNetworkConnectivity();
        } else if (hasNetworkConnectivity && andSet) {
            this.mHostService.onStoppedWaitingForNetworkConnectivity();
        }
        if (hasNetworkConnectivity) {
            return 1L;
        }
        return 0L;
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(HostService hostService) {
        PsiphonTunnel newPsiphonTunnelImpl;
        synchronized (PsiphonTunnel.class) {
            newPsiphonTunnelImpl = newPsiphonTunnelImpl(hostService, true);
        }
        return newPsiphonTunnelImpl;
    }
}
