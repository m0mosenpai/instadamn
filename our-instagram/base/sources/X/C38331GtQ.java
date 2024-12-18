package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.service.destination.reconsideration.ShoppingReconsiderationDestinationFeedService$observeFeed$1;

/* renamed from: X.GtQ */
/* loaded from: classes7.dex */
public final class C38331GtQ extends AbstractC52922bZ {
    public C1338462s A00;
    public final C2GT A01;
    public final C2GT A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C41741IeF A05;
    public final HCI A06;
    public final C41724Idv A07;
    public final C41692IdL A08;
    public final String A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final boolean A0D;
    public final boolean A0E;

    public /* synthetic */ C38331GtQ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41741IeF c41741IeF, HCI hci, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C41692IdL c41692IdL = new C41692IdL(userSession, str, str2, z2);
        int A06 = AbstractC167007dF.A06(1, userSession, str);
        AbstractC167017dG.A1U(hci, interfaceC11380iw);
        C14360o3.A0B(c41741IeF, 8);
        this.A04 = userSession;
        this.A09 = str2;
        this.A06 = hci;
        this.A03 = interfaceC11380iw;
        this.A05 = c41741IeF;
        this.A0E = z2;
        this.A0D = z3;
        this.A08 = c41692IdL;
        this.A07 = new C41724Idv(interfaceC11380iw, userSession, hci, str3, new J72(this, 0), new C38247Grq(this, 7), z, z3);
        C15200pa A01 = C10Q.A01(new ShoppingReconsiderationDestinationFeedService$observeFeed$1(c41692IdL, null), c41692IdL.A04, c41692IdL.A03, c41692IdL.A06, c41692IdL.A05);
        this.A0A = A01;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A0C = A1A;
        C008002u A00 = C10E.A00(C16910sj.A00);
        this.A0B = A00;
        InterfaceC19390xP A002 = AnonymousClass111.A00(new C11950ju(new InterfaceC19390xP[]{C0ST.A01(AnonymousClass111.A01(new C43171J6q(this, null, 39), A01)), C0ST.A01(AnonymousClass111.A01(new C43171J6q(this, null, 40), A00))}, A06), AnonymousClass111.A00);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A02 = AbstractC58232lf.A00(anonymousClass191, A002);
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A1A);
    }

    public static final C23671Dx A02(C38331GtQ c38331GtQ, boolean z, boolean z2) {
        C141796aw A00 = AbstractC141776au.A00(c38331GtQ);
        return AbstractC23641Du.A04(AnonymousClass191.A00, new PYe(c38331GtQ, null, 3, z2, z), A00);
    }

    public static final Object A00(C38331GtQ c38331GtQ, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        C41642IbY.A00(I6J.A00(c38331GtQ.A04), c38331GtQ.A09).A00 = AbstractC16960so.A1N(EnumC39623HeX.A04, EnumC39623HeX.A07, EnumC39623HeX.A06).size();
        C141796aw A00 = AbstractC141776au.A00(c38331GtQ);
        PZ6 pz6 = new PZ6(c38331GtQ, null, 5, z, true);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Object A01 = AbstractC918549n.A01(AbstractC16960so.A1Q(AbstractC23641Du.A04(anonymousClass191, pz6, A00), A02(c38331GtQ, z, true), AbstractC23641Du.A04(anonymousClass191, new PYe(c38331GtQ, null, 4, true, z), AbstractC141776au.A00(c38331GtQ))), interfaceC23621Ds);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:
    
        if (r3.A00 != X.C05F.A01) goto L206;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.NEr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.util.List A01(X.C38688GzT r9, X.C38331GtQ r10, java.util.Set r11, int r12) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38331GtQ.A01(X.GzT, X.GtQ, java.util.Set, int):java.util.List");
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C41642IbY A00 = I6J.A00(this.A04);
        String str = this.A09;
        synchronized (A00) {
            C37669Gi2 A002 = C41642IbY.A00(A00, str);
            C16910sj c16910sj = C16910sj.A00;
            C14360o3.A0B(c16910sj, 0);
            A002.A02 = c16910sj;
            A002.A03 = c16910sj;
        }
    }
}
