package X;

/* renamed from: X.EiB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33052EiB extends AbstractC33564Esc {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33052EiB) {
                C33052EiB c33052EiB = (C33052EiB) obj;
                if (!C14360o3.A0K(this.A01, c33052EiB.A01) || !C14360o3.A0K(this.A03, c33052EiB.A03) || !C14360o3.A0K(this.A02, c33052EiB.A02) || this.A00 != c33052EiB.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A01))) + this.A00;
    }

    public C33052EiB(String str, String str2, String str3, int i) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
    }
}
