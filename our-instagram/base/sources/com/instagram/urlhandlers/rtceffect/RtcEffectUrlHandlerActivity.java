package com.instagram.urlhandlers.rtceffect;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC27671Vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35047FcK;
import X.AbstractC35178FfV;
import X.AbstractC43591JPw;
import X.AnonymousClass001;
import X.AnonymousClass190;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C12L;
import X.C3ER;
import X.InterfaceC11380iw;
import X.LBE;
import X.MBe;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class RtcEffectUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "RtcEffectUrlHandlerActivity";
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
        String string;
        String str;
        String str2;
        String str3;
        int A00 = C0f9.A00(2104890826);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra != null && (string = bundleExtra.getString("original_url")) != null && string.length() != 0) {
            String string2 = bundleExtra.getString("original_url");
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Bundle A0A = AbstractC31173DnH.A0A(this);
            if (A0A != null) {
                A0A.putString("uri", string2);
                AbstractC18680vv session = getSession();
                if (!(session instanceof UserSession)) {
                    AbstractC35178FfV.A01(this, A0A, session);
                } else {
                    String string3 = A0A.getString("uri");
                    if (string3 != null) {
                        String str4 = null;
                        Uri A0B = AbstractC25227BEk.A0B(string3);
                        if (A0B.isHierarchical()) {
                            str2 = A0B.getQueryParameter("effect_id");
                            if (str2 == null) {
                                str2 = getIntent().getStringExtra("effect_id");
                            }
                            str3 = A0B.getQueryParameter("ch");
                            str4 = A0B.getQueryParameter("rev_id");
                            str = A0B.getQueryParameter("utm_source");
                        } else {
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        Bundle bundleExtra2 = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
                        if (bundleExtra2 != null && str2 != null && str2.length() != 0) {
                            UserSession userSession = (UserSession) session;
                            AbstractC31173DnH.A1C(bundleExtra2, userSession);
                            AbstractC27671Vv A002 = C3ER.A00();
                            if (str == null && A002.A02(this, userSession)) {
                                AbstractC35047FcK.A00(this, this, userSession, str2, str3, str4);
                            } else if (isTaskRoot()) {
                                Uri.Builder A04 = AbstractC31175DnJ.A04(AnonymousClass001.A0S(AbstractC43591JPw.A00(384), str2, '/'));
                                A04.appendQueryParameter("effect_id", str2);
                                if (str != null) {
                                    A04.appendQueryParameter("utm_source", str);
                                }
                                if (str3 != null) {
                                    A04.appendQueryParameter("ch", str3);
                                }
                                if (str4 != null) {
                                    A04.appendQueryParameter("rev_id", str4);
                                }
                                A04.appendQueryParameter("src", "vc");
                                AbstractC31180DnO.A0z(this, AbstractC31172DnG.A0l().A03(this, 0), A04);
                            } else {
                                Object obj = new Object();
                                if (str3 == null && str4 == null) {
                                    AbstractC166987dD.A1Z(new MBe(this, userSession, obj, this, str2, str3, str4, null, 2), AnonymousClass194.A02(AnonymousClass190.A02(C12L.A00.A04, new AnonymousClass197(null))));
                                } else {
                                    LBE.A00(this, userSession, str2, str3, str4);
                                }
                            }
                        }
                        finish();
                    }
                }
                i = 350444374;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A07(-1648920836, A00);
                throw A0g;
            }
        } else {
            finish();
            i = -231231314;
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
