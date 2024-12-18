package com.instagram.urlhandlers.familycenter;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC86593tX;
import X.C05F;
import X.C06N;
import X.C0f9;
import X.C0fJ;
import X.C23831Eq;
import X.C35756Fqt;
import X.C36029FvR;
import X.C62862tP;
import X.C6WQ;
import X.FTe;
import X.FVY;
import X.InterfaceC223716s;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FamilyCenterUrlHandlerActivity extends BaseFragmentActivity {
    public final C06N A01 = new C35756Fqt(this, 10);
    public boolean A00 = true;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InterfaceC223716s C45;
        Integer num;
        String A0l;
        String A0l2;
        Integer num2;
        String A0l3;
        int i;
        int A00 = C0f9.A00(-1103601008);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -326262922;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = 1460784945;
            } else {
                AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
                if (!(A0F instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, A0F);
                } else {
                    AbstractC31181DnP.A0L(this, getWindow());
                    getSupportFragmentManager().A0r(this.A01);
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    UserSession userSession = (UserSession) A0F;
                    if ((AbstractC31174DnI.A04(A0B) >= 1 && (A0l3 = AbstractC31176DnK.A0l(A0B, 0)) != null && A0l3.equalsIgnoreCase("supervision")) || ((C45 = AbstractC31174DnI.A0m(userSession).C45()) != null && AbstractC166997dE.A1Z(C45.CTX(), true) && AbstractC31174DnI.A04(A0B) >= 1 && (((A0l = AbstractC31176DnK.A0l(A0B, 0)) != null && A0l.equalsIgnoreCase("dashboard")) || ((A0l2 = AbstractC31176DnK.A0l(A0B, 0)) != null && A0l2.equalsIgnoreCase("share_supervision"))))) {
                        try {
                            num2 = FVY.A00(String.valueOf(A0B.getQueryParameter("entrypoint")));
                        } catch (IllegalArgumentException unused) {
                            num2 = C05F.A0u;
                        }
                        AbstractC86593tX.A0b(this, userSession, num2);
                    } else {
                        try {
                            num = FVY.A00(String.valueOf(A0B.getQueryParameter("entrypoint")));
                        } catch (IllegalArgumentException unused2) {
                            num = C05F.A0u;
                        }
                        AbstractC167007dF.A1D(userSession, 1, num);
                        InterfaceC223716s C452 = AbstractC166997dE.A0Y(userSession).A03.C45();
                        String str = null;
                        String obj = A0B.toString();
                        if (obj == null) {
                            if (C452 != null) {
                                obj = C452.B5G();
                            } else {
                                obj = null;
                            }
                        }
                        if (obj != null) {
                            Uri.Builder A04 = AbstractC31175DnJ.A04(obj);
                            A04.appendQueryParameter("entrypoint", FVY.A01(num));
                            str = A04.toString();
                        }
                        C6WQ c6wq = new C6WQ(this, true);
                        AbstractC31176DnK.A13(c6wq.getContext(), c6wq);
                        c6wq.setCancelable(false);
                        C0fJ.A00(c6wq);
                        C62862tP A01 = C62862tP.A01(null, this, AbstractC31171DnF.A0D("guardian_pairing_screen"), userSession);
                        HashMap A1G = AbstractC166987dD.A1G();
                        HashMap A0h = AbstractC31177DnL.A0h();
                        A1G.put("serialized_logging_context", AbstractC31175DnJ.A0d(AbstractC167007dF.A0n("entrypoint", FVY.A01(num))));
                        A1G.put("timezone_offset_seconds_from_gmt", Long.valueOf(C23831Eq.A00()));
                        A1G.put("weburl", str);
                        FTe.A00(new C36029FvR(1, this, c6wq), "com.bloks.www.yp.familycenter.async", A1G, A0h).A00(this, A01);
                    }
                }
                i = 622365274;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-606488147);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        C0f9.A07(-702929793, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
