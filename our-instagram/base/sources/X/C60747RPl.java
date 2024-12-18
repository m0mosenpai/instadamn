package X;

/* renamed from: X.RPl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60747RPl extends AbstractC64290T7z {
    public final AbstractC64290T7z A00;
    public final AbstractC64290T7z A01;

    @Override // X.InterfaceC28041Xi
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object character) {
        return A09(((Character) character).charValue());
    }

    public C60747RPl(AbstractC64290T7z a, AbstractC64290T7z b) {
        this.A00 = a;
        b.getClass();
        this.A01 = b;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CharMatcher.or(");
        AbstractC58322PtE.A1R(A1C, this.A00);
        return AbstractC58323PtF.A0q(this.A01, A1C);
    }
}
