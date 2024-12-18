package X;

/* renamed from: X.BiV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26205BiV extends C0T6 implements InterfaceC30942Diw {
    public final EnumC27380C6j A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26205BiV) {
                C26205BiV c26205BiV = (C26205BiV) obj;
                if (this.A00 != c26205BiV.A00 || this.A01 != c26205BiV.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + this.A01;
    }

    public C26205BiV(EnumC27380C6j enumC27380C6j, int i) {
        this.A00 = enumC27380C6j;
        this.A01 = i;
    }

    @Override // X.InterfaceC30942Diw
    public final int getTitleRes() {
        return this.A01;
    }
}
