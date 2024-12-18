package com.instagram.nux.activity;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC58327PtK;
import X.AbstractC917648y;
import X.C00O;
import X.C023409i;
import X.C07270a1;
import X.C08V;
import X.C0f9;
import X.C14360o3;
import X.C35229FgM;
import X.InterfaceC11380iw;
import android.content.Context;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class BloksMaaLoggedInSwitcherActivity extends BaseFragmentActivity implements InterfaceC11380iw, C08V {
    public C07270a1 A00;
    public C35229FgM A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "bloks_maa_signed_in";
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        C35229FgM c35229FgM = this.A01;
        if (c35229FgM == null) {
            C14360o3.A0F("maaLoginHelper");
            throw C00O.createAndThrow();
        }
        c35229FgM.A04();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C07270a1 c07270a1 = this.A00;
        if (c07270a1 == null) {
            C14360o3.A0F("loggedOutSession");
            throw C00O.createAndThrow();
        }
        return c07270a1;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(529551282);
        Bundle A002 = AbstractC58327PtK.A00(bundle);
        AbstractC917648y.A00(this, 1);
        AbstractC31176DnK.A0v(this);
        C07270a1 A03 = C023409i.A0A.A03(this);
        this.A00 = A03;
        Context A0O = AbstractC166987dD.A0O(this);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A == null) {
            A0A = AbstractC166987dD.A0b();
        }
        this.A01 = new C35229FgM(A0O, A0A, this, A03);
        super.onCreate(A002);
        C0f9.A07(-309421574, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(1980244924);
        super.onDestroy();
        C35229FgM c35229FgM = this.A01;
        if (c35229FgM == null) {
            C14360o3.A0F("maaLoginHelper");
            throw C00O.createAndThrow();
        }
        c35229FgM.A05();
        C0f9.A07(69568530, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int A00 = C0f9.A00(1288509789);
        super.onStop();
        C35229FgM c35229FgM = this.A01;
        if (c35229FgM == null) {
            C14360o3.A0F("maaLoginHelper");
            throw C00O.createAndThrow();
        }
        c35229FgM.A0A.removeCallbacksAndMessages(null);
        C0f9.A07(903462034, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
