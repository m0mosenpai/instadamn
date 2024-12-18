package com.instagram.urlhandlers.themesettings;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.C0f9;
import X.C14360o3;
import X.C27391Ur;
import X.C68095VAp;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ThemeSettingsUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        int A00 = C0f9.A00(-1529676894);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null && A0a.length() != 0) {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (!(A0V instanceof UserSession)) {
                C27391Ur A002 = AbstractC35178FfV.A00();
                AbstractC18680vv abstractC18680vv = this.A00;
                if (abstractC18680vv != null) {
                    A002.A00(this, A07, abstractC18680vv);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                C14360o3.A0A(A0V);
                AbstractC31175DnJ.A0r(A07, A0V);
                AbstractC31181DnP.A0a(new C68095VAp(), this, this.A00);
            }
            i = -64476906;
        } else {
            finish();
            i = 1382676714;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
