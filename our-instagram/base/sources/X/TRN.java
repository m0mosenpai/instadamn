package X;

/* loaded from: classes10.dex */
public final class TRN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4Q9 A01;
    public final /* synthetic */ C4QA A02;
    public final /* synthetic */ AnonymousClass206 A03;
    public final /* synthetic */ InterfaceC65545TmK A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public TRN(C4Q9 c4q9, C4QA c4qa, AnonymousClass206 anonymousClass206, InterfaceC65545TmK interfaceC65545TmK, String str, byte[] bArr, int i) {
        this.A03 = anonymousClass206;
        this.A05 = str;
        this.A06 = bArr;
        this.A02 = c4qa;
        this.A01 = c4q9;
        this.A04 = interfaceC65545TmK;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4MW c4mw = this.A03.A04;
        String str = this.A05;
        byte[] bArr = this.A06;
        int A00 = c4mw.A00(new C64086Sz2(this.A04, this.A00), this.A02, str, null, bArr);
        C4Q9 c4q9 = this.A01;
        if (A00 == -1) {
            if (c4q9 != null) {
                c4q9.onFailure();
            }
        } else {
            if (c4q9 == null) {
                return;
            }
            c4q9.onSuccess();
        }
    }
}
