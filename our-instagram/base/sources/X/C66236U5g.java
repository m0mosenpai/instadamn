package X;

/* renamed from: X.U5g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66236U5g extends VIV {
    public final Runnable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66236U5g) && C14360o3.A0K(this.A00, ((C66236U5g) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subscription(cancelToken=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public C66236U5g(Runnable runnable) {
        this.A00 = runnable;
    }
}
