package X;

/* loaded from: classes11.dex */
public final class W2H {
    public Integer A00;
    public boolean A01;
    public final int A02;

    public W2H(int i, boolean z) {
        this.A01 = z;
        this.A02 = i;
        try {
            this.A00 = C05F.A00;
        } catch (IllegalArgumentException unused) {
            this.A00 = null;
            this.A01 = false;
        }
    }

    public W2H() {
        this(0, false);
    }
}
