package X;

/* loaded from: classes7.dex */
public final class H7C extends C0T6 implements InterfaceC66482zP {
    public final C1571273r A00;
    public final EnumC153216up A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7C) {
                H7C h7c = (H7C) obj;
                if (!C14360o3.A0K(this.A02, h7c.A02) || !C14360o3.A0K(this.A03, h7c.A03) || !C14360o3.A0K(this.A00, h7c.A00) || this.A01 != h7c.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))));
    }

    public H7C(C1571273r c1571273r, EnumC153216up enumC153216up, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = c1571273r;
        this.A01 = enumC153216up;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
