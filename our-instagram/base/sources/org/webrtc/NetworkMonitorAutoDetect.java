package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.C0f9;
import X.C14360o3;
import X.SB4;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.NetworkMonitorAutoDetect;

/* loaded from: classes10.dex */
public class NetworkMonitorAutoDetect extends BroadcastReceiver implements NetworkChangeDetector {
    public static final long INVALID_NET_ID = -1;
    public static final String TAG = "NetworkMonitorAutoDetect";
    public static boolean includeWifiDirect;
    public final ConnectivityManager.NetworkCallback allNetworkCallback;
    public final Set availableNetworks;
    public NetworkChangeDetector.ConnectionType connectionType;
    public ConnectivityManagerDelegate connectivityManagerDelegate;
    public final Context context;
    public final IntentFilter intentFilter;
    public boolean isRegistered;
    public final ConnectivityManager.NetworkCallback mobileNetworkCallback;
    public final NetworkChangeDetector.Observer observer;
    public WifiDirectManagerDelegate wifiDirectManagerDelegate;
    public WifiManagerDelegate wifiManagerDelegate;
    public String wifiSSID;

    /* loaded from: classes10.dex */
    public class ConnectivityManagerDelegate {
        public final Set availableNetworks;
        public final SB4 connectivityManager;
        public final boolean getAllNetworksFromCache;
        public final boolean includeOtherUidNetworks;
        public final boolean requestVPN;

        /* JADX INFO: Access modifiers changed from: private */
        public NetworkChangeDetector.NetworkInformation networkToInfo(Network network) {
            SB4 sb4;
            NetworkState networkState;
            NetworkChangeDetector.ConnectionType connectionType;
            if (network == null || (sb4 = this.connectivityManager) == null) {
                return null;
            }
            LinkProperties linkProperties = sb4.A00.getLinkProperties(network);
            if (linkProperties != null && linkProperties.getInterfaceName() != null && (connectionType = NetworkMonitorAutoDetect.getConnectionType((networkState = getNetworkState(network)))) != NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
                if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN || connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                    network.toString();
                    boolean z = Logging.loggingEnabled;
                }
                return new NetworkChangeDetector.NetworkInformation(linkProperties.getInterfaceName(), connectionType, NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), network.getNetworkHandle(), getIPAddresses(linkProperties));
            }
            network.toString();
            boolean z2 = Logging.loggingEnabled;
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ConnectivityManagerDelegate(android.content.Context r6, java.util.Set r7, java.lang.String r8) {
            /*
                r5 = this;
                java.lang.String r4 = "NetworkMonitorAutoDetect"
                r0 = 0
                X.C14360o3.A0B(r6, r0)
                java.lang.String r0 = "connectivity"
                java.lang.Object r1 = r6.getSystemService(r0)
                boolean r0 = r1 instanceof android.net.ConnectivityManager
                r3 = 0
                if (r0 == 0) goto L1e
                android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                if (r1 == 0) goto L1e
                X.SB4 r3 = new X.SB4
                r3.<init>(r1)
            L1a:
                r5.<init>(r3, r7, r8)
                return
            L1e:
                java.lang.String r2 = "ConnectivityManagerProxy.Factory(NoOp)"
                java.lang.Object[] r1 = new java.lang.Object[]{r4}
                java.lang.String r0 = "%s: ConnectivityManagerProxy init failed"
                X.C0K8.A0O(r2, r0, r1)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate.<init>(android.content.Context, java.util.Set, java.lang.String):void");
        }

        public static boolean checkFieldTrial(String str, String str2, boolean z) {
            if (str.contains(AnonymousClass001.A0R(str2, ":true"))) {
                return true;
            }
            if (!str.contains(AnonymousClass001.A0R(str2, ":false"))) {
                return z;
            }
            return false;
        }

        public NetworkRequest createNetworkRequest() {
            NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
            if (this.requestVPN) {
                addCapability.removeCapability(15);
            }
            if (Build.VERSION.SDK_INT >= 31 && this.includeOtherUidNetworks) {
                addCapability.setIncludeOtherUidNetworks(true);
            }
            return addCapability.build();
        }

        public List getActiveNetworkList() {
            if (!AbstractC167007dF.A1W(this.connectivityManager)) {
                return null;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Network network : getAllNetworks()) {
                NetworkChangeDetector.NetworkInformation networkToInfo = networkToInfo(network);
                if (networkToInfo != null) {
                    A1E.add(networkToInfo);
                }
            }
            return A1E;
        }

        public Network[] getAllNetworks() {
            Network[] networkArr;
            SB4 sb4 = this.connectivityManager;
            if (sb4 == null) {
                return new Network[0];
            }
            if (AbstractC167007dF.A1W(sb4) && this.getAllNetworksFromCache) {
                synchronized (this.availableNetworks) {
                    networkArr = (Network[]) this.availableNetworks.toArray(new Network[0]);
                }
                return networkArr;
            }
            return sb4.A00.getAllNetworks();
        }

        public long getDefaultNetId() {
            NetworkInfo activeNetworkInfo;
            NetworkInfo networkInfo;
            if (!AbstractC167007dF.A1W(this.connectivityManager) || (activeNetworkInfo = this.connectivityManager.A00.getActiveNetworkInfo()) == null) {
                return -1L;
            }
            long j = -1;
            for (Network network : getAllNetworks()) {
                if (hasInternetCapability(network) && (networkInfo = this.connectivityManager.A00.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                    if (j == -1) {
                        j = network.getNetworkHandle();
                    } else {
                        throw AbstractC166987dD.A18("Multiple connected networks of same type are not supported.");
                    }
                }
            }
            return j;
        }

        public NetworkState getNetworkState(Network network) {
            SB4 sb4;
            NetworkInfo activeNetworkInfo;
            boolean isConnected;
            int i;
            int type;
            int subtype;
            if (network != null && (sb4 = this.connectivityManager) != null) {
                NetworkInfo networkInfo = sb4.A00.getNetworkInfo(network);
                if (networkInfo == null) {
                    network.toString();
                    boolean z = Logging.loggingEnabled;
                } else {
                    if (networkInfo.getType() != 17) {
                        NetworkCapabilities networkCapabilities = this.connectivityManager.A00.getNetworkCapabilities(network);
                        if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                            isConnected = networkInfo.isConnected();
                            i = -1;
                            type = networkInfo.getType();
                            subtype = networkInfo.getSubtype();
                            return new NetworkState(isConnected, 17, i, type, subtype);
                        }
                        return getNetworkState(networkInfo);
                    }
                    if (networkInfo.getType() == 17) {
                        if (network.equals(this.connectivityManager.A00.getActiveNetwork()) && (activeNetworkInfo = this.connectivityManager.A00.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 17) {
                            isConnected = networkInfo.isConnected();
                            i = -1;
                            type = activeNetworkInfo.getType();
                            subtype = activeNetworkInfo.getSubtype();
                            return new NetworkState(isConnected, 17, i, type, subtype);
                        }
                        return new NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                    }
                    return getNetworkState(networkInfo);
                }
            }
            return new NetworkState(false, -1, -1, -1, -1);
        }

        public boolean hasInternetCapability(Network network) {
            NetworkCapabilities networkCapabilities;
            SB4 sb4 = this.connectivityManager;
            if (sb4 == null || (networkCapabilities = sb4.A00.getNetworkCapabilities(network)) == null || !networkCapabilities.hasCapability(12)) {
                return false;
            }
            return true;
        }

        public void registerNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            SB4 sb4 = this.connectivityManager;
            NetworkRequest createNetworkRequest = createNetworkRequest();
            AbstractC167017dG.A1N(createNetworkRequest, networkCallback);
            sb4.A00.registerNetworkCallback(createNetworkRequest, networkCallback);
        }

        public void releaseCallback(ConnectivityManager.NetworkCallback networkCallback) {
            if (AbstractC167007dF.A1W(this.connectivityManager)) {
                boolean z = Logging.loggingEnabled;
                SB4 sb4 = this.connectivityManager;
                C14360o3.A0B(networkCallback, 0);
                sb4.A00.unregisterNetworkCallback(networkCallback);
            }
        }

        public void requestMobileNetwork(ConnectivityManager.NetworkCallback networkCallback) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            SB4 sb4 = this.connectivityManager;
            NetworkRequest build = builder.build();
            AbstractC167007dF.A1K(build, networkCallback);
            sb4.A00.requestNetwork(build, networkCallback);
        }

        public boolean supportNetworkCallback() {
            return AbstractC167007dF.A1W(this.connectivityManager);
        }

        public NetworkChangeDetector.IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[linkProperties.getLinkAddresses().size()];
            Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            int i = 0;
            while (it.hasNext()) {
                iPAddressArr[i] = new NetworkChangeDetector.IPAddress(it.next().getAddress().getAddress());
                i++;
            }
            return iPAddressArr;
        }

        public ConnectivityManagerDelegate(SB4 sb4, Set set, String str) {
            this.connectivityManager = sb4;
            this.availableNetworks = set;
            this.getAllNetworksFromCache = checkFieldTrial(str, "getAllNetworksFromCache", false);
            this.requestVPN = checkFieldTrial(str, "requestVPN", false);
            this.includeOtherUidNetworks = checkFieldTrial(str, "includeOtherUidNetworks", false);
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            if (networkInfo != null && networkInfo.isConnected()) {
                return new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
            }
            return new NetworkState(false, -1, -1, -1, -1);
        }

        public NetworkState getNetworkState() {
            SB4 sb4 = this.connectivityManager;
            if (sb4 == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return getNetworkState(sb4.A00.getActiveNetworkInfo());
        }
    }

    /* loaded from: classes10.dex */
    public class NetworkState {
        public final boolean connected;
        public final int subtype;
        public final int type;
        public final int underlyingNetworkSubtypeForVpn;
        public final int underlyingNetworkTypeForVpn;

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }

        public NetworkState(boolean z, int i, int i2, int i3, int i4) {
            this.connected = z;
            this.type = i;
            this.subtype = i2;
            this.underlyingNetworkTypeForVpn = i3;
            this.underlyingNetworkSubtypeForVpn = i4;
        }
    }

    /* loaded from: classes10.dex */
    public class SimpleNetworkCallback extends ConnectivityManager.NetworkCallback {
        public final Set availableNetworks;

        public SimpleNetworkCallback(Set set) {
            this.availableNetworks = set;
        }

        private void onNetworkChanged(Network network) {
            NetworkChangeDetector.NetworkInformation networkToInfo = NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (networkToInfo != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(networkToInfo);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            boolean z = Logging.loggingEnabled;
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            network.toString();
            boolean z = Logging.loggingEnabled;
            synchronized (this.availableNetworks) {
                this.availableNetworks.add(network);
            }
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            networkCapabilities.toString();
            boolean z = Logging.loggingEnabled;
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            network.toString();
            boolean z = Logging.loggingEnabled;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            network.toString();
            boolean z = Logging.loggingEnabled;
            synchronized (this.availableNetworks) {
                this.availableNetworks.remove(network);
            }
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(network.getNetworkHandle());
        }
    }

    /* loaded from: classes10.dex */
    public class WifiDirectManagerDelegate extends BroadcastReceiver {
        public static final int WIFI_P2P_NETWORK_HANDLE = 0;
        public final Context context;
        public final NetworkChangeDetector.Observer observer;
        public NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        private void onWifiP2pStateChange(int i) {
            if (i == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onWifiP2pGroupChange, reason: merged with bridge method [inline-methods] */
        public void m124x61cecc50(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null) {
                try {
                    ArrayList list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                    NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        iPAddressArr[i] = new NetworkChangeDetector.IPAddress(((InetAddress) list.get(i)).getAddress());
                    }
                    NetworkChangeDetector.NetworkInformation networkInformation = new NetworkChangeDetector.NetworkInformation(wifiP2pGroup.getInterface(), NetworkChangeDetector.ConnectionType.CONNECTION_WIFI, NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0L, iPAddressArr);
                    this.wifiP2pNetworkInfo = networkInformation;
                    this.observer.onNetworkConnect(networkInformation);
                } catch (SocketException e) {
                    boolean z = Logging.loggingEnabled;
                    e.toString();
                    Logging.getStackTraceString(e);
                }
            }
        }

        public List getActiveNetworkList() {
            NetworkChangeDetector.NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            if (networkInformation != null) {
                return Collections.singletonList(networkInformation);
            }
            return Collections.emptyList();
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }

        public WifiDirectManagerDelegate(NetworkChangeDetector.Observer observer, Context context) {
            this.context = context;
            this.observer = observer;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context.registerReceiver(this, intentFilter);
            if (Build.VERSION.SDK_INT > 28) {
                WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
                wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new WifiP2pManager.GroupInfoListener() { // from class: org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate$$ExternalSyntheticLambda0
                    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                        NetworkMonitorAutoDetect.WifiDirectManagerDelegate.this.m124x61cecc50(wifiP2pGroup);
                    }
                });
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int A04 = AbstractC58318PtA.A04(this, context, intent, -637725672);
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                m124x61cecc50((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
            C0f9.A0E(1469359775, A04, intent);
        }
    }

    /* loaded from: classes10.dex */
    public class WifiManagerDelegate {
        public final Context context;

        public String getWifiSSID() {
            WifiInfo wifiInfo;
            String ssid;
            Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null && (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) != null && (ssid = wifiInfo.getSSID()) != null) {
                return ssid;
            }
            return "";
        }

        public WifiManagerDelegate(Context context) {
            this.context = context;
        }

        public WifiManagerDelegate() {
            this.context = null;
        }
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.connected, networkState.type, networkState.subtype);
    }

    public static NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        if (networkState.type != 17) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        return getConnectionType(networkState.connected, networkState.underlyingNetworkTypeForVpn, networkState.underlyingNetworkSubtypeForVpn);
    }

    private void registerReceiver() {
        if (!this.isRegistered) {
            this.isRegistered = true;
            this.context.registerReceiver(this, this.intentFilter);
        }
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    @Override // org.webrtc.NetworkChangeDetector
    public void destroy() {
        ConnectivityManager.NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = this.mobileNetworkCallback;
        if (networkCallback2 != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback2);
        }
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            wifiDirectManagerDelegate.release();
        }
        unregisterReceiver();
    }

    @Override // org.webrtc.NetworkChangeDetector
    public List getActiveNetworkList() {
        List activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        ArrayList A1F = AbstractC166987dD.A1F(activeNetworkList);
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate == null) {
            return A1F;
        }
        A1F.addAll(wifiDirectManagerDelegate.getActiveNetworkList());
        return A1F;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return getConnectionType(this.connectivityManagerDelegate.getNetworkState());
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public boolean supportNetworkCallback() {
        return AbstractC167007dF.A1W(this.connectivityManagerDelegate.connectivityManager);
    }

    public NetworkMonitorAutoDetect(NetworkChangeDetector.Observer observer, Context context) {
        HashSet A1H = AbstractC166987dD.A1H();
        this.availableNetworks = A1H;
        this.observer = observer;
        this.context = context;
        ConnectivityManagerDelegate connectivityManagerDelegate = new ConnectivityManagerDelegate(context, A1H, ((NetworkMonitor.AnonymousClass2) observer).val$fieldTrialsString);
        this.connectivityManagerDelegate = connectivityManagerDelegate;
        this.wifiManagerDelegate = new WifiManagerDelegate(context);
        NetworkState networkState = connectivityManagerDelegate.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        this.intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (includeWifiDirect) {
            this.wifiDirectManagerDelegate = new WifiDirectManagerDelegate(observer, context);
        }
        registerReceiver();
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (AbstractC167007dF.A1W(this.connectivityManagerDelegate.connectivityManager)) {
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
            try {
                this.connectivityManagerDelegate.requestMobileNetwork(networkCallback2);
                networkCallback = networkCallback2;
            } catch (SecurityException unused) {
                boolean z = Logging.loggingEnabled;
            }
            this.mobileNetworkCallback = networkCallback;
            SimpleNetworkCallback simpleNetworkCallback = new SimpleNetworkCallback(this.availableNetworks);
            this.allNetworkCallback = simpleNetworkCallback;
            this.connectivityManagerDelegate.registerNetworkCallback(simpleNetworkCallback);
            return;
        }
        this.mobileNetworkCallback = null;
        this.allNetworkCallback = null;
    }

    private void connectionTypeChanged(NetworkState networkState) {
        NetworkChangeDetector.ConnectionType connectionType = getConnectionType(networkState);
        String wifiSSID = getWifiSSID(networkState);
        if (connectionType == this.connectionType && wifiSSID.equals(this.wifiSSID)) {
            return;
        }
        this.connectionType = connectionType;
        this.wifiSSID = wifiSSID;
        boolean z = Logging.loggingEnabled;
        this.observer.onConnectionTypeChanged(connectionType);
    }

    private String getWifiSSID(NetworkState networkState) {
        if (getConnectionType(networkState) != NetworkChangeDetector.ConnectionType.CONNECTION_WIFI) {
            return "";
        }
        return this.wifiManagerDelegate.getWifiSSID();
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    public static void setIncludeWifiDirect(boolean z) {
        includeWifiDirect = z;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1282974911);
        NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(networkState);
        }
        C0f9.A0E(1231747851, A04, intent);
    }

    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.connectivityManagerDelegate = connectivityManagerDelegate;
    }

    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.wifiManagerDelegate = wifiManagerDelegate;
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(boolean z, int i, int i2) {
        if (!z) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 6) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 17) {
                                return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
                            }
                            return NetworkChangeDetector.ConnectionType.CONNECTION_VPN;
                        }
                        return NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET;
                    }
                    return NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH;
                }
            } else {
                return NetworkChangeDetector.ConnectionType.CONNECTION_WIFI;
            }
        } else {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 14:
                case Process.SIGTERM /* 15 */:
                case 17:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_3G;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 18:
                    break;
                case Process.SIGSTOP /* 19 */:
                default:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                case 20:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_5G;
            }
        }
        return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
    }
}
