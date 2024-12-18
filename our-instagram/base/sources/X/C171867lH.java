package X;

/* renamed from: X.7lH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171867lH extends C0T6 implements InterfaceC171837lE {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public C171867lH(String str, int i, boolean z) {
        C14360o3.A0B(str, 3);
        this.A00 = i;
        this.A02 = z;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C171867lH) {
                C171867lH c171867lH = (C171867lH) obj;
                if (this.A00 != c171867lH.A00 || this.A02 != c171867lH.A02 || !C14360o3.A0K(this.A01, c171867lH.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A02) {
            i2 = 1231;
        }
        return ((i + i2) * 31) + this.A01.hashCode();
    }
}
