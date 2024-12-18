package X;

/* renamed from: X.402, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass402 extends RuntimeException {
    public final Integer A00;
    public final Throwable A01;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.A01;
    }

    public AnonymousClass402(Integer num, Throwable th) {
        super(th);
        this.A00 = num;
        this.A01 = th;
    }
}
