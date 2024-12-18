package X;

/* renamed from: X.K2b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45273K2b extends C0T6 implements InterfaceC83433nk {
    public final long A00;
    public final C2EY A01;
    public final boolean A02;
    public final String A03;

    @Override // X.InterfaceC83433nk
    public final boolean CSo() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45273K2b) {
                C45273K2b c45273K2b = (C45273K2b) obj;
                if (!C14360o3.A0K(this.A03, c45273K2b.A03) || this.A00 != c45273K2b.A00 || this.A01 != c45273K2b.A01 || this.A02 != c45273K2b.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC83433nk
    public final String BtE() {
        return this.A03;
    }

    @Override // X.InterfaceC83433nk
    public final long C8i() {
        return this.A00;
    }

    @Override // X.InterfaceC83433nk
    public final C2EY CBg() {
        return this.A01;
    }

    @Override // X.InterfaceC83433nk
    public final boolean Cd1() {
        return false;
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A01, AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0J(this.A03)));
        int A00 = AbstractC53644Nnp.A00();
        return AbstractC166987dD.A0K(this.A02, (((A0J + A00) * 31) + A00) * 31);
    }

    public C45273K2b(C2EY c2ey, String str, long j, boolean z) {
        this.A03 = str;
        this.A00 = j;
        this.A01 = c2ey;
        this.A02 = z;
    }
}
