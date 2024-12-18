package X;

/* renamed from: X.8rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199348rb extends C8KC {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C199348rb) && C14360o3.A0K(this.A00, ((C199348rb) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public C199348rb(String str) {
        super("draft");
        this.A00 = str;
    }

    public C199348rb() {
        this(null);
    }
}
