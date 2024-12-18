package com.instagram.react.modules.product;

import X.AbstractC12990ll;
import X.AbstractC43592JPx;
import X.AbstractC58321PtD;
import X.AnonymousClass780;
import X.C14360o3;
import X.C63255SgD;
import X.InterfaceC65622ToD;
import X.R3M;
import X.TPB;
import com.facebook.fbreact.specs.NativeIGReactCountryCodeRouteSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGReactCountryCodeRoute")
/* loaded from: classes10.dex */
public class IgReactCountryCodeRoute extends NativeIGReactCountryCodeRouteSpec {
    public static final String MODULE_NAME = "IGReactCountryCodeRoute";
    public final AbstractC12990ll mSession;

    @Override // com.facebook.fbreact.specs.NativeIGReactCountryCodeRouteSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGReactCountryCodeRoute";
    }

    public IgReactCountryCodeRoute(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mSession = abstractC12990ll;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactCountryCodeRouteSpec
    public void extractCountryCodeAndNumber(String str, InterfaceC65622ToD interfaceC65622ToD) {
        String str2;
        int length;
        R3M A0b = AbstractC58321PtD.A0b(this);
        C14360o3.A0B(A0b, 0);
        String str3 = AnonymousClass780.A00(A0b).A00;
        String str4 = AnonymousClass780.A00(A0b).A01;
        String A00 = AnonymousClass780.A00(A0b).A00();
        if (str != null && str.length() != 0) {
            if (AbstractC43592JPx.A1a(str4, 1, str)) {
                length = str4.length();
            } else if (AbstractC43592JPx.A1a(A00, 1, str)) {
                length = A00.length();
            }
            str2 = AbstractC43592JPx.A0z(str, length);
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            A0c.putString("country", str3);
            A0c.putString("countryCode", str4);
            A0c.putString("phoneNumber", str2);
            interfaceC65622ToD.resolve(A0c);
        }
        str2 = "";
        WritableNativeMap A0c2 = AbstractC58321PtD.A0c();
        A0c2.putString("country", str3);
        A0c2.putString("countryCode", str4);
        A0c2.putString("phoneNumber", str2);
        interfaceC65622ToD.resolve(A0c2);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactCountryCodeRouteSpec
    public void presentCountryCodeSelector(String str, Callback callback) {
        if (AbstractC58321PtD.A0b(this).A01() != null) {
            C63255SgD.A01(new TPB(callback, this));
        }
    }
}
