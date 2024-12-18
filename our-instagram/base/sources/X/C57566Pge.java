package X;

/* renamed from: X.Pge, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57566Pge extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57566Pge(int i, int i2, String str, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C0f5 c0f5 = (C0f5) obj;
        C14360o3.A0B(c0f5, 0);
        c0f5.ABU("endScan", this.A00);
        c0f5.ABU("scansCount", this.A01);
        c0f5.ABX("isRequestedByImageView", this.A03);
        c0f5.ABW("origin", this.A02);
        return c0f5;
    }
}
