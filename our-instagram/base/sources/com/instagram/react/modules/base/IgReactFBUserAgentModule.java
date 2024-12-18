package com.instagram.react.modules.base;

import X.AbstractC166987dD;
import X.AbstractC58321PtD;
import X.C1FO;
import X.R3M;
import com.facebook.fbreact.specs.NativeFBUserAgentSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "FBUserAgent")
/* loaded from: classes10.dex */
public class IgReactFBUserAgentModule extends NativeFBUserAgentSpec {
    public static final String NAME = "FBUserAgent";

    @Override // com.facebook.fbreact.specs.NativeFBUserAgentSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FBUserAgent";
    }

    public IgReactFBUserAgentModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeFBUserAgentSpec
    public Map getTypedExportedConstants() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("webViewLikeUserAgent", C1FO.A00());
        return A1G;
    }

    @Override // com.facebook.fbreact.specs.NativeFBUserAgentSpec
    public void getWebViewLikeUserAgent(Callback callback) {
        AbstractC58321PtD.A1K(callback, C1FO.A00());
    }
}
