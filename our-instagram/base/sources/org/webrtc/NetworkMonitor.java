package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25229BEm;
import X.AbstractC58318PtA;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.NetworkChangeDetector;

/* loaded from: classes10.dex */
public class NetworkMonitor {
    public static final String TAG = "NetworkMonitor";
    public volatile NetworkChangeDetector.ConnectionType currentConnectionType;
    public final ArrayList nativeNetworkObservers;
    public NetworkChangeDetector networkChangeDetector;
    public NetworkChangeDetectorFactory networkChangeDetectorFactory;
    public final Object networkChangeDetectorLock;
    public final ArrayList networkObservers;
    public int numObservers;

    /* renamed from: org.webrtc.NetworkMonitor$2, reason: invalid class name */
    /* loaded from: classes10.dex */
    public class AnonymousClass2 extends NetworkChangeDetector.Observer {
        public final /* synthetic */ String val$fieldTrialsString;

        public AnonymousClass2(String str) {
            this.val$fieldTrialsString = str;
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public String getFieldTrialsString() {
            return this.val$fieldTrialsString;
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
            NetworkMonitor.this.updateCurrentConnectionType(connectionType);
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
            NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onNetworkDisconnect(long j) {
            NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j);
        }

        @Override // org.webrtc.NetworkChangeDetector.Observer
        public void onNetworkPreference(List list, int i) {
            NetworkMonitor.this.notifyObserversOfNetworkPreference(list, i);
        }
    }

    /* loaded from: classes10.dex */
    public class InstanceHolder {
        public static final NetworkMonitor instance = new NetworkMonitor();
    }

    /* loaded from: classes10.dex */
    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType);
    }

    @Deprecated
    public static void init(Context context) {
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkChangeDetector.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j, NetworkChangeDetector.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkPreference(long j, NetworkChangeDetector.ConnectionType connectionType, int i);

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        InstanceHolder.instance.addObserver(networkObserver);
    }

    public static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static void assertIsTrue(boolean z) {
        if (z) {
        } else {
            throw AbstractC58318PtA.A0W("Expected to be true");
        }
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context, String str) {
        NetworkMonitor networkMonitor = InstanceHolder.instance;
        NetworkChangeDetector createNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context, str);
        networkMonitor.networkChangeDetector = createNetworkChangeDetector;
        return (NetworkMonitorAutoDetect) createNetworkChangeDetector;
    }

    private NetworkChangeDetector createNetworkChangeDetector(Context context, String str) {
        return this.networkChangeDetectorFactory.create(new AnonymousClass2(str), context);
    }

    private NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    public static boolean isOnline() {
        return AbstractC25229BEm.A1a(InstanceHolder.instance.currentConnectionType, NetworkChangeDetector.ConnectionType.CONNECTION_NONE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean networkBindingSupported() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.networkChangeDetectorLock
            monitor-enter(r2)
            org.webrtc.NetworkChangeDetector r0 = r3.networkChangeDetector     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Le
            boolean r1 = r0.supportNetworkCallback()     // Catch: java.lang.Throwable -> L11
            r0 = 1
            if (r1 != 0) goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitor.networkBindingSupported():boolean");
    }

    private void notifyObserversOfConnectionTypeChange(NetworkChangeDetector.ConnectionType connectionType) {
        ArrayList A1F;
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyConnectionTypeChanged(((Long) it.next()).longValue());
            }
        }
        synchronized (this.networkObservers) {
            A1F = AbstractC166987dD.A1F(this.networkObservers);
        }
        Iterator it2 = A1F.iterator();
        while (it2.hasNext()) {
            ((NetworkObserver) it2.next()).onConnectionTypeChanged(connectionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyOfNetworkConnect(((Long) it.next()).longValue(), networkInformation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkDisconnect(long j) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = this.nativeNetworkObservers.iterator();
            while (it.hasNext()) {
                nativeNotifyOfNetworkDisconnect(((Long) it.next()).longValue(), j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkPreference(List list, int i) {
        synchronized (this.nativeNetworkObservers) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NetworkChangeDetector.ConnectionType connectionType = (NetworkChangeDetector.ConnectionType) it.next();
                Iterator it2 = this.nativeNetworkObservers.iterator();
                while (it2.hasNext()) {
                    nativeNotifyOfNetworkPreference(((Long) it2.next()).longValue(), connectionType, i);
                }
            }
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        InstanceHolder.instance.removeObserver(networkObserver);
    }

    private void stopMonitoring(long j) {
        boolean z = Logging.loggingEnabled;
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j) {
        List activeNetworkList;
        synchronized (this.networkChangeDetectorLock) {
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            if (networkChangeDetector == null) {
                activeNetworkList = null;
            } else {
                activeNetworkList = networkChangeDetector.getActiveNetworkList();
            }
        }
        if (activeNetworkList != null) {
            nativeNotifyOfActiveNetworkList(j, (NetworkChangeDetector.NetworkInformation[]) activeNetworkList.toArray(new NetworkChangeDetector.NetworkInformation[activeNetworkList.size()]));
        }
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkChangeDetector getNetworkChangeDetector() {
        NetworkChangeDetector networkChangeDetector;
        synchronized (this.networkChangeDetectorLock) {
            networkChangeDetector = this.networkChangeDetector;
        }
        return networkChangeDetector;
    }

    public int getNumObservers() {
        int i;
        synchronized (this.networkChangeDetectorLock) {
            i = this.numObservers;
        }
        return i;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(NetworkChangeDetectorFactory networkChangeDetectorFactory) {
        assertIsTrue(AbstractC167007dF.A1N(this.numObservers));
        this.networkChangeDetectorFactory = networkChangeDetectorFactory;
    }

    public void startMonitoring(Context context, String str) {
        synchronized (this.networkChangeDetectorLock) {
            this.numObservers++;
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            if (networkChangeDetector == null) {
                networkChangeDetector = createNetworkChangeDetector(context, str);
                this.networkChangeDetector = networkChangeDetector;
            }
            this.currentConnectionType = networkChangeDetector.getCurrentConnectionType();
        }
    }

    public NetworkMonitor() {
        this.networkChangeDetectorFactory = new NetworkChangeDetectorFactory() { // from class: org.webrtc.NetworkMonitor.1
            @Override // org.webrtc.NetworkChangeDetectorFactory
            public NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context) {
                return new NetworkMonitorAutoDetect(observer, context);
            }
        };
        this.networkChangeDetectorLock = AbstractC58318PtA.A0b();
        this.nativeNetworkObservers = AbstractC166987dD.A1E();
        this.networkObservers = AbstractC166987dD.A1E();
        this.numObservers = 0;
        this.currentConnectionType = NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    private void startMonitoring(Context context, long j, String str) {
        boolean z = Logging.loggingEnabled;
        if (context == null) {
            context = ContextUtils.applicationContext;
        }
        startMonitoring(context, str);
        synchronized (this.nativeNetworkObservers) {
            AbstractC166997dE.A1X(this.nativeNetworkObservers, j);
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            int i = this.numObservers - 1;
            this.numObservers = i;
            if (i == 0) {
                this.networkChangeDetector.destroy();
                this.networkChangeDetector = null;
            }
        }
    }

    @Deprecated
    public void startMonitoring(Context context) {
        startMonitoring(context, "");
    }

    @Deprecated
    public void startMonitoring() {
        startMonitoring(ContextUtils.applicationContext, "");
    }
}
