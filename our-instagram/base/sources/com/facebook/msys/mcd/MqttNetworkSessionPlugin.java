package com.facebook.msys.mcd;

import X.C137306Jk;
import X.C14360o3;
import X.C45323K4a;
import X.C47617L1c;
import X.C48221LVv;
import X.C4Q5;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class MqttNetworkSessionPlugin {
    public static MqttNetworkSessionPlugin sInstance;
    public volatile C47617L1c mMqttClientCallbacks;
    public final NativeHolder mNativeHolder = initNativeHolder();

    private native NativeHolder initNativeHolder();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttConnected();

    private native void onMqttConnectedAggressive();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttConnecting();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttDisconnected();

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPubAck(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPubAckTimeout(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPubError(int i, String str, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onMqttPublishReceived(String str, byte[] bArr);

    private native void registerNative(NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, Mailbox mailbox, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    private native void unregisterNative(NetworkSession networkSession, AuthData authData);

    public void register(C47617L1c c47617L1c, NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, Mailbox mailbox, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        mailbox.getClass();
        str.getClass();
        c47617L1c.getClass();
        this.mMqttClientCallbacks = c47617L1c;
        registerNative(networkSession, authData, notificationCenter, mailbox, str, z, z2, false, false, z5, false);
    }

    public static synchronized MqttNetworkSessionPlugin get() {
        MqttNetworkSessionPlugin mqttNetworkSessionPlugin;
        synchronized (MqttNetworkSessionPlugin.class) {
            mqttNetworkSessionPlugin = sInstance;
            if (mqttNetworkSessionPlugin == null) {
                mqttNetworkSessionPlugin = new MqttNetworkSessionPlugin();
                sInstance = mqttNetworkSessionPlugin;
            }
        }
        return mqttNetworkSessionPlugin;
    }

    public static boolean verifyAuthToken(String str) {
        if (str == null) {
            return false;
        }
        get().mMqttClientCallbacks.getClass();
        return true;
    }

    static {
        C137306Jk.A00();
    }

    public static void onCancelPublish(int i) {
        C47617L1c c47617L1c = get().mMqttClientCallbacks;
        c47617L1c.getClass();
        c47617L1c.A02.maybeCancelPendingPublish(i);
    }

    public static int onGetConnectionState() {
        C47617L1c c47617L1c = get().mMqttClientCallbacks;
        c47617L1c.getClass();
        int mqttTargetState = c47617L1c.A02.getMqttTargetState();
        if (mqttTargetState != 4) {
            if (mqttTargetState == 5) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    public static int onPublish(String str, int i, byte[] bArr) {
        C47617L1c c47617L1c = get().mMqttClientCallbacks;
        c47617L1c.getClass();
        C14360o3.A0B(str, 0);
        C14360o3.A0B(bArr, 2);
        int publishWithCallbacks = c47617L1c.A02.publishWithCallbacks(str, bArr, C4Q5.ACKNOWLEDGED_DELIVERY, new C48221LVv(c47617L1c));
        if (publishWithCallbacks == -1) {
            MqttNetworkSessionPlugin mqttNetworkSessionPlugin = c47617L1c.A01;
            int i2 = c47617L1c.A00 - 1;
            c47617L1c.A00 = i2;
            Execution.executeAsync(new C45323K4a(mqttNetworkSessionPlugin, "EXECUTION_EXCEPTION", i2), null, 3);
            return c47617L1c.A00;
        }
        return publishWithCallbacks;
    }

    public static void subscribeToTopic(String str) {
        get().mMqttClientCallbacks.getClass();
    }

    public static void unsubscribeFromTopic(String str) {
        get().mMqttClientCallbacks.getClass();
    }

    public void unregister(NetworkSession networkSession, AuthData authData) {
        unregisterNative(networkSession, authData);
    }
}
