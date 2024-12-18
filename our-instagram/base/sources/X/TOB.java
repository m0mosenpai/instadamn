package X;

import android.content.Intent;
import android.os.Parcelable;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import com.facebook.smartcapture.view.PhotoReviewActivity;

/* loaded from: classes10.dex */
public final class TOB implements Runnable {
    public final /* synthetic */ EnumC61101RfG A00;
    public final /* synthetic */ IdCaptureActivity A01;

    public TOB(EnumC61101RfG enumC61101RfG, IdCaptureActivity idCaptureActivity) {
        this.A01 = idCaptureActivity;
        this.A00 = enumC61101RfG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IdCaptureStep idCaptureStep;
        IdCaptureStep idCaptureStep2;
        IdCaptureActivity idCaptureActivity = this.A01;
        EnumC61101RfG enumC61101RfG = this.A00;
        int ordinal = enumC61101RfG.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                idCaptureStep = IdCaptureStep.SECOND_PHOTO_CAPTURE;
                idCaptureStep2 = IdCaptureStep.SECOND_PHOTO_CONFIRMATION;
            } else {
                IllegalArgumentException A0M = AbstractC37303Gc4.A0M(enumC61101RfG, "Unsupported stage: ", AbstractC166987dD.A1C());
                idCaptureActivity.A02().logError("Camera initialization error", A0M);
                throw A0M;
            }
        } else {
            idCaptureStep = IdCaptureStep.FIRST_PHOTO_CAPTURE;
            idCaptureStep2 = IdCaptureStep.FIRST_PHOTO_CONFIRMATION;
        }
        if (idCaptureActivity.A06) {
            ((IdCaptureBaseActivity) idCaptureActivity).A04 = idCaptureStep2;
            idCaptureActivity.A00 = AbstractC167007dF.A0I(S1P.A00(enumC61101RfG, idCaptureActivity.A01()));
            C64094SzB c64094SzB = idCaptureActivity.A03;
            if (c64094SzB == null) {
                C14360o3.A0F("presenter");
                throw C00O.createAndThrow();
            }
            c64094SzB.A02();
            return;
        }
        IdCaptureConfig A01 = idCaptureActivity.A01();
        DocumentType documentType = ((IdCaptureBaseActivity) idCaptureActivity).A01;
        Boolean valueOf = Boolean.valueOf(idCaptureActivity.A05);
        Intent A08 = MSW.A08(idCaptureActivity, PhotoReviewActivity.class);
        A08.putExtra("capture_stage", enumC61101RfG);
        A08.putExtra("id_capture_config", A01);
        A08.putExtra("preset_document_type", documentType);
        A08.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, idCaptureStep);
        A08.putExtra("skewed_crop_points", (Parcelable[]) null);
        A08.putExtra(AbstractC43591JPw.A00(167), valueOf);
        ((IdCaptureBaseActivity) idCaptureActivity).A04 = idCaptureStep2;
        idCaptureActivity.startActivityForResult(A08, 1);
    }
}
