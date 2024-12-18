package com.facebook.react.uimanager;

import X.C09170dP;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.RuntimeExecutor;

/* loaded from: classes10.dex */
public final class UIConstantsProviderBinding {
    public static final UIConstantsProviderBinding INSTANCE = new Object();

    /* loaded from: classes10.dex */
    public interface ConstantsForViewManagerProvider {
        NativeMap getConstantsForViewManager(String str);
    }

    /* loaded from: classes10.dex */
    public interface ConstantsProvider {
        NativeMap getConstants();
    }

    /* loaded from: classes10.dex */
    public interface DefaultEventTypesProvider {
        NativeMap getDefaultEventTypes();
    }

    public static final native void install(RuntimeExecutor runtimeExecutor, DefaultEventTypesProvider defaultEventTypesProvider, ConstantsForViewManagerProvider constantsForViewManagerProvider, ConstantsProvider constantsProvider);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.uimanager.UIConstantsProviderBinding, java.lang.Object] */
    static {
        C09170dP.A0C("uimanagerjni");
    }
}
