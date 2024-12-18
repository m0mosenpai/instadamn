package X;

/* loaded from: classes11.dex */
public final class W4Q {
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public static void A00(W4Q w4q) {
        if (w4q.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void A01() {
        int i;
        int i2 = this.A00;
        if (i2 == Integer.MIN_VALUE) {
            i = this.A02;
        } else {
            i = i2 + this.A03;
        }
        this.A00 = i;
        this.A01 = AnonymousClass001.A0O(this.A04, i);
    }

    public W4Q(int i, int i2, int i3) {
        String str;
        if (i == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = AnonymousClass001.A03(i, "/");
        }
        this.A04 = str;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = "";
    }
}
