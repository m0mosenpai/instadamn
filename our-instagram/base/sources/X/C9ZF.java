package X;

/* renamed from: X.9ZF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZF extends C0T6 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final C206169Az A03;
    public final C206169Az A04;
    public final EnumC222949sZ A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZF) {
                C9ZF c9zf = (C9ZF) obj;
                if (this.A05 != c9zf.A05 || this.A02 != c9zf.A02 || !C14360o3.A0K(this.A03, c9zf.A03) || Float.compare(this.A00, c9zf.A00) != 0 || Float.compare(this.A01, c9zf.A01) != 0 || !C14360o3.A0K(this.A04, c9zf.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0G(this.A05) + this.A02) * 31), this.A00), this.A01));
    }

    public C9ZF(C206169Az c206169Az, C206169Az c206169Az2, EnumC222949sZ enumC222949sZ, float f, float f2, int i) {
        this.A05 = enumC222949sZ;
        this.A02 = i;
        this.A03 = c206169Az;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = c206169Az2;
    }
}
