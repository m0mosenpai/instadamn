package com.facebook.smartcapture.view;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31180DnO;
import X.AbstractC58323PtF;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C62430SBf;
import X.EnumC61102RfH;
import X.EnumC61146Rg7;
import X.InterfaceC50382MMk;
import X.InterfaceC65373Tj5;
import X.InterfaceC65501TlQ;
import X.MO0;
import X.MRQ;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.CommonLoggingFields;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLoggerActivity;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.google.common.collect.ImmutableList;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class BaseSelfieCaptureActivity extends FragmentActivity implements InterfaceC65501TlQ, MO0, SelfieCaptureLoggerActivity, InterfaceC50382MMk {
    public Resources A00;
    public SelfieCaptureConfig A01;
    public SelfieCaptureLogger A02;
    public MRQ A03;
    public InterfaceC65373Tj5 A04;
    public SelfieCaptureUi A05;

    public final void A04(SelfieEvidence selfieEvidence, String str) {
        String str2;
        C14360o3.A0B(selfieEvidence, 0);
        Intent A04 = AbstractC31171DnF.A04();
        String str3 = selfieEvidence.A06;
        boolean z = true;
        if (str3 != null) {
            A04.setData(AbstractC167007dF.A0I(str3));
            C14360o3.A0A(A04.putExtra("result_photo_path", str3));
        } else {
            ImmutableList immutableList = selfieEvidence.A00;
            if (immutableList != null && (str2 = (String) AbstractC001800i.A0J(immutableList)) != null) {
                A04.setData(AbstractC167007dF.A0I(str2));
                A04.putExtra("result_photo_path", str2);
            } else {
                z = false;
            }
        }
        String str4 = selfieEvidence.A07;
        if (str4 != null) {
            if (!z) {
                A04.setData(AbstractC167007dF.A0I(str4));
            }
            A04.putExtra("result_video_path", str4);
        }
        if (A02().A07 != null) {
            String str5 = "NOT_SET";
            String string = new C62430SBf(this).A00.getString("consent_decision", "NOT_SET");
            if (string != null) {
                str5 = string;
            }
            A04.putExtra("result_user_consent", EnumC61102RfH.valueOf(str5).toString());
        }
        if (str != null) {
            A04.putExtra("result_upload_response", str);
        }
        AbstractC31180DnO.A0y(this, A04);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        A00(this).onSaveInstanceState(bundle);
    }

    public final SelfieCaptureConfig A02() {
        SelfieCaptureConfig selfieCaptureConfig = this.A01;
        if (selfieCaptureConfig != null) {
            return selfieCaptureConfig;
        }
        C14360o3.A0F("selfieCaptureConfig");
        throw C00O.createAndThrow();
    }

    public final SelfieCaptureStep A03() {
        if (this instanceof SelfieTimeoutActivity) {
            return SelfieCaptureStep.TIMEOUT;
        }
        if (this instanceof SelfieReviewActivity) {
            return SelfieCaptureStep.CONFIRMATION;
        }
        if (!(this instanceof SelfieOnboardingActivity) && !(this instanceof SelfieDataInformationActivity)) {
            if (this instanceof SelfieCapturePermissionsActivity) {
                return SelfieCaptureStep.PERMISSIONS;
            }
            return SelfieCaptureStep.CAPTURE;
        }
        return SelfieCaptureStep.ONBOARDING;
    }

    @Override // X.MO0
    public final MRQ AzR() {
        return this.A03;
    }

    @Override // X.InterfaceC65501TlQ
    public final Map BFB() {
        SelfieCaptureUi selfieCaptureUi = this.A05;
        if (selfieCaptureUi == null) {
            return AbstractC06930Yk.A0E();
        }
        return selfieCaptureUi.C2q();
    }

    @Override // X.InterfaceC65501TlQ
    public final InterfaceC65373Tj5 C2t() {
        InterfaceC65373Tj5 interfaceC65373Tj5 = this.A04;
        if (interfaceC65373Tj5 != null) {
            return interfaceC65373Tj5;
        }
        C14360o3.A0F("stringOverride");
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.smartcapture.logging.SelfieCaptureLoggerActivity
    public final SelfieCaptureLogger getLogger() {
        return this.A02;
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

    public static SelfieCaptureLogger A00(BaseSelfieCaptureActivity baseSelfieCaptureActivity) {
        SelfieCaptureLogger logger = baseSelfieCaptureActivity.getLogger();
        C14360o3.A0A(logger);
        return logger;
    }

    public final void A05(String str, Throwable th) {
        SelfieCaptureLogger A00 = A00(this);
        if (str == null) {
            str = "";
        }
        A00.logError(str, th);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        A00(this).onActivityResult(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        A00(this).onBackPressed();
        setResult(0);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        Boolean bool;
        int A00 = C0f9.A00(1793962689);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
            i2 = 318867285;
        } else {
            SelfieCaptureConfig selfieCaptureConfig = (SelfieCaptureConfig) getIntent().getParcelableExtra("selfie_capture_config");
            if (selfieCaptureConfig == null) {
                finish();
                i2 = -1141326930;
            } else {
                this.A01 = selfieCaptureConfig;
                SelfieCaptureConfig A02 = A02();
                if (((this instanceof SelfieCaptureActivity) && (bool = A02().A0J) != null && bool.booleanValue() && (i = A02.A01) != 0) || (i = A02.A00) != 0) {
                    setTheme(i);
                    if (A02.A0D != null) {
                        getTheme().applyStyle(R.style.IgdsSemanticColors, true);
                    }
                }
                StringOverrideFactory A01 = A02.A01();
                C14360o3.A0A(A01);
                this.A04 = A01.ALD();
                super.onCreate(bundle);
                Intent intent = getIntent();
                SelfieCaptureConfig A022 = A02();
                SelfieCaptureUi selfieCaptureUi = A022.A0D;
                C14360o3.A0A(selfieCaptureUi);
                this.A05 = selfieCaptureUi;
                ResourcesProvider resourcesProvider = A022.A0C;
                if (resourcesProvider != null) {
                    resourcesProvider.COB(this);
                    this.A00 = resourcesProvider.Boa();
                    this.A03 = resourcesProvider.AzR();
                }
                SmartCaptureLoggerProvider smartCaptureLoggerProvider = A022.A0B;
                if (smartCaptureLoggerProvider != null) {
                    this.A02 = new SelfieCaptureLogger(smartCaptureLoggerProvider.get(this), A03());
                    long j = A022.A02;
                    if (j != 0) {
                        str = String.valueOf(j);
                    } else {
                        str = null;
                    }
                    SelfieCaptureLogger A002 = A00(this);
                    Parcelable.Creator creator = CommonLoggingFields.CREATOR;
                    EnumC61146Rg7 A003 = A022.A00();
                    C14360o3.A07(A003);
                    String str2 = A022.A0O;
                    C14360o3.A07(str2);
                    A002.setCommonFields(new CommonLoggingFields(A003, "v1_selfie", str2, A022.A0N, A022.A03, str));
                } else {
                    this.A02 = new SelfieCaptureLogger(null, A03());
                }
                if (A022.A08 != null) {
                    throw AbstractC166987dD.A15("get");
                }
                SelfieCaptureLogger logger = getLogger();
                if (logger != null) {
                    logger.onCreate(intent, bundle);
                }
                i2 = -1278164223;
            }
        }
        C0f9.A07(i2, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = C0f9.A00(399267509);
        super.onResume();
        A00(this).onResume();
        C0f9.A07(-750278084, A00);
    }
}
