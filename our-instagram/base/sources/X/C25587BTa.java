package X;

/* renamed from: X.BTa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25587BTa extends C06840Yb implements InterfaceC16610sE {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25587BTa(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.BcP> r3 = X.C25868BcP.class
            r1 = 3
            java.lang.String r4 = "updateAndGetUIState"
            java.lang.String r5 = "updateAndGetUIState(Ljava/lang/String;Lcom/instagram/wonderwall/model/WallDraftAttachment;)Lcom/instagram/wonderwall/viewmodel/WallPostComposerViewModel$ComposerUIState;"
        Ld:
            r6 = 4
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.4Ed> r3 = X.C92874Ed.class
            r1 = 3
            java.lang.String r4 = "mergeMediaNoteStacksWithViewerLikes"
            java.lang.String r5 = "mergeMediaNoteStacksWithViewerLikes(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;"
            goto Ld
        L1b:
            java.lang.Class<X.Mfl> r3 = X.C50978Mfl.class
            r1 = 3
            java.lang.String r4 = "computeProfileData"
            java.lang.String r5 = "computeProfileData(Ljava/util/List;Ljava/util/List;)Lcom/instagram/mediakit/viewmodel/MediaKitProfilePickerViewModel$MediaKitProfileData;"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25587BTa.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (r6 < (r7 + 1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r4 > 0) goto L21;
     */
    @Override // X.InterfaceC16610sE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            r22 = this;
            r1 = r22
            r13 = r24
            r5 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto Lc7;
                case 1: goto Lb7;
                default: goto Lb;
            }
        Lb:
            java.lang.String r5 = (java.lang.String) r5
            X.Ps3 r13 = (X.InterfaceC58259Ps3) r13
            java.lang.Object r0 = r1.receiver
            X.BcP r0 = (X.C25868BcP) r0
            X.05A r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            X.Bf8 r3 = (X.C26019Bf8) r3
            r2 = 0
            X.C14360o3.A0B(r5, r2)
            int r4 = r5.length()
            long r0 = X.C60Z.A00(r4, r4)
            X.5C3 r10 = new X.5C3
            r10.<init>(r5, r0)
            java.lang.String r0 = "/60"
            java.lang.String r14 = X.AnonymousClass001.A03(r4, r0)
            r0 = 55
            boolean r18 = X.AbstractC25230BEn.A1S(r4, r0)
            X.CSa r12 = r3.A02
            boolean r19 = X.AbstractC25229BEm.A1Z(r12)
            X.5C3 r7 = r3.A00
            X.C14360o3.A0B(r7, r2)
            long r0 = r7.A00
            boolean r5 = X.C5C2.A03(r0)
            if (r5 == 0) goto Lb5
            int r6 = X.AbstractC25225BEi.A06(r0)
            X.5C8 r0 = r7.A01
            java.lang.String r1 = r0.A00
            X.DQ2 r0 = X.DQ2.A00
            int r0 = X.CZ9.A00(r1, r0, r6)
            r8 = 1
            int r7 = r0 + 1
            if (r7 >= r6) goto Lb5
            java.lang.String r0 = X.AbstractC25227BEk.A0w(r1, r7, r6)
            java.util.regex.Matcher r5 = X.AbstractC13670mt.A09(r0)
            boolean r0 = r5.find()
            if (r0 == 0) goto Lb5
            java.lang.String r9 = r5.group(r8)
            if (r9 == 0) goto Lb5
            int r0 = r9.length()
            if (r0 == 0) goto Lb5
            java.lang.String r1 = "@"
            java.lang.String r0 = ""
            java.lang.String r15 = X.AbstractC002300n.A0d(r9, r1, r0, r2)
            int r0 = r5.start(r8)
            int r0 = r0 + r7
            int r1 = r0 + 1
            int r0 = r5.end(r8)
            int r7 = r7 + r0
            if (r1 > r6) goto Lb5
            int r0 = r7 + 1
            if (r6 >= r0) goto Lb5
        L92:
            if (r13 != 0) goto L98
            r17 = 0
            if (r4 <= 0) goto L9a
        L98:
            r17 = 1
        L9a:
            com.instagram.user.model.User r11 = r3.A01
            X.5Hc r5 = r3.A06
            boolean r4 = r3.A09
            boolean r1 = r3.A08
            X.AbstractC167007dF.A1E(r11, r2, r5)
            r0 = 5
            X.C14360o3.A0B(r14, r0)
            X.Bf8 r9 = new X.Bf8
            r16 = r5
            r20 = r4
            r21 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r9
        Lb5:
            r15 = 0
            goto L92
        Lb7:
            java.util.List r5 = (java.util.List) r5
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r1.receiver
            X.Mfl r0 = (X.C50978Mfl) r0
            X.O3c r0 = r0.A07
            X.OAV r9 = new X.OAV
            r9.<init>(r0, r5, r13)
            return r9
        Lc7:
            java.util.List r5 = (java.util.List) r5
            java.util.Map r13 = (java.util.Map) r13
            java.util.List r9 = X.C92874Ed.A01(r5, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25587BTa.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
