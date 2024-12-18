package X;

/* loaded from: classes10.dex */
public abstract class Q08 {
    public final Q03 A00;
    public final String A01;

    public final String A00() {
        if (this instanceof Q09) {
            return ((Q09) this).A01;
        }
        return this.A01;
    }

    public Q08(Q03 q03, String str) {
        this.A01 = str;
        this.A00 = q03;
    }
}
