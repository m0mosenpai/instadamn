package X;

/* loaded from: classes11.dex */
public final class UM0 extends VIN {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof UM0) && C14360o3.A0K(this.A00, ((UM0) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00) * 31;
    }

    public UM0(Throwable th) {
        this.A00 = th;
    }

    public UM0() {
        this(null);
    }
}
