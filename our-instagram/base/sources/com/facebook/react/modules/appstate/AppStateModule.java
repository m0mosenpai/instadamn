package com.facebook.react.modules.appstate;

import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.C05F;
import X.C14360o3;
import X.C62159S0g;
import X.InterfaceC65542TmH;
import X.InterfaceC65657Tqj;
import X.R3M;
import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "AppState")
/* loaded from: classes10.dex */
public final class AppStateModule extends NativeAppStateSpec implements InterfaceC65542TmH {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    public static final C62159S0g Companion = new Object();
    public static final String INITIAL_STATE = "initialAppState";
    public static final String NAME = "AppState";
    public String appState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStateModule(R3M r3m) {
        super(r3m);
        String str;
        C14360o3.A0B(r3m, 1);
        r3m.A0A(this);
        r3m.A0D.add(this);
        if (r3m.A07 == C05F.A0C) {
            str = APP_STATE_ACTIVE;
        } else {
            str = APP_STATE_BACKGROUND;
        }
        this.appState = str;
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void getCurrentAppState(Callback callback, Callback callback2) {
        C14360o3.A0B(callback, 0);
        AbstractC58321PtD.A1K(callback, createAppStateEventMap());
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public Map getTypedExportedConstants() {
        return AbstractC167007dF.A0n(INITIAL_STATE, this.appState);
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
        this.appState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        this.appState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    private final InterfaceC65657Tqj createAppStateEventMap() {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString("app_state", this.appState);
        return A0c;
    }

    private final void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private final void sendEvent(String str, Object obj) {
        R3M A0b = AbstractC58321PtD.A0b(this);
        if (A0b != null && A0b.A0F()) {
            A0b.A0E(str, obj);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        AbstractC58321PtD.A0b(this).A0B(this);
    }

    public void onWindowFocusChange(boolean z) {
        sendEvent("appStateFocusChange", Boolean.valueOf(z));
    }
}
