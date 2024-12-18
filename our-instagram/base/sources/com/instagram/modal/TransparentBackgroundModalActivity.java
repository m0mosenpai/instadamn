package com.instagram.modal;

import X.C14360o3;
import X.C35756Fqt;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class TransparentBackgroundModalActivity extends ModalActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final boolean A0m() {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        A0n(intent);
    }

    @Override // com.instagram.modal.ModalActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C35756Fqt.A00(getSupportFragmentManager(), this, 0);
    }
}
