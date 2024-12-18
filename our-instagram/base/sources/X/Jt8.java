package X;

/* loaded from: classes8.dex */
public final class Jt8 extends AbstractC46354Kfc {
    public final EnumC46211Kcn A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Jt8) && this.A00 == ((Jt8) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Jt8(EnumC46211Kcn enumC46211Kcn) {
        this.A00 = enumC46211Kcn;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Error(errorCode=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
