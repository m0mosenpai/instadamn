package com.instagram.urlhandlers.clipschaining;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.C023409i;
import X.C09Y;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class IgClipsChainingUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (isDestroyed() == false) goto L39;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1977370183(0x75dc4647, float:5.5846226E32)
            int r7 = X.C0f9.A00(r0)
            super.onCreate(r13)
            if (r13 == 0) goto L13
            r0 = 1473513980(0x57d409fc, float:4.662787E14)
        Lf:
            X.C0f9.A07(r0, r7)
            return
        L13:
            android.os.Bundle r1 = X.AbstractC31176DnK.A07(r12)
            if (r1 != 0) goto L20
            r12.finish()
            r0 = 1226019105(0x49139121, float:604434.06)
            goto Lf
        L20:
            java.lang.String r3 = X.AbstractC31171DnF.A0a(r1)
            if (r3 != 0) goto L2d
            r12.finish()
            r0 = -1660126002(0xffffffff9d0c7cce, float:-1.8593368E-21)
            goto Lf
        L2d:
            X.0vv r8 = r12.getSession()
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L3c
            X.AbstractC35178FfV.A01(r12, r1, r8)
        L38:
            r0 = -670479539(0xffffffffd8094b4d, float:-6.03826E14)
            goto Lf
        L3c:
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            r6 = 0
            X.C14360o3.A0B(r8, r6)
            r5 = 1
            X.2dB r0 = X.AbstractC54852fj.A00()
            if (r0 == 0) goto L38
            X.2dB r1 = X.AbstractC54852fj.A00()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.C14360o3.A0C(r1, r2)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0h2 r0 = X.AbstractC62582sx.A00(r1)
            boolean r0 = r0.A11()
            if (r0 != 0) goto L8d
            X.0h2 r0 = X.AbstractC62582sx.A00(r1)
            boolean r0 = r0.A0G
            if (r0 != 0) goto L8d
            android.net.Uri r1 = X.AbstractC25227BEk.A0B(r3)
            java.lang.String r0 = "media_ids"
            java.lang.String r4 = r1.getQueryParameter(r0)
            if (r4 == 0) goto L38
            java.lang.String r0 = "source"
            java.lang.String r11 = r1.getQueryParameter(r0)
            com.instagram.clips.intf.ClipsViewerSource[] r10 = com.instagram.clips.intf.ClipsViewerSource.values()
            int r3 = r10.length
            r1 = 0
        L7e:
            if (r1 >= r3) goto L9a
            r9 = r10[r1]
            java.lang.String r0 = r9.A00
            boolean r0 = X.C14360o3.A0K(r0, r11)
            if (r0 != 0) goto L9c
            int r1 = r1 + 1
            goto L7e
        L8d:
            boolean r0 = r12.isFinishing()
            if (r0 != 0) goto L38
            boolean r0 = r12.isDestroyed()
            if (r0 != 0) goto L38
            goto Ld2
        L9a:
            com.instagram.clips.intf.ClipsViewerSource r9 = com.instagram.clips.intf.ClipsViewerSource.A2V
        L9c:
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            boolean r0 = X.AbstractC25225BEi.A1Y(r4)
            if (r0 == 0) goto Ld2
            java.lang.String r0 = ","
            java.util.List r0 = X.AbstractC167007dF.A0m(r4, r0, r6)
            r1.addAll(r0)
            X.2dB r3 = X.AbstractC54852fj.A00()
            X.C14360o3.A0C(r3, r2)
            r2 = r3
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.5Qr r1 = new X.5Qr
            r1.<init>(r9, r8)
            android.content.Context r3 = (android.content.Context) r3
            r0 = 2131953238(0x7f130656, float:1.9542941E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0p = r0
            r1.A0t = r4
            r1.A1h = r5
            r1.A1d = r6
            X.AbstractC31173DnH.A1J(r2, r1, r8)
        Ld2:
            r12.finish()
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clipschaining.IgClipsChainingUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
