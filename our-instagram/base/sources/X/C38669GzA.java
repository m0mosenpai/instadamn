package X;

/* renamed from: X.GzA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38669GzA extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C38669GzA(int i, String str, String str2, String str3, String str4) {
        AbstractC25233BEq.A0w(2, str, str2, str3);
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38669GzA) {
                C38669GzA c38669GzA = (C38669GzA) obj;
                if (this.A00 != c38669GzA.A00 || !C14360o3.A0K(this.A04, c38669GzA.A04) || !C14360o3.A0K(this.A03, c38669GzA.A03) || !C14360o3.A0K(this.A02, c38669GzA.A02) || !C14360o3.A0K(this.A01, c38669GzA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A04, this.A00 * 31))) + AbstractC167017dG.A0O(this.A01);
    }

    public C38669GzA() {
        this(0, "", "", "", "");
    }
}
