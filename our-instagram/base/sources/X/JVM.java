package X;

/* loaded from: classes8.dex */
public final class JVM {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r2.A0A == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        r13 = r2.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        return new X.JVI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r1, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r9 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (X.AbstractC167007dF.A1Z(r23.A0y) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.JVI A00(android.content.Context r21, com.instagram.common.session.UserSession r22, X.AnonymousClass988 r23, X.C160787Im r24, X.C7IM r25, java.lang.String r26) {
        /*
            r20 = this;
            r0 = 0
            r4 = r21
            r3 = r22
            r2 = r23
            r5 = r25
            X.AbstractC167027dH.A0a(r0, r4, r3, r5, r2)
            r1 = r24
            X.3nh r0 = r1.A0e
            X.C14360o3.A07(r0)
            X.4hT r6 = r0.A0e
            r13 = 0
            if (r6 == 0) goto Lb8
            X.4hU r8 = r6.A04
        L1a:
            X.7Q5 r9 = r0.A0w
            com.instagram.user.model.User r6 = X.AbstractC166997dE.A0Y(r3)
            boolean r16 = r0.A1l(r6)
            r6 = r26
            boolean r15 = r0.A1g(r3, r6)
            com.instagram.user.model.User r6 = X.AbstractC166997dE.A0Y(r3)
            boolean r7 = r0.A1j(r6)
            X.7TT r6 = r1.A0G
            boolean r6 = r6.A1G
            if (r6 == 0) goto L42
            X.0do r6 = r2.A0y
            boolean r6 = X.AbstractC167007dF.A1Z(r6)
            r17 = 1
            if (r6 != 0) goto L44
        L42:
            r17 = 0
        L44:
            java.lang.Integer r6 = r0.A1F
            if (r17 != 0) goto Lb5
            if (r7 == 0) goto Lab
            if (r8 != 0) goto Lb5
            java.lang.Integer r10 = X.C05F.A0j
            if (r6 != r10) goto La4
            if (r9 == 0) goto La4
            boolean r6 = r9.A01()
            if (r6 != 0) goto L5a
            java.lang.Integer r10 = X.C05F.A0Y
        L5a:
            com.instagram.user.model.User r6 = r1.A0K
            if (r6 == 0) goto La1
            java.lang.String r12 = r6.getUsername()
        L62:
            java.lang.String r7 = r0.A0k()
            java.lang.String r6 = "once"
            boolean r14 = r6.equals(r7)
            java.lang.Integer r6 = r0.A1F
            int r6 = r6.intValue()
            switch(r6) {
                case 0: goto L9e;
                case 1: goto L9e;
                case 2: goto L9e;
                case 3: goto L9b;
                case 4: goto L9b;
                case 5: goto L9e;
                default: goto L75;
            }
        L75:
            java.lang.Integer r11 = X.C05F.A0C
        L77:
            X.7QL r7 = X.AbstractC43594JPz.A0Y(r3, r2, r1, r5, r0)
            X.7QX r6 = X.AbstractC43592JPx.A0d(r4, r3, r2, r1, r0)
            X.7TT r1 = r1.A0G
            boolean r1 = r1.A0y
            X.4hT r2 = r0.A0e
            if (r2 == 0) goto L8d
            java.lang.String r0 = r2.A0A
            r19 = 1
            if (r0 != 0) goto L91
        L8d:
            r19 = 0
            if (r2 == 0) goto L93
        L91:
            java.lang.String r13 = r2.A0A
        L93:
            X.JVI r5 = new X.JVI
            r18 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
        L9b:
            java.lang.Integer r11 = X.C05F.A00
            goto L77
        L9e:
            java.lang.Integer r11 = X.C05F.A01
            goto L77
        La1:
            java.lang.String r12 = ""
            goto L62
        La4:
            java.lang.Integer r10 = X.C05F.A0N
            if (r6 != r10) goto Lb5
            if (r9 == 0) goto Lb5
            goto L5a
        Lab:
            if (r16 == 0) goto Lb0
            java.lang.Integer r10 = X.C05F.A00
            goto L5a
        Lb0:
            if (r15 == 0) goto Lb5
            java.lang.Integer r10 = X.C05F.A01
            goto L5a
        Lb5:
            java.lang.Integer r10 = X.C05F.A0u
            goto L5a
        Lb8:
            r8 = r13
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVM.A00(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IM, java.lang.String):X.JVI");
    }
}
