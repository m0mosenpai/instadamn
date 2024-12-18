package X;

/* renamed from: X.Edb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32894Edb extends VKF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C36684GFe A02;
    public final /* synthetic */ FRO A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C32894Edb(C36684GFe c36684GFe, FRO fro, Integer num, String str, String str2, int i, int i2) {
        this.A02 = c36684GFe;
        this.A04 = num;
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = fro;
    }

    @Override // X.VKF
    public final void A03() {
        C36684GFe c36684GFe = this.A02;
        c36684GFe.A0S.A04(C28531Zo.A04.A01.A03(c36684GFe.A0M.getResources().getString(2131964446), this.A06, this.A05, null, null, this.A03.A06, null, null, null, this.A00, this.A01), this.A04);
    }
}
