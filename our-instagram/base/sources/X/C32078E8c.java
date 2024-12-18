package X;

/* renamed from: X.E8c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32078E8c extends C0T6 implements InterfaceC66482zP {
    public final EnumC53248Ngm A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32078E8c) {
                C32078E8c c32078E8c = (C32078E8c) obj;
                if (!C14360o3.A0K(this.A01, c32078E8c.A01) || this.A00 != c32078E8c.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return obj.equals(this);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C32078E8c(EnumC53248Ngm enumC53248Ngm, String str) {
        this.A01 = str;
        this.A00 = enumC53248Ngm;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }
}
