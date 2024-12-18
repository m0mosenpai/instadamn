package com.instagram.osversionblock;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.ViewOnClickListenerC31724DwT;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes6.dex */
public final class OsVersionBlockingActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1936183618);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        C14360o3.A0B(A0F, 0);
        this.A00 = A0F;
        setContentView(R.layout.osversionblock);
        ViewOnClickListenerC31724DwT.A00(requireViewById(R.id.os_version_blocking_nav_button), 46, this);
        C0f9.A07(-853442433, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
