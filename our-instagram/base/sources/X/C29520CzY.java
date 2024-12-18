package X;

/* renamed from: X.CzY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29520CzY implements InterfaceC31004Dk3 {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29520CzY) {
                C29520CzY c29520CzY = (C29520CzY) obj;
                if (this.A00 != c29520CzY.A00 || !C14360o3.A0K(this.A01, c29520CzY.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31004Dk3
    public final C26572BoV EqD(C2Z1 c2z1) {
        return CL4.A00(C88.A0C, this.A01, null, null);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, this.A00 * 31);
    }

    public C29520CzY(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.InterfaceC31004Dk3
    public final int BF3() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Disabled(id=");
        A1C.append(this.A00);
        A1C.append(", text=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
