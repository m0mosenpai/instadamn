package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.iabadscontext.IABAdsContext;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Swc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63953Swc implements InterfaceC65638Tq1, BCM {
    public static C63953Swc A0A;
    public String A00;
    public final Intent A01;
    public final Bundle A02;
    public final SL5 A03;
    public final InterfaceC172717mh A04;
    public final InterfaceC172727mi A05;
    public final InterfaceC08100bW A06 = new C42106IlG(0);
    public final C62695SMj A07;
    public final C62702SMq A08;
    public final boolean A09;

    @Override // X.InterfaceC65638Tq1
    public final void AQC(QF6 qf6, String str, boolean z) {
    }

    @Override // X.BCM
    public final void DFB(Context context, Intent intent, View view, InterfaceC172717mh interfaceC172717mh, InterfaceC65594Tnc interfaceC65594Tnc, InterfaceC172727mi interfaceC172727mi) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0w(1, intent, interfaceC172717mh, interfaceC172727mi);
        if (A0A == null) {
            A0A = new C63953Swc(context, intent, interfaceC172717mh, interfaceC172727mi);
        }
    }

    @Override // X.InterfaceC65638Tq1
    public final void DXT(QF6 qf6, String str) {
    }

    @Override // X.InterfaceC65638Tq1
    public final void DXd(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    @Override // X.InterfaceC65638Tq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Eit(X.QF6 r6, java.lang.Boolean r7, java.lang.Boolean r8, java.lang.String r9) {
        /*
            r5 = this;
            r3 = 1
            X.SfN r1 = X.C63217SfN.A06
            r4 = 0
            if (r1 == 0) goto L89
            boolean r0 = r1.A03()
            if (r0 != r3) goto L89
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L89
            boolean r0 = r1.A04(r9)
            if (r0 != 0) goto L89
            boolean r0 = r5.A09
            if (r0 == 0) goto L68
            java.lang.String r0 = "https://www.facebook.com/oauth_account_linking_mobile/login_redirect"
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r0 = "https://facebook.com/oauth_account_linking_mobile/login_redirect"
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r0 = "https://m.facebook.com/oauth_account_linking_mobile/login_redirect"
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r1 = X.S8X.A01
            java.lang.String r0 = "oauth_account_linking/?state="
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r0 = "instagram://oauth_account_linking/?state="
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r0 = "https://www.instagram.com/oauth_account_linking_mobile/login_redirect"
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r0 = "https://instagram.com/oauth_account_linking_mobile/login_redirect"
        L58:
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L89
            java.lang.String r2 = "IGBwPUserEventHandler"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Request not from allowed BwP domain"
            X.AbstractC63254SgB.A02(r2, r0, r1)
            return r3
        L68:
            java.lang.String r0 = "instagram://bwp_login/?state="
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r1 = X.S8X.A01
            java.lang.String r0 = "bwp_login/?state="
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r0 = "https://facebook.com/amazon_bwp/login_redirect/"
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r4)
            if (r0 != 0) goto L89
            java.lang.String r0 = "https://m.facebook.com/amazon_bwp/login_redirect/"
            goto L58
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63953Swc.Eit(X.QF6, java.lang.Boolean, java.lang.Boolean, java.lang.String):boolean");
    }

    @Override // X.InterfaceC65638Tq1
    public final void Ej3(QF6 qf6, Boolean bool, Boolean bool2, String str) {
    }

    @Override // X.BCM
    public final void destroy() {
        Intent intent = this.A01;
        C14360o3.A0B(intent, 0);
        if (intent.getBooleanExtra("IS_ERASE_API_KEY_1P_ENABLED", false)) {
            C63217SfN c63217SfN = C63217SfN.A06;
            FragmentActivity activity = this.A04.getActivity();
            if (activity != null && c63217SfN != null) {
                SQi.A01(activity.getApplicationContext(), c63217SfN, true);
            }
        }
    }

    public C63953Swc(Context context, Intent intent, InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        String str;
        Intent intent2;
        Bundle extras;
        String str2;
        IABAdsContext iABAdsContext;
        A0A = this;
        this.A04 = interfaceC172717mh;
        this.A05 = interfaceC172727mi;
        this.A03 = new SL5(context, interfaceC172717mh);
        this.A01 = intent;
        IabCommonTrait iabCommonTrait = (IabCommonTrait) AbstractC61630Rqu.A00(intent);
        if (iabCommonTrait != null && (iabCommonTrait instanceof IABAdsContext) && (iABAdsContext = (IABAdsContext) iabCommonTrait) != null) {
            str = iABAdsContext.A0A;
        } else {
            str = null;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID");
        String stringExtra2 = intent.getStringExtra("BWP_MEDIA_ID");
        Bundle A0b = AbstractC166987dD.A0b();
        if (str != null) {
            A0b.putString("ad_id", str);
        }
        if (stringExtra != null) {
            A0b.putString("iab_session_id", stringExtra);
        }
        if (stringExtra2 != null) {
            A0b.putString("media_id", stringExtra2);
        }
        C63217SfN c63217SfN = C63217SfN.A06;
        if (c63217SfN != null) {
            C62524SFa c62524SFa = c63217SfN.A03;
            A0b.putLong("expiry_time", c62524SFa.A00);
            A0b.putString("token_source", AbstractC61709RsQ.A00(c62524SFa.A01));
        }
        A0b.putString(CacheBehaviorLogger.SOURCE, "JS_BRIDGE");
        C63217SfN c63217SfN2 = C63217SfN.A06;
        if (c63217SfN2 != null) {
            A0b.putBoolean("is_organic", c63217SfN2.A02);
            if (c63217SfN2.A02) {
                str2 = "organic";
            } else {
                str2 = "ad";
            }
            A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        }
        this.A02 = A0b;
        FragmentActivity activity = interfaceC172717mh.getActivity();
        activity.getClass();
        this.A07 = new C62695SMj(intent, A0b, new C63538Sp6(this, 1), activity);
        FragmentActivity activity2 = interfaceC172717mh.getActivity();
        if (activity2 != null && (intent2 = activity2.getIntent()) != null && (extras = intent2.getExtras()) != null) {
            UserSession A0G = AbstractC31171DnF.A0G(extras);
            C06090Tz c06090Tz = C06090Tz.A05;
            this.A09 = C18U.A06(c06090Tz, A0G, 36330235003945726L);
            String A04 = C18U.A04(c06090Tz, A0G, 36890689581548432L);
            FragmentActivity activity3 = interfaceC172717mh.getActivity();
            activity3.getClass();
            this.A08 = new C62702SMq(intent, A0b, new C63538Sp6(this, 1), activity3, A04);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
