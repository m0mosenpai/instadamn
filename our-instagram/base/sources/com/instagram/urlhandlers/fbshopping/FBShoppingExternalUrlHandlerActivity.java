package com.instagram.urlhandlers.fbshopping;

import X.AbstractC03270Dk;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC35190Ffi;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class FBShoppingExternalUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-932280821);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C14360o3.A07(intent);
        Bundle A08 = AbstractC31172DnG.A08(intent);
        if (A08 != null && A08.getString("original_url") != null) {
            try {
                AbstractC35190Ffi.A01(this, AbstractC31171DnF.A0D(AbstractC111324zv.A00(4698)), AbstractC03270Dk.A00(AbstractC31171DnF.A0F(this)), "ig_product_wishlist", null, A08.getString("original_url"));
            } catch (IllegalArgumentException e) {
                C0w9.A07("FBShoppingExternalUrlHandlerActivity", e);
            }
        }
        finish();
        C0f9.A07(1861454300, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
