package X;

/* loaded from: classes9.dex */
public final class OWt {
    public final int A00;
    public final EnumC53327Ni6 A01;
    public final boolean A02;

    public OWt(EnumC53327Ni6 enumC53327Ni6, int i, boolean z) {
        C14360o3.A0B(enumC53327Ni6, 1);
        this.A01 = enumC53327Ni6;
        this.A02 = z;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OWt) {
                OWt oWt = (OWt) obj;
                if (this.A01 != oWt.A01 || this.A02 != oWt.A02 || this.A00 != oWt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImageUploadConfig(namespace=");
        A1C.append(this.A01);
        A1C.append(AbstractC58317Pt9.A00(416));
        A1C.append((String) null);
        A1C.append(", shouldEnableDedupPolicy=");
        A1C.append(this.A02);
        A1C.append(", bitmapQuality=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }

    public OWt() {
        this(EnumC53327Ni6.A0K, 100, false);
    }
}
