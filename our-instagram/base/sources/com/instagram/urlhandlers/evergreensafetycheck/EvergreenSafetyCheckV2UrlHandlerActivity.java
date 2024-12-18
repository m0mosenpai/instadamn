package com.instagram.urlhandlers.evergreensafetycheck;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C32272EJh;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class EvergreenSafetyCheckV2UrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-550968815);
        super.onCreate(bundle);
        if (!AbstractC31172DnG.A1Y(this)) {
            AbstractC35178FfV.A03(AbstractC31176DnK.A07(this), this);
        } else {
            C140966Yy A0D = AbstractC31180DnO.A0D(this, getSession());
            C32272EJh c32272EJh = new C32272EJh();
            Bundle A0b = AbstractC166987dD.A0b();
            Intent intent = getIntent();
            String str = null;
            if (intent != null) {
                str = intent.getStringExtra("trigger");
            }
            A0b.putString("trigger", str);
            AbstractC31175DnJ.A0v(A0b, c32272EJh, A0D);
        }
        C0f9.A07(-1624924765, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
