package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.view.SelfieCaptureActivity;
import com.facebook.smartcapture.view.SelfieCapturePermissionsActivity;

/* loaded from: classes10.dex */
public abstract class S1Q {
    public static final Intent A00(Context context, SelfieCaptureConfig selfieCaptureConfig, SelfieCaptureStep selfieCaptureStep) {
        if (C02G.A00(context, AbstractC62318S6o.A00[0]) != 0) {
            Intent A08 = MSW.A08(context, SelfieCapturePermissionsActivity.class);
            A08.putExtra("selfie_capture_config", selfieCaptureConfig);
            A08.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
            return A08;
        }
        Intent A082 = MSW.A08(context, SelfieCaptureActivity.class);
        A082.putExtra("selfie_capture_config", selfieCaptureConfig);
        A082.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, selfieCaptureStep);
        return A082;
    }
}
