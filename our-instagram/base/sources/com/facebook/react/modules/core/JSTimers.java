package com.facebook.react.modules.core;

import X.InterfaceC65656Tqi;
import com.facebook.react.bridge.JavaScriptModule;

/* loaded from: classes10.dex */
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d);

    void callTimers(InterfaceC65656Tqi interfaceC65656Tqi);

    void emitTimeDriftWarning(String str);
}
