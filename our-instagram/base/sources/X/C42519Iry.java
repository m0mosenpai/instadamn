package X;

/* renamed from: X.Iry, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42519Iry implements InterfaceC38381qS {
    public final InterfaceC43485JIx A00;
    public final boolean A01;

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        if (this.A01) {
            return C1XV.A0g;
        }
        return C1XV.A0f;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return ((H58) this.A00).A01;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        InterfaceC39571se interfaceC39571se = ((H58) this.A00).A00;
        if (interfaceC39571se != null) {
            return interfaceC39571se.Eyq();
        }
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return ((H58) this.A00).A05;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0Y;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return ((H58) this.A00).A02;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return ((H58) this.A00).A03;
    }

    public C42519Iry(InterfaceC43485JIx interfaceC43485JIx, boolean z) {
        this.A00 = interfaceC43485JIx;
        this.A01 = z;
    }
}
