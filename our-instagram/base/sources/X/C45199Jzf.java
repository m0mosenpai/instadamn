package X;

/* renamed from: X.Jzf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45199Jzf extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45199Jzf) {
                C45199Jzf c45199Jzf = (C45199Jzf) obj;
                if (!C14360o3.A0K(this.A00, c45199Jzf.A00) || !C14360o3.A0K(this.A01, c45199Jzf.A01) || !C14360o3.A0K(this.A02, c45199Jzf.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)));
    }

    public C45199Jzf(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
