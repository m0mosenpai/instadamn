package X;

/* loaded from: classes10.dex */
public final class SON {
    public final String A00;

    public SON(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SON) && C14360o3.A0K(this.A00, ((SON) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("AuthenticationError(error=", this.A00, ')');
    }
}
