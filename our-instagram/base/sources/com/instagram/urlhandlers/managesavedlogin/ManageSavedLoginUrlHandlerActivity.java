package com.instagram.urlhandlers.managesavedlogin;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.AbstractC60672pq;
import X.C0f9;
import X.C140966Yy;
import X.C27391Ur;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ManageSavedLoginUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-165347228);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1322208378;
        } else {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            if (A0V instanceof UserSession) {
                C140966Yy A0D = AbstractC31180DnO.A0D(this, A0V);
                AbstractC31172DnG.A1A();
                A0D.A0D(new AbstractC60672pq());
                A0D.A04();
            } else {
                C27391Ur A002 = AbstractC35178FfV.A00();
                AbstractC18680vv abstractC18680vv = this.A00;
                if (abstractC18680vv != null) {
                    A002.A00(this, A07, abstractC18680vv);
                    finish();
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A07(1200094852, A00);
                    throw A0g;
                }
            }
            i = 815399725;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}