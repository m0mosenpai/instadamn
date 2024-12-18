package X;

/* loaded from: classes9.dex */
public final class NJX extends AbstractC53462Nkp {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NJX) && C14360o3.A0K(this.A00, ((NJX) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public NJX(Integer num) {
        this.A00 = num;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TitleRowItem(titleResId=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public NJX() {
        this(null);
    }
}
