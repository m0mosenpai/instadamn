package com.facebook.fbreact.specs;

import X.C00O;
import X.InterfaceC65656Tqi;
import X.InterfaceC65657Tqj;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* loaded from: classes10.dex */
public abstract class NativeRelayChunkedPrefetcherSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RelayChunkedPrefetcher";

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String generateHashWithActorID(String str, String str2, ReadableMap readableMap);

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract InterfaceC65656Tqi getPrefetchedQueryIDs();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract InterfaceC65657Tqj provideResponseIfAvailableSync(String str);

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeRelayChunkedPrefetcherSpec(R3M r3m) {
        throw C00O.createAndThrow();
    }
}
