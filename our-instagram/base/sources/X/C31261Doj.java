package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Doj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31261Doj {
    public C56352iT A00;
    public C31255Dod A01;
    public boolean A02;
    public final InterfaceC60122ou A03;
    public final AbstractC59962oe A04;
    public final InterfaceC60092or A05;
    public final InterfaceC41501vz A06;
    public final UserSession A07;
    public final C31263Dol A08;
    public final C31614Dug A09;

    public C31261Doj(AbstractC59962oe abstractC59962oe, InterfaceC60092or interfaceC60092or, UserSession userSession, C31263Dol c31263Dol, C31614Dug c31614Dug, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A04 = abstractC59962oe;
        this.A05 = interfaceC60092or;
        this.A08 = c31263Dol;
        this.A09 = c31614Dug;
        this.A06 = C31650DvG.A00(this, 32);
        this.A03 = new C31258Dog(this, z);
    }

    public static final void A00(InterfaceC56362iU interfaceC56362iU, C31261Doj c31261Doj) {
        if (!c31261Doj.A02) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A06 = R.drawable.instagram_compose_pano_outline_24;
            A0B.A05 = 2131968459;
            A0B.A0G = new ViewOnClickListenerC35680FpF(c31261Doj, 49);
            A0B.A0N = true;
            c31261Doj.A08.A07(interfaceC56362iU.AA9(new C3LY(A0B)));
        }
    }

    public static final void A01(InterfaceC56362iU interfaceC56362iU, C31261Doj c31261Doj) {
        AbstractC59962oe abstractC59962oe = c31261Doj.A04;
        if (abstractC59962oe.isAdded()) {
            C31255Dod c31255Dod = new C31255Dod(abstractC59962oe, c31261Doj.A07);
            c31261Doj.A01 = c31255Dod;
            c31255Dod.A00 = interfaceC56362iU;
            C56352iT.A0K((C56352iT) interfaceC56362iU, AbstractC31176DnK.A0q(c31255Dod.A03), true, false);
            interfaceC56362iU.Efw(new ViewOnClickListenerC31262Dok(c31255Dod));
            interfaceC56362iU.Eka(true);
            c31255Dod.A00();
        }
    }
}
