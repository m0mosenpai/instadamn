package com.instagram.react.modules.base;

import X.AbstractC19750y3;
import X.InterfaceC65622ToD;
import X.R3M;
import android.content.Context;
import com.facebook.fbreact.specs.NativeIGSharedPreferencesModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGSharedPreferencesModule")
/* loaded from: classes10.dex */
public class IgSharedPreferencesModule extends NativeIGSharedPreferencesModuleSpec {
    public static final String MODULE_NAME = "IGSharedPreferencesModule";
    public Context mContext;

    @Override // com.facebook.fbreact.specs.NativeIGSharedPreferencesModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGSharedPreferencesModule";
    }

    @Override // com.facebook.fbreact.specs.NativeIGSharedPreferencesModuleSpec
    public void getBoolean(String str, String str2, boolean z, InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(Boolean.valueOf(AbstractC19750y3.A00(this.mContext, str).getBoolean(str2, z)));
    }

    @Override // com.facebook.fbreact.specs.NativeIGSharedPreferencesModuleSpec
    public void getString(String str, String str2, String str3, InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(AbstractC19750y3.A00(this.mContext, str).getString(str2, str3));
    }

    public IgSharedPreferencesModule(R3M r3m) {
        super(r3m);
        this.mContext = r3m.getApplicationContext();
    }
}
