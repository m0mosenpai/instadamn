package com.instagram.debug.devoptions.sandboxselector;

import X.C14360o3;
import X.C1HO;

/* loaded from: classes11.dex */
public final class SandboxUrlHelper {
    public final String getParsedHostLoggingServerUrl(String str) {
        C14360o3.A0B(str, 0);
        String A04 = C1HO.A04(str);
        C14360o3.A07(A04);
        return A04;
    }

    public final String getParsedHostServerUrl(String str) {
        C14360o3.A0B(str, 0);
        String A05 = C1HO.A05(str);
        C14360o3.A07(A05);
        return A05;
    }

    public final String getDefaultInstagramHost() {
        return "i.instagram.com";
    }

    public final void clearCachedDevServerSetting() {
        C1HO.A07();
    }
}
