package com.facebook.fbreact.specs;

import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeImageLoaderAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImageLoader";

    @ReactMethod
    public abstract void abortRequest(double d);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod
    public abstract void getSize(String str, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void getSizeWithHeaders(String str, ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void prefetchImage(String str, double d, InterfaceC65622ToD interfaceC65622ToD);

    @ReactMethod
    public abstract void queryCache(ReadableArray readableArray, InterfaceC65622ToD interfaceC65622ToD);

    public NativeImageLoaderAndroidSpec(R3M r3m) {
        super(r3m);
    }
}
