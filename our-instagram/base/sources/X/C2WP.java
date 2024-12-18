package X;

/* renamed from: X.2WP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WP {
    public final int A00;
    public final String A01;

    public C2WP(String str, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2WP) {
                C2WP c2wp = (C2WP) obj;
                if (!C14360o3.A0K(this.A01, c2wp.A01) || this.A00 != c2wp.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0l("WorkGenerationalId(workSpecId=", this.A01, ", generation=", ')', this.A00);
    }
}
