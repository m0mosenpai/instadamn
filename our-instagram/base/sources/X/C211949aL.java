package X;

/* renamed from: X.9aL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211949aL extends C0T6 implements InterfaceC57817Pkj {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211949aL) {
                C211949aL c211949aL = (C211949aL) obj;
                if (!C14360o3.A0K(this.A01, c211949aL.A01) || this.A00 != c211949aL.A00 || this.A02 != c211949aL.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, ((AbstractC167017dG.A0O(this.A01) * 31) + this.A00) * 31);
    }

    public C211949aL(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
