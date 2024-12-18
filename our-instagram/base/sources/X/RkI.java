package X;

/* loaded from: classes10.dex */
public final class RkI extends Exception {
    public final int A00;

    public RkI(int i, String str) {
        super(str);
        this.A00 = i;
    }

    public RkI(int i, Throwable th) {
        super(th);
        this.A00 = i;
    }

    public RkI() {
        this.A00 = 1;
    }
}
