package com.instagram.lockscreen;

import X.AbstractC14490oL;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC172747mk;
import X.C0f9;
import X.MSW;
import X.ViewOnClickListenerC55461OkG;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.IgActivity;

/* loaded from: classes9.dex */
public final class LockScreenCameraCaptureActivity extends IgActivity {
    @Override // com.instagram.base.activity.IgActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1017198086);
        super.onCreate(bundle);
        if (!AbstractC167007dF.A1Z(AbstractC172747mk.A00(this, MSW.A0Q(this)).A05)) {
            AbstractC14490oL.A08(AbstractC166987dD.A0O(this), "com.instagram.lockscreen.LockScreenCameraCaptureActivity", false);
            finish();
            i = 2023547353;
        } else {
            if (getIntent().getBooleanExtra("isSecure", false)) {
                setShowWhenLocked(true);
            }
            getTheme().applyStyle(R.style.IgdsSemanticColors, true);
            setContentView(R.layout.activity_lock_screen_camera_capture);
            ViewOnClickListenerC55461OkG.A00(findViewById(R.id.show_unlock_required_content), 62, this);
            i = -1961313102;
        }
        C0f9.A07(i, A00);
    }
}
