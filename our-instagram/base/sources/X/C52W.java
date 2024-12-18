package X;

/* renamed from: X.52W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52W extends C0T6 implements InterfaceC915747o {
    public String A01 = null;
    public int A00 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52W) {
                C52W c52w = (C52W) obj;
                if (!C14360o3.A0K(this.A01, c52w.A01) || this.A00 != c52w.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A00;
    }

    @Override // X.InterfaceC915747o
    public final int Azm() {
        return this.A00;
    }
}
