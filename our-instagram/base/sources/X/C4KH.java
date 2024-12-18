package X;

import java.util.Random;

/* renamed from: X.4KH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KH {
    public static final Random A04 = new Random();
    public int A00;
    public int A01;
    public final int A02;
    public final Random A03;

    public C4KH(int i) {
        Random random = A04;
        C14360o3.A0B(random, 2);
        if (i >= 0 && i <= 30) {
            this.A02 = i;
            this.A03 = random;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int A00() {
        Random random = this.A03;
        int i = this.A01;
        int nextInt = random.nextInt((1 << i) + 1);
        this.A00 = nextInt;
        this.A01 = Math.min(this.A02, i + 1);
        return nextInt;
    }
}
