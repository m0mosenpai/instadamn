package X;

/* renamed from: X.Jzb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45195Jzb extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45195Jzb) {
                C45195Jzb c45195Jzb = (C45195Jzb) obj;
                if (!C14360o3.A0K(this.A00, c45195Jzb.A00) || !C14360o3.A0K(this.A01, c45195Jzb.A01)) {
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
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C45195Jzb(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
