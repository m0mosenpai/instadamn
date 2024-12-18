package com.instagram.urlhandler;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC58327PtK;
import X.C023409i;
import X.C06N;
import X.C09Y;
import X.C0f9;
import X.C192108fB;
import X.C1GJ;
import X.C32392EOt;
import X.C35756Fqt;
import X.C62862tP;
import X.InterfaceC11380iw;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class IgMeRecurringNotificationUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public final C06N A00 = new C35756Fqt(this, 1);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "IgRecurringNotificationBottomSheet";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        Bundle A08;
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            return c09y.A04(A08);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(630925661);
        super.onCreate(AbstractC58327PtK.A00(bundle));
        Bundle A07 = AbstractC31176DnK.A07(this);
        AbstractC18680vv session = getSession();
        if (A07 != null && session != null) {
            if (!(session instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, session);
                finish();
                i = 117744773;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = 635778247;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    Object queryParameter = A0B.getQueryParameter("page_info");
                    if (AbstractC31174DnI.A04(A0B) != 2) {
                        if (queryParameter == null) {
                            finish();
                            i = 1996768918;
                        }
                        HashMap A12 = AbstractC31174DnI.A12("page_info", queryParameter);
                        AbstractC31180DnO.A15(A0B, "topic", A12);
                        AbstractC31180DnO.A15(A0B, "app_id", A12);
                        AbstractC31180DnO.A15(A0B, "cadence", A12);
                        AbstractC31180DnO.A15(A0B, "ref", A12);
                        AbstractC31180DnO.A15(A0B, "mm_user_ref", A12);
                        AbstractC31181DnP.A0L(this, getWindow());
                        getSupportFragmentManager().A0r(this.A00);
                        C62862tP A01 = C62862tP.A01(null, this, this, getSession());
                        AbstractC192798gL A05 = C192108fB.A05(session, "com.bloks.www.igdotme.rn.validate", A12);
                        C32392EOt.A00(A05, A01, 15);
                        C1GJ.A03(A05);
                        i = -1148353920;
                    } else {
                        if (queryParameter == null && (queryParameter = AbstractC25227BEk.A0t(A0B.getPathSegments())) == null) {
                            finish();
                            i = -1658604102;
                        }
                        HashMap A122 = AbstractC31174DnI.A12("page_info", queryParameter);
                        AbstractC31180DnO.A15(A0B, "topic", A122);
                        AbstractC31180DnO.A15(A0B, "app_id", A122);
                        AbstractC31180DnO.A15(A0B, "cadence", A122);
                        AbstractC31180DnO.A15(A0B, "ref", A122);
                        AbstractC31180DnO.A15(A0B, "mm_user_ref", A122);
                        AbstractC31181DnP.A0L(this, getWindow());
                        getSupportFragmentManager().A0r(this.A00);
                        C62862tP A012 = C62862tP.A01(null, this, this, getSession());
                        AbstractC192798gL A052 = C192108fB.A05(session, "com.bloks.www.igdotme.rn.validate", A122);
                        C32392EOt.A00(A052, A012, 15);
                        C1GJ.A03(A052);
                        i = -1148353920;
                    }
                }
            }
        } else {
            finish();
            i = -447179337;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(-1569356124);
        overridePendingTransition(0, 0);
        super.onStart();
        C0f9.A07(-989366249, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
