package com.facebook.smartcapture.view;

import X.AbstractC166987dD;
import X.AbstractC31173DnH;
import X.AbstractC58323PtF;
import X.C0f9;
import X.C14240no;
import X.K5M;
import X.MSY;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;

/* loaded from: classes10.dex */
public final class SelfieDataInformationActivity extends BaseSelfieCaptureActivity {
    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Fragment fragment;
        int A00 = C0f9.A00(143707883);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
            i = -444045952;
        } else {
            super.onCreate(bundle);
            setContentView(R.layout.selfie_fragment_container_activity);
            Parcelable parcelable = null;
            if (this.A05 != null) {
                try {
                    fragment = (Fragment) K5M.class.newInstance();
                    Bundle A0A = AbstractC31173DnH.A0A(this);
                    if (A0A != null) {
                        parcelable = A0A.getParcelable("texts_provider");
                    }
                } catch (IllegalAccessException | InstantiationException e) {
                    A05(e.getMessage(), e);
                }
                if ((parcelable instanceof ResolvedConsentTextsProvider) && parcelable != null) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("texts_provider", parcelable);
                    fragment.setArguments(A0b);
                    C14240no A0G = MSY.A0G(this);
                    A0G.A0A(fragment, R.id.fragment_container);
                    A0G.A00();
                    i = 2052269366;
                } else {
                    IllegalArgumentException A12 = AbstractC166987dD.A12("Missing consent texts provider");
                    C0f9.A07(524885099, A00);
                    throw A12;
                }
            } else {
                A05("SmartCaptureUi is null", null);
                IllegalStateException A14 = AbstractC166987dD.A14("SmartCaptureUi must not be null");
                C0f9.A07(905598511, A00);
                throw A14;
            }
        }
        C0f9.A07(i, A00);
    }
}
