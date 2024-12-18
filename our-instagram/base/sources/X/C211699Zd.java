package X;

/* renamed from: X.9Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211699Zd extends C0T6 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211699Zd) {
                C211699Zd c211699Zd = (C211699Zd) obj;
                if (!C14360o3.A0K(this.A00, c211699Zd.A00) || !C14360o3.A0K(this.A01, c211699Zd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + this.A01.hashCode();
    }

    public C211699Zd(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public C211699Zd() {
        this("", "");
    }
}
