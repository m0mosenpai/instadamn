package com.instagram.react.modules.product;

import X.R3M;
import com.facebook.fbreact.specs.NativeIGPostInsightsReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGPostInsightsReactModule")
/* loaded from: classes10.dex */
public class IgReactPostInsightsModule extends NativeIGPostInsightsReactModuleSpec {
    public static final String MODULE_NAME = "IGPostInsightsReactModule";

    @Override // com.facebook.fbreact.specs.NativeIGPostInsightsReactModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGPostInsightsReactModule";
    }

    public IgReactPostInsightsModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeIGPostInsightsReactModuleSpec
    public void didFinishLoading(double d) {
        getCurrentActivity();
    }

    @Override // com.facebook.fbreact.specs.NativeIGPostInsightsReactModuleSpec
    public void toggleNavigationBar(double d, boolean z) {
        getCurrentActivity();
    }
}
