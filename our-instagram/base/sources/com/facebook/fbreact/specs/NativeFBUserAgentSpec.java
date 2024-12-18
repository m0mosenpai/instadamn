package com.facebook.fbreact.specs;

import X.R3M;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeFBUserAgentSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "FBUserAgent";

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void getWebViewLikeUserAgent(Callback callback);

    public NativeFBUserAgentSpec(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
