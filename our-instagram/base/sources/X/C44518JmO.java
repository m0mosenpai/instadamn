package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JmO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44518JmO extends AbstractC52922bZ {
    public final C2GT A00;
    public final KZ9 A01;
    public final UserSession A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        KZ9 kz9 = this.A01;
        C1Df c1Df = kz9.A00;
        if (c1Df != null) {
            c1Df.cancel();
        }
        kz9.A00 = null;
        kz9.A01.AID(null);
    }

    public /* synthetic */ C44518JmO(UserSession userSession) {
        KZ9 kz9 = new KZ9(AbstractC23021Ah.A00(userSession), userSession);
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = kz9;
        final InterfaceC19390xP A03 = AbstractC07080Za.A03(kz9.A01);
        this.A03 = A03 instanceof InterfaceC16480rt ? A03 : new InterfaceC16480rt(A03) { // from class: X.0YG
            public final InterfaceC19390xP A00;

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = this.A00.collect(new C14980pD(interfaceC19960yQ, 2), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }

            {
                this.A00 = A03;
            }
        };
        C008002u A00 = C10E.A00(KAY.A00);
        this.A04 = A00;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A00);
        if (!AbstractC31172DnG.A1a(kz9.A03.A01, "pokes_impression_v2")) {
            AbstractC23641Du.A05(anonymousClass191, new MBq(this, null, 18), AbstractC141776au.A00(this));
        }
    }
}
