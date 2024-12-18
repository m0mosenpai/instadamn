package com.instagram.urlhandlers.p2mpayoutsettings;

import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC31198Dnh;
import X.AbstractC35178FfV;
import X.AbstractC35181FfY;
import X.AbstractC58442PvL;
import X.C023409i;
import X.C09Y;
import X.C0BQ;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C17110t6;
import X.C66277U6x;
import X.C9GR;
import X.InterfaceC02900Bo;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class P2mPayoutSettingsUrlHandlerActivity extends BaseFragmentActivity {
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
        String string;
        boolean z;
        int A00 = C0f9.A00(-1132824033);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1331189073;
        } else {
            Intent intent = getIntent();
            if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
                AbstractC18680vv session = getSession();
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A08, session);
                } else {
                    UserSession userSession = (UserSession) session;
                    String string2 = A08.getString("original_url");
                    if (string2 != null && string2.length() != 0) {
                        try {
                            Uri A03 = AbstractC08820cl.A03(string2);
                            String queryParameter = A03.getQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                            String queryParameter2 = A03.getQueryParameter(AbstractC31198Dnh.A00());
                            String queryParameter3 = A03.getQueryParameter("show_payouts");
                            if (queryParameter != null && queryParameter.length() != 0) {
                                if (userSession.userId.equals(queryParameter)) {
                                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                                    A0C.A0R = "com.bloks.www.payments.igp2m.payout_management";
                                    HashMap A1G = AbstractC166987dD.A1G();
                                    HashMap A1G2 = AbstractC166987dD.A1G();
                                    HashMap A1G3 = AbstractC166987dD.A1G();
                                    BitSet A0j = AbstractC31171DnF.A0j(1);
                                    if (queryParameter2 == null || queryParameter2.length() == 0) {
                                        queryParameter2 = AbstractC58442PvL.A02();
                                    }
                                    A1G.put("logging_session_id", queryParameter2);
                                    A0j.set(0);
                                    if (queryParameter3 != null && queryParameter3.length() != 0) {
                                        z = Boolean.valueOf(Boolean.parseBoolean(queryParameter3));
                                    } else {
                                        z = false;
                                    }
                                    A1G.put("show_payouts", z);
                                    C140966Yy A0r = AbstractC25225BEi.A0r(this, userSession);
                                    if (A0j.nextClearBit(0) >= 1) {
                                        C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.payments.igp2m.payout_management", A1G, A1G2);
                                        A0H.A03 = null;
                                        A0H.A02 = null;
                                        A0H.A04 = null;
                                        A0H.A08(A1G3);
                                        A0r.A0B(null, A0H.A03(this, A0C));
                                        A0r.A0D = false;
                                        A0r.A04();
                                    } else {
                                        throw AbstractC31173DnH.A0f();
                                    }
                                } else {
                                    InterfaceC02900Bo A002 = C0BQ.A00(userSession);
                                    if (((C17110t6) A002).BOc(null).contains(queryParameter)) {
                                        User BOa = A002.BOa(queryParameter);
                                        if (BOa != null && A002.AGB(this, userSession, BOa) && (string = A08.getString("original_url")) != null && string.length() != 0) {
                                            try {
                                                Intent flags = new Intent("android.intent.action.VIEW", AbstractC25227BEk.A0B(string)).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
                                                C14360o3.A07(flags);
                                                flags.setPackage(getPackageName());
                                                A002.E45(this, flags, userSession, BOa, "deep_link");
                                                finish();
                                            } catch (SecurityException unused) {
                                            }
                                        }
                                    } else if (AbstractC35181FfY.A02(userSession)) {
                                        A08.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
                                        AbstractC35178FfV.A01(this, A08, userSession);
                                    } else {
                                        C9GR.A01(this, null, 2131966062, 0);
                                    }
                                }
                            }
                        } catch (IllegalArgumentException | SecurityException unused2) {
                            finish();
                        }
                    }
                    finish();
                }
                i = 1800696800;
            } else {
                finish();
                i = -1735864818;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
