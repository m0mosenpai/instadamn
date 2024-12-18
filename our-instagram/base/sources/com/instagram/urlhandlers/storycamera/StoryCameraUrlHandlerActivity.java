package com.instagram.urlhandlers.storycamera;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.C0f9;
import X.C14360o3;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class StoryCameraUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(501181294);
        super.onCreate(bundle);
        Bundle A0b = AbstractC166987dD.A0b();
        Intent A06 = AbstractC31176DnK.A06(this);
        Uri.Builder A04 = AbstractC31175DnJ.A04("instagram://story-camera");
        C14360o3.A07(A04);
        String stringExtra = getIntent().getStringExtra("story-camera-mode");
        if (stringExtra != null) {
            A04.appendQueryParameter(DatePickerDialogModule.ARG_MODE, stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("effect_id");
        if (stringExtra2 != null) {
            A0b.putString("effect_id", stringExtra2);
            A04.appendQueryParameter("effect_id", stringExtra2);
        }
        String stringExtra3 = getIntent().getStringExtra("entrypoint");
        if (stringExtra3 != null) {
            A04.appendQueryParameter("entrypoint", stringExtra3);
        }
        String stringExtra4 = getIntent().getStringExtra("ch");
        if (stringExtra4 != null) {
            A04.appendQueryParameter("test_link_crypto_hash", stringExtra4);
        }
        String stringExtra5 = getIntent().getStringExtra("revisionID");
        if (stringExtra5 != null) {
            A04.appendQueryParameter("test_link_revision_id", stringExtra5);
        }
        String stringExtra6 = getIntent().getStringExtra("unlocked_sticker_id");
        if (stringExtra6 != null) {
            A04.appendQueryParameter("unlocked_sticker_id", stringExtra6);
        }
        String stringExtra7 = getIntent().getStringExtra("interactive_sticker_id");
        if (stringExtra6 != null) {
            A04.appendQueryParameter("interactive_sticker_id", stringExtra7);
        }
        A06.setData(A04.build());
        AbstractC31174DnI.A14(this, A06);
        finish();
        C0f9.A07(1927951488, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
