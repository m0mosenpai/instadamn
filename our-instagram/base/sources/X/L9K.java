package X;

/* loaded from: classes8.dex */
public final class L9K {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj instanceof L9K) {
            return this.A00.equals(((L9K) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public L9K(String str) {
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StringHeaderFactory{value='");
        A1C.append(this.A00);
        A1C.append('\'');
        return AbstractC167027dH.A0R(A1C);
    }
}
