package com.instagram.urlhandlers.securitycheckup;

import X.AbstractC003100w;
import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC167027dH;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC32533EUj;
import X.AbstractC35178FfV;
import X.AbstractC58317Pt9;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C1GJ;
import X.C1ON;
import X.C25621Ms;
import X.C34866FYb;
import X.C35756Fqt;
import X.EDB;
import X.EnumC33390EpN;
import X.InterfaceC11380iw;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class SecurityCheckupUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "security_checkup_url_handler_activity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.1P1, X.EjB, X.EUj] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Integer A0i;
        int A00 = C0f9.A00(197213394);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            C09Y c09y = C023409i.A0A;
            if (c09y.A05(this) != null) {
                if (!(c09y.A05(this) instanceof UserSession)) {
                    AbstractC35178FfV.A02(this, A07, c09y);
                    finish();
                    i = 73026374;
                } else {
                    String A0a = AbstractC31171DnF.A0a(A07);
                    if (A0a != null) {
                        AbstractC18680vv A05 = c09y.A05(this);
                        Uri A0B = AbstractC25227BEk.A0B(A0a);
                        C35756Fqt.A00(getSupportFragmentManager(), this, 26);
                        String queryParameter = A0B.getQueryParameter("use_case");
                        if (queryParameter == null) {
                            A0i = Integer.valueOf(EnumC33390EpN.A04.A00);
                        } else {
                            A0i = AbstractC003100w.A0i(queryParameter);
                        }
                        C25621Ms A0C = AbstractC31179DnN.A0C(A05);
                        A0C.A0B("security_checkup/start/");
                        A0C.A0A(A0i, "use_case");
                        C1ON A0e = AbstractC25227BEk.A0e(A0C, EDB.class, C34866FYb.class);
                        AbstractC10360h2 A0D = AbstractC31172DnG.A0D(this);
                        AbstractC18680vv A052 = c09y.A05(this);
                        C14360o3.A0C(A052, AbstractC58317Pt9.A00(46));
                        AbstractC167027dH.A13(A0D, this, A052);
                        ?? abstractC32533EUj = new AbstractC32533EUj(A0D);
                        abstractC32533EUj.A00 = A0D;
                        abstractC32533EUj.A01 = this;
                        abstractC32533EUj.A02 = A052;
                        A0e.A00 = abstractC32533EUj;
                        C1GJ.A03(A0e);
                        i = 1569514612;
                    } else {
                        finish();
                        i = -1839206357;
                    }
                }
                C0f9.A07(i, A00);
            }
        }
        finish();
        i = 1481416160;
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
