package X;

/* renamed from: X.0Cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03150Cr {
    public long A00;
    public final long A01;
    public final Object A02;

    public C03150Cr(Object obj, long j) {
        this.A02 = obj;
        long nanoTime = System.nanoTime();
        this.A00 = nanoTime;
        this.A01 = nanoTime + j;
    }
}
