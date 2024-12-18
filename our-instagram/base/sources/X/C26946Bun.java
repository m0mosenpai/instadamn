package X;

/* renamed from: X.Bun, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26946Bun extends AbstractC166097bd {
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26946Bun(String str) {
        super(AnonymousClass001.A0R("empty_space_model", str));
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26946Bun) && C14360o3.A0K(this.A00, ((C26946Bun) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
