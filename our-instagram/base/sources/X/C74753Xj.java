package X;

/* renamed from: X.3Xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74753Xj {
    public float A00;
    public int A01;

    public final synchronized void A00(long j) {
        if (j >= 100) {
            this.A00 += ((float) j) / 1048576.0f;
            this.A01++;
        }
    }
}
