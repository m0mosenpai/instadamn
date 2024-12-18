package com.instagram.urlhandlers.self_profile_handler;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31181DnP;
import X.AbstractC31364DqT;
import X.AbstractC31402Dr6;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class SelfProfileHandlerUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1026114275);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        C09Y c09y = C023409i.A0A;
        if (c09y.A05(this) != null && (c09y.A05(this) instanceof UserSession)) {
            UserSession A002 = AbstractC03270Dk.A00(c09y.A05(this));
            Fragment A01 = AbstractC31364DqT.A01(A002, AbstractC31402Dr6.A00(A002, "deep_link", "SelfProfileHandlerUrlHandlerActivity"));
            Bundle A0B = AbstractC31177DnL.A0B(A01);
            AbstractC31173DnH.A1C(A0B, A002);
            A01.setArguments(A0B);
            AbstractC31181DnP.A0a(A01, this, A002);
        } else {
            AbstractC35178FfV.A02(this, A07, c09y);
        }
        C0f9.A07(-445580309, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
