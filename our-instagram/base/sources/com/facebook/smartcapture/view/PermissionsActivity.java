package com.facebook.smartcapture.view;

import X.AbstractC114515Ew;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC62318S6o;
import X.C02G;
import X.C0f9;
import X.C14240no;
import X.K5J;
import X.MO2;
import X.MSY;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.smartcapture.logging.CancelReason;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.ui.IdCaptureUi;

/* loaded from: classes10.dex */
public final class PermissionsActivity extends IdCaptureBaseActivity implements MO2 {
    public boolean A00;
    public int A01;
    public K5J A02;
    public boolean A03;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC167007dF.A1D(strArr, 1, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10 && iArr.length > 0) {
            int i2 = iArr[0];
            if (i2 == 0) {
                A02().logPermissionGrant(this.A01);
            } else {
                if (i2 != -1) {
                    return;
                }
                A02().logPermissionReject();
                if (AbstractC114515Ew.A06(this, "android.permission.CAMERA")) {
                    return;
                }
                this.A03 = true;
            }
        }
    }

    @Override // X.MO2
    public final void D0V() {
        this.A01++;
        if (this.A03) {
            Intent A0E = AbstractC58318PtA.A0E("android.settings.APPLICATION_DETAILS_SETTINGS");
            A0E.setData(Uri.fromParts("package", getPackageName(), null));
            startActivityForResult(A0E, 2);
            A02().logPermissionNeverAskAgain();
            return;
        }
        AbstractC114515Ew.A05(this, new String[]{"android.permission.CAMERA"}, 10);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        A02().logFlowCancel(CancelReason.SYSTEM_BACK_BUTTON);
        super.onBackPressed();
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int A00 = C0f9.A00(2086729728);
        super.onCreate(bundle);
        setContentView(R.layout.permissions_activity);
        boolean booleanExtra = getIntent().getBooleanExtra("permissions_activity_force_show", false);
        this.A00 = booleanExtra;
        if (!booleanExtra && C02G.A00(this, AbstractC62318S6o.A00[0]) == 0) {
            Intent A002 = IdCaptureActivity.A07.A00(this, super.A01, A01(), IdCaptureStep.PERMISSIONS);
            this.A04 = IdCaptureStep.FIRST_PHOTO_CAPTURE;
            startActivityForResult(A002, 1);
            i = -1626083041;
        } else {
            if (bundle == null) {
                IdCaptureUi idCaptureUi = this.A07;
                String str5 = null;
                if (idCaptureUi != null) {
                    try {
                        K5J k5j = (K5J) idCaptureUi.BcX().newInstance();
                        Bundle bundle2 = A01().A03;
                        String str6 = A01().A0G;
                        if (bundle2 != null) {
                            str = bundle2.getString("challenge_id");
                            str2 = bundle2.getString("challenge_use_case");
                            str3 = bundle2.getString("av_session_id");
                            str4 = bundle2.getString("flow_id");
                            str5 = bundle2.getString("product_surface");
                        } else {
                            str = null;
                            str2 = null;
                            str3 = null;
                            str4 = null;
                        }
                        k5j.A00(str6, str, str2, str3, str4, str5);
                        C14240no A0G = MSY.A0G(this);
                        A0G.A0A(k5j, R.id.permissions_container);
                        A0G.A00();
                        this.A02 = k5j;
                    } catch (IllegalAccessException | InstantiationException e) {
                        A02().logError(e.toString(), e.getMessage(), e);
                    }
                } else {
                    A02().logError("IdCaptureUi is null", null);
                    IllegalStateException A14 = AbstractC166987dD.A14("IdCaptureUi must not be null");
                    C0f9.A07(1746595195, A00);
                    throw A14;
                }
            }
            if (this.A05 == IdCaptureStep.INITIAL) {
                A02().logFlowStart();
            }
            A02().logPermissionExplain();
            i = -1742291520;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-1928878986);
        super.onResume();
        if (!this.A00 && C02G.A00(this, AbstractC62318S6o.A00[0]) == 0 && this.A02 != null) {
            Intent A002 = IdCaptureActivity.A07.A00(this, super.A01, A01(), IdCaptureStep.PERMISSIONS);
            this.A04 = IdCaptureStep.FIRST_PHOTO_CAPTURE;
            startActivityForResult(A002, 1);
        }
        C0f9.A07(-795199342, A00);
    }
}
