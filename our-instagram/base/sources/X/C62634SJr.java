package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.PermissionsActivity;

/* renamed from: X.SJr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62634SJr {
    public final Intent A00(Context context, DocumentType documentType, IdCaptureConfig idCaptureConfig, IdCaptureStep idCaptureStep) {
        Intent A08;
        AbstractC167017dG.A1O(context, documentType);
        if (!idCaptureConfig.A0K && C02G.A00(context, AbstractC62318S6o.A00[0]) != 0) {
            A08 = MSW.A08(context, PermissionsActivity.class);
            A08.putExtra("id_capture_config", idCaptureConfig);
            A08.putExtra("preset_document_type", documentType);
        } else {
            A08 = MSW.A08(context, IdCaptureActivity.class);
            A08.putExtra("preset_document_type", documentType);
            A08.putExtra("id_capture_config", idCaptureConfig);
        }
        A08.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, idCaptureStep);
        return A08;
    }
}
