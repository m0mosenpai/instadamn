package X;

/* renamed from: X.Cd6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28261Cd6 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28261Cd6) {
                C28261Cd6 c28261Cd6 = (C28261Cd6) obj;
                if (!C14360o3.A0K(this.A00, c28261Cd6.A00) || this.A01 != c28261Cd6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0m("ErrorInfo(errorMessage=", this.A00, ", canRetry=", ')', this.A01);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }

    public C28261Cd6(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public C28261Cd6() {
        this(null, true);
    }
}
