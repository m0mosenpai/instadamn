package X;

/* loaded from: classes10.dex */
public abstract class SLJ {
    public final int A00;
    public final String A01;

    public final String toString() {
        return String.format("%s(0x%04x)", AbstractC25228BEl.A1Z(this.A01, this.A00));
    }

    public SLJ(String name, int value) {
        this.A01 = name;
        this.A00 = value;
    }
}
