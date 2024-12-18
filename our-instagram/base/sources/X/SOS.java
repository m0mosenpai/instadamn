package X;

/* loaded from: classes10.dex */
public final class SOS {
    public Object A00;
    public Object A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3AY)) {
            return false;
        }
        C3AY c3ay = (C3AY) obj;
        Object obj2 = c3ay.A00;
        Object obj3 = this.A00;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = c3ay.A01;
        Object obj5 = this.A01;
        if (obj4 != obj5 && (obj4 == null || !obj4.equals(obj5))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00) ^ AbstractC166997dE.A0I(this.A01);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Pair{");
        A1C.append(this.A00);
        A1C.append(" ");
        return JQ0.A0l(this.A01, A1C);
    }
}
