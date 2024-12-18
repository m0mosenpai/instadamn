package X;

/* renamed from: X.0aD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07390aD {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07390aD) {
                C07390aD c07390aD = (C07390aD) obj;
                if (this.A00 != c07390aD.A00 || this.A01 != c07390aD.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return AnonymousClass001.A0X("CrashResilientEventSchemaKey(markerId=", ", schemaVersion=", ')', this.A00, this.A01);
    }

    public C07390aD(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
