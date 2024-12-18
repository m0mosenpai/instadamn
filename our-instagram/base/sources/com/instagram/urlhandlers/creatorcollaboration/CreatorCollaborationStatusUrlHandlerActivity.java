package com.instagram.urlhandlers.creatorcollaboration;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C32299EKm;
import X.MSV;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class CreatorCollaborationStatusUrlHandlerActivity extends BaseFragmentActivity {
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
        int A00 = C0f9.A00(-1194750258);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -511730266;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 == null) {
                finish();
                i = -902025417;
            } else if (AbstractC31171DnF.A0a(A07) == null) {
                finish();
                i = -1103546262;
            } else {
                AbstractC18680vv session = getSession();
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, session);
                } else {
                    C32299EKm c32299EKm = new C32299EKm();
                    AbstractC25233BEq.A15(c32299EKm, MSV.A00(177), "qp");
                    C140966Yy A0N = AbstractC31174DnI.A0N(c32299EKm, this, session);
                    A0N.A0F = true;
                    A0N.A0D = false;
                    A0N.A04();
                }
                i = -2059034783;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
