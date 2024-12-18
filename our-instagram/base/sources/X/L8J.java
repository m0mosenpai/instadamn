package X;

/* loaded from: classes8.dex */
public final class L8J {
    public final int A00;

    public L8J(int i) {
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof L8J) && this.A00 == ((L8J) obj).A00);
    }

    public final int hashCode() {
        return ((((39122 + this.A00) * 31) + 128) * 31) + 64;
    }
}
