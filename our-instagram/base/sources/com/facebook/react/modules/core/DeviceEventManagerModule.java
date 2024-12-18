package com.facebook.react.modules.core;

import X.AbstractC05810Sj;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C62162S0j;
import X.InterfaceC65357Til;
import X.R3M;
import X.RunnableC64572TKj;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DeviceEventManager")
/* loaded from: classes10.dex */
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    public static final C62162S0j Companion = new Object();
    public static final String NAME = "DeviceEventManager";
    public final Runnable invokeDefaultBackPressRunnable;

    /* loaded from: classes10.dex */
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public void emitNewIntentReceived(Uri uri) {
        C14360o3.A0B(uri, 0);
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString("url", uri.toString());
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("url", A0c);
        }
    }

    public DeviceEventManagerModule(R3M r3m, InterfaceC65357Til interfaceC65357Til) {
        super(r3m);
        this.invokeDefaultBackPressRunnable = new RunnableC64572TKj(interfaceC65357Til);
    }

    public void emitHardwareBackPressed() {
        R3M reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("hardwareBackPress", null);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceEventManagerSpec
    public void invokeDefaultBackPressHandler() {
        R3M A0b = AbstractC58321PtD.A0b(this);
        Runnable runnable = this.invokeDefaultBackPressRunnable;
        MessageQueueThread messageQueueThread = A0b.A05;
        AbstractC05810Sj.A00(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }
}
