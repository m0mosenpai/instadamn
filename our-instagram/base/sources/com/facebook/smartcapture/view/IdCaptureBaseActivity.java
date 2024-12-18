package com.facebook.smartcapture.view;

import X.AbstractC06930Yk;
import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC58323PtF;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C57549PgN;
import X.EnumC61101RfG;
import X.EnumC61146Rg7;
import X.InterfaceC09390do;
import X.InterfaceC65373Tj5;
import X.InterfaceC65501TlQ;
import X.InterfaceC65659Tqp;
import X.MRQ;
import X.S5Q;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.BaseLogger;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.ui.IdCaptureUi;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class IdCaptureBaseActivity extends FragmentActivity implements InterfaceC65501TlQ, InterfaceC65659Tqp {
    public Resources A00;
    public IdCaptureConfig A02;
    public IdCaptureLogger A03;
    public IdCaptureStep A04;
    public MRQ A06;
    public IdCaptureUi A07;
    public S5Q A08;
    public boolean A09;
    public DocumentType A01 = DocumentType.ID1;
    public IdCaptureStep A05 = IdCaptureStep.INITIAL;
    public final InterfaceC09390do A0A = AbstractC09440dt.A01(new C57549PgN(this, 30));

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(SelfieCaptureLogger.ARG_STEP_CHANGE_LOGGED, this.A09);
    }

    public final IdCaptureConfig A01() {
        IdCaptureConfig idCaptureConfig = this.A02;
        if (idCaptureConfig != null) {
            return idCaptureConfig;
        }
        C14360o3.A0F("idCaptureConfig");
        throw C00O.createAndThrow();
    }

    public final IdCaptureLogger A02() {
        IdCaptureLogger idCaptureLogger = this.A03;
        if (idCaptureLogger != null) {
            return idCaptureLogger;
        }
        C14360o3.A0F("mIdCaptureLogger");
        throw C00O.createAndThrow();
    }

    public final IdCaptureStep A03() {
        if (this instanceof PhotoReviewActivity) {
            if (getIntent().getSerializableExtra("capture_stage") == EnumC61101RfG.A03) {
                return IdCaptureStep.FIRST_PHOTO_CONFIRMATION;
            }
            return IdCaptureStep.SECOND_PHOTO_CONFIRMATION;
        }
        if (this instanceof PermissionsActivity) {
            return IdCaptureStep.PERMISSIONS;
        }
        if (this.A05 == IdCaptureStep.FIRST_PHOTO_CONFIRMATION) {
            return IdCaptureStep.SECOND_PHOTO_CAPTURE;
        }
        return IdCaptureStep.FIRST_PHOTO_CAPTURE;
    }

    @Override // X.MO0
    public final MRQ AzR() {
        return this.A06;
    }

    @Override // X.InterfaceC65501TlQ
    public final Map BFB() {
        IdCaptureUi idCaptureUi = this.A07;
        if (idCaptureUi != null) {
            return idCaptureUi.C2q();
        }
        return AbstractC06930Yk.A0E();
    }

    @Override // X.InterfaceC65501TlQ
    public final InterfaceC65373Tj5 C2t() {
        return (InterfaceC65373Tj5) this.A0A.getValue();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.A00;
        if (resources == null) {
            Resources resources2 = super.getResources();
            C14360o3.A07(resources2);
            return resources2;
        }
        return resources;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.A09 = false;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.smartcapture.logging.IdCaptureLogger, com.facebook.smartcapture.logging.BaseLogger] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.S5Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.facebook.smartcapture.logging.IdCaptureLogger, com.facebook.smartcapture.logging.BaseLogger] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        IdCaptureStep idCaptureStep;
        String str;
        int A00 = C0f9.A00(767907818);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
            i = -1430302424;
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("id_capture_config");
            if (parcelableExtra != null) {
                IdCaptureConfig idCaptureConfig = (IdCaptureConfig) parcelableExtra;
                C14360o3.A0B(idCaptureConfig, 0);
                this.A02 = idCaptureConfig;
                this.A07 = A01().A0A;
                ResourcesProvider resourcesProvider = A01().A09;
                if (resourcesProvider != null) {
                    resourcesProvider.COB(this);
                    this.A00 = resourcesProvider.Boa();
                    this.A06 = resourcesProvider.AzR();
                }
                SmartCaptureLoggerProvider smartCaptureLoggerProvider = A01().A08;
                boolean z = false;
                String str2 = null;
                if (smartCaptureLoggerProvider != null) {
                    this.A03 = new BaseLogger(smartCaptureLoggerProvider.get(this));
                    long j = A01().A02;
                    Long valueOf = Long.valueOf(j);
                    if (j != 0 && valueOf != null) {
                        str2 = valueOf.toString();
                    }
                    IdCaptureLogger A02 = A02();
                    Parcelable.Creator creator = CommonLoggingFields.CREATOR;
                    EnumC61146Rg7 A01 = A01().A01();
                    C14360o3.A07(A01);
                    if (A01().A0I) {
                        str = "v1_cc";
                    } else {
                        str = "v2_id";
                    }
                    String str3 = A01().A0E;
                    C14360o3.A07(str3);
                    A02.setCommonFields(new CommonLoggingFields(A01, str, str3, A01().A0D, A01().A03, str2));
                } else {
                    this.A03 = new BaseLogger(null);
                }
                A02().setCurrentScreen(A03().getText());
                if (A01().A07 != null) {
                    this.A08 = new Object();
                }
                if (getIntent().hasExtra("preset_document_type")) {
                    DocumentType documentType = (DocumentType) getIntent().getSerializableExtra("preset_document_type");
                    if (documentType != null) {
                        this.A01 = documentType;
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                if (getIntent().hasExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP)) {
                    Serializable serializableExtra = getIntent().getSerializableExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP);
                    if (!(serializableExtra instanceof IdCaptureStep) || (idCaptureStep = (IdCaptureStep) serializableExtra) == null) {
                        idCaptureStep = IdCaptureStep.INITIAL;
                    }
                    this.A05 = idCaptureStep;
                }
                if (bundle != null) {
                    z = bundle.getBoolean(SelfieCaptureLogger.ARG_STEP_CHANGE_LOGGED);
                }
                this.A09 = z;
                int i2 = A01().A00;
                if (i2 != 0) {
                    setTheme(i2);
                    IdCaptureUi idCaptureUi = A01().A0A;
                    if (idCaptureUi != null) {
                        idCaptureUi.AAv(this);
                    }
                }
                super.onCreate(bundle);
                i = -1156466062;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = C0f9.A00(1105477442);
        super.onResume();
        if (!this.A09) {
            this.A09 = true;
            IdCaptureStep idCaptureStep = this.A04;
            IdCaptureLogger A02 = A02();
            if (idCaptureStep != null) {
                IdCaptureStep idCaptureStep2 = this.A04;
                C14360o3.A0A(idCaptureStep2);
                A02.logStepChange(idCaptureStep2, A03());
                this.A04 = null;
            } else {
                A02.logStepChange(this.A05, A03());
            }
        }
        C0f9.A07(-597636205, A00);
    }
}
