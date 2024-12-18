package com.instagram.urlhandlers.viewleadsformedia;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.WFR;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ViewLeadsForMediaUrlHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

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
        Bundle A08;
        int A00 = C0f9.A00(-1656060454);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            this.A00 = AbstractC31171DnF.A0G(A08);
            String A0a = AbstractC31171DnF.A0a(A08);
            if (A0a != null && A0a.length() != 0) {
                String lastPathSegment = AbstractC25227BEk.A0B(A0a).getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                if (!AbstractC31172DnG.A1Y(this)) {
                    AbstractC35178FfV.A03(A08, this);
                } else {
                    AbstractC18680vv session = getSession();
                    C14360o3.A0B(session, 1);
                    WFR.A01(this, session, "com.bloks.www.ig.smb.services.lead_gen.lead_gen_info", AbstractC167017dG.A0r("lead_gen_info_id", lastPathSegment));
                }
            } else {
                finish();
            }
            i = 1620645778;
        } else {
            finish();
            i = 426999905;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
