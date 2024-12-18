package X;

/* renamed from: X.Jzp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45209Jzp extends C0T6 implements InterfaceC66482zP {
    public final Double A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45209Jzp) {
                C45209Jzp c45209Jzp = (C45209Jzp) obj;
                if (!C14360o3.A0K(this.A03, c45209Jzp.A03) || !C14360o3.A0K(this.A02, c45209Jzp.A02) || !C14360o3.A0K(this.A01, c45209Jzp.A01) || !C14360o3.A0K(this.A00, c45209Jzp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C45209Jzp(Double d, Integer num, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = num;
        this.A00 = d;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
