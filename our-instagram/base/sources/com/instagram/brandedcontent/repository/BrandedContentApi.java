package com.instagram.brandedcontent.repository;

import X.C14360o3;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class BrandedContentApi {
    public final UserSession A00;

    public BrandedContentApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r9 = this;
            r5 = 3
            boolean r0 = X.MAS.A03(r12, r5)
            if (r0 == 0) goto L5a
            r4 = r12
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L2b
            if (r0 != r7) goto L91
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L5f
            return r1
        L2b:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r9.A00
            X.1Ms r8 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "business/branded_content/change_approval_request_status_for_creator/"
            r8.A0B(r0)
            java.lang.Class<X.K89> r1 = X.K89.class
            java.lang.Class<X.LBA> r0 = X.LBA.class
            r2 = 0
            r8.A0P(r3, r1, r0, r2)
            java.lang.String r0 = "creator_igid"
            r8.A9s(r0, r11)
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "new_status"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r8, r0, r1)
            r4.A00 = r7
            r0 = 1444377988(0x56177584, float:4.1632745E13)
            java.lang.Object r1 = r1.A02(r4, r0, r5, r2)
            if (r1 != r6) goto L24
            return r6
        L5a:
            X.MAS r4 = X.MAS.A00(r9, r12, r5)
            goto L15
        L5f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L8c
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r1 = r1.A00
            X.5If r1 = (X.AbstractC115105If) r1
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 == 0) goto L7e
            X.5Ig r1 = (X.C115115Ig) r1
            java.lang.Object r0 = r1.A00
            X.1um r0 = (X.C40791um) r0
            int r0 = r0.mStatusCode
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            X.8jk r6 = X.AbstractC43592JPx.A0p(r0)
            return r6
        L7e:
            boolean r0 = r1 instanceof X.C115095Ie
            if (r0 == 0) goto L87
            X.8jk r6 = X.AbstractC43592JPx.A0p(r3)
            return r6
        L87:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A00(com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.api.schemas.BrandedContentGatingInfo r10, com.instagram.api.schemas.BrandedContentProjectMetadataIntf r11, java.lang.String r12, java.util.List r13, java.util.List r14, X.InterfaceC23621Ds r15, boolean r16) {
        /*
            r9 = this;
            r3 = 6
            boolean r0 = X.MAS.A03(r15, r3)
            if (r0 == 0) goto L71
            r4 = r15
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r0 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 != r6) goto L7b
            X.AbstractC09560e7.A00(r0)
        L23:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L30
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L76
            X.8jk r5 = X.AbstractC25227BEk.A0h()
        L30:
            return r5
        L31:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r8 = r9.A00
            r7 = 0
            r3 = 0
            X.1Ms r2 = X.AbstractC167017dG.A0c(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            r0 = 56
            java.lang.String r0 = X.MSV.A00(r0)
            X.AbstractC31173DnH.A1Q(r2, r0, r1)
            java.lang.Class<X.N3N> r1 = X.N3N.class
            java.lang.Class<X.IRu> r0 = X.C41349IRu.class
            r2.A0P(r3, r1, r0, r7)
            r0 = r16
            X.AbstractC55150OdD.A04(r2, r8, r13, r14, r0)
            X.AbstractC55150OdD.A02(r2, r10)
            if (r11 == 0) goto L5e
            com.instagram.api.schemas.BrandedContentProjectMetadata r3 = r11.ErO()
        L5e:
            X.AbstractC55150OdD.A03(r2, r3)
            X.1ON r1 = r2.A0N()
            r4.A00 = r6
            r0 = 146206461(0x8b6eefd, float:1.1009912E-33)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r5) goto L23
            return r5
        L71:
            X.MAS r4 = X.MAS.A00(r9, r15, r3)
            goto L15
        L76:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A01(com.instagram.api.schemas.BrandedContentGatingInfo, com.instagram.api.schemas.BrandedContentProjectMetadataIntf, java.lang.String, java.util.List, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r3 = 4
            boolean r0 = X.MAS.A03(r11, r3)
            if (r0 == 0) goto L70
            r5 = r11
            X.MAS r5 = (X.MAS) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 0
            r7 = 1
            if (r0 == 0) goto L3c
            if (r0 != r7) goto Lac
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L7a
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.H9Q r0 = (X.H9Q) r0
            X.MRj r0 = r0.A00
            if (r0 != 0) goto L75
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3c:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1Ms r3 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "business/branded_content/update_whitelist_settings/"
            r3.A0B(r0)
            java.lang.Class<X.H9Q> r2 = X.H9Q.class
            java.lang.Class<X.IPW> r1 = X.IPW.class
            r0 = 0
            r3.A0P(r4, r2, r1, r0)
            if (r9 == 0) goto L59
            java.lang.String r0 = "added_user_id"
            r3.A9s(r0, r9)
        L59:
            if (r10 == 0) goto L60
            java.lang.String r0 = "removed_user_id"
            r3.A9s(r0, r10)
        L60:
            X.1ON r1 = r3.A0N()
            r5.A00 = r7
            r0 = 50545580(0x30343ac, float:3.8575123E-37)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L24
            return r6
        L70:
            X.MAS r5 = X.MAS.A00(r8, r11, r3)
            goto L15
        L75:
            X.3NX r6 = X.AbstractC25225BEi.A0z(r0)
            return r6
        L7a:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto La7
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r1 = r1.A00
            X.5If r1 = (X.AbstractC115105If) r1
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 == 0) goto L99
            X.5Ig r1 = (X.C115115Ig) r1
            java.lang.Object r0 = r1.A00
            X.1um r0 = (X.C40791um) r0
            int r0 = r0.mStatusCode
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            X.8jk r6 = X.AbstractC43592JPx.A0p(r0)
            return r6
        L99:
            boolean r0 = r1 instanceof X.C115095Ie
            if (r0 == 0) goto La2
            X.8jk r6 = X.AbstractC43592JPx.A0p(r4)
            return r6
        La2:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La7:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lac:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A03(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r8, java.util.List r9, java.util.List r10, X.InterfaceC23621Ds r11) {
        /*
            r7 = this;
            r3 = 5
            boolean r0 = X.MAS.A03(r11, r3)
            if (r0 == 0) goto L65
            r4 = r11
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r0 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 != r6) goto L6f
            X.AbstractC09560e7.A00(r0)
        L23:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L30
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L6a
            X.8jk r5 = X.AbstractC25227BEk.A0h()
        L30:
            return r5
        L31:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r3 = r7.A00
            X.1Ms r2 = X.AbstractC167017dG.A0c(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            r0 = 56
            java.lang.String r0 = X.MSV.A00(r0)
            X.AbstractC31173DnH.A1Q(r2, r0, r1)
            java.lang.Class<X.N3N> r1 = X.N3N.class
            java.lang.Class<X.IRu> r0 = X.C41349IRu.class
            r2.A0R(r1, r0)
            boolean r0 = X.AbstractC166987dD.A1b(r10)
            X.AbstractC55150OdD.A04(r2, r3, r9, r10, r0)
            X.1ON r1 = r2.A0N()
            r4.A00 = r6
            r0 = 146206461(0x8b6eefd, float:1.1009912E-33)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r5) goto L23
            return r5
        L65:
            X.MAS r4 = X.MAS.A00(r7, r11, r3)
            goto L15
        L6a:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A04(java.lang.String, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = X.MAS.A03(r8, r5)
            if (r0 == 0) goto L5c
            r4 = r8
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            if (r1 == 0) goto L30
            if (r1 != r5) goto L66
            X.AbstractC09560e7.A00(r0)
        L22:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L2f
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L61
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L2f:
            return r3
        L30:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "business/branded_content/get_pending_approval_requests_for_brand/"
            r2.A0B(r0)
            java.lang.Class<X.K8G> r1 = X.K8G.class
            java.lang.Class<X.LBB> r0 = X.LBB.class
            r2.A0R(r1, r0)
            if (r7 == 0) goto L4c
            java.lang.String r0 = "cursor"
            r2.A9s(r0, r7)
        L4c:
            X.1ON r1 = r2.A0N()
            r4.A00 = r5
            r0 = 132968731(0x7ecf11b, float:3.5651042E-34)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L5c:
            X.MAS r4 = X.MAS.A00(r6, r8, r5)
            goto L15
        L61:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L66:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A06(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 2
            boolean r0 = X.MAS.A03(r10, r3)
            if (r0 == 0) goto L53
            r6 = r10
            X.MAS r6 = (X.MAS) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A01
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L2b
            if (r0 != r5) goto L8c
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L58
            return r1
        L2b:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1Ms r3 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "business/branded_content/create_brand_approval_request/"
            r3.A0B(r0)
            java.lang.Class<X.K87> r2 = X.K87.class
            java.lang.Class<X.LB8> r1 = X.LB8.class
            r0 = 0
            r3.A0P(r4, r2, r1, r0)
            java.lang.String r0 = "brand_igid"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r3, r0, r9)
            r6.A00 = r5
            r0 = 2124031084(0x7e9a246c, float:1.0244511E38)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r7) goto L24
            return r7
        L53:
            X.MAS r6 = X.MAS.A00(r8, r10, r3)
            goto L15
        L58:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L87
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r1 = r1.A00
            X.5If r1 = (X.AbstractC115105If) r1
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 == 0) goto L79
            X.5Ig r1 = (X.C115115Ig) r1
            java.lang.Object r0 = r1.A00
            X.1un r0 = (X.InterfaceC40801un) r0
            int r0 = r0.getStatusCode()
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            X.8jk r7 = X.AbstractC43592JPx.A0p(r0)
            return r7
        L79:
            boolean r0 = r1 instanceof X.C115095Ie
            if (r0 == 0) goto L82
            X.8jk r7 = X.AbstractC43592JPx.A0p(r4)
            return r7
        L82:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L87:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A07(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 7
            boolean r0 = X.MAS.A03(r8, r3)
            if (r0 == 0) goto L68
            r5 = r8
            X.MAS r5 = (X.MAS) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L72
            X.AbstractC09560e7.A00(r1)
        L23:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L2f
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L6d
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L2f:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L38
            X.3NX r1 = X.AbstractC25235BEs.A0f(r3)
        L37:
            return r1
        L38:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L37
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L41:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "business/branded_content/update_branded_content_opt_in_status/"
            r2.A0B(r0)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            java.lang.String r0 = "opt_in_status"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r2, r0, r7)
            r5.A00 = r3
            r0 = 649201540(0x26b20784, float:1.2353268E-15)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L23
            return r4
        L68:
            X.MAS r5 = X.MAS.A00(r6, r8, r3)
            goto L15
        L6d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L72:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A08(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = X.MAS.A03(r7, r3)
            if (r0 == 0) goto L53
            r5 = r7
            X.MAS r5 = (X.MAS) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L5d
            X.AbstractC09560e7.A00(r0)
        L23:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L30
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L58
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L30:
            return r4
        L31:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "business/branded_content/get_pending_approval_requests_for_creator/"
            r2.A0B(r0)
            java.lang.Class<X.K8G> r1 = X.K8G.class
            java.lang.Class<X.LBB> r0 = X.LBB.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 1900719496(0x714aad88, float:1.0036121E30)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L23
            return r4
        L53:
            X.MAS r5 = X.MAS.A00(r6, r7, r3)
            goto L15
        L58:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0C(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r7 = this;
            r4 = 47
            boolean r0 = X.MAR.A03(r10, r4)
            if (r0 == 0) goto L74
            r2 = r10
            X.MAR r2 = (X.MAR) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L74
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r0 = r2.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L7e
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L79
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            r6 = 0
            X.1Ms r5 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "business/branded_content/bc_pending_tag_megaphone_for_brand/"
            r5.A0B(r0)
            java.lang.Class<X.N3D> r1 = X.N3D.class
            java.lang.Class<X.OO7> r0 = X.OO7.class
            r5.A0R(r1, r0)
            java.lang.String r0 = X.AbstractC31581Du9.A01()
            r5.A9s(r0, r8)
            if (r9 == 0) goto L64
            java.lang.String r0 = "_"
            java.util.List r0 = X.AbstractC167007dF.A0m(r9, r0, r6)
            if (r0 == 0) goto L64
            java.lang.Object r1 = X.AbstractC001800i.A0O(r0, r6)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "media_id"
            r5.A9s(r0, r1)
        L64:
            X.1ON r1 = r5.A0N()
            r2.A00 = r4
            r0 = 141471847(0x86eb067, float:7.182788E-34)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L24
            return r3
        L74:
            X.MAR r2 = X.MAR.A01(r7, r10, r4)
            goto L16
        L79:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A02(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 45
            boolean r0 = X.MAR.A03(r10, r3)
            if (r0 == 0) goto L54
            r6 = r10
            X.MAR r6 = (X.MAR) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L8b
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L59
            return r1
        L2c:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1Ms r3 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "business/branded_content/cancel_brand_approval_request_for_creator/"
            r3.A0B(r0)
            java.lang.Class<X.K89> r2 = X.K89.class
            java.lang.Class<X.LBA> r1 = X.LBA.class
            r0 = 0
            r3.A0P(r4, r2, r1, r0)
            java.lang.String r0 = "brand_igid"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r3, r0, r9)
            r6.A00 = r5
            r0 = 1367811425(0x51872561, float:7.255596E10)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r7) goto L25
            return r7
        L54:
            X.MAR r6 = X.MAR.A01(r8, r10, r3)
            goto L16
        L59:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L86
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r1 = r1.A00
            X.5If r1 = (X.AbstractC115105If) r1
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 == 0) goto L78
            X.5Ig r1 = (X.C115115Ig) r1
            java.lang.Object r0 = r1.A00
            X.1um r0 = (X.C40791um) r0
            int r0 = r0.mStatusCode
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            X.8jk r7 = X.AbstractC43592JPx.A0p(r0)
            return r7
        L78:
            boolean r0 = r1 instanceof X.C115095Ie
            if (r0 == 0) goto L81
            X.8jk r7 = X.AbstractC43592JPx.A0p(r4)
            return r7
        L81:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L86:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A05(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(java.util.List r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 49
            boolean r0 = X.MAR.A03(r9, r3)
            if (r0 == 0) goto L76
            r6 = r9
            X.MAR r6 = (X.MAR) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L48
            if (r0 != r4) goto L8e
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L32
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L89
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L32:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L7b
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.H8T r0 = (X.H8T) r0
            X.Muh r0 = r0.A00
            if (r0 != 0) goto L84
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L48:
            X.AbstractC09560e7.A00(r1)
            java.lang.String r3 = X.AbstractC31175DnJ.A0b(r8)
            X.C14360o3.A07(r3)
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "business/branded_content/get_organic_permission_with_brands/"
            r2.A0B(r0)
            java.lang.Class<X.H8T> r1 = X.H8T.class
            java.lang.Class<X.INk> r0 = X.C41244INk.class
            r2.A0R(r1, r0)
            java.lang.String r0 = "brand_ids"
            X.1ON r1 = X.AbstractC31172DnG.A0T(r2, r0, r3)
            r6.A00 = r4
            r0 = 903993422(0x35e1d84e, float:1.6826759E-6)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r5) goto L24
            return r5
        L76:
            X.MAR r6 = X.MAR.A01(r7, r9, r3)
            goto L16
        L7b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L88
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L84:
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L88:
            return r1
        L89:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A09(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 46
            boolean r0 = X.MAR.A03(r7, r3)
            if (r0 == 0) goto L54
            r5 = r7
            X.MAR r5 = (X.MAR) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L5e
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L59
            X.8jk r4 = X.AbstractC25227BEk.A0h()
        L31:
            return r4
        L32:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "business/branded_content/get_whitelist_sponsors/"
            r2.A0B(r0)
            java.lang.Class<X.K8P> r1 = X.K8P.class
            java.lang.Class<X.IPg> r0 = X.C41291IPg.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 1923560763(0x72a7353b, float:6.6237886E30)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L54:
            X.MAR r5 = X.MAR.A01(r6, r7, r3)
            goto L16
        L59:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0A(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 48
            boolean r0 = X.MAR.A03(r7, r3)
            if (r0 == 0) goto L6a
            r5 = r7
            X.MAR r5 = (X.MAR) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 != r3) goto L82
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L32
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L7d
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L32:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L6f
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.H9Q r0 = (X.H9Q) r0
            X.MRj r0 = r0.A00
            if (r0 != 0) goto L78
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L48:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "business/branded_content/get_whitelist_settings/"
            r2.A0B(r0)
            java.lang.Class<X.H9Q> r1 = X.H9Q.class
            java.lang.Class<X.IPW> r0 = X.IPW.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 2034397097(0x79426fa9, float:6.3098145E34)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L6a:
            X.MAR r5 = X.MAR.A01(r6, r7, r3)
            goto L16
        L6f:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L7c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L78:
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L7c:
            return r1
        L7d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentApi.A0B(X.1Ds):java.lang.Object");
    }
}
