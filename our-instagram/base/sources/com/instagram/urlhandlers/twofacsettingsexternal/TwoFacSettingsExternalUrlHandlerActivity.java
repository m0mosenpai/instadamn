package com.instagram.urlhandlers.twofacsettingsexternal;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.C06N;
import X.C35756Fqt;
import X.InterfaceC11380iw;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class TwoFacSettingsExternalUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public AbstractC18680vv A00;
    public final C06N A01 = new C35756Fqt(this, 34);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "two_fac_settings_url_handler";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (X.C35256Fgp.A05(r11, r11, r7, "two_factor", "two_factor", true) == false) goto L13;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -794279072(0xffffffffd0a84360, float:-2.2583902E10)
            int r3 = X.C0f9.A00(r0)
            r5 = r11
            super.onCreate(r12)
            android.os.Bundle r4 = X.AbstractC31176DnK.A07(r11)
            if (r4 != 0) goto L1b
            r11.finish()
            r0 = -471401363(0xffffffffe3e6fc6d, float:-8.5218807E21)
        L17:
            X.C0f9.A07(r0, r3)
            return
        L1b:
            X.0vv r7 = X.AbstractC31172DnG.A0V(r4)
            r11.A00 = r7
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L5d
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            boolean r0 = X.AbstractC31177DnL.A1W(r7)
            if (r0 == 0) goto L48
            X.0h2 r1 = r11.getSupportFragmentManager()
            X.06N r0 = r11.A01
            r1.A0r(r0)
            java.lang.String r8 = "two_factor"
            r10 = 1
            r6 = r11
            r9 = r8
            boolean r0 = X.C35256Fgp.A05(r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L44
        L41:
            r11.finish()
        L44:
            r0 = -1341790147(0xffffffffb005e83d, float:-4.871515E-10)
            goto L17
        L48:
            X.AbstractC31173DnH.A1C(r4, r7)
            X.FRQ r2 = X.AbstractC35179FfW.A00()
            java.lang.Integer r1 = X.C05F.A0N
            r0 = 0
            X.EJU r0 = r2.A02(r1, r0, r0)
            r0.setArguments(r4)
            X.AbstractC31180DnO.A1C(r0, r11, r7)
            goto L44
        L5d:
            X.AbstractC35178FfV.A01(r11, r4, r7)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.twofacsettingsexternal.TwoFacSettingsExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
