package X;

/* loaded from: classes12.dex */
public final class XOH implements YO0 {
    public final /* synthetic */ C48282Js A00;
    public final /* synthetic */ String A01;

    public XOH(C48282Js c48282Js, String str) {
        this.A00 = c48282Js;
        this.A01 = str;
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        String A00;
        if (c5ks.A0F()) {
            A00 = "successful";
        } else {
            A00 = C48282Js.A00(c5ks);
        }
        C48282Js.A02(this.A00, "deferredInstall: %s result: %s", this.A01, A00);
    }
}