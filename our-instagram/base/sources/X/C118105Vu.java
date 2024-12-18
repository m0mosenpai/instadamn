package X;

/* renamed from: X.5Vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118105Vu {
    public final C118115Vv A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C118105Vu) && C14360o3.A0K(this.A00, ((C118105Vu) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlatformTextStyle(spanStyle=");
        sb.append((Object) null);
        sb.append(", paragraphSyle=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C118105Vu(C118115Vv c118115Vv) {
        this.A00 = c118115Vv;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Vv, java.lang.Object] */
    public C118105Vu() {
        this(new Object());
    }
}
