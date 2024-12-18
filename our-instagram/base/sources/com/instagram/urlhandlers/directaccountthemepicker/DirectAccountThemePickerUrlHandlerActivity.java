package com.instagram.urlhandlers.directaccountthemepicker;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC34073F2b;
import X.AbstractC40691uc;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C2JM;
import X.C32293EKg;
import X.C34476FHo;
import X.C35826Fs2;
import X.C58510Pwe;
import X.C59449Qek;
import X.DHP;
import X.InterfaceC11380iw;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class DirectAccountThemePickerUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public String A00;
    public final UserSession A01 = AbstractC03270Dk.A00(AbstractC31171DnF.A0F(this));

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DirectAccountThemePickerUrlHandlerActivity";
    }

    public static final void A00(DirectAccountThemePickerUrlHandlerActivity directAccountThemePickerUrlHandlerActivity, boolean z) {
        UserSession userSession = directAccountThemePickerUrlHandlerActivity.A01;
        DHP dhp = new DHP(26, directAccountThemePickerUrlHandlerActivity, z);
        C14360o3.A0B(userSession, 0);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "NMEIGBrandedThreadsConfigInfoQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59449Qek.class, false, null, 0, null, AbstractC58317Pt9.A00(817), AbstractC166987dD.A1E());
        AbstractC40691uc.A01(userSession).ATV(new C35826Fs2(4, dhp), new C58510Pwe(dhp, 13), pandoGraphQLRequest);
        if (!z) {
            directAccountThemePickerUrlHandlerActivity.finish();
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        String str;
        int A00 = C0f9.A00(1338274503);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            Uri A0B = AbstractC25227BEk.A0B(A0a);
            A0B.getHost();
            String queryParameter = A0B.getQueryParameter("entrypoint");
            this.A00 = queryParameter;
            if (queryParameter != null) {
                str = AbstractC167007dF.A0h(queryParameter);
            } else {
                str = null;
            }
            if (AbstractC25225BEi.A1a(str, AbstractC31172DnG.A16(Locale.ROOT, "IG_BENEFITS_CENTER"))) {
                C32293EKg c32293EKg = new C32293EKg();
                c32293EKg.A00 = new C34476FHo(this);
                UserSession userSession = this.A01;
                C140966Yy A0O = AbstractC31173DnH.A0O(null, c32293EKg, this, userSession);
                A0O.A0D = false;
                A0O.A04();
                String str2 = this.A00;
                C14360o3.A0B(userSession, 0);
                AbstractC34073F2b.A00(this, userSession, AbstractC43591JPw.A00(311), "impression", "form", str2, null);
            } else {
                A00(this, false);
            }
            i = -803395493;
        } else {
            finish();
            i = -194984146;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
