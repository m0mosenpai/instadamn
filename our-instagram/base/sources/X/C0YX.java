package X;

/* renamed from: X.0YX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YX implements C0s4 {
    public final Class A00;

    @Override // X.C0s4
    public final Class BKI() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0YX) && C14360o3.A0K(this.A00, ((C0YX) obj).A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0R(this.A00.toString(), " (Kotlin reflection is not available)");
    }

    public C0YX(Class cls) {
        this.A00 = cls;
    }
}
