package X;

/* renamed from: X.9ZB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZB extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZB) {
                C9ZB c9zb = (C9ZB) obj;
                if (this.A00 != c9zb.A00 || !C14360o3.A0K(this.A01, c9zb.A01) || !C14360o3.A0K(this.A02, c9zb.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, this.A00 * 31) + this.A02.hashCode();
    }

    public C9ZB(int i, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
