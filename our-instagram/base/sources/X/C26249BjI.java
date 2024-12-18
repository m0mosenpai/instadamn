package X;

/* renamed from: X.BjI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26249BjI extends C0T6 implements InterfaceC30885Dhy {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26249BjI) {
                C26249BjI c26249BjI = (C26249BjI) obj;
                if (!C14360o3.A0K(this.A00, c26249BjI.A00) || !C14360o3.A0K(this.A01, c26249BjI.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C26249BjI(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
