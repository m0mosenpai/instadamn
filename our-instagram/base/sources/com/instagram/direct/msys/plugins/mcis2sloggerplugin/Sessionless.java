package com.instagram.direct.msys.plugins.mcis2sloggerplugin;

/* loaded from: classes4.dex */
public abstract class Sessionless {
    public abstract void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionAnnotationBoolean(String str, String str2, boolean z);

    public abstract void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPoint(String str, String str2);

    public abstract void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPointWithData(String str, String str2, String str3);

    public abstract void MCIS2SLoggerPluginImpl_MCIS2SLoggerMCCError(String str, long j, long j2, long j3, int i);

    private void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionAnnotationBooleanJNI(String str, String str2, boolean z) {
        MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionAnnotationBoolean(str, str2, z);
    }

    private void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPointJNI(String str, String str2) {
        MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPoint(str, str2);
    }

    private void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPointWithDataJNI(String str, String str2, String str3) {
        MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPointWithData(str, str2, str3);
    }

    private void MCIS2SLoggerPluginImpl_MCIS2SLoggerMCCErrorJNI(String str, long j, long j2, long j3, int i) {
        MCIS2SLoggerPluginImpl_MCIS2SLoggerMCCError(str, j, j2, j3, i);
    }
}
