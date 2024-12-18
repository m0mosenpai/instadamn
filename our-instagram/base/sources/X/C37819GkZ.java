package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GkZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37819GkZ implements InterfaceC62852tO {
    public final ClipsViewerConfig A00;
    public final UserSession A01;
    public final C37546Gg2 A02;
    public final C37586Ggh A03;
    public final C37556GgC A04;

    @Override // X.InterfaceC62852tO
    public final void D5C(C120985dq c120985dq, Integer num, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r11.BUt() != true) goto L10;
     */
    @Override // X.InterfaceC62852tO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5D(X.InterfaceC111084zP r11, java.util.List r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r7 = 0
            r4 = r12
            X.C14360o3.A0B(r12, r7)
            if (r14 == 0) goto L4d
            r6 = 1
            r5 = r13
            if (r13 == 0) goto L24
            X.GgC r2 = r10.A04
            int r1 = r2.A03()
            X.Gg2 r3 = r10.A02
            if (r11 == 0) goto L1c
            boolean r0 = r11.BUt()
            r8 = 1
            if (r0 == r6) goto L1d
        L1c:
            r8 = 0
        L1d:
            r9 = r6
            r3.A0E(r4, r5, r6, r7, r8, r9)
            r2.A0E(r1)
        L24:
            com.instagram.clips.intf.ClipsViewerConfig r1 = r10.A00
            boolean r0 = r1.A1u
            if (r0 != 0) goto L4d
            com.instagram.clips.intf.ClipsViewerSource r4 = r1.A0J
            com.instagram.common.session.UserSession r3 = r10.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325845548217794(0x810e2a001135c2, double:3.035949224907757E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L42
            boolean r0 = X.AbstractC37301Gc2.A1U(r2, r3)
            if (r0 != 0) goto L42
            r6 = 0
        L42:
            boolean r0 = X.AbstractC37834Gko.A07(r4, r6)
            if (r0 == 0) goto L4d
            X.Ggh r0 = r10.A03
            r0.A02(r11)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37819GkZ.D5D(X.4zP, java.util.List, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r7.BUt() != true) goto L8;
     */
    @Override // X.InterfaceC62852tO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5I(X.InterfaceC111084zP r7, java.util.List r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            if (r9 == 0) goto L51
            X.GgC r4 = r6.A04
            int r3 = r4.A03()
            X.Gg2 r2 = r6.A02
            r5 = 1
            if (r7 == 0) goto L18
            boolean r0 = r7.BUt()
            r1 = 1
            if (r0 == r5) goto L19
        L18:
            r1 = 0
        L19:
            X.Gg8 r0 = r2.A0A
            r0.A0X(r8)
            if (r1 == 0) goto L25
            X.0sl r0 = X.C16930sl.A00
            r2.A0D(r0, r5)
        L25:
            r4.A0E(r3)
            com.instagram.clips.intf.ClipsViewerConfig r1 = r6.A00
            boolean r0 = r1.A1u
            if (r0 != 0) goto L51
            com.instagram.clips.intf.ClipsViewerSource r4 = r1.A0J
            com.instagram.common.session.UserSession r3 = r6.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325845548217794(0x810e2a001135c2, double:3.035949224907757E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L46
            boolean r0 = X.AbstractC37301Gc2.A1U(r2, r3)
            if (r0 != 0) goto L46
            r5 = 0
        L46:
            boolean r0 = X.AbstractC37834Gko.A07(r4, r5)
            if (r0 == 0) goto L51
            X.Ggh r0 = r6.A03
            r0.A02(r7)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37819GkZ.D5I(X.4zP, java.util.List, boolean, boolean):void");
    }

    public C37819GkZ(ClipsViewerConfig clipsViewerConfig, UserSession userSession, C37546Gg2 c37546Gg2, C37586Ggh c37586Ggh, C37556GgC c37556GgC) {
        AbstractC167017dG.A1P(userSession, clipsViewerConfig);
        C14360o3.A0B(c37586Ggh, 5);
        this.A01 = userSession;
        this.A00 = clipsViewerConfig;
        this.A04 = c37556GgC;
        this.A02 = c37546Gg2;
        this.A03 = c37586Ggh;
    }
}
