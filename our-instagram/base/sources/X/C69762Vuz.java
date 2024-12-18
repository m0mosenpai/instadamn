package X;

/* renamed from: X.Vuz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69762Vuz {
    public int A00;
    public boolean A01;
    public final int A02;
    public final EnumC68118VCb A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69762Vuz) {
                C69762Vuz c69762Vuz = (C69762Vuz) obj;
                if (this.A02 != c69762Vuz.A02 || this.A03 != c69762Vuz.A03 || this.A00 != c69762Vuz.A00 || this.A01 != c69762Vuz.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = (AbstractC166997dE.A0J(this.A03, this.A02 * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0J + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BackgroundData(index=");
        sb.append(this.A02);
        sb.append(", expansionStyle=");
        sb.append(this.A03);
        sb.append(", visibleIndex=");
        sb.append(this.A00);
        sb.append(", isVisible=");
        return AbstractC25236BEt.A0a(sb, this.A01);
    }

    public C69762Vuz(EnumC68118VCb enumC68118VCb, int i, int i2, boolean z) {
        this.A02 = i;
        this.A03 = enumC68118VCb;
        this.A00 = i2;
        this.A01 = z;
    }
}
