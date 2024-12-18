package com.instagram.react.modules.product;

import X.AbstractC12990ll;
import X.C63255SgD;
import X.R3M;
import X.RunnableC64605TLq;
import com.facebook.fbreact.specs.NativeIGPurchaseProtectionSheetModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;

@ReactModule(name = "IGPurchaseProtectionSheetNativeModule")
/* loaded from: classes10.dex */
public class IgReactPurchaseProtectionSheetModule extends NativeIGPurchaseProtectionSheetModuleSpec {
    public static final String MODULE_NAME = "IGPurchaseProtectionSheetNativeModule";
    public final UserSession mUserSession;

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseProtectionSheetModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGPurchaseProtectionSheetNativeModule";
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseProtectionSheetModuleSpec
    public void openBottomSheet(double d) {
        C63255SgD.A01(new RunnableC64605TLq(this));
    }

    public IgReactPurchaseProtectionSheetModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mUserSession = (UserSession) abstractC12990ll;
    }
}
