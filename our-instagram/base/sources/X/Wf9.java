package X;

/* loaded from: classes11.dex */
public final class Wf9 implements XCT {
    public final /* synthetic */ C70593WdX A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    @Override // X.XCT
    public final void onSuccess() {
    }

    public Wf9(C70593WdX c70593WdX, String str, String str2, String str3, boolean z) {
        this.A04 = z;
        this.A00 = c70593WdX;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // X.XCT
    public final void onFailure(Throwable th) {
        boolean z = this.A04;
        C70593WdX c70593WdX = this.A00;
        if (z) {
            c70593WdX.A02.invoke(new C48248LWx(this.A01, this.A03, this.A02, false));
            return;
        }
        c70593WdX.A00.CrV(this.A01, c70593WdX.A01.getModuleName(), this.A03, this.A02);
    }
}
