package X;

/* renamed from: X.6lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148136lj {
    public final InterfaceC147266kB A00;

    public C148136lj(InterfaceC147266kB interfaceC147266kB) {
        C14360o3.A0B(interfaceC147266kB, 1);
        this.A00 = interfaceC147266kB;
    }

    public final boolean A00(float f, float f2, boolean z) {
        boolean z2 = false;
        if (f > f2) {
            z2 = true;
        }
        boolean z3 = f < f2;
        if (z2 && f % 1.0f >= 0.25f) {
            ((C147256kA) this.A00).A04.A0V = true;
        } else if (z && z3 && 1.0f - (f % 1.0f) >= 0.25f) {
            ((C147256kA) this.A00).A04.A0T = true;
            return z2;
        }
        return z2;
    }
}
