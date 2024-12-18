package com.facebook.fbreact.igford;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC61542RpM;
import X.C14360o3;
import X.C61770RtQ;
import X.InterfaceC65622ToD;
import X.R3M;
import X.Y4b;
import com.facebook.fbreact.specs.NativeIGFordDirectModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.ultralight.UL;
import java.util.Map;

@ReactModule(name = "IGFordDirectModule")
/* loaded from: classes10.dex */
public final class ReactIGFordDirectModule extends NativeIGFordDirectModuleSpec {
    public static final C61770RtQ Companion = new Object();
    public static final String NAME = "IGFordDirectModule";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactIGFordDirectModule(R3M r3m) {
        super(r3m);
        C14360o3.A0B(r3m, 1);
        AbstractC61542RpM.A00 = r3m;
    }

    @Override // com.facebook.fbreact.specs.NativeIGFordDirectModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeIGFordDirectModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeIGFordDirectModuleSpec
    public Map getTypedExportedConstants() {
        Y4b.A00(UL.id._UL__ULSEP_com_oculus_igd_bootstrap_IgvrBootstrapManager_ULSEP_BINDING_ID);
        throw AbstractC166987dD.A15("isIGDBuild");
    }

    @Override // com.facebook.fbreact.specs.NativeIGFordDirectModuleSpec
    public void getString(String str, InterfaceC65622ToD interfaceC65622ToD) {
        interfaceC65622ToD.resolve(AbstractC166997dE.A0z("%s-back", AbstractC166997dE.A1b(str, AbstractC167017dG.A1a(str, interfaceC65622ToD) ? 1 : 0)));
    }
}
