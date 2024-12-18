package X;

/* loaded from: classes8.dex */
public final class KT4 extends AbstractC129515tG implements InterfaceC129555tK {
    public final C163157Sa A00;
    public final AnonymousClass781 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KT4) {
                KT4 kt4 = (KT4) obj;
                if (!C14360o3.A0K(this.A00, kt4.A00) || !C14360o3.A0K(this.A01, kt4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public KT4(C163157Sa c163157Sa, AnonymousClass781 anonymousClass781) {
        super(c163157Sa.A04);
        this.A00 = c163157Sa;
        this.A01 = anonymousClass781;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
