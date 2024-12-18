package X;

/* renamed from: X.BGe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25266BGe extends AbstractC27441C9j {
    public final BJ3 A00;
    public final InterfaceC16660sJ A01;

    public C25266BGe(BJ3 bj3, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.A01 = interfaceC16660sJ;
        this.A00 = bj3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25266BGe) {
                C25266BGe c25266BGe = (C25266BGe) obj;
                if (!C14360o3.A0K(this.A01, c25266BGe.A01) || this.A00 != c25266BGe.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C25266BGe() {
        this(null, BJ4.A00);
    }
}
