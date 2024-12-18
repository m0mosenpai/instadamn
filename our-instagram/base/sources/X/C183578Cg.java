package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.8Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C183578Cg extends C03E implements InterfaceC16660sJ {
    public C183578Cg(Object obj) {
        super(1, obj, ClipsCreationDraftViewModel.class, "onCurrentDraftStateChange", "onCurrentDraftStateChange(Lcom/instagram/creation/capture/quickcapture/sundial/model/Resource;)V", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36327297246575082L) != false) goto L6;
     */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            X.8he r12 = (X.AbstractC193598he) r12
            r2 = 0
            X.C14360o3.A0B(r12, r2)
            java.lang.Object r4 = r11.receiver
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r4 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r4
            android.content.Context r9 = r4.A04
            com.instagram.common.session.UserSession r3 = r4.A0D
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r8 = "com.instagram.basel"
            boolean r0 = X.C14360o3.A0K(r0, r8)
            if (r0 != 0) goto L28
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36327297246575082(0x810f7c000839ea, double:3.036867284794426E-306)
            boolean r1 = X.C18U.A06(r5, r3, r0)
            r0 = 0
            if (r1 == 0) goto L29
        L28:
            r0 = 1
        L29:
            r5 = 0
            if (r0 == 0) goto Lcc
            X.5qm r0 = r4.A00
        L2e:
            int r1 = r12.A00
            r10 = 3
            if (r1 != r10) goto Lb2
            java.lang.Object r7 = r12.A00()
            X.5qm r7 = (X.C128175qm) r7
            java.lang.String r6 = r7.A0T
            if (r0 == 0) goto Lb0
            java.lang.String r0 = r0.A0T
        L3f:
            boolean r0 = X.C14360o3.A0K(r6, r0)
            if (r0 != 0) goto L9b
            X.8yh r0 = r7.A0C
            if (r0 == 0) goto L8e
            X.8r2 r0 = r0.A01
            if (r0 == 0) goto L8e
            X.47v r0 = r0.A07
            if (r0 == 0) goto L8e
            boolean r0 = r0.A04
            if (r0 == 0) goto L8e
            java.lang.String r0 = r9.getPackageName()
            boolean r0 = X.C14360o3.A0K(r0, r8)
            if (r0 != 0) goto L8e
            X.0Tz r8 = X.C06090Tz.A05
            r0 = 36327297246575082(0x810f7c000839ea, double:3.036867284794426E-306)
            boolean r0 = X.C18U.A06(r8, r3, r0)
            if (r0 != 0) goto L8e
            java.lang.Class<X.8ZN> r0 = X.C8ZN.class
            java.lang.Object r1 = r3.A00(r0)
            if (r1 == 0) goto Ldd
            X.6aw r3 = X.AbstractC141776au.A00(r4)
            r0 = 43
            X.9D3 r2 = new X.9D3
            r2.<init>(r4, r1, r5, r0)
        L7f:
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r2, r3)
        L86:
            X.05A r0 = r4.A0P
            r0.Egh(r6)
        L8b:
            X.0eB r0 = X.C0eB.A00
            return r0
        L8e:
            r4.A00 = r7
            X.2li r1 = r4.A06
            X.817 r0 = new X.817
            r0.<init>(r7, r2)
            r1.A0A(r0)
            goto L86
        L9b:
            X.12L r1 = X.C12L.A00
            r0 = 1213693484(0x48577e2c, float:220664.69)
            X.0nZ r0 = r1.AOT(r0, r10)
            X.19K r3 = X.AnonymousClass194.A02(r0)
            r0 = 42
            X.9D3 r2 = new X.9D3
            r2.<init>(r4, r7, r5, r0)
            goto L7f
        Lb0:
            r0 = r5
            goto L3f
        Lb2:
            if (r1 != 0) goto L8b
            r4.A00 = r5
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L8b
            X.2GS r2 = r4.A09
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.8A8 r0 = new X.8A8
            r0.<init>(r1)
            r2.A0A(r0)
            goto L8b
        Lcc:
            X.2li r0 = r4.A06
            java.lang.Object r0 = r0.A02()
            X.817 r0 = (X.AnonymousClass817) r0
            if (r0 == 0) goto Lda
            X.5qm r0 = r0.A01
            goto L2e
        Lda:
            r0 = r5
            goto L2e
        Ldd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183578Cg.invoke(java.lang.Object):java.lang.Object");
    }
}
