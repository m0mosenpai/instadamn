package X;

/* loaded from: classes8.dex */
public final class KZl extends AbstractC46483Khh {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KZl) && C14360o3.A0K(this.A00, ((KZl) obj).A00));
    }

    public static KZl A00(Object obj) {
        return new KZl(((AbstractC115105If) ((C194848jk) obj).A00).A01());
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public KZl(Throwable th) {
        this.A00 = th;
    }
}
