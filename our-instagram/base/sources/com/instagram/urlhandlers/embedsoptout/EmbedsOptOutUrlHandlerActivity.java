package com.instagram.urlhandlers.embedsoptout;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C023409i;
import X.C05F;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C17060sy;
import X.C1QO;
import X.C33223ElB;
import X.InterfaceC53722dB;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EmbedsOptOutUrlHandlerActivity extends BaseFragmentActivity {
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
        int i;
        int A00 = C0f9.A00(710920144);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        AbstractC18680vv session = getSession();
        if (!(session instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A07, session);
            finish();
            i = 1402640774;
        } else if (C17060sy.A01.A01((UserSession) session).A0M() != C05F.A0C) {
            C140966Yy A0r = AbstractC25225BEi.A0r(this, session);
            A0r.A0D(new C33223ElB());
            AbstractC31174DnI.A1L(A0r);
            i = 1889172697;
        } else {
            InterfaceC53722dB A002 = AbstractC54852fj.A00();
            if (A002 != null) {
                A002.EfI(C1QO.A0C);
            }
            finish();
            i = -1607754715;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
