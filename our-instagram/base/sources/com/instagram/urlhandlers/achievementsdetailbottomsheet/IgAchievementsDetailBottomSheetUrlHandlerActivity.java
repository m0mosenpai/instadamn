package com.instagram.urlhandlers.achievementsdetailbottomsheet;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.C023409i;
import X.C09Y;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class IgAchievementsDetailBottomSheetUrlHandlerActivity extends BaseFragmentActivity {
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (isDestroyed() == false) goto L26;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = -1209553085(0xffffffffb7e7af43, float:-2.7618958E-5)
            int r2 = X.C0f9.A00(r0)
            super.onCreate(r10)
            if (r10 == 0) goto L13
            r0 = 1237827041(0x49c7bde1, float:1636284.1)
        Lf:
            X.C0f9.A07(r0, r2)
            return
        L13:
            android.os.Bundle r3 = X.AbstractC31176DnK.A07(r9)
            if (r3 != 0) goto L20
            r9.finish()
            r0 = -690845256(0xffffffffd6d289b8, float:-1.1574447E14)
            goto Lf
        L20:
            java.lang.String r1 = X.AbstractC31171DnF.A0a(r3)
            if (r1 != 0) goto L2d
            r9.finish()
            r0 = 1606040989(0x5fba3d9d, float:2.684011E19)
            goto Lf
        L2d:
            X.0vv r5 = r9.getSession()
            boolean r0 = r5 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L3c
            X.AbstractC35178FfV.A01(r9, r3, r5)
        L38:
            r0 = 541992534(0x204e2656, float:1.7461563E-19)
            goto Lf
        L3c:
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.2dB r0 = X.AbstractC54852fj.A00()
            if (r0 == 0) goto L7f
            X.2dB r4 = X.AbstractC54852fj.A00()
            X.AbstractC31171DnF.A1P(r4)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.0h2 r0 = X.AbstractC62582sx.A00(r4)
            boolean r0 = r0.A11()
            if (r0 != 0) goto L83
            X.0h2 r0 = X.AbstractC62582sx.A00(r4)
            boolean r0 = r0.A0G
            if (r0 != 0) goto L83
            r6 = 0
            android.net.Uri r1 = X.AbstractC25227BEk.A0B(r1)
            java.lang.String r7 = X.AbstractC31172DnG.A12(r1)
            java.lang.String r0 = "achievement_id"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L7f
            X.1ZF r3 = X.F1A.A00()
            java.util.List r8 = X.AbstractC166987dD.A1J(r0)
            r3.A04(r4, r5, r6, r7, r8)
        L7f:
            r9.finish()
            goto L38
        L83:
            boolean r0 = r9.isFinishing()
            if (r0 != 0) goto L38
            boolean r0 = r9.isDestroyed()
            if (r0 != 0) goto L38
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.achievementsdetailbottomsheet.IgAchievementsDetailBottomSheetUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
