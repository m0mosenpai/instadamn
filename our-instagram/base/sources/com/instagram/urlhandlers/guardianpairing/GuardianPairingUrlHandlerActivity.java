package com.instagram.urlhandlers.guardianpairing;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC40691uc;
import X.C023409i;
import X.C05F;
import X.C06N;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C2JM;
import X.C35756Fqt;
import X.C35826Fs2;
import X.C35831Fs7;
import X.C59666Qjk;
import X.FVY;
import X.InterfaceC40501uJ;
import X.MSV;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GuardianPairingUrlHandlerActivity extends BaseFragmentActivity {
    public final C06N A00 = new C35756Fqt(this, 14);

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
        Integer num;
        int i;
        int A00 = C0f9.A00(1261131020);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -992028840;
        } else {
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a == null) {
                finish();
                i = 1464126140;
            } else {
                getSupportFragmentManager().A0r(this.A00);
                AbstractC18680vv session = getSession();
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A07, session);
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    UserSession userSession = (UserSession) session;
                    C14360o3.A0B(userSession, 1);
                    try {
                        num = FVY.A00(String.valueOf(AbstractC31172DnG.A12(A0B)));
                    } catch (IllegalArgumentException unused) {
                        num = C05F.A00;
                    }
                    boolean A1U = AbstractC167007dF.A1U(num);
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    String str = userSession.userId;
                    A0b.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                    InterfaceC40501uJ A0U = AbstractC25227BEk.A0U(AbstractC167007dF.A1W(str));
                    Map paramsCopy = A0b.getParamsCopy();
                    Map paramsCopy2 = A0b2.getParamsCopy();
                    ArrayList A1E = AbstractC166987dD.A1E();
                    C35826Fs2.A00(new C35831Fs7(1, num, userSession, this), new PandoGraphQLRequest(A0U, "GetIsSupervisionEnabledQuery", paramsCopy, paramsCopy2, C59666Qjk.class, A1U, null, A1U ? 1 : 0, null, MSV.A00(1761), A1E), AbstractC40691uc.A01(userSession), userSession, 8);
                }
                i = -246218643;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
