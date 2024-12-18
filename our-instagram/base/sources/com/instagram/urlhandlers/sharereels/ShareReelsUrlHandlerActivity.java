package com.instagram.urlhandlers.sharereels;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC86593tX;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C22P;
import X.INH;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class ShareReelsUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1877959846);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            A07 = AbstractC166987dD.A0b();
        }
        if (!AbstractC31172DnG.A1Y(this)) {
            AbstractC35178FfV.A03(A07, this);
        } else {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putAll(A07);
            AbstractC31171DnF.A1Q(getSession());
            INH A0C = AbstractC86593tX.A0C(C22P.A3s);
            A0C.A0m = true;
            A0b.putAll(A0C.A00());
            A0b.putBoolean("modal_dismiss_on_cancel", true);
            AbstractC31176DnK.A0w(this, A0b, getSession(), "clips_camera");
            finish();
        }
        C0f9.A07(-1847603606, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
