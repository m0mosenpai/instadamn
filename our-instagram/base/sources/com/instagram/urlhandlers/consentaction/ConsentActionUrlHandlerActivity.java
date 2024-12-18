package com.instagram.urlhandlers.consentaction;

import X.AbstractC002300n;
import X.AbstractC08760ce;
import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35275FhA;
import X.AbstractC54852fj;
import X.C06090Tz;
import X.C08600cO;
import X.C0K8;
import X.C0f9;
import X.C14360o3;
import X.C66273U6s;
import X.C72743Nv;
import X.FTf;
import X.InterfaceC11380iw;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ConsentActionUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public UserSession A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "consent_action";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i;
        UserSession userSession;
        HashMap A01;
        Boolean A0c;
        FragmentActivity fragmentActivity;
        AbstractC10360h2 supportFragmentManager;
        Fragment A0O;
        int A00 = C0f9.A00(777913492);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = -893279103;
        } else {
            UserSession A0G = AbstractC31171DnF.A0G(A07);
            this.A00 = A0G;
            C08600cO c08600cO = new C08600cO();
            c08600cO.A01();
            c08600cO.A02(AbstractC08760ce.A0m, "com.instagram.android");
            try {
                c08600cO.A00().A02(this, getIntent(), null);
                userSession = this.A00;
            } catch (IllegalStateException e) {
                e = e;
                str = "Failed to verify caller";
                C0K8.A0F("CONSENT_ACTION", str, e);
                finish();
                i = -2086490636;
                C0f9.A07(i, A00);
            } catch (SecurityException e2) {
                e = e2;
                str = "Security issue with caller";
                C0K8.A0F("CONSENT_ACTION", str, e);
                finish();
                i = -2086490636;
                C0f9.A07(i, A00);
            }
            if (userSession != null && (A0c = AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36312062997300102L)) != null && A0c.booleanValue() && (fragmentActivity = (FragmentActivity) AbstractC54852fj.A00()) != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (A0O = supportFragmentManager.A0O(R.id.layout_container_main)) != null) {
                if (!(A0O instanceof C72743Nv)) {
                    AbstractC10360h2 childFragmentManager = A0O.getChildFragmentManager();
                    C14360o3.A07(childFragmentManager);
                    Iterator it = childFragmentManager.A0U.A04().iterator();
                    while (it.hasNext()) {
                        A0O = (Fragment) AbstractC166997dE.A0l(it);
                        if (A0O instanceof C72743Nv) {
                        }
                    }
                }
                C66273U6s c66273U6s = ((C72743Nv) A0O).A05;
                if (c66273U6s != null) {
                    String str2 = c66273U6s.A09;
                    if (str2 != null && AbstractC002300n.A0h(str2, "com.bloks.www.privacy.consent", false)) {
                        C0K8.A0C("CONSENT_ACTION", "Consent Screen Already showing");
                        finish();
                        i = -2086490636;
                    }
                } else {
                    throw AbstractC166987dD.A14("BloksSurfaceProps not found");
                }
            }
            String A0a = AbstractC31171DnF.A0a(A07);
            if (A0a != null) {
                Uri A0B = AbstractC25227BEk.A0B(A0a);
                if (A0a.length() != 0 && A0G != null) {
                    String queryParameter = A0B.getQueryParameter("params");
                    if (queryParameter != null) {
                        try {
                            A01 = FTf.A01(A0G, queryParameter);
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        A01 = null;
                    }
                    FragmentActivity fragmentActivity2 = (FragmentActivity) AbstractC54852fj.A00();
                    if (A01 != null && !A01.isEmpty() && fragmentActivity2 != null) {
                        AbstractC35275FhA.A0D(fragmentActivity2, this, A0G, AbstractC111324zv.A00(367), "CONSENT_ACTION", A01);
                    }
                }
            }
            finish();
            i = -2086490636;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-1557060764);
        super.onResume();
        Window window = getWindow();
        if (window != null && window.getDecorView() != null) {
            AbstractC31172DnG.A1B(getApplicationContext(), getWindow().getDecorView(), R.color.igds_creation_menu_background);
        }
        C0f9.A07(-1473240209, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
