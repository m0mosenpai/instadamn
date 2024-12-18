package X;

/* renamed from: X.6W5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6W5 extends RuntimeException {
    public final String A00;

    public C6W5(String str) {
        super(str);
        this.A00 = null;
    }

    public C6W5(Throwable th) {
        super(th);
        this.A00 = null;
    }

    public C6W5(String str, Throwable th) {
        super(th.getMessage(), th);
        this.A00 = str;
    }
}
