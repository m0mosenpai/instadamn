package com.facebook.react.bridge;

import X.AbstractC166987dD;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.R3M;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";
    public CxxCallbackImpl mEventEmitterCallback;
    public final R3M mReactApplicationContext;

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    public Map getConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void invalidate() {
    }

    public /* synthetic */ void onCatalystInstanceDestroy() {
    }

    public final R3M getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.A0F()) {
            return this.mReactApplicationContext;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", AbstractC166987dD.A18(AnonymousClass001.A0R("React Native Instance has already disappeared: requested by ", getName())));
        return null;
    }

    public BaseJavaModule(R3M r3m) {
        this.mReactApplicationContext = r3m;
    }

    private final void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    public final R3M getReactApplicationContext() {
        return AbstractC58321PtD.A0b(this);
    }

    public BaseJavaModule() {
        this(null);
    }
}
