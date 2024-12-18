package com.facebook.advancedcryptotransport;

import X.C9AD;

/* loaded from: classes4.dex */
public class AppInstallContext {
    public static volatile boolean mIsApplicationFirstRunOnUpgrade;
    public static volatile boolean sShouldFailSendWithEmptyDeviceListEncryptionError;

    public static boolean isApplicationFirstRunOnUpgrade() {
        return mIsApplicationFirstRunOnUpgrade;
    }

    public static boolean shouldFailNextSendWithEmptyDeviceListEncryptionError() {
        boolean z = sShouldFailSendWithEmptyDeviceListEncryptionError;
        sShouldFailSendWithEmptyDeviceListEncryptionError = false;
        return z;
    }

    public static boolean shouldSimulateFutureVersion() {
        return false;
    }

    static {
        C9AD.A00();
    }
}
