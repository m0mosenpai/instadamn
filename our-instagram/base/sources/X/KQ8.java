package X;

/* loaded from: classes8.dex */
public final class KQ8 extends AbstractC49034LmM implements InterfaceC66482zP {
    public final C83403nh A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KQ8) {
                KQ8 kq8 = (KQ8) obj;
                if (!C14360o3.A0K(this.A00, kq8.A00) || !C14360o3.A0K(this.A01, kq8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A0i();
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KQ8(C83403nh c83403nh, String str) {
        super(c83403nh, str);
        AbstractC167017dG.A1P(c83403nh, str);
        this.A00 = c83403nh;
        this.A01 = str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
