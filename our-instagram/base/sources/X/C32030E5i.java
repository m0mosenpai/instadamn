package X;

/* renamed from: X.E5i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32030E5i extends C0T6 {
    public final String A00;

    public C32030E5i(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32030E5i) && C14360o3.A0K(this.A00, ((C32030E5i) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
