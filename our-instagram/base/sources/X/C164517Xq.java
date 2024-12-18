package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164517Xq {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C164557Xu A02;
    public final C164567Xv A03;
    public final InterfaceC163977Vl A04;
    public final InterfaceC60442pS A05;
    public final String A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final boolean A0B;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.7Xv] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.7Xu] */
    public C164517Xq(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C7XS c7xs, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, boolean z) {
        C14360o3.A0B(abstractC59962oe, 2);
        C14360o3.A0B(interfaceC11380iw, 4);
        C14360o3.A0B(c18920wW, 5);
        C14360o3.A0B(c7xs, 8);
        C14360o3.A0B(interfaceC16820sZ, 10);
        C14360o3.A0B(interfaceC16820sZ2, 11);
        C14360o3.A0B(interfaceC16820sZ3, 12);
        C14360o3.A0B(interfaceC16820sZ4, 13);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
        this.A05 = interfaceC60442pS;
        this.A0B = z;
        this.A06 = str;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A0A = interfaceC16820sZ3;
        this.A09 = interfaceC16820sZ4;
        this.A04 = new C164547Xt(abstractC59962oe, interfaceC11380iw, c18920wW, userSession, new C164537Xs(this), c7xs, interfaceC60442pS, str, new InterfaceC08830cm() { // from class: X.7Xr
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return C164517Xq.this.A08.invoke();
            }
        }, i, z);
        this.A02 = new InterfaceC41501vz() { // from class: X.7Xu
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-555167040);
                int A032 = C0f9.A03(2113514671);
                C164517Xq.this.A04.CuI();
                C0f9.A0A(2145038046, A032);
                C0f9.A0A(1032410293, A03);
            }
        };
        this.A03 = new InterfaceC41501vz() { // from class: X.7Xv
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(119797882);
                int A032 = C0f9.A03(1818733925);
                C164517Xq c164517Xq = C164517Xq.this;
                InterfaceC163977Vl interfaceC163977Vl = c164517Xq.A04;
                InterfaceC16820sZ interfaceC16820sZ5 = c164517Xq.A08;
                interfaceC163977Vl.D9g(((C7U0) interfaceC16820sZ5.invoke()).C7r().B90(), C05F.A04, ((C7U0) interfaceC16820sZ5.invoke()).C7r().CeW(), false);
                C0f9.A0A(768566886, A032);
                C0f9.A0A(1180681130, A03);
            }
        };
    }
}
