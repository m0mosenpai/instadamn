package com.facebook.smartcapture.view;

import X.AbstractC114515Ew;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58323PtF;
import X.AbstractC62318S6o;
import X.C02G;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.K5J;
import X.MO2;
import X.MSY;
import X.S1Q;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.ui.SelfieCaptureUi;

/* loaded from: classes10.dex */
public final class SelfieCapturePermissionsActivity extends BaseSelfieCaptureActivity implements MO2 {
    public int A00;
    public K5J A01;
    public boolean A02;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC167007dF.A1D(strArr, 1, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10 && iArr.length > 0) {
            int i2 = iArr[0];
            if (i2 == 0) {
                BaseSelfieCaptureActivity.A00(this).logPermissionGrant(this.A00);
            } else {
                if (i2 != -1) {
                    return;
                }
                BaseSelfieCaptureActivity.A00(this).logPermissionReject();
                if (AbstractC114515Ew.A06(this, "android.permission.CAMERA")) {
                    return;
                }
                this.A02 = true;
            }
        }
    }

    @Override // X.MO2
    public final void D0V() {
        this.A00++;
        if (this.A02) {
            Intent A0E = AbstractC58318PtA.A0E("android.settings.APPLICATION_DETAILS_SETTINGS");
            A0E.setData(Uri.fromParts("package", getPackageName(), null));
            startActivityForResult(A0E, 2);
            BaseSelfieCaptureActivity.A00(this).logPermissionNeverAskAgain();
            return;
        }
        AbstractC114515Ew.A05(this, new String[]{"android.permission.CAMERA"}, 10);
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        int A00 = C0f9.A00(-906699008);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
            i = -351049216;
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.selfie_fragment_container_activity);
            if (C02G.A00(this, AbstractC62318S6o.A00[0]) != 0) {
                if (bundle == null) {
                    SelfieCaptureUi selfieCaptureUi = this.A05;
                    String str4 = null;
                    if (selfieCaptureUi != null) {
                        try {
                            this.A01 = (K5J) selfieCaptureUi.BcX().newInstance();
                            Bundle bundle2 = A02().A03;
                            K5J k5j = this.A01;
                            C14360o3.A0A(k5j);
                            String str5 = A02().A0P;
                            String str6 = A02().A0L;
                            if (bundle2 != null) {
                                str = bundle2.getString("challenge_use_case");
                                str2 = bundle2.getString("av_session_id");
                                str3 = bundle2.getString("flow_id");
                                str4 = bundle2.getString("product_surface");
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            k5j.A00(str5, str6, str, str2, str3, str4);
                            C14240no A0G = MSY.A0G(this);
                            K5J k5j2 = this.A01;
                            C14360o3.A0A(k5j2);
                            A0G.A0A(k5j2, R.id.fragment_container);
                            A0G.A00();
                        } catch (IllegalAccessException | InstantiationException e) {
                            A05(e.getMessage(), e);
                        }
                    } else {
                        A05("SmartCaptureUi is null", null);
                        IllegalStateException A14 = AbstractC166987dD.A14("SmartCaptureUi must not be null");
                        C0f9.A07(-1484077836, A00);
                        throw A14;
                    }
                }
                i = -2560216;
            } else {
                Intent A002 = S1Q.A00(this, A02(), SelfieCaptureStep.PERMISSIONS);
                BaseSelfieCaptureActivity.A00(this).nextStep = SelfieCaptureStep.CAPTURE;
                startActivityForResult(A002, 1);
                i = -110895599;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(1334803524);
        super.onResume();
        if (C02G.A00(this, AbstractC62318S6o.A00[0]) == 0 && this.A01 != null) {
            Intent A002 = S1Q.A00(this, A02(), SelfieCaptureStep.PERMISSIONS);
            BaseSelfieCaptureActivity.A00(this).nextStep = SelfieCaptureStep.CAPTURE;
            startActivityForResult(A002, 1);
        }
        C0f9.A07(543765449, A00);
    }
}
