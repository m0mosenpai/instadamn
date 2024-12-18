package X;

/* loaded from: classes10.dex */
public final class TR1 implements Runnable {
    public final /* synthetic */ C4Q9 A00;
    public final /* synthetic */ C4QA A01;
    public final /* synthetic */ AnonymousClass206 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public TR1(C4Q9 c4q9, C4QA c4qa, AnonymousClass206 anonymousClass206, String str, byte[] bArr) {
        this.A02 = anonymousClass206;
        this.A03 = str;
        this.A04 = bArr;
        this.A01 = c4qa;
        this.A00 = c4q9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int A00 = this.A02.A04.A00(null, this.A01, this.A03, null, this.A04);
        C4Q9 c4q9 = this.A00;
        if (A00 == -1) {
            c4q9.onFailure();
        } else {
            c4q9.onSuccess();
        }
    }
}
