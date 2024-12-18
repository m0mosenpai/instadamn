package X;

/* renamed from: X.Bzq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27231Bzq extends CPB {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27231Bzq) {
                C27231Bzq c27231Bzq = (C27231Bzq) obj;
                if (!C14360o3.A0K(this.A02, c27231Bzq.A02) || !C14360o3.A0K(this.A01, c27231Bzq.A01) || !C14360o3.A0K(this.A00, c27231Bzq.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C27231Bzq(String str, String str2, String str3) {
        super(9001);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A00);
    }
}
