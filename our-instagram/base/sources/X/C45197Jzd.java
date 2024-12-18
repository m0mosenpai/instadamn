package X;

/* renamed from: X.Jzd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45197Jzd extends C0T6 implements InterfaceC66482zP {
    public final AbstractC46463KhN A00;
    public final String A01;

    public C45197Jzd(AbstractC46463KhN abstractC46463KhN, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = abstractC46463KhN;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45197Jzd) {
                C45197Jzd c45197Jzd = (C45197Jzd) obj;
                if (!C14360o3.A0K(this.A01, c45197Jzd.A01) || !C14360o3.A0K(this.A00, c45197Jzd.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
