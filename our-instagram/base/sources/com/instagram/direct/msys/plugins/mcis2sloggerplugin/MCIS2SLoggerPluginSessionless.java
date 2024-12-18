package com.instagram.direct.msys.plugins.mcis2sloggerplugin;

import X.AbstractC47197KtW;
import X.C163307Sp;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;

/* loaded from: classes4.dex */
public final class MCIS2SLoggerPluginSessionless extends Sessionless {
    @Override // com.instagram.direct.msys.plugins.mcis2sloggerplugin.Sessionless
    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionAnnotationBoolean(String str, String str2, boolean z) {
        UserSession userSession;
        IGFOAMessagingSendToSentLogger A00;
        if (str != null && str2 != null && (userSession = AbstractC47197KtW.A00) != null && (A00 = C163307Sp.A00(userSession, str.hashCode())) != null) {
            A00.onLogPlatformLayerAnnotationBoolean(str2, z);
        }
    }

    @Override // com.instagram.direct.msys.plugins.mcis2sloggerplugin.Sessionless
    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPoint(String str, String str2) {
        UserSession userSession;
        IGFOAMessagingSendToSentLogger A00;
        if (str != null && str2 != null && (userSession = AbstractC47197KtW.A00) != null && (A00 = C163307Sp.A00(userSession, str.hashCode())) != null) {
            A00.onLogPlatformLayerPoints(str2, null);
        }
    }

    @Override // com.instagram.direct.msys.plugins.mcis2sloggerplugin.Sessionless
    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerExtensionPointWithData(String str, String str2, String str3) {
        IGFOAMessagingSendToSentLogger A00;
        IGFOAMessagingSendToSentLogger A002;
        if (str != null && str2 != null) {
            UserSession userSession = AbstractC47197KtW.A00;
            if (str3 != null) {
                if (userSession != null && (A002 = C163307Sp.A00(userSession, str.hashCode())) != null) {
                    A002.onLogPlatformLayerPoints(str2, str3);
                    return;
                }
                return;
            }
            if (userSession == null || (A00 = C163307Sp.A00(userSession, str.hashCode())) == null) {
                return;
            }
            A00.onLogPlatformLayerPoints(str2, null);
        }
    }

    @Override // com.instagram.direct.msys.plugins.mcis2sloggerplugin.Sessionless
    public void MCIS2SLoggerPluginImpl_MCIS2SLoggerMCCError(String str, long j, long j2, long j3, int i) {
        UserSession userSession;
        IGFOAMessagingSendToSentLogger A00;
        if (str != null && (userSession = AbstractC47197KtW.A00) != null && (A00 = C163307Sp.A00(userSession, str.hashCode())) != null) {
            A00.onLogMCCErrors(j, j2, j3, i);
        }
    }
}
