package com.instagram.nux.activity;

import X.AbstractC08820cl;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC141776au;
import X.AbstractC14490oL;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31180DnO;
import X.AbstractC31189DnY;
import X.AbstractC31525Dt9;
import X.AbstractC35275FhA;
import X.AbstractC35276FhB;
import X.AbstractC52232aO;
import X.AbstractC58317Pt9;
import X.AbstractC58327PtK;
import X.C023409i;
import X.C05F;
import X.C07270a1;
import X.C07340a8;
import X.C08V;
import X.C09Y;
import X.C0f9;
import X.C12L;
import X.C14120nc;
import X.C14360o3;
import X.C16030qx;
import X.C19T;
import X.C1ON;
import X.C1P1;
import X.C1Q2;
import X.C1U4;
import X.C218914p;
import X.C25621Ms;
import X.C2U7;
import X.C31470DsE;
import X.C31650DvG;
import X.C32547EUx;
import X.C32995Egi;
import X.C34805FVh;
import X.C34937FaN;
import X.C35017Fbq;
import X.C35020Fbt;
import X.C35231FgO;
import X.C35264Fgy;
import X.C35762Fqz;
import X.C36007Fv5;
import X.C36036FvY;
import X.C36160Fxa;
import X.C3M9;
import X.C41451vu;
import X.C49529Lui;
import X.C52942bb;
import X.C57169PZn;
import X.C57170PZo;
import X.C57432kI;
import X.C63378Siq;
import X.C6WQ;
import X.C95P;
import X.EUW;
import X.EUX;
import X.EfQ;
import X.EnumC31713DwI;
import X.EnumC33446EqJ;
import X.FJN;
import X.FJP;
import X.FK4;
import X.GZG;
import X.InterfaceC11380iw;
import X.InterfaceC23621Ds;
import X.InterfaceC37106GWr;
import X.InterfaceC41501vz;
import X.InterfaceC53202c2;
import X.RcT;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.R;
import com.facebook.endtoend.EndToEnd;
import com.google.android.gms.auth.api.credentials.Credential;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public class SignedOutFragmentActivity extends BaseFragmentActivity implements InterfaceC11380iw, GZG, InterfaceC53202c2, InterfaceC37106GWr, C08V {
    public InterfaceC11380iw A00;
    public C07270a1 A01;
    public C35020Fbt A02;
    public FxSsoViewModel A03;
    public C34937FaN A04;
    public C6WQ A05;
    public String A06;
    public boolean A09;
    public AymhViewModel A0D;
    public final InterfaceC41501vz A0H = C31650DvG.A00(this, 55);
    public final InterfaceC41501vz A0G = C31650DvG.A00(this, 56);
    public boolean A07 = true;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0C = false;
    public boolean A08 = false;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "signed_out_fragment_activity";
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        Uri A00;
        String string;
        C1ON A0U;
        String A0j;
        C1P1 c1p1;
        String str;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A == null) {
            A0A = AbstractC166987dD.A0b();
        }
        this.A0C = AbstractC31172DnG.A1X(A0A, "SHOULD_START_AT_SAC_REG_FLOW");
        if (A0A.containsKey("IS_ADD_ACCOUNT_FLOW")) {
            this.A0F = A0A.getBoolean("IS_ADD_ACCOUNT_FLOW");
        }
        A0A.putBoolean("IS_ADD_ACCOUNT_FLOW", this.A0F);
        AbstractC31173DnH.A1B(A0A);
        if (A0A.containsKey("last_accessed_user_id")) {
            this.A06 = A0A.getString("last_accessed_user_id");
        }
        if (C2U7.A00) {
            overridePendingTransition(R.anim.modal_slide_up_enter, R.anim.modal_empty_animation);
        }
        if (A0A.containsKey("uid") && A0A.containsKey("token") && A0A.containsKey(CacheBehaviorLogger.SOURCE)) {
            A0A.putBoolean("IS_ONE_CLICK_LOGIN", true);
            String A0j2 = AbstractC31173DnH.A0j(A0A, CacheBehaviorLogger.SOURCE);
            if (!A0j2.equals("stop_deletions_email_login") && !A0j2.equals("stop_deletions_sms_login")) {
                if (A0j2.equals("account_deactivation_email")) {
                    A00 = AbstractC35275FhA.A00(A0A);
                    string = A0A.getString("uid");
                    String string2 = A0A.getString("token");
                    A0j = A0A.getString(CacheBehaviorLogger.SOURCE);
                    AbstractC31180DnO.A1U(string, string2, A0j);
                    C07270a1 c07270a1 = this.A01;
                    String string3 = A0A.getString("reminder");
                    C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
                    A0M.A0B("accounts/account_deactivation_login/");
                    A0M.A9s("uid", string);
                    A0M.A9s("token", string2);
                    A0M.A9s(CacheBehaviorLogger.SOURCE, A0j);
                    AbstractC31178DnM.A0n(this, A0M, AbstractC31189DnY.A02(), C16030qx.A00(this));
                    A0M.A0H("reminder", string3);
                    AbstractC31175DnJ.A1J(A0M);
                    A0U = AbstractC31172DnG.A0U(A0M, true);
                } else {
                    this.A0B = true;
                    this.A09 = A0A.getBoolean("bypass");
                    Uri A002 = AbstractC35275FhA.A00(A0A);
                    String string4 = A0A.getString("uid");
                    C07270a1 c07270a12 = this.A01;
                    string4.getClass();
                    String A0j3 = AbstractC31173DnH.A0j(A0A, "token");
                    String A0j4 = AbstractC31173DnH.A0j(A0A, CacheBehaviorLogger.SOURCE);
                    String string5 = A0A.getString("auto_send");
                    if (this.A09) {
                        str = "accounts/one_click_login_bypass/";
                    } else {
                        str = "accounts/one_click_login/";
                    }
                    C25621Ms A0M2 = AbstractC31173DnH.A0M(c07270a12);
                    A0M2.A0E = str;
                    A0M2.A9s("uid", string4);
                    A0M2.A9s("token", A0j3);
                    A0M2.A9s(CacheBehaviorLogger.SOURCE, A0j4);
                    AbstractC31178DnM.A0n(this, A0M2, AbstractC31189DnY.A02(), C16030qx.A00(this));
                    A0M2.A9s("adid", AbstractC35276FhB.A0I());
                    A0M2.A0H("auto_send", string5);
                    A0M2.A0P(C07340a8.A00, EfQ.class, C34805FVh.class, false);
                    A0U = AbstractC31172DnG.A0U(A0M2, true);
                    A002.getClass();
                    C07270a1 c07270a13 = this.A01;
                    c1p1 = new EUW(A002, this, this.A00, c07270a13, By1(), string4, this.A09);
                    A0U.A00 = c1p1;
                    schedule(A0U);
                }
            } else {
                A00 = AbstractC35275FhA.A00(A0A);
                string = A0A.getString("uid");
                C07270a1 c07270a14 = this.A01;
                string.getClass();
                String A0j5 = AbstractC31173DnH.A0j(A0A, "token");
                String A0j6 = AbstractC31173DnH.A0j(A0A, CacheBehaviorLogger.SOURCE);
                String string6 = A0A.getString("reminder");
                C25621Ms A0M3 = AbstractC31173DnH.A0M(c07270a14);
                A0M3.A0B("accounts/stop_account_deletion_login/");
                A0M3.A9s("uid", string);
                A0M3.A9s("token", A0j5);
                A0M3.A9s(CacheBehaviorLogger.SOURCE, A0j6);
                AbstractC31178DnM.A0n(this, A0M3, AbstractC31189DnY.A02(), C16030qx.A00(this));
                A0M3.A0H("reminder", string6);
                AbstractC31175DnJ.A1J(A0M3);
                A0U = AbstractC31172DnG.A0U(A0M3, true);
                A0j = AbstractC31173DnH.A0j(A0A, CacheBehaviorLogger.SOURCE);
            }
            c1p1 = new EUX(A00, this, this.A00, this.A01, string, A0j);
            A0U.A00 = c1p1;
            schedule(A0U);
        }
        if (A0A.containsKey("smsrecovery") && A0A.getBoolean("smsrecovery") && A0A.containsKey("token")) {
            C6WQ A0i = AbstractC31174DnI.A0i(this);
            this.A05 = A0i;
            A0i.A00(getResources().getString(2131965660));
            C1ON A06 = AbstractC35276FhB.A06(this, this.A01, AbstractC31173DnH.A0j(A0A, "token"), null, AbstractC31189DnY.A00(), "link");
            A06.A00 = new C32995Egi(this, this.A01, this);
            schedule(A06);
        }
        this.A0D = (AymhViewModel) new C52942bb(this).A00(AymhViewModel.class);
        if (getSupportFragmentManager().A0Q("android.nux.AymhLoginLandingFragment") != null) {
            A00(this);
            return;
        }
        if (AbstractC31177DnL.A0I(this) != null) {
            return;
        }
        AymhViewModel aymhViewModel = this.A0D;
        C07270a1 c07270a15 = this.A01;
        FJN fjn = new FJN(A0A, this);
        C14360o3.A0B(c07270a15, 1);
        C12L c12l = C12L.A00;
        C14360o3.A0B(c12l, 3);
        aymhViewModel.A00 = null;
        ArrayList A1E = AbstractC166987dD.A1E();
        Set singleton = Collections.singleton(EnumC33446EqJ.A04);
        C14360o3.A07(singleton);
        C49529Lui c49529Lui = new C49529Lui(singleton);
        AbstractC166987dD.A1Z(new C57170PZo(c07270a15, this, aymhViewModel, A1E, c49529Lui, fjn, c12l, null, 12), AbstractC141776au.A00(aymhViewModel));
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.A07) {
            super.onBackPressed();
        }
    }

    public static void A00(SignedOutFragmentActivity signedOutFragmentActivity) {
        C6WQ A0i = AbstractC31174DnI.A0i(signedOutFragmentActivity);
        C31470DsE c31470DsE = new C31470DsE(signedOutFragmentActivity, 23);
        C35762Fqz c35762Fqz = new C35762Fqz(2, A0i, signedOutFragmentActivity);
        AymhViewModel aymhViewModel = signedOutFragmentActivity.A0D;
        if (aymhViewModel != null) {
            AbstractC31172DnG.A0F(aymhViewModel.A09).A06(signedOutFragmentActivity, c31470DsE);
            AbstractC31172DnG.A0F(aymhViewModel.A0A).A06(signedOutFragmentActivity, c35762Fqz);
        }
    }

    @Override // X.GZG
    public final String BLC() {
        return this.A06;
    }

    @Override // X.GZG
    public final boolean CPW() {
        return this.A0F;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (C2U7.A00) {
            overridePendingTransition(R.anim.modal_empty_animation, R.anim.modal_slide_down_exit);
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A01;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Credential credential;
        super.onActivityResult(i, i2, intent);
        AymhViewModel aymhViewModel = this.A0D;
        if (aymhViewModel != null) {
            C07270a1 c07270a1 = this.A01;
            C14360o3.A0B(c07270a1, 3);
            if (i == 64206) {
                if (intent != null) {
                    credential = (Credential) intent.getParcelableExtra(AbstractC58317Pt9.A00(732));
                    if (credential != null && credential.A01 != null) {
                        C63378Siq.A02(c07270a1, "aymh");
                        if (i2 != -1 && credential != null) {
                            AbstractC31172DnG.A0F(aymhViewModel.A0A).A0B(new FJP(2131974091, true));
                            AbstractC166987dD.A1Z(new C57169PZn((InterfaceC23621Ds) null, aymhViewModel, c07270a1, credential, 10), AbstractC141776au.A00(aymhViewModel));
                            return;
                        }
                    }
                } else {
                    credential = null;
                }
                if (i2 == 0) {
                    C63378Siq.A01(c07270a1, "aymh");
                    return;
                }
                C63378Siq.A03(c07270a1, "aymh");
                if (i2 != -1) {
                }
            }
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri uri;
        String str;
        String A00;
        Uri uri2;
        AbstractC18680vv A0V;
        int A002 = C0f9.A00(-2128268932);
        Bundle A003 = AbstractC58327PtK.A00(bundle);
        AbstractC52232aO.A00(getApplication());
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null && A0A.getString("IgSessionManager.SESSION_TOKEN_KEY") != null && A0A.getBoolean("caa_registration_redirection_to_native") && (A0V = AbstractC31172DnG.A0V(A0A)) != null && !(A0V instanceof UserSession)) {
            this.A01 = (C07270a1) A0V;
        }
        C07270a1 c07270a1 = this.A01;
        if (c07270a1 == null) {
            c07270a1 = C023409i.A0A.A03(this);
            this.A01 = c07270a1;
        }
        this.A04 = new C34937FaN(this);
        this.A02 = new C35020Fbt(this, c07270a1, true);
        this.A03 = AbstractC31178DnM.A0O(this);
        super.onCreate(A003);
        C1Q2.A04();
        C07270a1 c07270a12 = this.A01;
        C19T c19t = C19T.A1q;
        C14360o3.A0B(c07270a12, 1);
        C14120nc.A00().ATO(new RcT(this, c19t, c07270a12));
        if (AbstractC14490oL.A0C(getApplicationContext()) && !C35264Fgy.A05() && !C35264Fgy.A06()) {
            C218914p.A08.A0A(C36160Fxa.A00(this));
        }
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(this.A0H, C57432kI.class);
        c41451vu.A02(this.A0G, C36036FvY.class);
        FK4 fk4 = FK4.A02;
        if (fk4 == null) {
            fk4 = new FK4();
            FK4.A02 = fk4;
        }
        synchronized (fk4.A01) {
            uri = null;
            fk4.A00 = null;
        }
        C95P.A00(this.A01, "signed_out_fragment_activity").A02();
        C35017Fbq.A00().A01();
        if (A0A != null) {
            str = AbstractC31171DnF.A0a(A0A);
        } else {
            str = null;
        }
        C07270a1 c07270a13 = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C14360o3.A0B(c07270a13, 0);
        if (EndToEnd.isRunningEndToEndTest() && (A00 = EndToEnd.A00("ig.e2e.e2e_method", true, false)) != null) {
            if (A00.equals("AUTH")) {
                UserSession A004 = C09Y.A00().A00();
                if (A004 != null) {
                    if (str != null) {
                        uri = AbstractC08820cl.A03(str);
                    }
                    AbstractC31525Dt9.A06(this, uri, interfaceC11380iw, A004);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else if (A00.equals("LOGIN")) {
                String A005 = EndToEnd.A00("ig.e2e.e2e_username", true, false);
                String A006 = EndToEnd.A00("ig.e2e.e2e_password", true, false);
                if (A005 != null && A005.length() != 0 && A006 != null && A006.length() != 0) {
                    Log.w(AbstractC111324zv.A00(3588), AbstractC166997dE.A0z("Using headless E2E login, user: %s, password: %s", Arrays.copyOf(new Object[]{A005, A006}, 2)));
                    String A007 = C16030qx.A00(this);
                    C14360o3.A07(A007);
                    String A10 = AbstractC31172DnG.A10(this);
                    C14360o3.A07(A10);
                    C1ON A0E = AbstractC35276FhB.A0E(c07270a13, null, A007, null, null, A10, A006, null, A005, null, C35264Fgy.A00());
                    EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0t;
                    Integer num = C05F.A00;
                    if (str != null) {
                        uri2 = AbstractC08820cl.A03(str);
                    } else {
                        uri2 = null;
                    }
                    A0E.A00 = new C32547EUx(this, uri2, interfaceC11380iw, c07270a13, null, null, enumC31713DwI, num, A005, null, null, null);
                    schedule(A0E);
                }
            }
        }
        C0f9.A07(1293936791, A002);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(1429927205);
        super.onDestroy();
        C36007Fv5.A00().A01 = null;
        C35017Fbq.A00().A02();
        C35231FgO.A03.A05(this);
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A0H, C57432kI.class);
        c41451vu.A03(this.A0G, C36036FvY.class);
        C0f9.A07(2075760122, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A07 = bundle.getBoolean("allow_back", true);
        this.A0A = bundle.getBoolean("is_nux_flow", false);
        this.A0E = bundle.getBoolean("has_followed", false);
        this.A0B = bundle.getBoolean("is_one_click_login", false);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(164377301);
        super.onResume();
        C3M9.A00(this.A01).A00(AbstractC31171DnF.A0D("ig_app_auth"));
        setRequestedOrientation(1);
        C1U4.A00(this).A00("logged_out_bloks_playground_toggle");
        C0f9.A07(-923890750, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("allow_back", this.A07);
        bundle.putBoolean("is_nux_flow", this.A0A);
        bundle.putBoolean("has_followed", this.A0E);
        bundle.putBoolean("is_one_click_login", this.A0B);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A01;
    }
}
