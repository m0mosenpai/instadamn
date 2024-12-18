package X;

/* loaded from: classes8.dex */
public final class Jw7 extends C0T6 {
    public final C51715Msk A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Jw7) {
                Jw7 jw7 = (Jw7) obj;
                if (this.A01 != jw7.A01 || !C14360o3.A0K(this.A00, jw7.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public Jw7(C51715Msk c51715Msk, boolean z) {
        this.A01 = z;
        this.A00 = c51715Msk;
    }
}
