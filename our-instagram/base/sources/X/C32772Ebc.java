package X;

/* renamed from: X.Ebc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32772Ebc extends FKR {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32772Ebc) {
                C32772Ebc c32772Ebc = (C32772Ebc) obj;
                if (!C14360o3.A0K(this.A00, c32772Ebc.A00) || !C14360o3.A0K(this.A01, c32772Ebc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32772Ebc(String str, String str2) {
        super(C2EY.A1j, str);
        this.A00 = str;
        this.A01 = str2;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
