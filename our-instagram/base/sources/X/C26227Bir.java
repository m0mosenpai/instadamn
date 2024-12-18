package X;

/* renamed from: X.Bir, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26227Bir extends C0T6 implements InterfaceC30952Dj9 {
    public final C51759Mti A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26227Bir) {
                C26227Bir c26227Bir = (C26227Bir) obj;
                if (!C14360o3.A0K(this.A02, c26227Bir.A02) || !C14360o3.A0K(this.A00, c26227Bir.A00) || !C14360o3.A0K(this.A01, c26227Bir.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    public C26227Bir(C51759Mti c51759Mti, String str, String str2) {
        AbstractC167027dH.A13(str, c51759Mti, str2);
        this.A02 = str;
        this.A00 = c51759Mti;
        this.A01 = str2;
    }

    @Override // X.InterfaceC30952Dj9
    public final C51759Mti C5s() {
        return this.A00;
    }
}
