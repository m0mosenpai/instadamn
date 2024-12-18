package X;

/* loaded from: classes8.dex */
public final class M5I implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47924LEt A01;
    public final /* synthetic */ String A02;

    public M5I(C47924LEt c47924LEt, String str, int i) {
        this.A01 = c47924LEt;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47924LEt c47924LEt = this.A01;
        C47924LEt.A00(c47924LEt.A02, c47924LEt, this.A02, this.A00, true);
    }
}
