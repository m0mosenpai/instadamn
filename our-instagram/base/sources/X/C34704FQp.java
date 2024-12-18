package X;

/* renamed from: X.FQp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34704FQp {
    public final String A00;

    public C34704FQp(String str, Integer num) {
        C14360o3.A0B(num, 2);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
            return false;
        }
        C34704FQp c34704FQp = (C34704FQp) obj;
        String str = this.A00;
        if (str == null) {
            return false;
        }
        return str.equals(c34704FQp.A00);
    }

    public final int hashCode() {
        return AbstractC31177DnL.A04(this.A00);
    }
}
