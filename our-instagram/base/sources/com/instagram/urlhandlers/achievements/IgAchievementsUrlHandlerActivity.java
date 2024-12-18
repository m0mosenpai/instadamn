package com.instagram.urlhandlers.achievements;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31181DnP;
import X.AbstractC35178FfV;
import X.AbstractC54852fj;
import X.AbstractC62582sx;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.F1B;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class IgAchievementsUrlHandlerActivity extends BaseFragmentActivity {
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

    public final void A0n(UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, str);
        if (AbstractC54852fj.A00() != null) {
            Object A00 = AbstractC54852fj.A00();
            AbstractC31171DnF.A1P(A00);
            FragmentActivity fragmentActivity = (FragmentActivity) A00;
            if (!AbstractC62582sx.A00(fragmentActivity).A11() && !AbstractC62582sx.A00(fragmentActivity).A0G) {
                Uri A0B = AbstractC25227BEk.A0B(str);
                String A12 = AbstractC31172DnG.A12(A0B);
                String queryParameter = A0B.getQueryParameter("challenge_id");
                String queryParameter2 = A0B.getQueryParameter("show_earned");
                AbstractC25229BEm.A18(F1B.A00(Boolean.valueOf(Boolean.parseBoolean(queryParameter2)), A12, queryParameter, AbstractC16960so.A1O(A0B.getQueryParameter("achievement_id"))), AbstractC25225BEi.A0r(fragmentActivity, userSession));
            } else if (isFinishing() || isDestroyed()) {
                return;
            }
        } else {
            AbstractC31181DnP.A0N(this, AbstractC25227BEk.A0B(str));
        }
        finish();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-45486667);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1899852879;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 == null) {
                finish();
                i = 1361176575;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = 688662612;
                } else {
                    AbstractC18680vv session = getSession();
                    if (!(session instanceof UserSession)) {
                        AbstractC35178FfV.A01(this, A07, session);
                    } else {
                        A0n((UserSession) session, A0a);
                    }
                    i = -1398019049;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
