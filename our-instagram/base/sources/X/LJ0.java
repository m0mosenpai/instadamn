package X;

/* loaded from: classes8.dex */
public final class LJ0 {
    public String A00;
    public final C22P A01;
    public final String A02;
    public static final LJ0 A04 = new LJ0("not_initialized");
    public static final LJ0 A03 = new LJ0("logged_out");

    public final boolean equals(Object obj) {
        if (obj instanceof LJ0) {
            LJ0 lj0 = (LJ0) obj;
            if (C14360o3.A0K(this.A02, lj0.A02) && !C14360o3.A0K(this.A00, "d_") && !C14360o3.A0K(lj0.A00, "d_")) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public LJ0(C22P c22p) {
        this.A02 = AbstractC167017dG.A0j();
        this.A01 = c22p;
        this.A00 = "d_";
        this.A00 = "a_";
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('[');
        A1C.append(this.A02);
        A1C.append(' ');
        A1C.append(this.A01);
        A1C.append(']');
        return A1C.toString();
    }

    public LJ0(String str) {
        C22P c22p = C22P.A5N;
        this.A02 = str;
        this.A01 = c22p;
        this.A00 = "d_";
    }
}
