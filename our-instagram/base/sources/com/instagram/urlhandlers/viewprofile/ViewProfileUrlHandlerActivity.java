package com.instagram.urlhandlers.viewprofile;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31364DqT;
import X.AbstractC31402Dr6;
import X.AbstractC35105Fe7;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C12260kU;
import X.C140966Yy;
import X.C14360o3;
import X.C28431Ze;
import X.C31368DqX;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ViewProfileUrlHandlerActivity extends BaseFragmentActivity {
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
        String A0a;
        int A00 = C0f9.A00(2034507385);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        AbstractC18680vv session = getSession();
        if (!(session instanceof UserSession)) {
            AbstractC35178FfV.A01(this, A07, session);
        } else {
            if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null && A0a.length() > 0) {
                UserSession userSession = (UserSession) session;
                Long l = null;
                String str = null;
                String str2 = null;
                Long l2 = null;
                C14360o3.A0B(userSession, 1);
                try {
                    Uri A03 = AbstractC08820cl.A03(A0a);
                    C14360o3.A0A(A03);
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equalsIgnoreCase(A03.getHost())) {
                        String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        String queryParameter2 = A03.getQueryParameter("id_type");
                        String queryParameter3 = A03.getQueryParameter("upcoming_event_id");
                        boolean z = false;
                        Long l3 = null;
                        if (queryParameter3 != null) {
                            str2 = A03.getQueryParameter("upcoming_event_name");
                            String queryParameter4 = A03.getQueryParameter("upcoming_event_start_time");
                            if (queryParameter4 != null) {
                                l2 = AbstractC166997dE.A0j(queryParameter4);
                            }
                            String queryParameter5 = A03.getQueryParameter("upcoming_event_end_time");
                            if (queryParameter5 != null) {
                                l3 = AbstractC166997dE.A0j(queryParameter5);
                            }
                            str = queryParameter3;
                            l = l3;
                            z = true;
                        }
                        String queryParameter6 = A03.getQueryParameter("source_application");
                        if (queryParameter != null && queryParameter.length() > 0 && queryParameter2 != null) {
                            if (queryParameter2.equals("fbid")) {
                                AbstractC35105Fe7.A00(this, AbstractC31171DnF.A0D("ViewProfileUrlHandler"), userSession, AbstractC166997dE.A0j(queryParameter), "ig_direct");
                            } else if (queryParameter2.equals("igid")) {
                                if (!"com.instagram.barcelona".equals(queryParameter6) && !"com.instagram.android".equals(queryParameter6)) {
                                    C140966Yy A0r = AbstractC25225BEi.A0r(this, userSession);
                                    C28431Ze A02 = AbstractC31364DqT.A02();
                                    C31368DqX A01 = AbstractC31402Dr6.A01(userSession, queryParameter, "deep_link", "ViewProfileUrlHandler");
                                    Long l4 = null;
                                    String str3 = null;
                                    if (z) {
                                        str3 = str;
                                    }
                                    A01.A0P = str3;
                                    String str4 = null;
                                    if (z) {
                                        str4 = str2;
                                    }
                                    A01.A0Q = str4;
                                    Long l5 = null;
                                    if (z) {
                                        l5 = l2;
                                    }
                                    A01.A07 = l5;
                                    if (z) {
                                        l4 = l;
                                    }
                                    A01.A06 = l4;
                                    A0r.A0D(C31368DqX.A00(userSession, A02, A01));
                                    A0r.A0F = true;
                                    AbstractC31174DnI.A1L(A0r);
                                } else {
                                    C12260kU.A0C(this, AbstractC31173DnH.A09(AbstractC31176DnK.A06(this), AbstractC31174DnI.A0B(AbstractC31175DnJ.A04("instagram://userid").appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, queryParameter).appendQueryParameter("id_type", "igid"), "source_application", queryParameter6)));
                                }
                            }
                        }
                    }
                } catch (SecurityException unused) {
                    finish();
                }
            }
            finish();
        }
        C0f9.A07(2065906663, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
