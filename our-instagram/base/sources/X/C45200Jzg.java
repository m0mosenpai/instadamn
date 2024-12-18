package X;

/* renamed from: X.Jzg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45200Jzg extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final String A01;
    public final InterfaceC16660sJ A02;

    public C45200Jzg(String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45200Jzg) {
                C45200Jzg c45200Jzg = (C45200Jzg) obj;
                if (!C14360o3.A0K(this.A01, c45200Jzg.A01) || this.A00 != c45200Jzg.A00 || !C14360o3.A0K(this.A02, c45200Jzg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0b(this.A01, "}_", this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (AbstractC166987dD.A0J(this.A01) + this.A00) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45200Jzg c45200Jzg = (C45200Jzg) obj;
        C14360o3.A0B(c45200Jzg, 0);
        if (C14360o3.A0K(this.A01, c45200Jzg.A01) && this.A00 == c45200Jzg.A00) {
            return true;
        }
        return false;
    }
}
