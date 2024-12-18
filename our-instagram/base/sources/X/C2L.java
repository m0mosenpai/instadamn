package X;

/* loaded from: classes5.dex */
public final class C2L extends AbstractC27447C9p {
    public final Throwable A00;

    public C2L(Throwable th) {
        C14360o3.A0B(th, 1);
        this.A00 = th;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2L) && C14360o3.A0K(this.A00, ((C2L) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
