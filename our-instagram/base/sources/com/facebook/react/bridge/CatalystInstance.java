package com.facebook.react.bridge;

import X.InterfaceC65214Tg5;
import X.InterfaceC65351Tif;
import X.InterfaceC65353Tih;
import X.InterfaceC65354Tii;

/* loaded from: classes10.dex */
public interface CatalystInstance extends InterfaceC65351Tif, InterfaceC65353Tih, InterfaceC65354Tii {
    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    JavaScriptModule getJSModule(Class cls);

    NativeModule getNativeModule(Class cls);

    @Override // X.InterfaceC65353Tih
    void invokeCallback(int i, InterfaceC65214Tg5 interfaceC65214Tg5);

    void registerSegment(int i, String str);
}
