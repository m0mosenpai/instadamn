package com.instagram.business.instantexperiences.ui;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.C0f9;
import X.C14240no;
import X.C60892Rb6;
import X.MSY;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public class InstantExperiencesBrowserActivity extends IgFragmentActivity {
    public UserSession A00;
    public Fragment A01;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!((C60892Rb6) this.A01).onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(410757087);
        super.onCreate(bundle);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        A0A.getClass();
        this.A00 = AbstractC31171DnF.A0G(A0A);
        setContentView(R.layout.instant_experiences_browser_main);
        if (bundle == null) {
            C60892Rb6 c60892Rb6 = new C60892Rb6();
            this.A01 = c60892Rb6;
            c60892Rb6.setArguments(AbstractC31173DnH.A0A(this));
            C14240no A0G = MSY.A0G(this);
            A0G.A09(this.A01, R.id.instant_experience_fragment_container);
            A0G.A00();
        } else {
            Fragment A0P = getSupportFragmentManager().A0P(bundle, "instant_experiences_browser_fragment");
            A0P.getClass();
            this.A01 = A0P;
        }
        C0f9.A07(499206163, A00);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getSupportFragmentManager().A0f(bundle, this.A01, "instant_experiences_browser_fragment");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
