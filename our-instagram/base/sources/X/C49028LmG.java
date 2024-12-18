package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LmG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49028LmG implements C7Q6 {
    public final UserSession A00;
    public final InterfaceC164987Zn A01;
    public final C7T8 A02;
    public final InterfaceC11380iw A03;

    public C49028LmG(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC164987Zn interfaceC164987Zn, C7T8 c7t8) {
        C14360o3.A0B(interfaceC164987Zn, 1);
        this.A01 = interfaceC164987Zn;
        this.A00 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = c7t8;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[LOOP:2: B:42:0x00f8->B:44:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148 A[LOOP:3: B:47:0x0142->B:49:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b A[LOOP:4: B:52:0x0165->B:54:0x016b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0187 A[LOOP:5: B:57:0x0181->B:59:0x0187, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.view.View r37, X.C7SZ r38, int r39) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49028LmG.A00(android.view.View, X.7SZ, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (X.AbstractC13880nE.A0z(r13.A04.A00, r11.getRawX(), r11.getRawY()) == false) goto L17;
     */
    @Override // X.C7Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean DT4(android.view.MotionEvent r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = this;
            X.7SZ r12 = (X.C7SZ) r12
            X.Loh r13 = (X.C49164Loh) r13
            r6 = 0
            boolean r5 = X.AbstractC167007dF.A1R(r6, r12, r13)
            r4 = 2
            X.C14360o3.A0B(r11, r4)
            java.util.List r3 = r12.A04
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto La0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto La0
        L19:
            java.lang.Object r0 = r3.get(r6)
            X.5tG r0 = (X.AbstractC129515tG) r0
            boolean r7 = r0.BCt()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r2 = r12.A02
            X.7Zn r1 = r10.A01
            r0 = r1
            X.7Zl r0 = (X.InterfaceC164967Zl) r0
            boolean r0 = X.AbstractC46806Kn1.A00(r0, r2, r7)
            if (r0 != 0) goto L82
            boolean r0 = X.AbstractC166987dD.A1b(r3)
            if (r0 == 0) goto L82
            int r0 = r12.A00
            if (r0 == 0) goto L9a
            if (r0 == r5) goto L94
            X.L4z r0 = r13.A03
            com.instagram.common.ui.base.IgFrameLayout r7 = r0.A00
            float r1 = r11.getRawX()
            float r0 = r11.getRawY()
            boolean r9 = X.AbstractC13880nE.A0z(r7, r1, r0)
            int r0 = r3.size()
            if (r0 < r4) goto L65
            X.L4z r0 = r13.A04
            com.instagram.common.ui.base.IgFrameLayout r2 = r0.A00
            float r1 = r11.getRawX()
            float r0 = r11.getRawY()
            boolean r0 = X.AbstractC13880nE.A0z(r2, r1, r0)
            r8 = 1
            if (r0 != 0) goto L66
        L65:
            r8 = 0
        L66:
            int r1 = r3.size()
            r0 = 3
            if (r1 < r0) goto L84
            X.L4z r0 = r13.A05
            com.instagram.common.ui.base.IgFrameLayout r2 = r0.A00
            float r1 = r11.getRawX()
            float r0 = r11.getRawY()
            boolean r0 = X.AbstractC13880nE.A0z(r2, r1, r0)
            if (r0 == 0) goto L84
            r10.A00(r2, r12, r4)
        L82:
            r0 = 1
            return r0
        L84:
            if (r8 == 0) goto L8e
            X.L4z r0 = r13.A04
            com.instagram.common.ui.base.IgFrameLayout r0 = r0.A00
            r10.A00(r0, r12, r5)
            goto L82
        L8e:
            if (r9 == 0) goto L82
            r10.A00(r7, r12, r6)
            goto L82
        L94:
            java.lang.String r0 = r2.A01
            r1.AGu(r0, r4)
            goto L82
        L9a:
            java.lang.String r0 = r2.A01
            r1.AGu(r0, r5)
            goto L82
        La0:
            java.util.Iterator r7 = r3.iterator()
        La4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r2 = r7.next()
            X.KTK r2 = (X.KTK) r2
            X.7T8 r1 = r10.A02
            com.instagram.common.session.UserSession r0 = r10.A00
            X.47Z r0 = X.AbstractC46820KnF.A00(r0, r2)
            boolean r0 = X.C7T8.A01(r1, r0)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto La4
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49028LmG.DT4(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }
}
