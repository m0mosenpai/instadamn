package com.instagram.urlhandlers.friendmap;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class FriendMapUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r2.equals("friend_map_location_shared") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r2.equals("friend_map") == false) goto L22;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -767683731(0xffffffffd23e136d, float:-2.0409242E11)
            int r4 = X.C0f9.A00(r0)
            super.onCreate(r8)
            android.os.Bundle r2 = X.AbstractC31176DnK.A07(r7)
            if (r2 == 0) goto L61
            java.lang.String r1 = X.AbstractC31171DnF.A0a(r2)
            if (r1 == 0) goto L61
            X.0vv r5 = X.AbstractC31171DnF.A0F(r7)
            boolean r0 = r5 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L98
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            android.net.Uri r6 = X.AbstractC25227BEk.A0B(r1)
            java.lang.String r2 = r6.getHost()
            if (r2 == 0) goto L61
            int r1 = r2.hashCode()
            r0 = -1756340165(0xffffffff9750603b, float:-6.7329885E-25)
            if (r1 == r0) goto L8f
            r0 = -1100097286(0xffffffffbe6dd8fa, float:-0.23227301)
            if (r1 == r0) goto L85
            r0 = -145701845(0xfffffffff750c42b, float:-4.2342832E33)
            if (r1 != r0) goto L61
            java.lang.String r0 = "friend_map_location_shared"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L61
        L45:
            r3 = 0
        L46:
            boolean r0 = X.AbstractC1565371b.A00(r5)
            if (r0 == 0) goto L6b
            r1 = 0
            java.lang.String r0 = "friends_map"
            X.3KD r0 = X.AbstractC35176FfT.A00(r7, r5, r0, r1)
            android.os.Handler r3 = X.AbstractC167007dF.A0J()
            X.GMw r2 = new X.GMw
            r2.<init>(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L61:
            r7.finish()
        L64:
            r0 = 1268940502(0x4ba27ed6, float:2.1298604E7)
            X.C0f9.A07(r0, r4)
            return
        L6b:
            X.2dB r0 = X.AbstractC54852fj.A00()
            if (r0 == 0) goto L81
            X.1oX r2 = X.C3L9.A00()
            X.Fb4 r1 = com.instagram.friendmap.configs.FriendMapLaunchConfig.A0C
            java.lang.Integer r0 = X.C05F.A0N
            com.instagram.friendmap.configs.FriendMapLaunchConfig r0 = r1.A01(r6, r5, r0, r3)
            r2.A01(r7, r5, r0)
            goto L61
        L81:
            X.AbstractC31181DnP.A0N(r7, r6)
            goto L61
        L85:
            java.lang.String r0 = "friend_map_audience_settings"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L61
            r3 = 1
            goto L46
        L8f:
            java.lang.String r0 = "friend_map"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L45
            goto L61
        L98:
            X.AbstractC35178FfV.A01(r7, r2, r5)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.friendmap.FriendMapUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
