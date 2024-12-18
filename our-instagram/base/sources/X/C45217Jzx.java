package X;

/* renamed from: X.Jzx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45217Jzx extends C0T6 implements InterfaceC66482zP {
    public final C51675Ms6 A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45217Jzx) {
                C45217Jzx c45217Jzx = (C45217Jzx) obj;
                if (!C14360o3.A0K(this.A00, c45217Jzx.A00) || this.A01 != c45217Jzx.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A05;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45217Jzx c45217Jzx = (C45217Jzx) obj;
        C14360o3.A0B(c45217Jzx, 0);
        if (C14360o3.A0K(this.A00, c45217Jzx.A00) && this.A01 == c45217Jzx.A01) {
            return true;
        }
        return false;
    }

    public C45217Jzx(C51675Ms6 c51675Ms6, boolean z) {
        this.A00 = c51675Ms6;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewModel(project=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(22));
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
