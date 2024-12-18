package com.instagram.urlhandlers.clips;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC54852fj;
import X.C06090Tz;
import X.C14360o3;
import X.C172077lc;
import X.C31374Dqe;
import X.C3K8;
import X.C71313Hs;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes6.dex */
public final class ClipsUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;
    public C31374Dqe A01;
    public boolean A02;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final C172077lc getGnvGestureHandler() {
        AbstractC18680vv abstractC18680vv = this.A00;
        AbstractC31171DnF.A1Q(abstractC18680vv);
        if (C3K8.A02(abstractC18680vv)) {
            C172077lc A00 = C172077lc.A00(abstractC18680vv);
            C14360o3.A07(A00);
            C71313Hs A002 = C71313Hs.A00(abstractC18680vv);
            C14360o3.A07(A002);
            A00.A03(A002);
            A00.A02(A002);
            return A00;
        }
        return null;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Object A00;
        super.onBackPressed();
        if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36322980804897587L) && (A00 = AbstractC54852fj.A00()) != null) {
            AbstractC31179DnN.A0w(AbstractC31177DnL.A0I((FragmentActivity) A00));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (X.C35221FgE.A02(r1, r9, r5, null, false) == false) goto L36;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1162090481(0x454417f1, float:3137.4963)
            int r6 = X.C0f9.A00(r0)
            super.onCreate(r10)
            android.os.Bundle r2 = X.AbstractC31176DnK.A07(r9)
            java.lang.String r4 = "Required value was null."
            if (r2 == 0) goto Lbc
            X.0vv r0 = X.AbstractC31172DnG.A0V(r2)
            r9.A00 = r0
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            android.os.Parcelable r3 = r2.getParcelable(r0)
            android.content.Intent r3 = (android.content.Intent) r3
            if (r3 == 0) goto L33
            r1 = 0
            r0 = 646(0x286, float:9.05E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r3.getBooleanExtra(r0, r1)
            r9.A02 = r0
        L33:
            X.0vv r0 = r9.A00
            if (r0 == 0) goto Lc4
            X.Dqe r0 = X.AbstractC37492GfA.A00(r0)
            r9.A01 = r0
            java.lang.String r8 = X.AbstractC31171DnF.A0a(r2)
            r7 = 1
            if (r8 == 0) goto Lb2
            int r0 = r8.length()
            if (r0 == 0) goto Lb2
            X.0vv r0 = r9.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L73
            java.lang.String r0 = "ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG"
            r2.putBoolean(r0, r7)
            X.1Ur r1 = X.AbstractC35178FfV.A00()
            X.0vv r0 = r9.A00
            if (r0 == 0) goto L6e
            r1.A00(r9, r2, r0)
            X.Dqe r1 = r9.A01
            if (r1 != 0) goto Lad
            java.lang.String r0 = "deeplinkPerfLogger"
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L6e:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r4)
            throw r1
        L73:
            r0 = 3586(0xe02, float:5.025E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r1 = r2.getString(r0)
            if (r1 == 0) goto L88
            java.lang.String r0 = "android-app://com.instagram.android"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 == 0) goto L89
        L88:
            r1 = 0
        L89:
            X.0vv r5 = r9.A00
            X.AbstractC31171DnF.A1Q(r5)
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            r4 = 0
            boolean r3 = r9.A02
            java.lang.String r0 = "reel"
            r2 = 0
            X.C14360o3.A0B(r5, r2)
            android.os.Bundle r1 = X.C35221FgE.A00(r5, r8, r0, r1)
            if (r3 == 0) goto La6
            if (r1 == 0) goto La6
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_INTERNAL_LINK"
            r1.putBoolean(r0, r7)
        La6:
            boolean r0 = X.C35221FgE.A02(r1, r9, r5, r4, r2)
            if (r0 != 0) goto Lb5
            goto Lb2
        Lad:
            java.lang.String r0 = "signed out"
            r1.A02(r0)
        Lb2:
            r9.finish()
        Lb5:
            r0 = -933054726(0xffffffffc862b6fa, float:-232155.9)
            X.C0f9.A07(r0, r6)
            return
        Lbc:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r4)
            r0 = -1078964824(0xffffffffbfb04da8, float:-1.3773699)
            goto Lcb
        Lc4:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r4)
            r0 = 1930348078(0x730ec62e, float:1.1311733E31)
        Lcb:
            X.C0f9.A07(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
