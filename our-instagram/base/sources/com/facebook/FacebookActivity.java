package com.facebook;

import X.AbstractC10360h2;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58323PtF;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C52912bY;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public class FacebookActivity extends AppCompatActivity {
    public Fragment A00;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.A00;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1526783036);
        int A002 = C0f9.A00(1345302537);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
        }
        if (bundle != null) {
            ClassLoader A0g = AbstractC58319PtB.A0g(this);
            C14360o3.A07(A0g);
            C52912bY.A00(bundle, A0g);
        }
        super.onCreate(bundle);
        C0f9.A07(1386702006, A002);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            A0A.getParcelable("Request");
        }
        setContentView(R.layout.com_facebook_activity_layout);
        AbstractC10360h2 supportFragmentManager = getSupportFragmentManager();
        Fragment A0Q = supportFragmentManager.A0Q("SingleFragment");
        if (A0Q == null) {
            A0Q = new Fragment();
            Bundle bundle2 = A0Q.mArguments;
            Bundle A0M = AbstractC58321PtD.A0M(bundle2, bundle2);
            AbstractC31175DnJ.A0r(A0M, A0F);
            A0Q.setArguments(A0M);
            A0Q.setRetainInstance(true);
            C14240no c14240no = new C14240no(supportFragmentManager);
            c14240no.A0C(A0Q, "SingleFragment", R.id.com_facebook_fragment_container);
            c14240no.A00();
        }
        this.A00 = A0Q;
        C0f9.A07(-309335048, A00);
    }
}
