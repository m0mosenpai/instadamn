package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GjU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37755GjU implements InterfaceC116905Qw {
    public C59952od A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final C61582rL A03;
    public final C37866GlL A04;
    public final C37586Ggh A05;
    public final boolean A06;

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r8.A0G == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    @Override // X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5H(X.C37818GkY r8) {
        /*
            r7 = this;
            r4 = 0
            X.C14360o3.A0B(r8, r4)
            com.instagram.common.session.UserSession r0 = r7.A02
            boolean r0 = X.C1LE.A03(r0)
            if (r0 == 0) goto L10
            boolean r0 = r8.A0C
            if (r0 == 0) goto L77
        L10:
            boolean r0 = r8.A0D
            if (r0 == 0) goto L19
            boolean r0 = r8.A0G
            r1 = 1
            if (r0 != 0) goto L1a
        L19:
            r1 = 0
        L1a:
            X.2od r5 = r7.A00
            if (r5 == 0) goto L77
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r5.A01
            if (r0 == 0) goto L25
            r0.setRefreshing(r4)
        L25:
            if (r1 == 0) goto L77
            X.Gfw r0 = r5.A09
            if (r0 != 0) goto L35
            java.lang.String r6 = "clipsViewerFragmentViewModel"
        L2d:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L35:
            X.Hbs r0 = r0.A0A
            if (r0 == 0) goto L3b
            r0.A00 = r4
        L3b:
            com.instagram.common.session.UserSession r2 = X.C59952od.A01(r5)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36323427480775912(0x810bf700042ce8, double:3.034420029320735E-306)
            boolean r1 = X.C18U.A06(r3, r2, r0)
            java.lang.String r6 = "clipsViewerViewPager"
            X.GgC r0 = r5.A0N
            if (r1 == 0) goto L78
            if (r0 == 0) goto L2d
            r0.A0E(r4)
        L55:
            com.instagram.common.session.UserSession r2 = X.C59952od.A01(r5)
            r0 = 36323427480644839(0x810bf700022ce7, double:3.034420029237844E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 == 0) goto L6d
            X.GhC r0 = r5.A0H
            if (r0 == 0) goto L6d
            X.2pm r0 = r0.A03
            r0.A02()
        L6d:
            X.GgC r0 = r5.A0N
            if (r0 == 0) goto L2d
            X.GgE r0 = r0.A04
            if (r0 == 0) goto L77
            r0.A01 = r4
        L77:
            return
        L78:
            if (r0 == 0) goto L2d
            r0.A0F(r4, r4)
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37755GjU.D5H(X.GkY):void");
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        SwipeRefreshLayout swipeRefreshLayout;
        C59952od c59952od = this.A00;
        if (c59952od != null && (swipeRefreshLayout = c59952od.A01) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public C37755GjU(ClipsViewerConfig clipsViewerConfig, UserSession userSession, C61582rL c61582rL, C37866GlL c37866GlL, C37586Ggh c37586Ggh, boolean z) {
        this.A02 = userSession;
        this.A01 = clipsViewerConfig;
        this.A05 = c37586Ggh;
        this.A04 = c37866GlL;
        this.A03 = c61582rL;
        this.A06 = z;
    }
}
