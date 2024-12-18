package X;

/* renamed from: X.Lmh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49055Lmh implements InterfaceC50467MPv {
    public final /* synthetic */ C161367Kx A00;
    public final /* synthetic */ AnonymousClass541 A01;
    public final /* synthetic */ C49128Lo7 A02;
    public final /* synthetic */ C44791JsC A03;
    public final /* synthetic */ C45894KSx A04;

    @Override // X.InterfaceC50467MPv
    public final void D6W(String str, boolean z) {
        C14360o3.A0B(str, 0);
        C44791JsC c44791JsC = this.A03;
        c44791JsC.A00 = null;
        C49128Lo7.A00(this.A00, this.A01, this.A02, c44791JsC, this.A04, str);
    }

    public C49055Lmh(C161367Kx c161367Kx, AnonymousClass541 anonymousClass541, C49128Lo7 c49128Lo7, C44791JsC c44791JsC, C45894KSx c45894KSx) {
        this.A03 = c44791JsC;
        this.A02 = c49128Lo7;
        this.A04 = c45894KSx;
        this.A00 = c161367Kx;
        this.A01 = anonymousClass541;
    }

    @Override // X.InterfaceC50467MPv
    public final void onError(String str) {
        C44791JsC c44791JsC = this.A03;
        c44791JsC.A00 = null;
        AbstractC167007dF.A0J().post(new RunnableC50012M6b(this.A00, this.A01, this.A02, c44791JsC, this.A04));
    }
}
