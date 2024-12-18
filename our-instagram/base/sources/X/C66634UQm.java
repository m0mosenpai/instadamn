package X;

/* renamed from: X.UQm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66634UQm extends C0T6 implements XFA {
    public final String A00;
    public final String A01;

    public C66634UQm(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66634UQm) {
                C66634UQm c66634UQm = (C66634UQm) obj;
                if (!C14360o3.A0K(this.A00, c66634UQm.A00) || !C14360o3.A0K(this.A01, c66634UQm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + AbstractC167017dG.A0O(this.A01);
    }
}
