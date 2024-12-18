package com.instagram.urlhandlers.fanclub;

import X.AbstractC001900j;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC63292u7;
import X.C023409i;
import X.C0f9;
import X.C140966Yy;
import X.C66277U6x;
import X.EOH;
import X.F9A;
import X.FVI;
import X.W6d;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FanClubUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return C023409i.A0A.A07(AbstractC31176DnK.A07(this));
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        C140966Yy A0r;
        Fragment A00;
        int A002 = C0f9.A00(1295780663);
        super.onCreate(bundle);
        UserSession A07 = C023409i.A0A.A07(getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"));
        if (A07 == null) {
            finish();
            i = 21714128;
        } else {
            FanClubInfoDict A0M = AbstractC31172DnG.A0M(AbstractC166997dE.A0Y(A07));
            if (A0M != null && A0M.getFanClubId() != null) {
                Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
                if (bundleExtra != null && (A0a = AbstractC31171DnF.A0a(bundleExtra)) != null) {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    if (AbstractC001900j.A0a(AbstractC166987dD.A19(A0B), "subscriptions_story_sticker", false)) {
                        FVI.A01().A02(this, A07);
                        finish();
                        i = 894669973;
                    } else {
                        String lastPathSegment = A0B.getLastPathSegment();
                        if (lastPathSegment != null) {
                            int hashCode = lastPathSegment.hashCode();
                            if (hashCode != -216457707) {
                                if (hashCode != 218786155) {
                                    if (hashCode == 1557721666 && lastPathSegment.equals("details")) {
                                        A0r = AbstractC25225BEi.A0r(this, A07);
                                        FVI.A00();
                                        C66277U6x A01 = C66277U6x.A01("com.instagram.user_pay.fan_club.screens.creator_onboarding.creator_side_subscription_settings", AbstractC167017dG.A0r("tooltip", A0B.getQueryParameter("tooltip")));
                                        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A07);
                                        AbstractC31171DnF.A10(this, A0C, 2131976535);
                                        A00 = W6d.A02(A0C, A01);
                                        A0r.A0D(A00);
                                        A0r.A0D = false;
                                        A0r.A04();
                                    }
                                } else if (lastPathSegment.equals("content_preview_picker")) {
                                    if (AbstractC63292u7.A01(A07)) {
                                        A0r = AbstractC25225BEi.A0r(this, A07);
                                        A00 = FVI.A00().A00("preview_picker");
                                        A0r.A0D(A00);
                                        A0r.A0D = false;
                                        A0r.A04();
                                    }
                                }
                            } else if (lastPathSegment.equals("subscriber_list")) {
                                String queryParameter = A0B.getQueryParameter("origin");
                                A0r = AbstractC25225BEi.A0r(this, A07);
                                FVI.A01().A00();
                                String A003 = F9A.A00(queryParameter);
                                if (A003 == null) {
                                    A003 = "UNKNOWN";
                                }
                                Bundle A0b = AbstractC166987dD.A0b();
                                A0b.putString("ARGUMENT_ENTRY_POINT", A003);
                                EOH eoh = new EOH();
                                eoh.setArguments(A0b);
                                A0r.A0D(eoh);
                                A0r.A0D = false;
                                A0r.A04();
                            }
                            i = 1229894474;
                        }
                    }
                } else {
                    finish();
                    i = 1576108089;
                }
            }
            finish();
            i = 1229894474;
        }
        C0f9.A07(i, A002);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return C023409i.A0A.A07(AbstractC31176DnK.A07(this));
    }
}
