package com.instagram.urlhandlers.opal;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC151756sL;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class OpalUrlHandlerActivity extends ModalActivity {
    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.modal.ModalActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        Uri A03;
        FragmentActivity fragmentActivity;
        int A00 = C0f9.A00(-143739147);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && A07.getString("original_url") != null) {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (A0F instanceof UserSession) {
                UserSession userSession = (UserSession) A0F;
                if (AbstractC151756sL.A01() && (string = A07.getString("original_url")) != null && string.length() != 0) {
                    if (AbstractC54852fj.A00() != null) {
                        Uri A0B = AbstractC25227BEk.A0B(string);
                        if (C14360o3.A0K(A0B.getHost(), "opal_profile")) {
                            String queryParameter = A0B.getQueryParameter("entry_type");
                            Integer num = C05F.A00;
                            if (!C14360o3.A0K(queryParameter, "pull")) {
                                num = C05F.A01;
                                if (!C14360o3.A0K(queryParameter, "fab")) {
                                    num = null;
                                }
                            }
                            Object A002 = AbstractC54852fj.A00();
                            if ((A002 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A002) != null) {
                                AbstractC31174DnI.A0d().A04(fragmentActivity, userSession, num, userSession.userId, "qp_megaphone", false, false);
                            }
                        }
                    } else {
                        String string2 = A07.getString("original_url");
                        if (string2 != null && (A03 = AbstractC08820cl.A03(string2)) != null) {
                            AbstractC31181DnP.A0N(this, A03);
                        }
                    }
                }
            } else {
                AbstractC35178FfV.A01(this, A07, A0F);
            }
            C0f9.A07(-1796113389, A00);
        }
        finish();
        C0f9.A07(-1796113389, A00);
    }

    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
