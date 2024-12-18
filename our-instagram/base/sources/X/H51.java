package X;

/* loaded from: classes7.dex */
public final class H51 extends C0T6 implements InterfaceC43483JIv {
    public final Float A00;
    public final Float A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H51) {
                H51 h51 = (H51) obj;
                if (!C14360o3.A0K(this.A00, h51.A00) || !C14360o3.A0K(this.A01, h51.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H51(Float f, Float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
