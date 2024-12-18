package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Ox8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56200Ox8 implements InterfaceC43071ya {
    public final OC4 A00;

    public C56200Ox8(OC4 oc4) {
        this.A00 = oc4;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            OC4 oc4 = this.A00;
            InterfaceC64002vL interfaceC64002vL = oc4.A01.A02;
            Reel reel = oc4.A02.A01;
            interfaceC64002vL.DeA(reel, new C70873Fz(oc4.A00, AbstractC166987dD.A1J(reel)), C05F.A0u, oc4.A03.getAbsoluteAdapterPosition());
        }
    }
}
