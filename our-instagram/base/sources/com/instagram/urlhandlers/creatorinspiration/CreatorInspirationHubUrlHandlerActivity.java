package com.instagram.urlhandlers.creatorinspiration;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31179DnN;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class CreatorInspirationHubUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r4.equals("pro_dash") != false) goto L28;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -361763003(0xffffffffea6fef45, float:-7.2515797E25)
            int r5 = X.C0f9.A00(r0)
            super.onCreate(r9)
            if (r9 == 0) goto L13
            r0 = -161368756(0xfffffffff661b54c, float:-1.1444765E33)
        Lf:
            X.C0f9.A07(r0, r5)
            return
        L13:
            android.os.Bundle r3 = X.AbstractC31176DnK.A07(r8)
            if (r3 != 0) goto L20
            r8.finish()
            r0 = -321869745(0xffffffffecd0a84f, float:-2.0180111E27)
            goto Lf
        L20:
            java.lang.String r0 = X.AbstractC31171DnF.A0a(r3)
            if (r0 != 0) goto L2d
            r8.finish()
            r0 = -213022753(0xfffffffff34d87df, float:-1.6283823E31)
            goto Lf
        L2d:
            android.net.Uri r7 = X.AbstractC25227BEk.A0B(r0)
            java.lang.String r6 = "entry_point"
            java.lang.String r4 = r7.getQueryParameter(r6)
            java.lang.String r0 = "default_tab"
            java.lang.String r2 = r7.getQueryParameter(r0)
            X.0vv r1 = r8.getSession()
            if (r1 == 0) goto L4a
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L4e
            X.AbstractC35178FfV.A01(r8, r3, r1)
        L4a:
            r0 = 135238480(0x80f9350, float:4.320566E-34)
            goto Lf
        L4e:
            X.2dB r1 = X.AbstractC54852fj.A00()
            if (r1 == 0) goto Lae
            java.lang.String r0 = "deep_link"
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 == 0) goto L61
            X.1QO r0 = X.C1QO.A0E
            r1.EfI(r0)
        L61:
            r3.putString(r6, r4)
            if (r4 == 0) goto L6f
            java.lang.String r0 = "pro_dash"
            boolean r0 = r4.equals(r0)
            r1 = 1
            if (r0 == 0) goto L70
        L6f:
            r1 = 0
        L70:
            r0 = 1269(0x4f5, float:1.778E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r3.putBoolean(r0, r1)
            r0 = 1256(0x4e8, float:1.76E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r3.putString(r0, r2)
            X.0vv r2 = r8.getSession()
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 2209(0x8a1, float:3.095E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.6XJ r4 = X.AbstractC31171DnF.A0L(r8, r3, r2, r1, r0)
            r3 = 2130772095(0x7f01007f, float:1.7147299E38)
            r2 = 2130772066(0x7f010062, float:1.714724E38)
            r1 = 2130772064(0x7f010060, float:1.7147236E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            int[] r0 = new int[]{r3, r2, r1, r0}
            r4.A0J = r0
            r0 = 1
            r4.A08 = r0
            r4.A0C(r8)
        Laa:
            r8.finish()
            goto L4a
        Lae:
            X.AbstractC31181DnP.A0N(r8, r7)
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.creatorinspiration.CreatorInspirationHubUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31179DnN.A0J(this);
    }
}
