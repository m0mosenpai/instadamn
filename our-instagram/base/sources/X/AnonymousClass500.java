package X;

/* renamed from: X.500, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass500 extends C0T6 implements AnonymousClass501 {
    public final String A00;

    public AnonymousClass500(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass500) && C14360o3.A0K(this.A00, ((AnonymousClass500) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("UserId(id=", this.A00, ')');
    }
}
