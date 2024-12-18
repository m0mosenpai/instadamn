package com.facebook.browser.helium.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class PrivilegedProcessService0 extends Service {
    public ChildProcessServiceBridge A00 = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ChildProcessServiceBridge childProcessServiceBridge = this.A00;
        if (childProcessServiceBridge != null) {
            return childProcessServiceBridge.onBind(intent);
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            ChildProcessServiceBridge childProcessServiceBridge = (ChildProcessServiceBridge) Class.forName("com.facebook.browser.helium.webview.HeliumChildProcessService").getMethod("create", Service.class).invoke(null, this);
            this.A00 = childProcessServiceBridge;
            if (childProcessServiceBridge != null) {
                childProcessServiceBridge.onCreate();
                return;
            }
            throw new RuntimeException("HeliumChildProcessService.create returned null");
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to lookup service implementation in Voltron", e);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ChildProcessServiceBridge childProcessServiceBridge = this.A00;
        if (childProcessServiceBridge != null) {
            childProcessServiceBridge.onDestroy();
            this.A00 = null;
        }
    }
}
