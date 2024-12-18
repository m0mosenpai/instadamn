package X;

/* renamed from: X.3d6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77203d6 {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77203d6) {
                C77203d6 c77203d6 = (C77203d6) obj;
                if (!C14360o3.A0K(this.A01, c77203d6.A01) || this.A00 != c77203d6.A00) {
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
        return AnonymousClass001.A0l("CacheKey(globalKey=", this.A01, ", index=", ')', this.A00);
    }

    public C77203d6(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
