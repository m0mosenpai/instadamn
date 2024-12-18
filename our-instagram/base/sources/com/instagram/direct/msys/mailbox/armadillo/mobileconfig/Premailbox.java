package com.instagram.direct.msys.mailbox.armadillo.mobileconfig;

import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public abstract class Premailbox {
    public UserSession mAppContext;

    private String MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyStringJNI(int i, String str, boolean z) {
        if (str == null) {
            str = null;
        }
        String MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyString = MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyString(i, str, z);
        if (MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyString != null) {
            return MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyString;
        }
        return null;
    }

    public abstract String MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyString(int i, String str, boolean z);

    public abstract boolean MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetBoolean(int i, boolean z, boolean z2);

    public abstract double MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetDouble(int i, double d, boolean z);

    public abstract int MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt32(int i, int i2, boolean z);

    public abstract long MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt64(int i, long j, boolean z);

    public abstract void MEMMobileConfigPlatformIgdAndroidPluginPremailboxExtensionsDestroy();

    public Premailbox(UserSession userSession) {
        this.mAppContext = userSession;
    }

    private boolean MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetBooleanJNI(int i, boolean z, boolean z2) {
        return MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetBoolean(i, z, z2);
    }

    private double MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetDoubleJNI(int i, double d, boolean z) {
        return MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetDouble(i, d, z);
    }

    private int MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt32JNI(int i, int i2, boolean z) {
        return MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt32(i, i2, z);
    }

    private long MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt64JNI(int i, long j, boolean z) {
        return MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt64(i, j, z);
    }
}
