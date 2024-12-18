package com.facebook.smartcapture.view;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC43591JPw;
import X.AbstractC58323PtF;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.EnumC61132Rfm;
import X.InterfaceC50383MMl;
import X.MSY;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.ui.SelfieCaptureUi;

/* loaded from: classes10.dex */
public final class SelfieReviewActivity extends BaseSelfieCaptureActivity implements InterfaceC50383MMl {
    public SelfieEvidence A00 = new SelfieEvidence(null, null, null, null, null, null, null, null);

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Throwable A12;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        int A00 = C0f9.A00(-1907602095);
        super.onCreate(bundle);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
            i2 = -1762662060;
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("selfie_evidence");
            if (parcelableExtra instanceof SelfieEvidence) {
                this.A00 = (SelfieEvidence) parcelableExtra;
                setContentView(R.layout.selfie_fragment_container_activity);
                if (bundle == null) {
                    SelfieCaptureUi selfieCaptureUi = this.A05;
                    String str4 = null;
                    if (selfieCaptureUi != null) {
                        try {
                            EnumC61132Rfm enumC61132Rfm = A02().A06;
                            if (enumC61132Rfm == null) {
                                enumC61132Rfm = EnumC61132Rfm.A05;
                            }
                            A02();
                            String str5 = A02().A0O;
                            C14360o3.A07(str5);
                            Fragment fragment = (Fragment) selfieCaptureUi.BpE().newInstance();
                            Bundle bundle2 = A02().A03;
                            if (bundle2 != null) {
                                str = bundle2.getString("product_surface");
                            } else {
                                str = null;
                            }
                            SelfieEvidence selfieEvidence = this.A00;
                            String str6 = A02().A0L;
                            String str7 = A02().A0P;
                            if (bundle2 != null) {
                                str2 = bundle2.getString("challenge_use_case");
                                str3 = bundle2.getString("av_session_id");
                                str4 = bundle2.getString("flow_id");
                            } else {
                                str2 = null;
                                str3 = null;
                            }
                            if (str == null) {
                                str = str5;
                            }
                            String str8 = A02().A0Q;
                            String str9 = A02().A0M;
                            boolean A1Z = AbstractC166997dE.A1Z(A02().A0H, true);
                            Bundle A0b = AbstractC166987dD.A0b();
                            A0b.putParcelable("selfie_evidence", selfieEvidence);
                            A0b.putSerializable("review_type", enumC61132Rfm);
                            if (str6 != null) {
                                A0b.putString("challenge_id", str6);
                            }
                            if (str7 != null) {
                                A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str7);
                            }
                            if (str2 != null) {
                                A0b.putString("challenge_use_case", str2);
                            }
                            if (str3 != null) {
                                A0b.putString("av_session_id", str3);
                            }
                            if (str4 != null) {
                                A0b.putString("flow_id", str4);
                            }
                            A0b.putString("product_surface", str);
                            if (str8 != null) {
                                A0b.putString("ig_user_id", str8);
                            }
                            if (str9 != null) {
                                A0b.putString("entity_id", str9);
                            }
                            A0b.putBoolean(AbstractC43591JPw.A00(167), A1Z);
                            fragment.setArguments(A0b);
                            C14240no A0G = MSY.A0G(this);
                            A0G.A0A(fragment, R.id.fragment_container);
                            A0G.A00();
                        } catch (IllegalAccessException | InstantiationException e) {
                            A05(e.getMessage(), e);
                        }
                    } else {
                        A05("SmartCaptureUi is null", null);
                        A12 = AbstractC166987dD.A14("SmartCaptureUi must not be null");
                        i = 560833265;
                    }
                }
                i2 = -1422980204;
            } else {
                A12 = AbstractC166987dD.A12("SelfieEvidence must be set");
                i = 1357078678;
            }
            C0f9.A07(i, A00);
            throw A12;
        }
        C0f9.A07(i2, A00);
    }
}
