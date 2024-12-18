package X;

/* loaded from: classes11.dex */
public final class X5A extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C70593WdX A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X5A(C70593WdX c70593WdX, String str, String str2, String str3, boolean z) {
        super(1);
        this.A04 = z;
        this.A00 = c70593WdX;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            boolean z = this.A04;
            C70593WdX c70593WdX = this.A00;
            if (z) {
                c70593WdX.A02.invoke(new C48248LWx(this.A01, this.A03, this.A02, false));
                return null;
            }
            c70593WdX.A00.CrV(this.A01, c70593WdX.A01.getModuleName(), this.A03, this.A02);
            return null;
        }
        return null;
    }
}
