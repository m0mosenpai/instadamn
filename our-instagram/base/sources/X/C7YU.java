package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7YU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YU {
    public C7LR A00;
    public final C18920wW A01;
    public final InterfaceC41501vz A02;
    public final UserSession A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final AbstractC59962oe A06;
    public final InterfaceC11380iw A07;
    public final C7XE A08;
    public final InterfaceC16820sZ A09;

    public C7YU(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C7XE c7xe, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c18920wW, 4);
        C14360o3.A0B(c7xe, 6);
        C14360o3.A0B(interfaceC16820sZ, 7);
        C14360o3.A0B(interfaceC16820sZ2, 8);
        C14360o3.A0B(interfaceC16820sZ3, 9);
        this.A06 = abstractC59962oe;
        this.A03 = userSession;
        this.A07 = interfaceC11380iw;
        this.A01 = c18920wW;
        this.A08 = c7xe;
        this.A09 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
        this.A02 = new InterfaceC41501vz() { // from class: X.7YV
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1567981727);
                C7LO c7lo = (C7LO) obj;
                int A032 = C0f9.A03(2047042313);
                C14360o3.A0B(c7lo, 0);
                C7YU.this.A01(c7lo.A00);
                C0f9.A0A(-1304721201, A032);
                C0f9.A0A(-1921030245, A03);
            }
        };
    }

    public static final C7U0 A00(C7YU c7yu) {
        Object invoke = c7yu.A09.invoke();
        if (invoke != null) {
            return (C7U0) invoke;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(boolean z) {
        C7U0 A00 = A00(this);
        if (z) {
            A00.BT6().DDt(this.A08, A00(this).Avk().CDC());
            return;
        }
        InterfaceC163837Ux C7r = A00.C7r();
        InterfaceC163557Ts BT6 = A00(this).BT6();
        InterfaceC83733oI CCa = C7r.CCa();
        C80993jT BsB = C7r.BsB(true);
        C80993jT BsB2 = C7r.BsB(false);
        BT6.DOm(this.A08, A00(this).Avk().CDC(), BsB, BsB2, CCa);
        A00(this).Avk().EK6(false);
    }
}
