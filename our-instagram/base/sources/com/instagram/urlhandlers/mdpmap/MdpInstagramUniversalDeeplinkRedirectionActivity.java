package com.instagram.urlhandlers.mdpmap;

import X.AbstractC001900j;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC35178FfV;
import X.AbstractC58317Pt9;
import X.C0b3;
import X.C0f9;
import X.C17060sy;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class MdpInstagramUniversalDeeplinkRedirectionActivity extends BaseFragmentActivity {
    public static final HashMap A01;
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A01 = A1G;
        A1G.put("settings", "instagram://settings");
        A1G.put("news", "instagram://news");
        A1G.put("professional_dashboard", "instagram://professional_dashboard");
        A1G.put("news", "instagram://news");
        A1G.put("saved", "instagram://saved");
        A1G.put("search", "instagram://search");
        A1G.put("facebook_page_onboarding", "instagram://facebook_page_onboarding");
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int i;
        int A00 = C0f9.A00(1223818202);
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        Bundle A08 = AbstractC31172DnG.A08(intent2);
        if (A08 == null) {
            finish();
            i = -1088362035;
        } else {
            this.A00 = AbstractC31172DnG.A0V(A08);
            String stringExtra = intent2.getStringExtra("deeplink");
            String A0h = AbstractC31171DnF.A0h(stringExtra, A01);
            if (A0h != null) {
                intent = AbstractC31177DnL.A07(A0h).addCategory(AbstractC58317Pt9.A00(4));
            } else {
                intent = null;
            }
            AbstractC18680vv abstractC18680vv = this.A00;
            if (abstractC18680vv != null && (!(abstractC18680vv instanceof UserSession) || ((stringExtra == null || !AbstractC001900j.A0a(stringExtra, "facebook_page_onboarding", false)) && !C17060sy.A01.A01((UserSession) abstractC18680vv).A1J()))) {
                AbstractC35178FfV.A01(this, A08, abstractC18680vv);
            }
            if (intent != null) {
                C0b3.A00().A06().A0G(this, intent);
            }
            finish();
            i = -1538536660;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
