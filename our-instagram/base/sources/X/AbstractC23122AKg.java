package X;

/* renamed from: X.AKg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23122AKg {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C210399Se A02(com.instagram.common.gallery.Medium r17, com.instagram.common.session.UserSession r18, X.C38321qM r19, int r20, int r21, boolean r22) {
        /*
            r3 = 1
            r2 = 13
            com.instagram.model.mediatype.ProductType r0 = r19.A1z()
            if (r0 == 0) goto L44
            int r1 = r0.ordinal()
            if (r1 == r2) goto L41
            r0 = 9
            if (r1 != r0) goto L44
            X.9se r8 = X.EnumC222999se.A0C
        L15:
            r10 = 0
            r11 = 0
            X.9Az r5 = new X.9Az
            r5.<init>(r11)
            r16 = 0
            X.9sY r9 = X.EnumC222939sY.A06
            r14 = -1
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            X.9Se r4 = new X.9Se
            r6 = r17
            r7 = r18
            r12 = r20
            r13 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A07 = r3
            if (r22 == 0) goto L40
            float r1 = (float) r12
            r0 = 1025758986(0x3d23d70a, float:0.04)
            float r1 = r1 * r0
            X.9Az r0 = new X.9Az
            r0.<init>(r1)
            r4.A03 = r0
        L40:
            return r4
        L41:
            X.9se r8 = X.EnumC222999se.A09
            goto L15
        L44:
            X.9se r8 = X.EnumC222999se.A05
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23122AKg.A02(com.instagram.common.gallery.Medium, com.instagram.common.session.UserSession, X.1qM, int, int, boolean):X.9Se");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r1.ordinal() != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r15.Cff() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if ((!X.AbstractC41774Ieq.A05(r1)) != true) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[LOOP:0: B:32:0x00bf->B:34:0x00c3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C148276lx A03(android.content.Context r12, com.instagram.common.session.UserSession r13, X.C38321qM r14, X.C38321qM r15, int r16, boolean r17) {
        /*
            r2 = 1
            com.instagram.model.mediatype.ProductType r1 = r15.A1z()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            boolean r8 = X.AbstractC167007dF.A1X(r1, r0)
            com.instagram.model.mediatype.ProductType r1 = r15.A1z()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            boolean r3 = X.AbstractC167007dF.A1X(r1, r0)
            X.6lx r0 = X.C148276lx.A0a
            java.lang.String r0 = r14.A38()
            if (r0 == 0) goto Ld0
            com.instagram.user.model.UpcomingEvent r1 = r14.A2B(r13)
            if (r1 == 0) goto L2c
            boolean r1 = X.AbstractC41774Ieq.A05(r1)
            r1 = r1 ^ 1
            r7 = 1
            if (r1 == r2) goto L2d
        L2c:
            r7 = 0
        L2d:
            com.instagram.model.mediasize.ExtendedImageUrl r9 = r15.A1q(r12)
            int r6 = r15.A0z()
            int r4 = r15.A0y()
            com.instagram.model.mediatype.ProductType r1 = r15.A1z()
            if (r1 == 0) goto L49
            int r2 = r1.ordinal()
            r1 = 2
            r14 = 1059816735(0x3f2b851f, float:0.67)
            if (r2 == r1) goto L4c
        L49:
            r14 = 1061997773(0x3f4ccccd, float:0.8)
        L4c:
            if (r8 != 0) goto L57
            if (r3 != 0) goto L57
            boolean r1 = r15.Cff()
            r5 = 1
            if (r1 != 0) goto L58
        L57:
            r5 = 0
        L58:
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            if (r8 == 0) goto L83
            java.lang.StringBuilder r3 = X.AbstractC166987dD.A1C()
            java.lang.String r1 = "story-igtv-metadata-sticker-"
        L64:
            r3.append(r1)
            java.lang.String r10 = X.AbstractC166997dE.A0x(r0, r3)
            float r12 = (float) r6
            float r13 = (float) r4
            r11 = r10
            X.6ly r1 = X.C148286ly.A00(r9, r10, r11, r12, r13, r14)
            r2.add(r1)
        L75:
            java.lang.String r1 = "media_"
            java.lang.String r3 = X.AnonymousClass001.A0R(r1, r0)
            X.6pU r1 = X.EnumC150226pU.A0y
            X.6lx r0 = new X.6lx
            r0.<init>(r1, r3, r2)
            return r0
        L83:
            if (r3 == 0) goto L8c
            java.lang.StringBuilder r3 = X.AbstractC166987dD.A1C()
            java.lang.String r1 = "story-reels-metadata-sticker-"
            goto L64
        L8c:
            java.lang.String r1 = "media_simple_"
            java.lang.String r10 = X.AnonymousClass001.A0R(r1, r0)
            float r12 = (float) r6
            float r13 = (float) r4
            r11 = r10
            X.6ly r4 = X.C148286ly.A00(r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = "media_post_"
            java.lang.String r10 = X.AnonymousClass001.A0R(r1, r0)
            r11 = r10
            X.6ly r3 = X.C148286ly.A00(r9, r10, r11, r12, r13, r14)
            if (r7 == 0) goto Lb4
            java.lang.String r1 = "media_event_"
            java.lang.String r10 = X.AnonymousClass001.A0R(r1, r0)
            r11 = r10
            X.6ly r1 = X.C148286ly.A00(r9, r10, r11, r12, r13, r14)
            r2.add(r1)
        Lb4:
            if (r5 != 0) goto Lbb
            if (r17 == 0) goto Lc9
            r2.add(r3)
        Lbb:
            r2.add(r4)
        Lbe:
            r1 = 0
        Lbf:
            r4 = r16
            if (r1 >= r4) goto L75
            r2.add(r3)
            int r1 = r1 + 1
            goto Lbf
        Lc9:
            r2.add(r4)
            r2.add(r3)
            goto Lbe
        Ld0:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23122AKg.A03(android.content.Context, com.instagram.common.session.UserSession, X.1qM, X.1qM, int, boolean):X.6lx");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r0.ordinal() != 2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C194808jg A01(android.content.Context r19, android.graphics.drawable.Drawable r20, com.instagram.common.session.UserSession r21, X.C38321qM r22, java.lang.Integer r23, java.lang.String r24, int r25, int r26) {
        /*
            r18 = 0
            r7 = 1
            r6 = 2
            r13 = r24
            X.C14360o3.A0B(r13, r6)
            r10 = r22
            boolean r0 = r10.A5M()
            r2 = r25
            if (r0 == 0) goto L1e
            X.1qM r11 = r10.A1e(r2)
            if (r11 != 0) goto L1f
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L1e:
            r11 = r10
        L1f:
            com.instagram.model.mediatype.ProductType r1 = r11.A1z()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            r3 = 0
            if (r1 != r0) goto L86
            r5 = 1
            X.4Vc r0 = r11.A1U()
            if (r0 == 0) goto L84
            int r4 = r0.A01
        L31:
            X.4Vc r0 = r11.A1U()
            if (r0 == 0) goto L39
            int r3 = r0.A00
        L39:
            if (r4 < r7) goto L97
            if (r3 < r7) goto L90
            com.instagram.model.mediatype.ProductType r0 = r11.A1z()
            if (r0 == 0) goto L4c
            int r0 = r0.ordinal()
            r1 = 1059816735(0x3f2b851f, float:0.67)
            if (r0 == r6) goto L4f
        L4c:
            r1 = 1061997773(0x3f4ccccd, float:0.8)
        L4f:
            r6 = r19
            int r0 = X.AbstractC188878Yd.A01(r6)
            float r0 = (float) r0
            int r14 = X.AbstractC166987dD.A0B(r0, r1)
            float r1 = (float) r14
            float r0 = (float) r4
            float r1 = r1 / r0
            float r0 = (float) r3
            int r15 = X.AbstractC166987dD.A0B(r1, r0)
            r8 = r21
            if (r5 == 0) goto L82
            int r1 = X.AbstractC13880nE.A0A(r6)
            int r0 = X.AbstractC13880nE.A09(r6)
            X.83m r9 = new X.83m
            r9.<init>(r8, r11, r1, r0)
        L73:
            r7 = r20
            r12 = r23
            r17 = r26
            r16 = r2
            r19 = r18
            X.8jg r0 = A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L82:
            r9 = 0
            goto L73
        L84:
            r4 = 0
            goto L31
        L86:
            r5 = 0
            int r4 = r11.A0z()
            int r3 = r11.A0y()
            goto L39
        L90:
            java.lang.String r0 = "Media height must be greater than zero"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L97:
            java.lang.String r0 = "Media width must be greater than zero"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23122AKg.A01(android.content.Context, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, X.1qM, java.lang.Integer, java.lang.String, int, int):X.8jg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x00b6, code lost:
    
        if (r63 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01de, code lost:
    
        if (r20 != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C194808jg A00(final android.content.Context r62, android.graphics.drawable.Drawable r63, final com.instagram.common.session.UserSession r64, X.C1815983m r65, X.C38321qM r66, X.C38321qM r67, java.lang.Integer r68, java.lang.String r69, int r70, int r71, int r72, int r73, boolean r74, boolean r75) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23122AKg.A00(android.content.Context, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, X.83m, X.1qM, X.1qM, java.lang.Integer, java.lang.String, int, int, int, int, boolean, boolean):X.8jg");
    }
}
