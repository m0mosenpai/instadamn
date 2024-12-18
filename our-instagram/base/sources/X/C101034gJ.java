package X;

/* renamed from: X.4gJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101034gJ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C101024gI A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101034gJ(C101024gI c101024gI, C38321qM c38321qM, int i, boolean z) {
        super(0);
        this.A03 = z;
        this.A02 = c38321qM;
        this.A00 = i;
        this.A01 = c101024gI;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A03) {
            return C3h3.A00(this.A02, null, this.A01.A01.BRL(), this.A00, false);
        }
        return null;
    }
}
