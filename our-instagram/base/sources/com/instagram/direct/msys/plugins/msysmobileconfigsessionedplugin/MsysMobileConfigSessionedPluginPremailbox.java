package com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin;

import X.AbstractC25225BEi;
import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class MsysMobileConfigSessionedPluginPremailbox extends Premailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysMobileConfigSessionedPluginPremailbox(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
    }

    @Override // com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin.Premailbox
    public void MsysMobileConfigSessionedPluginPremailboxExtensionsDestroy() {
    }

    @Override // com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin.Premailbox
    public boolean MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBoolean(long j, boolean z) {
        C06090Tz c06090Tz;
        UserSession userSession = this.mAppContext;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        C14360o3.A08(c06090Tz);
        return C18U.A06(c06090Tz, userSession, j);
    }

    @Override // com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin.Premailbox
    public double MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDouble(long j, boolean z) {
        C06090Tz c06090Tz;
        UserSession userSession = this.mAppContext;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        C14360o3.A08(c06090Tz);
        return C18U.A00(c06090Tz, userSession, j);
    }

    @Override // com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin.Premailbox
    public int MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32(long j, boolean z) {
        C06090Tz c06090Tz;
        UserSession userSession = this.mAppContext;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        C14360o3.A08(c06090Tz);
        return AbstractC25225BEi.A07(c06090Tz, userSession, j);
    }

    @Override // com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin.Premailbox
    public long MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64(long j, boolean z) {
        C06090Tz c06090Tz;
        UserSession userSession = this.mAppContext;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        C14360o3.A08(c06090Tz);
        return C18U.A01(c06090Tz, userSession, j);
    }

    @Override // com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin.Premailbox
    public String MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString(long j, boolean z) {
        C06090Tz c06090Tz;
        UserSession userSession = this.mAppContext;
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        C14360o3.A08(c06090Tz);
        return C18U.A04(c06090Tz, userSession, j);
    }
}
