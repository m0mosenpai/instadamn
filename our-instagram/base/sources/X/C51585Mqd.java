package X;

/* renamed from: X.Mqd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51585Mqd extends C0T6 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51585Mqd) {
                C51585Mqd c51585Mqd = (C51585Mqd) obj;
                if (!C14360o3.A0K(this.A00, c51585Mqd.A00) || !C14360o3.A0K(this.A01, c51585Mqd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C51585Mqd(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
