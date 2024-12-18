package X;

/* renamed from: X.H4w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38756H4w extends C0T6 implements InterfaceC58263Ps7 {
    public final Boolean A00;
    public final String A01;

    @Override // X.InterfaceC58263Ps7
    public final C38756H4w Ez1() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38756H4w) {
                C38756H4w c38756H4w = (C38756H4w) obj;
                if (!C14360o3.A0K(this.A00, c38756H4w.A00) || !C14360o3.A0K(this.A01, c38756H4w.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58263Ps7
    public final Boolean B1d() {
        return this.A00;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38756H4w(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}
