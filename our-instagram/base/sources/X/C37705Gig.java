package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Gig, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37705Gig extends AbstractC37623GhI {
    public boolean A00;
    public boolean A01;
    public final C37521Gfd A02;
    public final ClipsViewerConfig A03;
    public final AbstractC116895Qv A04;
    public final UserSession A05;
    public final InterfaceC19630xq A06;
    public final C37695GiW A07;
    public final C37824Gke A08;
    public final InterfaceC16820sZ A09;

    public C37705Gig(ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        this.A05 = userSession;
        this.A03 = clipsViewerConfig;
        this.A09 = interfaceC16820sZ;
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A2j, getClass());
        this.A06 = A04;
        this.A01 = true;
        this.A00 = true;
        this.A08 = AbstractC37696GiX.A00(userSession);
        this.A07 = AbstractC37654Ghn.A01(userSession);
        this.A02 = new C37521Gfd(this, 2);
        this.A01 = A04.getBoolean("seen_chained_media_headload_response", true);
        this.A04 = new C37781Gjw(this, 0);
    }

    public static final void A00(C37705Gig c37705Gig, int i) {
        InterfaceC16820sZ interfaceC16820sZ = c37705Gig.A09;
        if (i < C37546Gg2.A01(interfaceC16820sZ)) {
            C120985dq A0F = C37546Gg2.A03(interfaceC16820sZ).A0F(i);
            java.util.Set set = c37705Gig.A08.A05;
            if (!set.isEmpty()) {
                C14360o3.A0B(A0F, 0);
                if (!set.contains(A0F.getId())) {
                    return;
                }
            }
            if (!c37705Gig.A01) {
                c37705Gig.A01 = true;
                InterfaceC19610xo ARD = c37705Gig.A06.ARD();
                ARD.E77("seen_chained_media_headload_response", c37705Gig.A01);
                ARD.apply();
                C37695GiW c37695GiW = c37705Gig.A07;
                if (c37695GiW != null) {
                    c37695GiW.A07(A0F, true);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (X.C1LE.A02(r4).contains(r14.A03.A0J.name()) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(int r15) {
        /*
            r14 = this;
            com.instagram.common.session.UserSession r4 = r14.A05
            boolean r0 = X.C1LE.A05(r4)
            if (r0 != 0) goto Le
            boolean r0 = X.C1LE.A04(r4)
            if (r0 == 0) goto Lb0
        Le:
            r6 = 0
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r4, r6)
            r0 = 36318479682115794(0x810777003c18d2, double:3.0312910215248903E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L41
            if (r15 != 0) goto L62
            X.0sZ r0 = r14.A09
            X.Gg8 r0 = X.C37546Gg2.A03(r0)
            java.util.Iterator r3 = X.AbstractC37552Gg8.A08(r0)
            r1 = 0
        L2b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r3.next()
            int r2 = r1 + 1
            if (r1 >= 0) goto L54
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L41:
            java.util.List r1 = X.C1LE.A02(r4)
            com.instagram.clips.intf.ClipsViewerConfig r0 = r14.A03
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            java.lang.String r0 = r0.name()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L64
            goto L62
        L54:
            X.5dq r0 = (X.C120985dq) r0
            if (r1 <= 0) goto Lb1
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto Lb1
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 == r0) goto Lb1
        L62:
            r14.A00 = r6
        L64:
            X.GiW r5 = r14.A07
            if (r5 == 0) goto Lad
            boolean r1 = r14.A00
            com.instagram.clips.intf.ClipsViewerConfig r0 = r14.A03
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            java.lang.String r4 = r0.name()
            r3 = 2
            X.C14360o3.A0B(r4, r3)
            boolean r0 = r5.A00
            if (r0 != 0) goto Lad
            X.C37695GiW.A04(r5)
            X.0XJ r9 = new X.0XJ
            r9.<init>()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            r1 = 8
            java.lang.String r0 = "jpc_enabled"
            r9.A00(r0, r2, r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "entry_index"
            r9.A00(r0, r1, r3)
            r1 = 1
            java.lang.String r0 = "analytics_module"
            X.02i r4 = X.C37695GiW.A00(r9, r5, r0, r4, r1)
            r5 = 976032351(0x3a2d125f, float:6.602164E-4)
            r7 = 7
            long r10 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r8 = "is_jpc_enabled"
            r13 = r6
            r4.markerPoint(r5, r6, r7, r8, r9, r10, r12, r13)
        Lad:
            A00(r14, r15)
        Lb0:
            return
        Lb1:
            r1 = r2
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37705Gig.A0B(int):void");
    }

    public final boolean A0C() {
        if (this.A00 && !this.A01) {
            C37824Gke c37824Gke = this.A08;
            long j = c37824Gke.A01;
            if (j != -1) {
                if (AbstractC37300Gc1.A00(j) <= TimeUnit.MINUTES.toMillis(C18U.A01(C06090Tz.A05, c37824Gke.A02, 36599954658102955L))) {
                    return true;
                }
            }
        }
        return false;
    }
}
