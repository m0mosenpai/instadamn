package com.facebook.secure.deeplink;

import X.AbstractC07840b2;
import X.C0f9;
import X.C14360o3;
import X.R7E;
import X.S1G;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes10.dex */
public final class GlobalUriHandlerActivity extends AppCompatActivity {
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        A00(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && intent.hasExtra("request_code")) {
            super.onActivityResult(i, i2, intent);
            setResult(i2, intent);
            finish();
        }
    }

    private final void A00(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Intent A00 = R7E.A01.A00().A00(this, S1G.A00(this, intent), dataString, null);
            if (A00 != null) {
                if (A00.hasExtra("request_code")) {
                    AbstractC07840b2.A00(this, A00, A00.getIntExtra("request_code", 0));
                    return;
                }
                AbstractC07840b2.A02(this, A00);
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(614752641);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C14360o3.A07(intent);
        A00(intent);
        C0f9.A07(-559749092, A00);
    }
}
