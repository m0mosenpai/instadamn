package X;

/* renamed from: X.Jt6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44832Jt6 extends AbstractC46353Kfb {
    public final EnumC46211Kcn A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44832Jt6) && this.A00 == ((C44832Jt6) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C44832Jt6(EnumC46211Kcn enumC46211Kcn) {
        this.A00 = enumC46211Kcn;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Error(errorCode=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
