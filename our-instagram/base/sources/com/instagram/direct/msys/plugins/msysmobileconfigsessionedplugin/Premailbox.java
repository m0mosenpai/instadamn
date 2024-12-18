package com.instagram.direct.msys.plugins.msysmobileconfigsessionedplugin;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class Premailbox {
    public UserSession mAppContext;

    public abstract boolean MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBoolean(long j, boolean z);

    public abstract double MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDouble(long j, boolean z);

    public abstract int MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32(long j, boolean z);

    public abstract long MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64(long j, boolean z);

    public abstract String MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString(long j, boolean z);

    public abstract void MsysMobileConfigSessionedPluginPremailboxExtensionsDestroy();

    public Premailbox(UserSession userSession) {
        this.mAppContext = userSession;
    }

    private boolean MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBooleanJNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetBoolean(j, z);
    }

    private double MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDoubleJNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetDouble(j, z);
    }

    private int MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32JNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt32(j, z);
    }

    private long MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64JNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetInt64(j, z);
    }

    private String MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetStringJNI(long j, boolean z) {
        return MsysMobileConfigSessionedImpl_MCIMobileConfigExtensionSessionedGetString(j, z);
    }
}
