package com.instagram.creator.agent.settings.deeplink;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class CreatorAICreatorNuxUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r1.CS0(new X.C150866ql(r10)) != false) goto L9;
     */
    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0n(android.os.Bundle r8, android.os.Bundle r9, com.instagram.common.session.UserSession r10) {
        /*
            r7 = this;
            X.AbstractC167017dG.A1P(r10, r9)
            com.instagram.user.model.User r6 = X.AbstractC166997dE.A0Y(r10)
            X.18A r1 = X.AnonymousClass189.A00(r10)
            java.lang.String r0 = r10.userId
            com.instagram.user.model.User r1 = r1.A02(r0)
            if (r1 != 0) goto L17
            com.instagram.user.model.User r1 = X.AbstractC166997dE.A0Y(r10)
        L17:
            boolean r0 = r1.A2L()
            if (r0 != 0) goto L29
            X.6ql r0 = new X.6ql
            r0.<init>(r10)
            boolean r1 = r1.CS0(r0)
            r0 = 0
            if (r1 == 0) goto L2a
        L29:
            r0 = 1
        L2a:
            java.lang.String r5 = "creator_ai_entry_point_extra"
            r4 = 0
            if (r0 == 0) goto L4f
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "your_tools_creator_ai"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r5, r0)
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "creator_ai_creator_igid"
            android.os.Bundle r1 = X.AbstractC167017dG.A0T(r0, r1, r2)
            java.lang.String r0 = "creator_ai_settings"
            X.6XJ r1 = X.C6XJ.A03(r7, r1, r10, r3, r0)
            r0 = 107(0x6b, float:1.5E-43)
            r1.A0A(r7, r0)
            r7.finish()
        L4f:
            boolean r0 = X.AbstractC35051FcO.A01(r10)
            if (r0 != 0) goto L60
            java.lang.String r1 = "CreatorAICreationNuxUrlHandlerActivity"
            java.lang.String r0 = "User is not eligible to create a creator ai"
            X.C0K8.A0E(r1, r0)
        L5c:
            r7.finish()
            return
        L60:
            java.lang.String r0 = "entryPoint"
            java.lang.String r0 = r9.getString(r0)
            X.0vv r3 = r7.A00
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            X.0e4[] r0 = X.AbstractC25230BEn.A1b(r5, r0)
            android.os.Bundle r1 = X.AbstractC61636Rr0.A00(r0)
            r0 = 1520(0x5f0, float:2.13E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.6XJ r0 = X.C6XJ.A03(r7, r1, r3, r2, r0)
            r0.A07 = r4
            r0.A0C(r7)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.deeplink.CreatorAICreatorNuxUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }
}
