package X;

/* renamed from: X.Bhv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26170Bhv extends C0T6 implements InterfaceC66482zP {
    public final EnumC46208Kck A00;
    public final InterfaceC16660sJ A01;

    public C26170Bhv(EnumC46208Kck enumC46208Kck, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(enumC46208Kck, 1);
        this.A00 = enumC46208Kck;
        this.A01 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26170Bhv) {
                C26170Bhv c26170Bhv = (C26170Bhv) obj;
                if (this.A00 != c26170Bhv.A00 || !C14360o3.A0K(this.A01, c26170Bhv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }
}
