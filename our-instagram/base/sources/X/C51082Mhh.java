package X;

/* renamed from: X.Mhh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51082Mhh extends AbstractC55021OWv {
    public final int A00;
    public final int A01;

    @Override // X.AbstractC55021OWv
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51082Mhh)) {
            return false;
        }
        C51082Mhh c51082Mhh = (C51082Mhh) obj;
        return this.A01 == c51082Mhh.A01 && this.A00 == c51082Mhh.A00 && this.A03 == c51082Mhh.A03 && this.A02 == c51082Mhh.A02 && super.A00 == ((AbstractC55021OWv) c51082Mhh).A00 && super.A01 == ((AbstractC55021OWv) c51082Mhh).A01;
    }

    public C51082Mhh(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.AbstractC55021OWv
    public final int hashCode() {
        return super.hashCode() + this.A01 + this.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewportHint.Access(\n            |    pageOffset=");
        A1C.append(this.A01);
        A1C.append(",\n            |    indexInPage=");
        A1C.append(this.A00);
        AbstractC55021OWv.A00(this, ",\n            |    presentedItemsBefore=", A1C);
        return AbstractC16490ru.A0q(AbstractC166997dE.A0x(",\n            |)", A1C), "|");
    }
}
