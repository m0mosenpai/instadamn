package X;

/* renamed from: X.RPk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C60746RPk extends AbstractC64290T7z {
    public final AbstractC64290T7z A00;

    @Override // X.InterfaceC28041Xi
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object character) {
        return A09(((Character) character).charValue());
    }

    public C60746RPk(AbstractC64290T7z original) {
        this.A00 = original;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(".negate()", A1C);
    }
}
