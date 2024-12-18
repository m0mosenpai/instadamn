package com.instagram.newsfeed.data;

import X.AbstractC107294sa;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.C008002u;
import X.C05A;
import X.C0eB;
import X.C107284sZ;
import X.C10E;
import X.C4DT;
import X.C9CN;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.MUY;
import com.instagram.common.session.UserSession;
import com.instagram.repository.common.MemoryCache;
import kotlin.Deprecated;

@Deprecated(message = "Don't use this. Manage the paging state in ViewModel instead.")
/* loaded from: classes9.dex */
public final class ActivityPagedData {
    public Object A00;
    public final UserSession A01;
    public final C4DT A02;
    public final MemoryCache A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if ((r3.getValue() instanceof X.C109384wN) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        r2 = r3.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r3.AIi(r2, new X.C109384wN(((X.AbstractC107294sa) r2).A00())) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        r7.A01 = r8;
        r7.A00 = 1;
        r4 = r8.A02((X.C9CN) r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r4 != r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(com.instagram.newsfeed.data.ActivityPagedData r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 45
            boolean r0 = X.C57145PWx.A02(r9, r3)
            if (r0 == 0) goto Lad
            r7 = r9
            X.PWx r7 = (X.C57145PWx) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lad
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r4 = r7.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L77
            if (r0 != r5) goto Lb8
            java.lang.Object r8 = r7.A01
            com.instagram.newsfeed.data.ActivityPagedData r8 = (com.instagram.newsfeed.data.ActivityPagedData) r8
            X.AbstractC09560e7.A00(r4)
        L28:
            X.Pom r4 = (X.InterfaceC58061Pom) r4
            java.lang.Object r0 = r4.BWw()
            r8.A00 = r0
            X.05A r5 = r8.A05
        L32:
            java.lang.Object r6 = r5.getValue()
            r3 = r6
            X.4sa r3 = (X.AbstractC107294sa) r3
            boolean r0 = r4 instanceof X.C51856Mw0
            if (r0 == 0) goto L60
            r0 = r4
            X.Mw0 r0 = (X.C51856Mw0) r0
            java.lang.Throwable r2 = r0.A00
            X.0sJ r1 = r4.BVs()
            java.lang.Object r0 = r3.A00()
            java.lang.Object r0 = r1.invoke(r0)
            X.6DN r1 = new X.6DN
            r1.<init>(r0, r2)
        L53:
            boolean r0 = r5.AIi(r6, r1)
            if (r0 == 0) goto L32
            boolean r0 = r4 instanceof X.MUj
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L60:
            boolean r0 = r4 instanceof X.MUj
            if (r0 == 0) goto Lb3
            r0 = r4
            X.MUj r0 = (X.MUj) r0
            X.0sJ r1 = r0.A00
            java.lang.Object r0 = r3.A00()
            java.lang.Object r0 = r1.invoke(r0)
            X.4wM r1 = new X.4wM
            r1.<init>(r0)
            goto L53
        L77:
            X.AbstractC09560e7.A00(r4)
            java.lang.Object r4 = r8.A00
            if (r4 == 0) goto L88
            X.05A r3 = r8.A05
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.C109384wN
            if (r0 == 0) goto L8a
        L88:
            r0 = 0
            goto L5b
        L8a:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.4sa r0 = (X.AbstractC107294sa) r0
            java.lang.Object r1 = r0.A00()
            X.4wN r0 = new X.4wN
            r0.<init>(r1)
            boolean r0 = r3.AIi(r2, r0)
            if (r0 == 0) goto L8a
            r7.A01 = r8
            r7.A00 = r5
            X.9CN r4 = (X.C9CN) r4
            java.lang.Object r4 = r8.A02(r4, r7)
            if (r4 != r6) goto L28
            return r6
        Lad:
            X.PWx r7 = X.C57145PWx.A00(r8, r9, r3)
            goto L16
        Lb3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.data.ActivityPagedData.A00(com.instagram.newsfeed.data.ActivityPagedData, X.1Ds):java.lang.Object");
    }

    public static /* synthetic */ C0eB A01(ActivityPagedData activityPagedData, InterfaceC16660sJ interfaceC16660sJ) {
        Object value;
        AbstractC107294sa abstractC107294sa;
        C05A c05a = activityPagedData.A05;
        do {
            value = c05a.getValue();
            abstractC107294sa = (AbstractC107294sa) value;
            Object A00 = abstractC107294sa.A00();
            if (A00 != null) {
                abstractC107294sa = MUY.A00(abstractC107294sa, interfaceC16660sJ.invoke(A00));
            }
        } while (!c05a.AIi(value, abstractC107294sa));
        return C0eB.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x006b, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006f, code lost:
    
        if (r1.A00 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0071, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
    
        if (r1.A01 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007b, code lost:
    
        if (r1.A01 != true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007d, code lost:
    
        r21.A03.A03(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        r0 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0084, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r10 = r21;
        r1 = X.AbstractC25225BEi.A0z(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        r12.A03 = r21;
        r12.A04 = r2;
        r12.A00 = r4;
        r12.A01 = r3;
        r12.A02 = 1;
        r1 = (X.AbstractC129825tm) r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
    
        if ((r1 instanceof X.C129815tl) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
    
        r7 = r21.A02;
        r8 = r2.A05;
        r9 = ((X.C129815tl) r1).A00;
        r10 = r2.A03;
        r11 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c0, code lost:
    
        if (r8 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c2, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        if (r21.A06 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c8, code lost:
    
        r1 = r7.A00(r8, r9, r10, r11, r12, false, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
    
        if (r1 != r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ce, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f7, code lost:
    
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d1, code lost:
    
        if ((r1 instanceof X.NQW) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d3, code lost:
    
        r0 = r21.A02;
        r8 = ((X.NQW) r1).A00;
        r7 = r0.A00;
        r1 = X.AbstractC31177DnL.A0M(r7);
        r1.A0B("notifications/get_comments_by_comment_summary_id/");
        X.AbstractC37302Gc3.A1M(r1, r7, X.C120965do.class);
        r1 = X.AbstractC31172DnG.A0T(r1, "summary_id", r8).A00(1780311179, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        throw X.B4Z.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0076, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0077, code lost:
    
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009f, code lost:
    
        if (r1.A00 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C9CN r22, X.InterfaceC23621Ds r23) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.data.ActivityPagedData.A02(X.9CN, X.1Ds):java.lang.Object");
    }

    public ActivityPagedData(C9CN c9cn, UserSession userSession, C4DT c4dt, MemoryCache memoryCache, boolean z, boolean z2) {
        AbstractC167017dG.A1R(userSession, c4dt);
        C008002u A00 = C10E.A00(C107284sZ.A00);
        this.A05 = A00;
        this.A00 = c9cn;
        this.A04 = AbstractC208910l.A02(A00);
        this.A01 = userSession;
        this.A02 = c4dt;
        this.A03 = memoryCache;
        this.A07 = z;
        this.A06 = z2;
    }
}
