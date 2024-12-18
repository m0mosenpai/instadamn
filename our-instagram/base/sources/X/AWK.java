package X;

/* loaded from: classes4.dex */
public final class AWK implements BD9 {
    public final /* synthetic */ AAB A00;

    public AWK(AAB aab) {
        this.A00 = aab;
    }

    @Override // X.BD9
    public final void Dkx(C1819185b c1819185b) {
        C214899fR c214899fR = this.A00.A05.A00;
        C23656Adr A02 = c214899fR.A02();
        String str = c1819185b.A06;
        C14360o3.A07(str);
        A02.A03("product_session_id", str);
        c214899fR.A02().A03("effect_session_id", c1819185b.A00);
        c214899fR.A02().A03("delivery_session_id", c1819185b.A01);
    }

    @Override // X.BD9
    public final void DqC(String str) {
        C23656Adr.A00(EnumC223239t9.A0J, this.A00.A05.A00.A02());
    }

    @Override // X.BD9
    public final void onFailure(Throwable th) {
        this.A00.A05.A00.A02().A02(EnumC223239t9.A0H, "", th.getMessage());
    }
}
