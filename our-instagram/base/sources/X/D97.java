package X;

import android.graphics.drawable.ColorDrawable;

/* loaded from: classes5.dex */
public final class D97 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ColorDrawable A01;
    public final /* synthetic */ C76223bS A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ C2XI A04;
    public final /* synthetic */ C2XI A05;
    public final /* synthetic */ C2XI A06;
    public final /* synthetic */ C2XI A07;
    public final /* synthetic */ C92524Cj A08;
    public final /* synthetic */ C26447BmU A09;
    public final /* synthetic */ C92534Ck A0A;
    public final /* synthetic */ C38321qM A0B;
    public final /* synthetic */ C75113Zb A0C;
    public final /* synthetic */ InterfaceC16660sJ A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D97(ColorDrawable colorDrawable, C76223bS c76223bS, C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, C2XI c2xi5, C92524Cj c92524Cj, C26447BmU c26447BmU, C92534Ck c92534Ck, C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(0);
        this.A0C = c75113Zb;
        this.A0D = interfaceC16660sJ;
        this.A0A = c92534Ck;
        this.A07 = c2xi;
        this.A06 = c2xi2;
        this.A03 = c2xi3;
        this.A05 = c2xi4;
        this.A04 = c2xi5;
        this.A08 = c92524Cj;
        this.A00 = i;
        this.A01 = colorDrawable;
        this.A02 = c76223bS;
        this.A09 = c26447BmU;
        this.A0B = c38321qM;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC16660sJ interfaceC16660sJ = this.A0D;
        C92534Ck c92534Ck = this.A0A;
        C29292Cvn c29292Cvn = new C29292Cvn(this.A01, this.A02, this.A07, this.A06, this.A03, this.A05, this.A04, this.A08, this.A09, c92534Ck, this.A0B, interfaceC16660sJ, this.A00);
        C75113Zb c75113Zb = this.A0C;
        c75113Zb.A0L(c29292Cvn, null, false);
        return AbstractC25225BEi.A0f(new D8M(10, c75113Zb, c29292Cvn));
    }
}
