package com.instagram.direct.msys.plugins.msyscomponentloggerplugin;

/* loaded from: classes3.dex */
public abstract class Sessionless {
    public abstract void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateBool(int i, int i2, String str, boolean z);

    public abstract void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateDouble(int i, int i2, String str, double d);

    public abstract void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateInt(int i, int i2, String str, long j);

    public abstract void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateString(int i, int i2, String str, String str2);

    public abstract void MCIComponentLogger_MCIComponentLoggerExtensionEnd(int i, int i2);

    public abstract void MCIComponentLogger_MCIComponentLoggerExtensionPoint(int i, int i2, String str);

    public abstract void MCIComponentLogger_MCIComponentLoggerExtensionStart(int i, int i2);

    private void MCIComponentLogger_MCIComponentLoggerExtensionEndJNI(int i, int i2) {
        MCIComponentLogger_MCIComponentLoggerExtensionEnd(i, i2);
    }

    private void MCIComponentLogger_MCIComponentLoggerExtensionStartJNI(int i, int i2) {
        MCIComponentLogger_MCIComponentLoggerExtensionStart(i, i2);
    }

    private void MCIComponentLogger_MCIComponentLoggerExtensionPointJNI(int i, int i2, String str) {
        MCIComponentLogger_MCIComponentLoggerExtensionPoint(i, i2, str);
    }

    private void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateBoolJNI(int i, int i2, String str, boolean z) {
        MCIComponentLogger_MCIComponentLoggerExtensionAnnotateBool(i, i2, str, z);
    }

    private void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateDoubleJNI(int i, int i2, String str, double d) {
        MCIComponentLogger_MCIComponentLoggerExtensionAnnotateDouble(i, i2, str, d);
    }

    private void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateIntJNI(int i, int i2, String str, long j) {
        MCIComponentLogger_MCIComponentLoggerExtensionAnnotateInt(i, i2, str, j);
    }

    private void MCIComponentLogger_MCIComponentLoggerExtensionAnnotateStringJNI(int i, int i2, String str, String str2) {
        MCIComponentLogger_MCIComponentLoggerExtensionAnnotateString(i, i2, str, str2);
    }
}
