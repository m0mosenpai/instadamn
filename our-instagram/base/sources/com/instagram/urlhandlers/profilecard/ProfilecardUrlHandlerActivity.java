package com.instagram.urlhandlers.profilecard;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.InterfaceC11380iw;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class ProfilecardUrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profilecard_url_handler";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = 1698534338(0x653d93c2, float:5.5953307E22)
            int r3 = X.C0f9.A00(r0)
            super.onCreate(r11)
            android.os.Bundle r4 = X.AbstractC31176DnK.A07(r10)
            if (r4 != 0) goto L1a
            r10.finish()
            r0 = 1849006467(0x6e359983, float:1.4050593E28)
        L16:
            X.C0f9.A07(r0, r3)
            return
        L1a:
            java.lang.String r7 = X.AbstractC31171DnF.A0a(r4)
            if (r7 != 0) goto L27
            r10.finish()
            r0 = -998690368(0xffffffffc47931c0, float:-996.77734)
            goto L16
        L27:
            X.09Y r6 = X.C023409i.A0A
            X.0vv r0 = r6.A05(r10)
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L3b
            X.AbstractC35178FfV.A02(r10, r4, r6)
            r10.finish()
            r0 = 1145096651(0x4440c9cb, float:771.153)
            goto L16
        L3b:
            X.0vv r9 = r6.A05(r10)
            X.AbstractC31171DnF.A1Q(r9)
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            android.net.Uri r5 = X.AbstractC25227BEk.A0B(r7)
            r8 = 0
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r9, r8)
            r0 = 36327335900887551(0x810f85000239ff, double:3.03689172993728E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 == 0) goto La6
            android.net.Uri r0 = X.AbstractC25227BEk.A0B(r7)
            java.util.List r7 = r0.getPathSegments()
            java.lang.String r1 = X.AbstractC25226BEj.A1I(r7, r8)
            java.lang.String r0 = "myprofilecard"
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            if (r0 == 0) goto L9a
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r9)
            java.lang.String r0 = r0.getUsername()
        L76:
            r4.putString(r2, r0)
        L79:
            X.2dB r0 = X.AbstractC54852fj.A00()
            if (r0 == 0) goto L8a
            X.0vv r0 = r6.A05(r10)
            X.AbstractC35275FhA.A0A(r4, r10, r0)
        L86:
            r0 = -234572270(0xfffffffff204b612, float:-2.6286164E30)
            goto L16
        L8a:
            android.net.Uri$Builder r0 = r5.buildUpon()
            android.net.Uri$Builder r0 = r0.clearQuery()
            android.net.Uri r0 = r0.build()
            X.AbstractC31181DnP.A0N(r10, r0)
            goto L86
        L9a:
            int r1 = r7.size()
            r0 = 2
            if (r1 < r0) goto L79
            java.lang.String r0 = X.AbstractC25226BEj.A1I(r7, r8)
            goto L76
        La6:
            java.lang.String r0 = "mainfeed"
            X.AbstractC31178DnM.A0q(r5, r4, r0)
            X.AbstractC35275FhA.A03(r10, r4)
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
