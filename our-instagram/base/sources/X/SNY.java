package X;

import android.content.Intent;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.view.BaseSelfieCaptureActivity;
import com.facebook.smartcapture.view.SelfieReviewActivity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes10.dex */
public final class SNY {
    public final /* synthetic */ SN3 A00;
    public final /* synthetic */ C63962Swn A01;

    public final void A00(SelfieEvidence selfieEvidence) {
        BigDecimal scale;
        C14360o3.A0B(selfieEvidence, 0);
        C63962Swn c63962Swn = this.A01;
        Integer num = c63962Swn.A0A;
        if (num != C05F.A0N && num != C05F.A0C) {
            c63962Swn.A0F = false;
            Float f = selfieEvidence.A01;
            InMemoryLogger.LogEntryBuilder addEntry = c63962Swn.A0K.addEntry("VIDEO_RECORDED");
            if (f == null) {
                scale = null;
            } else {
                scale = BigDecimal.valueOf(f.floatValue()).setScale(2, RoundingMode.HALF_UP);
                C14360o3.A07(scale);
            }
            addEntry.put("duration", scale);
            addEntry.put("size", selfieEvidence.A05);
            addEntry.put(IgReactMediaPickerNativeModule.WIDTH, selfieEvidence.A04);
            addEntry.put(IgReactMediaPickerNativeModule.HEIGHT, selfieEvidence.A03);
            addEntry.put(TraceFieldType.Bitrate, selfieEvidence.A02);
            addEntry.submit();
            Object obj = (InterfaceC65372Tj4) c63962Swn.A0P.get();
            if (obj != null) {
                BaseSelfieCaptureActivity baseSelfieCaptureActivity = (BaseSelfieCaptureActivity) obj;
                if (baseSelfieCaptureActivity.A02().A06 == EnumC61132Rfm.A04) {
                    baseSelfieCaptureActivity.A04(selfieEvidence, null);
                    return;
                }
                SelfieCaptureConfig A02 = baseSelfieCaptureActivity.A02();
                SelfieCaptureStep selfieCaptureStep = SelfieCaptureStep.CAPTURE;
                Intent A08 = MSW.A08(baseSelfieCaptureActivity, SelfieReviewActivity.class);
                A08.putExtra("selfie_capture_config", A02);
                A08.putExtra("selfie_evidence", selfieEvidence);
                A08.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
                BaseSelfieCaptureActivity.A00(baseSelfieCaptureActivity).nextStep = SelfieCaptureStep.CONFIRMATION;
                baseSelfieCaptureActivity.startActivityForResult(A08, 1);
                return;
            }
            return;
        }
        this.A00.A00();
    }

    public SNY(SN3 sn3, C63962Swn c63962Swn) {
        this.A01 = c63962Swn;
        this.A00 = sn3;
    }

    public final void A01(Exception exc) {
        C63962Swn c63962Swn = this.A01;
        c63962Swn.A0F = false;
        c63962Swn.A0A = C05F.A0j;
        c63962Swn.A0L.logError("Selfie presenter: capture fail", exc);
        Object obj = (InterfaceC65372Tj4) c63962Swn.A0P.get();
        if (obj != null) {
            BaseSelfieCaptureActivity baseSelfieCaptureActivity = (BaseSelfieCaptureActivity) obj;
            if (baseSelfieCaptureActivity.getLifecycle().A07() == C07S.RESUMED) {
                baseSelfieCaptureActivity.finish();
            } else {
                baseSelfieCaptureActivity.A05("Capture failed after onPause", null);
            }
        }
    }
}
