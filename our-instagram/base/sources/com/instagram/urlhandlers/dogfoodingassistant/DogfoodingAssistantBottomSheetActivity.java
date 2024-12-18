package com.instagram.urlhandlers.dogfoodingassistant;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC23111AHa;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C023409i;
import X.C0f9;
import X.C12260kU;
import X.C14H;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class DogfoodingAssistantBottomSheetActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri A03;
        int A00 = C0f9.A00(98993134);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            AbstractC18680vv A04 = C023409i.A0A.A04(A07);
            if (!(A04 instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, A04);
            } else {
                UserSession userSession = (UserSession) A04;
                if (AbstractC54852fj.A00() != null) {
                    AbstractC23111AHa.A02(this, userSession, A07.getString("original_url"), null, true);
                } else {
                    String string = A07.getString("original_url");
                    if (string != null && (A03 = AbstractC08820cl.A03(string)) != null) {
                        Intent A01 = C14H.A03.A00().A01(this);
                        A01.setData(A03);
                        C12260kU.A0C(this, A01);
                    }
                }
            }
            finish();
            C0f9.A07(1805641992, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(-1224468171, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
