package X;

/* renamed from: X.7oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173707oN implements InterfaceC179247xa {
    public float A00;
    public int A01;
    public int A02;

    @Override // X.InterfaceC179247xa
    public final boolean AOo() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C173707oN c173707oN = (C173707oN) obj;
            if (this.A02 != c173707oN.A02 || this.A01 != c173707oN.A01 || this.A00 != c173707oN.A00) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC179247xa
    public final EnumC179217xX CBM() {
        return EnumC179217xX.A0d;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + ((int) this.A00);
    }
}
