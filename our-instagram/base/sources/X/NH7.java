package X;

/* loaded from: classes9.dex */
public final class NH7 extends C1QH {
    public static long A03 = -1;
    public long A00;
    public final String A01;
    public final String A02;

    @Override // X.C1QH
    public final synchronized long A03() {
        A07();
        return this.A00;
    }

    @Override // X.C1QH
    public final synchronized String A05() {
        A07();
        return this.A02;
    }

    @Override // X.C1QH
    public final synchronized void A07() {
        if (this.A00 == 0) {
            this.A00 = System.currentTimeMillis();
        }
    }

    @Override // X.C1QH
    public final String A06() {
        return this.A01;
    }

    public NH7(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        A03++;
    }
}
