package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import X.AbstractC16490ru;
import X.AnonymousClass001;
import X.C14360o3;
import X.C1XY;
import X.EnumC150606qD;
import X.EnumC150616qF;
import X.InterfaceC150566q9;
import X.MSV;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class AnalyticsLoggerImpl extends AnalyticsLogger {
    public AndroidAsyncExecutorFactory mAsyncExecutorFactory;
    public InterfaceC150566q9 mCameraARAnalyticsLogger;
    public final C1XY mCameraARBugReportLogger;
    public final CameraARCrashMetadataLogger mCrashMetadataLogger;
    public EnumC150616qF mEffectStartIntent;
    public final EnumC150606qD mOptimizedPerfLoggerOption;
    public String mProductName;

    public native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, int i);

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public String getEffectStartIntentString() {
        int ordinal = this.mEffectStartIntent.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return "unknown";
            }
            return "system";
        }
        return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public String getProductName() {
        return this.mProductName;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public XAnalyticsHolder getXAnalytics() {
        InterfaceC150566q9 interfaceC150566q9 = this.mCameraARAnalyticsLogger;
        if (interfaceC150566q9 != null) {
            return interfaceC150566q9.CI2();
        }
        return null;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void logForBugReport(String str, String str2) {
        String str3;
        C1XY c1xy = this.mCameraARBugReportLogger;
        if (c1xy != null) {
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            Map map = c1xy.A00;
            if (map.containsKey(str)) {
                str3 = AbstractC16490ru.A0p(AnonymousClass001.A0g("\n   ", (String) map.get(str), "\n   \n   "));
            } else {
                str3 = "";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(MSV.A00(608));
            Date date = new Date(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(simpleDateFormat.format(date));
            sb.append("]: ");
            sb.append(str2);
            map.put(str, AnonymousClass001.A0R(str3, sb.toString()));
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void logRawEvent(String str, String str2) {
        InterfaceC150566q9 interfaceC150566q9 = this.mCameraARAnalyticsLogger;
        if (interfaceC150566q9 != null) {
            interfaceC150566q9.DQM(str, str2);
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void logSessionEvent(boolean z) {
        InterfaceC150566q9 interfaceC150566q9 = this.mCameraARAnalyticsLogger;
        if (interfaceC150566q9 != null) {
            interfaceC150566q9.DQN(z);
        }
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null && !z) {
            cameraARCrashMetadataLogger.cleanupBreakpadData();
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger
    public void setBreakpadData(String str, String str2) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null) {
            cameraARCrashMetadataLogger.setBreakpadData(str, str2);
        }
    }

    public AnalyticsLoggerImpl(InterfaceC150566q9 interfaceC150566q9, C1XY c1xy, EnumC150606qD enumC150606qD) {
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(Executors.newScheduledThreadPool(1));
        this.mAsyncExecutorFactory = androidAsyncExecutorFactory2;
        this.mCameraARAnalyticsLogger = interfaceC150566q9;
        this.mProductName = interfaceC150566q9.BhE();
        this.mCameraARBugReportLogger = c1xy;
        this.mCrashMetadataLogger = new CameraARCrashMetadataLogger();
        this.mEffectStartIntent = EnumC150616qF.NONE;
        this.mOptimizedPerfLoggerOption = enumC150606qD;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory2, enumC150606qD.A00);
    }
}
