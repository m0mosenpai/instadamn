package com.facebook.messenger.mcp.integration;

import X.C09170dP;
import com.facebook.msys.mci.AccountSession;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public class MCPPluginsRegistryIntegration {
    public static native void nativeDestroyMCPPluginsRegistry();

    public static native void nativePreregisterMCPPluginsRegistry();

    public static native void nativeRegisterAppAccountScope(AccountSession accountSession, UserSession userSession);

    static {
        C09170dP.A0C("messengermcppluginregistryintegrationjni");
    }
}
