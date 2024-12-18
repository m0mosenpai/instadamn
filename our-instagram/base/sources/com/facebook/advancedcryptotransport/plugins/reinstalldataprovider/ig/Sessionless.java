package com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.ig;

/* loaded from: classes4.dex */
public abstract class Sessionless {
    public abstract int IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(String str, String str2);

    public abstract boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderIsRegistrationIDChanged(String str, String str2);

    public abstract boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(String str, String str2, String str3);

    private int IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalledJNI(String str, String str2) {
        return IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(str, str2);
    }

    private boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderIsRegistrationIDChangedJNI(String str, String str2) {
        return IGReinstallDataProviderImpl_MEMReinstallDataProviderIsRegistrationIDChanged(str, str2);
    }

    private boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstallJNI(String str, String str2, String str3) {
        return IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(str, str2, str3);
    }
}
