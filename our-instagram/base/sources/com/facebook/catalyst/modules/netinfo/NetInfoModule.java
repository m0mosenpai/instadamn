package com.facebook.catalyst.modules.netinfo;

import X.AbstractC05810Sj;
import X.AbstractC166997dE;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C61748Rt3;
import X.InterfaceC65542TmH;
import X.InterfaceC65622ToD;
import X.InterfaceC65657Tqj;
import X.Q1j;
import X.R3M;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.fbreact.specs.NativeNetInfoSpec;
import com.facebook.forker.Process;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Locale;

@ReactModule(name = "NetInfo")
/* loaded from: classes10.dex */
public final class NetInfoModule extends NativeNetInfoSpec implements InterfaceC65542TmH {
    public static final String CONNECTION_TYPE_BLUETOOTH = "bluetooth";
    public static final String CONNECTION_TYPE_CELLULAR = "cellular";
    public static final String CONNECTION_TYPE_ETHERNET = "ethernet";
    public static final String CONNECTION_TYPE_NONE = "none";
    public static final String CONNECTION_TYPE_NONE_DEPRECATED = "NONE";
    public static final String CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String CONNECTION_TYPE_UNKNOWN_DEPRECATED = "UNKNOWN";
    public static final String CONNECTION_TYPE_WIFI = "wifi";
    public static final String CONNECTION_TYPE_WIMAX = "wimax";
    public static final C61748Rt3 Companion = new Object();
    public static final String EFFECTIVE_CONNECTION_TYPE_2G = "2g";
    public static final String EFFECTIVE_CONNECTION_TYPE_3G = "3g";
    public static final String EFFECTIVE_CONNECTION_TYPE_4G = "4g";
    public static final String EFFECTIVE_CONNECTION_TYPE_UNKNOWN = "unknown";
    public static final String ERROR_MISSING_PERMISSION = "E_MISSING_PERMISSION";
    public static final String MISSING_PERMISSION_MESSAGE = "To use NetInfo on Android, add the following to your AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />";
    public static final String NAME = "NetInfo";
    public String _effectiveConnectionType;
    public String connectionType;
    public final Q1j connectivityBroadcastReceiver;
    public String connectivityDeprecated;
    public final ConnectivityManager connectivityManager;
    public boolean noNetworkPermission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetInfoModule(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
        Object systemService = r3m.getBaseContext().getSystemService("connectivity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.connectivityBroadcastReceiver = new Q1j(this);
        this.connectivityDeprecated = "UNKNOWN";
        this.connectionType = "unknown";
        this._effectiveConnectionType = "unknown";
    }

    @Override // com.facebook.fbreact.specs.NativeNetInfoSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeNetInfoSpec
    public void getCurrentConnectivity(InterfaceC65622ToD interfaceC65622ToD) {
        C14360o3.A0B(interfaceC65622ToD, 0);
        if (this.noNetworkPermission) {
            interfaceC65622ToD.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            interfaceC65622ToD.resolve(createConnectivityEventMap());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeNetInfoSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NetInfo";
    }

    @Override // com.facebook.fbreact.specs.NativeNetInfoSpec
    public void isConnectionMetered(InterfaceC65622ToD interfaceC65622ToD) {
        C14360o3.A0B(interfaceC65622ToD, 0);
        if (this.noNetworkPermission) {
            interfaceC65622ToD.reject(ERROR_MISSING_PERMISSION, MISSING_PERMISSION_MESSAGE);
        } else {
            interfaceC65622ToD.resolve(Boolean.valueOf(this.connectivityManager.isActiveNetworkMetered()));
        }
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
    }

    @Override // com.facebook.fbreact.specs.NativeNetInfoSpec
    public void removeListeners(double d) {
    }

    private final String getCurrentConnectionType() {
        NetworkInfo activeNetworkInfo;
        String str = "UNKNOWN";
        try {
            activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        } catch (SecurityException unused) {
            this.noNetworkPermission = true;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (ConnectivityManager.isNetworkTypeValid(activeNetworkInfo.getType())) {
                String typeName = activeNetworkInfo.getTypeName();
                C14360o3.A07(typeName);
                Locale locale = Locale.getDefault();
                C14360o3.A07(locale);
                str = AbstractC166997dE.A10(locale, typeName);
                return str;
            }
            return str;
        }
        return CONNECTION_TYPE_NONE_DEPRECATED;
    }

    private final void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 34) {
            R3M r3m = this.mReactApplicationContext;
            AbstractC05810Sj.A01(r3m, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            if (r3m.getApplicationInfo().targetSdkVersion >= 34) {
                R3M r3m2 = this.mReactApplicationContext;
                AbstractC05810Sj.A01(r3m2, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
                r3m2.registerReceiver(this.connectivityBroadcastReceiver, intentFilter, 2);
                this.connectivityBroadcastReceiver.A00 = true;
                updateAndSendConnectionType();
            }
        }
        AbstractC58321PtD.A0b(this).registerReceiver(this.connectivityBroadcastReceiver, intentFilter);
        this.connectivityBroadcastReceiver.A00 = true;
        updateAndSendConnectionType();
    }

    private final void unregisterReceiver() {
        if (this.connectivityBroadcastReceiver.A00) {
            AbstractC58321PtD.A0b(this).unregisterReceiver(this.connectivityBroadcastReceiver);
            this.connectivityBroadcastReceiver.A00 = false;
        }
    }

    private final InterfaceC65657Tqj createConnectivityEventMap() {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString("network_info", this.connectivityDeprecated);
        A0c.putString("connectionType", this.connectionType);
        A0c.putString("effectiveConnectionType", this._effectiveConnectionType);
        return A0c;
    }

    private final String getEffectiveConnectionType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return EFFECTIVE_CONNECTION_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
                return EFFECTIVE_CONNECTION_TYPE_3G;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
                return EFFECTIVE_CONNECTION_TYPE_4G;
            default:
                return "unknown";
        }
    }

    private final void sendConnectivityChangedEvent() {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null && (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A03(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) != null) {
            rCTDeviceEventEmitter.emit("networkStatusDidChange", createConnectivityEventMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateAndSendConnectionType() {
        /*
            r5 = this;
            java.lang.String r3 = "unknown"
            r4 = 1
            android.net.ConnectivityManager r0 = r5.connectivityManager     // Catch: java.lang.SecurityException -> L41
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L41
            if (r2 == 0) goto L3c
            boolean r0 = r2.isConnected()     // Catch: java.lang.SecurityException -> L41
            if (r0 == 0) goto L3c
            int r1 = r2.getType()     // Catch: java.lang.SecurityException -> L41
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            r0 = 4
            if (r1 == r0) goto L35
            r0 = 9
            if (r1 == r0) goto L2e
            r0 = 6
            if (r1 == r0) goto L2a
            r0 = 7
            if (r1 != r0) goto L43
            java.lang.String r0 = "bluetooth"
            goto L3e
        L2a:
            java.lang.String r0 = "wimax"
            goto L3e
        L2e:
            java.lang.String r0 = "ethernet"
            goto L3e
        L31:
            java.lang.String r0 = "wifi"
            goto L3e
        L35:
            java.lang.String r0 = "cellular"
            java.lang.String r2 = r5.getEffectiveConnectionType(r2)     // Catch: java.lang.SecurityException -> L41
            goto L3f
        L3c:
            java.lang.String r0 = "none"
        L3e:
            r2 = r3
        L3f:
            r3 = r0
            goto L44
        L41:
            r5.noNetworkPermission = r4
        L43:
            r2 = r3
        L44:
            java.lang.String r1 = r5.getCurrentConnectionType()
            java.lang.String r0 = r5.connectionType
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L60
            java.lang.String r0 = r5._effectiveConnectionType
            boolean r0 = X.AbstractC002300n.A0g(r2, r0, r4)
            if (r0 == 0) goto L60
            java.lang.String r0 = r5.connectivityDeprecated
            boolean r0 = X.AbstractC002300n.A0g(r1, r0, r4)
            if (r0 != 0) goto L69
        L60:
            r5.connectionType = r3
            r5._effectiveConnectionType = r2
            r5.connectivityDeprecated = r1
            r5.sendConnectivityChangedEvent()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.modules.netinfo.NetInfoModule.updateAndSendConnectionType():void");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        AbstractC58321PtD.A0b(this).A0A(this);
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
        unregisterReceiver();
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        registerReceiver();
    }
}
