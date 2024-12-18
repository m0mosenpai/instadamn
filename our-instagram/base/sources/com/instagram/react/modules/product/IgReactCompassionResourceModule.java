package com.instagram.react.modules.product;

import X.AbstractC167007dF;
import X.R3M;
import X.RunnableC64603TLo;
import com.facebook.fbreact.specs.NativeCompassionResourceModuleSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "CompassionResourceModule")
/* loaded from: classes10.dex */
public class IgReactCompassionResourceModule extends NativeCompassionResourceModuleSpec {
    public static final String MODULE_NAME = "CompassionResourceModule";

    @Override // com.facebook.fbreact.specs.NativeCompassionResourceModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CompassionResourceModule";
    }

    public IgReactCompassionResourceModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeCompassionResourceModuleSpec
    public void closeCompassionResource(double d) {
        AbstractC167007dF.A0J().post(new RunnableC64603TLo(this));
    }
}
