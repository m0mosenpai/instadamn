package X;

/* renamed from: X.Mw0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51856Mw0 extends C0T6 implements InterfaceC58061Pom {
    public final Throwable A00;
    public final Object A01;
    public final Object A02;
    public final InterfaceC16660sJ A03;

    public C51856Mw0(Object obj, Throwable th, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 3);
        this.A00 = th;
        this.A02 = obj;
        this.A03 = interfaceC16660sJ;
        this.A01 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51856Mw0) {
                C51856Mw0 c51856Mw0 = (C51856Mw0) obj;
                if (!C14360o3.A0K(this.A00, c51856Mw0.A00) || !C14360o3.A0K(this.A02, c51856Mw0.A02) || !C14360o3.A0K(this.A03, c51856Mw0.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58061Pom
    public final InterfaceC16660sJ BVs() {
        return this.A03;
    }

    @Override // X.InterfaceC58061Pom
    public final Object BWw() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }
}
