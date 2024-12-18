package com.instagram.urlhandlers.infocenterfactexternal;

import X.AbstractC08820cl;
import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C0fJ;
import X.C0w9;
import X.C192108fB;
import X.C1GJ;
import X.C32393EOu;
import X.C55551Oll;
import X.C62862tP;
import X.C6WQ;
import X.FTf;
import X.InterfaceC11380iw;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class InfoCenterFactExternalUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;
    public UserSession A01;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "info_center_fact";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.net.Uri] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        String str2;
        String scheme;
        int A00 = C0f9.A00(-1622647775);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -1371901064;
        } else {
            C09Y c09y = C023409i.A0A;
            this.A00 = c09y.A04(A07);
            this.A01 = c09y.A06(A07);
            if (this.A00 != null) {
                ?? r2 = "INFO_CENTER_FACT";
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a != null && A0a.length() != 0) {
                    try {
                        r2 = AbstractC08820cl.A03(A0a);
                        scheme = r2.getScheme();
                    } catch (NullPointerException unused) {
                        str = "Error parsing uri with NullPointerException";
                        str2 = r2;
                        C0w9.A03(str2, str);
                        finish();
                        i = -1773595305;
                        C0f9.A07(i, A00);
                    } catch (SecurityException unused2) {
                        str = "Error parsing uri with SecurityException";
                        str2 = r2;
                        C0w9.A03(str2, str);
                        finish();
                        i = -1773595305;
                        C0f9.A07(i, A00);
                    }
                    if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme) || "instagram".equalsIgnoreCase(scheme)) {
                        String queryParameter = r2.getQueryParameter("params");
                        UserSession userSession = this.A01;
                        if (userSession != null && queryParameter != null) {
                            try {
                                HashMap A01 = FTf.A01(userSession, queryParameter);
                                if (A01 != null && !A01.isEmpty()) {
                                    AbstractC18680vv abstractC18680vv = this.A00;
                                    if (abstractC18680vv != null) {
                                        C6WQ A0i = AbstractC31174DnI.A0i(this);
                                        AbstractC31176DnK.A13(this, A0i);
                                        C0fJ.A00(A0i);
                                        AbstractC10360h2 A0D = AbstractC31172DnG.A0D(this);
                                        A0D.A0r(new C55551Oll(5, this, A0D));
                                        C62862tP A012 = C62862tP.A01(null, this, this, abstractC18680vv);
                                        AbstractC192798gL A05 = C192108fB.A05(abstractC18680vv, "com.instagram.stories.bloks_tappable_stickers.covid_fact.action", A01);
                                        C32393EOu.A00(A05, A0i, A0D, A012, 17);
                                        C1GJ.A03(A05);
                                    }
                                    i = -1773595305;
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
                finish();
                i = -1773595305;
            } else {
                finish();
                i = 2024786196;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
