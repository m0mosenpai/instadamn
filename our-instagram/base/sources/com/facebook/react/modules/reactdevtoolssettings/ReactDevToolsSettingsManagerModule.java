package com.facebook.react.modules.reactdevtoolssettings;

import X.AbstractC58318PtA;
import X.C14360o3;
import X.C62165S0m;
import X.R3M;
import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = NativeReactDevToolsSettingsManagerSpec.NAME)
/* loaded from: classes10.dex */
public final class ReactDevToolsSettingsManagerModule extends NativeReactDevToolsSettingsManagerSpec {
    public static final C62165S0m Companion = new Object();
    public static final String KEY_HOOK_SETTINGS = "HookSettings";
    public static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";
    public final SharedPreferences sharedPreferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactDevToolsSettingsManagerModule(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
        SharedPreferences A0F = AbstractC58318PtA.A0F(r3m, SHARED_PREFERENCES_PREFIX);
        C14360o3.A07(A0F);
        this.sharedPreferences = A0F;
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec
    public void setGlobalHookSettings(String str) {
        C14360o3.A0B(str, 0);
        AbstractC58318PtA.A1C(this.sharedPreferences.edit(), KEY_HOOK_SETTINGS, str);
    }

    @Override // com.facebook.fbreact.specs.NativeReactDevToolsSettingsManagerSpec
    public String getGlobalHookSettings() {
        return this.sharedPreferences.getString(KEY_HOOK_SETTINGS, null);
    }
}
