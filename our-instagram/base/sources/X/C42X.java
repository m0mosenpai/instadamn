package X;

/* renamed from: X.42X, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42X extends Exception {
    public final Integer A00;

    public C42X(String str, Integer num) {
        super(str);
        this.A00 = num;
    }

    public C42X(Integer num, String str, Throwable th) {
        super(str, th);
        this.A00 = num;
    }
}
