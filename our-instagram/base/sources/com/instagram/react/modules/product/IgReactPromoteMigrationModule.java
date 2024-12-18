package com.instagram.react.modules.product;

import X.C18C;
import X.InterfaceC72021XFj;
import X.R3M;
import X.XFZ;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeIGPromoteMigrationReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

@ReactModule(name = "IGPromoteMigrationReactModule")
/* loaded from: classes11.dex */
public class IgReactPromoteMigrationModule extends NativeIGPromoteMigrationReactModuleSpec {
    public static final String MODULE_NAME = "IGPromoteMigrationReactModule";

    @Override // com.facebook.fbreact.specs.NativeIGPromoteMigrationReactModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGPromoteMigrationReactModule";
    }

    public IgReactPromoteMigrationModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeIGPromoteMigrationReactModuleSpec
    public void postDataFromCreateEditAudienceScreen(double d, String str) {
        if (!TextUtils.isEmpty(str)) {
            C18C.A0G(getCurrentActivity() instanceof PromoteActivity, "module must be managed by PromoteActivity to get current PromoteState");
            PromoteData BiY = ((InterfaceC72021XFj) getCurrentActivity()).BiY();
            PromoteState Bia = ((XFZ) getCurrentActivity()).Bia();
            Bia.A09(BiY, str);
            Bia.A0C(false);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIGPromoteMigrationReactModuleSpec
    public void postDataFromDestinationWebsiteScreen(double d, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C18C.A0G(getCurrentActivity() instanceof PromoteActivity, "module must be managed by PromoteActivity to get current PromoteState");
            PromoteData BiY = ((InterfaceC72021XFj) getCurrentActivity()).BiY();
            ((XFZ) getCurrentActivity()).Bia().A04(XIGIGBoostDestination.A0E, BiY);
            BiY.A0b = XIGIGBoostCallToAction.valueOf(str2);
            BiY.A1I = str;
        }
    }
}
