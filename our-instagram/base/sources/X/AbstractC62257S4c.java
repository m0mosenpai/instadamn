package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.smartcapture.capture.SelfieEvidenceRecorderProvider;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.view.SelfieOnboardingActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.S4c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62257S4c {
    public static Intent A00(Context context, SelfieEvidenceRecorderProvider selfieEvidenceRecorderProvider, ChallengeProvider challengeProvider, EnumC61132Rfm enumC61132Rfm, FaceTrackerModelsProvider faceTrackerModelsProvider, FaceTrackerProvider faceTrackerProvider, SmartCaptureLoggerProvider smartCaptureLoggerProvider, ResourcesProvider resourcesProvider, StringOverrideFactory stringOverrideFactory, SelfieCaptureUi selfieCaptureUi, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, long j, boolean z, boolean z2) {
        if (challengeProvider != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            if (map != null) {
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    AbstractC31179DnN.A0o(A0b, A15);
                }
            }
            StringOverrideFactory stringOverrideFactory2 = null;
            HashSet A1H = AbstractC166987dD.A1H();
            C14360o3.A0A(selfieEvidenceRecorderProvider);
            C14360o3.A0A(challengeProvider);
            C14360o3.A0A(str4);
            AbstractC63311ShH.A04(str4, "product");
            if (!A1H.contains("designSystem")) {
                A1H = AbstractC31171DnF.A0k(A1H);
                A1H.add("designSystem");
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (stringOverrideFactory != null) {
                stringOverrideFactory2 = stringOverrideFactory;
                if (!A1H.contains("stringOverrideFactory")) {
                    A1H = AbstractC31171DnF.A0k(A1H);
                    A1H.add("stringOverrideFactory");
                }
            }
            SelfieCaptureConfig selfieCaptureConfig = new SelfieCaptureConfig(A0b, selfieEvidenceRecorderProvider, challengeProvider, enumC61132Rfm, faceTrackerModelsProvider, faceTrackerProvider, smartCaptureLoggerProvider, resourcesProvider, stringOverrideFactory2, selfieCaptureUi, bool, bool3, valueOf, bool2, bool4, num, num2, str, str2, str3, str4, str5, str6, A1H, i, j, z2);
            if (!S1M.A00(selfieCaptureConfig, new C62430SBf(context))) {
                return S1Q.A00(context, selfieCaptureConfig, SelfieCaptureStep.INITIAL);
            }
            SelfieCaptureStep selfieCaptureStep = SelfieCaptureStep.INITIAL;
            Intent A08 = MSW.A08(context, SelfieOnboardingActivity.class);
            A08.putExtra("selfie_capture_config", selfieCaptureConfig);
            A08.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
            return A08;
        }
        throw AbstractC166987dD.A12("Required value was null.");
    }
}
