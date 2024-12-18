package com.instagram.urlhandlers.personalinformation;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.C06N;
import X.C35756Fqt;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class PersonalInformationUrlHandlerActivity extends BaseFragmentActivity {
    public final C06N A00 = new C35756Fqt(this, 22);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (X.C35256Fgp.A05(r11, r6, (com.instagram.common.session.UserSession) r7, "personal_info", "personal_info", false) == false) goto L13;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 131010761(0x7cf10c9, float:3.1155764E-34)
            int r3 = X.C0f9.A00(r0)
            r5 = r11
            super.onCreate(r12)
            android.os.Bundle r1 = X.AbstractC31176DnK.A07(r11)
            if (r1 != 0) goto L1b
            r11.finish()
            r0 = 1792169240(0x6ad25518, float:1.2713813E26)
        L17:
            X.C0f9.A07(r0, r3)
            return
        L1b:
            X.09Y r4 = X.C023409i.A0A
            X.0vv r0 = r4.A05(r11)
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L74
            X.0vv r0 = r4.A05(r11)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.session.UserSession"
            X.C14360o3.A0C(r0, r2)
            boolean r0 = X.AbstractC31177DnL.A1W(r0)
            if (r0 == 0) goto L5d
            X.0h2 r1 = r11.getSupportFragmentManager()
            X.06N r0 = r11.A00
            r1.A0r(r0)
            java.lang.String r0 = "PERSONAL_INFO_HANDLER_ACTIVITY"
            X.0xB r6 = X.AbstractC31171DnF.A0D(r0)
            X.0vv r7 = r4.A05(r11)
            X.C14360o3.A0C(r7, r2)
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            r10 = 0
            java.lang.String r8 = "personal_info"
            r9 = r8
            boolean r0 = X.C35256Fgp.A05(r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L59
        L56:
            r11.finish()
        L59:
            r0 = -1865582644(0xffffffff90cd77cc, float:-8.104282E-29)
            goto L17
        L5d:
            X.0vv r0 = r4.A05(r11)
            X.6Yy r1 = X.AbstractC25225BEi.A0r(r11, r0)
            X.AbstractC31364DqT.A03()
            X.EJy r0 = new X.EJy
            r0.<init>()
            r1.A0D(r0)
            X.AbstractC31174DnI.A1L(r1)
            goto L59
        L74:
            X.AbstractC35178FfV.A02(r11, r1, r4)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.personalinformation.PersonalInformationUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
