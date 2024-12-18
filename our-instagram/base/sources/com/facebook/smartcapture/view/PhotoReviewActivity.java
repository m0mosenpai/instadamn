package com.facebook.smartcapture.view;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31180DnO;
import X.AbstractC43591JPw;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.EnumC61101RfG;
import X.EnumC61111RfR;
import X.K5U;
import X.MPV;
import X.MSY;
import X.S1P;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.R;
import com.facebook.smartcapture.logging.IdCaptureButton;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.ui.IdCaptureUi;

/* loaded from: classes10.dex */
public final class PhotoReviewActivity extends IdCaptureBaseActivity implements MPV {
    public K5U A00;
    public String A01;

    @Override // X.MPV
    public final void DYX() {
        setResult(0);
        finish();
        A02().logButtonClick(IdCaptureButton.RETAKE_PHOTO);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        K5U k5u = this.A00;
        if (k5u != null && k5u.A00()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.MPV
    public final void DYW() {
        Intent A04 = AbstractC31171DnF.A04();
        String str = this.A01;
        if (str != null) {
            A04.setData(AbstractC167007dF.A0I(str));
        }
        AbstractC31180DnO.A0y(this, A04);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-32020218);
        super.onCreate(bundle);
        setContentView(R.layout.photo_review_activity);
        Intent intent = getIntent();
        EnumC61101RfG enumC61101RfG = (EnumC61101RfG) intent.getSerializableExtra("capture_stage");
        if (enumC61101RfG != null) {
            this.A01 = S1P.A00(enumC61101RfG, A01());
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("skewed_crop_points");
            if (this.A07 != null && this.A01 != null) {
                String A002 = AbstractC43591JPw.A00(167);
                boolean booleanExtra = intent.getBooleanExtra(A002, false);
                try {
                    IdCaptureUi idCaptureUi = this.A07;
                    C14360o3.A0A(idCaptureUi);
                    K5U k5u = (K5U) idCaptureUi.Bcw().newInstance();
                    EnumC61111RfR A003 = A01().A00();
                    String str = this.A01;
                    C14360o3.A0A(str);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putSerializable(AbstractC43591JPw.A00(830), A003);
                    A0b.putSerializable("capture_stage", enumC61101RfG);
                    A0b.putString(AbstractC43591JPw.A00(1240), str);
                    A0b.putParcelableArray("skewed_crop_points", parcelableArrayExtra);
                    A0b.putString(AbstractC43591JPw.A00(1358), null);
                    A0b.putBoolean(A002, booleanExtra);
                    k5u.setArguments(A0b);
                    C14240no A0G = MSY.A0G(this);
                    A0G.A0A(k5u, R.id.photo_review_container);
                    A0G.A00();
                    this.A00 = k5u;
                } catch (IllegalAccessException | InstantiationException e) {
                    IdCaptureLogger A02 = A02();
                    String message = e.getMessage();
                    C14360o3.A0A(message);
                    A02.logError(message, e);
                }
                C0f9.A07(1100610643, A00);
                return;
            }
            A02().logError("IdCaptureUi and/or file path is null", null);
            throw AbstractC166987dD.A14("IdCaptureUi must not be null");
        }
        throw AbstractC166987dD.A12("CaptureStage is required");
    }
}
