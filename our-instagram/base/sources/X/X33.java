package X;

/* loaded from: classes11.dex */
public final class X33 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ W37 A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X33(W37 w37, String str, float f, float f2) {
        super(0);
        this.A02 = w37;
        this.A03 = str;
        this.A01 = f;
        this.A00 = f2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        W37 w37 = this.A02;
        WIM wim = w37.A00;
        if (wim == null) {
            C14360o3.A0F("framesHandler");
            throw C00O.createAndThrow();
        }
        String str = this.A03;
        float f = this.A01;
        float f2 = this.A00;
        C70458WWv c70458WWv = w37.A03;
        C14360o3.A0B(c70458WWv, 4);
        WIM.A01(null, c70458WWv, wim, str, f, f2);
        return C0eB.A00;
    }
}
