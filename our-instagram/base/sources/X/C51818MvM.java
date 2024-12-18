package X;

/* renamed from: X.MvM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51818MvM extends C0T6 implements InterfaceC66482zP {
    public final int A02 = 5;
    public final int A03 = 6;
    public final int A00 = 7;
    public final int A01 = 8;
    public final int A04 = 9;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51818MvM) {
                C51818MvM c51818MvM = (C51818MvM) obj;
                if (this.A02 != c51818MvM.A02 || this.A03 != c51818MvM.A03 || this.A00 != c51818MvM.A00 || this.A01 != c51818MvM.A01 || this.A04 != c51818MvM.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A02 * 31) + this.A03) * 31) + this.A00) * 31) + this.A01) * 31) + this.A04;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
