package X;

/* renamed from: X.Mhj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51084Mhj extends C70623Ez {
    public final /* synthetic */ PEV A00;

    public C51084Mhj(PEV pev) {
        this.A00 = pev;
    }

    @Override // X.C3F1
    public final boolean A0H(C3OO c3oo) {
        InterfaceC58104PpT interfaceC58104PpT;
        C51906Mwo c51906Mwo = this.A00.A02;
        InterfaceC58104PpT interfaceC58104PpT2 = null;
        if (c51906Mwo != null) {
            interfaceC58104PpT = c51906Mwo.A05;
        } else {
            interfaceC58104PpT = null;
        }
        if (!(interfaceC58104PpT instanceof C51764MuU)) {
            if (c51906Mwo != null) {
                interfaceC58104PpT2 = c51906Mwo.A05;
            }
            if (!(interfaceC58104PpT2 instanceof C51763MuT)) {
                return true;
            }
        }
        return false;
    }
}
