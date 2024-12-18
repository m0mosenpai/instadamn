package com.meta.metaai.imagine.memu.impl.data;

import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;

/* loaded from: classes9.dex */
public final class MEmuDataRepository {
    public final MEmuNetworkService A00;

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(2:20|(1:22)(3:23|24|(1:26)))|14|15|(1:17)(1:18)))|29|6|7|(0)(0)|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        r1 = X.MSW.A1D(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(android.graphics.Bitmap r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 11
            boolean r0 = X.C29631D3m.A03(r10, r3)
            if (r0 == 0) goto L23
            r7 = r10
            X.D3m r7 = (X.C29631D3m) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L2d
            if (r0 != r5) goto L28
            goto L44
        L23:
            X.D3m r7 = X.C29631D3m.A00(r8, r10, r3)
            goto L16
        L28:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2d:
            X.AbstractC09560e7.A00(r1)
            if (r9 != 0) goto L33
            return r4
        L33:
            r2 = 30000(0x7530, double:1.4822E-319)
            r1 = 4
            X.PZa r0 = new X.PZa     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r8, r9, r4, r1)     // Catch: java.lang.Throwable -> L4a
            r7.A00 = r5     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = X.LHL.A00(r7, r0, r2)     // Catch: java.lang.Throwable -> L4a
            if (r1 != r6) goto L47
            return r6
        L44:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L4a
        L47:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            X.0e5 r1 = X.MSW.A1D(r0)
        L4f:
            java.lang.Throwable r0 = X.C09550e6.A00(r1)
            if (r0 != 0) goto L56
            return r1
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository.A00(android.graphics.Bitmap, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f9, code lost:
    
        if (r7 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0200, code lost:
    
        r8 = r3.getOptionalTreeField(0, "xfb_add_memu_user_photos(data:$input)", X.QQZ.class, -362489214);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x020b, code lost:
    
        if (r8 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x020d, code lost:
    
        r8 = r8.getOptionalTreeField(3, "photo_verification", X.QQW.class, 1083701403);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0219, code lost:
    
        if (r8 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021b, code lost:
    
        r0 = r8.getRequiredCompactedTreeListField(0, "results", X.QQV.class, 686479716);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0226, code lost:
    
        if (r0 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0228, code lost:
    
        r10 = X.AbstractC166987dD.A1E();
        r13 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0234, code lost:
    
        if (r13.hasNext() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0236, code lost:
    
        r12 = X.AbstractC25225BEi.A0l(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0240, code lost:
    
        if (r12.hasFieldValue("is_similar") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0242, code lost:
    
        r9 = X.AbstractC31174DnI.A0o(r12, "is_similar", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0246, code lost:
    
        r8 = (X.EnumC53315Nhr) r12.getOptionalEnumField(1, "orientation", X.EnumC53315Nhr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0256, code lost:
    
        if (r12.hasFieldValue("similarity_score") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0258, code lost:
    
        r2 = new java.lang.Double(r12.getCoercedDoubleField(2, "similarity_score"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0261, code lost:
    
        r10.add(new X.C54829OLo(r8, (X.EnumC53320Nhw) r12.getOptionalEnumField(3, "verification_status", X.EnumC53320Nhw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), r9, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0274, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0276, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0281, code lost:
    
        r5 = X.AbstractC133095zb.A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0285, code lost:
    
        if (r5 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0287, code lost:
    
        r3 = r3.getOptionalTreeField(0, "xfb_add_memu_user_photos(data:$input)", X.QQZ.class, -362489214);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0292, code lost:
    
        if (r3 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x029f, code lost:
    
        if (r3.getOptionalTreeField(1, "error", X.QQU.class, -530741976) != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a2, code lost:
    
        r2 = X.AbstractC25225BEi.A0z(new X.C55020OWu(r7, r5, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b8, code lost:
    
        r5 = X.AbstractC133095zb.A00(X.C16930sl.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02be, code lost:
    
        if (r3 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01fe, code lost:
    
        if (r3 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x018e, code lost:
    
        if (r1 == r2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r7 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        r8 = r3.getOptionalTreeField(0, "xfb_create_memu_user(data:$input)", X.QRB.class, -488828611);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        if (r8 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c9, code lost:
    
        r8 = r8.getOptionalTreeField(3, "photo_verification", X.QR8.class, -558786691);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r8 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        r0 = r8.getRequiredCompactedTreeListField(0, "results", X.QR7.class, 1985442806);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        r10 = X.AbstractC166987dD.A1E();
        r13 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        if (r13.hasNext() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        r12 = X.AbstractC25225BEi.A0l(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        if (r12.hasFieldValue("is_similar") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fe, code lost:
    
        r9 = X.AbstractC31174DnI.A0o(r12, "is_similar", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        r8 = (X.EnumC53315Nhr) r12.getOptionalEnumField(1, "orientation", X.EnumC53315Nhr.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
    
        if (r12.hasFieldValue("similarity_score") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0114, code lost:
    
        r2 = new java.lang.Double(r12.getCoercedDoubleField(2, "similarity_score"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r10.add(new X.C54829OLo(r8, (X.EnumC53320Nhw) r12.getOptionalEnumField(3, "verification_status", X.EnumC53320Nhw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), r9, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0130, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r6 = X.AbstractC133095zb.A00(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
    
        if (r6 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0143, code lost:
    
        r3 = r3.getOptionalTreeField(0, "xfb_create_memu_user(data:$input)", X.QRB.class, -488828611);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
    
        if (r3 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015b, code lost:
    
        if (r3.getOptionalTreeField(2, "error", X.QR6.class, -961286077) != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
    
        r2 = X.AbstractC25225BEi.A0z(new X.C55020OWu(r7, r6, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        r6 = X.AbstractC133095zb.A00(X.C16930sl.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017a, code lost:
    
        if (r3 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ba, code lost:
    
        if (r3 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r16, java.lang.String r17, java.util.List r18, X.InterfaceC23621Ds r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository.A01(java.lang.String, java.lang.String, java.util.List, X.1Ds, boolean, boolean):java.lang.Object");
    }

    public MEmuDataRepository(MEmuNetworkService mEmuNetworkService) {
        this.A00 = mEmuNetworkService;
    }
}
