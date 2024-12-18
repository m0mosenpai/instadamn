package X;

/* renamed from: X.OnI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55633OnI implements InterfaceC220315d {
    public final /* synthetic */ C51484MoV A00;

    public C55633OnI(C51484MoV c51484MoV) {
        this.A00 = c51484MoV;
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        if (c1kj == null) {
            return;
        }
        switch (c1kj.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A00.A01(EnumC53100NeD.A05, c1kj.name());
                return;
            case 4:
            case 5:
            default:
                return;
        }
    }
}
