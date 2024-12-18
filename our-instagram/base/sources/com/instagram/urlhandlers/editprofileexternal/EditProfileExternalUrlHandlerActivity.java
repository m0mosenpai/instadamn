package com.instagram.urlhandlers.editprofileexternal;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC31364DqT;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C31721DwQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EditProfileExternalUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-214540607);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        C09Y c09y = C023409i.A0A;
        C14360o3.A0A(A07);
        AbstractC18680vv A04 = c09y.A04(A07);
        this.A00 = A04;
        if (!(A04 instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A07, A04);
        } else {
            AbstractC31173DnH.A1C(A07, (UserSession) A04);
            C31721DwQ A042 = AbstractC31364DqT.A02().A04("deeplink_unknown");
            A07.putString("edit_profile_entry", "deeplink_unknown");
            A042.setArguments(A07);
            AbstractC31181DnP.A0a(A042, this, this.A00);
        }
        C0f9.A07(1261870632, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
