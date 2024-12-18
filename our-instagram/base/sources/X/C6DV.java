package X;

/* renamed from: X.6DV, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6DV implements Runnable {
    public final /* synthetic */ AnonymousClass630 A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C6DV(AnonymousClass630 anonymousClass630, Object obj, String str) {
        this.A00 = anonymousClass630;
        this.A02 = str;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0E(new C6DW(this.A02, this.A01));
    }
}
