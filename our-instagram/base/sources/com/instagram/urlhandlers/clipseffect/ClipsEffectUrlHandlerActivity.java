package com.instagram.urlhandlers.clipseffect;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C35221FgE;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ClipsEffectUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1660153787);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 49830779;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            C14360o3.A0B(A0V, 0);
            this.A00 = A0V;
            if (!AbstractC31172DnG.A1Y(this)) {
                AbstractC35178FfV.A03(A07, this);
                finish();
                i = -789622189;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a != null && A0a.length() != 0) {
                    AbstractC18680vv session = getSession();
                    AbstractC31171DnF.A1Q(session);
                    UserSession userSession = (UserSession) session;
                    C14360o3.A0B(userSession, 0);
                    if (!C35221FgE.A02(C35221FgE.A00(userSession, A0a, null, false), this, userSession, null, false)) {
                        finish();
                    }
                    i = -1028456847;
                } else {
                    finish();
                    i = -1625735516;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
