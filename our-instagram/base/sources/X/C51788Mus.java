package X;

/* renamed from: X.Mus, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51788Mus extends C0T6 implements InterfaceC58232Prc {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51788Mus) {
                C51788Mus c51788Mus = (C51788Mus) obj;
                if (this.A00 != c51788Mus.A00 || this.A01 != c51788Mus.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25225BEi.A08(this.A00));
    }

    public C51788Mus(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
