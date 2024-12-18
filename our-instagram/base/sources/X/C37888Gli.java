package X;

/* renamed from: X.Gli, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37888Gli extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37888Gli) {
                C37888Gli c37888Gli = (C37888Gli) obj;
                if (!C14360o3.A0K(this.A00, c37888Gli.A00) || !C14360o3.A0K(this.A01, c37888Gli.A01) || !C14360o3.A0K(this.A02, c37888Gli.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C37888Gli(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public C37888Gli() {
        this(null, null, null);
    }
}
