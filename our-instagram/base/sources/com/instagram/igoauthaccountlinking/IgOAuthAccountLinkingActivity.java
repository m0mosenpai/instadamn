package com.instagram.igoauthaccountlinking;

import X.AbstractC31171DnF;
import X.C0f9;
import com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity;

/* loaded from: classes10.dex */
public final class IgOAuthAccountLinkingActivity extends OAuthAccountLinkingActivity {
    public boolean A00;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(-1381424750);
        super.onPause();
        this.A00 = true;
        C0f9.A07(-755002287, A00);
    }

    @Override // com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-1809731633);
        super.onResume();
        if (this.A00 && !((OAuthAccountLinkingActivity) this).A00) {
            setResult(0, AbstractC31171DnF.A04().putExtra("error", "LOGIN_CANCELLED_BY_USER"));
            finish();
        }
        C0f9.A07(-1235270533, A00);
    }
}
