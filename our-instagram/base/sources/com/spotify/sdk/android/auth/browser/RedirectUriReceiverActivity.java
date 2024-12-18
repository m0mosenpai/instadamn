package com.spotify.sdk.android.auth.browser;

import X.AbstractC58321PtD;
import X.C0f9;
import X.MSW;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.sdk.android.auth.LoginActivity;

/* loaded from: classes10.dex */
public class RedirectUriReceiverActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A09 = AbstractC58321PtD.A09(this, -914284890);
        super.onCreate(bundle);
        Intent A08 = MSW.A08(this, LoginActivity.class);
        A08.setData(getIntent().getData());
        A08.addFlags(603979776);
        startActivity(A08);
        finish();
        C0f9.A07(1038308271, A09);
    }
}
