package X;

/* renamed from: X.0g0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0g0 implements Runnable {
    public final /* synthetic */ C0g2 A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public C0g0(C0g2 c0g2, Integer num, String str) {
        this.A00 = c0g2;
        this.A02 = str;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.DBl(this.A02, this.A01);
    }
}
