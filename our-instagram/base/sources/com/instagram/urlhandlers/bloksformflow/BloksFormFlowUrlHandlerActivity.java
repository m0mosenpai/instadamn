package com.instagram.urlhandlers.bloksformflow;

import X.C0f9;
import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes6.dex */
public final class BloksFormFlowUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(1393610211);
        super.onPause();
        setRequestedOrientation(10);
        C0f9.A07(911946973, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-1536160541);
        super.onResume();
        setRequestedOrientation(1);
        C0f9.A07(1902042767, A00);
    }
}
