package X;

/* renamed from: X.Jzl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45205Jzl extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final C45128JyU A02;

    public C45205Jzl(C45128JyU c45128JyU, int i, int i2) {
        C14360o3.A0B(c45128JyU, 1);
        this.A02 = c45128JyU;
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45205Jzl) {
                C45205Jzl c45205Jzl = (C45205Jzl) obj;
                if (!C14360o3.A0K(this.A02, c45205Jzl.A02) || this.A00 != c45205Jzl.A00 || this.A01 != c45205Jzl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A0B;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + this.A00) * 31) + this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45205Jzl c45205Jzl = (C45205Jzl) obj;
        C14360o3.A0B(c45205Jzl, 0);
        return C14360o3.A0K(this.A02, c45205Jzl.A02);
    }
}
