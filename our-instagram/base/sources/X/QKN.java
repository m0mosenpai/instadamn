package X;

/* loaded from: classes10.dex */
public final class QKN extends QKH implements InterfaceC65654TqT {
    public final EnumC61155RgG A00;

    @Override // X.QKH, X.AbstractC64100SzH
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof QKG) && super.equals(obj) && this.A00 == ((QKG) obj).A00;
        }
        return true;
    }

    @Override // X.InterfaceC65654TqT
    public final EnumC61155RgG B2b() {
        return this.A00;
    }

    public QKN(EnumC61155RgG enumC61155RgG, C62539SFq c62539SFq, SO7 so7) {
        super(c62539SFq, so7);
        this.A00 = enumC61155RgG;
    }

    @Override // X.QKH, X.AbstractC64100SzH
    public final int hashCode() {
        return AbstractC37301Gc2.A02(Integer.valueOf(super.hashCode()), this.A00);
    }
}
