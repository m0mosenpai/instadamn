package com.facebook.fbreact.specs;

import X.C00O;
import X.InterfaceC65622ToD;
import X.R3M;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class NativeIGFordDirectModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "IGFordDirectModule";

    @ReactMethod
    public abstract void addListener(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGFordDirectModule";
    }

    @ReactMethod
    public abstract void getString(String str, InterfaceC65622ToD interfaceC65622ToD);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void removeListeners(double d);

    public NativeIGFordDirectModuleSpec(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map getConstants() {
        getTypedExportedConstants();
        throw C00O.createAndThrow();
    }
}
