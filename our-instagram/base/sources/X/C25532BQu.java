package X;

/* renamed from: X.BQu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25532BQu extends C0T6 implements InterfaceC30808Dgj {
    public final int A00;
    public final String A01;

    public C25532BQu(String str, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25532BQu) {
                C25532BQu c25532BQu = (C25532BQu) obj;
                if (!C14360o3.A0K(this.A01, c25532BQu.A01) || this.A00 != c25532BQu.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + this.A00;
    }
}
