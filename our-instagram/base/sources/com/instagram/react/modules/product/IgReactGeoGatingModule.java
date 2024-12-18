package com.instagram.react.modules.product;

import X.AbstractC166987dD;
import X.AbstractC23021Ah;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C14360o3;
import X.C23031Ai;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.R3M;
import android.os.Bundle;
import com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

@ReactModule(name = "IGGeoGatingReactModule")
/* loaded from: classes10.dex */
public class IgReactGeoGatingModule extends NativeIGGeoGatingReactModuleSpec {
    public static final String FRAGMENT_ARGUMENTS = "fragment_arguments";
    public static final String MODULE_NAME = "IGGeoGatingReactModule";
    public UserSession mUserSession;

    @Override // com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGGeoGatingReactModule";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1vN] */
    @Override // com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec
    public void updateGeoGatingSettings(boolean z, ReadableArray readableArray, String str) {
        UserSession userSession = this.mUserSession;
        if (userSession != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            A00.A14(str, z);
            HashSet A1H = AbstractC166987dD.A1H();
            for (int i = 0; i < readableArray.size(); i++) {
                A1H.add(readableArray.getString(i));
            }
            C14360o3.A0B(str, 0);
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.EEj(AnonymousClass001.A0R(str, "_limit_location_list"));
            ARD.apply();
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.E7L(AnonymousClass001.A0R(str, "_limit_location_list"), A1H);
            ARD2.apply();
            if (str.equals("feed")) {
                AbstractC25651Mw.A00(userSession).A05(new Object());
            }
        }
    }

    public IgReactGeoGatingModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeIGGeoGatingReactModuleSpec
    public void setupNativeModule() {
        UserSession userSession;
        if (AbstractC58321PtD.A0b(this).A01() != null && AbstractC58321PtD.A0b(this).A01().getIntent() != null) {
            Bundle A0A = AbstractC31173DnH.A0A(AbstractC58321PtD.A0b(this).A01());
            A0A.getClass();
            if (A0A.getBundle(FRAGMENT_ARGUMENTS) != null) {
                A0A = A0A.getBundle(FRAGMENT_ARGUMENTS);
            }
            userSession = AbstractC31171DnF.A0G(A0A);
        } else {
            userSession = null;
        }
        this.mUserSession = userSession;
    }
}
