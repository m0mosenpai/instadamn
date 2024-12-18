package com.instagram.direct.fragment.sharesheet.mvvm.data;

import X.AbstractC001800i;
import X.AbstractC167017dG;
import X.C2DS;
import X.C2DU;
import X.C2EC;
import X.C2JO;
import X.C4A7;
import X.C4I1;
import X.InterfaceC23621Ds;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class DirectShareSheetRecipientRepository extends C4A7 {
    public final UserSession A00;
    public final DirectShareSheetApi A01;
    public final C2DS A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.EnumC33375Ep8 r9, java.lang.String r10, java.util.List r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository.A00(X.Ep8, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.List r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r5 = 3
            boolean r0 = X.MAT.A03(r10, r5)
            if (r0 == 0) goto L67
            r4 = r10
            X.MAT r4 = (X.MAT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r2 = r4.A01
            X.1JX r7 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L7e
            X.AbstractC09560e7.A00(r2)
        L23:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L6f
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            return r0
        L2e:
            X.AbstractC09560e7.A00(r2)
            com.instagram.common.session.UserSession r6 = r8.A00
            r4.A00 = r0
            java.lang.String r3 = X.AbstractC68470VSb.A00()
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r9.iterator()
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            com.instagram.model.direct.DirectShareTarget r0 = X.AbstractC31172DnG.A0m(r1)
            java.util.ArrayList r0 = r0.A0B()
            X.AnonymousClass016.A16(r0, r2)
            goto L41
        L53:
            java.util.List r1 = X.AbstractC001800i.A0W(r2)
            r0 = 0
            r2 = 0
            X.1ON r1 = com.instagram.direct.request.DirectThreadApi.A0C(r6, r3, r0, r1)
            r0 = 315964894(0x12d53dde, float:1.3457441E-27)
            java.lang.Object r2 = r1.A02(r4, r0, r5, r2)
            if (r2 != r7) goto L23
            return r7
        L67:
            r0 = 42
            X.MAT r4 = new X.MAT
            r4.<init>(r8, r10, r5, r0)
            goto L15
        L6f:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L79
            X.JUs r0 = new X.JUs
            r0.<init>()
            return r0
        L79:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository.A02(java.util.List, X.1Ds):java.lang.Object");
    }

    public final Object A01(Integer num, Integer num2, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, boolean z, boolean z2) {
        String str5;
        DirectShareSheetApi directShareSheetApi = this.A01;
        UserSession userSession = this.A00;
        Boolean valueOf = Boolean.valueOf(z2);
        List<C2EC> A0d = AbstractC001800i.A0d(((C2DU) this.A02).A0C.A0F(C4I1.A00), i2);
        ArrayList A0q = AbstractC167017dG.A0q(A0d);
        for (C2EC c2ec : A0d) {
            C2JO c2jo = new C2JO();
            c2jo.A05("participant_ids", c2ec.BSF());
            c2jo.A09(String.valueOf(c2ec.BLF() / 1000), "last_activity_ts");
            if (c2ec.CX1()) {
                str5 = "XAC";
            } else {
                str5 = "IG";
            }
            c2jo.A09(str5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            c2jo.A09(String.valueOf(c2ec.BLF() / 1000), "thread_create_ts");
            c2jo.A09(c2ec.C7q(), ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            A0q.add(c2jo);
        }
        return directShareSheetApi.A00(userSession, valueOf, num, num2, str, str2, str3, str4, A0q, interfaceC23621Ds, i, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DirectShareSheetRecipientRepository(com.instagram.common.session.UserSession r4, com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi r5) {
        /*
            r3 = this;
            X.2DS r2 = X.AbstractC28761aE.A00(r4)
            r0 = 1
            int r1 = X.AbstractC25230BEn.A07(r0, r4, r2)
            r0 = 728032920(0x2b64e698, float:8.1321885E-13)
            X.19K r1 = X.C4A8.A01(r0, r1)
            java.lang.String r0 = "DirectSharesheetRecipientRepository"
            r3.<init>(r0, r1)
            r3.A00 = r4
            r3.A01 = r5
            r3.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository.<init>(com.instagram.common.session.UserSession, com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi):void");
    }
}
