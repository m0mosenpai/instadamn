package com.instagram.fbpay.w3c.views;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.C0f9;
import X.C14240no;
import X.C48092Iw;
import X.MSW;
import X.MSY;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes10.dex */
public final class DemaskCardActivity extends IgFragmentActivity {
    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return MSW.A0Q(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(560516204);
        super.onCreate(bundle);
        setContentView(R.layout.w3c_fbpay_activity);
        C48092Iw.A06.A00(MSW.A0Q(this));
        C14240no A0G = MSY.A0G(this);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        Fragment fragment = new Fragment();
        fragment.setArguments(A0A);
        A0G.A09(fragment, R.id.fragment_container);
        A0G.A00();
        C0f9.A07(121663162, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0Q(this);
    }
}
