package X;

/* renamed from: X.E8j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32085E8j extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final InterfaceC16820sZ A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32085E8j) {
                C32085E8j c32085E8j = (C32085E8j) obj;
                if (!C14360o3.A0K(this.A00, c32085E8j.A00) || !C14360o3.A0K(this.A01, c32085E8j.A01) || this.A03 != c32085E8j.A03 || !C14360o3.A0K(this.A02, c32085E8j.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00))));
    }

    public C32085E8j(String str, String str2, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
