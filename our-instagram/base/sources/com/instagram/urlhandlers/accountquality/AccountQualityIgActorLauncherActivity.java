package com.instagram.urlhandlers.accountquality;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC191768eY;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.AbstractC37314GcG;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14360o3;
import X.C16920sk;
import X.C34397FEn;
import X.C35205Ffx;
import X.C65981Txa;
import X.U6G;
import X.U6H;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class AccountQualityIgActorLauncherActivity extends IgFragmentActivity {
    public UserSession A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1868505907);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1623971508;
        } else {
            C09Y c09y = C023409i.A0A;
            AbstractC18680vv A04 = c09y.A04(A07);
            if (A04 == null) {
                finish();
                i = 1867416321;
            } else if (!(A04 instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, A04);
                i = -771244655;
            } else {
                this.A00 = c09y.A06(A07);
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = 1175508842;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("actor_id", A0B.getQueryParameter("actor_id"));
                    A1G.put(CacheBehaviorLogger.SOURCE, A0B.getQueryParameter(CacheBehaviorLogger.SOURCE));
                    UserSession userSession = (UserSession) A04;
                    A1G.put(AbstractC37314GcG.A00(), userSession.token);
                    HashMap A01 = AbstractC191768eY.A01(A1G);
                    C35205Ffx c35205Ffx = new C35205Ffx();
                    c35205Ffx.A02 = U6G.A05;
                    c35205Ffx.A03 = U6H.A08;
                    C65981Txa A012 = C35205Ffx.A01(c35205Ffx, this, 5);
                    IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(userSession).A00;
                    igBloksScreenConfig.A0R = "com.bloks.www.accountquality.xmds.actor";
                    igBloksScreenConfig.A0C = A012;
                    C16920sk c16920sk = C16920sk.A00;
                    C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                    AbstractC31180DnO.A11(this, igBloksScreenConfig, "com.bloks.www.accountquality.xmds.actor", A01, c16920sk);
                    i = 899710593;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
