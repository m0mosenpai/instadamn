package X;

import android.content.Context;

/* renamed from: X.Ggj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37588Ggj implements InterfaceC43071ya {
    public boolean A00;
    public final Context A01;
    public final C37734Gj9 A02;
    public final C37556GgC A03;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (X.C18U.A06(X.AbstractC25228BEl.A0l(r2), r2, 36322856250780353L) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fe, code lost:
    
        if (X.BNP.A00(r8, r2) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r11, X.InterfaceC57162jr r12) {
        /*
            r10 = this;
            r7 = 0
            boolean r6 = X.AbstractC167007dF.A1R(r7, r11, r12)
            java.lang.Object r0 = r11.A04
            X.Ghd r0 = (X.C37644Ghd) r0
            X.3Zb r5 = r0.A0E
            X.Gj9 r4 = r10.A02
            java.lang.Object r3 = r11.A03
            X.5dq r3 = (X.C120985dq) r3
            boolean r0 = r4.A03(r3)
            if (r0 == 0) goto L100
            X.GgC r0 = r10.A03
            X.5dq r8 = X.C37556GgC.A01(r0)
            if (r5 == 0) goto L4e
            if (r8 == 0) goto L4e
            com.instagram.common.session.UserSession r2 = r4.A04
            X.0Tz r9 = X.C06090Tz.A06
            r0 = 36322856249862842(0x810b7200002aba, double:3.034058780591147E-306)
            boolean r0 = X.C18U.A06(r9, r2, r0)
            if (r0 == 0) goto L4e
            X.0Tz r9 = X.AbstractC25228BEl.A0l(r2)
            r0 = 36322856250583743(0x810b72000b2abf, double:3.034058781047048E-306)
            boolean r0 = X.C18U.A06(r9, r2, r0)
            if (r0 != 0) goto Lf0
            X.0Tz r9 = X.AbstractC25228BEl.A0l(r2)
            r0 = 36322856250780353(0x810b72000e2ac1, double:3.034058781171385E-306)
            boolean r0 = X.C18U.A06(r9, r2, r0)
            if (r0 != 0) goto Lf0
        L4e:
            r2 = 1
        L4f:
            int r1 = X.AbstractC37301Gc2.A01(r11, r12)
            if (r1 == r7) goto L7b
            r0 = 2
            if (r1 != r0) goto L7a
            boolean r0 = r10.A00
            if (r0 == 0) goto L7a
            if (r5 == 0) goto L7a
            if (r2 == 0) goto L7a
            int r0 = r5.hashCode()
            java.util.Map r3 = r4.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.get(r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L7a
            android.os.Handler r0 = r4.A03
            r0.removeCallbacks(r1)
            r3.remove(r2)
        L7a:
            return
        L7b:
            if (r5 == 0) goto L7a
            if (r2 == 0) goto L7a
            android.content.Context r7 = r10.A01
            X.1v4 r3 = r3.A06()
            boolean r0 = r4.A02
            if (r0 != 0) goto L7a
            X.4o6 r0 = r3.A0E
            if (r0 == 0) goto L7a
            boolean r0 = r4.A01
            if (r0 != 0) goto Lb7
            com.instagram.common.session.UserSession r0 = r4.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.AbstractC31171DnF.A0C(r0)
            java.lang.String r0 = "com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet"
            r2.A0R = r0
            java.lang.Integer r0 = X.C05F.A00
            X.IM4 r1 = X.C37734Gj9.A00(r7, r4, r3, r0)
            X.8eZ r0 = r2.A04()
            r1.A00(r0)
            java.lang.Integer r0 = X.C05F.A01
            X.IM4 r1 = X.C37734Gj9.A00(r7, r4, r3, r0)
            X.8eZ r0 = r2.A04()
            r1.A00(r0)
            r4.A01 = r6
        Lb7:
            int r0 = r5.hashCode()
            java.util.Map r3 = r4.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r3.get(r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto Ld1
            android.os.Handler r0 = r4.A03
            r0.removeCallbacks(r1)
            r3.remove(r2)
        Ld1:
            X.J4K r6 = new X.J4K
            r6.<init>(r4, r5)
            int r0 = r5.hashCode()
            X.AbstractC25227BEk.A1O(r6, r3, r0)
            com.instagram.common.session.UserSession r3 = r4.A04
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36600994037239901(0x8208690004105d, double:3.209954237299374E-306)
            long r1 = X.C18U.A01(r2, r3, r0)
            android.os.Handler r0 = r4.A03
            r0.postDelayed(r6, r1)
            return
        Lf0:
            X.3Zk r0 = r5.A3U
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 != 0) goto L4e
            boolean r0 = X.BNP.A00(r8, r2)
            if (r0 == 0) goto L4e
        L100:
            r2 = 0
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37588Ggj.ATP(X.2n7, X.2jr):void");
    }

    public C37588Ggj(Context context, C37734Gj9 c37734Gj9, C37556GgC c37556GgC) {
        AbstractC167017dG.A1Q(context, c37556GgC);
        this.A01 = context;
        this.A02 = c37734Gj9;
        this.A03 = c37556GgC;
    }
}
