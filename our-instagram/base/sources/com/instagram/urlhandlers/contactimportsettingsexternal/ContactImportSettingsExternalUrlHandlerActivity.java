package com.instagram.urlhandlers.contactimportsettingsexternal;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C33214El2;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* loaded from: classes6.dex */
public final class ContactImportSettingsExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-1707017256);
        super.onCreate(bundle);
        if (AbstractC31172DnG.A1Y(this)) {
            C140966Yy A0r = AbstractC25225BEi.A0r(this, getSession());
            IgFragmentFactoryImpl.A00();
            A0r.A0D(new C33214El2());
            AbstractC31174DnI.A1L(A0r);
        } else {
            AbstractC35178FfV.A03(bundle, this);
            finish();
        }
        C0f9.A07(-1949387489, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
