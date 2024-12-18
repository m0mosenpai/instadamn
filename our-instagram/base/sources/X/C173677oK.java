package X;

/* renamed from: X.7oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173677oK implements InterfaceC179247xa {
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
            C173677oK c173677oK = (C173677oK) obj;
            if (this.A01 != c173677oK.A01 || this.A00 != c173677oK.A00) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC179247xa
    public final EnumC179217xX CBM() {
        return EnumC179217xX.A0P;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
