package X;

/* renamed from: X.7oM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173697oM implements InterfaceC179247xa {
    public int A00;
    public int A01;

    @Override // X.InterfaceC179247xa
    public final boolean AOo() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C173697oM c173697oM = (C173697oM) obj;
            if (this.A00 != c173697oM.A00 || this.A01 != c173697oM.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC179247xa
    public final EnumC179217xX CBM() {
        return EnumC179217xX.A0R;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }
}
