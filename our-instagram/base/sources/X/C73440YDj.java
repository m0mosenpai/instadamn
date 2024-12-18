package X;

/* renamed from: X.YDj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73440YDj implements YO0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C48282Js A01;

    public C73440YDj(C48282Js c48282Js, int i) {
        this.A01 = c48282Js;
        this.A00 = i;
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        String A00;
        C48282Js c48282Js = this.A01;
        Integer valueOf = Integer.valueOf(this.A00);
        if (c5ks.A0F()) {
            A00 = "completed";
        } else {
            A00 = C48282Js.A00(c5ks);
        }
        C48282Js.A02(c48282Js, "cancelInstall: %d completed: %s", valueOf, A00);
    }
}
