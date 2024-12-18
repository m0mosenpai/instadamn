package X;

/* loaded from: classes8.dex */
public final class KT6 extends AbstractC129515tG implements InterfaceC129555tK {
    public final C7QL A00;
    public final C7QY A01;
    public final AbstractC46445Kh5 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KT6(C7QY c7qy, AbstractC46445Kh5 abstractC46445Kh5) {
        super(c7qy.A0B);
        C14360o3.A0B(c7qy, 1);
        this.A01 = c7qy;
        this.A02 = abstractC46445Kh5;
        this.A00 = c7qy.A0C;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KT6) {
                KT6 kt6 = (KT6) obj;
                if (!C14360o3.A0K(this.A01, kt6.A01) || !C14360o3.A0K(this.A02, kt6.A02) || Float.compare(0.6666667f, 0.6666667f) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + Float.floatToIntBits(0.6666667f);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
