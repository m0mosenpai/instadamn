package X;

/* renamed from: X.0J9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0J9 {
    public static final C0J9 A01 = new C0J9("");
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00.equals(((C0J9) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00;
    }

    public C0J9(String str) {
        if (!str.contains(":")) {
            this.A00 = str;
            return;
        }
        throw new IllegalArgumentException("Invalid name");
    }
}
