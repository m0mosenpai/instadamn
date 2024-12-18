package com.instagram.urlhandlers.qpinterstitial;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C1Q2;
import X.C4NJ;
import X.C54882fm;
import X.C55342gZ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class QpinterstitialUrlHandlerActivity extends BaseFragmentActivity {
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
        String A0a;
        C4NJ c4nj;
        C55342gZ c55342gZ;
        int A00 = C0f9.A00(419156790);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -135466116;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
                AbstractC18680vv session = getSession();
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, session);
                } else {
                    UserSession userSession = (UserSession) session;
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    String queryParameter = A0B.getQueryParameter("surface_nux_id");
                    String queryParameter2 = A0B.getQueryParameter("dismiss_last_qp");
                    if (queryParameter2 == null) {
                        queryParameter2 = "false";
                    }
                    boolean equals = queryParameter2.equals("true");
                    String queryParameter3 = A0B.getQueryParameter("trigger");
                    C54882fm c54882fm = new C54882fm(this, userSession);
                    Locale A02 = C1Q2.A02();
                    if (equals) {
                        if (queryParameter3 != null && queryParameter3.length() != 0 && AbstractC31180DnO.A1Z("IG4A_PREFETCH", queryParameter3, A02)) {
                            c4nj = C54882fm.A04;
                        } else {
                            c4nj = C54882fm.A05;
                        }
                        if (c4nj != null && (c55342gZ = C54882fm.A06) != null) {
                            c55342gZ.Dcp(c4nj);
                        }
                    }
                    if (queryParameter != null && queryParameter.length() != 0 && queryParameter.equals(String.valueOf(QuickPromotionSurface.A0B.A00))) {
                        if (queryParameter3 != null && queryParameter3.length() != 0 && AbstractC31180DnO.A1Z("IG4A_PREFETCH", queryParameter3, A02)) {
                            c54882fm.A03();
                        } else {
                            c54882fm.A02();
                        }
                    }
                    finish();
                }
                i = 823148103;
            } else {
                finish();
                i = -1943463678;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
