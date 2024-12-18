package com.facebook.smartcapture.view;

import X.AbstractC166987dD;
import X.C0f9;
import X.C14240no;
import X.InterfaceC50384MMm;
import X.K5N;
import X.MSY;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class SelfieTimeoutActivity extends BaseSelfieCaptureActivity implements InterfaceC50384MMm {
    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(361467093);
        super.onCreate(bundle);
        setContentView(R.layout.selfie_fragment_container_activity);
        try {
        } catch (IllegalAccessException | InstantiationException e) {
            A05(e.getMessage(), e);
        }
        if (this.A05 != null) {
            Fragment fragment = (Fragment) K5N.class.newInstance();
            C14240no A0G = MSY.A0G(this);
            A0G.A0A(fragment, R.id.fragment_container);
            A0G.A00();
            C0f9.A07(-316789280, A00);
            return;
        }
        A05("SmartCaptureUi is null", null);
        IllegalStateException A14 = AbstractC166987dD.A14("SmartCaptureUi must not be null");
        C0f9.A07(111281715, A00);
        throw A14;
    }
}
