package X;

/* loaded from: classes7.dex */
public final /* synthetic */ class J5F implements Runnable {
    public final /* synthetic */ AnonymousClass630 A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ J5F(AnonymousClass630 anonymousClass630, Object obj, String str) {
        this.A00 = anonymousClass630;
        this.A02 = str;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0E(new C6DY(this.A02, this.A01));
    }
}
