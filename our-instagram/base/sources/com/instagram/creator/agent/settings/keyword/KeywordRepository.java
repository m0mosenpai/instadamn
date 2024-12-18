package com.instagram.creator.agent.settings.keyword;

import X.AbstractC167007dF;
import X.C14360o3;
import X.C40701ud;
import X.C4A7;
import X.C4A8;

/* loaded from: classes5.dex */
public final class KeywordRepository extends C4A7 {
    public final C40701ud A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeywordRepository(C40701ud c40701ud, String str, String str2) {
        super("creator_ai_keyword_response_repository", C4A8.A01(245403032, 3));
        C14360o3.A0B(str, 2);
        AbstractC167007dF.A1F(str2, 3, c40701ud);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = c40701ud;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r2 = java.lang.Long.valueOf(r7.getCoercedTimeField(4, "expiration_time"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return new X.QJ0(r2, r3, r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        if (r7 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.QJ0 A00(X.C59328Qcc r7) {
        /*
            r2 = 0
            if (r7 == 0) goto L3f
            java.lang.String r0 = "strong_id__"
            java.lang.String r3 = r7.A07(r0)
        L9:
            java.lang.String r1 = ""
            if (r3 != 0) goto Le
            r3 = r1
        Le:
            if (r7 == 0) goto L18
            java.lang.String r0 = "keyword"
            java.lang.String r4 = r7.A08(r0)
            if (r4 != 0) goto L30
        L18:
            r4 = r1
            if (r7 != 0) goto L30
            r5 = r2
        L1c:
            r6 = r1
            if (r7 == 0) goto L2a
        L1f:
            r1 = 4
            java.lang.String r0 = "expiration_time"
            long r0 = r7.getCoercedTimeField(r1, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L2a:
            X.QJ0 r1 = new X.QJ0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L30:
            java.lang.String r0 = "link"
            java.lang.String r5 = r7.A09(r0)
            java.lang.String r0 = "description"
            java.lang.String r6 = r7.A0A(r0)
            if (r6 != 0) goto L1f
            goto L1c
        L3f:
            r3 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A00(X.Qcc):X.QJ0");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r15 = this;
            r7 = r18
            r4 = 11
            r5 = r21
            boolean r0 = X.MAF.A01(r5, r4)
            if (r0 == 0) goto Lda
            r2 = r5
            X.MAF r2 = (X.MAF) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lda
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r3 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L6d
            if (r0 != r9) goto Le1
            X.AbstractC09560e7.A00(r3)
        L29:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L64
            X.2JS r3 = X.AbstractC25232BEp.A18(r3)
            if (r3 == 0) goto L63
            java.lang.Class<X.QcY> r2 = X.C59324QcY.class
            r4 = 0
            r0 = 1089(0x441, float:1.526E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1961438951(0x74e92ee7, float:1.4779742E32)
            X.2JS r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L63
            java.lang.Class<X.QcX> r2 = X.C59323QcX.class
            java.lang.String r1 = "creator_ai_link_keyword"
            r0 = -1991474348(0xffffffff894c8354, float:-2.4617357E-33)
            X.2JS r2 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L63
            java.lang.Class<X.Qcc> r1 = X.C59328Qcc.class
            r0 = 202909926(0xc1828e6, float:1.1721961E-31)
            X.2JS r0 = r2.reinterpretRequired(r4, r1, r0)
            X.Qcc r0 = (X.C59328Qcc) r0
            X.QJ0 r10 = A00(r0)
        L63:
            return r10
        L64:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L63
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6d:
            X.AbstractC09560e7.A00(r3)
            X.1ud r0 = r15.A00
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.0Jx r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r4 = r15.A02
            java.lang.String r3 = "creator_igid"
            X.0CA r6 = X.AbstractC25227BEk.A0T(r6, r4, r3)
            java.lang.String r3 = "keyword"
            r4 = r17
            X.C0CA.A00(r6, r4, r3)
            if (r18 == 0) goto L93
            int r3 = r7.length()
            if (r3 != 0) goto L94
        L93:
            r7 = r10
        L94:
            java.lang.String r3 = "link"
            X.C0CA.A00(r6, r7, r3)
            java.lang.String r3 = "description"
            r4 = r19
            X.C0CA.A00(r6, r4, r3)
            java.lang.String r3 = "entrypoint"
            r4 = r20
            X.C0CA.A00(r6, r4, r3)
            if (r16 == 0) goto Ld8
            java.lang.String r4 = r16.toString()
        Lad:
            java.lang.String r3 = "expiration_time"
            X.C0CA.A00(r6, r4, r3)
            java.lang.String r3 = "data"
            X.1uJ r4 = X.AbstractC25233BEq.A0H(r6, r5, r3)
            java.util.Map r6 = r5.getParamsCopy()
            java.util.Map r7 = r8.getParamsCopy()
            java.lang.Class<X.QcZ> r8 = X.C59325QcZ.class
            java.util.ArrayList r14 = X.AbstractC166987dD.A1E()
            java.lang.String r5 = "CreateNewKeywordResponseMutation"
            r11 = 0
            java.lang.String r13 = "xig_create_creator_ai_link_keyword"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = X.AbstractC25235BEs.A0m(r3, r0, r15, r2)
            if (r3 != r1) goto L29
            return r1
        Ld8:
            r4 = r10
            goto Lad
        Lda:
            X.MAF r2 = new X.MAF
            r2.<init>(r15, r5, r4)
            goto L1a
        Le1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A01(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r15 = this;
            r8 = r18
            r4 = 12
            r5 = r20
            boolean r0 = X.MAF.A01(r5, r4)
            if (r0 == 0) goto Lcd
            r2 = r5
            X.MAF r2 = (X.MAF) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lcd
            int r3 = r3 - r1
            r2.A00 = r3
        L1a:
            java.lang.Object r3 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L6d
            if (r0 != r9) goto Ld4
            X.AbstractC09560e7.A00(r3)
        L29:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L64
            X.2JS r3 = X.AbstractC25232BEp.A18(r3)
            if (r3 == 0) goto L63
            java.lang.Class<X.Qct> r2 = X.C59345Qct.class
            r4 = 0
            r0 = 1108(0x454, float:1.553E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 5851428(0x594924, float:8.199597E-39)
            X.2JS r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L63
            java.lang.Class<X.Qcs> r2 = X.C59344Qcs.class
            java.lang.String r1 = "creator_ai_link_keyword"
            r0 = -1140801944(0xffffffffbc00be68, float:-0.007857896)
            X.2JS r2 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L63
            java.lang.Class<X.Qcc> r1 = X.C59328Qcc.class
            r0 = 202909926(0xc1828e6, float:1.1721961E-31)
            X.2JS r0 = r2.reinterpretRequired(r4, r1, r0)
            X.Qcc r0 = (X.C59328Qcc) r0
            X.QJ0 r10 = A00(r0)
        L63:
            return r10
        L64:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L63
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6d:
            X.AbstractC09560e7.A00(r3)
            X.1ud r0 = r15.A00
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.0Jx r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r3 = "creator_ai_link_keyword_id"
            r5 = r17
            X.0CA r5 = X.AbstractC25227BEk.A0T(r4, r5, r3)
            if (r18 == 0) goto L8c
            int r3 = r8.length()
            if (r3 != 0) goto L8d
        L8c:
            r8 = r10
        L8d:
            java.lang.String r3 = "link"
            X.C0CA.A00(r5, r8, r3)
            java.lang.String r3 = "description"
            r4 = r19
            X.C0CA.A00(r5, r4, r3)
            if (r16 == 0) goto Lcb
            java.lang.String r4 = r16.toString()
        L9f:
            java.lang.String r3 = "expiration_time"
            X.C0CA.A00(r5, r4, r3)
            java.lang.String r3 = "data"
            X.1uJ r4 = X.AbstractC25233BEq.A0H(r5, r6, r3)
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r7.getParamsCopy()
            java.lang.Class<X.Qcu> r8 = X.C59346Qcu.class
            java.util.ArrayList r14 = X.AbstractC166987dD.A1E()
            java.lang.String r5 = "UpdateKeywordResponseMutation"
            r11 = 64
            java.lang.String r13 = "xig_update_creator_ai_link_keyword"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = X.AbstractC25235BEs.A0m(r3, r0, r15, r2)
            if (r3 != r1) goto L29
            return r1
        Lcb:
            r4 = r10
            goto L9f
        Lcd:
            X.MAF r2 = new X.MAF
            r2.<init>(r15, r5, r4)
            goto L1a
        Ld4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A02(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r2.length() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r8 = r5.getOptionalStringField(1, "preview_title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r8 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        r9 = r5.A07("preview_description");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r9 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        r7 = r5.getOptionalStringField(2, "preview_image_url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r7 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        if (r15 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r5 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        r2 = r5.getOptionalStringField(2, "preview_image_url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        if (r2 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if (r2.length() != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        r13 = r5.getCoercedIntField(3, X.AbstractC58317Pt9.A00(340));
        r12 = r5.getCoercedIntField(4, "preview_image_width");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        return new X.C26200BiQ(r7, r8, r9, r1, r4.getOptionalStringField(1, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE), r12, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r5 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cb, code lost:
    
        r13 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0092, code lost:
    
        if (r5 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r22, java.lang.String r23, java.lang.String r24, X.InterfaceC23621Ds r25) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A03(java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d6, code lost:
    
        if (r14 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d8, code lost:
    
        r2 = r3.A04(X.C59337Qcl.class, "page_info", -1996912542);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e3, code lost:
    
        if (r2 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cd, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
    
        if (r3 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0212, code lost:
    
        return new X.C50627MWo(49, r7, new X.C25313BIi(r13, r14, r15, 1, r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01eb, code lost:
    
        r2 = r3.A04(X.C59337Qcl.class, "page_info", -1996912542);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f6, code lost:
    
        if (r2 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f8, code lost:
    
        r13 = r2.getOptionalStringField(1, "end_cursor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fe, code lost:
    
        r15 = r3.getCoercedIntField(0, "count");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e5, code lost:
    
        r17 = r2.getCoercedBooleanField(0, "has_next_page");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ca, code lost:
    
        if (r3 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c0, code lost:
    
        if (r5 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f4, code lost:
    
        if (r5 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r21, java.lang.String r22, X.InterfaceC23621Ds r23) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A04(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r19 = this;
            r4 = r20
            r5 = 8
            r6 = r21
            boolean r0 = X.MAF.A01(r6, r5)
            r7 = r19
            if (r0 == 0) goto L9f
            r3 = r6
            X.MAF r3 = (X.MAF) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r3.A00 = r2
        L1c:
            java.lang.Object r1 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r13 = 1
            if (r0 == 0) goto L61
            if (r0 != r13) goto Lab
            java.lang.Object r4 = r3.A01
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L5b
            X.2JS r5 = X.AbstractC25232BEp.A18(r1)
            if (r5 == 0) goto L59
            java.lang.Class<X.Qca> r3 = X.C59326Qca.class
            r2 = 0
            r0 = 1095(0x447, float:1.534E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = -219307622(0xfffffffff2eda19a, float:-9.413544E30)
            X.2JS r1 = r5.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L59
            java.lang.String r0 = "deleted_id"
            java.lang.String r0 = r1.getOptionalStringField(r2, r0)
        L50:
            boolean r0 = X.C14360o3.A0K(r0, r4)
        L54:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L59:
            r0 = 0
            goto L50
        L5b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto La6
            r0 = 0
            goto L54
        L61:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r7.A00
            r14 = 0
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.0Jx r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "creator_ai_link_keyword_id"
            X.0CA r5 = X.AbstractC25227BEk.A0T(r5, r4, r0)
            java.lang.String r0 = "data"
            X.1uJ r8 = X.AbstractC25233BEq.A0H(r5, r7, r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Qcb> r12 = X.C59327Qcb.class
            java.util.ArrayList r18 = X.AbstractC166987dD.A1E()
            java.lang.String r9 = "DeleteKeywordResponseMutation"
            r15 = 64
            java.lang.String r17 = "xig_delete_creator_ai_link_keyword_schema"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = X.AbstractC25235BEs.A0m(r7, r1, r4, r3)
            if (r1 != r2) goto L2c
            return r2
        L9f:
            X.MAF r3 = new X.MAF
            r3.<init>(r7, r6, r5)
            goto L1c
        La6:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lab:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A05(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r3 = 24
            r6 = r19
            boolean r0 = X.C29630D3l.A03(r6, r3)
            r5 = r17
            if (r0 == 0) goto Lb4
            r4 = r6
            X.D3l r4 = (X.C29630D3l) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L6c
            if (r0 != r2) goto Lc6
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lba
            X.2JS r5 = X.AbstractC25232BEp.A18(r1)
            if (r5 == 0) goto Lc3
            java.lang.Class<X.Qcd> r3 = X.C59329Qcd.class
            r4 = 0
            r0 = 1093(0x445, float:1.532E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1764791147(0x6930936b, float:1.3341694E25)
            X.2JS r3 = r5.getOptionalTreeField(r4, r1, r3, r0)
            if (r3 == 0) goto Lc3
            java.lang.String r0 = "is_valid"
            boolean r0 = r3.getCoercedBooleanField(r4, r0)
            if (r0 != 0) goto Lc3
            X.C80 r1 = X.C80.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "reason"
            java.lang.Enum r2 = r3.getOptionalEnumField(r2, r0, r1)
            X.C80 r0 = X.C80.NON_UNIQUE_KEYWORD
            r1 = 2131965232(0x7f133530, float:1.9567268E38)
            if (r2 != r0) goto L60
            r1 = 2131965235(0x7f133533, float:1.9567274E38)
        L60:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.BHS r0 = X.BHS.A00(r0, r1)
            X.BiW r3 = new X.BiW
            r3.<init>(r0)
            return r3
        L6c:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r5.A00
            r12 = 0
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.0Jx r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r5 = r5.A02
            java.lang.String r0 = "creator_igid"
            X.0CA r5 = X.AbstractC25227BEk.A0T(r6, r5, r0)
            java.lang.String r0 = "keyword"
            r6 = r18
            X.C0CA.A00(r5, r6, r0)
            java.lang.String r0 = "data"
            X.1uJ r6 = X.AbstractC25233BEq.A0H(r5, r8, r0)
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Qce> r10 = X.C59330Qce.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "KeywordResponseKeywordValidation"
            r11 = 0
            java.lang.String r15 = "xig_creator_ai_validate_keyword"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r5, r4)
            if (r1 != r3) goto L28
            return r3
        Lb4:
            X.D3l r4 = X.C29630D3l.A01(r5, r6, r3)
            goto L1a
        Lba:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto Lc3
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc3:
            X.Cur r3 = X.C29248Cur.A00
            return r3
        Lc6:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A06(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(java.lang.String r20, X.InterfaceC23621Ds r21) {
        /*
            r19 = this;
            r3 = 25
            r4 = r21
            boolean r0 = X.C29630D3l.A03(r4, r3)
            r6 = r19
            if (r0 == 0) goto L9f
            r5 = r4
            X.D3l r5 = (X.C29630D3l) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r5.A00 = r2
        L1a:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L5d
            if (r0 != r3) goto Lb1
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto La5
            X.2JS r4 = X.AbstractC25232BEp.A18(r1)
            if (r4 == 0) goto Lae
            java.lang.Class<X.Qcf> r3 = X.C59331Qcf.class
            r2 = 0
            r0 = 1094(0x446, float:1.533E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1223150942(0x48e7cd5e, float:474730.94)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto Lae
            java.lang.String r0 = "is_valid"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != 0) goto Lae
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 2131965234(0x7f133532, float:1.9567272E38)
            X.BHS r0 = X.BHS.A00(r1, r0)
            X.BiW r1 = new X.BiW
            r1.<init>(r0)
            return r1
        L5d:
            X.AbstractC09560e7.A00(r1)
            X.1ud r2 = r6.A00
            r14 = 0
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.0Jx r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "link"
            r8 = r20
            X.0CA r1 = X.AbstractC25227BEk.A0T(r1, r8, r0)
            java.lang.String r0 = "data"
            X.1uJ r8 = X.AbstractC25233BEq.A0H(r1, r7, r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Qcg> r12 = X.C59332Qcg.class
            java.util.ArrayList r18 = X.AbstractC166987dD.A1E()
            java.lang.String r9 = "KeywordResponseLinkValidation"
            r13 = 0
            java.lang.String r17 = "xig_creator_ai_validate_link"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.A00 = r3
            java.lang.Object r1 = r2.A04(r7, r5)
            if (r1 != r4) goto L28
            return r4
        L9f:
            X.D3l r5 = X.C29630D3l.A01(r6, r4, r3)
            goto L1a
        La5:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto Lae
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lae:
            X.Cur r1 = X.C29248Cur.A00
            return r1
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A07(java.lang.String, X.1Ds):java.lang.Object");
    }
}
