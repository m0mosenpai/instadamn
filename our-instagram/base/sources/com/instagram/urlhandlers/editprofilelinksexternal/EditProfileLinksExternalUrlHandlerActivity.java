package com.instagram.urlhandlers.editprofilelinksexternal;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC23021Ah;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31364DqT;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C32287EJz;
import X.InterfaceC19610xo;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EditProfileLinksExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        String str;
        int A00 = C0f9.A00(-620236549);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (!AbstractC31172DnG.A1Y(this)) {
            AbstractC35178FfV.A03(A07, this);
        } else {
            AbstractC18680vv session = getSession();
            if (A07 != null) {
                str = AbstractC31171DnF.A0a(A07);
            } else {
                str = null;
            }
            boolean z = false;
            if (str != null && str.length() != 0) {
                z = AbstractC31175DnJ.A0X(AbstractC25227BEk.A0B(str), "show_fb_page_link_dialog").equals("true");
            }
            if (z) {
                C14360o3.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00((UserSession) session));
                A0w.E77("should_show_facebook_page_link_dialog", true);
                A0w.apply();
            }
            AbstractC31364DqT.A03();
            C14360o3.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            Bundle A0b = AbstractC166987dD.A0b();
            C32287EJz c32287EJz = new C32287EJz();
            c32287EJz.setArguments(A0b);
            AbstractC31174DnI.A1L(AbstractC31173DnH.A0O(null, c32287EJz, this, session));
        }
        C0f9.A07(-1576054632, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
