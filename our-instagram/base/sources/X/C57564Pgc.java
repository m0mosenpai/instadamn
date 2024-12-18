package X;

/* renamed from: X.Pgc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57564Pgc extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57564Pgc(int i, String str, String str2) {
        super(1);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C0f5 c0f5 = (C0f5) obj;
        C14360o3.A0B(c0f5, 0);
        c0f5.ABU("scans", this.A00);
        c0f5.ABW("origin", this.A02);
        c0f5.ABW("exception", this.A01);
        return c0f5;
    }
}
