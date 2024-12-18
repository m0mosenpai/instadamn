package com.instagram.react.modules.base;

import X.AbstractC12990ll;
import X.AbstractC13670mt;
import X.AbstractC166987dD;
import X.C1HO;
import X.C1Q2;
import X.MSV;
import X.R3M;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbreact.specs.NativeRelayConfigSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "RelayAPIConfig")
/* loaded from: classes10.dex */
public final class RelayAPIConfigModule extends NativeRelayConfigSpec implements CallerContextable {
    public static final String API_PATH = "/api/v1/ads/";
    public static final CallerContext CALLER_CONTEXT = CallerContext.A00(RelayAPIConfigModule.class);
    public static final String GRAPHQL_URL = "%s%s/?locale=%s";
    public static final String MODULE_NAME = "RelayAPIConfig";
    public final AbstractC12990ll mSession;

    @Override // com.facebook.fbreact.specs.NativeRelayConfigSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RelayAPIConfig";
    }

    @Override // com.facebook.fbreact.specs.NativeRelayConfigSpec
    public Map getTypedExportedConstants() {
        String A03 = C1HO.A03(API_PATH);
        String A00 = C1Q2.A00();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("fetchTimeout", 30000);
        A1G.put("retryDelays", 1000);
        A1G.put("graphBatchURI", AbstractC13670mt.A06(GRAPHQL_URL, A03, "graphqlbatch", A00));
        A1G.put("graphURI", AbstractC13670mt.A06(GRAPHQL_URL, A03, MSV.A00(455), A00));
        return A1G;
    }

    public RelayAPIConfigModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mSession = abstractC12990ll;
    }
}
