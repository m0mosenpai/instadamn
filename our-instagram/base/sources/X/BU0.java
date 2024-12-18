package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BU0 extends AbstractC51572Yf {
    public final C25377BKu A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final SPM A06;
    public final InterfaceC31137Dmc A07;
    public final InterfaceC31161Dn5 A08;
    public final BT7 A09;
    public final C37616GhB A0A;
    public final boolean A0B;
    public final boolean A0C;

    public /* synthetic */ BU0(C25377BKu c25377BKu, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, SPM spm, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC31161Dn5 interfaceC31161Dn5, BT7 bt7, C37616GhB c37616GhB, boolean z, boolean z2) {
        C14360o3.A0B(bt7, 1);
        AbstractC25234BEr.A1R(interfaceC31161Dn5, c120985dq, userSession, clipsViewerConfig, interfaceC60442pS);
        AbstractC25233BEq.A0y(7, c37644Ghd, c25377BKu, interfaceC31137Dmc);
        this.A09 = bt7;
        this.A08 = interfaceC31161Dn5;
        this.A02 = c120985dq;
        this.A04 = userSession;
        this.A01 = clipsViewerConfig;
        this.A05 = interfaceC60442pS;
        this.A03 = c37644Ghd;
        this.A00 = c25377BKu;
        this.A07 = interfaceC31137Dmc;
        this.A0C = z;
        this.A0B = z2;
        this.A06 = spm;
        this.A0A = c37616GhB;
    }

    private final BQV A05(C2Z1 c2z1, int i) {
        if (i < 1) {
            return null;
        }
        InterfaceC30861Dha interfaceC30861Dha = this.A09.A04;
        if (interfaceC30861Dha instanceof BQU) {
            return new BQV(A04(c2z1, "trans_key_overflow_pill_fade"), this.A04, this.A08, (BQU) interfaceC30861Dha, i);
        }
        if (interfaceC30861Dha instanceof BPS) {
            return null;
        }
        throw B4Z.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x03af, code lost:
    
        if (r25 != null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03a5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r1, 36326098950305424L) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r15.A0N != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017c, code lost:
    
        if (r5 == false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026b  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, X.BP6] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, X.2Vj] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, X.2Vj] */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r56) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU0.A0Y(X.3bS):X.2Vc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r13.A5t() != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C2WH A03(X.AbstractC50812Vc r8, X.AbstractC50812Vc r9, X.AbstractC50812Vc r10, X.AbstractC50812Vc r11, X.C2Z1 r12, X.C38321qM r13) {
        /*
            r7 = this;
            X.3ay r0 = X.C51722Yv.A02
            X.9CT r0 = X.AbstractC25233BEq.A0h()
            r4 = 0
            X.2Yv r3 = X.AbstractC25225BEi.A0h(r4, r0)
            boolean r0 = r13.A58()
            if (r0 != 0) goto L18
            boolean r0 = r13.A5t()
            r1 = 0
            if (r0 == 0) goto L19
        L18:
            r1 = 1
        L19:
            com.instagram.common.session.UserSession r5 = r7.A04
            boolean r0 = r13.CdW()
            boolean r0 = X.BLH.A05(r5, r0, r1)
            r2 = 0
            if (r0 != 0) goto L79
            X.5dq r6 = r7.A02
            boolean r0 = X.AbstractC25381BKy.A08(r6, r5)
            if (r0 != 0) goto L79
            X.Dmc r1 = r7.A07
            boolean r0 = r1.CT2(r6)
            if (r0 != 0) goto L3c
            boolean r0 = r1.CT3(r6)
            if (r0 == 0) goto L48
        L3c:
            X.2XE r2 = r12.ArD()
            X.3cd r1 = X.EnumC76913cd.GLOBAL
            java.lang.String r0 = "trans_key_autoscroll_attribution_hub"
        L44:
            X.2Yv r2 = X.AbstractC25231BEo.A0W(r2, r4, r1, r0)
        L48:
            X.2Yv r4 = r3.A00(r2)
            r0 = 0
            X.2Z0 r3 = X.AbstractC25233BEq.A0L(r12)
            X.C14360o3.A0B(r5, r0)
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321211277780189(0x8109f3000624dd, double:3.0330184936223066E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L6f
            r3.A00(r9)
            r3.A00(r10)
            r3.A00(r8)
        L6a:
            X.2WH r0 = X.AbstractC25227BEk.A0W(r11, r3, r12, r4)
            return r0
        L6f:
            r3.A00(r8)
            r3.A00(r9)
            r3.A00(r10)
            goto L6a
        L79:
            X.2XE r2 = r12.ArD()
            X.3cd r1 = X.EnumC76913cd.LOCAL
            java.lang.String r0 = "trans_key_attribution_hub_fade"
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU0.A03(X.2Vc, X.2Vc, X.2Vc, X.2Vc, X.2Z1, X.1qM):X.2WH");
    }

    private final C51722Yv A04(C2Z1 c2z1, String str) {
        C51722Yv c51722Yv = null;
        if (AbstractC85373rS.A00(this.A04)) {
            C75933ay c75933ay = C51722Yv.A02;
            c51722Yv = AbstractC25231BEo.A0W(c2z1.ArD(), null, EnumC76913cd.LOCAL, str);
        }
        return BP8.A00.A00(AbstractC25229BEm.A0M(c2z1), this.A09.A06).A00(c51722Yv);
    }
}
