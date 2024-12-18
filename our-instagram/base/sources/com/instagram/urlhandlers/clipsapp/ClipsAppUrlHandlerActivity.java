package com.instagram.urlhandlers.clipsapp;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC37834Gko;
import X.C1XM;
import X.C38321qM;
import X.C43204J8b;
import X.InterfaceC09390do;
import X.InterfaceC31131DmE;
import X.InterfaceC31133DmG;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ClipsAppUrlHandlerActivity extends BaseFragmentActivity {
    public final InterfaceC09390do A00 = C1XM.A00(new C43204J8b(this, 21));

    public static final void A00(C38321qM c38321qM, ClipsAppUrlHandlerActivity clipsAppUrlHandlerActivity) {
        String str;
        ImageUrl imageUrl;
        String str2 = null;
        InterfaceC31131DmE AoB = c38321qM.A0C.AoB();
        if (AoB != null) {
            InterfaceC31133DmG BdT = AoB.BdT();
            User BhV = BdT.BhV();
            boolean z = false;
            if (BhV != null) {
                str = BhV.getUsername();
                User BhV2 = BdT.BhV();
                if (BhV2 != null) {
                    imageUrl = BhV2.Bhu();
                } else {
                    imageUrl = null;
                }
                User BhV3 = BdT.BhV();
                if (BhV3 != null) {
                    z = BhV3.isVerified();
                }
                User BhV4 = BdT.BhV();
                if (BhV4 != null) {
                    str2 = BhV4.getId();
                }
            } else {
                str = null;
                imageUrl = null;
            }
            UserSession A0r = AbstractC166987dD.A0r(clipsAppUrlHandlerActivity.A00);
            String attributionAppId = AoB.getAttributionAppId();
            String attributionAppName = AoB.getAttributionAppName();
            String contentUrl = BdT.getContentUrl();
            ImageUrl AxF = BdT.AxF();
            String mediaCount = BdT.getMediaCount();
            String id = c38321qM.getId();
            if (id != null) {
                AbstractC37834Gko.A04(clipsAppUrlHandlerActivity, A0r, AxF, imageUrl, attributionAppId, attributionAppName, contentUrl, str, str2, mediaCount, id, z);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        clipsAppUrlHandlerActivity.finish();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r1 != null) goto L19;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -886573191(0xffffffffcb27f779, float:-1.1007865E7)
            int r4 = X.C0f9.A00(r0)
            super.onCreate(r6)
            android.os.Bundle r2 = X.AbstractC31176DnK.A07(r5)
            if (r2 != 0) goto L1a
            r5.finish()
            r0 = -1932925142(0xffffffff8cc9e72a, float:-3.110808E-31)
        L16:
            X.C0f9.A07(r0, r4)
            return
        L1a:
            java.lang.String r1 = X.AbstractC31171DnF.A0a(r2)
            if (r1 == 0) goto L69
            int r0 = r1.length()
            if (r0 == 0) goto L69
            X.0vv r3 = X.AbstractC31171DnF.A0F(r5)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L35
            X.AbstractC35178FfV.A01(r5, r2, r3)
        L31:
            r0 = 1102213538(0x41b271a2, float:22.305485)
            goto L16
        L35:
            android.net.Uri r2 = X.AbstractC25227BEk.A0B(r1)
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r0 = "media_id"
            java.lang.String r1 = r2.getQueryParameter(r0)
            if (r1 != 0) goto L53
            java.util.List r1 = r2.getPathSegments()
            X.C14360o3.A07(r1)
            r0 = 3
            java.lang.Object r1 = X.AbstractC001800i.A0O(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L31
        L53:
            X.1qM r0 = X.AbstractC25229BEm.A0h(r3, r1)
            if (r0 != 0) goto L65
            X.1ON r1 = X.AbstractC2044893h.A04(r3, r1)
            r0 = 7
            X.C31714DwJ.A00(r1, r5, r0)
            r5.schedule(r1)
            goto L31
        L65:
            A00(r0, r5)
            goto L31
        L69:
            r5.finish()
            r0 = 2078582138(0x7be4a57a, float:2.3743999E36)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
