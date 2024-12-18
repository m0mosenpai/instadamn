package X;

/* renamed from: X.5tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129865tq {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (java.lang.Boolean.TRUE.equals(r10.A06) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r4.A0F(r9, null, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r10 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (java.lang.Boolean.TRUE.equals(r10.A03) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.session.UserSession r10, java.util.List r11) {
        /*
            r6 = 0
            r5 = 1
            X.C14360o3.A0B(r10, r5)
            X.5ts r4 = X.AbstractC129875tr.A00(r10)
            X.18A r7 = X.AnonymousClass189.A00(r10)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
        L16:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.Object r8 = r11.next()
            X.5HW r8 = (X.C5HW) r8
            com.instagram.user.model.User r9 = r8.A04()
            if (r9 == 0) goto L4c
            X.5HX r0 = r8.A04
            X.9Bl r10 = r0.A08
            if (r10 == 0) goto L39
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r10.A03
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L3c
        L39:
            r2 = 0
            if (r10 == 0) goto L47
        L3c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r10.A06
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L48
        L47:
            r1 = 0
        L48:
            r0 = 0
            r4.A0F(r9, r0, r2, r1)
        L4c:
            X.5HX r0 = r8.A04
            java.lang.String r9 = r0.A0f
            java.lang.String r1 = r0.A0h
            if (r9 == 0) goto La3
            if (r1 == 0) goto La3
            java.util.List r0 = r0.A0t
            if (r0 == 0) goto La3
            int r0 = r0.size()
            if (r0 <= r5) goto La3
            boolean r0 = r3.add(r9)
            if (r0 == 0) goto La3
            com.instagram.user.model.User r2 = r7.A02(r9)
            if (r2 != 0) goto L71
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r9, r1)
        L71:
            X.5HX r0 = r8.A04
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0E
            if (r0 == 0) goto L7a
            r2.A0i(r0)
        L7a:
            X.5HX r0 = r8.A04
            X.Mte r0 = r0.A0A
            if (r0 == 0) goto L8b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.A00
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L8c
        L8b:
            r0 = 0
        L8c:
            r2.A1B(r0)
            java.lang.String r1 = "remove_follower"
            X.5HX r0 = r8.A04
            java.util.List r0 = r0.A0t
            if (r0 == 0) goto La0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto La0
            r2.A10(r5)
        La0:
            r7.A01(r2, r5, r6)
        La3:
            X.5Hd r1 = r8.A05
            X.5Hd r0 = X.C5Hd.FOLLOW_REQUEST
            if (r1 != r0) goto L16
            com.instagram.user.model.User r2 = r8.A04()
            if (r2 == 0) goto Lc6
            X.5HX r0 = r8.A04
            X.9Bl r0 = r0.A08
            if (r0 == 0) goto Lc0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.A05
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto Lc1
        Lc0:
            r0 = 0
        Lc1:
            r2.A16(r0)
            goto L16
        Lc6:
            java.lang.String r1 = "ActivityPagedData"
            java.lang.String r0 = "The user object in the follow request story is null."
            X.C0w9.A03(r1, r0)
            goto L16
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC129865tq.A00(com.instagram.common.session.UserSession, java.util.List):void");
    }
}
