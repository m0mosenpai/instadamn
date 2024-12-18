package com.instagram.urlhandlers.aistudio;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC23641Du;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31265Don;
import X.AbstractC31266Doo;
import X.AbstractC31268Doq;
import X.AbstractC35178FfV;
import X.AbstractC35257Fgr;
import X.AnonymousClass191;
import X.AnonymousClass773;
import X.C023409i;
import X.C05F;
import X.C06090Tz;
import X.C07Y;
import X.C09Y;
import X.C0f9;
import X.C0fJ;
import X.C18U;
import X.C25531Mh;
import X.C28370CfW;
import X.C35137Fee;
import X.C37211oK;
import X.C57312k6;
import X.C6WQ;
import X.Em0;
import X.InterfaceC11380iw;
import X.PZ9;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class AiStudioUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "AiStudioUrlHandlerActivity";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-1985856541);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -111151562;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = -38352602;
            } else {
                C09Y c09y = C023409i.A0A;
                AbstractC18680vv A05 = c09y.A05(this);
                if (!(A05 instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, A05);
                    i = 752877134;
                } else {
                    UserSession userSession = (UserSession) A05;
                    if (AbstractC31268Doq.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36319368741854486L)) {
                        AbstractC31265Don.A00();
                        Integer A002 = AbstractC31266Doo.A00(userSession).A00();
                        Integer num = C05F.A00;
                        if (A002 != num) {
                            Uri A0B = AbstractC25227BEk.A0B(A0a);
                            List<String> pathSegments = A0B.getPathSegments();
                            String str = null;
                            if (pathSegments.contains("ai")) {
                                if (pathSegments.size() >= 2) {
                                    str = pathSegments.get(1);
                                }
                            } else if (pathSegments.contains("chat")) {
                                str = AbstractC31172DnG.A11(A0B);
                            }
                            UtmMetadata utmMetadata = new UtmMetadata(A0B.getQueryParameter("utm_source"), A0B.getQueryParameter("utm_medium"), A0B.getQueryParameter("utm_campaign"), A0B.getQueryParameter("utm_content"));
                            String str2 = str;
                            if (str2 == null) {
                                AbstractC18680vv A052 = c09y.A05(this);
                                AbstractC31171DnF.A1Q(A052);
                                UserSession userSession2 = (UserSession) A052;
                                C25531Mh A003 = C28370CfW.A00(new C28370CfW(userSession2, null, null));
                                if (AbstractC25226BEj.A1Z(A003)) {
                                    A003.A0k("ai_home_deeplink_clicked");
                                    A003.A0u(null);
                                    A003.A0w(AbstractC167017dG.A0u("utm_content", utmMetadata.A01, AbstractC166987dD.A1L("utm_source", utmMetadata.A03), AbstractC166987dD.A1L("utm_medium", utmMetadata.A02), AbstractC166987dD.A1L("utm_campaign", utmMetadata.A00)));
                                    A003.Cht();
                                }
                                AbstractC35257Fgr.A00(this, utmMetadata, userSession2, "deeplink", null);
                                finish();
                            } else {
                                String str3 = utmMetadata.A03;
                                AbstractC18680vv A053 = c09y.A05(this);
                                AbstractC31171DnF.A1Q(A053);
                                C37211oK A004 = AbstractC31265Don.A00();
                                C6WQ A0i = AbstractC31174DnI.A0i(this);
                                AbstractC31176DnK.A13(this, A0i);
                                C0fJ.A00(A0i);
                                C57312k6 A005 = C07Y.A00(this);
                                AbstractC23641Du.A03(num, AnonymousClass191.A00, new PZ9(A053, A0i, A004, this, str3, str2, null, 5), A005);
                            }
                            i = 236690564;
                        }
                    }
                    C35137Fee c35137Fee = C35137Fee.A00;
                    String A0p = AbstractC166997dE.A0p(this, 2131965052);
                    SpannableStringBuilder A054 = AbstractC31175DnJ.A05(this, 2131952640);
                    AnonymousClass773.A05(A054, new Em0(this, this, AbstractC167007dF.A09(this, R.attr.igds_color_link)), A0p);
                    c35137Fee.A01(this, A054);
                    finish();
                    i = -2033713474;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
