package X;

/* loaded from: classes10.dex */
public final class SNO {
    public final Object A00;

    public SNO(Object obj) {
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SNO) && this.A00 == ((SNO) obj).A00);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.A00) * 31) - 822222022;
    }
}
