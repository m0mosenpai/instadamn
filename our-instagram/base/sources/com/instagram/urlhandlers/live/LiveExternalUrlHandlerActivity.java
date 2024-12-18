package com.instagram.urlhandlers.live;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public class LiveExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = -320039085(0xffffffffecec9753, float:-2.2881688E27)
            int r5 = X.C0f9.A00(r0)
            r6 = r19
            r0 = r20
            super.onCreate(r0)
            android.os.Bundle r4 = X.AbstractC31176DnK.A07(r6)
            if (r4 == 0) goto Lbd
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r4.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lbd
            X.0vv r0 = X.AbstractC31172DnG.A0V(r4)
            r6.A00 = r0
            java.lang.String r0 = r4.getString(r1)
            r11 = 0
            android.net.Uri r2 = X.AbstractC08820cl.A03(r0)
            if (r2 != 0) goto L3b
            r6.finish()
            r0 = -471731562(0xffffffffe3e1f296, float:-8.335995E21)
        L37:
            X.C0f9.A07(r0, r5)
            return
        L3b:
            X.Ep5 r0 = X.EnumC33372Ep5.A0C
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r2.getScheme()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L6d
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = "live_camera"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L6d
            X.14H r0 = X.C14H.A00()
            android.content.Intent r0 = r0.A01(r6)
            android.content.Intent r0 = r0.setData(r2)
            X.AbstractC31174DnI.A14(r6, r0)
            r6.finish()
            r0 = -1684788246(0xffffffff9b942bea, float:-2.4512925E-22)
            goto L37
        L6d:
            java.util.List r9 = r2.getPathSegments()
            java.lang.Object r0 = X.AbstractC166987dD.A16(r9)
            java.lang.String r0 = (java.lang.String) r0
            android.os.Bundle r8 = X.AbstractC166987dD.A0b()
            java.lang.String r7 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            r8.putString(r7, r0)
            java.lang.Integer r10 = X.C05F.A0C
            r14 = 0
            int r0 = r9.size()
            java.lang.String r3 = "InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS"
            r2 = 2
            if (r0 == r2) goto L97
            int r1 = r9.size()
            r0 = 3
            if (r1 != r0) goto Lbb
            java.lang.String r14 = X.AbstractC25226BEj.A1I(r9, r2)
        L97:
            r15 = 0
            r16 = 1
            com.instagram.profile.intf.AutoLaunchReelParams r9 = new com.instagram.profile.intf.AutoLaunchReelParams
            r12 = r11
            r13 = r11
            r17 = r15
            r18 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8.putParcelable(r3, r9)
        La8:
            r4.putAll(r8)
            boolean r0 = r4.containsKey(r7)
            if (r0 == 0) goto Lb6
            X.0vv r0 = r6.A00
            X.AbstractC35275FhA.A0A(r4, r6, r0)
        Lb6:
            r0 = -1528531820(0xffffffffa4e47494, float:-9.907673E-17)
            goto L37
        Lbb:
            r8 = r11
            goto La8
        Lbd:
            r6.finish()
            r0 = -512565558(0xffffffffe172deca, float:-2.8001036E20)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.live.LiveExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
