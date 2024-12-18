package com.instagram.urlhandlers.wonderwall;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class WonderWallUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -1532201595(0xffffffffa4ac7585, float:-7.4792195E-17)
            int r4 = X.C0f9.A00(r0)
            super.onCreate(r9)
            android.os.Bundle r3 = X.AbstractC31176DnK.A07(r8)
            if (r3 == 0) goto L4e
            java.lang.String r2 = X.AbstractC31171DnF.A0a(r3)
            if (r2 == 0) goto L4e
            X.0vv r1 = X.AbstractC31171DnF.A0F(r8)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L10a
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r3 = 0
            android.net.Uri r2 = X.AbstractC25227BEk.A0B(r2)
            java.lang.String r7 = r2.getHost()
            if (r7 == 0) goto L4e
            int r5 = r7.hashCode()
            r0 = -682122235(0xffffffffd757a405, float:-2.3709946E14)
            if (r5 == r0) goto L61
            r0 = -283036151(0xffffffffef213609, float:-4.989241E28)
            if (r5 != r0) goto L4e
            java.lang.String r0 = "wonderwall_activity"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4e
            X.2dB r0 = X.AbstractC54852fj.A00()
            if (r0 == 0) goto L58
            X.1Zb r0 = X.C28411Zc.A00()
            r0.Cgh(r8, r1)
        L4e:
            r8.finish()
        L51:
            r0 = -440813836(0xffffffffe5b9b6f4, float:-1.0962659E23)
            X.C0f9.A07(r0, r4)
            return
        L58:
            android.content.Intent r1 = X.AbstractC31176DnK.A06(r8)
            r1.setData(r2)
            goto L105
        L61:
            java.lang.String r6 = "wonderwall"
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L4e
            java.lang.String r7 = r2.getScheme()
            if (r7 == 0) goto L98
            int r5 = r7.hashCode()
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r5 == r0) goto Lcb
            r0 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r5 == r0) goto Lba
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r5 != r0) goto L98
            java.lang.String r0 = "https"
        L84:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L98
            java.lang.String r0 = X.AbstractC166987dD.A19(r2)
            boolean r0 = X.AbstractC31173DnH.A1a(r0, r6)
        L92:
            if (r0 == 0) goto L98
            com.instagram.wonderwall.model.WallLaunchConfig r3 = X.AbstractC34361FDd.A00(r2, r1)
        L98:
            X.C28411Zc.A00()
            X.0Tz r0 = X.AbstractC166997dE.A0U(r1)
            r5 = 36322297904113774(0x810af00000286e, double:3.033705680491159E-306)
            boolean r0 = X.C18U.A06(r0, r1, r5)
            if (r0 == 0) goto L4e
            if (r3 == 0) goto L4e
            X.2dB r0 = X.AbstractC54852fj.A00()
            if (r0 == 0) goto Lce
            X.1Zb r0 = X.C28411Zc.A00()
            r0.Cgt(r8, r1, r3)
            goto L4e
        Lba:
            java.lang.String r0 = "instagram"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L98
            java.lang.String r0 = r2.getHost()
            boolean r0 = X.C14360o3.A0K(r0, r6)
            goto L92
        Lcb:
            java.lang.String r0 = "http"
            goto L84
        Lce:
            java.lang.String r0 = "instagram://wonderwall"
            android.net.Uri$Builder r2 = X.AbstractC31175DnJ.A04(r0)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "wall_owner_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            X.C14360o3.A07(r2)
            com.instagram.wonderwall.model.Destination r3 = r3.A00
            boolean r0 = r3 instanceof com.instagram.wonderwall.model.Destination.Composer
            if (r0 == 0) goto Lf7
            java.lang.String r1 = "destination"
            java.lang.String r0 = "create"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            com.instagram.wonderwall.model.Destination$Composer r3 = (com.instagram.wonderwall.model.Destination.Composer) r3
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "post_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
        Lf7:
            android.net.Uri r0 = r2.build()
            X.C14360o3.A07(r0)
            android.content.Intent r1 = X.AbstractC31176DnK.A06(r8)
            r1.setData(r0)
        L105:
            X.C12260kU.A0C(r8, r1)
            goto L4e
        L10a:
            X.AbstractC35178FfV.A01(r8, r3, r1)
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.wonderwall.WonderWallUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
