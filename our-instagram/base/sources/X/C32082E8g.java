package X;

/* renamed from: X.E8g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32082E8g extends C0T6 implements InterfaceC66482zP {
    public boolean A00 = false;
    public final FIM A01;
    public final String A02;
    public final String A03;

    public C32082E8g(FIM fim, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = fim;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32082E8g) {
                C32082E8g c32082E8g = (C32082E8g) obj;
                if (!C14360o3.A0K(this.A02, c32082E8g.A02) || !C14360o3.A0K(this.A03, c32082E8g.A03) || this.A00 != c32082E8g.A00 || !C14360o3.A0K(this.A01, c32082E8g.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02))));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
